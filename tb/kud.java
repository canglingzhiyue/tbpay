package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.page.weexv2.a;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class kud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lbo f30322a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final Activity c;

    static {
        kge.a(341369745);
    }

    public static /* synthetic */ AtomicBoolean a(kud kudVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("47f1cc1e", new Object[]{kudVar}) : kudVar.b;
    }

    public kud(Activity activity, lbo lboVar) {
        this.c = activity;
        this.f30322a = lboVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (a.d()) {
            b();
            return true;
        } else if (!this.b.get()) {
            this.b.set(true);
            ovs.a();
            a(false);
            String a2 = b.a(R.string.taobao_app_1000_1_16133);
            if (ovr.a()) {
                a2 = b.a(R.string.taobao_app_1000_1_16167);
            }
            TBToast.makeText(this.c, a2, 0L).show();
            final Timer timer = new Timer("App Finish Two back");
            timer.schedule(new TimerTask() { // from class: tb.kud.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    kud.a(kud.this).set(false);
                    timer.cancel();
                }
            }, 2000L);
            e.e("TaoAppExitProxy", "fist back click");
            return false;
        } else {
            a(true);
            this.c.moveTaskToBack(true);
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(new Intent("HOMEPAGE_EXIT_BY_TWO_CLICK"));
            e.e("TaoAppExitProxy", "back click exit");
            return true;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        lbo lboVar = this.f30322a;
        if (lboVar == null) {
            e.e("TaoAppExitProxy", "backHomeInSecondFloor homePageManager == null");
            return;
        }
        mjx i = lboVar.i();
        if (i == null) {
            return;
        }
        i.d();
        e.e("TaoAppExitProxy", "在二楼 双击back回到首页");
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = z ? "Event_AndroidHomeBack_2" : "Event_AndroidHomeBack_1";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_HomeTab", (Object) "1");
            kss.a("Page_Home", 19999, str, jSONObject);
        } catch (Throwable th) {
            e.e("TaoAppExitProxy", "出现异常： " + th);
        }
    }
}
