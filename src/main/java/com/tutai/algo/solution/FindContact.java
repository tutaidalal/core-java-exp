import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    
    static class DictionaryNode {
    DictionaryNode[] children = new DictionaryNode[26];
    public int size = 0;

    public void putChildIfAbsent(char ch) {
        if (children[ch-'a'] == null) {
           children[ch-'a'] = new DictionaryNode(); 
        }
    }

    public DictionaryNode getChild(char ch) {
        return children[ch-'a'];
    }
}

static class Dictionary {
    DictionaryNode root = new DictionaryNode();
    
    public void add(String str) {
        DictionaryNode curr = root;
        for (char ch : str.toCharArray()) {
            curr.putChildIfAbsent(ch);
            curr = curr.getChild(ch);
            curr.size++;
        }
    }
    
    public int find(String prefix) {
        DictionaryNode curr = root;
        
        for (char ch : prefix.toCharArray()) {
            curr = curr.getChild(ch);
            if (curr == null) {
                return 0;
            }
        }
        return curr.size;
    }
}

    /*
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */

    public static List<Integer> contacts(List<List<String>> queries) {
    // Write your code here
        List<Integer> result = new LinkedList<Integer>();
 

        Dictionary tire = new Dictionary();
        
        
        for (List<String> query : queries) {
            String nameValue = query.get(1);
            if (query.get(0).equals("add")) {
                tire.add(nameValue);
            } else {
                                
                int count = tire.find(nameValue);
                result.add(count); 
               
            }
        }
        return result;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> queries = new ArrayList<>();

        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.contacts(queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
