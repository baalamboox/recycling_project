package www; //Esta clase se ecuentra dentro del paquete www.

import javax.swing.JOptionPane; //Se importa la clase llamada JOptionPane para hacer uso de esta.

//Se crea un clase publica llamada Metodos.
public class Metodos {
    
    public static String opcion; //Se crea una field de tipo String donde se almacenará la opción que ingrese el usuario.
    
    //Aquí empiezan las respuesas de los cuestionarios.
    public static char[] respuestasCuestionario1 = {'c', 'b', 'a'};
    public static char[] respuestasCuestionario2 = {'b', 'a', 'b'};
    public static char[] respuestasCuestionario3 = {'a', 'a', 'c'};
    public static char[] respuestasCuestionario4 = {'b', 'b', 'a', 'c'};
    //Aquí terminan las respuestas de los cuestionarios.
    
    //Aquí empiezan las respuestas de la clasificación de residuos.
    public static char[] respuestasOrganicos = {'a', 'f', 'm'};
    public static char[] respuestasInorganicos = {'b', 'c', 'd', 'e', 'h', 'i', 'j', 'l'};
    public static char[] respuestasSanitariosEspeciales = {'k', 'n', 'o', 'p', 'q', 'r', 's'};
    //Aquí termina las respuestas de la clasificación de residuos.
    
    //Aquí empiezan las respuestas por parte del usuario de los cuestionarios.
    public static char[] respuestasCuestionario1Usuario = new char[respuestasCuestionario1.length];
    public static char[] respuestasCuestionario2Usuario = new char[respuestasCuestionario2.length];
    public static char[] respuestasCuestionario3Usuario = new char[respuestasCuestionario3.length];
    public static char[] respuestasCuestionario4Usuario = new char[respuestasCuestionario4.length];
    //Aquí terminan las respuestas por parte del usuario de los cuestionarios.
    
    public static char incisoCorrectoCuestionarios; //Se crea una field de tipo char para guardar los incisos de las respuestas de los cuestionarios, si la validación es correcta.
    
    //Aquí empiezan las respuestas del usuario en la clasificación de residuos.
    public static char[] respuestasOrganicosUsuario = new char[respuestasOrganicos.length];
    public static char[] respuestasInorganicosUsuario = new char[respuestasInorganicos.length];
    public static char[] respuestasSanitariosEspecialesUsuario = new char[respuestasSanitariosEspeciales.length];
    //Aquí terminan las respuestas del usuario en la clasificación de residuos.
    
    
    
    
    
    public static char[] respuestaCaracterOrganicos;
    public static char[] respuestaCaracterInorganicos;
    public static char[] respuestaCaracterSanitariosEsp;
    
    
    public static int respuestasCorrectas = 0; //Se crea una field para llevar las respuest
    public static int respuestasIncorrectas = 0;
    
    
    
    
    
    
    
    
    //Se crea un método llamado bienvenida que mostrará un pequeña bienvenida para el usuario.
    public static void bienvenida(){
        
        //Se usa un JOptionPane para mostrar la bienvenida.
        JOptionPane.showMessageDialog(null, "¡Hola, bienvenid@!\n\nEste programa te ayudara a comprender un poco acerca del reciclaje. Veras 4 temas muy importantes del BLOQUE III ¿Como transformamos la naturaleza?\ny posteriormente iras realizando algunos ejercicios para fortalecer lo aprendido. Al final, podras observar los resultados obtenidos de dichos ejercicios\n\nQue tengas suerte, disfrutalo! ;) ");
    
    }
    
    //Se crea un método llamado menu que mostrará como su nombre lo dice un menú de los temas, mostrar resultados y salir.
    public static void menu() {
        
        //En una field llamada opcion se almacena lo que se obtiene mediante el JOptionPane por parte de usuario. 
        opcion = JOptionPane.showInputDialog("Ingresa el numero del tema que deseas ver.\n\nRecuerda que si apenas estas aprendiendo, es mejor que comiences por el principio\neso te ayudara a que puedas comprender mejor los temas.\n\n"
                + "1.- Tema 1: Relacion entre las propiedades de los materiales y su consumo responsable\n"
                + "2.- Tema 2: Propiedades de los materiales\n"
                + "3.- Tema 3: Las 3 R (Reducir, reutilizar y reciclar)\n"
                + "4.- Tema 4: Degradacion de materiales inorganicos\n"
                + "5.- Mostrar los resultados obtenidos en todos los temas\n"
                + "6.- Salir\n");
       
        //Se crea una estructura de control switch en donde la expresión a evaluar es lo que retorna el método validarMenu que requiere como argumento la field opcion.
        switch(validarMenu(opcion)) {
            
            case 1: {
                
                tema1(); //Si el caso uno se cumple, se manda a llamar el método tema1.
                break; //Se usa la instrucción break para romper el flujo de ejecución del switch.
                
            }
            
            case 2: {
                
                tema2(); //Si el caso uno se cumple, se manda a llamar el método tema2.
                break;
                
            }
            
            case 3: {
                
                tema3(); //Si el caso uno se cumple, se manda a llamar el método tema3.
                break;
                
            }
            
            case 4: {
                
                tema4(); //Si el caso uno se cumple, se manda a llamar el método tema4.
                break;
                
            }
            
            case 5: {
                
                resultados(); //Si el caso uno se cumple, se manda a llamar el método resultados.
                break;
                
            }
            case 6: {
                
                despedida(); //Si el caso se cumple, se manda a llamar el método despedida.
                break;
                
            }
        }
    }
    
    //Se crea el método llamado tema1.
    public static void tema1() {
        
        //Con un JOptionPane se muestra al usuario un pequeño texto de lectura del tema 1.
        JOptionPane.showMessageDialog(null,"Tema 1: RELACION ENTRE LAS PROPIEDADES DE LOS MATERIALES Y SU CONSUMO RESPONSABLE\n"
                + "En la Republica Mexicana se gerean cerca de 42 millones de toneladas de residuos al año.\n"
                + "En nuestro país, por cada mexicano, desde el recien nacido hasta el mayor de edad, producen 320k de residuos al año.\n"
                + "Sin embargo, no solo es importante la cantidad de residuos que producimos, tambien lo es su naturaleza. Por ejemplo,\n"
                + "se produce mayor cantidad de resuduos de papel y carton que de pilas, pero la contaminacion que acarrean estas es\n"
                + "mucho mas perjudicial para el ambiente.");
        
        cuestionario1(); //Una vez que el usuario haya terminado comprender la lectura del tema 1 se manda a llamar el método cuestionario1, para que resuelva el cuestionario.
        
    }
    
    //Se crea el método llamado tema2.
    public static void tema2() {
        
        //Con un JOptionPane se muestra al usuario un pequeño texto de lectura del tema 2.
        JOptionPane.showMessageDialog(null, "Tema 2: PROPIEDADES DE LOS MATERIALES\n"
                + "¿Que hace diferentes a unos materiales de\n"
                + "otros?¿Por que cada material tiene usos distintos?\n"
                + "Aunque existen materiales similares, no necesariamente poseen las\n"
                + "mismas propiedades, y es por eso se les da un uso distinto. Por ejemplo,\n"
                + "hay plásticos que son elásticos, como las ligas, y otros que son rigidos,\n"
                + "como los que se utilizan para frascos y botellas. Algunos meteriales son \n"
                + "mas dificiles de quebrar, como la madera, y otros pueden quebrarse con mas\n"
                + "facilidad, como el vidrio. Tambien podemos encontrar materiales que\n"
                + "permiten el paso del agua, como la tela y el papel, y los que no la dejan pasar\n"
                + "como el vidrio.\n"
                + "Algunas de estas propiedades son la dureza, la tenacidad, la eslasticidad y la\n"
                + "permeabilidad.");
        
        //Se muestra otro texto de lectura del tema 2.
        JOptionPane.showMessageDialog(null, "La dureza es la propiedad de un material para resistir fuerzas\n"
                + "aplicadas sin romperse o quebrarse.\n"
                + "La elasticidad es la propiedad de algunos materiales de recobrar su forma original\n"
                + "despues de que han sido deformados.\n"
                + "Por ultimo, la permeabilidad es la capacidad de un material para permitir que un liquido\n"
                + "pase a traves de el sin que se altere su composicion.");
        
        cuestionario2(); //Una vez que el usuario haya terminado comprender la lectura del tema 2 se manda a llamar el método cuestionario2, para que resuelva el cuestionario.
        
    }
    
    //Se crea el método llamado tema3.
    public static void tema3() {
        
        //Con un JOptionPane se muestra al usuario un pequeño texto de lectura del tema 3.
        JOptionPane.showMessageDialog(null, "Tema 3: LAS 3 R (REDUCIR, REUTILIZAR Y RECICLAR)\n"
                + "Algunos de los materiales que se utilizan comunmente son el plastico y\n"
                + "el papel, asi que una vez que los usamos lo correcto es tratar de reusar\n"
                + "o separarlos adecuadamente para su reciclaje.\n"
                + "El costo de porducir materiales como el papel es alto, por ello en las ultimas\n"
                + "decadas se han promovido cada vez mas las practicas del reuso, del reciclado y\n"
                + "la reduccion.");
        
        //Se muestra otro texto de lectura del tema 3.
        JOptionPane.showMessageDialog(null, "El reuso consiste en volver a usar un recurso determinado en la misma\n"
                + "funcion para la que fue elaborado o en otra diferente.\n"
                + "El reciclado es un proceso industrial en el cual participa la poblacion al separar\n"
                + "cada uno de los diferentes materiales para que una industria especifica les de un tratamiento\n"
                + "con el fin de elaborar productos nuevos.\n"
                + "La reduccion se refiere a utilizar la cantidad minima indispensable de recursos\n"
                + "necesarios en acciones que van desde las cotidianas hasta las industriales.");
        
        cuestionario3(); //Una vez que el usuario haya terminado comprender la lectura del tema 3 se manda a llamar el método cuestionario3, para que resuelva el cuestionario.
        
    }
    
    //Se crea el método llamado tema4.
    public static void tema4() {
        
        //Con un JOptionPane se muestra al usuario un pequeño texto de lectura del tema 4.
        JOptionPane.showMessageDialog(null, "Tema 4: DEGRADACION DE LOS MATERIALES ORGANICOS\n"
                + "La degradacion es un proceso natural en el cual los materiales se van integrando\n"
                + "a la naturaleza debido a la accion de algunos factores como la temperatura, la humedad\n"
                + "y ciertos microorganismos. Este proceso tiene una duracion diferente para cada tipo de\n"
                + "de material, va desde pocos dias para residuos como los de jardineria o papel, hasta 4000\n"
                + "años en el caso de una botella de vidrio.");
        
        //Se muestra otro texto de lectura del tema 4.
        JOptionPane.showMessageDialog(null, "Para disminuir la generacion de materiales contaminantes es importante\n"
                + "llevar a cabo acciones como las siguientes:\n"
                + ">Reducir el consumo de algunos productos que afectan el ambiente\n"
                + ">Consumir productos sin empaquetar.\n"
                + ">Reutilizar las bolsas y los sobres, asi como los envases en buen estado.\n"
                + ">Separar los residuos antes de desecharlos.\n");
        
        //Se muestra otro texto de lectura del tema 4.
        JOptionPane.showMessageDialog(null, "Para separar los residuos de manera correcta es necesaio comprender que\n"
                + "se clasifican en dos tipos:\n"
                + "1.- Residuos organicos: Son de origen animal o vegetal.\n"
                + "Ejemplo:\n-Cascaras de frutas\n-Cascarones de huevo\n-Desperdicios de comida\n-Servilletas de papel usadas\n-Restos de cafe\n-Bolsitas de te\n-Hojas\n-Ramas\n-Flores\n\n"
                + "2.- Residuos inorganicos: Incluyen objetos hechos de materiales como el plástico (bolsas, empaques y anvases)\n"
                + "Ejemplo:\n-Vidrio\n-Papel\n-Carton\n-Metal\n-Aparatos electricos\n-Boligrafos\n-Productos de ceramica (vasos, platos)\n-Utencilios de cocina");
        
        //Se muestra otro texto de lectura del tema 4.
        JOptionPane.showMessageDialog(null,"Algunos residuos solidos deben separarse de manera independiente.\n"
                + ">Residuos sanitarios:\n-Papel higienico\n-Pañuelos\n-Algodon\n-Pañales usados\nEstos articulos deben colocarse en una bolsa de plastico amarrada, y\n"
                + "entregarla al barrendero o al camion recolector de residuos.\n"
                + ">Residuos especiales:\n-Pilas\n-Focos\n-Aparatos electronicos(radios, telefonos...etc)\n-Envases de pegamento\n-Aceite de motor\n-Aerosoles\n-Cosmeticos\n-Tintes y fijadores para el cabello\nTambien deben separarse en una bolsa de plastico\ny amarrarse, al igual que las excretas de los perros domesticos,\nvan en una bolsa a parte.");
        
        cuestionario4(); //Una vez que el usuario haya terminado comprender la lectura del tema 4 se manda a llamar el método cuestionario4, para que resuelva el cuestionario.
        
    }
    
    //Se crea un método llamado despedida que se encargará de dar un adios al usuario.
    public static void despedida() {
        
        JOptionPane.showMessageDialog(null,"Gracias por tu iniciativa. ¡Sigue aprendiendo!"); //Se usa un JOptionPane para dar la despedida.
        
    }
    
    //Se crea un método llamado cuestionario1, donde se mostrarán todas la preguntas y sus incisos.
    public static void cuestionario1() {
        
        /*
            Mediante una estructura if se pregunta si lo que regresa el método validarCuestionarios es true pues que muestre la pregunta
            con sus incisos, que guarde la respuesta en al array llamado respuestasCuestionario1Usuario.
        */
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "Cuestionario 1\n\n"
                + "Responde el siguiente cuestionario, en base a lo visto en el tema anterior.\nIngresa el inciso de la respuesta correcta.\n\n"
                + "1.- Aproximadamente ¿Cuántas toneladas de residuos(basura) se producen al año en la República Mexicana?\n"
                + "a) 72 millones\nb) 14 millones\nc) 42 millones"))) {
            
            respuestasCuestionario1Usuario[0] = incisoCorrectoCuestionarios; //Se le asigna el valor de la field al array en su determinada posición.
        
        } else {
            
            //De lo contrario se usa un while para volver a preguntar al usuario si es que lo que ingreso esta mal y el método validarCuestionarios responde con false.
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "Cuestionario 1\n\n"
                + "Responde el siguiente cuestionario, en base a lo visto en el tema anterior.\nIngresa el inciso de la respuesta correcta.\n\n"
                + "1.- Aproximadamente ¿Cuántas toneladas de residuos(basura) se producen al año en la República Mexicana?\n"
                + "a) 72 millones\nb) 14 millones\nc) 42 millones")) != true);
        
        }
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "2.- ¿Qué cantidad de residuos se producen más?\n"
                + "a) cáscaras de fruta y cáscaras de verdura\nb) papel y cartón\nc) envolturas de frituras y plásticos"))) {
            
            respuestasCuestionario1Usuario[1] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "2.- ¿Qué cantidad de residuos se producen más?\n"
                + "a) cáscaras de fruta y cáscaras de verdura\nb) papel y cartón\nc) envolturas de frituras y plásticos")) != true);
            
        }
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "3.- ¿Qué residuo contamina más el ambiente?\n"
                + "a) Pilas\nb) Papel\nc) Cáscaras de huevo"))) {
            
            respuestasCuestionario1Usuario[2] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "3.- ¿Qué residuo contamina más el ambiente?\n"
                + "a) Pilas\nb) Papel\nc) Cáscaras de huevo")) != true);
            
        }
       
        menu(); //Una vez que se terminen los cuestionarios se regresa al menú principal.
        
    }
    
    //Se crea un método llamado cuestionario2, donde se mostrará todas las preguntas y sus incisos.
    public static void cuestionario2() {
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "Cuestionario 2\n\n"
                + "Responde el siguiente cuestionario, en base a lo visto en el tema anterior.\nIngresa el inciso de la respuesta correcta.\n\n"
                + "1.- ¿Qué materiales permiten el paso del agua?\n"
                + "a) Botellas de plástico y vidrio\nb) Tela y papel\nc) Madera y unicel"))) {
            
            respuestasCuestionario2Usuario[0] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "Cuestionario 2\n\n"
                + "Responde el siguiente cuestionario, en base a lo visto en el tema anterior.\nIngresa el inciso de la respuesta correcta.\n\n"
                + "1.- ¿Qué materiales permiten el paso del agua?\n"
                + "a) Botellas de plástico y vidrio\nb) Tela y papel\nc) Madera y unicel")) != true);
            
        }
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "2.- ¿Cuáles son las cuatro propiedades que se mencionan en este tema?\n"
                + "a) Dureza, tenacidad, elasticidad y permeabilidad\nb) Masa, volúmen, peso y porosidad\nc) Combustibilidad, oxidación, reactividad y afinidad electrónica"))) {
            
            respuestasCuestionario2Usuario[1] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "2.- ¿Cuáles son las cuatro propiedades que se mencionan en este tema?\n"
                + "a) Dureza, tenacidad, elasticidad y permeabilidad\nb) Masa, volúmen, peso y porosidad\nc) Combustibilidad, oxidación, reactividad y afinidad electrónica")) != true);
            
        }
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "3.- ¿Qué es la permeabilidad?\n"
                + "a) Propiedad de un material para resistir fuerzas aplicadas sin romperse\nb) Capacidad de un material para permitir que un líquido pase a través de el sin alterar su composición.\nc) Propiedad de algunos materiales de recobrar su forma original después de haber sido transformados"))) {
            
            respuestasCuestionario2Usuario[2] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "3.- ¿Qué es la permeabilidad?\n"
                + "a) Propiedad de un material para resistir fuerzas aplicadas sin romperse\nb) Capacidad de un material para permitir que un líquido pase a través de el sin alterar su composición.\nc) Propiedad de algunos materiales de recobrar su forma original después de haber sido transformados")) != true);
            
        }
        
        menu();
        
    }
    
    //Se crea un método llamado cuestionario3, donde se mostrará todas las preguntas y sus incisos.
    public static void cuestionario3() {
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "Cuestionario 3\n\n"
                + "Responde el siguiente cuestionario, en base a lo visto en el tema anterior.\nIngresa el inciso de la respuesta correcta.\n\n"
                + "1.- ¿Cuáles son los materiales que más utilizamos?\n"
                + "a) Plástico y papel\nb) Vidrio y aluminio\nc) Cartón y telas "))) {
            
            respuestasCuestionario3Usuario[0] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "Cuestionario 3\n\n"
                + "Responde el siguiente cuestionario, en base a lo visto en el tema anterior.\nIngresa el inciso de la respuesta correcta.\n\n"
                + "1.- ¿Cuáles son los materiales que más utilizamos?\n"
                + "a) Plástico y papel\nb) Vidrio y aluminio\nc) Cartón y telas ")) != true);
            
        }
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "2.- ¿A qué se refiere la reducción?\n"
                + "a) Utilizar la cantidad mínima indispensable de recursos necesarios \nb) Volver a usar un recurso determinado y darle un nuevo uso\nc) Separar diferentes materiales con el fin de elaborar productos nuevos"))) {
            
            respuestasCuestionario3Usuario[1] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "2.- ¿A qué se refiere la reducción?\n"
                + "a) Utilizar la cantidad mínima indispensable de recursos necesarios \nb) Volver a usar un recurso determinado y darle un nuevo uso\nc) Separar diferentes materiales con el fin de elaborar productos nuevos")) != true);
            
        }
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "3.- Son ejemplos del reciclado de materiales:\n"
                + "a) Dulceros de madera y cajas de cartón\nb) Bolsas y mochilas hechas con pantalones de mezclilla viejos\nc) Árbol de navidad hecho con tubos de papel vacío y cesto de basura hecho de tapas de botellas"))) {
            
            respuestasCuestionario3Usuario[1] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "3.- Son ejemplos del reciclado de materiales:\n"
                + "a) Dulceros de madera y cajas de cartón\nb) Bolsas y mochilas hechas con pantalones de mezclilla viejos\nc) Árbol de navidad hecho con tubos de papel vacío y cesto de basura hecho de tapas de botellas")) != true);
            
        }
        
        menu();
        
    }
    
    //Se crea un método llamado cuestionario4, donde se mostrará todas las preguntas y sus incisos.
    public static void cuestionario4() {
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "Cuestionario 4\n\n"
                + "Responde el siguiente cuestionario, en base a lo visto en el tema anterior.\nIngresa el inciso de la respuesta correcta.\n\n"
                + "1.- ¿Qué es la degradación?\n"
                + "a) Capacidad de un material para permitir que un líquido pase a través de el sin alterar su composición.\nb) Proceso natural en el cual los materiales se degradan y se integran a la naturaleza\nc) Proceso químico en el cual los materiales se degradan y se integran a la naturaleza"))) {
            
            respuestasCuestionario4Usuario[0] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "Cuestionario 4\n\n"
                + "Responde el siguiente cuestionario, en base a lo visto en el tema anterior.\nIngresa el inciso de la respuesta correcta.\n\n"
                + "1.- ¿Qué es la degradación?\n"
                + "a) Capacidad de un material para permitir que un líquido pase a través de el sin alterar su composición.\nb) Proceso natural en el cual los materiales se degradan y se integran a la naturaleza\nc) Proceso químico en el cual los materiales se degradan y se integran a la naturaleza")) != true);
            
        }
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "2.- Factores que intervienen en la degradación:\n"
                + "a) Acidificación, calinización, contaminación\nb) Temperatura, humedad, microorganismos\nc) Presión, cambios de estado, alteracion molecular"))) {
            
            respuestasCuestionario4Usuario[1] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "2.- Factores que intervienen en la degradación:\n"
                + "a) Acidificación, calinización, contaminación\nb) Temperatura, humedad, microorganismos\nc) Presión, cambios de estado, alteracion molecular")) != true);
            
        }
        
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "3.- ¿Cuánto tiempo tarda en degradarse una botella de vidrio?\n"
                + "a) 4000 años\nb) 4000 mil años \nc) 4200 años"))) {
            
            respuestasCuestionario4Usuario[2] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "3.- ¿Cuánto tiempo tarda en degradarse una botella de vidrio?\n"
                + "a) 4000 años\nb) 4000 mil años \nc) 4200 años")) != true);
            
        }
        if(validarCuestionarios(JOptionPane.showInputDialog(null, "4.- ¿Cuáles son los dos tipos en los que se clasifican los residuos?\n"
                + "a) Papel y plástico\nb) Vidrio y metal\nc) Orgánico e inorgánico"))) {
            
            respuestasCuestionario4Usuario[3] = incisoCorrectoCuestionarios;
            
        } else {
            
            while(validarCuestionarios(JOptionPane.showInputDialog(null, "4.- ¿Cuáles son los dos tipos en los que se clasifican los residuos?\n"
                + "a) Papel y plástico\nb) Vidrio y metal\nc) Orgánico e inorgánico")) != true);
            
        }
        
        while(organicos() != respuestasOrganicos.length);
        
        while(inorganicos()!= respuestasInorganicos.length);
        while(sanitariosEspeciales()!= respuestasSanitariosEspeciales.length);
        
        /*if (respuestasOrganicosUsuario.length == respuestasOrganicos.length) {
            for (int i = 0; i < respuestasOrganicosUsuario.length; i++) {
                if (respuestasOrganicosUsuario[i] == respuestasOrganicos[i]) {
                   System.out.println("Respuesta correcta"); 
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Error de longitud");
            organicos();
        }*/
        
        menu();
        
    }
    
    
    
    
    //Muestra la información de la clasificación de organicos.
    public static int organicos() {
        
        //Se muestra mediante un JOptionPane los residuos y optiene lo que el usuario ingrese.
        String organicos = JOptionPane.showInputDialog(null, "5.- Ingresa los siguientes residuos según el tipo al que pertenezcan (organicos, inorganicos, sanitarios y especiales):\n\n"
                + "a) Cáscaras de huevo\nb) Cajas de pizza\nc) Cartulinas\nd) Botellas de plástico\n"
                + "e) Botellas de vidrio\nf) Cáscaras de plátano\ng) Marco de madera\nh) Bolsa de frituras\n"
                + "i) Vaso de yogurt\nj) Bolsas de plástico\nk) Pilas\nl) Platos de porcelana\n"
                + "m) Hojas de los árboles\nn) Papel higiénico\no) Pañales usados\np) Focos\n"
                + "q) Radios\nr) Labiales\ns) Tintes para el cabello\n\n"
                + "Ejemplo:\nOrganicos: a, b, c, d, f, g\n\nNota: Para los residuos orgánicos son "+ respuestasOrganicos.length +" respuestas válidas. Asegurate de ingresar solo "+ respuestasOrganicos.length +" incisos.\n\n"
                + "Ingresa los incisos de los residuos orgánicos:");
        
        /*
            Se crea un arraya de tipo String donde se almacenará los incisos que el usuario ingrese, quitara los espacios
            y revolvera un substring a partir de la coma.
        */
        String[] respuestasOrganicosUsuario1 = organicos.replace(" ", "").split(",");
        
        if(respuestasOrganicosUsuario1.length > 0) 
        respuestaCaracterOrganicos = new char[respuestasOrganicosUsuario1.length];
        
        
        for(int i = 0; i < respuestasOrganicosUsuario1.length; i++) {
            respuestaCaracterOrganicos[i] = respuestasOrganicosUsuario1[i].charAt(0);
            //System.out.print(respuestasOrganicosUsuario1[i]);
        }
        
        respuestasOrganicosUsuario = ordenarIncisos(respuestaCaracterOrganicos); //Se ordena acendentemente, para ello se usa el método ordenarIncisos.
        
        return respuestasOrganicosUsuario.length;
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    public static int inorganicos(){
        String inorganicos = JOptionPane.showInputDialog(null, "5.- Clasifica los siguientes residuos según el tipo al que pertenezcan (organicos, inorganicos, sanitarios y especiales):\n\n"
                + "a) Cáscaras de huevo\nb) Cajas de pizza\nc) Cartulinas\nd) Botellas de plástico\n"
                + "e) Botellas de vidrio\nf) Cáscaras de plátano\ng) Marco de madera\nh) Bolsa de frituras\n"
                + "i) Vaso de yogurt\nj) Bolsas de plástico\nk) Pilas\nl) Platos de porcelana\n"
                + "m) Hojas de los árboles\nn) Papel higiénico\no) Pañales usados\np) Focos\n"
                + "q) Radios\nr) Labiales\ns) Tintes para el cabello\n\n"
                + "Ejemplo:\nOrganicos: a,b,c,d,f,g\n\nNota: Para los residuos inorgánicos son "+ respuestasInorganicos.length +" respuestas válidas. Asegurate de ingresar solo "+ respuestasInorganicos.length +" incisos.\n\n"
                + "Ingresa los incisos de los residuos inorganicos:");
        
        String[] respuestasInorganicosUsuario1 = inorganicos.replace(" ", "").split(",");
        respuestaCaracterInorganicos = new char[respuestasInorganicosUsuario1.length];
        for(int i = 0; i < respuestasInorganicosUsuario1.length; i++) {
            respuestaCaracterInorganicos[i] = respuestasInorganicosUsuario1[i].charAt(0);
            //System.out.print(respuestasInorganicosUsuario1[i]);
        }
        
        respuestasInorganicosUsuario = ordenarIncisos(respuestaCaracterInorganicos);
        return (respuestasInorganicosUsuario1.length);
    }
    public static int sanitariosEspeciales(){
        String sanitariosEspeciales = JOptionPane.showInputDialog(null, "5.- Clasifica los siguientes residuos según el tipo al que pertenezcan (organicos, inorganicos, sanitarios y especiales):\n\n"
                + "a) Cáscaras de huevo\nb) Cajas de pizza\nc) Cartulinas\nd) Botellas de plástico\n"
                + "e) Botellas de vidrio\nf) Cáscaras de plátano\ng) Marco de madera\nh) Bolsa de frituras\n"
                + "i) Vaso de yogurt\nj) Bolsas de plástico\nk) Pilas\nl) Platos de porcelana\n"
                + "m) Hojas de los árboles\nn) Papel higiénico\no) Pañales usados\np) Focos\n"
                + "q) Radios\nr) Labiales\ns) Tintes para el cabello\n\n"
                + "Ejemplo:\nOrganicos: a,b,c,d,f,g\n\nNota: Para los residuos sanitarios y especiales son "+ respuestasSanitariosEspeciales.length +" respuestas válidas. Asegurate de ingresar solo "+ respuestasSanitariosEspeciales.length +" incisos.\n\n"
                + "Ingresa los incisos de los residuos sanitarios y especiales:");
        
        String[] respuestasSanitariosEspUsuario1 = sanitariosEspeciales.replace(" ", "").split(",");
        respuestaCaracterSanitariosEsp = new char[respuestasSanitariosEspUsuario1.length];
        for(int i = 0; i < respuestasSanitariosEspUsuario1.length; i++) {
            respuestaCaracterSanitariosEsp[i] = respuestasSanitariosEspUsuario1[i].charAt(0);
            //System.out.print(respuestasSanitariosEspUsuario1[i]);
        }
        
        respuestasSanitariosEspecialesUsuario = ordenarIncisos(respuestaCaracterSanitariosEsp);
        return (respuestasSanitariosEspUsuario1.length);
    }
    
    
    
    
    
    
    /*
        Se crea un método llamado validarCuestionarios para validad cada inciso de cada cuestionario, tiene un parametro
        que es la respuesta del usuario y este método va a responder con un verdadero si es valido el inciso y false si no lo es.
    */
    public static boolean validarCuestionarios(String respuesta) {
        
        boolean valido = false; //Se crea una variable de tipo boolean llamada valido que tendra valor de inicio false.
        
        if(respuesta == null) {
            
            menu(); //Se manda a llamar el método menu.
            
        } else {
            
            try {
                
                char incisoValido = respuesta.toLowerCase().charAt(0); //De lo que ingrese el usuario se obtiene el caracter y se pasa a minúsculas.
                
                //Mediante un if se valida que el inciso obtenido se encuentre entre a y c.
                if(incisoValido >= 'a' && incisoValido <= 'c') {
                    
                    valido = true; //Se le asigna true a la variable valido.
                    incisoCorrectoCuestionarios = incisoValido; //Se le asigna el valor de la variable incisoValido a la field incisosCorresctoCuestionarios.
                    
                } else {
                    
                    //Se muestra 
                    JOptionPane.showMessageDialog(null, "¡Error no se encontró inciso " + incisoValido + ")!\n\n"
                            + "Debe de ser un inciso entre a) y c)");
                    valido = false;
                    
                }
                
            } catch(Exception e) {
                
                JOptionPane.showMessageDialog(null, "¡Error, la respuesta no debe de estar vacía!");
                valido = false;
                
            }
        }
        
        return valido;
    }
    
    
    
    
    
    public static String mostrarResultadoCuestionario1(char[] respuestas) {
        
        respuestasCorrectas = 0;
        respuestasIncorrectas =0;
        
        int i = 0;//declaracion
        
        do{
            if (respuestas[i] == respuestasCuestionario1[i]) {
                respuestasCorrectas++;
            }else{
                respuestasIncorrectas++;
            }   
            i++;//Incremento o zona de accion
            
        }while(i < respuestas.length);//Condicion
        
        
        
            /*for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == respuestasCuestionario1[i]) {
                respuestasCorrectas++;
            }else{
                respuestasIncorrectas++;
            }*/
        /*JOptionPane.showMessageDialog(null,"Resultados obtenidos en el Cuestionario 1\n\n" 
                + "La cantidad de respuestas correctas fue de: " + respuestasCorrectas
                + "\nLa cantidad de respuestas incorrectas fue de: " + respuestasIncorrectas);*/
        
        return "Resultados obtenidos en el CUESTIONARIO 1\n"
                + "La cantidad de respuestas correctas fue de: " + respuestasCorrectas
                + "\nLa cantidad de respuestas incorrectas fue de: " + respuestasIncorrectas;
    }
    public static String mostrarResultadoCuestionario2(char[] respuestas) {
        
        respuestasCorrectas = 0;
        respuestasIncorrectas =0;
        
        int i = 0;//declaracion
        
        do{
            if (respuestas[i] == respuestasCuestionario2[i]) {
                respuestasCorrectas++;
            }else{
                respuestasIncorrectas++;
            }   
            i++;//Incremento o zona de accion
            
        }while(i < respuestas.length);//Condicion
        
        /*for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == respuestasCuestionario2[i]) {
                respuestasCorrectas++;
            }else{
                respuestasIncorrectas++;
            }
        }*/ 
        /*JOptionPane.showMessageDialog(null,"Resultados obtenidos en el Cuestionario 2\n\n"
            + "La cantidad de respuestas correctas fue de: " + respuestasCorrectas
            + "\nLa cantidad de respuestas incorrectas fue de: " + respuestasIncorrectas);*/
        
        return "\n\nResultados obtenidos en el CUESTIONARIO 2\n"
            + "La cantidad de respuestas correctas fue de: " + respuestasCorrectas
            + "\nLa cantidad de respuestas incorrectas fue de: " + respuestasIncorrectas;
    }
    public static String mostrarResultadoCuestionario3(char[] respuestas) {
        
        respuestasCorrectas = 0;
        respuestasIncorrectas =0;
        
        int i = 0;//declaracion
        
        do{
            if (respuestas[i] == respuestasCuestionario3[i]) {
                respuestasCorrectas++;
            }else{
                respuestasIncorrectas++;
            }   
            i++;//Incremento o zona de accion
            
        }while(i < respuestas.length);//Condicion
        
        /*for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == respuestasCuestionario3[i]) {
                respuestasCorrectas++;
            }else{
                respuestasIncorrectas++;
            }
        } 
        /*JOptionPane.showMessageDialog(null,"Resultados obtenidos en el Cuestionario 3\n\n"
            + "La cantidad de respuestas correctas fue de: " + respuestasCorrectas
            + "\nLa cantidad de respuestas incorrectas fue de: " + respuestasIncorrectas);*/
        
        return "\n\nResultados obtenidos en el CUESTIONARIO 3\n"
            + "La cantidad de respuestas correctas fue de: " + respuestasCorrectas
            + "\nLa cantidad de respuestas incorrectas fue de: " + respuestasIncorrectas;
    }
    public static String mostrarResultadoCuestionario4(char[] respuestas) {
        
        respuestasCorrectas = 0;
        respuestasIncorrectas =0;
        
        int i = 0;//declaracion
        
        do{
            if (respuestas[i] == respuestasCuestionario4[i]) {
                respuestasCorrectas++;
            }else{
                respuestasIncorrectas++;
            }   
            i++;//Incremento o zona de accion
            
        }while(i < respuestas.length);//Condicion
        
        /*for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == respuestasCuestionario4[i]) {
                respuestasCorrectas++;
            }else{
                respuestasIncorrectas++;
            }
        }
        /*JOptionPane.showMessageDialog(null,"Resultados obtenidos en el Cuestionario 4\n\n"
            + "La cantidad de respuestas correctas fue de: " + respuestasCorrectas
            + "\nLa cantidad de respuestas incorrectas fue de: " + respuestasIncorrectas);*/
        
        return "\nResultados obtenidos en el CUESTIONARIO 4\n"
            + "La cantidad de respuestas correctas fue de: " + respuestasCorrectas
            + "\nLa cantidad de respuestas incorrectas fue de: " + respuestasIncorrectas;
    }
    
    public static char[] ordenarIncisos(char[] inciso){
        
        int i =0, j = 0;//Declaracion
        
        do{
            do{
                if(inciso[i] < inciso[j]){
                    char auxiliar = inciso[i];
                    inciso[i] = inciso[j];
                    inciso[j] = auxiliar;
                }
                
                j++;
            }while(j < inciso.length);
            
            i++;//Incremento o zona de accion
            
        }while(i < inciso.length);//Condicion
        
        
        /*for(int i = 0 ; i < inciso.length ; i++ ){
            for(int j = 0 ; j < inciso.length ; j++ ){
                if(inciso[i] < inciso[j]){
                    char auxiliar = inciso[i];
                    inciso[i] = inciso[j];
                    inciso[j] = auxiliar;
                }
            }
        }
        /*for (int i = 0; i < inciso.length; i++) {
            System.out.print(inciso[i]);
        }*/
        return inciso;
    }
    public static void resultados(){
        JOptionPane.showMessageDialog(null,mostrarResultadoCuestionario1(respuestasCuestionario1Usuario)+ "\n"
                + mostrarResultadoCuestionario2(respuestasCuestionario2Usuario)+ "\n"
                + mostrarResultadoCuestionario3(respuestasCuestionario3Usuario)+ "\n"
                + mostrarResultadoCuestionario4(respuestasCuestionario4Usuario));
    }
    
    //Se crea un método llamado validadMenu que tendrá como parametro un String llamado opcion y que devolverá un entero que es la opción valida.
    public static int validarMenu(String opcion) {
        
        int opcionValida = 0; //Se almacena la opción validad, una vez validada.
        
        //Se crea una estructura de control if donde se valida que cuando opcion es null, esto se da al momento de presionar el botón Cancel o el botón Cerrar.
        if(opcion == null) {
            
            System.exit(0); //Con esta instrucción finaliza el programa
            
        } else {
            
            //Se usa un try-catch para captura el error que se produce si es que se ingresa otra cosa que que no se un número entero.
            try {
                
                int opcionNumero = Integer.parseInt(opcion); //El argumento opción se parsea a un entero siempre y cuando sean compatibles de lo contrario entra en función el try-catch.
                
                //Mediante una estructura de control if se valida que la variable opcionNumero se encuentre entre los rango de las opciones del menú.
                if(opcionNumero >= 1 && opcionNumero <= 6) {
                    
                    opcionValida = opcionNumero; //Se le asigna el valor de la variable opcionNumero a la variable opcionValida.
                    
                } else {
                    
                    //De lo contrario si no se cumple manda el error del porque en un JOptionPane.
                    JOptionPane.showMessageDialog(null, "Error.\nOpción incorrecta, número fuera de rango.\nDebes ingresar un valor entre 1-6.");
                    menu(); //Se manda a llamar el método menu.
                   
                }
            } catch(Exception e) {
                
                //Se crea un error se captura con el catch y se imprime el menseje con el error con un JOptionPane.
                JOptionPane.showMessageDialog(null, "Error.\nDebes ingresar números(1-6), no puedes ingresar\npalabras ni dejar espacios en blanco.\n");
                menu(); //Se vuelve a mandar a llamar el método menu.
                
            }
            
        }
        
        return opcionValida; //Se retorna el valor de la variable llamada opcionValida.
        
    }
    
}