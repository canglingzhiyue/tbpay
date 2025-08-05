package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public class kf extends ki {

    /* renamed from: a  reason: collision with root package name */
    protected InputStream f24592a;

    /* renamed from: a  reason: collision with other field name */
    protected OutputStream f844a;

    protected kf() {
        this.f24592a = null;
        this.f844a = null;
    }

    public kf(OutputStream outputStream) {
        this.f24592a = null;
        this.f844a = null;
        this.f844a = outputStream;
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a */
    public int mo2209a(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.f24592a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i, i2);
                if (read < 0) {
                    throw new kj(4);
                }
                return read;
            } catch (IOException e) {
                throw new kj(0, e);
            }
        }
        throw new kj(1, "Cannot read from null inputStream");
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a  reason: collision with other method in class */
    public void mo2209a(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.f844a;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
                return;
            } catch (IOException e) {
                throw new kj(0, e);
            }
        }
        throw new kj(1, "Cannot write to null outputStream");
    }
}
