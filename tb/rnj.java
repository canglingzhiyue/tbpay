package tb;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* loaded from: classes9.dex */
public class rnj {

    /* renamed from: a  reason: collision with root package name */
    private SSLContext f33238a = null;
    private String b;

    public rnj(String str) {
        this.b = str;
    }

    private static SSLContext a(String str) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new rnk(str)}, null);
            return sSLContext;
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public final SSLContext a() {
        if (this.f33238a == null) {
            this.f33238a = a(this.b);
        }
        return this.f33238a;
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass().equals(rnj.class);
    }

    public int hashCode() {
        return rnj.class.hashCode();
    }
}
