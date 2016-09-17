
import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

public class TestBucket{

    private static Bucket bucket;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        int capacity = 5;
        bucket = new Bucket(capacity);
    }

    @Test
    public void testAdd() {
        assertEquals(Bucket.class, bucket.add(3).getClass());
        bucket.add(3);
        assertEquals(5, bucket.size());
        bucket.throwAway();
    }

    @Test
    public void testThrowAway() {
        bucket.add(5);
        bucket.throwAway();
        assertEquals(0, bucket.size());
    }

    @Test
    public void testSize() {
        bucket.throwAway();
        bucket.add(1);
        assertEquals(1, bucket.size());
    }

    @Test
    public void testFullFill() {
        bucket.throwAway();
        assertEquals(Bucket.class, bucket.fullFill().getClass());
        assertEquals(5, bucket.size());
    }

    @Test
    public void testPourInto() {
        BucketInterface bucketCapacityFive  = new Bucket(5);
        BucketInterface bucketCapacityThree = new Bucket(3);
        bucketCapacityFive.fullFill();
        assertEquals(2, bucketCapacityFive.pourInto(bucketCapacityThree).size());

        bucketCapacityFive.throwAway();
        bucketCapacityThree.throwAway();

        bucketCapacityThree.fullFill();
        assertEquals(0, bucketCapacityThree.pourInto(bucketCapacityFive).size());

        bucketCapacityFive.throwAway();
        bucketCapacityThree.throwAway();

        bucketCapacityFive.fullFill();
        bucketCapacityThree.fullFill();
        assertEquals(5, bucketCapacityFive.pourInto(bucketCapacityThree).size());
        assertEquals(3, bucketCapacityThree.pourInto(bucketCapacityFive).size());
    }

}
