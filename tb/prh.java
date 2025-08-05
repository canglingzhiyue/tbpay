package tb;

import android.content.Context;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes8.dex */
public class prh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1541388490);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf("../");
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static String a(Context context, String str) {
        String absolutePath;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && externalFilesDir != null) {
            absolutePath = externalFilesDir.getAbsolutePath();
        } else {
            absolutePath = context.getFilesDir().getAbsolutePath();
        }
        return absolutePath + File.separator + str;
    }
}
