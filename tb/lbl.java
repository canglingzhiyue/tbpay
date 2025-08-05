package tb;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.homepage.HomepageFragment;

/* loaded from: classes7.dex */
public class lbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f30454a;

    static {
        kge.a(346915290);
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
        } else if (!a()) {
            ksp.c("PopLayer_And_ucp_trigger", "orange开关关闭，不允许给pop发消息");
        } else {
            try {
                UCPManager.a(str, str2, jSONObject);
                ksp.c("PopLayer_And_ucp_trigger", "发送通知给ucp,scene: " + str + " url：" + str2 + " bizArgs： " + jSONObject);
            } catch (Exception e) {
                ksp.c("PopLayer_And_ucp_trigger", "sendBizCustomSceneChangedToUcp 出现异常" + e);
            }
        }
    }

    public static void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{activity, str});
        } else if (!a()) {
            ksp.c("PopLayer_And_ucp_trigger", "orange开关关闭，不允许给pop发消息");
        } else if (activity == null) {
            ksp.c("PopLayer_And_ucp_trigger", "notifyPopLayerPageSwitch activity == null");
        } else {
            try {
                c(activity, str);
            } catch (Exception e) {
                ksp.c("PopLayer_And_ucp_trigger", "notifyPopLayerPageSwitch 出现异常：" + e);
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f30454a == null) {
            f30454a = Boolean.valueOf(j.a("sendSceneChangedNotifyEnable", true));
            b();
        }
        return f30454a.booleanValue();
    }

    private static void c(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfc9a06", new Object[]{activity, str});
            return;
        }
        Intent intent = activity.getIntent();
        String uri = (intent == null || intent.getData() == null) ? "" : intent.getData().toString();
        ksp.c("PopLayer_And_ucp_trigger", "发送通知给pop,subTabName: " + str + " param：" + uri);
        f.a().a(str, uri, false);
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!f30454a.booleanValue()) {
            ksp.c("PopLayer_And_ucp_trigger", "当前新链路开关没开");
        } else {
            try {
                UCPManager.d(HomepageFragment.class.getName());
            } catch (Exception e) {
                ksp.c("PopLayer_And_ucp_trigger", "addIgnorePage 出现异常" + e);
            }
        }
    }
}
