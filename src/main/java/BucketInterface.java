

/**
 * BucketInterface
 *
 * @author Nobezawa
 */
public interface BucketInterface {


    /**
     * add
     *
     * @param  water
     * @return main.java.BucketInterface
     */
    BucketInterface add(int water);

    /**
     * fullFill
     *
     * @return main.java.BucketInterface
     */
    BucketInterface fullFill();

    /**
     * size
     *
     * @return main.java.BucketInterface
     */
    int size();

    /**
     * throwAway
     *
     */
    void throwAway();

    /**
     * pourInto
     *
     * @param  inToBucket
     * @return BucketInterface
     */
    BucketInterface pourInto(BucketInterface inToBucket);

    /**
     * getCapacity
     *
     * @return int
     */
    int getCapacity();

}
