package tb;

import android.content.Context;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class izh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f29424a;

    static {
        kge.a(-386723985);
    }

    public static void a(Context context) {
        String absolutePath;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.exists()) {
                absolutePath = externalCacheDir.getAbsolutePath();
            } else {
                absolutePath = context.getCacheDir().getAbsolutePath();
            }
        } else {
            absolutePath = context.getCacheDir().getAbsolutePath();
        }
        if (!StringUtils.isEmpty(absolutePath) && !absolutePath.endsWith(File.separator)) {
            absolutePath = absolutePath + File.separator;
        }
        f29424a = absolutePath + "taopai" + File.separator + "charge_file";
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f29424a;
    }
}
