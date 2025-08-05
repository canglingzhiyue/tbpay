package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;

/* loaded from: classes.dex */
public final class iyk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private iyk() {
    }

    public static void a(ClassLoader classLoader, File file) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77983af9", new Object[]{classLoader, file});
        } else if (!file.isDirectory()) {
            throw new RuntimeException("dir not available " + file);
        } else {
            iym.a(classLoader, file);
            RSoLog.c("SWSoLoaderCore, installDir finished, " + classLoader);
        }
    }
}
