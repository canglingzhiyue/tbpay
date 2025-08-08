package com.taobao.tab2interact.core.component.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.tab2interact.core.component.browser.data.BrowserTaskManager;
import com.taobao.tab2interact.core.component.browser.data.a;
import com.taobao.tab2interact.core.component.browser.view.a;
import com.taobao.tab2interact.core.utils.b;
import com.taobao.tab2interact.core.utils.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.ohd;
import tb.sjc;
import tb.skq;
import tb.suq;
import tb.sur;
import tb.sus;
import tb.sut;

/* loaded from: classes8.dex */
public class a extends sjc implements a.InterfaceC0820a, a.InterfaceC0821a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAUSE_ANIMATE_SCENE_COMPONENT_STOPPED = "ComponentStopped";
    public static final String PAUSE_ANIMATE_SCENE_MAX_TIMING_DURATION_REACHED = "MaxTimingDurationReached";
    public static final String PAUSE_ANIMATE_SCENE_VIDEO_FINISHED = "VideoFinished";
    public static final String PAUSE_ANIMATE_SCENE_VIDEO_PAUSED = "VideoPaused";
    private boolean A;
    private JSONObject B;
    private Deque<JSONObject> C;
    private Map<String, String> D;
    private InterfaceC0818a E;
    private boolean F;
    private Runnable G;
    private Runnable H;
    private long I;
    private long J;
    private boolean K;
    private JSONObject L;
    private boolean M;
    private BrowserTaskManager N;

    /* renamed from: a */
    private Handler f19720a;
    private com.taobao.tab2interact.core.component.browser.view.a b;
    private com.taobao.tab2interact.core.component.browser.data.a c;
    private BroadcastReceiver d;
    private boolean e;
    private Runnable f;
    private String g;
    private boolean h;
    private boolean i;
    private JSONObject j;
    private BrowserBadgeModel k;
    private boolean l;
    private boolean m;
    private BrowserBadgeModel.UserStage n;
    private boolean o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private boolean t;
    private boolean u;
    private String v;
    private boolean w;
    private BrowserBadgeModel.UserType x;
    private boolean y;
    private JSONObject z;

    /* renamed from: com.taobao.tab2interact.core.component.browser.a$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC0818a {
        void a();

        void a(long j, long j2, long j3);

        void b();

        void c();
    }

    static {
        kge.a(-271264805);
        kge.a(785930111);
        kge.a(50882593);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1800041128:
                super.b_((String) objArr[0], (String) objArr[1]);
                return null;
            case -1663825494:
                return super.f_((String) objArr[0]);
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case -1408158594:
                return super.W();
            case -1269992187:
                return super.bC_();
            case -874481749:
                super.e_((String) objArr[0]);
                return null;
            case -650670724:
                super.a((String) objArr[0], (String) objArr[1]);
                return null;
            case -105120356:
                return super.u();
            case 80832989:
                super.V();
                return null;
            case 95609325:
                super.f();
                return null;
            case 96532846:
                super.g();
                return null;
            case 97456367:
                super.h();
                return null;
            case 106691577:
                super.r();
                return null;
            case 107615098:
                super.s();
                return null;
            case 108538619:
                super.t();
                return null;
            case 224645405:
                return super.v();
            case 554411166:
                return super.w();
            case 821015038:
                super.ck_();
                return null;
            case 884176927:
                return super.x();
            case 1514279453:
                super.a((Map) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(a aVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e18573", new Object[]{aVar, intent});
        } else {
            aVar.a(intent);
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36112800", new Object[]{aVar, str});
        } else {
            aVar.j(str);
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866c69de", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.a(z);
        }
    }

    public a(Context context, FrameLayout frameLayout, sus susVar, com.taobao.tab2interact.core.data.baseinfo.a aVar) {
        super(context, frameLayout, susVar, aVar);
        this.f19720a = new Handler(Looper.getMainLooper());
        this.M = true;
        this.C = new ArrayDeque();
        this.N = new BrowserTaskManager();
        X();
    }

    @Override // tb.sjc
    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : skq.a();
    }

    @Override // tb.sjc
    public boolean a(String str) {
        List<String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (q() && (b = skq.b()) != null) {
            return b.contains(str);
        }
        return false;
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "初始化浏览挂角数据");
        E();
        A();
        this.c = new com.taobao.tab2interact.core.component.browser.data.a(this);
        if (!Login.checkSessionValid()) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "初始化浏览挂角数据，判断为非登录状态");
            R();
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "初始化浏览挂角数据，判断为登录状态，userId=" + Login.getUserId());
        h("INIT");
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "初始化浏览挂角View");
        this.b = new com.taobao.tab2interact.core.component.browser.view.a(m());
        a(false);
        this.b.a(this);
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter("ggredpackagestatuschanged");
        this.d = new BroadcastReceiver() { // from class: com.taobao.tab2interact.core.component.browser.BrowserBadge$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    a.a(a.this, intent);
                }
            }
        };
        LocalBroadcastManager.getInstance(m()).registerReceiver(this.d, intentFilter);
    }

    private void a(Intent intent) {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "解析红包数据");
        Bundle extras = intent.getExtras();
        if (extras == null || (keySet = extras.keySet()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet) {
            Object obj = extras.get(str);
            if (obj instanceof String) {
                try {
                    obj = JSONObject.parseObject((String) obj);
                } catch (Exception e) {
                    com.taobao.tab2interact.core.utils.a.a(this, "BrowserBadge", "解析红包数据，String转JSONObject异常", e);
                }
            }
            jSONObject.put(str, obj);
        }
        a(jSONObject);
    }

    private void a(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理红包数据，data为空");
        } else {
            Object obj = jSONObject.get("96352");
            if (!(obj instanceof JSONObject)) {
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理红包数据，96352数据不为JSONObject类型");
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Object obj2 = jSONObject2.get("userPop");
            if (!(obj2 instanceof JSONObject)) {
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理红包数据，userPop不为JSONObject类型");
                return;
            }
            boolean equals = StringUtils.equals("NW", ((JSONObject) obj2).getString("type"));
            String string = jSONObject.getString("status");
            String string2 = jSONObject2.getString("enhanceFlag");
            String string3 = jSONObject2.getString("activityStage");
            Object obj3 = jSONObject2.get("defaultViewFloatpointPic");
            String str3 = null;
            if (obj3 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) obj3;
                str3 = jSONObject3.getString("url");
                str2 = jSONObject3.getString("width");
                str = jSONObject3.getString("height");
            } else {
                str = null;
                str2 = null;
            }
            if (equals) {
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理红包数据，判断为新用户，status=" + string);
                if (StringUtils.equals("init", string)) {
                    this.x = StringUtils.equals("true", string2) ? BrowserBadgeModel.UserType.REWARD_ENHANCED : BrowserBadgeModel.UserType.DEFAULT;
                    this.n = StringUtils.equals("fresh", string3) ? BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER : BrowserBadgeModel.UserStage.DEFAULT;
                    return;
                } else if (!StringUtils.equals("opened", string) || !Login.checkSessionValid()) {
                    return;
                } else {
                    com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理红包数据，判断为新用户且已开启红包且为登录状态，userId=" + Login.getUserId());
                    h("REDPACKET_NEW_USER_OPENED");
                    return;
                }
            }
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理红包数据，判断为老用户，status=" + string);
            if (this.o || !Login.checkSessionValid()) {
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理红包数据，判断为老用户且首次接口请求未完成且为登录状态，userId=" + Login.getUserId());
            this.x = StringUtils.equals("true", string2) ? BrowserBadgeModel.UserType.REWARD_ENHANCED : BrowserBadgeModel.UserType.DEFAULT;
            this.n = StringUtils.equals("fresh", string3) ? BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER : BrowserBadgeModel.UserStage.DEFAULT;
            a(str3, str2, str);
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        S();
        this.b.c(str, str2, str3);
        a(true);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.b.a();
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public FrameLayout.LayoutParams e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("856eb1b5", new Object[]{this}) : this.b.b();
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        this.e = true;
        this.f19720a.removeCallbacksAndMessages(null);
        if (this.M) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "首次开启浏览挂角");
            if (Login.checkSessionValid() && this.p) {
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "首次开启浏览挂角，判断为登录状态且首次设置View数据已完成，userId=" + Login.getUserId());
                a(true);
                c(b(this.j));
                this.E.a();
            }
        } else if (Login.checkSessionValid()) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "非首次开启浏览挂角，判断为登录状态，userId=" + Login.getUserId() + "，mUserIdOnComponentStopped=" + this.g);
            if (this.h) {
                a(true);
                this.E.a();
            }
            if (StringUtils.equals(Login.getUserId(), this.g)) {
                this.c.a("refresh", 0L, this.N.b());
            } else {
                M();
                h("USER_CHANGE");
            }
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "非首次开启浏览挂角，判断为非登录状态");
            D();
            G();
        }
        this.M = false;
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        this.e = false;
        this.g = Login.getUserId();
        this.h = this.b.c();
        D();
        this.E.b();
    }

    @Override // tb.sjc, tb.suv
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        super.a(str, str2);
        if (a(str)) {
            return;
        }
        G();
    }

    @Override // tb.suw
    public JSONObject x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("34b3781f", new Object[]{this});
        }
        JSONObject x = super.x();
        JSONObject jSONObject = new JSONObject();
        boolean q = q();
        jSONObject.put(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_ENABLE, (Object) Boolean.valueOf(q));
        if (q) {
            JSONObject jSONObject2 = new JSONObject();
            int v = com.taobao.tab2interact.core.component.browser.view.a.v() + ohd.b(m(), ohd.h(m()));
            int w = com.taobao.tab2interact.core.component.browser.view.a.w();
            jSONObject2.put(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR_TOP_MARGIN, (Object) Integer.valueOf(v));
            jSONObject2.put(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR_RIGHT_MARGIN, (Object) Integer.valueOf(w));
            jSONObject.put(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR, (Object) jSONObject2);
            if (skq.g()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM_TOP_MARGIN, (Object) Integer.valueOf(v + 34));
                jSONObject3.put(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM_RIGHT_MARGIN, (Object) Integer.valueOf(w));
                jSONObject.put(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM, (Object) jSONObject3);
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER, (Object) jSONObject);
        x.put("data", (Object) jSONObject4);
        return x;
    }

    @Override // tb.suw
    public void ck_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30efb1fe", new Object[]{this});
            return;
        }
        super.ck_();
        this.w = false;
        this.C.clear();
        this.y = false;
        this.z = null;
        this.A = false;
        this.B = null;
        this.K = false;
        this.L = null;
    }

    @Override // tb.suw
    public void e_(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe077ab", new Object[]{this, str});
            return;
        }
        super.e_(str);
        long j = this.I;
        b(j, this.J, j - this.r);
    }

    @Override // tb.suv
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        this.N.a(map);
    }

    @Override // tb.suw
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        super.r();
        this.b.d();
    }

    @Override // tb.suw
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        this.b.a(i);
    }

    @Override // tb.suw
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        super.s();
        this.i = true;
        h("USER_UPGRADE_POP_END");
    }

    @Override // tb.suw
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        this.b.i();
    }

    @Override // tb.suw
    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        super.V();
        long j = this.I;
        b(j, this.J, j - this.r);
        this.b.e();
    }

    @Override // tb.suw
    public JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9bbfd9c", new Object[]{this});
        }
        JSONObject u = super.u();
        u.put("result", (Object) Boolean.valueOf(this.w));
        u.put(sur.CALLBACK_DATA_LIST, (Object) this.C);
        return u;
    }

    @Override // tb.suw
    public JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d63d11d", new Object[]{this});
        }
        JSONObject v = super.v();
        v.put("result", (Object) Boolean.valueOf(this.y));
        v.put("data", (Object) this.z);
        return v;
    }

    @Override // tb.suw
    public JSONObject w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("210ba49e", new Object[]{this});
        }
        JSONObject w = super.w();
        w.put("result", (Object) Boolean.valueOf(this.A));
        w.put("data", (Object) this.B);
        return w;
    }

    @Override // tb.suw
    public JSONObject W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ac11347e", new Object[]{this});
        }
        JSONObject W = super.W();
        W.put("result", (Object) Boolean.valueOf(this.K));
        W.put("data", (Object) this.L);
        return W;
    }

    @Override // tb.suw
    public JSONObject f_(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9cd409aa", new Object[]{this, str});
        }
        JSONObject f_ = super.f_(str);
        f_.put("state", (Object) this.N.c(str));
        f_.put("pageUrlQuery", (Object) this.N.d(str));
        return f_;
    }

    @Override // tb.suw
    public void b_(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b58d58", new Object[]{this, str, str2});
            return;
        }
        super.b_(str, str2);
        String a2 = this.N.a();
        String c = this.N.c(a2);
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "收到h5任务变更：" + str + "=>" + str2 + ",当前正在处理任务：" + a2 + "=>" + c);
        if (!a2.equals(str) || this.N.b(str) || !"finish".equals(c)) {
            return;
        }
        if (!"success".equals(str2) && !"fail".equals(str2)) {
            return;
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            this.f19720a.removeCallbacks(runnable);
            this.f = null;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "收到h5任务变更：匹配上当前已经结束的当前任务，开始金币任务");
        j(str);
    }

    @Override // tb.suw
    public JSONObject bC_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b44d7505", new Object[]{this});
        }
        JSONObject bC_ = super.bC_();
        bC_.put("result", (Object) (this.b.x() ? "visible" : "invisible"));
        return bC_;
    }

    @Override // com.taobao.tab2interact.core.component.browser.data.a.InterfaceC0820a
    public void a(String str, JSONObject jSONObject, BrowserBadgeModel browserBadgeModel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e69720a", new Object[]{this, str, jSONObject, browserBadgeModel, new Long(j)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "数据请求成功回调，action=" + str + "，costTime=" + j);
        this.o = true;
        if (StringUtils.equals("render", str)) {
            this.F = false;
        }
        if (jSONObject == null || browserBadgeModel == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "浏览挂角数据成功回调，dataJSONObject为空或browserBadgeModel为空");
            return;
        }
        this.j = jSONObject;
        this.k = browserBadgeModel;
        if (browserBadgeModel.f != this.x) {
            this.x = browserBadgeModel.f;
            if (this.q) {
                b.a("BrowserViewExpose", null);
                I();
            }
        }
        if (browserBadgeModel.f19724a != this.n) {
            this.n = browserBadgeModel.f19724a;
            if (this.q) {
                b.a("BrowserViewExpose", null);
                I();
            }
        }
        this.m = this.m || browserBadgeModel.b;
        this.l = browserBadgeModel.c;
        if (this.m && !this.i) {
            d(jSONObject);
            return;
        }
        Pair<String, Boolean> a2 = this.N.a(browserBadgeModel);
        if (a2 != null) {
            String str2 = (String) a2.first;
            boolean booleanValue = ((Boolean) a2.second).booleanValue();
            String c = this.N.c(str2);
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "数据请求成功回调，任务" + str2 + "的状态是否发生变化：" + booleanValue + ",当前最新状态：" + c);
            if (!StringUtils.isEmpty(str2)) {
                if (booleanValue) {
                    k(str2);
                }
                if (!this.N.b(str2)) {
                    this.b.b(true);
                    if (booleanValue && "finish".equals(c)) {
                        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", str2 + "已完成，开始金币任务的兜底逻辑");
                        i(str2);
                    }
                } else {
                    this.b.b(false);
                }
            }
        }
        this.b.a(browserBadgeModel.e);
        this.p = true;
        a(true);
        JSONObject b = b(jSONObject);
        if (this.e) {
            c(b);
        }
        if (b != null && b.containsKey("paddingComponent")) {
            this.b.d();
        }
        a(str, browserBadgeModel);
    }

    private void a(String str, BrowserBadgeModel browserBadgeModel) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94cd246", new Object[]{this, str, browserBadgeModel});
        } else if (browserBadgeModel == null) {
        } else {
            BrowserBadgeModel.BrowserTaskModel browserTaskModel = browserBadgeModel.d;
            long j = browserTaskModel == null ? 0L : browserTaskModel.f19735a;
            long j2 = browserTaskModel == null ? 0L : browserTaskModel.b;
            if (this.l) {
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理浏览任务进度，当天所有任务都已完成，重置计时器");
                BrowserTaskManager browserTaskManager = this.N;
                if (browserTaskManager.b(browserTaskManager.a())) {
                    b(0L, 0L);
                } else {
                    b(j2, j);
                }
            } else if (j <= 0 || j2 < 0) {
            } else {
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理浏览任务进度，totalTimingDuration=" + j + "，accumulatedTimingDuration=" + j2 + "，mTotalDurationWhenLastRequest=" + this.s + "，mAccumulatedDurationWhenLastRequest=" + this.r);
                if (!StringUtils.equals("render", str) && (!StringUtils.equals("refresh", str) ? !(i == 0 || j != this.s || j2 != this.r) : !(this.s <= 0 || this.r < 0))) {
                    z = false;
                }
                if (z) {
                    com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "处理浏览任务进度，重新初始化计时器");
                    a(j, j2);
                    b(j2, j);
                }
                InterfaceC0818a interfaceC0818a = this.E;
                if (interfaceC0818a == null) {
                    return;
                }
                interfaceC0818a.c();
            }
        }
    }

    private void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "设置上一次请求时的时长，totalTimingDuration=" + j + "，accumulatedTimingDuration=" + j2);
        this.s = j;
        this.r = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.fastjson.JSONObject b(com.alibaba.fastjson.JSONObject r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tab2interact.core.component.browser.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "7b75e747"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5
            return r5
        L18:
            r0 = 0
            if (r5 != 0) goto L1c
            return r0
        L1c:
            java.lang.String r1 = "entranceList"
            java.lang.Object r3 = r5.get(r1)
            if (r3 == 0) goto L39
            com.alibaba.fastjson.JSONArray r5 = r5.getJSONArray(r1)
            int r1 = r5.size()
            if (r1 <= 0) goto L39
            java.lang.Object r1 = r5.get(r2)
            if (r1 == 0) goto L39
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r2)
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r5 != 0) goto L3d
            return r0
        L3d:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            java.util.List r1 = tb.skq.l()
            if (r1 == 0) goto L6c
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L6c
            java.util.Iterator r1 = r1.iterator()
        L52:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L52
            java.lang.Object r3 = r5.get(r2)
            r0.put(r2, r3)
            goto L52
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tab2interact.core.component.browser.a.b(com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    @Override // com.taobao.tab2interact.core.component.browser.data.a.InterfaceC0820a
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "数据请求失败回调，action=" + str + "，costTime=" + j);
        this.o = true;
        if (StringUtils.equals("render", str)) {
            this.F = true;
        }
        c(str, j);
        if (!StringUtils.equals("render", str) && !StringUtils.equals("refresh", str)) {
            return;
        }
        D();
        G();
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "延迟隐藏浏览挂角View");
        if (this.G == null) {
            this.G = new Runnable() { // from class: com.taobao.tab2interact.core.component.browser.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "延迟隐藏浏览挂角View，设置浏览挂角不可见");
                    a.a(a.this, false);
                }
            };
        }
        this.f19720a.postDelayed(this.G, skq.e());
    }

    private void i(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        if (this.f == null) {
            this.f = new Runnable() { // from class: com.taobao.tab2interact.core.component.browser.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", str + "完成超时逻辑命中，开启金币任务");
                    a.a(a.this, str);
                }
            };
        }
        this.f19720a.postDelayed(this.f, skq.q());
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b == null) {
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "设置浏览挂角View的可见性，当前浏览挂角View的可见性为" + this.b.c());
            if (z) {
                if (!this.e) {
                    return;
                }
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "设置浏览挂角View的可见性，将View设置为可见");
                this.b.a(true);
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "设置浏览挂角View的可见性，将View设置为不可见");
            this.b.a(false);
        }
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.a.InterfaceC0821a
    public void bU_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67ed913", new Object[]{this});
            return;
        }
        b.a("BrowserViewClick", null);
        J();
        H();
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.a.InterfaceC0821a
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        this.q = true;
        b.a("BrowserViewExpose", null);
        I();
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.a.InterfaceC0821a
    public void a(float f, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980626ec", new Object[]{this, new Float(f), new Long(j), new Long(j2), new Long(j3)});
        } else if (this.n == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
        } else {
            a(j, j2, j3);
        }
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.a.InterfaceC0821a
    public void a(int i, int i2, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd067c", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), new Long(j2), new Long(j3)});
        } else {
            a(j, j2, j3);
        }
    }

    private void a(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262808dc", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
        } else if (this.l) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "浏览任务进度回调，当天所有任务都已完成");
        } else if (j2 <= 0 || j < 0) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "浏览任务进度回调，totalDuration或accumulatedDuration不满足条件");
        } else {
            this.I = j;
            this.J = j2;
            InterfaceC0818a interfaceC0818a = this.E;
            if (interfaceC0818a == null) {
                return;
            }
            interfaceC0818a.a(j, j2, j3);
        }
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.a.InterfaceC0821a
    public void a(BrowserBadgeModel.TaskType taskType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8092fbd", new Object[]{this, taskType});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "倒计时完成，relatedTaskType=" + taskType);
        long j = this.I;
        b(j, this.J, j - this.r);
        b(taskType);
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.a.InterfaceC0821a
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            c(z);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else if (this.c == null) {
        } else {
            if (!this.p) {
                this.N.a(this.N.b(o().b()));
            }
            String a2 = this.N.a();
            if ("unknown".equals(this.N.c(a2))) {
                this.N.a(a2, "init");
            }
            this.c.a("render", 0L, this.N.b());
        }
    }

    public void a(final long j, final long j2, final long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed98968", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        this.f19720a.removeCallbacks(this.H);
        this.H = new Runnable() { // from class: com.taobao.tab2interact.core.component.browser.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.b(j, j2, j3);
                }
            }
        };
        this.f19720a.postDelayed(this.H, j4);
    }

    public void b(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0935bb", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "上报距离上次请求的间隔时长，accumulatedDuration=" + j + "，totalDuration=" + j2 + "，requestIntervalDuration=" + j3);
        this.f19720a.removeCallbacks(this.H);
        if (j < 0 || j2 <= 0 || j3 < 0) {
            return;
        }
        this.c.a("watch", j3, this.N.b());
        a(j2, j);
    }

    private void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", str + "完成，开启金币任务");
        this.N.a((String) null);
        h("AFTER_BELONG_TASK_DONE");
        this.b.b(false);
    }

    private void b(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f80629", new Object[]{this, new Long(j), new Long(j2)});
        } else if (this.b == null) {
        } else {
            if (this.n == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "初始化浏览挂角View动画，判断当前用户所处阶段为新人简化阶段");
                this.b.b(j, j2);
                if (this.l) {
                    this.b.a(j, j2);
                    return;
                } else if (this.t) {
                    return;
                } else {
                    this.b.f();
                    this.t = true;
                    return;
                }
            }
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "初始化浏览挂角View动画，判断当前用户所处阶段为其他阶段");
            this.b.b(0L, 0L);
            this.b.a(j, j2);
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "开启浏览挂角View动画");
        if (!this.e) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "开启浏览挂角View动画，组件未开启");
            return;
        }
        com.taobao.tab2interact.core.component.browser.view.a aVar = this.b;
        if (aVar == null || !aVar.c()) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "开启浏览挂角View动画，浏览挂角View不可见");
        } else if (this.l) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "开启浏览挂角View动画，当天所有任务都已完成");
        } else {
            this.u = true;
            if (this.n == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
                this.b.l();
            }
            this.b.j();
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "暂停浏览挂角View动画，scene=" + str);
        com.taobao.tab2interact.core.component.browser.view.a aVar = this.b;
        if (aVar == null || !aVar.c()) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "暂停浏览挂角View动画，浏览挂角View不可见");
        } else if (this.l) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "暂停浏览挂角View动画，当天所有任务都已完成");
        } else {
            this.u = false;
            this.v = str;
            if (this.n == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
                this.b.m();
            }
            this.b.k();
        }
    }

    public void a(InterfaceC0818a interfaceC0818a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e02259", new Object[]{this, interfaceC0818a});
        } else {
            this.E = interfaceC0818a;
        }
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(suq.WEB_VIEW_RELOAD_NAME);
        arrayList.add(suq.IS_SHOW_EXTRA_BROWSER_BADGE_NAME);
        arrayList.add(suq.IS_INTERACTION_NEW_USER_UPGRADED_NAME);
        arrayList.add(suq.IS_SHOW_INTERACTION_TASK_PANEL_NAME);
        arrayList.add(suq.IS_BROWSER_BADGE_COUNTDOWN_FINISHED_NAME);
        arrayList.add(suq.H5_INTERACTION_COMPONENT_RENDER_FINISHED_NAME);
        arrayList.add(suq.INTERACTION_TASK_COMPLETED_NAME);
        arrayList.add(suq.INTERACTION_NEW_USER_UPGRADE_POP_RENDERED_NAME);
        arrayList.add(suq.INTERACTION_TASK_PANEL_BROWSER_BUTTON_CLICKED_NAME);
        arrayList.add(suq.BROWSE_WITHDRAW_BUBBLE_HIDDEN_NAME);
        arrayList.add(suq.REFRESH_BROWSER_BADGE_DATA_NAME);
        arrayList.add(suq.GET_NATIVE_LEFT_BUBBLE_STATE_NAME);
        sut.INSTANCE.a(n(), arrayList, this);
    }

    private void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(suq.GET_INTERACT_LOCAL_CONFIG_NAME);
        arrayList.add(suq.GET_BROWSE_TASK_STATE_NAME);
        arrayList.add(suq.H5_TASK_STATE_CHANGE_NAME);
        sut.INSTANCE.a(n(), arrayList, this);
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else {
            sut.INSTANCE.a(n(), this);
        }
    }

    private void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taskType", (Object) str);
        jSONObject.put("state", (Object) this.N.c(str));
        jSONObject.put("pageUrlQuery", (Object) this.N.d(str));
        sut.INSTANCE.a(n(), suq.BROWSE_TASK_STATE_CHANGE_NAME, jSONObject, null);
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            sut.INSTANCE.a(n(), suq.SHOW_EXTRA_BROWSER_BADGE_NAME, jSONObject, null);
            this.w = true;
            this.C.offerLast(jSONObject);
            if (this.C.size() <= 5) {
                return;
            }
            this.C.pollFirst();
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        sut.INSTANCE.a(n(), suq.HIDE_EXTRA_BROWSER_BADGE_NAME, null, null);
        this.w = false;
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else {
            sut.INSTANCE.a(n(), suq.BROWSERTASK_BALANCE_UPDATE, jSONObject, null);
        }
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && jSONObject.get("freshUpgradePop") != null) {
            jSONObject2.put("freshUpgradePop", (Object) jSONObject.getJSONObject("freshUpgradePop"));
        }
        sut.INSTANCE.a(n(), suq.INTERACTION_NEW_USER_UPGRADED_NAME, jSONObject2, null);
        this.y = true;
        this.z = jSONObject2;
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", (Object) suq.SHOW_INTERACTION_TASK_PANEL_ARGS_FROM_CLICK);
        sut.INSTANCE.a(n(), suq.SHOW_INTERACTION_TASK_PANEL_NAME, jSONObject, null);
        this.A = true;
        this.B = jSONObject;
    }

    private void b(BrowserBadgeModel.TaskType taskType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff59d3e", new Object[]{this, taskType});
        } else if (taskType == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(suq.BROWSER_BADGE_COUNTDOWN_FINISHED_ARGS_TASK_TYPE, (Object) taskType.toString());
            sut.INSTANCE.a(n(), suq.BROWSER_BADGE_COUNTDOWN_FINISHED_NAME, jSONObject, null);
            this.K = true;
            this.L = jSONObject;
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", (Object) (z ? "visible" : "invisible"));
        sut.INSTANCE.a(n(), suq.NATIVE_LEFT_BUBBLE_STATE_CHANGE_NAME, jSONObject, null);
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        Map<String, String> L = L();
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "浏览挂角初始化数据失败埋点，properties=" + L);
        d.c("Page_VideoCash_BrowserBadgeInitDataFail", L);
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        Map<String, String> L = L();
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "浏览挂角兜底View展示埋点，properties=" + L);
        d.c("Page_VideoCash_BrowserBadgeDefaultViewShow", L);
    }

    private void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926ce90", new Object[]{this, str, new Long(j)});
            return;
        }
        Map<String, String> d = d(str, j);
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "浏览挂角请求数据失败埋点，properties=" + d);
        d.c("Page_VideoCash_BrowserBadgeRequestDataFail", d);
    }

    private Map<String, String> d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7096c164", new Object[]{this, str, new Long(j)});
        }
        Map<String, String> L = L();
        L.put("action", str);
        L.put("costTime", String.valueOf(j));
        return L;
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        Map<String, String> T = T();
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "浏览挂角View曝光埋点，properties=" + T);
        d.b("Page_VideoCash_Show-FingerWatch", T);
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        Map<String, String> T = T();
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadge", "浏览挂角View点击埋点，properties=" + T);
        d.a("Button-FingerWatch", T);
    }

    private Map<String, String> T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e6db1d0", new Object[]{this});
        }
        Map<String, String> L = L();
        L.put("spm", "a21afv.28088452.activity.7");
        return L;
    }

    private Map<String, String> L() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c11aa3c8", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (this.x == BrowserBadgeModel.UserType.REWARD_ENHANCED) {
            str = "lowactive";
        } else if (this.n == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
            str = "new";
        } else {
            str = this.n == BrowserBadgeModel.UserStage.DEFAULT ? "usual" : "unknown";
        }
        hashMap.put("x_user_status", str);
        Map<String, String> map = this.D;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("enableTab2GlobalInteract", "true");
        hashMap.put("tab2GlobalInteractVersion", "2.0");
        return hashMap;
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.D = map;
        }
    }

    public long N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("460adc9", new Object[]{this})).longValue() : this.r;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : this.u;
    }

    public String P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11580a9", new Object[]{this}) : this.v;
    }

    public BrowserBadgeModel Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BrowserBadgeModel) ipChange.ipc$dispatch("1cdd2980", new Object[]{this}) : this.k;
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue() : this.F;
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        this.i = false;
        this.k = null;
        this.l = false;
        this.m = false;
        this.x = null;
        this.n = null;
        this.o = false;
        this.q = false;
        this.I = 0L;
        this.J = 0L;
        this.r = 0L;
        this.s = 0L;
        this.t = false;
        this.u = false;
        this.v = null;
        this.w = false;
        this.C.clear();
        this.y = false;
        this.z = null;
        this.A = false;
        this.B = null;
        this.K = false;
        this.L = null;
        this.b.n();
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        super.h();
        com.taobao.tab2interact.core.component.browser.view.a aVar = this.b;
        if (aVar != null) {
            aVar.g();
        }
        this.f19720a.removeCallbacksAndMessages(null);
        if (this.d != null) {
            LocalBroadcastManager.getInstance(m()).unregisterReceiver(this.d);
        }
        F();
        this.N.c();
    }
}
