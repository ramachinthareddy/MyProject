import java.util.*;

public class PowerConsuption {
    public static int calculatePowerConsumption(List<Integer> appliances, List<String> switchStates) {
            int totalPowerConsumption = 0;

            for (int i = 0; i < appliances.size(); i++) {
                if (switchStates.get(i).equals("on")) {
                    totalPowerConsumption += appliances.get(i);
                }
            }

            return totalPowerConsumption;
        }

        public static void main(String[] args) {
            List<Integer> appliances = Arrays.asList(1, 2, 3);  // Power consumption values for FAN, Light, TV
            List<String> switchStates = Arrays.asList("on", "off", "on");  // Switch states for FAN, Light, TV

            int powerConsumption = calculatePowerConsumption(appliances, switchStates);
            System.out.println("Total power consumption: " + powerConsumption);

            // Sorting the devices by power consumption
            List<String> deviceNames = Arrays.asList("FAN", "Light", "TV");
            Map<String, Integer> devicePowerMap = new HashMap<>();

            for (int i = 0; i < deviceNames.size(); i++) {
                devicePowerMap.put(deviceNames.get(i), appliances.get(i));
            }

            List<Map.Entry<String, Integer>> sortedDevices = new ArrayList<>(devicePowerMap.entrySet());
            Collections.sort(sortedDevices, Comparator.comparingInt(Map.Entry::getValue));

            System.out.println("Devices sorted by power consumption:");
            for (Map.Entry<String, Integer> entry : sortedDevices) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " units");
            }
        }
    }

