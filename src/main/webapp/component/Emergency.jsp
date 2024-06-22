<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Emergency</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>

.embar {
    width: 100%;
    background-color: red;
    padding: 10px 0;
        display: flex;
    justify-content: center;
    align-items: center;
      font-family: Arial, sans-serif;
     font-weight: bold;
     font-size: 20px;
}

.nav-content {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 20px;
}

.icon-text-container {
    display: flex;
    align-items: center;
    color: #fff;
    margin-right: 20px;
}

.icon {
    margin-right: 20px;
}

.text {
    color: #fff;
    margin-left: 10px;
}

/* Responsive styles */
@media (max-width: 768px) {
    .icon-text-container {
        font-size: 14px;
    }
    .icon {
        margin-right: 8px;
    }
}

@media (max-width: 480px) {
    .nav-content {
        flex-direction: column;
        gap: 10px;
    }
    .icon-text-container {
        font-size: 12px;
    }
    .icon {
        margin-right: 6px;
    }
}
    
    </style>
</head>
<body>
    <nav class="embar">
        <div class="nav-content">
        
             <div class="icon-text-container">
               <i class="fa-solid fa-phone" style="color: #ffffff;"></i>
                  <span class="text">Emergency Contact </span>
            </div>
            <div class="icon-text-container">
                <i class="fa-regular fa-hospital"></i>
                  <span class="text">+91 9564871235</span>
            </div>
            <div class="icon-text-container">
                <i class="fa-solid fa-truck-medical" style="color: #ffffff;"></i>
                <span class="text">+91 7589641239</span>
            </div>
        </div>
    </nav>

  
</body>
</html>