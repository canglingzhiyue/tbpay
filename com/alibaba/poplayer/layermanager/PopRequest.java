package com.alibaba.poplayer.layermanager;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import tb.bzt;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class PopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f3190a;
    public String c;
    private final String f;
    private View g;
    private a h;
    private b i;
    private String j;
    private Map<String, Object> k;
    private Map<String, Object> l;
    public String n;
    public JSONObject o;
    private int m = 0;
    private Status d = Status.WAITING;
    public OnePopModule b = new OnePopModule();

    /* loaded from: classes3.dex */
    public enum Status {
        WAITING,
        READY,
        ENQUEUED,
        REMOVED,
        FORCE_REMOVED,
        SUSPENDED,
        SHOWING
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(PopRequest popRequest);

        void b(PopRequest popRequest);

        void c(PopRequest popRequest);
    }

    /* loaded from: classes.dex */
    public interface c extends b {
        void d(PopRequest popRequest);

        void e(PopRequest popRequest);
    }

    static {
        kge.a(598818691);
    }

    public abstract String H();

    public abstract boolean I();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public Activity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this}) : (Activity) com.alibaba.poplayer.utils.g.a(this.f3190a);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.f3190a = new WeakReference<>(activity);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (com.alibaba.poplayer.utils.g.a(this.f3190a.get()) && o()) {
            z = true;
        }
        if (!z) {
            return;
        }
        this.m = com.alibaba.poplayer.utils.g.a(PopLayer.getReference().getApp());
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.m;
    }

    public Status e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Status) ipChange.ipc$dispatch("c301dfaa", new Object[]{this}) : this.d;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.d == Status.REMOVED || this.d == Status.FORCE_REMOVED;
    }

    public View g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d6895230", new Object[]{this}) : this.g;
    }

    public a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2a403d36", new Object[]{this}) : this.h;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2343997", new Object[]{this, aVar});
        } else {
            this.h = aVar;
        }
    }

    public b i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5818d7b4", new Object[]{this}) : this.i;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.f;
    }

    public void a(Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cc58a6", new Object[]{this, status});
        } else {
            this.d = status;
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.g = view;
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public Map<String, Object> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this}) : this.k;
    }

    public Map<String, Object> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this}) : this.l;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : com.alibaba.poplayer.factory.a.a().b();
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.j;
    }

    public void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
            return;
        }
        this.j = str;
        a(activity);
        b();
        View view = this.g;
        if (!(view instanceof PopLayerBaseView)) {
            return;
        }
        try {
            ((PopLayerBaseView) view).resetContext(activity);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public JSONObject G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7193fc6e", new Object[]{this}) : this.o;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.o = jSONObject;
        }
    }

    public OnePopModule t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnePopModule) ipChange.ipc$dispatch("1cb93082", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new OnePopModule();
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public PopRequest(String str, Activity activity, String str2, b bVar, int i, boolean z, boolean z2, boolean z3) {
        this.f = str;
        this.i = bVar;
        this.j = str2;
        try {
            this.c = UUID.randomUUID().toString().replace("-", "");
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopRequest.init popTraceId.error.", th);
        }
        a(activity);
        a(new a(i, z, z2, z3));
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        try {
            if (bzt.a().a(com.alibaba.poplayer.trigger.d.a(this), 0) < 0) {
                com.alibaba.poplayer.utils.c.a("increaseReadTimes.alreadyFinished.notToIncrease", "");
                return;
            }
            OnePopModule onePopModule = this.b;
            onePopModule.Q = (Integer.parseInt(this.b.Q) + 1) + "";
            bzt.a().a(com.alibaba.poplayer.trigger.d.a(this));
            com.alibaba.poplayer.info.frequency.b.e().b(com.alibaba.poplayer.trigger.d.c(this));
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopRequest.increaseTimes.error.", th);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        try {
            this.b.R = "true";
            bzt.a().b(com.alibaba.poplayer.trigger.d.a(this));
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopRequest.finishPop.error.", th);
        }
    }

    /* loaded from: classes3.dex */
    public static class a {
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;

        static {
            kge.a(-1956657955);
        }

        public a(int i, boolean z, boolean z2, boolean z3) {
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public a() {
        }
    }
}
