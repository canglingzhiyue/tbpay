package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.homepage.windvane.b;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.Arrays;
import java.util.List;
import tb.ovt;

/* loaded from: classes8.dex */
public class sik implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1631740857);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Arrays.asList("isSpeed", "getHomePageState", "getGlobalState");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "isSpeed")) {
            return a(str2, wVCallBackContext);
        }
        if (TextUtils.equals(str, "getHomePageState")) {
            return a(wVCallBackContext);
        }
        if (!TextUtils.equals(str, "getGlobalState")) {
            return false;
        }
        return b(wVCallBackContext);
    }

    @WindVaneInterface
    private boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            String string = JSONObject.parseObject(str).getString("bizName");
            if (string == null) {
                string = "";
            }
            r rVar = new r();
            rVar.a("isSpeed", Boolean.valueOf(TBSpeed.isSpeedEdition(g.a(), string)));
            wVCallBackContext.success(rVar);
            lap.a("Bridge", "isSpeed", "homepage.HomePageWVPlugin.isSpeed; success");
        } catch (Throwable unused) {
            lap.a("Bridge", "isSpeed", "homepage.HomePageWVPlugin.isSpeed; fail; exception: json parse error");
        }
        return true;
    }

    private boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca15efa9", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        if (TBMainHost.a().getCurrentFragment() instanceof HomepageFragment) {
            r rVar = new r();
            c.b B = c.a().B();
            ovt.a C = c.a().C();
            IHomeSubTabController z = c.a().z();
            if (z != null && !z.isReachTop()) {
                i = 200;
            }
            String a2 = HomePageUtility.a(B.b, C.b);
            rVar.a("tabName", a2);
            rVar.a("offsetY", Float.valueOf(i));
            wVCallBackContext.success(rVar);
            laq a3 = laq.a().a("Bridge").b("getHomePageState").c("success.").a("tabName", a2);
            a3.a("offsetY", i + "").b();
            return true;
        }
        wVCallBackContext.error();
        lap.a("Bridge", "getHomePageState", "error:fragment is not HomepageFragment");
        return false;
    }

    private boolean b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efa9f8aa", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        rVar.a("statusHeight", Integer.valueOf(sfm.STATUS_HEIGHT_PX));
        rVar.a("deviceLevel", g.b());
        wVCallBackContext.success(rVar);
        laq c = laq.a().b("getGlobalState").a("Bridge").c("success.").c("homepage.HomePageWVPlugin.getGlobalState");
        c.a("statusHeight", sfm.STATUS_HEIGHT_PX + "").a("deviceLevel", g.b()).b();
        return true;
    }
}
