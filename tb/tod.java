package tb;

import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes9.dex */
public class tod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public File f34239a;
    private tof b;

    static {
        kge.a(-1574485964);
    }

    private tod() {
        this.f34239a = null;
        this.b = new tof();
    }

    public tod(byte[] bArr) {
        this();
        a(bArr);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String stringBuffer = this.b.f34241a.toString();
        if (this.b.o == null || this.b.o.toString().equals("")) {
            return stringBuffer;
        }
        return this.b.o.toString() + "/" + stringBuffer;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b.e;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        File file = this.f34239a;
        if (file != null) {
            return file.isDirectory();
        }
        tof tofVar = this.b;
        return tofVar != null && (tofVar.h == 53 || this.b.f34241a.toString().endsWith("/"));
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        this.b.f34241a = tof.a(bArr, 0, 100);
        this.b.b = (int) toc.a(bArr, 100, 8);
        this.b.c = (int) toc.a(bArr, 108, 8);
        this.b.d = (int) toc.a(bArr, 116, 8);
        this.b.e = toc.a(bArr, 124, 12);
        this.b.f = toc.a(bArr, 136, 12);
        this.b.g = (int) toc.a(bArr, 148, 8);
        tof tofVar = this.b;
        tofVar.h = bArr[156];
        tofVar.i = tof.a(bArr, 157, 100);
        this.b.j = tof.a(bArr, 257, 8);
        this.b.k = tof.a(bArr, 265, 32);
        this.b.l = tof.a(bArr, Result.ALIPAY_TEE_GET_USERNAME_FILED, 32);
        this.b.m = (int) toc.a(bArr, 329, 8);
        this.b.n = (int) toc.a(bArr, 337, 8);
        this.b.o = tof.a(bArr, 345, tof.USTAR_FILENAME_PREFIX);
    }
}
