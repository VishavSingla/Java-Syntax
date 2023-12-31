double d = 3.14;
int i = (int)d;

String str = "123";
int num = Integer.parseInt(str);

String str = String.valueOf(num);
or
String str = Integer.toString(num);
or
int num = 98765;
String str = "" + num;

//StringBuilder and StringBuffer:
StringBuilder sb = new StringBuilder();
sb.append("Hello").append(" ").append("World!");
String result = sb.toString();

StringBuilder sb = new StringBuilder("Hello");
sb.append(" ").append("World!").append(55);
sb.insert(4, "beautiful ");
sb.delete(7, 16);
sb.replace(7, 11, "wonderful");
sb.reverse();
String result = sb.toString();

//
System.out.printf("Name: %s, Age: %d%n", name, age);


//Array space separated input
Scanner scanner = new Scanner(System.in);
System.out.print("Enter numbers separated by spaces: ");
String input = scanner.nextLine();

String[] numbersStr = input.split(" ");

int[] numbers = new int[numbersStr.length];
for (int i = 0; i < numbersStr.length; i++) {
    numbers[i] = Integer.parseInt(numbersStr[i]);
}

OR//

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}

//MAP
map.put(key, value);
map.get(key);
map.containsKey(key);
map.containsValue(value);
map.remove(key);
map.size();
map.isEmpty();
map.clear();

for (String key : map.keySet()) { 
  System.out.println(key + " -> " + map.get(key));
 }
for (Integer value : map.values()) { 
  System.out.println(value);
}
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

//SET
set.add(element);
set.contains(element);
set.remove(element);
set.size();
set.isEmpty();
set.clear();

Set<String> set = ...;
for (String element : set) {
    System.out.println(element);
}
