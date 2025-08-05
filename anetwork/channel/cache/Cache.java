package anetwork.channel.cache;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public interface Cache {
    void clear();

    Entry get(String str);

    void put(String str, Entry entry);

    void remove(String str);

    /* loaded from: classes.dex */
    public static class Entry implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map<String, List<String>> responseHeaders = Collections.EMPTY_MAP;
        public long serverDate;
        public long ttl;

        static {
            kge.a(619702933);
            kge.a(1028243835);
        }

        public boolean isFresh() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44a938af", new Object[]{this})).booleanValue() : System.currentTimeMillis() <= this.ttl;
        }
    }
}
