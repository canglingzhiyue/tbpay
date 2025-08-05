package tb;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.homepage.HomepageFragment;

/* loaded from: classes7.dex */
public class lbi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String POP_LAYER_RECOMMEND_TAB_NAME;

    /* renamed from: a  reason: collision with root package name */
    private final lbo f30449a;

    static {
        kge.a(894134699);
        POP_LAYER_RECOMMEND_TAB_NAME = HomepageFragment.class.getSimpleName();
    }

    public lbi(lbo lboVar) {
        this.f30449a = lboVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Activity a2 = a();
        if (a2 == null) {
            ksp.c("PopLayer_And_ucp_trigger", "activity == null");
            return;
        }
        Runnable a3 = a(a2, str);
        ksp.c("PopLayer_And_ucp_trigger", "delayAfterHomeLoadedForPopRunnable");
        a3.run();
    }

    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        Activity a2 = a();
        if (a2 == null) {
            ksp.c("PopLayer_And_ucp_trigger", "sendBizCustomSceneChangedToUcp activity == null");
            return;
        }
        Intent intent = a2.getIntent();
        if (intent != null && intent.getData() != null && jSONObject != null) {
            jSONObject.put(nfc.PHA_MONITOR_DIMENSION_PAGE_URL, (Object) intent.getData().toString());
        }
        lbl.a(str, str2, jSONObject);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Activity a2 = a();
        if (a2 == null) {
            ksp.c("PopLayer_And_ucp_trigger", "notifyPopLayerPageSwitch activity == null");
        } else {
            lbl.a(a2, str);
        }
    }

    private Runnable a(final Activity activity, final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("9ee4ca10", new Object[]{this, activity, str}) : new Runnable() { // from class: tb.lbi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ksp.c("PopLayer_And_ucp_trigger", "LazyInit.start.notifyPop.");
                nju.a(PopStrategy.IDENTIFIER_POPLAYER, true);
                lbl.a(activity, str);
            }
        };
    }

    private Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this});
        }
        lbq a2 = this.f30449a.a();
        if (a2 == null) {
            ksp.c("PopLayer_And_ucp_trigger", "pageProvider == null");
            return null;
        }
        return a2.getCurActivity();
    }
}
