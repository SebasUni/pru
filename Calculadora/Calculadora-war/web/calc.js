/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var anterior;
var operador ;
    function boton(num){
        var salvo =document.calc.visor.value;
        document.calc.visor.value=salvo+ num ;
        
    }
    function suma (){
       anterior = document.calc.visor.value;
       operador ="+";
       borrar();
    }
     function resta (){
       anterior = document.calc.visor.value;
       operador ="-";
       borrar();
    }
     function multiplicacion (){
       anterior = document.calc.visor.value;
       operador ="*";
       borrar();
    }
     function division (){
       anterior = document.calc.visor.value;
       operador ="/";
       borrar();
    }
    function calcular(){
        var visor = document.calc.visor.value;
        if (operador=="+"){
       resultado = parseInt(anterior)+parseInt(visor) ;
       borrar();
       document.calc.visor.value=resultado;  }
   else if (operador=="-"){
       resultado =  parseInt(anterior)-parseInt(visor);
       borrar();
       document.calc.visor.value=resultado;  }
    else
        if (operador=="*"){
       resultado = parseInt(anterior)*parseInt(visor) ;
       borrar();
       document.calc.visor.value=resultado;  }
       else
           if (operador=="/"){
       resultado = parseInt(anterior)/parseInt(visor) ;
       borrar();
       document.calc.visor.value=resultado;  }
       
    }
    function borrar(){
      document.calc.visor.value="";  
    }

