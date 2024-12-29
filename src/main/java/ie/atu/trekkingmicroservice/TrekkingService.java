package ie.atu.trekkingmicroservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrekkingService {

    private final MountainRepository mountainRepository;

    public TrekkingService(MountainRepository mountainRepository) {
        this.mountainRepository = mountainRepository;
    }

    public List<Mountain> getAllCompanies() {
        return mountainRepository.findAll();
    }
}
