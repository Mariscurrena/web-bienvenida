<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>Global Payments - Welcome</title>
    <meta name="description" content="Welcome page">
    <style>
      @keyframes softBlink {
        0% {
          filter: drop-shadow(0 0 10px rgba(0, 122, 255, 0.3));
        }
        50% {
          filter: drop-shadow(0 0 18px rgba(0, 122, 255, 0.8));
        }
        100% {
          filter: drop-shadow(0 0 10px rgba(0, 122, 255, 0.3));
        }
      }
      body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
        color: #111111;
        font-size: 1.25em;
      }
      .header {
        background-color: #004d9c;
        color: white;
        padding: 15px 20px;
        text-align: center;
        display: flex;
        align-items: center;
        justify-content: center;
      }
      .header img {
        height: 50px; 
        margin-right: 15px;
        filter: invert(100%) sepia(100%) saturate(0) brightness(200%);
      }
      .container {
        max-width: 800px;
        margin: 40px auto;
        padding: 20px;
        background-color: white;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        text-align: center;
      }
      h1 {
        color: #004d9c;
        font-size: 2.5em;
      }
      h2 {
        font-size: 1.75em;
      }
      .devops-section {
        margin-top: 30px;
        padding-top: 20px;
        border-top: 1px solid #ccc;
      }
      .devops-section img {
        max-width: 50%;
        height: auto;
        margin-top: 20px;
        animation: softBlink 3s infinite alternate;
      }
    </style>
  </head>
  <body>
    <div class="header">
      <h2>Welcome to </h2>
      <h1>.</h1>
      <img src="./GP.png" alt="Global Payments Logo">
    </div>
    <div class="container">
      <h1>Your Partner in Payments</h1>
      <h2>This is a harness deployment test</h2>
      <p>Providing innovative payment technology and software solutions worldwide.</p>
      <ul>
          <li>Automate deploy to Tomcat ✅</li>
          <li>Trigger set when making a push or pull request to the repository ✅</li>
          <li>SAST using Open Source (Provisional until Snyk release) ✅</li>
      </ul>
      
      <div class="devops-section">
        <h2>Secure DevOps</h2>
        <p>Engineers, architects, and developers with a passion for security, guided by DevOps principles and the highest security standards. We aim to mitigate barriers between development and security, making the process more efficient and secure.</p>
        <img src="./engineer.png" alt="Secure DevOps Engineer">
      </div>
    </div>
  </body>
</html>