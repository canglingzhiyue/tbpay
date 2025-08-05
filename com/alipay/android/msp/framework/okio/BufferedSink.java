package com.alipay.android.msp.framework.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface BufferedSink extends Sink {
    Buffer buffer();

    /* renamed from: emitCompleteSegments */
    BufferedSink mo524emitCompleteSegments() throws IOException;

    OutputStream outputStream();

    /* renamed from: write */
    BufferedSink mo525write(ByteString byteString) throws IOException;

    /* renamed from: write */
    BufferedSink mo526write(byte[] bArr) throws IOException;

    /* renamed from: write */
    BufferedSink mo527write(byte[] bArr, int i, int i2) throws IOException;

    long writeAll(Source source) throws IOException;

    /* renamed from: writeByte */
    BufferedSink mo528writeByte(int i) throws IOException;

    /* renamed from: writeInt */
    BufferedSink mo529writeInt(int i) throws IOException;

    /* renamed from: writeIntLe */
    BufferedSink mo530writeIntLe(int i) throws IOException;

    /* renamed from: writeLong */
    BufferedSink mo531writeLong(long j) throws IOException;

    /* renamed from: writeLongLe */
    BufferedSink mo532writeLongLe(long j) throws IOException;

    /* renamed from: writeShort */
    BufferedSink mo533writeShort(int i) throws IOException;

    /* renamed from: writeShortLe */
    BufferedSink mo534writeShortLe(int i) throws IOException;

    /* renamed from: writeString */
    BufferedSink mo535writeString(String str, Charset charset) throws IOException;

    /* renamed from: writeUtf8 */
    BufferedSink mo536writeUtf8(String str) throws IOException;
}
