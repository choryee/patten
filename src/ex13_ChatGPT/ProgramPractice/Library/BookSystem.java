package ex13_ChatGPT.ProgramPractice.Library;


import java.util.*;

public class BookSystem<T extends Enum<T>> {
    private Map<T, Book> map;
    private List<Map<T, Book>> lists;

    BookSystem(){
        map=new HashMap<>();
        lists=new ArrayList<>();
    }

    public void addList(Map<T, Book> bookMap){
        lists.add(bookMap);
    }

    public List<Map<T, Book>> show(){
        for(int i=0; i<lists.size(); i++){
            System.out.println(lists.get(i));
        }
        return lists;
    }

    public void remove(Map<T, Book> bookMap){
        lists.remove(bookMap);
    }

    public Set getKey(){
        Set set=new HashSet();
        for(int i=0; i<lists.size();i++){
           set= lists.get(i).keySet();
        }
        return set; // [NOVEL, SCIENCE]
    }

}
