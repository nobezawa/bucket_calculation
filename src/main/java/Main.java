/**
 * 5Lのバケツと3Lのバケツで4Lの水を測る処理
 *
 * １、  ５Lのバケツに満杯まで水を入れる
 * ２、  ５Lバケツの水を３Lのバケツに満杯まで入れる
 * ３、  ５Lのバケツに現在２Lが入っている、３Lのバケツは満杯
 * ４、  ３Lのバケツの水を全て捨てる
 * ５、  ５Lのバケツの水を全て３Lのバケツに入れる
 * ６、  ５Lのバケツがゼロで３Lのバケツに２Lが入っている状態
 * ７、  ５Lのバケツに満杯まで入れる
 * ８、  ５Lのバケツの水を３Lのバケツに入れる
 * ９、  ５Lのバケツに４Lの水が入っている。
 * １０、４Lの水の計算が完了している
 */
public class Main {

    public static void main(String[] args) {

        // 5Lのバケツと3Lのバケツを用意
        BucketInterface bucketCapacityFive  = new Bucket(5);
        BucketInterface bucketCapacityThree = new Bucket(3);

        bucketCapacityFive.fullFill();
        bucketCapacityFive.pourInto(bucketCapacityThree);

        bucketCapacityThree.throwAway();

        bucketCapacityFive.pourInto(bucketCapacityThree);

        bucketCapacityFive.fullFill();
        bucketCapacityFive.pourInto(bucketCapacityThree);

        System.out.println("5Lのバケツには現在、" + bucketCapacityFive.size() + "Lの水が入っている");
    }

}
