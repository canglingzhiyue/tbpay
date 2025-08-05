package tb;

import android.content.Context;
import com.alibaba.security.realidentity.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.utils.a;
import java.io.File;

/* loaded from: classes6.dex */
public class huj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            File file = new File(context.getFilesDir(), "lib/numpy");
            if (!file.exists()) {
                return;
            }
            a(file);
        }
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        try {
            if (!file.isFile() && file.list().length != 0) {
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
            file.delete();
            return true;
        } catch (Throwable th) {
            a.a(f.f3394a, "deleteAll failed", th);
            return false;
        }
    }
}
