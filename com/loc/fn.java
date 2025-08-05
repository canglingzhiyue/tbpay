package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class fn extends bp {
    Map<String, String> d;
    String e;
    String f;
    byte[] g;
    byte[] h;
    boolean i;
    String j;
    Map<String, String> k;
    boolean p;
    private String q;

    public fn(Context context, w wVar) {
        super(context, wVar);
        this.d = null;
        this.q = "";
        this.e = "";
        this.f = "";
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = null;
        this.p = false;
    }

    @Override // com.loc.bt
    public final Map<String, String> a() {
        return this.d;
    }

    public final void a(Map<String, String> map) {
        this.k = map;
    }

    @Override // com.loc.bp
    public final byte[] a_() {
        return this.g;
    }

    @Override // com.loc.bt
    public final String b() {
        return this.e;
    }

    public final void b(String str) {
        this.j = str;
    }

    public final void b(Map<String, String> map) {
        this.d = map;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final void b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            if (bArr != null) {
                try {
                    byteArrayOutputStream2.write(a(bArr));
                    byteArrayOutputStream2.write(bArr);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        th.printStackTrace();
                        if (byteArrayOutputStream == null) {
                            return;
                        }
                        try {
                            byteArrayOutputStream.close();
                            return;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return;
                        }
                    } catch (Throwable th2) {
                        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                        if (byteArrayOutputStream3 != null) {
                            try {
                                byteArrayOutputStream3.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            }
            this.h = byteArrayOutputStream2.toByteArray();
            try {
                byteArrayOutputStream2.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.loc.bp
    public final byte[] b_() {
        return this.h;
    }

    @Override // com.loc.r, com.loc.bt
    public final String c() {
        return this.f;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void c(boolean z) {
        this.p = z;
    }

    public final void c(byte[] bArr) {
        this.g = bArr;
    }

    @Override // com.loc.bt
    public final String c_() {
        return MspEventTypes.ACTION_INVOKE_LOC;
    }

    public final void d(String str) {
        this.f = str;
    }

    @Override // com.loc.bp, com.loc.bt
    public final Map<String, String> e() {
        return this.k;
    }

    public final void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.q = str;
        } else {
            this.q = "";
        }
    }

    @Override // com.loc.bt
    public final String g() {
        return this.q;
    }

    @Override // com.loc.bp
    public final boolean i() {
        return this.i;
    }

    @Override // com.loc.bp
    public final String j() {
        return this.j;
    }

    @Override // com.loc.bp
    protected final boolean k() {
        return this.p;
    }
}
