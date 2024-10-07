package Profile_Management_Service.Profile_Management.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SecondaryRow;
import org.hibernate.annotations.UuidGenerator;

@Entity //Represent the model clas
@Table(name="contacts") //Table Name
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // if null occurs it will exclude
public class Contact {

    @Id
    @UuidGenerator
    @Column(name="id", unique = true, updatable = false) //Assign name for the column and not changable and not updated
    private String id;
    private String name;
    private String email;
    private String title;
    private String phone;
    private String address;
    private String status;
    private String photoUrl;
}
