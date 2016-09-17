

/**
 * BucketInterface
 *
 * @author Nobezawa
 */
public interface BucketInterface {


    /**
     * add
     *
     * @param  water  お水
     * @return BucketInterface
     */
    BucketInterface add(int water);

    /**
     * fullFill
     *
     * @return BucketInterface
     */
    BucketInterface fullFill();

    /**
     * size
     *
     * @return BucketInterface
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
     * @param  inToBucket 対象のバケツ
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
