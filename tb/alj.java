package tb;

import java.util.HashMap;

/* loaded from: classes.dex */
public class alj {

    /* renamed from: a  reason: collision with root package name */
    private ali f25421a;
    private b b;

    /* loaded from: classes.dex */
    private static final class a {
        public static final alj sInstance = new alj();
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private ali f25422a;

        private b() {
        }

        private b(ali aliVar) {
            this.f25422a = aliVar;
        }
    }

    private alj() {
    }

    private HashMap<String, String> a(HashMap<String, String> hashMap) {
        if (!alk.f25423a) {
            return hashMap;
        }
        if (hashMap == null) {
            return null;
        }
        try {
            return new HashMap<>(hashMap);
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }

    public static final alj a() {
        return a.sInstance;
    }

    public void a(String str) {
        ali aliVar = this.f25421a;
        if (aliVar == null) {
            return;
        }
        aliVar.a(str, (String) null);
    }

    public void a(String str, String str2) {
        a(str, str2, System.currentTimeMillis());
    }

    public void a(String str, String str2, long j) {
        ali aliVar = this.f25421a;
        if (aliVar == null) {
            return;
        }
        aliVar.a(str, str2, j);
    }

    public void a(String str, HashMap<String, String> hashMap) {
        ali aliVar = this.f25421a;
        if (aliVar == null) {
            return;
        }
        aliVar.a(str, a(hashMap));
    }

    public void a(ali aliVar) {
        if (this.f25421a == null) {
            this.f25421a = aliVar;
            this.b = new b(this.f25421a);
        }
    }

    public void b(String str, String str2) {
        ali aliVar = this.f25421a;
        if (aliVar == null) {
            return;
        }
        aliVar.a(str, str2);
    }

    public void b(String str, HashMap<String, String> hashMap) {
        ali aliVar = this.f25421a;
        if (aliVar == null) {
            return;
        }
        aliVar.b(str, a(hashMap));
    }
}
