package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes9.dex */
public interface d extends ReadableByteChannel, m {
    int a(f fVar) throws IOException;

    long a(ByteString byteString) throws IOException;

    long a(l lVar) throws IOException;

    String a(long j, Charset charset) throws IOException;

    void a(long j) throws IOException;

    long b(ByteString byteString) throws IOException;

    @Deprecated
    b b();

    boolean b(long j) throws IOException;

    boolean c() throws IOException;

    ByteString d(long j) throws IOException;

    d d();

    InputStream e();

    byte g() throws IOException;

    void g(long j) throws IOException;

    int j() throws IOException;

    long k() throws IOException;
}
