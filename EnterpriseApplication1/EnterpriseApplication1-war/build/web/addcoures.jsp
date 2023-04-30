<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
<head>
	<title>Course Form</title>
        
        
          <style>
             legend{
                 color: #1DB954;
                  font-weight: bold;
                font-size: 28px;
             }
             body{
               background-color: rgb(25 20 20);  
             }
            .big-parent{
                display: flex;
                justify-content: center;
                align-items: center;
            }
            .parent{
                border: 4px solid #1DB954;
                border-radius: 25px;
                padding: 30px;
                margin-top: 90px 
            }
             .row{
                display:grid;
                grid-template-columns: 125px 400px;
            }
            .fields{
                margin-top:  27px;
                margin-left:   47px;
                padding: 10px;
                width: 250px;
                height: 15px;
                text-transform: capitalize;
                color: #1DB954;
                font-weight: bold;
                font-size: 24px;
                
            }
            .submitbtn{
                width: 80px;
                height: 35px;
                margin-left: 260px;
                padding: 7px;
                background-color:#1DB954 ;
                
                border-radius: 25px;
                margin-top: 30px;
            }
           
          
        </style>
</head>
<body>
	<h1>Course Form</h1>
	<form action="Addcoures" method="POST">
		<label for="IdCours">ID:</label><br>
		<input type="text" id="IdCours" name="IdCours" class="fields" required><br>

		<label for="CreditCours">Credit:</label><br>
		<input type="text" id="CreditCours" name="CreditCours" class="fields" required><br>

		<label for="CofficientCours">Coefficient:</label><br>
		<input type="text" id="CofficientCours" name="CofficientCours"class="fields"  required><br>

		<label for="NomCours">Name:</label><br>
		<input type="text" id="NomCours" name="NomCours" class="fields" required><br>

		<label for="NomProfesseur">Professor:</label><br>
		<input type="text" id="NomProfesseur" name="NomProfesseur"class="fields"  required><br>

		<input type="submit" value="Submit"class="submitbtn" class="sansLabel">
	</form>
</body>
</html>