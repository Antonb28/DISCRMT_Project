public class Areas {

    public static String Area(int x, int y) {
        String[][] area = new String[][]{
                {"San Nicolas", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Santa Cruz", "Santa Cruz"},
                {"San Nicolas", "San Nicolas", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz"},
                {"Port Area","San Nicolas","San Nicolas","San Nicolas", "San Nicolas","San Nicolas", "San Nicolas", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo", "Tondo","Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz"},
                {"Port Area","Port Area","Port Area","San Nicolas","San Nicolas","San Nicolas","San Nicolas","Binondo","Binondo","Tondo", "Tondo", "Tondo", "Tondo","Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz"},
                {"Port Area","Port Area","Intramuros","San Nicolas","San Nicolas","San Nicolas","Binondo","Binondo","Binondo","Tondo","Tondo", "Tondo","Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz","Sampaloc","Sampaloc","Sampaloc"},
                {"Port Area","Port Area","Intramuros","Intramuros","San Nicolas","Binondo","Binondo","Binondo","Binondo","Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Port Area","Port Area","Intramuros","Intramuros","Intramuros","Binondo","Binondo","Santa Cruz", "Santa Cruz", "Santa Cruz","Santa Cruz", "Santa Cruz", "Santa Cruz","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Port Area","Port Area","Intramuros","Intramuros","Intramuros","Intramuros","Binondo","Binondo","Santa Cruz","Santa Cruz","Santa Cruz","Santa Cruz","Santa Cruz","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Port Area","Intramuros","Intramuros","Intramuros","Intramuros","Ermita","Ermita","Santa Cruz","Santa Cruz","Santa Cruz","Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz","Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz", "Santa Cruz"},
                {"Port Area","Intramuros","Intramuros","Intramuros","Intramuros","Ermita","Ermita","Quiapo","Quiapo","Quiapo","Quiapo","Quiapo","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Intramuros","Intramuros","Intramuros","Intramuros","Intramuros","Ermita","Ermita","San Miguel","Quiapo","Quiapo","Quiapo","Quiapo","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Ermita","Ermita","Ermita","Ermita","Ermita","Ermita","San Miguel","San Miguel","Quiapo","Quiapo","Quiapo","San Miguel","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Ermita","Ermita","Ermita","Ermita","Ermita","Ermita","San Miguel","San Miguel","Quiapo","San Miguel","San Miguel","San Miguel","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Ermita","Ermita","Ermita","Ermita","Ermita","Paco","San Miguel","San Miguel","San Miguel","San Miguel","San Miguel","San Miguel","San Miguel","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Ermita","Ermita","Ermita","Ermita","Paco","Paco","Paco","Paco","Paco","San Miguel","San Miguel","San Miguel","San Miguel","Sta Mesa","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Ermita","Ermita","Ermita","Paco","Paco","Paco","Paco","Paco","Paco","Paco","Paco","Paco","San Miguel","Sta Mesa","Sta Mesa","Sampaloc","Sampaloc","Sampaloc","Sampaloc","Sampaloc"},
                {"Malate","Malate","Ermita","Paco","Paco","Paco","Paco","Paco","Pandacan","Paco","Paco","Paco","Pandacan","Pandacan","Sta Mesa","Sta Mesa","Sta Mesa","Sampaloc","Sampaloc","Sampaloc"},
                {"Malate","Malate","Ermita","Paco","Paco","Paco","Paco","Paco","Pandacan","Paco","Paco","Paco","Pandacan","Pandacan","Sta Mesa","Sta Mesa","Sta Mesa","Sampaloc","Sampaloc","Sampaloc"},
                {"Malate","Malate","Malate","Paco","Paco","Paco","Paco","Paco","Pandacan","Pandacan","Pandacan","Pandacan","Pandacan","Pandacan","Pandacan","Sta Mesa","Sta Mesa","Sta Mesa","Sampaloc","Sampaloc"},
                {"Malate","Malate","Malate","Paco","Paco","Paco","Paco","Pandacan","Pandacan","Pandacan","Sta Ana","Sta Ana","Pandacan","Pandacan","Pandacan","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa"},
                {"Malate","Malate","Malate","Paco","Paco","Paco","Paco","Paco","Pandacan","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Pandacan","Pandacan","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa"},
                {"Malate","Malate","Malate","Malate","Paco","Paco","Paco","Paco","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Pandacan","Pandacan","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa"},
                {"Malate","Malate","San Andres","San Andres","San Andres","San Andres","San Andres","San Andres","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa"},
                {"San Andres","San Andres","San Andres","San Andres","San Andres","San Andres","San Andres","San Andres","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa"},
                {"San Andres","San Andres","San Andres","San Andres","San Andres","San Andres","San Andres","San Andres","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Ana","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa","Sta Mesa"},
            };
        return area[x][y];
    }

}
