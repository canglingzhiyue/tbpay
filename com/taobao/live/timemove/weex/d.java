package com.taobao.live.timemove.weex;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.live.timemove.weex.TBLiveVideoRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.kge;
import tb.pmd;
import tb.pml;
import tb.pmm;
import tb.pnj;
import tb.pqj;
import tb.pqq;
import tb.pra;
import tb.prr;
import tb.prs;

/* loaded from: classes7.dex */
public class d implements Handler.Callback, c, d.a, d.b, com.taobao.taolive.uikit.api.a, com.taobao.taolive.uikit.api.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBLiveVideoRootView f17798a;
    private Context b;
    private int c;
    private int d;
    private String e;
    private Handler f;
    private RecModel g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private TBLOpenPlatformView m;
    private JSONObject n;
    private String o;
    private boolean p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u = true;
    private ArrayList<Integer> v = new ArrayList<>();
    private pml w;
    private b x;

    static {
        kge.a(182824628);
        kge.a(1052401205);
        kge.a(-2101054629);
        kge.a(-1636244733);
        kge.a(-1043440182);
        kge.a(-905470315);
        kge.a(1591031764);
    }

    @Override // com.taobao.taolive.uikit.api.a
    public void onInfo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f445482", new Object[]{dVar});
        } else {
            dVar.q();
        }
    }

    public static /* synthetic */ String b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f411499f", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ TBLOpenPlatformView c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLOpenPlatformView) ipChange.ipc$dispatch("ddcc9a1", new Object[]{dVar}) : dVar.m;
    }

    public static /* synthetic */ boolean d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("433c2a63", new Object[]{dVar})).booleanValue() : dVar.l;
    }

    public static /* synthetic */ b e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8b5495a", new Object[]{dVar}) : dVar.x;
    }

    public d(Context context, int i, b bVar) {
        prs.a("TBLiveNewNdView", "new TBLiveNewNdView " + this);
        this.b = context;
        this.x = bVar;
        com.android.tools.ir.runtime.c.a("com.taobao.taolive", null);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        prs.a("TBLiveNewNdView", "onCreated mLiveId:" + this.e + this);
        Context context = this.b;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.b).getWindow().addFlags(128);
        }
        this.f17798a = (TBLiveVideoRootView) LayoutInflater.from(this.b).inflate(R.layout.taolive_nd_live_player_layout, (ViewGroup) null);
        this.f17798a.whenDetachedFromWindow(new TBLiveVideoRootView.a() { // from class: com.taobao.live.timemove.weex.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.live.timemove.weex.TBLiveVideoRootView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                d.this.e();
                d.a(d.this);
            }
        });
        this.f17798a.whenVisibilityChanged(new TBLiveVideoRootView.b() { // from class: com.taobao.live.timemove.weex.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.live.timemove.weex.TBLiveVideoRootView.b
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                prs.a("TBLiveNewNdView", "onVisibilityChanged from native " + i + " mLiveId:" + d.b(d.this));
                if (i != 0) {
                    d.a(d.this);
                } else if (d.c(d.this) == null || !d.d(d.this)) {
                } else {
                    d.e(d.this).callPareFireEvent("load");
                    prs.a("TBLiveNewNdView", "fireEvent EVENT_LOAD mLiveId:" + d.b(d.this));
                }
            }
        });
        this.f = new Handler(this);
        k();
        if (r()) {
            s();
            t();
        }
        o();
    }

    @Override // com.taobao.live.timemove.weex.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        prs.a("TBLiveNewNdView", "onDispose mLiveId:" + this.e + this);
        Context context = this.b;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.b).getWindow().clearFlags(128);
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.destroy();
            this.m = null;
        }
        if (r()) {
            v();
        }
        q();
        this.h = false;
    }

    @Override // com.taobao.live.timemove.weex.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        prs.a("TBLiveNewNdView", "play mLiveId:" + this.e + this);
        this.s = true;
        l();
    }

    @Override // com.taobao.live.timemove.weex.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.s) {
            prs.a("TBLiveNewNdView", "stop false mLiveId:" + this.e);
        } else {
            TBLOpenPlatformView tBLOpenPlatformView = this.m;
            if (tBLOpenPlatformView != null) {
                tBLOpenPlatformView.stopVideo();
            }
            if (r()) {
                v();
            }
            prs.a("TBLiveNewNdView", "stop mLiveId:" + this.e + this);
        }
    }

    @Override // com.taobao.live.timemove.weex.c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        prs.a("TBLiveNewNdView", "resume mLiveId:" + this.e + this);
        m();
    }

    @Override // com.taobao.live.timemove.weex.c
    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        prs.a("TBLiveNewNdView", "getView");
        return this.f17798a;
    }

    @Override // com.taobao.live.timemove.weex.c
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        prs.a("TBLiveNewNdView", "getPlayerToken " + this.o + " mLiveId:" + this.e + this);
        return this.o;
    }

    @Override // com.taobao.live.timemove.weex.c
    public void a(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe2ff85", new Object[]{this, hashSet});
            return;
        }
        prs.a("TBLiveNewNdView", "onUpdateEvents " + hashSet + this);
        if (hashSet == null) {
            return;
        }
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if ("error".equals(next)) {
                this.j = true;
            } else if ("firstvideoframe".equals(next)) {
                this.i = true;
            } else if ("pmmsg".equals(next)) {
                this.k = true;
            } else if ("load".equals(next)) {
                this.l = true;
            }
        }
    }

    @Override // com.taobao.live.timemove.weex.c
    public void a(double d) {
        pml pmlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
            return;
        }
        Context context = this.b;
        if (context == null) {
            return;
        }
        this.c = (int) (context.getResources().getDisplayMetrics().density * d);
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null && tBLOpenPlatformView.getLayoutParams() != null) {
            this.m.getLayoutParams().width = this.c;
            this.m.invalidate();
        }
        if (r() && (pmlVar = this.w) != null && pmlVar.c() != null && this.w.c().getLayoutParams() != null) {
            this.w.a(this.c);
        }
        prs.a("TBLiveNewNdView", "setWidth value-" + d + " mWidth-" + this.c + " mLiveId:" + this.e + this);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void b(double d) {
        pml pmlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d65975", new Object[]{this, new Double(d)});
            return;
        }
        Context context = this.b;
        if (context == null) {
            return;
        }
        this.d = (int) (context.getResources().getDisplayMetrics().density * d);
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null && tBLOpenPlatformView.getLayoutParams() != null) {
            this.m.getLayoutParams().height = this.d;
            this.m.invalidate();
        }
        if (r() && (pmlVar = this.w) != null && pmlVar.c() != null && this.w.c().getLayoutParams() != null) {
            this.w.b(this.d);
        }
        prs.a("TBLiveNewNdView", "setWidth value-" + d + " mHeight-" + this.d + " mLiveId:" + this.e + this);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.q = str;
        n();
        prs.a("TBLiveNewNdView", "setPoster " + str + this);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            this.u = Boolean.parseBoolean(str);
            prs.a("TBLiveNewNdView", "setNeedPM " + str + this);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.live.timemove.weex.c
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        prs.a("TBLiveNewNdView", "WXComponentProp setMuted: " + str);
        try {
            this.p = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setMuted(this.p);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        prs.a("TBLiveNewNdView", "setMediaInfo: " + str);
        this.g = (RecModel) pqj.a(str, RecModel.class);
        RecModel recModel = this.g;
        if (recModel == null) {
            return;
        }
        recModel.contentType = "simpleLive";
        recModel.mediaType = "live";
        this.e = recModel.liveId;
        if (r()) {
            a(this.g);
        }
        w();
    }

    @Override // com.taobao.live.timemove.weex.c
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        prs.a("TBLiveNewNdView", "JSMethod setMuted: " + str);
        try {
            this.p = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setMuted(this.p);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        prs.a("TBLiveNewNdView", "JSMethod setPageId: " + obj);
    }

    @Override // com.taobao.live.timemove.weex.c
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (this.m == null) {
            return "false";
        }
        return this.m.isMuted() + "";
    }

    @Override // com.taobao.live.timemove.weex.c
    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        boolean z = this.t;
        prs.a("TBLiveNewNdView", "ignorePV " + z + " mLiveId:" + this.e);
        q();
        return String.valueOf(z);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            this.r = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
        this.h = true;
        prs.a("TBLiveNewNdView", "reusePlayer:" + str + " mLiveId:" + this.e);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void a(String str, String str2) {
        Handler handler;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        prs.a("TBLiveNewNdView", "visibilityChanged from weex " + str + " mLiveId:" + this.e);
        try {
            z = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
        if (!z || (handler = this.f) == null) {
            return;
        }
        handler.removeMessages(100);
        RecModel recModel = this.g;
        if (recModel == null || !recModel.pmSubscriber || this.g.subscriberDelay < 0) {
            return;
        }
        this.f.sendEmptyMessageDelayed(100, this.g.subscriberDelay);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        prs.a("TBLiveNewNdView", "subscribePM:" + str);
        if (str == null) {
            return;
        }
        for (String str2 : str.split(",")) {
            Integer valueOf = Integer.valueOf(str2);
            if (!this.v.contains(valueOf)) {
                this.v.add(valueOf);
            }
        }
    }

    @Override // com.taobao.live.timemove.weex.c
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        prs.a("TBLiveNewNdView", "unsubscribePM:" + str);
        if (str == null) {
            return;
        }
        for (String str2 : str.split(",")) {
            this.v.remove(Integer.valueOf(str2));
        }
    }

    @Override // com.taobao.live.timemove.weex.c
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        prs.a("TBLiveNewNdView", "unsubscribeAll");
        this.v.clear();
    }

    @Override // com.taobao.live.timemove.weex.c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setPMParams(str);
    }

    @Override // com.taobao.live.timemove.weex.c
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.updatePMParams(str);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        prs.a("TBLiveNewNdView", "createVideoViewInner mLiveId:" + this.e + " mTBLOpenPlatformView = " + this.m);
        if (this.m == null) {
            this.m = new TBLOpenPlatformView(this.b);
            this.m.setSubBusinessType("ND");
            this.m.setPlayVideo(true);
            this.m.setPageId(Integer.valueOf(this.b.hashCode()));
            this.m.setTBLiveOpenCardViewCallback(this);
            this.m.setPlayerCallback(this);
            this.m.setCloseSkipPlaySwitch(true);
            this.f17798a.addView(this.m, 0, new FrameLayout.LayoutParams(this.c, this.d));
        }
        this.m.setData(this.n);
        this.m.setMuted(this.p);
        n();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        prs.a("TBLiveNewNdView", "playStreamUrl start mLiveId:" + this.e);
        if (this.r) {
            this.r = false;
            prs.a("TBLiveNewNdView", "playStreamUrl mReusePlayer mLiveId:" + this.e);
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.playVideo();
        this.o = this.m.getRecycleToken();
        prs.a("TBLiveNewNdView", "playStreamUrl end mLiveId:" + this.e);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.playVideo();
        prs.a("TBLiveNewNdView", "resumePlay mLiveId:" + this.e);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setPlayerCover(this.q, R.drawable.tbliveuikit_nd_tab_bg);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        prs.a("TBLiveNewNdView", "tryWarmPlayer mLiveId:" + this.e);
        if (this.m == null || !prr.z()) {
            return;
        }
        this.m.warmVideo();
    }

    @Override // com.taobao.taolive.uikit.api.b
    public void onMediaError(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        prs.a("TBLiveNewNdView", "onError " + i + " mLiveId:" + this.e);
        if (!this.j) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("message", "");
        this.x.callPareFireEvent("error", hashMap);
        prs.a("TBLiveNewNdView", "fireEvent EVENT_ERROR mLiveId:" + this.e);
    }

    @Override // com.taobao.taolive.uikit.api.b
    public void onMediaInfo(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (((int) j) != 3) {
        } else {
            prs.a("TBLiveNewNdView", "onInfo MEDIA_INFO_VIDEO_RENDERING_START mLiveId:" + this.e);
            if (!this.i) {
                return;
            }
            this.x.callPareFireEvent("firstvideoframe");
            if (!r()) {
                return;
            }
            u();
        }
    }

    @Override // com.taobao.taolive.uikit.api.a
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        prs.a("TBLiveNewNdView", "onError " + i + " mLiveId:" + this.e);
        if (!this.j) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("message", "");
        this.x.callPareFireEvent("error", hashMap);
        prs.a("TBLiveNewNdView", "fireEvent EVENT_ERROR mLiveId:" + this.e);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 100) {
            p();
        }
        return false;
    }

    private void p() {
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        if (this.u && (recModel = this.g) != null && recModel.liveInfo != null && this.g.liveInfo.roomStatus == 1 && !this.h) {
            this.m.startSubscribePM("NDLiveTab", this.g.liveInfo.roomStatus == 1);
            this.m.addPowerMessageInterceptor(this);
            this.t = true;
            prs.a("TBLiveNewNdView", "initPM mLiveId:" + this.e);
        }
        this.h = false;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(100);
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.m;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.stopSubscribePM();
        }
        this.t = false;
        prs.a("TBLiveNewNdView", "destroyPM mLiveId:" + this.e);
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 1004) {
            RecModel recModel2 = this.g;
            if (recModel2 == null) {
                return;
            }
            recModel2.roomStatus = 2;
            if (!this.k) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", Integer.valueOf(i));
            hashMap.put("message", "");
            this.x.callPareFireEvent("pmmsg", hashMap);
            prs.a("TBLiveNewNdView", "fireEvent EVENT_PMMSG MSG_TYPE_LIVE_END mLiveId:" + this.e);
        } else if (i != 1006 || (recModel = this.g) == null) {
        } else {
            recModel.roomStatus = 0;
            if (!this.k) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", Integer.valueOf(i));
            hashMap2.put("message", "");
            this.x.callPareFireEvent("pmmsg", hashMap2);
            prs.a("TBLiveNewNdView", "fireEvent EVENT_PMMSG MSG_TYPE_ANCHOR_LEAVE mLiveId:" + this.e);
        }
    }

    @Override // com.taobao.taolive.sdk.core.d
    public boolean onInterceptPowerMessage(TLiveMsg tLiveMsg) {
        ArrayList<Integer> arrayList;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca817c1", new Object[]{this, tLiveMsg})).booleanValue();
        }
        if (tLiveMsg != null && (arrayList = this.v) != null && arrayList.contains(Integer.valueOf(tLiveMsg.type))) {
            pnj m = pmd.a().m();
            m.b("TBLiveNewNdView", "onInterceptPowerMessage = " + JSON.toJSONString(tLiveMsg));
            switch (tLiveMsg.type) {
                case 10101:
                case 10103:
                case 10104:
                case 10105:
                    try {
                        str = JSON.toJSONString(tLiveMsg.data);
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        str = "";
                        break;
                    }
                case 10102:
                default:
                    str = new String(tLiveMsg.data);
                    break;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("messageType", Integer.valueOf(tLiveMsg.type));
            hashMap.put("payload", str);
            this.x.callPareFireEvent("receivepm", hashMap);
        }
        return false;
    }

    private boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : prr.I() && pra.e();
    }

    private void s() {
        pmm D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.w != null || (D = pmd.a().D()) == null) {
        } else {
            this.w = D.a();
            this.w.a(this.b);
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        pml pmlVar = this.w;
        if (pmlVar == null || pmlVar.c() == null || this.f17798a == null) {
            return;
        }
        this.f17798a.addView(this.w.c(), -1, new FrameLayout.LayoutParams(this.c, this.d));
    }

    private void a(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaca0f78", new Object[]{this, recModel});
        } else if (recModel == null || recModel.atmosphereInfo == null) {
        } else {
            s();
            if (this.w == null) {
                return;
            }
            recModel.atmosphereInfo.put(DnsNavConfigTask.MatchKey, (Object) "newdetail_atmosphere_effectvideotext");
            this.w.a(recModel.atmosphereInfo);
        }
    }

    private void u() {
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        pml pmlVar = this.w;
        if (pmlVar == null || pmlVar.c() == null || (recModel = this.g) == null || this.f17798a == null || recModel.atmosphereInfo == null) {
            return;
        }
        this.w.a();
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        pml pmlVar = this.w;
        if (pmlVar == null || pmlVar.c() == null || this.f17798a.indexOfChild(this.w.c()) == -1) {
            return;
        }
        this.f17798a.removeView(this.w.c());
        this.w.b();
        this.w = null;
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (this.g == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedId", (Object) this.g.liveId);
            jSONObject.put("liveUrlList", (Object) JSONArray.parseArray(JSON.toJSONString(this.g.liveUrlList)));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("roomStatus", (Object) "1");
            jSONObject2.put("queryParams", (Object) jSONObject);
            this.n = new JSONObject();
            this.n.put("playParams", (Object) jSONObject2);
            this.n.put("topic", (Object) this.g.topic);
            this.n.put("feed_id", (Object) this.g.liveId);
            this.n.put("account_id", (Object) this.g.accountId);
            this.n.put(pqq.KEY_LIVE_SOURCE, (Object) "newdetail_2022");
            this.n.put("entry_source", (Object) "newdetail_2022");
            this.n.put("spm_url", (Object) "a2141.22412911");
            this.n.put("liveStatus", (Object) Integer.valueOf(this.g.roomStatus));
            this.n.put("playerScene", (Object) "NewDetailLive");
            if (this.g.liveInfo != null) {
                this.n.put("roomType", (Object) String.valueOf(this.g.liveInfo.roomType));
                this.n.put("newRoomType", (Object) String.valueOf(this.g.liveInfo.newRoomType));
                this.n.put("streamStatus", (Object) String.valueOf(this.g.liveInfo.streamStatus));
            }
            this.n.put("roomStatus", (Object) String.valueOf(this.g.roomStatus));
            this.n.put("trackInfo", (Object) this.g.trackInfo);
            this.n.put("liveServerParams", (Object) this.g.liveServerParams);
        }
    }
}
