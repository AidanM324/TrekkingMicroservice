package ie.atu.trekkingmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MountainRepository mountainRepository;


    @Autowired
    public DataLoader(MountainRepository mountainRepository) {
        this.mountainRepository = mountainRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Mountain testData = new Mountain(1L, "Everest", "Adventure.ie", 40000, "adventure@gmail.com", "18 days", "Nepal", "Extreme", "Himalayas");
        Mountain testData2 = new Mountain(1L, "Mt Toubkal", "Aztat treks", 500, "aztattreks@gmail.com", "5 days", "Morocco", "tough", "Atlas mountains");
        Mountain testData3 = new Mountain(1L, "Mt Mera", "MuchBetterAdventures", 4000, "muchbetteradventures@gmail.com", "14 days", "Nepal", "Extreme", "Himalayas");
        mountainRepository.save(testData);
        mountainRepository.save(testData2);
        mountainRepository.save(testData3);
    }

}
