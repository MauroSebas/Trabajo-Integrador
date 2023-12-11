// Valor del ticket

const ticket = 200;

// definir los descuentos

let descEstudiante = 0.80;
let descTrainee = 0.50;
let descJunior = 0.15;

// Capturo los elementos

const formulario = document.getElementById('formulario');
const categoria = document.getElementById('categoria');
const cantidad = document.getElementById('cantidad');
const totalPagar = document.getElementById('totalAPagar');
const botonResumen = document.getElementById('resumen');
const botonBorrar = document.getElementById('borrar')

function calcularPago(){
    let total = cantidad.value * ticket;

    switch (categoria.value) {
        case "estudiante":
            total = total - (total * descEstudiante);
            break;
        
        default:
            break;
    }

    totalPagar.textContent = "Total a Pagar: " + total;

}

botonResumen.addEventListener('click',(e)=>{
    e.preventDefault() //Evito que guarde el valor por default y calcule el pago. 
    calcularPago()
});

