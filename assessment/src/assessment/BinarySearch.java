package assessment;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7,8,9,10};
System.out.println("enter a number you want to search\n");
Scanner sc = new Scanner(System.in);
int itemtosearch = sc.nextInt();
int indexvalue=0;
boolean searchresult=false;
int n=a.length;
//binary search is possible only on sorted array
int start=0;
int end=n;
while(start<=end) {
	int mid=(start+end)/2;
	if (itemtosearch==a[mid]) {
		indexvalue=mid;
		searchresult=true;
		System.out.println("The Number "+itemtosearch+" is found at index "+indexvalue);
		break;
	}else if (itemtosearch<a[mid]) {
		end=mid-1;
	}else {
		start=mid+1;
	}
}
if (searchresult==false) {
	System.out.println("The number"+itemtosearch+"is not present in the list");
}
}
}

