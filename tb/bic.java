package tb;

import android.os.Environment;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class bic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f25920a;

    static {
        kge.a(-665488673);
        f25920a = 1048576L;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / f25920a;
    }
}
