package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.extra.performance2.WVPageTracker;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.request.mtop.b;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.d;
import com.taobao.linkmanager.afc.request.TBLinkRequest;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.tao.welcome.Welcome;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class mbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f31010a;
    private String b;
    private WVPageTracker.PageStatusCallback c;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static mbh f31013a;

        static {
            kge.a(-1024138616);
            f31013a = new mbh();
        }

        public static /* synthetic */ mbh a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mbh) ipChange.ipc$dispatch("f07ae0b", new Object[0]) : f31013a;
        }
    }

    static {
        kge.a(-47627339);
    }

    public static /* synthetic */ WVPageTracker.PageStatusCallback a(mbh mbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVPageTracker.PageStatusCallback) ipChange.ipc$dispatch("dac088c", new Object[]{mbhVar}) : mbhVar.c;
    }

    public static mbh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mbh) ipChange.ipc$dispatch("f07ae0b", new Object[0]) : a.a();
    }

    private mbh() {
        this.f31010a = new Application.ActivityLifecycleCallbacks() { // from class: tb.mbh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    return;
                }
                try {
                    String simpleName = activity.getClass().getSimpleName();
                    if (StringUtils.equals(Welcome.class.getSimpleName(), simpleName)) {
                        return;
                    }
                    mbh.a().a(simpleName, activity.getIntent());
                } catch (Exception e) {
                    e.printStackTrace();
                    WVPageTracker.removeH5LifeCallback(mbh.a(mbh.this));
                    AfcCustomSdk.a().f17167a.unregisterActivityLifecycleCallbacks(mbh.this.f31010a);
                }
            }
        };
        this.c = new WVPageTracker.PageStatusCallback() { // from class: tb.mbh.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.performance2.WVPageTracker.PageStatusCallback
            public void onRedirect(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b5c125f6", new Object[]{this, str, str2});
                    return;
                }
                c.a("linkx", "FlowInTimeManager === onRedirect === 302");
                TFCCommonUtils.a(str, str2, new HashMap());
            }

            @Override // android.taobao.windvane.extra.performance2.WVPageTracker.PageStatusCallback
            public void onPageFinish(String str) {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2f0cb712", new Object[]{this, str});
                    return;
                }
                c.a("linkx", "FlowInTimeManager === onPageFinish === 当前URL：" + str);
                if (!StringUtils.isEmpty(str)) {
                    z = str.contains("_afc_link=1");
                }
                if (!z) {
                    return;
                }
                c.a("linkx", "FlowInTimeManager === processLandingData === URL相同开始上报数据");
                mbh.a(str);
                WVPageTracker.removeH5LifeCallback(mbh.a(mbh.this));
                AfcCustomSdk.a().f17167a.unregisterActivityLifecycleCallbacks(mbh.this.f31010a);
            }
        };
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("content", JSON.toJSONString(a(str, true)));
        c.a("linkx", "FlowInTimeManager === sendInTimeData === 上报参数：" + hashMap.toString());
        b.a().a(TBLinkRequest.ARRIVE_DATA_API, "1.0", hashMap, false, new koe() { // from class: tb.mbh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.koe
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    return;
                }
                c.a("linkx", "FlowInTimeManager === sendInTimeData === 上报成功:" + jSONObject);
            }

            @Override // tb.koe
            public void a(JSONObject jSONObject, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b6e96a0", new Object[]{this, jSONObject, str2});
                    return;
                }
                c.a("linkx", "FlowInTimeManager === sendInTimeData === 上报失败:" + str2);
            }
        }, new Handler(d.b.f17188a.getLooper()), 4000);
        com.taobao.flowcustoms.afc.utils.b.a("afc_flow_arrive", "", "", a(str, false));
        lyq.a().b(str);
    }

    private static HashMap<String, String> a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8e866dc5", new Object[]{str, new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (z) {
            hashMap.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id"));
        }
        hashMap.put("launchType", kog.a().c(mpa.COLD));
        hashMap.put("isBackground", kog.a().a(false) + "");
        hashMap.put("url", str);
        return hashMap;
    }

    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
            return;
        }
        if (intent != null && intent.getData() != null) {
            this.b = intent.getData().toString();
        }
        c.a("linkx", "FlowInTimeManager === processLandingData === data=" + this.b);
        if (StringUtils.equals(BrowserActivity.class.getSimpleName(), str)) {
            WVPageTracker.registerH5LifeCallback(this.c);
            c.b("linkx", "FlowInTimeManager === processLandingData === h5页面，注册监听：" + str);
            return;
        }
        c.b("linkx", "FlowInTimeManager === processLandingData === native落地：" + str);
        a(this.b);
        AfcCustomSdk.a().f17167a.unregisterActivityLifecycleCallbacks(this.f31010a);
    }
}
