package lesson5;

import java.util.Arrays;

public class Bank {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};

        withdraw(names,balances,"Denis",100);
        System.out.println(Arrays.toString(balances));
    }



    static int findClientIndexByName(String[] clients,String client){
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

    public static int withdraw(String[] clients, int[] balances, String client, int amount){
        int clientIndex = findClientIndexByName(clients, client);//ищем нужно клиетна через его индекс.
        if(balances[clientIndex] < amount)//далее я думаю все ясно
            return -1;
        balances[clientIndex] -= amount;
        return balances[clientIndex];


    }
}

