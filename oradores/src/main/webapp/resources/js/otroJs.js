 function enviarDatos(){
	

    const nombre = document.getElementById("nombre");
    const apellido = document.getElementById("apellido");
    const email = document.getElementById("email");
    const tema = document.getElementById("tema");
  

    
   fetch(`oradoresServlets?nombreInput=${nombre.value}
   &apellidoInput=${apellido.value}
   &emailInput=${email.value}
   &temaInput=${tema.value}`, {
				method: 'POST'
				
			})
    
    .then(response => response.text())
    .then(confirmacion => {
        // Mostrar la confirmación en el div
        document.getElementById("mensaje").innerText = confirmacion;
 		setTimeout(borrarForm, 3000);
    })
    
    
    .catch(error => {
        console.error("Error en la solicitud:", error);
    });
 
    
    };
 
 
 function borrarForm(){
	 nombre.value = ""
	 apellido.value = ""
	 email.value = ""
	 tema.value = ""
	 document.getElementById("mensaje").innerText = "";
	
	 
 }
 
