package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.flowcustoms.afc.a;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.tao.BaseActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class mbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Activity> f31019a;

    static {
        kge.a(-309859578);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        WeakReference<Activity> weakReference = f31019a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        c.a("linkx", "TbNavCenter === closeOpenActivity === openActivity =" + f31019a.get().getClass());
        Activity activity = f31019a.get();
        if (activity != null) {
            boolean a2 = a.a(activity.getIntent());
            c.a("linkx", "TbNavCenter === closeOpenActivity === isColdStartup = " + a2);
            if (!a2) {
                activity.finish();
            }
        }
        f31019a = null;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        c.a("linkx", "TbNavContext === closeNav2MainPageActivity: 冷启动拉端，关闭首页");
        WeakReference<Activity> weakReference = f31019a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Activity activity = f31019a.get();
        if (LauncherRuntime.n && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).finish(true);
        } else {
            f31019a.get().finish();
        }
        f31019a = null;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        TFCCommonUtils.a((Context) TbFcLinkInit.instance().mApplication);
        a();
    }
}
