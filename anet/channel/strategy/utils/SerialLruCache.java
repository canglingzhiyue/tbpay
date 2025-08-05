package anet.channel.strategy.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class SerialLruCache<K, V> extends LinkedHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_CACHE_SIZE = 256;
    private static final long serialVersionUID = -4331642331292721006L;
    private int cacheSize;

    static {
        kge.a(-34140350);
    }

    public boolean entryRemoved(Map.Entry<K, V> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d28ca266", new Object[]{this, entry})).booleanValue();
        }
        return true;
    }

    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap, int i) {
        super(linkedHashMap);
        this.cacheSize = i;
    }

    @Deprecated
    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap) {
        this(linkedHashMap, 256);
    }

    public SerialLruCache(int i) {
        super(i + 1, 1.0f, true);
        this.cacheSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
        }
        if (size() <= this.cacheSize) {
            return false;
        }
        return entryRemoved(entry);
    }
}
