<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <style>
        /* Body and Background */
        body {
            margin: 0;
            padding: 0;
            height: 100vh;
            font-family: 'Poppins', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(45deg, #6a11cb, #2575fc); /* Fallback */
            background: url('https://source.unsplash.com/1920x1080/?river,nature') no-repeat center center fixed;
            background-size: cover;
            animation: riverAnimation 10s linear infinite;
        }

        @keyframes riverAnimation {
            0% { background-position: 0% 50%; }
            50% { background-position: 100% 50%; }
            100% { background-position: 0% 50%; }
        }

        /* Form Container */
        .form-container {
            background: rgba(255, 255, 255, 0.85);
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            padding: 20px 30px;
            max-width: 400px;
            width: 90%;
            text-align: center;
            font-family: 'Poppins', sans-serif;
        }

        /* Title */
        .form-container h1 {
            margin-bottom: 20px;
            font-size: 2rem;
            color: #333;
        }

        /* Labels and Inputs */
        .form-container label {
            display: block;
            text-align: left;
            margin-bottom: 8px;
            font-weight: 500;
            color: #555;
        }

        .form-container input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 8px;
            outline: none;
            font-size: 1rem;
        }

        .form-container input:focus {
            border-color: #6a11cb;
            box-shadow: 0 0 5px rgba(106, 17, 203, 0.5);
        }

        /* Submit Button */
        .form-container button {
            background: linear-gradient(45deg, #6a11cb, #2575fc);
            color: #fff;
            padding: 12px 20px;
            border: none;
            border-radius: 8px;
            font-size: 1rem;
            cursor: pointer;
            transition: transform 0.2s ease, background 0.3s ease;
        }

        .form-container button:hover {
            background: linear-gradient(45deg, #2575fc, #6a11cb);
            transform: scale(1.05);
            box-shadow: 0 5px 15px rgba(106, 17, 203, 0.3);
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Login</h1>
        <form action="/check" method="post">
            <label for="username">username</label>
            <input type="text" id="username" name="username" required>

            <label for="address">address</label>
            <input type="text" id="address" name="address">

            <label for="mobileNumber">mobileNumber</label>
            <input type="text" id="mobileNumber" name="mobileNumber" required>

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
