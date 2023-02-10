/*
 * Phase A krl2475 ah57984
 * Phase B <studentB EID><studentA EID>
 */

package pmap.phasea;
import java.util.ArrayList;
/**
 * PMap stands for Paired Map. A map is a collection of key-value
 * pairs, e.g., (1, 2) (2, 3) (3, 4) are all pairs with an integer key
 * and an integer value. See the
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">
 * java.util.Map documentation</a> for how these methods are supposed
 * to work.
 */
public class PMap {
    private ArrayList<PEntry> map;
    public PMap() {
        map = new ArrayList<PEntry>();
    }
    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
    public Integer size() {
        return map.size();
    }

    /**
     * Returns <tt>true</tt> if this map contains no key-value
     * mappings.
     *
     * @return <tt>true</tt> if this map contains no key-value
     *         mappings
     */
    public boolean isEmpty() {

        return map.isEmpty();
    }

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the
     * specified key.
     *
     * @param key key whose presence in this map is to be tested
     * @return <tt>true</tt> if this map contains a mapping for the
     *         specified key
     */
    public boolean containsKey(Integer key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == key) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value.
     *
     * @param value value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to the
     *         specified value
     */
    public boolean containsValue(Integer value) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getValue() == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the value to which the specified key is mapped, or
     * {@code null} if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or
     *         {@code null} if this map contains no mapping for the
     *         key
     */
    public Integer get(Integer key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == key) {
                return map.get(i).getValue();
            }
        }
        return null;
    }

    /**
     * Associates the specified value with the specified key in this
     * map (optional operation).  If the map previously contained a
     * mapping for the key, the old value is replaced by the specified
     * value.
     *
     * @param key key with which the specified value is to be
     *        associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer put(Integer key, Integer value) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == key) {
                Integer ret = map.get(i).getValue();
                map.get(i).setValue(value);
                return ret;
            }
        }
        return null;
    }

    /**
     * Removes the mapping for a key from this map if it is present
     * (optional operation).
     *
     * <p>Returns the value to which this map previously associated
     * the key, or <tt>null</tt> if the map contained no mapping for
     * the key.
     *
     * <p>The map will not contain a mapping for the specified key
     * once the call returns.
     *
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer remove(Integer key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == key) {
                int ret = map.get(i).getValue();
                map.remove(i);
                return ret;
            }
        }
        return null;
    }

    /**
     * Put all of the mappings from a pair of arrays to this map. Each
     * pair of elements sharing the same index in <tt>keys</tt> and
     * <tt>values</tt> composes a mapping to be stored the map.
     *
     * @param keys the array of keys to be stored in this map
     * @param values the array of values to be stored in this map
     */
    public void putAll(Integer[] keys, Integer[] values) {
        for (int i = 0; i < keys.length; i++) {
            PEntry temp = new PEntry(keys[i], values[i]);
            map.add(temp);
        }
    }

    /**
     * Removes all of the mappings from this map. The map will be
     * empty after this call returns.
     */
    public void clear() {
        map.clear();
        return;
    }

    /**
     * Returns an array of the keys contained in this map.
     *
     * @return an array of the keys contained in this map
     */
    public Integer[] keySet() {
        Integer[] ret = new Integer[map.size()];
        for (int i = 0; i < map.size(); i++) {
            ret[i] = map.get(i).getKey();
        }
        return ret;
    }

    /**
     * Returns an array of the values contained in this map.
     *
     * @return an array of the values contained in this map
     */
    public Integer[] values() {
        Integer[] ret = new Integer[map.size()];
        for (int i = 0; i < map.size(); i++) {
            ret[i] = map.get(i).getValue();
        }
        return ret;
    }

    /**
     * Returns an array of the mappings contained in this map.
     *
     * @return an array of the mappings contained in this map
     */
    public PEntry[] entrySet() {
        PEntry[] ret = new PEntry[map.size()];
        for (int i = 0; i < map.size(); i++) {
            PEntry temp = new PEntry(map.get(i).getKey(), map.get(i).getValue());
            ret[i] = temp;
        }
        return ret;
    }
}
