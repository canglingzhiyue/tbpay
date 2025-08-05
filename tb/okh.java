package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.m;
import com.android.tools.bundleInfo.b;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.android.tools.ir.runtime.d;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaobaoApplication;
import java.util.HashMap;

/* loaded from: classes.dex */
public class okh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        if (TaobaoApplication.isMainProcess()) {
            qrn.a(application, TaobaoApplication.sPackageName, 0);
        }
        try {
            jar.a(application);
        } catch (Throwable unused) {
        }
        d.b().a(application);
        b.a();
        ApplicationInvoker.getInstance(TaobaoApplication.sPackageName).invoke(TaoApplication.class.getName(), application, null);
        m.a().a(application);
    }
}
