package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.flowcustoms.afc.a;

/* loaded from: classes7.dex */
public abstract class mbn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";

    static {
        kge.a(-778233115);
    }

    public boolean a(Context context, a aVar, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62acc361", new Object[]{this, context, aVar, str, bundle})).booleanValue();
        }
        return false;
    }

    public static mbn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mbn) ipChange.ipc$dispatch("f07aec5", new Object[0]);
        }
        if (LauncherRuntime.m) {
            return new mbj();
        }
        return new mbk();
    }
}
