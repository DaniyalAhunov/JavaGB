package Java.Seminar2;

public class DZ_1 {
    public static void main(String[] args){
        // Количество тарелок, стартовое, среднее, назначение
        hanno(4,"X","Y","Z");
    }                                     
    public static void hanno(int n,String begin,String mid,String end){
        if(n==1){ //если рано одному то выводим последнее что переложили и выходим
            System.out.println(begin+" -> "+end);
        }
        else{ // Во всех остальных случаях 
            hanno(n-1,begin,end,mid); // забираем одну тарелку  и перекладываем ее вызывая метод заново 
            System.out.println(begin+" -> "+end);
            hanno(n-1,mid,begin,end); 
        }
    }
}

