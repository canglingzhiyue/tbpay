package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes7.dex */
public class mqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
            return;
        }
        try {
            b(closeable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void b(Closeable closeable) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efac0e2", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            closeable.close();
        }
    }
}
