package tb;

import android.app.Application;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.wireless.link.common.LinkCommonHomeReceiver;
import com.taobao.wireless.link.common.PushStateJsbridge;
import com.taobao.wireless.link.common.b;
import com.taobao.wireless.link.controller.MessageServiceReceiver;
import com.taobao.wireless.link.download.DownloadCenter;
import com.taobao.wireless.link.pop.PopMessageReceiver;
import com.taobao.wireless.link.pop.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class rjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Application f33186a;
    public String b;
    public b c;
    public boolean d;
    public boolean e;
    public String f;
    private boolean g;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static rjt f33187a;

        static {
            kge.a(1098296479);
            f33187a = new rjt();
        }

        public static /* synthetic */ rjt a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rjt) ipChange.ipc$dispatch("f0a1362", new Object[0]) : f33187a;
        }
    }

    static {
        kge.a(-2062017588);
    }

    public static rjt a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rjt) ipChange.ipc$dispatch("f0a1362", new Object[0]) : a.a();
    }

    private rjt() {
        this.d = true;
        this.e = false;
        this.f = mpa.COLD;
        this.g = false;
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        try {
            rkg.a("link_tag", "LinkCommonInit === init === 开始初始化");
            this.f33186a = application;
            this.b = (String) hashMap.get("appVersion");
            this.g = ((Boolean) hashMap.get("isDebuggable")).booleanValue();
            rkk.a(application);
            this.c = new b(application);
            c(application, hashMap);
            b(application);
            rkg.a("link_tag", "LinkCommonInit === init === 初始化完成");
        } catch (Throwable th) {
            rkg.a("link_tag", "LinkCommonInit === init === 初始化异常：" + th);
        }
    }

    private void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
            return;
        }
        LocalBroadcastManager.getInstance(application).registerReceiver(LinkCommonHomeReceiver.a.f23582a, new IntentFilter("action_welcome_need_finish"));
        d.d(application);
        application.registerActivityLifecycleCallbacks(new com.taobao.wireless.link.common.a());
        d.a(application);
    }

    private void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3849cde", new Object[]{this, application, hashMap});
            return;
        }
        com.taobao.wireless.link.webApp.b.a().a(application);
        rju.a().a(application, hashMap);
        DownloadCenter.a().a(application);
        com.taobao.wireless.link.login.a.a().a(application, hashMap);
        q.a(PushStateJsbridge.CLASSNAME_PUSH_STATE, (Class<? extends e>) PushStateJsbridge.class);
    }

    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{this, application, hashMap});
            return;
        }
        a().a(application);
        rkg.a("link_tag", "LinkCommonInit === initChannel === channel进程注册消息监听");
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        GlobalClientInfo.getInstance(application).registerService("assistant", MessageServiceReceiver.class.getName());
        GlobalClientInfo.getInstance(application).registerService("agooSendForPop", PopMessageReceiver.class.getName());
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.g;
    }
}
