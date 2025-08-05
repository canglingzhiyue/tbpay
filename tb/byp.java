package tb;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class byp {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f26183a = new HashMap();

    /* loaded from: classes.dex */
    public static class a {
        private final String c;
        private final String d;

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, StringBuilder> f26184a = new HashMap();
        private int b = 0;
        private int e = 0;

        static {
            kge.a(265456594);
        }

        public a(String str, String str2) {
            this.c = str;
            this.d = str2;
        }

        public int a() {
            return this.b;
        }

        public void a(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException();
            }
            StringBuilder sb = this.f26184a.get(str);
            if (sb == null) {
                this.f26184a.put(str, new StringBuilder(str2));
            } else {
                sb.append((char) 1);
                sb.append(str2);
            }
            this.b += str2.length();
            this.e++;
        }

        public Map<String, String> b() {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, StringBuilder> entry : this.f26184a.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return hashMap;
        }

        public String c() {
            return this.c;
        }

        public int d() {
            return this.e;
        }

        public String e() {
            return this.d;
        }
    }

    static {
        kge.a(99784775);
    }

    public Map<String, a> a() {
        return this.f26183a;
    }

    public a a(String str, String str2) {
        String str3 = str + str2;
        a aVar = this.f26183a.get(str3);
        if (aVar == null) {
            a aVar2 = new a(str, str2);
            this.f26183a.put(str3, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public a b(String str, String str2) {
        return this.f26183a.remove(str + str2);
    }

    public void b() {
        this.f26183a.clear();
    }
}
