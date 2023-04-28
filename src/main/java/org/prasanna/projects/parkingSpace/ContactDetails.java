package org.prasanna.projects.parkingSpace;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactDetails {
    private String contactName;
    private Integer contactNumber;
    private ContactType contactType;
}
