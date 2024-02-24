
<html>
 <head>
     <style>
                                   form{
                                   background-color: aqua;
                                   width: 550px;
                                   
                                   border-radius:2em;
                                   
                                   }
                                   body{
                                   background-color:#ffff99;
                                   font-family: Arial, sans-serif;
            					   margin: 20px;
                                   }

        label {
            display: inline-block;
            width: 120px;
            margin-bottom: 10px;
        }

        input[type="text"], input[type="file"] {
            width: 250px;
        }
        select{
        width:250px;
        }

        
    
                                   </style>
                          </head>
                          <body>
                          <center>
                          <br><br><br><br><br>
                                 <form id="productForm" action="AddItem" method="get">
                                 <br>
                                 <br>
                                 
                                 <h1>Add Item Portal
                                 </h1>
                                 		<input type="text" name="id" value="Product Id"> <br>
                                        <br>
                                        <input type="text" name="name"  value="Product Name"> <br>
                                        <br>
                                        <select name="type" id="type" value="Product type">
            									<option value="" disabled selected>Product Type</option>
									            <option value="Electronics">Electronics</option>
									            <option value="Clothing">Clothing</option>
									            <option value="Home & Kitchen">Home & Kitchen</option>
									            <option value="Beauty & Personal Care">Beauty & Personal Care</option>
        								<option value="Cars">Cars</option>
        								<option value="Bikes">Bikes</option>
        								<option value="Dogs Care">Dogs Care</option>
        								
        								
        								</select><br>
        								<br>
                                         <input type="text" name="price" value="Product Price"><br>
                                        <br>
                                        <input type="text" name="company" value="Product Company"><br>
                                        <br>
                                        Photo:
                                        <input type="file" name="photo"><br>
                                        <br>
                                        <input type="submit" value="Add">
                                 </form>
                                 </center>
                                 <script>
        document.getElementById("productForm").addEventListener("focus", function (event) {
            // Check if the event target is an input field
            if (event.target.nodeName === "INPUT" && event.target.type === "text") {
                // Reset the input value to an empty string
                event.target.value = "";
            }
        }, true);
    </script>
                         </body>
                   </html>