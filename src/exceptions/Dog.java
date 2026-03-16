package exceptions;

/**
 * Dog class, a subclass of Pet

 */
public class Dog extends Pet {

    private String specyName;

    /**
     * Dog constructor
     * @param specyName the specy name of the dog
     * @param owner the owner of the dog
     * @throws DogException if the specy name is null
     */
    public Dog (String specyName, String owner) throws DogException {
        super(specyName, owner);
        // ctor Animal
        if (specyName == null)
            throw new DogException("Dog specy name cannot be null");
    }

    @Override
    /**
     * print out the information of the dog
     */
    public void saySomething() {
        System.out.println("bark bark!");
    }

}
