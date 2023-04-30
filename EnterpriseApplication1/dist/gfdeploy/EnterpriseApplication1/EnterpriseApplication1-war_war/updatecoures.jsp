

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
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
        
      
        <form action="updatecoures" method="POST">
                <div class="big-parent">
                    <div class="parent">
                        <center> <legend>Edit COURES by ID </legend></center>
                        <div class="row">
       		<label for="IdCours">ID:</label><br>
		<input type="text" id="IdCours" name="IdCours" required><br>

		<label for="CreditCours">Credit:</label><br>
		<input type="text" id="CreditCours" name="CreditCours" required><br>

		<label for="CofficientCours">Coefficient:</label><br>
		<input type="text" id="CofficientCours" name="CofficientCours" required><br>

		<label for="NomCours">Name:</label><br>
		<input type="text" id="NomCours" name="NomCours" required><br>

		<label for="NomProfesseur">Professor:</label><br>
		<input type="text" id="NomProfesseur" name="NomProfesseur" required><br>    </div>
                        <input class="submitbtn" type="submit" value="Update" class="sansLabel" />

                    </div>
                </div>
        </form> 
                
    </body>
</html>
