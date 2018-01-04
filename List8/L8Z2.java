public static int[] duplicate(int [] list1, int [] list2 )
{
	int tab_len=0;
	for(int i=0;i<list2.length;i++)
		if(i<list1.length)
			tab_len+=list2[i];
	int[] list=new int[tab_len];
	int place=0;
	for(int i=0;i<list1.length;i++)
		for(int j=0;list2.length>i && j<list2[i];j++)
		{
			list[place]=list1[i];
			place++;
		}
	return list;
}


TEST:
public static void main(String[]args)
{
	int[] l1={1,2,3,4};
	int[] l2={4,3,2,1};
	int[] l3={1,2,3,4};
	int[] l4={4,3,2};
	int[] l5={1};
	int[] l6={4,3,2};
	int[] l7={1};
	int[] l8= {};
	int[] l9={};
	int[] l10= {};
	int[] temp1=duplicate(l1,l2);
	int[] temp2=duplicate(l3,l4);
	int[] temp3=duplicate(l5,l6);
	int[] temp4=duplicate(l7,l8);
	int[] temp5=duplicate(l9,l10);
	for(int i=0;i<temp1.length;i++)
		System.out.print(temp1[i]+" ");
	System.out.println();
	for(int i=0;i<temp2.length;i++)
		System.out.print(temp2[i]+" ");
	System.out.println();
	for(int i=0;i<temp3.length;i++)
		System.out.print(temp3[i]+" ");
	System.out.println();
	for(int i=0;i<temp4.length;i++)
		System.out.print(temp4[i]+" ");
	System.out.println();
	for(int i=0;i<temp5.length;i++)
		System.out.print(temp5[i]+" ");
}