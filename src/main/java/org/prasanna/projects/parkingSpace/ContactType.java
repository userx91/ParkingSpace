package org.prasanna.projects.parkingSpace;

public enum ContactType {
    INDIVIDUAL("Individual"),
    ORGANISATION("Organization"),
    INSTITUTION("Institution"),
    GOVERNMENT("Government"),
    OTHER("other");

    public final String contactType;

    private ContactType(String contactType) {
        this.contactType = contactType;
    }
}
