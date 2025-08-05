package com.taobao.android.detail.ttdetail.floatview;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.i;
import com.taobao.android.detail.ttdetail.bridge.TTFloatViewWeexModule;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.vessel.weex.VesselWeexView;
import com.uc.webview.export.media.MessageID;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.kge;
import tb.rgu;
import tb.rgy;

/* loaded from: classes4.dex */
public class d implements com.taobao.android.detail.ttdetail.communication.g<i> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FragmentManager c;
    private VesselWeexView d;
    private ViewGroup e;
    private FragmentActivity f;
    private eyx h;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f10650a = new ArrayList();
    private boolean b = false;
    private String g = "";
    private final List<JSONObject> i = new ArrayList();
    private final Handler j = new Handler(Looper.getMainLooper());
    private FragmentManager.OnBackStackChangedListener k = new FragmentManager.OnBackStackChangedListener() { // from class: com.taobao.android.detail.ttdetail.floatview.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2062519", new Object[]{this});
            } else if (d.a(d.this).getBackStackEntryCount() == 0) {
                d.this.b();
            } else {
                d.this.c();
            }
        }
    };
    private Runnable l = new Runnable() { // from class: com.taobao.android.detail.ttdetail.floatview.d.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.b(d.this).clear();
            }
        }
    };

    static {
        kge.a(114671582);
        kge.a(-767194759);
    }

    public static /* synthetic */ FragmentManager a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("fe73b573", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ void a(d dVar, Context context, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5487373", new Object[]{dVar, context, str, str2, str3, map});
        } else {
            dVar.a(context, str, str2, str3, map);
        }
    }

    public static /* synthetic */ List b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e301d0d2", new Object[]{dVar}) : dVar.i;
    }

    public static /* synthetic */ void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a0ce56", new Object[]{dVar});
        } else {
            dVar.h();
        }
    }

    public static /* synthetic */ FragmentActivity d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("a9739dea", new Object[]{dVar}) : dVar.f;
    }

    public static /* synthetic */ String e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e7519e48", new Object[]{dVar}) : dVar.g;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, iVar})).booleanValue() : a(iVar);
    }

    public d(Activity activity, eyx eyxVar) {
        this.d = new VesselWeexView(activity);
        this.f = (FragmentActivity) activity;
        this.h = eyxVar;
        a();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.j.postDelayed(this.l, 200L);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (this.d == null) {
        } else {
            this.g = str + "&_weexfloatParams=" + URLEncoder.encode(JSONObject.toJSONString(jSONObject)) + "&enableMulitMessageChannel=true";
            this.d.loadUrl(this.g, null);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f, i.class, this);
        if (this.c == null) {
            this.c = this.f.getSupportFragmentManager();
        }
        FragmentManager fragmentManager = this.c;
        if (fragmentManager != null) {
            fragmentManager.addOnBackStackChangedListener(this.k);
        }
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setOnLoadListener(new rgu() { // from class: com.taobao.android.detail.ttdetail.floatview.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                }
            }

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                } else {
                    d.c(d.this);
                }
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                    return;
                }
                d.c(d.this);
                d dVar = d.this;
                d.a(dVar, d.d(dVar), d.e(d.this), rgyVar.f33150a, rgyVar.b, null);
            }

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                    return;
                }
                d.c(d.this);
                d dVar = d.this;
                d.a(dVar, d.d(dVar), d.e(d.this), rgyVar.f33150a, rgyVar.b, map);
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.b) {
        } else {
            i();
            this.b = false;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = true;
        j();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("TTVesselWeexViewDecorator", "show");
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setVisibility(0);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("TTVesselWeexViewDecorator", "dismiss");
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setVisibility(8);
    }

    public VesselWeexView d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselWeexView) ipChange.ipc$dispatch("4196e538", new Object[]{this}) : this.d;
    }

    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this});
        }
        ViewGroup viewGroup = this.e;
        return viewGroup == null ? this.d : viewGroup;
    }

    public ViewGroup a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("67f4ed8e", new Object[]{this, viewGroup});
        }
        this.e = viewGroup;
        return viewGroup;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("TTVesselWeexViewDecorator", MessageID.onDestroy);
        g();
        this.f10650a.clear();
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView != null) {
            vesselWeexView.onDestroy();
        }
        this.j.removeCallbacks(this.l);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f, this);
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView != null) {
            vesselWeexView.setOnLoadListener(null);
        }
        FragmentManager fragmentManager = this.c;
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.removeOnBackStackChangedListener(this.k);
    }

    private void a(Context context, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c86b987", new Object[]{this, context, str, str2, str3, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str2);
        hashMap.put("errorMsg", str3);
        hashMap.put("url", str);
        ae.a(hashMap, -800023, str3);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            Object obj = jSONObject.get("operate");
            if (!(obj instanceof String) || !TextUtils.equals((String) obj, "destroy")) {
                return;
            }
            f();
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTVesselWeexViewDecorator", "postOperate", th);
        }
    }

    public boolean a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a011e7c", new Object[]{this, iVar})).booleanValue();
        }
        com.taobao.android.detail.ttdetail.utils.i.a("TTVesselWeexViewDecorator", "receiveMessage channelId=" + iVar.b() + ", mParamUrl=" + this.g);
        if (!TTFloatViewWeexModule.generateChannelId(this.g).equals(iVar.b())) {
            return false;
        }
        a(iVar.bZ_());
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }
}
