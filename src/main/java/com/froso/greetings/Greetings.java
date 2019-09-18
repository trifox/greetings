package com.froso.greetings;

import com.github.javafaker.*;

import java.util.*;

public class Greetings {

    public static void main(String args[]) {
        Random random = new Random();

        Faker faker = new Faker();
        StringCreator x = faker.chuckNorris()::fact;
        List<StringCreator> stringCreator = new ArrayList<>();

        stringCreator.add(faker.chuckNorris()::fact);
        stringCreator.add(faker.lebowski()::quote);
        stringCreator.add(faker.friends()::quote);
        stringCreator.add(faker.elderScrolls()::quote);
        stringCreator.add(faker.gameOfThrones()::quote);
        stringCreator.add(faker.howIMetYourMother()::quote);
        stringCreator.add(faker.backToTheFuture()::quote);
        stringCreator.add(faker.dune()::quote);
        stringCreator.add(faker.hitchhikersGuideToTheGalaxy()::quote);
        stringCreator.add(faker.rickAndMorty()::quote);
        stringCreator.add(faker.yoda()::quote);
        stringCreator.add(faker.robin()::quote);
        stringCreator.add(faker.shakespeare()::asYouLikeItQuote);
        stringCreator.add(faker.shakespeare()::hamletQuote);
        stringCreator.add(faker.shakespeare()::kingRichardIIIQuote);
        stringCreator.add(faker.shakespeare()::romeoAndJulietQuote);
        stringCreator.add(faker.harryPotter()::quote);
        stringCreator.add(faker.witcher()::quote);

        StringCreator item = stringCreator.get(random.nextInt(stringCreator.size()));
        System.out.println('"' + item.createString() + '"');
    }

    @FunctionalInterface
    static
    interface StringCreator {
        String createString();
    }
}
