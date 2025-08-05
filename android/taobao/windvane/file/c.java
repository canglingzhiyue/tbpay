package android.taobao.windvane.file;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f1613a;

    static {
        kge.a(-887443417);
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (!b(file)) {
            return false;
        }
        return file.delete();
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= b(file2);
                }
                if (!file2.delete()) {
                    m.d("WVFileUtils", "Failed to delete " + file2);
                    z = false;
                }
            }
        }
        return z;
    }

    public static Uri a(Context context, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("171c810e", new Object[]{context, file});
        }
        if (file != null && context != null) {
            try {
                if (context.getApplicationInfo().targetSdkVersion >= 24 && Build.VERSION.SDK_INT >= 24) {
                    String str = f1613a;
                    if (TextUtils.isEmpty(str)) {
                        str = context.getPackageName() + ".interactProvider";
                    }
                    return FileProvider.getUriForFile(context, str, file);
                }
                return Uri.fromFile(file);
            } catch (Throwable th) {
                m.d("WVUtils", "Failed to get file uri:" + th.getMessage());
            }
        }
        return null;
    }
}
