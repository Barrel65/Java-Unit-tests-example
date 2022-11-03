public class NumberOfLegs {
    public String determCreature(int numLegs){
        if (numLegs<0){
            throw new IllegalArgumentException("Number of legs cannot be less 0");
        }
        else if (numLegs==1){
            return "Snail";
        }
        else if (numLegs==2){
            return "Human";
        }
        else if (numLegs==4){
            return "Cat";
        }
        else if (numLegs==8){
            return "Octopus";
        }
        else{
            return "Uknown animal";
        }

    }
}
