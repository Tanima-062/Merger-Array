package MergeArray;

public class Main {

	public static void main(String[] args) {
		int[] nums1 = new int[] {1,0};
		int[] nums2 = new int[] {2};
		int i=0, j = 0, k = 0, m = 1, n = 1;
		
		if(m == 0 && n == 0) {
			System.out.print("[]");
		}else if(m == 0) {
			System.out.print("[");
			for(i=0; i < nums2.length-1; i++) {
				nums1[i] = nums2[i];
				System.out.print(nums1[i]+",");
			}
			nums1[i] = nums2[i];
			System.out.print(nums1[i]+"]");
		}else if(n == 0) {
			System.out.print("[");
			for(i=0; i < nums1.length-1; i++) {
				System.out.print(nums1[i]+",");
			}
			System.out.print(nums1[i]+"]");
		}else {
			for(j=0; j < nums2.length; j++) {
				while(i < m+k) {
					if(nums1[i] > nums2[j]) {
						for(int l = nums1.length-1; l > i; l--) {
							nums1[l] = nums1[l-1];
						}
						k++;
						nums1[i] = nums2[j];
						i++;
						break;
					}
					i++;
				}
				if(i >= m+k) {
					nums1[i] = nums2[j];
					i++;
				}
			}
			System.out.print("[");
			for(i=0; i < nums1.length-1; i++) {
				System.out.print(nums1[i]+",");
			}
			System.out.print(nums1[i]+"]");
		}

	}

}
