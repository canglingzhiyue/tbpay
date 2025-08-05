package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;

/* loaded from: classes.dex */
public class jaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }
}
