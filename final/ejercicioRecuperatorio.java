import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ejercicioRecuperatorio{
public void main(String[] args) {
int[] array = {1, 2, 3, 4, 5};
double[] array2 = {3,2,3,4,5,};
int i, j, var;

int n = array.length;
for (i = 0; i < n/2; i++) {
var = array[i];
array[i] = array[n - i - 1];
array[n - i - 1] = var;
}

System.out.println(Arrays.toString(array));

for (i = array2.length-1; i >= 0; i--)
{
System.out.println(array2[i]);

}
}
}