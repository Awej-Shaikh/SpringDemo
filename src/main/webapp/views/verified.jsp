<!DOCTYPE html>
<html>
<head>
    <title>User Verified</title>
    <style>
        /* General Reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(to right, #d4fc79, #96e6a1); /* Green gradient */
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            text-align: center;
            background: #ffffff;
            border-radius: 20px;
            padding: 40px 60px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            width: 80%;
            max-width: 600px;
        }

        .headline {
            font-size: 48px;
            font-weight: bold;
            color: #28a745; /* Green color */
            margin-bottom: 20px;
            text-transform: uppercase;
            letter-spacing: 2px;
        }

        .icon {
            font-size: 60px;
            color: #28a745;
            margin-bottom: 20px;
        }

        .message {
            font-size: 18px;
            color: #555555;
            margin-top: 10px;
        }

        .btn {
            margin-top: 20px;
            padding: 12px 20px;
            background-color: #28a745;
            color: white;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: all 0.3s ease;
            text-decoration: none;
        }

        .btn:hover {
            background-color: #218838;
            box-shadow: 0 5px 15px rgba(40, 167, 69, 0.4);
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="icon">✔️</div>
        <div class="headline">User Verified</div>
        <p class="message">Congratulations! Your identity has been successfully verified.</p>
        <a href="home.jsp" class="btn">Go to Dashboard</a>
    </div>
</body>
</html>
