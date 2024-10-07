package Profile_Management_Service.Profile_Management.Service;

import Profile_Management_Service.Profile_Management.Model.Contact;
import Profile_Management_Service.Profile_Management.Repository.ContactRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class ContactService implements ContactServiceInterface{

    private final ContactRepository repo;

    @Override
    public Page<Contact> getAllContact(int page, int size) {
        return null;
    }

    @Override
    public Contact getContact(String id) {
        return null;
    }

    @Override
    public Contact createContact(Contact contact) {
        return null;
    }

    @Override
    public void deleteContact(String id) {

    }

    @Override
    public String uploadPhoto(String id, MultipartFile file) {
        return "";
    }
}
