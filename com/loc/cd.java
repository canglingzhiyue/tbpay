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
public final class cd extends ci {

    /* renamed from: a  reason: collision with root package name */
    private bh f7718a;

    public cd() {
        this.f7718a = new bj();
    }

    public cd(ci ciVar) {
        super(ciVar);
        this.f7718a = new bj();
    }

    @Override // com.loc.ci
    protected final byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        return this.f7718a.b(bArr);
    }
}
