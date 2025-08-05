package okio;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes9.dex */
public interface c extends WritableByteChannel, l {
    c b(String str) throws IOException;

    c b(String str, int i, int i2) throws IOException;

    c c(byte[] bArr) throws IOException;

    c e(int i) throws IOException;

    void flush() throws IOException;
}
