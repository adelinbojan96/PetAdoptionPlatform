import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualDisplayPetAdoption implements ActionListener {

    static void demo()
    {
        Adoption adoptionPlatform = new Adoption();
        byte[] imageData = new byte[]{
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00
        };
        // Adding some pets to the platform
        adoptionPlatform.addPet(new Pet(1,"Buddy", "Dog","Labrador", 2, imageData));
        adoptionPlatform.addPet(new Pet(2, "Mittens", "Cat", "Persian", 4, imageData));
        adoptionPlatform.addPet(new Pet(3, "Whiskers", "Cat", "Siamese", 3, imageData));
        adoptionPlatform.addPet(new Pet(4, "Nemo", "Fish", "Clownfish",1, imageData));

        // Display available pets
        adoptionPlatform.displayAvailablePets();

        // Adopt a pet (it also deletes it)
        Pet adoptedPet = adoptionPlatform.adoptPet("Buddy");
        if (adoptedPet != null) {
            System.out.println("Congratulations! You've adopted: " + adoptedPet.getName());
        } else {
            System.out.println("Sorry, the requested pet is not available for adoption.");
        }

        // Display updated available pets
        adoptionPlatform.displayAvailablePets();
    }
    public static void main(String[] args) {

        new LoginScreen(null);
        //demo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}