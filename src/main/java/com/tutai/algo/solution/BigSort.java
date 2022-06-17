public static List<String> bigSorting(List<String> unsorted) {
    // Write your code here
    
        Comparator comparator = new Comparator<String>() {
            public int compare(String a, String b)
            {
        
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                } else {
                    return a.compareTo(b);
                }
            }
        };
        
        Collections.sort(unsorted, comparator);
        return unsorted;

    }
