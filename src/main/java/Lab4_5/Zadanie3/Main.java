package Lab4_5.Zadanie3;

public class Main {
    public static void main(String[] args){
        Task[] tasks ={
                new Task("Сделат отчет", Priority.HIGH),
                new Task("Проверить почту", Priority.MEDIUM),
                new Task("Исправить баги", Priority.HIGH),
                new Task("Обновить документ", Priority.LOW)
        };
        for(int i=0;i<tasks.length -1 ;i++){
            for(int j=0;j<tasks.length -1 -i;j++){
                if(tasks[j].priority.ordinal()>tasks[j+1].priority.ordinal()){
                    Task temp = tasks[j];
                    tasks[j] = tasks[j+1];
                    tasks[j+1] = temp;
                }
            }
        }
        System.out.println("Задачи по приоритету");
        for(int i=0;i<tasks.length;i++){
            tasks[i].info();
        }
    }
}
