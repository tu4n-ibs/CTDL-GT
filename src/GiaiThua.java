public class GiaiThua {

    public int GiaiThua(int nums) {
        if (nums < 0) {
            return 1;
        } else {
            return nums * GiaiThua(nums - 1);
        }
    }
}
