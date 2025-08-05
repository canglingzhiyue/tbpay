package com.loc;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class bm implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7687a = Charset.forName(EncodingUtils.US_ASCII);
    private final InputStream b;
    private final Charset c;
    private byte[] d;
    private int e;
    private int f;

    public bm(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private bm(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        }
        if (!charset.equals(f7687a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.b = inputStream;
        this.c = charset;
        this.d = new byte[8192];
    }

    private void b() throws IOException {
        InputStream inputStream = this.b;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.e = 0;
            this.f = read;
            return;
        }
        throw new EOFException();
    }

    public final String a() throws IOException {
        int i;
        int i2;
        synchronized (this.b) {
            if (this.d != null) {
                if (this.e >= this.f) {
                    b();
                }
                for (int i3 = this.e; i3 != this.f; i3++) {
                    if (this.d[i3] == 10) {
                        if (i3 != this.e) {
                            i2 = i3 - 1;
                            if (this.d[i2] == 13) {
                                String str = new String(this.d, this.e, i2 - this.e, this.c.name());
                                this.e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.d, this.e, i2 - this.e, this.c.name());
                        this.e = i3 + 1;
                        return str2;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f - this.e) + 80) { // from class: com.loc.bm.1
                    @Override // java.io.ByteArrayOutputStream
                    public final String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, bm.this.c.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1: while (true) {
                    byteArrayOutputStream.write(this.d, this.e, this.f - this.e);
                    this.f = -1;
                    b();
                    i = this.e;
                    while (i != this.f) {
                        if (this.d[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                if (i != this.e) {
                    byteArrayOutputStream.write(this.d, this.e, i - this.e);
                }
                this.e = i + 1;
                return byteArrayOutputStream.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.b) {
            if (this.d != null) {
                this.d = null;
                this.b.close();
            }
        }
    }
}
