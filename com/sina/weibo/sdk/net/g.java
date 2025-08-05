package com.sina.weibo.sdk.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes4.dex */
public final class g implements f {
    private int code;
    private InputStream p;

    static {
        kge.a(-1043497407);
        kge.a(-1043497408);
    }

    public g(int i, InputStream inputStream) {
        this.code = i;
        this.p = inputStream;
    }

    @Override // com.sina.weibo.sdk.net.f
    public final String f() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = this.p.read(bArr);
                if (read == -1) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream2;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            throw e;
        }
    }
}
