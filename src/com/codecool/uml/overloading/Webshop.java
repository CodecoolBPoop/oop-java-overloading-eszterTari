package com.codecool.uml.overloading;

import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.text.ParseException;


public class Webshop {

    public static void main(String[] args) {

        Currency forint = Currency.getInstance("HUF");
        Supplier games4ever = new Supplier("Games4Ever", "Games4Everonye, Games4Everytime - Games4Ever");
        ProductCategory boardGames = new ProductCategory("boardGames", "familyGames", "board games");
        ProductCategory cardGames = new ProductCategory("cardGames", "familyGames", "card games");
        ProductCategory videoGames = new ProductCategory("videoGames", "videoGamesForPC", "videoGames - PC master race");
        ProductCategory deluxeEditionStuff = new FeaturedProductCategory();
        Product pandemicIberia = new Product("Pandemic Iberia", 12000.00f, forint);
        Product cluedo = new Product("Cluedo", 10000.00f, forint);
        Product gameOfThrones = new Product("Game Of Thrones the board game", 15000.00f, forint);
        Product frenchCard = new Product("French cards", 990.00f, forint);
        Product hungarianCard = new Product("Hungarian cards", 890.00f, forint);
        Product tombRaider = new Product("Tomb Raider (2013)", 8000.00f, forint);
        Product riseOfTheTombRaider = new Product("Rise of the Tomb Raider (2015)", 12000.00f, forint);
        Product shadowOfTheTombRaider = new Product("Shadow of the Tomb Raider (2018)", 15000.00f, forint);

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;

        try {
            startDate = date.parse("2018-09-01");
            endDate = date.parse("2018-09-30");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ((FeaturedProductCategory) deluxeEditionStuff).schedule(startDate, endDate);

        pandemicIberia.setProductCategory(boardGames);
        pandemicIberia.setSupplier(games4ever);

        cluedo.setProductCategory(boardGames);
        cluedo.setSupplier(games4ever);

        gameOfThrones.setProductCategory(boardGames);
        gameOfThrones.setSupplier(games4ever);

        frenchCard.setProductCategory(cardGames);
        frenchCard.setSupplier(games4ever);

        hungarianCard.setProductCategory(cardGames);
        hungarianCard.setSupplier(games4ever);

        tombRaider.setProductCategory(videoGames);
        tombRaider.setSupplier(games4ever);

        riseOfTheTombRaider.setProductCategory(videoGames);
        riseOfTheTombRaider.setSupplier(games4ever);

        shadowOfTheTombRaider.setProductCategory(videoGames);
        shadowOfTheTombRaider.setSupplier(games4ever);

        deluxeEditionStuff.setName("extraMaterial");
        deluxeEditionStuff.setDepartment("videogames");
        deluxeEditionStuff.setDescription("extra material for Shadow of the Tomb Raider");

        System.out.println(games4ever.getProducts().toString());
        System.out.println(boardGames.getProducts().toString());
        System.out.println(pandemicIberia.toString());
        System.out.println(games4ever.toString());
        System.out.println(deluxeEditionStuff.toString());
    }
}
