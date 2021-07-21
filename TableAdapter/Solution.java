package com.javarush.task.task19.task1901;

/* 
TableAdapter
*/

public class Solution {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {
        @Override
       public String getHeaderText(){
           return String.format("[%s] : %s",aTable.getCurrentUserName(),aTable.getTableName());
       }
        
        private ATable aTable;
       public TableAdapter(ATable aTable){
           this.aTable = aTable;
       }

    }

    public static interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public static interface BTable {
        String getHeaderText();
    }
}