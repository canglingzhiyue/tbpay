package com.loc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class cc extends ci {

    /* renamed from: a  reason: collision with root package name */
    ByteArrayOutputStream f7717a;

    public cc() {
        this.f7717a = new ByteArrayOutputStream();
    }

    public cc(ci ciVar) {
        super(ciVar);
        this.f7717a = new ByteArrayOutputStream();
    }

    @Override // com.loc.ci
    protected final byte[] a(byte[] bArr) {
        byte[] byteArray = this.f7717a.toByteArray();
        try {
            this.f7717a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f7717a = new ByteArrayOutputStream();
        return byteArray;
    }

    @Override // com.loc.ci
    public final void b(byte[] bArr) {
        try {
            this.f7717a.write(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
