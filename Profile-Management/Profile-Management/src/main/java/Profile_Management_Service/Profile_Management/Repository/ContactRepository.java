package Profile_Management_Service.Profile_Management.Repository;

import Profile_Management_Service.Profile_Management.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, String> {

    Optional<Contact> findBycontact(String s);

    Optional<Contact> findById(String s);
}
