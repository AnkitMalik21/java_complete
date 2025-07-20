package Collection_framework.Map;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing
        // ordinal/index is used
        // FASTER THAN HASHMAP
        // MEMORY EFFICIENT

       /*

        Specialized Map for keys of enum type only.

        Part of java.util package.
        Declaration:
        EnumMap<EnumType, ValueType> map = new EnumMap<>(EnumType.class);
        Faster and more memory-efficient than HashMap when using enum keys.

        Maintains natural order of enum constants (based on their declaration).
        Internally backed by arrays, making access fast.
        Null keys not allowed – will throw NullPointerException.

        Null values are allowed.
        Not thread-safe → use Collections.synchronizedMap() if needed in multi-threaded code.
        Useful when enum constants are known and fixed, like days of week, states, roles, etc.
        Iterating over keys gives them in enum declaration order, not insertion order.
        Offers typical Map methods: put(), get(), remove(), containsKey(), etc.
        Efficient for lookup tables, state machines, or configurations based on enums.
        Can be serialized and cloned.

        */

        Map<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"gym");
        map.put(Day.MONDAY, "Walk");
        String s = map.get(Day.TUESDAY);
        System.out.println(map);
    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}