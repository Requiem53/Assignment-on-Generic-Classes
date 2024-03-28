package Map;

import java.util.ArrayList;

public class MyMap<Key, Value> {
    public ArrayList<Key> keys;
    public ArrayList<Value> values;

    public MyMap(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(Key key, Value value){
        if(keys.contains(key)){
            values.set(keys.indexOf(key), value);
        }else{
            keys.add(key);
            values.add(value);
        }
    }

    public Value get(Key key){
        if(keys.contains(key)){
            return values.get(keys.indexOf(key));
        }else {
            return null;
        }
    }

    public Value remove(Key key){
        if(keys.contains(key)){
            Value removed = values.get(keys.indexOf(key));
            values.remove(values.get(keys.indexOf(key)));
            keys.remove(key);
            return removed;
        }else {
            return null;
        }
    }
}
