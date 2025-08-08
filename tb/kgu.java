package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.b;
import com.taobao.tbpoplayer.nativerender.d;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.f;
import com.taobao.tbpoplayer.nativerender.j;
import com.taobao.tbpoplayer.nativerender.q;
import java.util.List;
import java.util.Map;
import tb.kgu;

/* loaded from: classes7.dex */
public class kgu extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private b f30059a;
    private String b;
    private String c;
    private a d;
    private e f;
    private kgw g;
    private Runnable j;
    private volatile boolean h = false;
    private volatile boolean i = false;
    private Handler e = new Handler(Looper.getMainLooper());

    /* loaded from: classes7.dex */
    public interface a {
        void a(b bVar, View view);

        void a(b bVar, String str, String str2);

        void b(b bVar, View view);

        void b(b bVar, String str, String str2);
    }

    static {
        kge.a(-202943611);
    }

    public static /* synthetic */ Object ipc$super(kgu kguVar, String str, Object... objArr) {
        if (str.hashCode() == 1101276053) {
            super.a((ComponentBaseModel) objArr[0], (String) objArr[1], (ActionModel) objArr[2], (List) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$5lan0Fo4D-ydGdb_nBXEHFBsn0M */
    public static /* synthetic */ void m2461lambda$5lan0Fo4DydGdb_nBXEHFBsn0M(kgu kguVar, boolean z, String str, String str2) {
        kguVar.a(z, str, str2);
    }

    /* renamed from: lambda$MiIHa-7CGAny_hRjDR-sAtHlwwM */
    public static /* synthetic */ void m2462lambda$MiIHa7CGAny_hRjDRsAtHlwwM(kgu kguVar) {
        kguVar.l();
    }

    public static /* synthetic */ void lambda$Xpwb359XpoS9VGEwcDCTPd37_ko(kgu kguVar) {
        kguVar.j();
    }

    public static /* synthetic */ void lambda$wuH12TnIhAE4C9wIBD0HBrxEdIs(kgu kguVar) {
        kguVar.k();
    }

    public static /* synthetic */ e a(kgu kguVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("f4cd4755", new Object[]{kguVar}) : kguVar.f;
    }

    public static /* synthetic */ kgw b(kgu kguVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kgw) ipChange.ipc$dispatch("b86f832b", new Object[]{kguVar}) : kguVar.g;
    }

    public static /* synthetic */ b c(kgu kguVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("801569cb", new Object[]{kguVar}) : kguVar.f30059a;
    }

    public kgu(Context context, b bVar, String str, String str2, Map<String, String> map, a aVar) {
        this.f30059a = bVar;
        this.b = str;
        this.c = str2;
        this.d = aVar;
        this.f = new e(context, this.e, 1, this);
        this.g = new kgw(this.f);
        this.f.a().a(map);
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (StringUtils.isEmpty(this.c)) {
        } else {
            try {
                this.f.a().f().put("initServerParam", (Object) JSON.parseObject(this.c));
            } catch (Throwable unused) {
                kgz.a("NativeWidgetEngine.parseLaunchParam.error.", new Object[0]);
            }
            a(kgt.EVENT_HOVER, new JSONObject());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kgz.a("DSLFetcher.fetchDSL.dsl=%s", this.b);
        if (StringUtils.isEmpty(this.b)) {
            this.f.a("DSL_EMPTY", "");
            return;
        }
        try {
            DSLModel dSLModel = (DSLModel) JSONObject.parseObject(this.b, DSLModel.class);
            if (!dSLModel.isValid()) {
                this.f.a("DSL_INVALID", "");
                return;
            }
            this.f.a().a(dSLModel);
            if (!com.taobao.tbpoplayer.nativerender.b.a(dSLModel.condition, this.f, true)) {
                this.f.a("DisplayConditionCheckNotPass", "", (String) null);
                return;
            }
            Pair<StateModel, StateVersionModel> b = this.f.b(null, dSLModel.startStates, false, false);
            if (b == null || b.first == null) {
                this.f.a("GetFirstStateVerFailed", "");
            } else if (this.g.a((StateModel) b.first, (StateVersionModel) b.second) == null) {
                this.f.a("InitStateViewError", "");
            } else {
                this.h = true;
                d();
                if (this.i) {
                    return;
                }
                this.j = new Runnable() { // from class: tb.-$$Lambda$kgu$MiIHa-7CGAny_hRjDR-sAtHlwwM
                    @Override // java.lang.Runnable
                    public final void run() {
                        kgu.m2462lambda$MiIHa7CGAny_hRjDRsAtHlwwM(kgu.this);
                    }
                };
                this.e.postDelayed(this.j, 60000L);
            }
        } catch (Throwable unused) {
            this.f.a("DSL_INVALID_CATCH_ERROR", "");
        }
    }

    public /* synthetic */ void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            if (this.f.a().z() <= 0 || this.i) {
                return;
            }
            this.f.a("LoadResOutOfTime", "");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str, str2, "");
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.f.a().a(true);
            this.d.a(this.f30059a, str, str2);
            i();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kgz.a("FloatWindowRenderEngine.onImageLoaded", new Object[0]);
        this.f.a().x();
        d();
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            kgz.a("FloatWindowRenderEngine.onRenderStart", new Object[0]);
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void a(final String str, final String str2, final boolean z, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae22edf1", new Object[]{this, str, str2, new Boolean(z), jVar});
            return;
        }
        kgz.a("FloatWindowRenderEngine.needClose.reason=%s.closeMessage=%s.", str, str2);
        this.f.b(new Runnable() { // from class: tb.-$$Lambda$kgu$5lan0Fo4D-ydGdb_nBXEHFBsn0M
            @Override // java.lang.Runnable
            public final void run() {
                kgu.m2461lambda$5lan0Fo4DydGdb_nBXEHFBsn0M(kgu.this, z, str, str2);
            }
        });
    }

    public /* synthetic */ void a(final boolean z, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        try {
            if (this.f.a().g()) {
                return;
            }
            a(new e.b() { // from class: tb.-$$Lambda$kgu$DTVcPr24E5UvlK98ExRUQ_8jfhQ
                @Override // com.taobao.tbpoplayer.nativerender.e.b
                public final void onPreCloseDone(boolean z2) {
                    kgu.this.a(z, str, str2, z2);
                }
            });
        } catch (Throwable unused) {
            this.f.a().a(true);
            a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.b(this.f30059a, str, str2);
        }
    }

    public /* synthetic */ void a(boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a744054", new Object[]{this, new Boolean(z), str, str2, new Boolean(z2)});
        } else if (z && z2) {
            kgz.a("FloatWindowRenderEngine.needClose.runBeforeClose.interrupt=%s.", Boolean.valueOf(z2));
        } else {
            this.f.a().a(true);
            a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.b(this.f30059a, str, str2);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject f = this.f.a().f();
        if (!StringUtils.isEmpty(str) && str.equals(kgt.EVENT_HIT_WALL)) {
            f.put("lastHitWall", (Object) jSONObject);
            return;
        }
        f.put("gestureStatus", (Object) str);
        f.put("gestureStatusParams", (Object) jSONObject);
    }

    public void b(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
        } else {
            this.f.b(new Runnable() { // from class: tb.-$$Lambda$kgu$rAwB_LnXXqcVD3O8syxoeb9YcdY
                @Override // java.lang.Runnable
                public final void run() {
                    kgu.this.c(str, jSONObject);
                }
            });
        }
    }

    public /* synthetic */ void c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a262bc", new Object[]{this, str, jSONObject});
            return;
        }
        try {
            this.g.a(str, jSONObject);
        } catch (Throwable th) {
            kgz.a("onReceiveEvent.error.", th);
        }
    }

    private void a(final e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad932ea8", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.g.a(new e.b() { // from class: tb.-$$Lambda$kgu$18gtnJ5i0_gJgwtE_Wc726cej3A
                @Override // com.taobao.tbpoplayer.nativerender.e.b
                public final void onPreCloseDone(boolean z) {
                    kgu.this.a(bVar, z);
                }
            });
        }
    }

    public /* synthetic */ void a(e.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3592c", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        e eVar = this.f;
        boolean a2 = kgx.a(eVar, this.f30059a, eVar.a().e().triggerActions);
        kgz.a("FloatWindowRenderEngine.runBeforeClose.handleBeforeClose.animateInterrupt=%s.actionInterrupt=%s", Boolean.valueOf(z), Boolean.valueOf(a2));
        if (!z && !a2) {
            z2 = false;
        }
        bVar.onPreCloseDone(z2);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if ((this.f.a().y() != 0 && this.f.a().z() > 0) || this.i || !this.h || this.f.a().g()) {
        } else {
            this.i = true;
            this.f.a(new Runnable() { // from class: tb.-$$Lambda$kgu$Xpwb359XpoS9VGEwcDCTPd37_ko
                @Override // java.lang.Runnable
                public final void run() {
                    kgu.lambda$Xpwb359XpoS9VGEwcDCTPd37_ko(kgu.this);
                }
            });
        }
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            d a2 = this.f.a();
            if (a2.g()) {
                kgz.a("FloatWindowRenderEngine.tryDisplay.isEngineClosed.return.", new Object[0]);
                return;
            }
            this.d.a(this.f30059a, this.g.c());
            this.g.a();
            kgx.a(this.f, this.f30059a, "expose", a2.e().triggerActions);
            kgx.a(this.f, this.f30059a, "autoCountDown", a2.e().triggerActions);
            long j = this.f.a().e().autoCloseTime;
            if (j >= 1000) {
                this.e.postDelayed(new Runnable() { // from class: tb.-$$Lambda$kgu$wuH12TnIhAE4C9wIBD0HBrxEdIs
                    @Override // java.lang.Runnable
                    public final void run() {
                        kgu.lambda$wuH12TnIhAE4C9wIBD0HBrxEdIs(kgu.this);
                    }
                }, j);
            }
            q.a(this.f);
        } catch (Throwable th) {
            kgz.a("FloatWindowRenderEngine.tryDisplay.runInGlobalThread.error", th);
            this.f.a("LOAD_BITMAP_ERROR", String.valueOf(th.getMessage()));
        }
    }

    public /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.f.a("AutoClose", "", false, (j) null);
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void a(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a42395", new Object[]{this, componentBaseModel, str, actionModel, list});
            return;
        }
        super.a(componentBaseModel, str, actionModel, list);
        kgv.a(this.f, this.f30059a, componentBaseModel, str, actionModel, list);
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public boolean a(List<String> list, List<String> list2, boolean z, boolean z2) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("633e544e", new Object[]{this, list, list2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            kgz.a("needSwitchState.noTargetStateIds.return", new Object[0]);
            return false;
        }
        Pair<StateModel, StateVersionModel> b = this.f.b(list, list2, z, z2);
        if (b == null || b.first == null || (a2 = this.g.a((StateModel) b.first, (StateVersionModel) b.second)) == null) {
            return false;
        }
        this.d.b(this.f30059a, a2);
        a2.addOnAttachStateChangeListener(new AnonymousClass1(a2));
        return true;
    }

    /* renamed from: tb.kgu$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ View f30060a;

        public static /* synthetic */ void lambda$eGlNcuskDRc5zvZhmDDaIwnLA9s(AnonymousClass1 anonymousClass1) {
            anonymousClass1.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }

        public AnonymousClass1(View view) {
            kgu.this = r1;
            this.f30060a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            kgu.a(kgu.this).b(new Runnable() { // from class: tb.-$$Lambda$kgu$1$eGlNcuskDRc5zvZhmDDaIwnLA9s
                @Override // java.lang.Runnable
                public final void run() {
                    kgu.AnonymousClass1.lambda$eGlNcuskDRc5zvZhmDDaIwnLA9s(kgu.AnonymousClass1.this);
                }
            });
            this.f30060a.removeOnAttachStateChangeListener(this);
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                kgu.b(kgu.this).b();
                StateBaseModel k = kgu.a(kgu.this).a().k();
                kgx.a(kgu.a(kgu.this), kgu.c(kgu.this), "expose", k.triggerActions);
                kgx.a(kgu.a(kgu.this), kgu.c(kgu.this), "autoCountDown", k.triggerActions);
            } catch (Throwable th) {
                kgz.a("FloatWindowRenderEngine.onSwitchState.error", th);
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public View a(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("85c77a10", new Object[]{this, stateModel, stateVersionModel}) : this.g.a(stateModel, stateVersionModel);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.g.d();
        Runnable runnable = this.j;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
        this.d = null;
    }
}
