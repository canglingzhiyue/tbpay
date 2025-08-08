package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle;
import com.taobao.homepage.view.manager.lifecycle.listener.a;
import com.taobao.homepage.view.manager.lifecycle.listener.b;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.tao.homepage.HomepageFragment;

/* loaded from: classes7.dex */
public class lbj implements IPageLifeCycle, a, b, tgs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE = "actionType";
    public static final String RECOMMEND_SCENE = "Page_Home_Recommend";

    /* renamed from: a  reason: collision with root package name */
    private final lbi f30451a;
    private boolean b;
    private Uri c;
    private String d = "home";
    private String e;

    static {
        kge.a(1447801889);
        kge.a(1531639748);
        kge.a(7935770);
        kge.a(200220330);
        kge.a(-612825092);
    }

    @Override // tb.tgs
    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        }
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(lbj lbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27680a4", new Object[]{lbjVar});
        } else {
            lbjVar.a();
        }
    }

    public lbj(lbo lboVar) {
        this.f30451a = new lbi(lboVar);
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.b
    public void a(String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a609f9", new Object[]{this, str, intent, str2});
            return;
        }
        ksp.c("PopLayer_And_ucp_trigger", "外链触发, intent: " + intent + "当前外链拉起的tab是： " + str);
        this.c = intent.getData();
        this.e = str;
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ksp.c("PopLayer_And_ucp_trigger", "onResume, type: " + str);
        if (this.b && "backToHome".equals(str)) {
            this.b = false;
            ksp.c("PopLayer_And_ucp_trigger", "从后台回来了，不发送消息");
        } else if ("coldStart".equals(str)) {
            ksp.c("PopLayer_And_ucp_trigger", "冷启的onResume不发送，lazyInit时机发送，和原逻辑保持一致");
        } else if (com.taobao.homepage.page.weexv2.a.d()) {
            ksp.c("PopLayer_And_ucp_trigger", "当前在二楼，不允许出pop");
        } else {
            c(str);
        }
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            sdy.a(new Runnable() { // from class: tb.lbj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lbj.a(lbj.this);
                    }
                }
            });
        }
    }

    @Override // tb.tgs
    public void a(String str, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4051d3e3", new Object[]{this, str, tgrVar});
            return;
        }
        this.d = str;
        c(IMainFeedsLoopStartStopService.a.TAB_SWITCH);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String e = e(this.d);
        Uri uri = this.c;
        String uri2 = uri == null ? "" : uri.toString();
        JSONObject d = d("coldStart");
        ksp.c("PopLayer_And_ucp_trigger", "onLazyInit，当前的tab是：" + e + "当前的uri是：" + uri2);
        this.f30451a.a(StringUtils.equals(RECOMMEND_SCENE, e) ? HomepageFragment.class.getSimpleName() : e);
        this.f30451a.a(e, uri2, d);
        if (!b(this.e)) {
            return;
        }
        b();
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        String e = e(this.d);
        Uri uri = this.c;
        String uri2 = uri == null ? "" : uri.toString();
        JSONObject d = d(str);
        ksp.c("PopLayer_And_ucp_trigger", "当前的tab是:" + e + " uri:" + uri2 + " actionType：" + str);
        this.f30451a.a(e, uri2, d);
        lbi lbiVar = this.f30451a;
        if (StringUtils.equals(RECOMMEND_SCENE, e)) {
            e = lbi.POP_LAYER_RECOMMEND_TAB_NAME;
        }
        lbiVar.b(e);
        if (b(this.e)) {
            b();
        }
        if (!IMainFeedsLoopStartStopService.a.TAB_SWITCH.equals(str)) {
            return;
        }
        b();
    }

    private JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actionType", (Object) str);
        return jSONObject;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e = null;
        this.c = null;
        ksp.c("PopLayer_And_ucp_trigger", "clearOutLinkParams");
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        ksp.c("PopLayer_And_ucp_trigger", "当前的tab类型是：" + str);
        return !b(str) ? str : RECOMMEND_SCENE;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : StringUtils.equals("home", str) || StringUtils.equals("recommend_recommend", str);
    }
}
