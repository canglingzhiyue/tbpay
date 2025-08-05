package tb;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter;
import com.taobao.android.detail.ttdetail.utils.e;
import java.io.File;

/* loaded from: classes4.dex */
public class ecr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1430162324);
    }

    public static String a(Context context) {
        File externalFilesDir;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : (context == null || (externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)) == null) ? "" : externalFilesDir.getPath();
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        IAppAdapter a2 = epj.a();
        if (a2 != null) {
            return a2.getStatusBarHeight();
        }
        if (!emu.c()) {
            return 0;
        }
        return e.d();
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : a();
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        IAppAdapter a2 = epj.a();
        if (a2 == null) {
            return 0;
        }
        return a2.getsNavigtionBarHeight();
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        return Build.VERSION.SDK_INT >= 17 && c.a() >= 1000000 && !NetworkUtils.d(context).equals("2g");
    }
}
