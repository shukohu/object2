public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals((author.name)) && lastName.equals(author.lastName);

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(lastName);
    }

    public String getFirstName() {
        return name;
    }

    public String getSecondName() {
        return lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

}
