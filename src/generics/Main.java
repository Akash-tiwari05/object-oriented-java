package generics;

interface Player {

    String name();
    String position();
}

record BaseballPlayer (String name, String position)implements Player {

}

record FootballPlayer (String name, String position)implements Player {

}

public class Main {

    public static void main(String[] args) {

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Huston astros");
        setScore(phillies1,3, astros1, 5);

        SportsTeam phillies = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros = new SportsTeam("Huston astros");
        setScore(phillies,3, astros, 5);

        var harper = new BaseballPlayer("Harper", "Right Fielder");
        var marsh = new BaseballPlayer("Marah", "Right Fielder");

        SportsTeam afc = new SportsTeam("Adelaide Crow");
        var rex = new FootballPlayer("Rex","Striker");
        afc.addTeamMember(rex);

        //baseball player add in football team
        var matrix = new BaseballPlayer("Matrix", "Striker");
        afc.addTeamMember(matrix);
        afc.listTeamMembers();

        Team<BaseballPlayer> phillies3 = new Team<>("Philadelphia Phillies");
        Team<BaseballPlayer> astros3 = new Team<>("Huston astros");
        System.out.println("_".repeat(50));
        System.out.println("Team");
        setScore(phillies3,3, astros3, 5);

        Team<FootballPlayer> afc2 = new Team<>("Adelaide Crow");
        var rex2 = new FootballPlayer("Rex","Striker");
        //var matrix2 = new BaseballPlayer("Matrix", "Striker");
        //afc2.addTeamMember(matrix2); here check at compile time
        afc2.addTeamMember(rex2);
        afc2.listTeamMembers();
        System.out.println("_".repeat(50));

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();
    }


    public static void setScore(BaseballTeam team1, int t1_score,
                                BaseballTeam team2, int t2_score){

        String message =  team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

    public static void setScore(SportsTeam team1, int t1_score,
                                SportsTeam team2, int t2_score){

        String message =  team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }
    public static void setScore(Team team1, int t1_score,
                                Team team2, int t2_score){

        String message =  team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

}
