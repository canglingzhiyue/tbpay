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
public abstract class bh {

    /* renamed from: a  reason: collision with root package name */
    bh f7678a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bh() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bh(bh bhVar) {
        this.f7678a = bhVar;
    }

    protected abstract byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException;

    public final byte[] b(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        bh bhVar = this.f7678a;
        if (bhVar != null) {
            bArr = bhVar.b(bArr);
        }
        return a(bArr);
    }
}
