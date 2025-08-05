package tb;

import android.app.Activity;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.gateway.dispatch.a;
import com.taobao.homepage.utils.AccessibilityWVPlugin;
import com.taobao.homepage.utils.n;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;

/* loaded from: classes7.dex */
public class nuv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1004409302);
    }

    public static /* synthetic */ void b(lbq lbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0fcb5be", new Object[]{lbqVar});
        } else {
            c(lbqVar);
        }
    }

    public static void a(final lbq lbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f279af3d", new Object[]{lbqVar});
            return;
        }
        boolean u = n.n().u();
        e.e("BinderMethodAsynchronizer", "!enableAsyncBinderMethodByCreateView");
        if (!u) {
            c(lbqVar);
        } else {
            a.b().d(new Runnable() { // from class: tb.nuv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        nuv.b(lbq.this);
                    }
                }
            });
        }
    }

    private static void c(lbq lbqVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf7fbc3f", new Object[]{lbqVar});
            return;
        }
        Activity curActivity = lbqVar.getCurActivity();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("binderTransactionMethod pageProvider is null ? ");
        if (curActivity != null) {
            z = false;
        }
        sb.append(z);
        strArr[0] = sb.toString();
        e.e("BinderMethodAsynchronizer", strArr);
        if (curActivity == null) {
            return;
        }
        lar.e(Constants.Name.ACCESSIBLE);
        d(lbqVar);
        lar.f(Constants.Name.ACCESSIBLE);
        lar.e("asyncRegisterBroadcast");
        lbqVar.getHomePageManager().f().a();
        lar.f("asyncRegisterBroadcast");
        lar.e("asyncLoginManager");
        lbqVar.getHomePageManager().c().a().d();
        lar.f("asyncLoginManager");
    }

    private static void d(lbq lbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be02c2c0", new Object[]{lbqVar});
            return;
        }
        try {
            if (com.taobao.homepage.utils.a.b(lbqVar.getCurActivity())) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("x-a-o", "VoiceOverOpen");
                e.e("BinderMethodAsynchronizer", "isAccessibilityEnabled true");
            } else {
                UTAnalytics.getInstance().getDefaultTracker().removeGlobalProperty("x-a-o");
                e.e("BinderMethodAsynchronizer", "isAccessibilityEnabled false");
            }
            q.a("ScreenReaderOpen", (Class<? extends android.taobao.windvane.jsbridge.e>) AccessibilityWVPlugin.class);
        } catch (Throwable th) {
            e.e("BinderMethodAsynchronizer", "register AccessibilityWVPlugin exception" + th.getMessage());
        }
        try {
            if (com.taobao.homepage.utils.a.a(lbqVar.getCurActivity())) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("x-a-t", "TalkBackOpen");
                e.e("BinderMethodAsynchronizer", "isTalkBackOpen true");
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().removeGlobalProperty("x-a-t");
            e.e("BinderMethodAsynchronizer", "isTalkBackOpen false");
        } catch (Throwable th2) {
            e.b("BinderMethodAsynchronizer", th2, new String[0]);
        }
    }
}
