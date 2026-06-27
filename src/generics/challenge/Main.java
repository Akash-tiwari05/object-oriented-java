package generics.challenge;

public class Main {

    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park( "Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park( "Yosemite", "37.8855, -119.5360")
        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        System.out.println("_".repeat(50));
        parkLayer.renderLayer();

        System.out.println("_".repeat(50));

        var majorUSRivers = new River[]{
                new River("Mississippi", "47.2160, -95.2348",
                        "29.1566, -89.2495", "35.1556, -90.0659"),
                new River("Missouri", "45.9239, -111.4983",
                        "38.8146, -90.1218")
        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        System.out.println("_".repeat(50));
        riverLayer.renderLayer();

        System.out.println("_".repeat(50));
        riverLayer.addElements(
                new River("Colorado", "40.4705, -105.8286",
                        "31.8152, -114.8105", "36.0544, -112.1401"),
                new River("Ohio", "40.4417, -80.0128",
                        "36.9867, -89.1306", "39.1031, -84.5120")
        );
        riverLayer.renderLayer();
        System.out.println("_".repeat(50));
    }
}
