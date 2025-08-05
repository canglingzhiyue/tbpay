package tb;

import java.util.HashMap;
import mtopsdk.mtop.global.MtopConfig;

/* loaded from: classes.dex */
public interface ryv {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33429a;
        public String b;

        static {
            kge.a(-1221782854);
        }

        public a(int i, String str) {
            this.f33429a = i;
            this.b = str;
        }
    }

    String a(String str, String str2);

    String a(String str, String str2, int i);

    String a(String str, String str2, String str3, HashMap<String, String> hashMap, int i);

    String a(HashMap<String, String> hashMap, String str, String str2);

    String a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2);

    String a(a aVar);

    HashMap<String, String> a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str, String str2, boolean z, String str3);

    void a(MtopConfig mtopConfig);

    String b(HashMap<String, String> hashMap, String str);
}
