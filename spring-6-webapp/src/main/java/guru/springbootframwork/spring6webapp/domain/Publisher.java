package guru.springbootframwork.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PUBLISHER_seq_generator")
    @SequenceGenerator(name = "PUBLISHER_seq_generator", sequenceName = "PUBLISHER_SEQ", allocationSize = 1)

    private long id;
    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Publisher publisher)) return false;

        return getId() == publisher.getId();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
