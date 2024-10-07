package Profile_Management_Service.Profile_Management.Service;

import Profile_Management_Service.Profile_Management.Model.Contact;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

public interface ContactServiceInterface {

    public Page<Contact> getAllContact(int page, int size);

    public Contact getContact(String id);

    public Contact createContact(Contact contact);

    public void deleteContact(String id);

    public String uploadPhoto(String id, MultipartFile file);


}
