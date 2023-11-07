interface Top {
    String getDescription();
}

interface Pant {
    String getDescription();
}

interface Shoe {
    String getDescription();
}

// Product Classes
class ProfessionalTop implements Top {
    @Override
    public String getDescription() {
        return "Professional Top";
    }
}

class ProfessionalPant implements Pant {
    @Override
    public String getDescription() {
        return "Professional Pant";
    }
}

class ProfessionalShoe implements Shoe {
    @Override
    public String getDescription() {
        return "Professional Shoe";
    }
}

// product variants for Casual and Party

interface GarmentFactory {
    Top createTop();
    Pant createPant();
    Shoe createShoe();
}

//Factories for each garment family
class ProfessionalGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pant createPant() {
        return new ProfessionalPant();
    }

    @Override
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}

public class GarmentSimulator {
    public static void main(String[] args) {
        //garment family
        GarmentFactory factory = new ProfessionalGarmentFactory(); // You can change this to Casual or Party

        // Create garments
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        System.out.println("Matching Outfit:");
        System.out.println(top.getDescription());
        System.out.println(pant.getDescription());
        System.out.println(shoe.getDescription());
    }
}
