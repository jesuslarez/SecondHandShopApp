/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandshopapp;

/**
 *
 * @author Jesus Larez
 */
public class SecondHandShopApp {


    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        // CREATE THE SHOP
        
        //Datos En el Archivo de Carga para Usuarios, Productos y Categorias Por Defecto
        //Esto es solo para ver Visualmente, no hace falta descomentar, estos datos estan cargados
 /*       
        shop = new SecondHandShop();
        
        shop.addUser("Katy", "Purry", "TheRealKaty@hotmail.com", 
                "696969", "Calle MiamiStreet", 45, "Miami","685FE4", "GringoLandia" );
        shop.addUser("Jesus", "Larez", "jesuslarez@ulpgc.es", 
                "jesus", "Calle Felo Monzon", 23, "Las Palmas","35015", "Spain" );
        shop.addUser("Luis", "Galindo", "luisgalindo@ulpgc.es", 
                "luis", "Calle Practicante", 13, "Las Palmas","35017", "Spain" );
        shop.addUser("Esther", "Gonzalez", "esthergonzalez@ulpgc.es", 
                "esther", "Calle Guanarteme", 26, "Las Palmas","35011", "Spain" );
        shop.addUser("Vladimir", "Ivanov", "vladimirivanov17@ulpgc.es", 
                "vladimir", "Sovetskaya Street", 16, "Moscow","4002", "Russia" );
        shop.addUser("Shraddha", "Sharma", "shraddhasharma@ulpgc.es", 
                "shraddha", "King Crescent Street", 24, "Sheffield","SH24 6QR", "United Kingdow" );
        shop.addUser("Nayara", "Aguilar", "nayaraaguilar@ulpgc.es", 
                "nayara", "Calle Venezuela", 19, "Las Palmas","35009", "Spain" );
        
        //CATEGORIAS
        
        shop.addCategory("Libros",null );  //0
        shop.addCategory("Ropa" , null); // 1
        shop.addCategory("Mujer", shop.categoryList.get(1) ); // 2
        shop.addCategory("Hombre" , shop.categoryList.get(1) );  //3 
        shop.addCategory("Musica", null );  //4 
        shop.addCategory("Coches", null ); // 5 
        shop.addCategory("Electronica",null );// 6 
        shop.addCategory("PC" ,shop.categoryList.get(6));  //7
        shop.addCategory("Electrodomesticos", shop.categoryList.get(6));  //8
        shop.addCategory("Muebles", null ); //9
        shop.addCategory("Coches",null ); //10 
        shop.addCategory("Belleza" ,null); //11
        
        
        //Productos Katy
        shop.userList.get(0).offerProduct("Libro Harry Potter 1", 25.5f , "Primer libro de la saga Harry Potter", "imagen", shop.categoryList.get(0));
        shop.userList.get(0).offerProduct("Vestido", 25.5f , "Vestido Rojo de seda", "imagen", shop.categoryList.get(2));
        
        //Productos Jesus
        shop.userList.get(1).offerProduct("Mando", 15.00f , "Mando Usado de Xbox One", "imagen", shop.categoryList.get(6));
        shop.userList.get(1).offerProduct("Memoria RAM 8 GB", 39.99f , "Memoria DDR3 2400mhz", "imagen", shop.categoryList.get(7));
        shop.userList.get(1).offerProduct("Lampara", 9.99f , "Lampara led para escritorio", "imagen", shop.categoryList.get(9));
        
        //Productos Luis
        shop.userList.get(2).offerProduct("Libro fuego y hielo", 23.75f , "Libro de saga GoT", "imagen", shop.categoryList.get(0));
        shop.userList.get(2).offerProduct("Vaqueros Azules", 5.99f , "Vaqueros azules en perfecto estado", "imagen", shop.categoryList.get(3));
        shop.userList.get(2).offerProduct("Camiseta", 4.99f , "Camiseta verde apenas usada", "imagen", shop.categoryList.get(3));
        shop.userList.get(2).offerProduct("Chaqueta azul", 8.99f , "Chaqueta azul sin manchas ni roturas", "imagen", shop.categoryList.get(3));
        shop.userList.get(2).offerProduct("Zapatillas blancas", 20.50f , "Zapatillas  blancas nuevas sin usar", "imagen", shop.categoryList.get(3));
        shop.userList.get(2).offerProduct("Disco Vinilo Endless River de Pink Floyd", 90.75f , "Reliquia para los amantes dela musica", "imagen", shop.categoryList.get(4));
        shop.userList.get(2).offerProduct("Reproductor de CD", 3.00f , "Reproductor de CD portable", "imagen", shop.categoryList.get(4));
        shop.userList.get(2).offerProduct("Guitarra Electrica", 80.00f , "Guitarra Electrica Roja con amplificador", "imagen", shop.categoryList.get(4));
        shop.userList.get(2).offerProduct("Microondas", 15.00f , "Microondas usado blanco", "imagen", shop.categoryList.get(8));
        shop.userList.get(2).offerProduct("Nevera", 150.00f , "Nevera en perfecto estado, medidas: 177 x 55 x 56 cm", "imagen", shop.categoryList.get(8));
        shop.userList.get(2).offerProduct("Licuadora", 20.00f , "Licuadora con 3 velocidades, genial para hacer batidos", "imagen", shop.categoryList.get(8));
        shop.userList.get(2).offerProduct("Horno portatil", 40.00f , "Horno portatil ideal para estudiantes en piso compartido", "imagen", shop.categoryList.get(8));
        shop.userList.get(2).offerProduct("Sillon", 75.00f , "sillon negro super comodo con acolchado", "imagen", shop.categoryList.get(9));
        shop.userList.get(2).offerProduct("Cama individual", 125.00f , "Cama individual, colchon comodo, medidas: 90 x 180 cm", "imagen", shop.categoryList.get(9));
        shop.userList.get(2).offerProduct("Silla Gamer", 175.00f , "Silla de escritorio como cualquier otra, pero gamer", "imagen", shop.categoryList.get(9));
        shop.userList.get(2).offerProduct("Armario", 125.00f , "Armario con espejo en puerta interior, medidas: 190 x 120 x 70", "imagen", shop.categoryList.get(9));
        shop.userList.get(2).offerProduct("Seat Ibiza 2015", 8500.00f , "Seat Ibiza, kilometraje: 52 mil Km. 3 puertas SC (gasolina): 1.0, Sin abolladuras", "imagen", shop.categoryList.get(10));
        
        ///Productos Esther
        shop.userList.get(3).offerProduct("Sudadera roja", 7.50f , "Sudadera en perfecto estado, apenas usada", "imagen", shop.categoryList.get(2));
        shop.userList.get(3).offerProduct("Falda corta amarilla", 9.50f , "Falda corta talla S", "imagen", shop.categoryList.get(2));
        shop.userList.get(3).offerProduct("Juego de sombra de ojos", 10.90f , "Juego de sombra de ojos sin usar", "imagen", shop.categoryList.get(11));
        shop.userList.get(3).offerProduct("Perfume Miss Dior", 15.60f , "Perfume Miss Dior Edicion le rose", "imagen", shop.categoryList.get(11));
        shop.userList.get(3).offerProduct("UML Bible", 14.99f , "Libro para aprender UML, poco uso", "imagen", shop.categoryList.get(0));
        
        //Productos Vladimir
        shop.userList.get(4).offerProduct("Mesa de Billar", 145.00f , "Mesa de billar, incluye palos y bolas", "imagen", shop.categoryList.get(9));
        shop.userList.get(4).offerProduct("Sueter de piel de Oso", 42.00f , "Set de Piel de oso Ruso", "imagen", shop.categoryList.get(1));
        shop.userList.get(4).offerProduct("PS4 Pirateada", 240.00f , "PS4 con soporte para juegos piratas", "imagen", shop.categoryList.get(6));
        
        
        //Shraddha No vende nada

        
        //Productos Nayara
        shop.userList.get(6).offerProduct("Gorro Azul Marino", 5.00f , "Gorro azul apenas usado, pone alaska en la parte de atras", "imagen", shop.categoryList.get(2));
        shop.userList.get(6).offerProduct("Maquillaje", 5.00f , "Set de maquillaje", "imagen", shop.categoryList.get(11));
        shop.userList.get(6).offerProduct("Pantalla 17 Pulgadas", 5.00f , "Pantalla para TV o PC con conector HDMI", "imagen", shop.categoryList.get(8));
        

        // CREATE THE VIEW (GUI)
        
        
        

     
        // CREATE THE FILE TO STORE THE SHOP
                
*/
       
    }
    
}
