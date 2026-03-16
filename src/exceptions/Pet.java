package exceptions;

/**
 * a class describing Pets
 */
public abstract class Pet {
    private String name;
    private String owner;

    final static String DEFAULT_OWNER = "unknown";

    /**
     * constructor
     * @param name the name of the pet
     * @param owner the owner of the pet
     */
    public Pet(String name, String owner) {
        this.name = name;
        // if null, set to "unknown"
        this.owner = owner == null ? DEFAULT_OWNER : owner;
    }

    /**
     * getter
     * @return the name of the pet
     */
    public String getName() {
        return name;
    }

    /**
     * getter
     * @return the owner of the pet
     */
    public String getOwner() {
        return owner;
    }

    /**
     * setter
     * @param name the name of the pet
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter
     * @param owner the owner of the pet
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * print out the information of the pet
     * @return the information of the pet: name and owner
     */
    @Override
    public String toString() {
        return "Pet [name=" + name + ", owner=" + owner + "]";
    }

    /**
     * builds an Animal with a name
     * @param name the name of the pet
     * @throws IllegalArgumentException if name is null
     */
    public Pet(String name) {
        if (name == null) {
            // IllegalArgumentException is an unchecked exception,
            // so we don't need to declare it in the method signature
            throw new IllegalArgumentException("name cannot be null");
        }
        this.name = name;
    }

    /**
     * default Pet's output
     */
    public void saySomething() {
        System.out.println("I'm a pet");
    }
}
