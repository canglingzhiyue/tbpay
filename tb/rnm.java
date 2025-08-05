package tb;

import java.net.URL;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class rnm {
    private String b;
    private String e;

    /* renamed from: a  reason: collision with root package name */
    private int f33241a = 0;
    private HashMap c = null;
    private byte[] d = null;

    public rnm(String str) {
        this.b = str;
    }

    public rnm(String str, byte b) {
        this.b = str;
    }

    public final URL a() {
        try {
            return new URL(this.b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(String str) {
        if (str != null) {
            this.d = str.getBytes();
            this.e = str;
        }
    }

    public final String b() {
        return this.f33241a == 1 ? "POST" : "GET";
    }

    public final void b(String str) {
        this.b = str;
    }

    public final String c() {
        return this.e;
    }

    public final HashMap d() {
        return this.c;
    }
}
