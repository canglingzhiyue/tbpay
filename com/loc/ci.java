package com.loc;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes4.dex */
public abstract class ci {
    ci c;
    byte[] d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ci() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ci(ci ciVar) {
        this.c = ciVar;
    }

    public final byte[] a() throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        byte[] a2 = a(this.d);
        ci ciVar = this.c;
        if (ciVar != null) {
            ciVar.d = a2;
            return ciVar.a();
        }
        return a2;
    }

    protected abstract byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException;

    public void b(byte[] bArr) {
    }
}
