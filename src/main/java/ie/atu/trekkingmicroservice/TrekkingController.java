package ie.atu.trekkingmicroservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/Trek")
@RestController
public class TrekkingController {

    private final TrekkingService trekkingService;

    public TrekkingController(TrekkingService trekkingService) {
        this.trekkingService = trekkingService;
    }

    @GetMapping("/getAllAccounts")
    public ResponseEntity<?> getAllPersons() {

        List<Mountain> companies = trekkingService.getAllCompanies();

        if (companies == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(companies);
    }




}
