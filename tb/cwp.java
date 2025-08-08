package tb;

import mtopsdk.common.util.StringUtils;

/* loaded from: classes4.dex */
public class cwp {

    /* renamed from: a  reason: collision with root package name */
    private String f26571a;
    private String b;
    private String c;
    private String d;

    public String a() {
        return this.f26571a;
    }

    public void a(String str) {
        this.f26571a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.d = str;
    }

    public String d() {
        return this.d;
    }

    public boolean e() {
        return (!StringUtils.isEmpty(this.d) || !StringUtils.isEmpty(this.c)) && !StringUtils.isEmpty(this.f26571a);
    }

    public String toString() {
        return this.f26571a + "|" + this.c + "|" + this.d;
    }
}
