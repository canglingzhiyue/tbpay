package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.net.URL;

/* loaded from: classes7.dex */
public class kmx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static File f30175a;

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str}) : a(context, str, true);
    }

    public static String a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d00b83f6", new Object[]{context, str, new Boolean(z)});
        }
        File file = null;
        if (z) {
            if (f30175a == null) {
                f30175a = context.getExternalCacheDir();
            }
            file = f30175a;
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        File file2 = new File(file, File.separator + "downloadsdk" + File.separator + str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getAbsolutePath();
    }

    public static String a(kmo kmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c928795", new Object[]{kmoVar});
        }
        if (!TextUtils.isEmpty(kmoVar.d)) {
            return kmoVar.d;
        }
        try {
            return new File(new URL(kmoVar.f30167a).getFile()).getName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(String str, kmo kmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("855d1f0b", new Object[]{str, kmoVar});
        }
        String a2 = a(kmoVar);
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        File file = new File(str, a2);
        File file2 = new File(str, a2 + oyz.TEMP_POSTFIX);
        String absolutePath = file.getAbsolutePath();
        if (file.exists() && ((0 == kmoVar.b || kmoVar.b == file.length()) && kna.a(kmoVar.c, absolutePath))) {
            return file.getAbsolutePath();
        }
        if (!file2.exists() || (!(0 == kmoVar.b || kmoVar.b == file2.length()) || !kna.a(kmoVar.c, file2.getAbsolutePath()))) {
            return "";
        }
        file2.renameTo(file);
        return file.getAbsolutePath();
    }

    public static boolean a(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{file, file2})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        if (file2.exists() && !file2.delete()) {
            return false;
        }
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            return false;
        }
        if (!file2.getParentFile().canWrite()) {
            file2.getParentFile().setWritable(true);
        }
        if (file.renameTo(file2)) {
            return true;
        }
        kmv.d(f.f3394a, "mvFile", "rename fail", file.getName());
        return false;
    }

    public static long a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a979fd3", new Object[]{file})).longValue();
        }
        if (file != null && file.exists()) {
            return file.length();
        }
        return 0L;
    }
}
