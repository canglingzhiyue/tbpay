package com.loc;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes4.dex */
public final class ce extends ci {

    /* renamed from: a  reason: collision with root package name */
    private Context f7719a;
    private String b;
    private bh e;
    private Object[] f;

    public ce(Context context, ci ciVar, bh bhVar, String str, Object... objArr) {
        super(ciVar);
        this.f7719a = context;
        this.b = str;
        this.e = bhVar;
        this.f = objArr;
    }

    private String b() {
        try {
            return String.format(x.c(this.b), this.f);
        } catch (Throwable th) {
            th.printStackTrace();
            av.b(th, "ofm", "gpj");
            return "";
        }
    }

    @Override // com.loc.ci
    protected final byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        String a2 = x.a(bArr);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String a3 = x.a(this.e.b(x.a(b())));
        return x.a("{\"pinfo\":\"" + a3 + "\",\"els\":[" + a2 + "]}");
    }
}
