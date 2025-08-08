package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.linkback.d;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.a;
import com.taobao.flowcustoms.afc.b;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.f;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.afc.utils.e;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.tao.welcome.Welcome;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class mbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static mbl c;

    /* renamed from: a  reason: collision with root package name */
    private String f31016a;
    private mbn b;
    private Application.ActivityLifecycleCallbacks d = new Application.ActivityLifecycleCallbacks() { // from class: tb.mbl.2
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
            String simpleName = activity.getClass().getSimpleName();
            if (StringUtils.equals(Welcome.class.getSimpleName(), simpleName) || !TbFcLinkInit.instance().isAfcLink) {
                return;
            }
            c.a("linkx", "TbNavCenter === onActivityResumed:" + simpleName + " === 页面不相同，关闭海关中转页面");
            if (StringUtils.isEmpty(mbl.a(mbl.this)) || !e.b(Uri.parse(mbl.a(mbl.this)))) {
                mbm.a();
            }
            TbFcLinkInit.instance().mApplication.unregisterActivityLifecycleCallbacks(mbl.b(mbl.this));
        }
    };

    static {
        kge.a(-19230690);
    }

    public static /* synthetic */ String a(mbl mblVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("136bd4bf", new Object[]{mblVar}) : mblVar.f31016a;
    }

    public static /* synthetic */ Application.ActivityLifecycleCallbacks b(mbl mblVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("2188ea0e", new Object[]{mblVar}) : mblVar.d;
    }

    public static mbl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mbl) ipChange.ipc$dispatch("f07ae87", new Object[0]);
        }
        if (c == null) {
            c = new mbl();
        }
        return c;
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        a aVar = AfcCustomSdk.a().h;
        a(aVar);
        lyq.a().a(str);
        try {
            String str2 = aVar.F;
            if (!StringUtils.isEmpty(str2)) {
                d.a().a(str2);
            }
        } catch (Exception e) {
            c.b("linkx", "TbNavCenter === navToPage: afcBackUrl处理异常：" + e);
        }
        if (StringUtils.isEmpty(str)) {
            TFCCommonUtils.a((Context) TbFcLinkInit.instance().mApplication);
            c.a("linkx", "TbNavCenter === navToPage: landingUrl为空，跳到首页");
            return;
        }
        this.f31016a = str;
        this.b = mbn.a();
        a(TbFcLinkInit.instance().mApplication, aVar, str, map);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            d.a().c();
        } else {
            d.a().a(str);
            c.a("linkx", "TbNavCenter === updateLinkBackUrl");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(final android.content.Context r11, com.taobao.flowcustoms.afc.a r12, final java.lang.String r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mbl.a(android.content.Context, com.taobao.flowcustoms.afc.a, java.lang.String, java.util.Map):void");
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
            String a2 = b.a().a("isSendLandingDataAvailable", "true");
            if (StringUtils.isEmpty(a2)) {
                a2 = f.a(context).a("flow_customs_in_local").get("isSendLandingDataAvailable");
            }
            return StringUtils.equals("true", a2);
        } catch (Exception e) {
            c.b("linkx", "TbNavCenter === isSendLandingDataAvailable === 异常" + e);
            return false;
        }
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9b6d95", new Object[]{this, aVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("autoLoginParam", aVar.J.getString("autoLoginParam"));
            hashMap.put("autoLoginExecuteStatus", aVar.J.getString("autoLoginExecuteStatus"));
            hashMap.put("startLoginStatus", aVar.J.getString("startLoginStatus"));
            hashMap.put("autoLoginAbBucketId", aVar.J.getString("autoLoginAbBucketId"));
            hashMap.put("beforeNavlLoginStatus", TFCCommonUtils.a());
            com.taobao.flowcustoms.afc.utils.b.a("afc_autologin_result", "", "", hashMap);
        } catch (Throwable unused) {
            c.b("linkx", "TbNavCenter === trackAutoLogin === 异常");
        }
    }
}
