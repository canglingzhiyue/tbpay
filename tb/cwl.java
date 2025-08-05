package tb;

import java.util.HashMap;

/* loaded from: classes4.dex */
public class cwl {

    /* renamed from: a  reason: collision with root package name */
    public int f26569a;
    public String b;
    public HashMap<String, String> c;

    static {
        kge.a(-188349132);
    }

    public int a() {
        return this.f26569a;
    }

    public void a(int i) {
        this.f26569a = i;
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(HashMap<String, String> hashMap) {
        this.c = hashMap;
    }

    public String b() {
        return this.b;
    }

    public HashMap<String, String> c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result{code='");
        sb.append(this.f26569a);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", item='");
        HashMap<String, String> hashMap = this.c;
        sb.append(hashMap != null ? hashMap.toString() : null);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
