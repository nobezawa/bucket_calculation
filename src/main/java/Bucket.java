/**
 * Bucket
 *
 * @author Nobezawa
 */
public class Bucket implements BucketInterface {

    private int capacity;
    private int water;

    public Bucket(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public BucketInterface add(int water) {
        this.water = this.water + water;
        // 許容量を超えた水は削除する
        if (this.water > this.capacity) {
            int tmp    = this.water - this.capacity;
            this.water = this.water - tmp;
        }
        return this;
    }

    @Override
    public BucketInterface fullFill() {
        this.water = capacity;
        return this;
    }

    @Override
    public int size() {
        return this.water;
    }

    @Override
    public void throwAway() {
        this.water = 0;
    }

    @Override
    public BucketInterface pourInto(BucketInterface inToBucket) {
        int remainingSize = inToBucket.getCapacity() - inToBucket.size();
        if (remainingSize > this.water) {
            inToBucket.add(this.water);
            this.water = 0;
        }else {
            inToBucket.add(remainingSize);
            this.water = this.water - remainingSize;
        }
        return this;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

}
