/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;


import model.SecondHandShop;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Category;
import model.Product;
import model.Purchase;
import model.Selled;
import model.User;

/**
 *
 * @author Luis Galindo
 */
public class SecondHandShopFile {
    String name="ShopApp.text";

    public void saveFile(SecondHandShop shopApp){
    	int i;
        FileWriter fw = null;

        try{
            fw = new FileWriter(name);
            int c;
                fw.write(shopApp.userList.size()+"\n");
                User per;
                Product prod;
                Category cat;
                Selled sell;
                Purchase pur;

                for(c=0;c<shopApp.userList.size();c++){
                    per=(User) shopApp.userList.get(c); 
                    fw.write("1 " +per.getName()+" "+ per.getEmail()+" "+per.getPassword()+" "+per.getAddress().toString()+"\n");    	
            	}
            	fw.write(shopApp.categoryList.size()+"\n");
                for(c=0;c<shopApp.categoryList.size();c++){
                	cat=(Category) shopApp.categoryList.get(c); 
                	if (cat.getTop() == null) {
                		fw.write("2 "+cat.getName()+" null "+"\n");	
                	}else{
                		fw.write("2 "+cat.getName()+" "+cat.getTop().getName()+" "+"\n");
                	}
                }
                fw.write(shopApp.productList.size()+"\n");
                for(c=0;c<shopApp.productList.size();c++){
                	prod=(Product) shopApp.productList.get(c); 
                    fw.write("3 "+prod.owner.getEmail()+" "+ prod.getName() +" \" "+prod.getPrice()+" "+prod.getDescription()+" \" "+prod.getImage()+" "+prod.cate.getName()+"\n");
                }
                fw.write(shopApp.userList.size()+"\n");
                for(c=0;c<shopApp.userList.size();c++){
                    per=(User) shopApp.userList.get(c);
                    fw.write(per.getPurchasHist().size()+"\n");
                    for(int j=0;j<per.getPurchasHist().size();j++){
                		pur=(Purchase) per.getPurchasHist().get(j); 
                    	fw.write("4 "+pur.getBuyer().getID()+" "+pur.getProduct().getProductId()+" "+pur.getAddress().toString()+" "+"\n");
                    }
            	}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fw)
              fw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
           System.out.print("Archivo Guardado");
        }
    }

    public void loadFromFile(SecondHandShop shopApp){
            try{
                Scanner s=new Scanner(new File("ShopApp.text"));
                int i, k, c, n=s.nextInt();
                for(i=0;i<n;i++){
                    c=s.nextInt();
                    if(c==1){
                        shopApp.addUser(s.next(), s.next(), s.next(), s.next(), s.next(), s.nextInt(), s.next(), s.next(), s.next());
                    }
                }
                	n = s.nextInt();
                    for (i = 0; i < n; i++) {
                        c=s.nextInt();
                        
                    	if (c==2) {
                        String name = s.next();
                        String cat = s.next();
                        if (cat.equals("null")) {
                            shopApp.addCategory(name, null);
                        }else{
                            ArrayList<Category> catList = shopApp.getCategorys();
                            for(Category x : catList){
                                if (x.getName().equals(cat)) {
                                    shopApp.addCategory(name, x);
                                }
                            }
                        }
                    }
                    }
                    n = s.nextInt();
                for (i = 0; i < n; i++) {
                        c=s.nextInt();
                        
                	if(c==3){
                        ArrayList<User> users = shopApp.getUsers();
                        String aux = s.next();
                        String first = s.next();
                        String check = s.next();
                        while(!check.equals("\"")){
                            first = first + " " +check;
                            check = s.next();
                        }
                        String second = s.next();
                        String third = s.next();
                        check = s.next();
                        while(!check.equals("\"")){
                            third = third + " " +check;
                            check = s.next();
                        }
                        String fourth = s.next();
                        String last = s.next();
                        Category cate = null;
                        ArrayList<Category> auxCat = shopApp.getCategorys();
                        for (Category x : auxCat) {
                        	if (x.getName().equals(last)) {
                        		cate = x;
                        		break;
                        	}
                        }
                        for (User x : users) {
                        	if (x.getEmail().equals(aux)) {
                        		shopApp.addProduct(x.offerProduct(first, new Float(second), third, fourth, cate));
                        		break;
                        	}
                        }
                    }
                }
                    int l = s.nextInt();
                    for (i = 0; i < l ; i++) {
                    	int j = s.nextInt();
                    	for (int z = 0; z < j ; z++) {
                            c=s.nextInt();
                    		if (c == 4) {
                      ArrayList<User> users = shopApp.getUsers();
                      ArrayList<Product> products = shopApp.getProducts();
                        String auxOne = s.next();
                        String auxTwo = s.next();
                        User user = null;
                        for (User x : users) {
                          if (x.getEmail().equals(auxOne)) {
                            user = x;
                            break;
                            }
                          }
                        for (Product y : products) {
                            if (y.getProductId().equals(auxTwo)) {
                                User auxThree = y.getProductOwner();
                                auxThree.addSelledHist(user.purchaseProduct(y));
                                break;
                            }
                        }
                    }
                    	}
                    }
               
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.print("Archivo Cargado");
    }
    
}
