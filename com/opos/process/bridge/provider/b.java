package com.opos.process.bridge.provider;

import com.opos.process.bridge.provider.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object>> f8109a;

    /* loaded from: classes4.dex */
    public static class a extends ThreadLocal<Map<String, Object>> {
        static {
            kge.a(-353212437);
        }

        @Override // java.lang.ThreadLocal
        public Map<String, Object> initialValue() {
            return new HashMap<String, Object>(8) { // from class: com.opos.process.bridge.provider.ThreadLocalUtil$MapThreadLocal$1
                public static final long serialVersionUID = 3637958959138295593L;

                {
                    b.a.this = this;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public Object put(String str, Object obj) {
                    return super.put((ThreadLocalUtil$MapThreadLocal$1) str, (String) obj);
                }
            };
        }
    }

    static {
        kge.a(1894602414);
        f8109a = new a();
    }

    public static void a(Map<String, Object> map) {
        for (String str : map.keySet()) {
            f8109a.get().put(str, map.get(str));
        }
    }

    public static void a(Set<String> set) {
        for (String str : set) {
            f8109a.get().remove(str);
        }
    }
}
