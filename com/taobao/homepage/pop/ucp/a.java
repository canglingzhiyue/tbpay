package com.taobao.homepage.pop.ucp;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.android.external.UCPReachViewOpenState;
import com.taobao.android.external.UCPReachViewState;
import com.taobao.homepage.pop.utils.d;
import com.taobao.homepage.pop.utils.f;
import tb.kzz;

/* loaded from: classes.dex */
public final class a implements com.taobao.android.external.a, com.taobao.android.external.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_REQUEST = "request";
    public static final String KEY_UCP_PROTOCOL = "PageHomeReachView";
    public static final String TAG = "HomePopUcpManager";
    public static final String UCP_SCENE = "Page_Home";

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f17249a = c.a();
    private com.taobao.android.external.a b;
    private final com.taobao.homepage.pop.protocol.lifecycle.detail.a e;
    private b f;
    private final Handler g = new Handler(Looper.getMainLooper());

    public static /* synthetic */ com.taobao.homepage.pop.protocol.lifecycle.detail.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.homepage.pop.protocol.lifecycle.detail.a) ipChange.ipc$dispatch("797277cf", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afb8570", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f17249a;
    }

    public a(com.taobao.homepage.pop.protocol.lifecycle.detail.a aVar, kzz kzzVar) {
        this.e = aVar;
        if (a()) {
            UCPManager.a(this, KEY_UCP_PROTOCOL);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f = null;
        this.g.removeCallbacksAndMessages(null);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "doTriggerByUCP.");
        this.e.a(str);
    }

    @Override // com.taobao.android.external.b
    public UCPReachViewOpenState openReachView(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCPReachViewOpenState) ipChange.ipc$dispatch("6afe6146", new Object[]{this, jSONObject, jSONObject2});
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "openReachView ucpInfo=" + jSONObject);
        f.a("ucpTriggerHomePop", "", false, "");
        this.f = b.a(jSONObject, jSONObject2, this);
        c.a(this.f, b.KEY_BIZ_CHECK, 0, b.KEY_BIZ_CHECK);
        final String a2 = this.f.a();
        if (StringUtils.isEmpty(a2)) {
            com.taobao.homepage.pop.utils.c.a(TAG, "openReachView doTrigger: empty businessId");
            d.b("UcpOpenReachView", "", String.valueOf(2), b.KEY_TERMINAL);
            return UCPReachViewOpenState.TERMINATION;
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "openReachView doTrigger: " + a2);
        d.a("UcpOpenReachView", a2, "", "");
        a(a2);
        this.g.removeCallbacksAndMessages(null);
        this.g.postDelayed(new Runnable() { // from class: com.taobao.homepage.pop.ucp.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!a.a(a.this).b(a2)) {
                } else {
                    a.b(a.this);
                    a.a(a.this).c(a2);
                    d.b("UcpTriggerTimeout", "", String.valueOf(2), b.KEY_TERMINAL);
                    com.taobao.homepage.pop.utils.c.a(a.TAG, "ucp pop trigger timeout: " + a2);
                }
            }
        }, c.b());
        return UCPReachViewOpenState.OPEN;
    }

    @Override // com.taobao.android.external.b
    public void registerStateSynchronizer(com.taobao.android.external.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a427a", new Object[]{this, aVar});
            return;
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "registerStateSynchronizer, synchronizer=" + aVar);
        this.b = aVar;
    }

    @Override // com.taobao.android.external.b
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue() : a();
    }

    public b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b3935632", new Object[]{this}) : this.f;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!a()) {
        } else {
            com.taobao.homepage.pop.utils.c.a(TAG, "sendUCPEvent, actionType=" + str + " actionName: " + str2);
            UCPManager.a("Page_Home", str, str2, null);
            d.a(str, str2);
        }
    }

    @Override // com.taobao.android.external.a
    public void a(UCPReachViewState uCPReachViewState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe4b5af", new Object[]{this, uCPReachViewState});
            return;
        }
        com.taobao.android.external.a aVar = this.b;
        if (aVar == null || uCPReachViewState == null) {
            return;
        }
        aVar.a(uCPReachViewState);
        this.g.removeCallbacksAndMessages(null);
        if (!StringUtils.equals(uCPReachViewState.key, "Error") && !StringUtils.equals(uCPReachViewState.key, b.KEY_TERMINAL)) {
            return;
        }
        this.f = null;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            c.a(this.f, "Error", 3, b.ERROR_MSG_NO_POP_DATA);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (a()) {
            UCPManager.b(KEY_UCP_PROTOCOL);
        }
        this.g.removeCallbacksAndMessages(null);
    }
}
