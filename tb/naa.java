package tb;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface naa {
    Map<String, List<String>> a();

    void a(int i);

    void a(String str) throws IOException;

    void a(String str, String str2);

    void a(Map<String, String> map);

    void a(boolean z);

    void a(byte[] bArr) throws IOException;

    int b() throws IOException;

    void b(String str) throws ProtocolException;

    String c() throws IOException;

    void d() throws IOException;

    void e();

    void f();
}
