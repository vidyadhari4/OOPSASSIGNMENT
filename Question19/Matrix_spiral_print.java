class Matrix_spiral_print{
    public static void main(String args[]){
        int m=5;
        int n=5;
        int a[][]=new int[m][n];
        int i,j;
        int count1=1;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=count1;
                count1++;
            }
        }
        int count=0,count2=0,count3=0,count4=0,count5=0,count6=0;
        int k=0,l=0;
        int p=m*n;
        int v,d;
       while(p!=0){     
           if(count%4==0){  
               for(d=k;d<n-k;d++){
                   System.out.print(a[count3][d]+" ");
               }
               k++;
               count3++;
           }
           if(count%4==1){
               for(v=k;v<n-l;v++){
                   System.out.print(a[v][n-count4-1]+" ");
               }
               l++;
               count4++;
           }
           int x=k-1;
           int y=l-1;
           if(count%4==2){
               for(d=n-x-2;d>=x;d--){
                   System.out.print(a[n-count5-1][d]+" ");
               }
               x++;
               count5++;
           }
           if(count%4==3){
               for(v=n-y-2;v>y;v--){
                   System.out.print(a[v][count6]+" ");
               }
               y++;
               count6++;
           }
           count++;
            p--;
       }
    }
}