package com.taobao.avplayer;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.common.DWScreenOrientationListenerImp;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.net.URI;
import java.util.List;
import java.util.Map;
import tb.ado;
import tb.dde;
import tb.kcl;
import tb.kge;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* loaded from: classes6.dex */
public class DWVideoViewController implements at, aw, com.taobao.avplayer.common.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float B;
    private Runnable C;
    private DWScreenOrientationListenerImp G;
    private b H;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16418a;
    public boolean b;
    public DWScreenOrientationListenerImp.Orientation c;
    private DWContext d;
    private com.taobao.avplayer.player.a e;
    private int f;
    private FrameLayout g;
    private boolean h;
    private a i;
    private int j;
    private int k;
    private AnimatorSet l;
    private AnimatorSet m;
    private int o;
    private Handler p;
    private ViewGroup r;
    private ViewGroup s;
    private boolean t;
    private boolean u;
    private float v;
    private float w;
    private volatile boolean x;
    private int[] n = new int[2];
    private final int q = 200;
    private boolean y = true;
    private boolean z = true;
    private boolean A = true;
    private int D = 0;
    private DWVideoScreenType2 E = DWVideoScreenType2.NORMAL;
    private DWVideoScreenType2 F = DWVideoScreenType2.NORMAL;

    /* loaded from: classes6.dex */
    public enum FullOritation {
        LANDSCAPE_FULL90_TO_PORTRAIT_FULL("landscape90_portrait"),
        LANDSCAPE_FULL270_TO_PORTRAIT_FULL("landscape270_portrait"),
        LANDSCAPE_FULL90_TO_LANDSCAPE_FULL270("landscape90_landscape270"),
        LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90("landscape270_landscape90"),
        PORTRAIT_FULL_TO_LANDSCAPE_FULL270("portrait_landscape270"),
        PORTRAIT_FULL_TO_LANDSCAPE_FULL90("portrait_landscape90");
        
        private String value;

        FullOritation(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    static {
        kge.a(479368931);
        kge.a(-1335059451);
        kge.a(-19190688);
        kge.a(-123403623);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ int a(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae7d149", new Object[]{dWVideoViewController})).intValue();
        }
        int i = dWVideoViewController.D;
        dWVideoViewController.D = i + 1;
        return i;
    }

    public static /* synthetic */ int a(DWVideoViewController dWVideoViewController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7212cc60", new Object[]{dWVideoViewController, new Integer(i)})).intValue();
        }
        dWVideoViewController.f = i;
        return i;
    }

    public static /* synthetic */ DWVideoScreenType2 a(DWVideoViewController dWVideoViewController, DWVideoScreenType2 dWVideoScreenType2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("53b5a0", new Object[]{dWVideoViewController, dWVideoScreenType2});
        }
        dWVideoViewController.E = dWVideoScreenType2;
        return dWVideoScreenType2;
    }

    public static /* synthetic */ void a(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0d5554", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.c(fullOritation);
        }
    }

    public static /* synthetic */ void a(DWVideoViewController dWVideoViewController, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04f2e56", new Object[]{dWVideoViewController, new Boolean(z), new Boolean(z2)});
        } else {
            dWVideoViewController.a(z, z2);
        }
    }

    public static /* synthetic */ boolean a(DWVideoViewController dWVideoViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72130c42", new Object[]{dWVideoViewController, new Boolean(z)})).booleanValue();
        }
        dWVideoViewController.t = z;
        return z;
    }

    public static /* synthetic */ float b(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("24b27325", new Object[]{dWVideoViewController})).floatValue() : dWVideoViewController.B;
    }

    public static /* synthetic */ DWVideoScreenType2 b(DWVideoViewController dWVideoViewController, DWVideoScreenType2 dWVideoScreenType2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("7360b1e1", new Object[]{dWVideoViewController, dWVideoScreenType2});
        }
        dWVideoViewController.F = dWVideoScreenType2;
        return dWVideoScreenType2;
    }

    public static /* synthetic */ void b(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d94f855", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.a(fullOritation);
        }
    }

    public static /* synthetic */ boolean b(DWVideoViewController dWVideoViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("719ca643", new Object[]{dWVideoViewController, new Boolean(z)})).booleanValue();
        }
        dWVideoViewController.u = z;
        return z;
    }

    public static /* synthetic */ int c(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e7d1507", new Object[]{dWVideoViewController})).intValue() : dWVideoViewController.D;
    }

    public static /* synthetic */ void c(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511c9b56", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.d(fullOritation);
        }
    }

    public static /* synthetic */ boolean c(DWVideoViewController dWVideoViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71264044", new Object[]{dWVideoViewController, new Boolean(z)})).booleanValue();
        }
        dWVideoViewController.x = z;
        return z;
    }

    public static /* synthetic */ com.taobao.avplayer.player.a d(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.player.a) ipChange.ipc$dispatch("db8c2f99", new Object[]{dWVideoViewController}) : dWVideoViewController.e;
    }

    public static /* synthetic */ void d(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a43e57", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.b(fullOritation);
        }
    }

    public static /* synthetic */ void d(DWVideoViewController dWVideoViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70afda41", new Object[]{dWVideoViewController, new Boolean(z)});
        } else {
            dWVideoViewController.d(z);
        }
    }

    public static /* synthetic */ Runnable e(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("8f832782", new Object[]{dWVideoViewController}) : dWVideoViewController.C;
    }

    public static /* synthetic */ void e(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582be158", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.e(fullOritation);
        }
    }

    public static /* synthetic */ Handler f(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("85b5ac75", new Object[]{dWVideoViewController}) : dWVideoViewController.p;
    }

    public static /* synthetic */ DWContext g(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("8cf04f6b", new Object[]{dWVideoViewController}) : dWVideoViewController.d;
    }

    public static /* synthetic */ DWVideoScreenType2 h(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWVideoScreenType2) ipChange.ipc$dispatch("c1d293cc", new Object[]{dWVideoViewController}) : dWVideoViewController.F;
    }

    public static /* synthetic */ DWVideoScreenType2 i(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWVideoScreenType2) ipChange.ipc$dispatch("3059a50d", new Object[]{dWVideoViewController}) : dWVideoViewController.E;
    }

    public static /* synthetic */ AnimatorSet j(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("969066ee", new Object[]{dWVideoViewController}) : dWVideoViewController.l;
    }

    public static /* synthetic */ ViewGroup k(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("718d2889", new Object[]{dWVideoViewController}) : dWVideoViewController.r;
    }

    public static /* synthetic */ int l(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("669cc5de", new Object[]{dWVideoViewController})).intValue() : dWVideoViewController.j;
    }

    public static /* synthetic */ int m(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a06767bd", new Object[]{dWVideoViewController})).intValue() : dWVideoViewController.k;
    }

    public static /* synthetic */ boolean n(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da3209ad", new Object[]{dWVideoViewController})).booleanValue() : dWVideoViewController.t;
    }

    public static /* synthetic */ boolean o(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13fcab8c", new Object[]{dWVideoViewController})).booleanValue() : dWVideoViewController.u;
    }

    public static /* synthetic */ void p(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc74d67", new Object[]{dWVideoViewController});
        } else {
            dWVideoViewController.G();
        }
    }

    public static /* synthetic */ void q(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8791ef46", new Object[]{dWVideoViewController});
        } else {
            dWVideoViewController.H();
        }
    }

    public static /* synthetic */ int[] r(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("6a35945f", new Object[]{dWVideoViewController}) : dWVideoViewController.n;
    }

    public static /* synthetic */ ViewGroup s(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8aeac291", new Object[]{dWVideoViewController}) : dWVideoViewController.s;
    }

    public static /* synthetic */ FrameLayout t(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("2b5b3e16", new Object[]{dWVideoViewController}) : dWVideoViewController.g;
    }

    public static /* synthetic */ void u(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebc76c2", new Object[]{dWVideoViewController});
        } else {
            dWVideoViewController.J();
        }
    }

    public static /* synthetic */ float v(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8871891", new Object[]{dWVideoViewController})).floatValue() : dWVideoViewController.v;
    }

    public static /* synthetic */ float w(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e251ba70", new Object[]{dWVideoViewController})).floatValue() : dWVideoViewController.w;
    }

    public static /* synthetic */ void x(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1c5c5f", new Object[]{dWVideoViewController});
        } else {
            dWVideoViewController.K();
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DWScreenOrientationListenerImp dWScreenOrientationListenerImp = this.G;
        if (dWScreenOrientationListenerImp == null) {
            return;
        }
        dWScreenOrientationListenerImp.disable();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DWScreenOrientationListenerImp dWScreenOrientationListenerImp = this.G;
        if (dWScreenOrientationListenerImp == null) {
            return;
        }
        dWScreenOrientationListenerImp.enable();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d.screenType() == DWVideoScreenType.NORMAL) {
            this.f16418a = true;
        } else {
            this.b = true;
        }
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("dw volumeFadeIn try to setVolume, mMute=");
        sb.append(this.h);
        sb.append(",mVolume=");
        sb.append(this.B);
        sb.append(",!mOpenVolumeFadeIn=");
        sb.append(!this.A);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        if (this.h || this.B == 0.0f || !this.A || !this.z) {
            return;
        }
        this.z = false;
        this.D = 0;
        if (this.C == null) {
            this.C = new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DWVideoViewController.a(DWVideoViewController.this);
                    DWVideoViewController.d(DWVideoViewController.this).a(DWVideoViewController.b(DWVideoViewController.this) * ((DWVideoViewController.c(DWVideoViewController.this) * 0.2f) + 0.2f));
                    if (DWVideoViewController.c(DWVideoViewController.this) >= 4) {
                        return;
                    }
                    DWVideoViewController.f(DWVideoViewController.this).postDelayed(DWVideoViewController.e(DWVideoViewController.this), 500L);
                }
            };
        }
        this.p.postDelayed(this.C, 500L);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            F();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else {
            F();
        }
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this});
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return null;
        }
        return aVar.F();
    }

    public boolean l() {
        AnimatorSet animatorSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        AnimatorSet animatorSet2 = this.l;
        return (animatorSet2 == null || !animatorSet2.isRunning()) && ((animatorSet = this.m) == null || !animatorSet.isRunning()) && !this.x;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(i, i2);
    }

    public DWVideoViewController(DWContext dWContext, boolean z) {
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWVideoViewController);
        this.p = new Handler();
        this.d = dWContext;
        if (!this.d.needAD() && !TextUtils.isEmpty(this.d.getVideoToken())) {
            DWContext dWContext2 = this.d;
            this.e = new com.taobao.avplayer.player.c(dWContext2, true, dWContext2.getVideoToken());
        } else {
            this.e = new com.taobao.avplayer.player.c(this.d, true);
        }
        this.e.a(z);
        this.e.a((aw) this);
        if (!this.d.isActivityToggleForLandscape()) {
            try {
                this.G = new DWScreenOrientationListenerImp(this.d.getActivity());
                this.G.a(new DWScreenOrientationListenerImp.a() { // from class: com.taobao.avplayer.DWVideoViewController.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.avplayer.common.DWScreenOrientationListenerImp.a
                    public void a(DWScreenOrientationListenerImp.Orientation orientation) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("522bc488", new Object[]{this, orientation});
                            return;
                        }
                        DWVideoViewController dWVideoViewController = DWVideoViewController.this;
                        dWVideoViewController.c = orientation;
                        if (!dWVideoViewController.l()) {
                            return;
                        }
                        if ((orientation == DWScreenOrientationListenerImp.Orientation.LANDSCAPE_90 || orientation == DWScreenOrientationListenerImp.Orientation.LANDSCAPE_270) && DWVideoViewController.g(DWVideoViewController.this).screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN && DWVideoViewController.this.f16418a) {
                            DWVideoViewController.this.f16418a = false;
                        } else if (orientation == DWScreenOrientationListenerImp.Orientation.PORTRAIT && DWVideoViewController.g(DWVideoViewController.this).screenType() == DWVideoScreenType.NORMAL && DWVideoViewController.this.b) {
                            DWVideoViewController.this.b = false;
                        }
                        if (orientation == DWScreenOrientationListenerImp.Orientation.PORTRAIT && DWVideoViewController.g(DWVideoViewController.this).screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN && !DWVideoViewController.this.f16418a) {
                            if (DWVideoViewController.h(DWVideoViewController.this) == DWVideoScreenType2.PORTRAIT_FULL_SCREEN) {
                                DWVideoViewController dWVideoViewController2 = DWVideoViewController.this;
                                DWVideoViewController.a(dWVideoViewController2, DWVideoViewController.i(dWVideoViewController2) == DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90 ? FullOritation.LANDSCAPE_FULL90_TO_PORTRAIT_FULL : FullOritation.LANDSCAPE_FULL270_TO_PORTRAIT_FULL);
                            } else {
                                DWVideoViewController.this.s();
                            }
                            DWVideoViewController dWVideoViewController3 = DWVideoViewController.this;
                            dWVideoViewController3.f16418a = false;
                            dWVideoViewController3.b = false;
                        } else if (orientation == DWScreenOrientationListenerImp.Orientation.LANDSCAPE_90 && DWVideoViewController.g(DWVideoViewController.this).screenType() == DWVideoScreenType.NORMAL && !DWVideoViewController.this.b) {
                            DWVideoViewController.a(DWVideoViewController.this, false, false);
                            if (DWVideoViewController.g(DWVideoViewController.this).isActivityToggleForLandscape()) {
                                DWVideoViewController dWVideoViewController4 = DWVideoViewController.this;
                                DWVideoViewController.a(dWVideoViewController4, kcl.a(DWVideoViewController.g(dWVideoViewController4).getWindow() == null ? DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow() : DWVideoViewController.g(DWVideoViewController.this).getWindow()));
                                return;
                            }
                            DWVideoViewController dWVideoViewController5 = DWVideoViewController.this;
                            DWVideoViewController.a(dWVideoViewController5, kcl.a(DWVideoViewController.g(dWVideoViewController5).getWindow() == null ? DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow() : DWVideoViewController.g(DWVideoViewController.this).getWindow()));
                        } else if (orientation == DWScreenOrientationListenerImp.Orientation.LANDSCAPE_270 && DWVideoViewController.g(DWVideoViewController.this).screenType() == DWVideoScreenType.NORMAL && !DWVideoViewController.this.b) {
                            DWVideoViewController.a(DWVideoViewController.this, false, true);
                            if (DWVideoViewController.g(DWVideoViewController.this).isActivityToggleForLandscape()) {
                                DWVideoViewController dWVideoViewController6 = DWVideoViewController.this;
                                DWVideoViewController.a(dWVideoViewController6, kcl.a(DWVideoViewController.g(dWVideoViewController6).getWindow() == null ? DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow() : DWVideoViewController.g(DWVideoViewController.this).getWindow()));
                                return;
                            }
                            DWVideoViewController dWVideoViewController7 = DWVideoViewController.this;
                            DWVideoViewController.a(dWVideoViewController7, kcl.a(DWVideoViewController.g(dWVideoViewController7).getWindow() == null ? DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow() : DWVideoViewController.g(DWVideoViewController.this).getWindow()));
                        } else if (orientation == DWScreenOrientationListenerImp.Orientation.LANDSCAPE_270 && DWVideoViewController.i(DWVideoViewController.this) == DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90) {
                            DWVideoViewController.b(DWVideoViewController.this, FullOritation.LANDSCAPE_FULL90_TO_LANDSCAPE_FULL270);
                        } else if (orientation == DWScreenOrientationListenerImp.Orientation.LANDSCAPE_90 && DWVideoViewController.i(DWVideoViewController.this) == DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270) {
                            DWVideoViewController.b(DWVideoViewController.this, FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90);
                        } else if (orientation == DWScreenOrientationListenerImp.Orientation.LANDSCAPE_90 && DWVideoViewController.i(DWVideoViewController.this) == DWVideoScreenType2.PORTRAIT_FULL_SCREEN) {
                            DWVideoViewController.c(DWVideoViewController.this, FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90);
                            if (!DWVideoViewController.this.f16418a) {
                                return;
                            }
                            DWVideoViewController.this.f16418a = false;
                        } else if (orientation != DWScreenOrientationListenerImp.Orientation.LANDSCAPE_270 || DWVideoViewController.i(DWVideoViewController.this) != DWVideoScreenType2.PORTRAIT_FULL_SCREEN) {
                        } else {
                            DWVideoViewController.c(DWVideoViewController.this, FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL270);
                            if (!DWVideoViewController.this.f16418a) {
                                return;
                            }
                            DWVideoViewController.this.f16418a = false;
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    public void a(com.taobao.mediaplay.player.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bba46d5", new Object[]{this, hVar});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(hVar);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0dcbf9", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public View w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("79a2e640", new Object[]{this}) : this.e.i();
    }

    public com.taobao.avplayer.player.a x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.player.a) ipChange.ipc$dispatch("9304a90d", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.avplayer.at
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if ((this.e.f() == 1 || this.e.f() == 2) && TextUtils.isEmpty(this.d.getVideoToken())) {
        } else {
            if (!TextUtils.isEmpty(this.d.getVideoToken()) && this.e.f() == 1) {
                return;
            }
            this.i.a();
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(f, f2, f3);
    }

    @Override // com.taobao.avplayer.at
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    @Override // com.taobao.avplayer.at
    public List<com.taobao.taobaoavsdk.f> a(List<com.taobao.taobaoavsdk.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return null;
        }
        return aVar.a(list);
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else if (this.e.f() == 5 || this.e.f() == 8 || !TextUtils.isEmpty(this.d.getVideoToken())) {
            this.e.p();
        } else if (this.e.f() == 4 || (this.e.g() && this.e.h() == 4)) {
            if (this.e.g()) {
                this.e.f(0);
            } else {
                this.e.c(0);
            }
            j();
        } else {
            this.e.p();
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return false;
        }
        return aVar.z();
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return false;
        }
        return aVar.A();
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return false;
        }
        return aVar.y();
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
            DWContext dWContext = this.d;
            if (dWContext == null) {
                return;
            }
            com.taobao.taobaoavsdk.util.c.c(dWContext.mTlogAdapter, "setVideoSource## sorry  VideoSource is Empty  ");
        } else if (this.d.mPlayContext.mLocalVideo) {
            this.e.a(str);
        } else {
            if (str.startsWith(ado.URL_SEPARATOR)) {
                if (this.d.mConfigAdapter != null && !this.d.mConfigAdapter.b()) {
                    str = "http:" + str;
                } else {
                    str = com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
                }
            }
            if (z) {
                try {
                    str = a(str);
                } catch (Throwable th) {
                    DWContext dWContext2 = this.d;
                    if (dWContext2 != null) {
                        com.taobao.taobaoavsdk.util.c.c(dWContext2.mTlogAdapter, " URL illegal " + th.getMessage());
                    }
                }
            }
            this.e.a(this.d.getUTParams());
            this.e.a(str);
        }
    }

    public String a(String str) throws Exception {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!"TBVideo".equals(this.d.getVideoSource())) {
            return str;
        }
        URI uri = new URI(str);
        StringBuilder sb = new StringBuilder(50);
        sb.append("SOS=Android");
        String a2 = com.taobao.taobaoavsdk.util.f.a(this.d.mNetworkUtilsAdapter, this.d.getActivity());
        if (!TextUtils.isEmpty(a2)) {
            sb.append("&SNet=");
            sb.append(a2);
        }
        if (!TextUtils.isEmpty(this.d.mFrom)) {
            sb.append("&SBizCode=");
            sb.append(this.d.mFrom);
        }
        String a3 = this.d.mConfigParamsAdapter.a(this.d.getActivity());
        if (this.d.mConfigParamsAdapter != null && !TextUtils.isEmpty(a3)) {
            sb.append("&SRid=");
            sb.append(System.currentTimeMillis());
            sb.append(a3);
        }
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null) {
            str2 = sb.toString();
        } else {
            str2 = rawQuery + "&" + ((Object) sb);
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.p.removeCallbacks(this.C);
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar != null && (aVar instanceof com.taobao.avplayer.player.c)) {
            ((com.taobao.avplayer.player.c) aVar).f(z);
        }
        if (z) {
            this.z = true;
            this.e.a(0.0f);
            this.h = z;
            return;
        }
        this.B = com.taobao.avplayer.player.a.n;
        this.h = z;
        if (this.z && this.A) {
            this.e.a(this.B * 0.2f);
            if (this.e.f() != 1) {
                return;
            }
            F();
            return;
        }
        this.e.a(this.B);
    }

    @Override // com.taobao.avplayer.at
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.e.j();
    }

    @Override // com.taobao.avplayer.at
    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.e.k();
    }

    @Override // com.taobao.avplayer.at
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.e.b(f);
        }
    }

    @Override // com.taobao.avplayer.at
    public float r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbe9", new Object[]{this})).floatValue() : this.e.a();
    }

    @Override // com.taobao.avplayer.at
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.e.q();
        }
    }

    @Override // com.taobao.avplayer.at
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.e.b(false);
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null || !(aVar instanceof com.taobao.avplayer.player.c)) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).e(z);
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.e.u();
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            this.e.v();
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e.c(i);
        }
    }

    public void a(bc bcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173beb30", new Object[]{this, bcVar});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null || !(aVar instanceof com.taobao.avplayer.player.c)) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).a(bcVar);
    }

    public void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            this.e.a(i, z, z2);
        }
    }

    @Override // com.taobao.avplayer.at
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e.d(i);
        }
    }

    @Override // com.taobao.avplayer.at
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.e.r();
        }
    }

    @Override // com.taobao.avplayer.at
    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.e.t();
    }

    @Override // com.taobao.avplayer.at
    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.e.l();
    }

    @Override // com.taobao.avplayer.at
    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.e.m();
    }

    @Override // com.taobao.avplayer.at
    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.e.getCurrentPosition();
    }

    @Override // com.taobao.avplayer.at
    public void s() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.m;
        if ((animatorSet2 != null && animatorSet2.isRunning()) || this.x) {
            return;
        }
        if (!this.d.isActivityToggleForLandscape()) {
            if (this.d.screenType() == DWVideoScreenType.NORMAL) {
                boolean z2 = (((double) this.e.w()) <= 1.01d && this.e.w() != 0.0f) || (this.d.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN && this.y);
                if ((this.c == DWScreenOrientationListenerImp.Orientation.PORTRAIT && !z2) || this.d.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.d.getInitScreenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                    z = true;
                }
                this.f16418a = z;
                a(z2, true);
                this.f = kcl.a(this.d.getWindow() == null ? this.d.getActivity().getWindow() : this.d.getWindow());
                return;
            }
            boolean z3 = ((((double) this.e.w()) <= 1.01d && this.e.w() != 0.0f) || (this.d.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN && this.y)) && this.d.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN;
            if (this.c != DWScreenOrientationListenerImp.Orientation.PORTRAIT) {
                z = true;
            }
            this.b = z;
            f(z3);
            kcl.a(this.d.getWindow() == null ? this.d.getActivity().getWindow() : this.d.getWindow(), this.f);
        } else if (this.d.screenType() == DWVideoScreenType.NORMAL) {
            boolean z4 = (((double) this.e.w()) <= 1.01d && this.e.w() != 0.0f) || (this.d.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN && this.y);
            if ((this.c == DWScreenOrientationListenerImp.Orientation.PORTRAIT && !z4) || this.d.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.d.getInitScreenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                z = true;
            }
            this.f16418a = z;
            if (z4) {
                a(z4, true);
            } else if (this.d.getActivity().getRequestedOrientation() == 0 || this.d.getActivity().getRequestedOrientation() == 8) {
                return;
            } else {
                e(true);
            }
            this.f = kcl.a(this.d.getWindow() == null ? this.d.getActivity().getWindow() : this.d.getWindow());
        } else {
            boolean z5 = ((((double) this.e.w()) <= 1.01d && this.e.w() != 0.0f) || (this.d.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN && this.y)) && this.d.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN;
            if (this.c != DWScreenOrientationListenerImp.Orientation.PORTRAIT) {
                z = true;
            }
            this.b = z;
            if (z5) {
                f(z5);
            } else if (this.d.getActivity().getRequestedOrientation() == 1) {
            } else {
                I();
            }
        }
    }

    @Override // com.taobao.avplayer.at
    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.e.f();
    }

    @Override // com.taobao.avplayer.at
    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
        }
        if (this.e.g()) {
            return this.e.h();
        }
        return this.e.f();
    }

    @Override // com.taobao.avplayer.at
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (this.e.f() != 3 && ((!TextUtils.isEmpty(this.d.mPlayContext.getVideoUrl()) || !TextUtils.isEmpty(this.d.getVideoToken())) && (!this.e.g() || this.e.h() != 3))) {
        } else {
            b bVar = this.H;
            if (bVar != null) {
                bVar.a();
            }
            this.e.p();
            if (!this.h) {
                return;
            }
            this.e.a(0.0f);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0e4058", new Object[]{this, bVar});
        } else {
            this.H = bVar;
        }
    }

    @Override // com.taobao.avplayer.at
    public void b(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086cf9c", new Object[]{this, awVar});
        } else {
            this.e.a(awVar);
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b0272", new Object[]{this, baVar});
        } else {
            this.e.a(baVar);
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17375f7a", new Object[]{this, axVar});
        } else {
            this.e.a(axVar);
        }
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.d.isActivityToggleForLandscape() && !z) {
            this.x = true;
            if (this.d.getActivity().getRequestedOrientation() == 0 || this.d.getActivity().getRequestedOrientation() == 8) {
                return;
            }
            if (Build.VERSION.SDK_INT == 18) {
                this.d.getActivity().getWindow().setFlags(1024, 1024);
            }
            e(z2);
        } else {
            this.t = false;
            this.u = false;
            if (w().getParent() == null || w().getParent().getParent() == null) {
                return;
            }
            this.x = true;
            if (this.r == null && this.s == null) {
                this.r = (ViewGroup) w().getParent();
                this.s = (ViewGroup) this.r.getParent();
            }
            this.r.setLayerType(2, null);
            this.n = new int[2];
            this.s.getLocationInWindow(this.n);
            if (z) {
                this.v = this.r.getTranslationX();
                this.w = this.r.getTranslationY();
            }
            if (this.d.getWindow() != null) {
                this.g = (FrameLayout) this.d.getWindow().getDecorView();
            } else {
                this.g = (FrameLayout) this.d.getActivity().getWindow().getDecorView();
            }
            if (z) {
                this.k = kcl.b(this.d.getActivity());
                this.j = kcl.c();
            } else {
                this.k = kcl.b((Context) this.d.getActivity());
                this.j = kcl.b(this.d.getActivity());
            }
            ViewParent parent = this.r.getParent();
            ViewGroup viewGroup = this.s;
            if (parent == viewGroup) {
                viewGroup.removeView(this.r);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                layoutParams.gravity = 0;
                layoutParams.width = this.d.mWidth;
                layoutParams.height = this.d.mHeight;
                int i = layoutParams.topMargin;
                int[] iArr = this.n;
                if (i != iArr[1]) {
                    layoutParams.topMargin = iArr[1];
                }
                int i2 = layoutParams.leftMargin;
                int[] iArr2 = this.n;
                if (i2 != iArr2[0]) {
                    layoutParams.leftMargin = iArr2[0];
                }
                this.g.addView(this.r, layoutParams);
                if (this.d.getVideo().t() == 4) {
                    this.e.a(n(), false);
                }
            }
            int a2 = Build.VERSION.SDK_INT < 18 ? kcl.a((Context) this.d.getActivity()) : 0;
            if (z) {
                int[] iArr3 = this.n;
                b(-iArr3[0], a2 - iArr3[1]);
                return;
            }
            int i3 = this.k;
            int i4 = this.j;
            int[] iArr4 = this.n;
            a(((i3 - i4) / 2) - iArr4[0], a2 + (((i4 - i3) / 2) - iArr4[1]), z2);
        }
    }

    private void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.r, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.r, "translationY", i2);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 90.0f);
        this.l = new AnimatorSet();
        int i3 = 200;
        if (this.y && this.d.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            this.y = false;
            int[] iArr = this.n;
            if (iArr[1] == 0) {
                this.o = iArr[1] + kcl.a((Context) this.d.getActivity());
            }
            i3 = 1;
        }
        long j = i3;
        this.l.setDuration(j);
        this.l.play(ofFloat3);
        this.l.play(ofFloat);
        this.l.play(ofFloat2);
        this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DWVideoViewController.j(DWVideoViewController.this).start();
                }
            }
        });
        ofFloat3.setDuration(j);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.avplayer.DWVideoViewController.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DWVideoViewController.k(DWVideoViewController.this).getLayoutParams();
                layoutParams.width = (int) (DWVideoViewController.g(DWVideoViewController.this).mWidth + (((DWVideoViewController.l(DWVideoViewController.this) - DWVideoViewController.g(DWVideoViewController.this).mWidth) * floatValue) / 90.0f));
                layoutParams.height = (int) (DWVideoViewController.g(DWVideoViewController.this).mHeight + (((DWVideoViewController.m(DWVideoViewController.this) - DWVideoViewController.g(DWVideoViewController.this).mHeight) * floatValue) / 90.0f));
                DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                int i4 = (floatValue > 20.0f ? 1 : (floatValue == 20.0f ? 0 : -1));
                if (i4 > 0 && Build.VERSION.SDK_INT == 18 && !DWVideoViewController.n(DWVideoViewController.this)) {
                    DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().setFlags(1024, 1024);
                    DWVideoViewController.a(DWVideoViewController.this, true);
                }
                if (i4 <= 0 || Build.VERSION.SDK_INT < 28 || DWVideoViewController.o(DWVideoViewController.this)) {
                    return;
                }
                WindowManager.LayoutParams attributes = DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().setAttributes(attributes);
                DWVideoViewController.b(DWVideoViewController.this, true);
            }
        });
        ofFloat3.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.DWVideoViewController.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    DWVideoViewController.p(DWVideoViewController.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    DWVideoViewController.p(DWVideoViewController.this);
                }
            }
        });
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else {
            this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.26
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    DWVideoViewController.g(DWVideoViewController.this).setVideoScreenType(DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                    DWVideoViewController.d(DWVideoViewController.this).a(DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                    DWVideoViewController.a(DWVideoViewController.this, DWVideoScreenType2.PORTRAIT_FULL_SCREEN);
                    DWVideoViewController.b(DWVideoViewController.this, DWVideoScreenType2.PORTRAIT_FULL_SCREEN);
                    if (DWVideoViewController.g(DWVideoViewController.this) != null && !DWVideoViewController.g(DWVideoViewController.this).mHookKeyBackToggleEvent) {
                        DWVideoViewController.g(DWVideoViewController.this).registerKeyBackEventListener(DWVideoViewController.this);
                    }
                    DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
                    DWVideoViewController.c(DWVideoViewController.this, false);
                }
            });
        }
    }

    private void a(final FullOritation fullOritation) {
        ObjectAnimator ofFloat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b4ba82", new Object[]{this, fullOritation});
        } else if (this.d.isActivityToggleForLandscape() && (this.d.getActivity().getRequestedOrientation() == 0 || this.d.getActivity().getRequestedOrientation() == 8)) {
            this.x = true;
            this.r.setLayerType(2, null);
            if (fullOritation == FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90) {
                this.d.getActivity().setRequestedOrientation(8);
            } else {
                this.d.getActivity().setRequestedOrientation(0);
            }
            b(fullOritation);
        } else {
            if (fullOritation == FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90) {
                ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", 90.0f, -90.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", -90.0f, 90.0f);
            }
            this.x = true;
            this.r.setLayerType(2, null);
            this.l = new AnimatorSet();
            long j = 400;
            this.l.setDuration(j);
            this.l.play(ofFloat);
            this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.27
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DWVideoViewController.j(DWVideoViewController.this).start();
                    }
                }
            });
            ofFloat.setDuration(j);
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.DWVideoViewController.28
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        DWVideoViewController.d(DWVideoViewController.this, fullOritation);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        DWVideoViewController.d(DWVideoViewController.this, fullOritation);
                    }
                }
            });
        }
    }

    private void b(final FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f32a21", new Object[]{this, fullOritation});
        } else {
            this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.29
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DWVideoViewController dWVideoViewController;
                    DWVideoScreenType2 dWVideoScreenType2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    if (fullOritation == FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90 || fullOritation == FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                        dWVideoViewController = DWVideoViewController.this;
                        dWVideoScreenType2 = DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90;
                    } else {
                        dWVideoViewController = DWVideoViewController.this;
                        dWVideoScreenType2 = DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270;
                    }
                    DWVideoViewController.a(dWVideoViewController, dWVideoScreenType2);
                    DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
                    DWVideoViewController.c(DWVideoViewController.this, false);
                }
            });
        }
    }

    private void c(FullOritation fullOritation) {
        ObjectAnimator ofFloat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3199c0", new Object[]{this, fullOritation});
        } else if (this.d.isActivityToggleForLandscape() && (this.d.getActivity().getRequestedOrientation() == 0 || this.d.getActivity().getRequestedOrientation() == 8)) {
            this.x = true;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.r.setLayoutParams(layoutParams);
            this.r.setLayerType(2, null);
            this.d.getActivity().setRequestedOrientation(1);
            H();
        } else {
            this.x = true;
            if (fullOritation == FullOritation.LANDSCAPE_FULL90_TO_PORTRAIT_FULL) {
                ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", -90.0f, 0.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", 90.0f, 0.0f);
            }
            this.r.setLayerType(2, null);
            this.k = kcl.c();
            this.j = kcl.b(this.d.getActivity());
            final int b2 = kcl.b(this.d.getActivity());
            final int c = kcl.c();
            int[] iArr = this.n;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.r, "translationX", -iArr[0]);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, "translationY", -iArr[1]);
            this.r.setLayerType(2, null);
            this.l = new AnimatorSet();
            long j = 400;
            this.l.setDuration(j);
            this.l.play(ofFloat);
            this.l.play(ofFloat2);
            this.l.play(ofFloat3);
            this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DWVideoViewController.j(DWVideoViewController.this).start();
                    }
                }
            });
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.avplayer.DWVideoViewController.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) DWVideoViewController.k(DWVideoViewController.this).getLayoutParams();
                    layoutParams2.width = (int) (c + (((DWVideoViewController.l(DWVideoViewController.this) - c) * abs) / 90.0f));
                    layoutParams2.height = (int) (b2 + (((DWVideoViewController.m(DWVideoViewController.this) - b2) * abs) / 90.0f));
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.DWVideoViewController.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        DWVideoViewController.q(DWVideoViewController.this);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        DWVideoViewController.q(DWVideoViewController.this);
                    }
                }
            });
        }
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else {
            this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    DWVideoViewController.a(DWVideoViewController.this, DWVideoScreenType2.PORTRAIT_FULL_SCREEN);
                    DWVideoViewController.g(DWVideoViewController.this).setVideoScreenType(DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                    DWVideoViewController.d(DWVideoViewController.this).a(DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                    DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
                    DWVideoViewController.c(DWVideoViewController.this, false);
                }
            });
        }
    }

    private void d(final FullOritation fullOritation) {
        ObjectAnimator ofFloat;
        int i;
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e70095f", new Object[]{this, fullOritation});
        } else if (this.d.isActivityToggleForLandscape() && this.d.getActivity().getRequestedOrientation() == 1) {
            this.x = true;
            this.r.setLayerType(2, null);
            if (fullOritation == FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                this.d.getActivity().setRequestedOrientation(8);
            } else {
                this.d.getActivity().setRequestedOrientation(0);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.r.setTranslationX(0.0f);
            this.r.setTranslationY(0.0f);
            this.r.setLayoutParams(layoutParams);
            e(fullOritation);
        } else {
            this.x = true;
            if (fullOritation == FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", 0.0f, -90.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", 0.0f, 90.0f);
            }
            this.r.setLayerType(2, null);
            this.k = kcl.c();
            this.j = kcl.b(this.d.getActivity());
            final int b2 = kcl.b(this.d.getActivity());
            final int c = kcl.c();
            int i2 = this.k;
            int i3 = ((this.j - i2) / 2) - this.n[1];
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.r, "translationX", ((i2 - i) / 2) - iArr[0]);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, "translationY", i3);
            this.r.setLayerType(2, null);
            this.l = new AnimatorSet();
            long j = 400;
            this.l.setDuration(j);
            this.l.play(ofFloat);
            this.l.play(ofFloat2);
            this.l.play(ofFloat3);
            this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DWVideoViewController.j(DWVideoViewController.this).start();
                    }
                }
            });
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.avplayer.DWVideoViewController.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) DWVideoViewController.k(DWVideoViewController.this).getLayoutParams();
                    layoutParams2.width = (int) (c + (((DWVideoViewController.l(DWVideoViewController.this) - c) * abs) / 90.0f));
                    layoutParams2.height = (int) (b2 + (((DWVideoViewController.m(DWVideoViewController.this) - b2) * abs) / 90.0f));
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.DWVideoViewController.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        DWVideoViewController.e(DWVideoViewController.this, fullOritation);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        DWVideoViewController.e(DWVideoViewController.this, fullOritation);
                    }
                }
            });
        }
    }

    private void e(final FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ae78fe", new Object[]{this, fullOritation});
        } else {
            this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DWVideoViewController dWVideoViewController;
                    DWVideoScreenType2 dWVideoScreenType2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    if (fullOritation == FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90 || fullOritation == FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                        dWVideoViewController = DWVideoViewController.this;
                        dWVideoScreenType2 = DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90;
                    } else {
                        dWVideoViewController = DWVideoViewController.this;
                        dWVideoScreenType2 = DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270;
                    }
                    DWVideoViewController.a(dWVideoViewController, dWVideoScreenType2);
                    DWVideoViewController.g(DWVideoViewController.this).setVideoScreenType(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                    DWVideoViewController.d(DWVideoViewController.this).a(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                    DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
                    DWVideoViewController.c(DWVideoViewController.this, false);
                }
            });
        }
    }

    private void a(int i, int i2, final boolean z) {
        ObjectAnimator ofFloat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.r, "translationX", i);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, "translationY", i2);
        if (z) {
            ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", 0.0f, 90.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", 0.0f, -90.0f);
        }
        this.l = new AnimatorSet();
        int i3 = 200;
        if (this.y && this.d.getInitScreenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
            this.y = false;
            int[] iArr = this.n;
            if (iArr[1] == 0) {
                this.o = iArr[1] + kcl.a((Context) this.d.getActivity());
            }
            i3 = 1;
        }
        this.l.setDuration(i3);
        this.l.play(ofFloat);
        this.l.play(ofFloat2);
        this.l.play(ofFloat3);
        this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DWVideoViewController.j(DWVideoViewController.this).start();
                }
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.avplayer.DWVideoViewController.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.width = (int) (DWVideoViewController.g(DWVideoViewController.this).mWidth + (((DWVideoViewController.l(DWVideoViewController.this) - DWVideoViewController.g(DWVideoViewController.this).mWidth) * abs) / 90.0f));
                layoutParams.height = (int) (DWVideoViewController.g(DWVideoViewController.this).mHeight + (((DWVideoViewController.m(DWVideoViewController.this) - DWVideoViewController.g(DWVideoViewController.this).mHeight) * abs) / 90.0f));
                layoutParams.topMargin = DWVideoViewController.r(DWVideoViewController.this)[1];
                layoutParams.leftMargin = DWVideoViewController.r(DWVideoViewController.this)[0];
                DWVideoViewController.k(DWVideoViewController.this).setLayoutParams(layoutParams);
                int i4 = (abs > 20.0f ? 1 : (abs == 20.0f ? 0 : -1));
                if (i4 > 0 && Build.VERSION.SDK_INT == 18 && !DWVideoViewController.n(DWVideoViewController.this)) {
                    DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().setFlags(1024, 1024);
                    DWVideoViewController.a(DWVideoViewController.this, true);
                }
                if (i4 <= 0 || Build.VERSION.SDK_INT < 28 || DWVideoViewController.o(DWVideoViewController.this)) {
                    return;
                }
                WindowManager.LayoutParams attributes = DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().setAttributes(attributes);
                DWVideoViewController.b(DWVideoViewController.this, true);
            }
        });
        this.l.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.DWVideoViewController.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    DWVideoViewController.d(DWVideoViewController.this, z);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    DWVideoViewController.d(DWVideoViewController.this, z);
                }
            }
        });
    }

    private void d(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DWVideoViewController dWVideoViewController;
                    DWVideoScreenType2 dWVideoScreenType2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    DWVideoViewController.g(DWVideoViewController.this).setVideoScreenType(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                    if (z) {
                        dWVideoViewController = DWVideoViewController.this;
                        dWVideoScreenType2 = DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270;
                    } else {
                        dWVideoViewController = DWVideoViewController.this;
                        dWVideoScreenType2 = DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90;
                    }
                    DWVideoViewController.a(dWVideoViewController, dWVideoScreenType2);
                    DWVideoViewController.d(DWVideoViewController.this).a(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                    if (DWVideoViewController.g(DWVideoViewController.this) != null && !DWVideoViewController.g(DWVideoViewController.this).mHookKeyBackToggleEvent) {
                        DWVideoViewController.g(DWVideoViewController.this).registerKeyBackEventListener(DWVideoViewController.this);
                    }
                    DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
                    DWVideoViewController.c(DWVideoViewController.this, false);
                }
            });
        }
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (w().getParent() == null || w().getParent().getParent() == null) {
        } else {
            this.x = true;
            if (this.r == null && this.s == null) {
                this.r = (ViewGroup) w().getParent();
                this.s = (ViewGroup) this.r.getParent();
            }
            if (this.d.getWindow() != null) {
                this.g = (FrameLayout) this.d.getWindow().getDecorView();
            } else {
                this.g = (FrameLayout) this.d.getActivity().getWindow().getDecorView();
            }
            if (Build.VERSION.SDK_INT == 18) {
                WindowManager.LayoutParams attributes = this.d.getActivity().getWindow().getAttributes();
                attributes.flags &= -1025;
                this.d.getActivity().getWindow().setAttributes(attributes);
                this.d.getActivity().getWindow().clearFlags(512);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes2 = this.d.getActivity().getWindow().getAttributes();
                attributes2.layoutInDisplayCutoutMode = 0;
                this.d.getActivity().getWindow().setAttributes(attributes2);
            }
            this.r.setLayerType(2, null);
            this.d.getActivity().setRequestedOrientation(1);
            kcl.a(this.d.getWindow() == null ? this.d.getActivity().getWindow() : this.d.getWindow(), this.f);
            this.p.postDelayed(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (DWVideoViewController.k(DWVideoViewController.this).getParent() == DWVideoViewController.s(DWVideoViewController.this)) {
                    } else {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                        DWVideoViewController.k(DWVideoViewController.this).setTranslationX(0.0f);
                        DWVideoViewController.k(DWVideoViewController.this).setTranslationY(0.0f);
                        if (DWVideoViewController.k(DWVideoViewController.this).getParent() != null && (DWVideoViewController.k(DWVideoViewController.this).getParent() instanceof ViewGroup)) {
                            ((ViewGroup) DWVideoViewController.k(DWVideoViewController.this).getParent()).removeView(DWVideoViewController.k(DWVideoViewController.this));
                            DWVideoViewController.s(DWVideoViewController.this).addView(DWVideoViewController.k(DWVideoViewController.this), layoutParams);
                        }
                        if (DWVideoViewController.g(DWVideoViewController.this).getVideo().t() == 4) {
                            DWVideoViewController.d(DWVideoViewController.this).a(DWVideoViewController.this.n(), false);
                        }
                        DWVideoViewController.b(DWVideoViewController.this, DWVideoScreenType2.NORMAL);
                        DWVideoViewController.g(DWVideoViewController.this).setVideoScreenType(DWVideoScreenType.NORMAL);
                        DWVideoViewController.a(DWVideoViewController.this, DWVideoScreenType2.NORMAL);
                        DWVideoViewController.d(DWVideoViewController.this).a(DWVideoScreenType.NORMAL);
                        if (DWVideoViewController.g(DWVideoViewController.this) != null && !DWVideoViewController.g(DWVideoViewController.this).mHookKeyBackToggleEvent) {
                            DWVideoViewController.g(DWVideoViewController.this).unregisterKeyBackEventListener(DWVideoViewController.this);
                        }
                        DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
                        DWVideoViewController.c(DWVideoViewController.this, false);
                    }
                }
            }, 20L);
        }
    }

    private void e(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (w().getParent() == null || w().getParent().getParent() == null) {
        } else {
            this.x = true;
            if (this.r == null && this.s == null) {
                this.r = (ViewGroup) w().getParent();
                this.s = (ViewGroup) this.r.getParent();
            }
            if (this.d.getWindow() != null) {
                this.g = (FrameLayout) this.d.getWindow().getDecorView();
            } else {
                this.g = (FrameLayout) this.d.getActivity().getWindow().getDecorView();
            }
            if (z) {
                this.d.getActivity().setRequestedOrientation(0);
            } else {
                this.d.getActivity().setRequestedOrientation(8);
            }
            this.p.postDelayed(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DWVideoViewController dWVideoViewController;
                    DWVideoScreenType2 dWVideoScreenType2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (Build.VERSION.SDK_INT == 18) {
                        DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().setFlags(1024, 1024);
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        WindowManager.LayoutParams attributes = DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().getAttributes();
                        attributes.layoutInDisplayCutoutMode = 1;
                        DWVideoViewController.g(DWVideoViewController.this).getActivity().getWindow().setAttributes(attributes);
                    }
                    DWVideoViewController.k(DWVideoViewController.this).setLayerType(2, null);
                    if (DWVideoViewController.k(DWVideoViewController.this).getParent() == DWVideoViewController.s(DWVideoViewController.this)) {
                        DWVideoViewController.s(DWVideoViewController.this).removeView(DWVideoViewController.k(DWVideoViewController.this));
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DWVideoViewController.k(DWVideoViewController.this).getLayoutParams();
                        layoutParams.gravity = 17;
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        DWVideoViewController.t(DWVideoViewController.this).addView(DWVideoViewController.k(DWVideoViewController.this), layoutParams);
                        DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                        if (DWVideoViewController.g(DWVideoViewController.this).getVideo().t() == 4) {
                            DWVideoViewController.d(DWVideoViewController.this).a(DWVideoViewController.this.n(), false);
                        }
                    }
                    DWVideoViewController.g(DWVideoViewController.this).setVideoScreenType(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                    if (z) {
                        dWVideoViewController = DWVideoViewController.this;
                        dWVideoScreenType2 = DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270;
                    } else {
                        dWVideoViewController = DWVideoViewController.this;
                        dWVideoScreenType2 = DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90;
                    }
                    DWVideoViewController.a(dWVideoViewController, dWVideoScreenType2);
                    DWVideoViewController.d(DWVideoViewController.this).a(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                    if (DWVideoViewController.g(DWVideoViewController.this) != null && !DWVideoViewController.g(DWVideoViewController.this).mHookKeyBackToggleEvent) {
                        DWVideoViewController.g(DWVideoViewController.this).registerKeyBackEventListener(DWVideoViewController.this);
                    }
                    DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
                    DWVideoViewController.c(DWVideoViewController.this, false);
                }
            }, 20L);
        }
    }

    private void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (w().getParent() == null || w().getParent().getParent() == null) {
        } else {
            this.x = true;
            if (this.r == null && this.s == null) {
                this.r = (ViewGroup) w().getParent();
                this.s = (ViewGroup) this.r.getParent();
            }
            int i = this.o;
            if (i != 0) {
                this.n[1] = i;
                this.o = 0;
            }
            ViewGroup viewGroup = this.r;
            if (viewGroup != null) {
                viewGroup.setLayerType(2, null);
            }
            if (this.d.getWindow() != null) {
                this.g = (FrameLayout) this.d.getWindow().getDecorView();
            } else {
                this.g = (FrameLayout) this.d.getActivity().getWindow().getDecorView();
            }
            if (Build.VERSION.SDK_INT == 18) {
                WindowManager.LayoutParams attributes = this.d.getActivity().getWindow().getAttributes();
                attributes.flags &= -1025;
                this.d.getActivity().getWindow().setAttributes(attributes);
                this.d.getActivity().getWindow().clearFlags(512);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes2 = this.d.getActivity().getWindow().getAttributes();
                attributes2.layoutInDisplayCutoutMode = 0;
                this.d.getActivity().getWindow().setAttributes(attributes2);
            }
            int a2 = (Build.VERSION.SDK_INT >= 18 || z) ? 0 : 0 - (kcl.a((Context) this.d.getActivity()) / 2);
            if (z) {
                this.k = kcl.b(this.d.getActivity());
                this.j = kcl.c();
                int[] iArr = this.n;
                c(iArr[0], a2 + iArr[1]);
                return;
            }
            this.k = kcl.b((Context) this.d.getActivity());
            this.j = kcl.b(this.d.getActivity());
            d(((-(this.k - this.d.mWidth)) / 2) + this.n[0], a2 + ((-(this.j - this.d.mHeight)) / 2) + this.n[1]);
        }
    }

    private void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.r, "translationX", 0.0f, i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.r, "translationY", 0.0f, i2);
        this.r.setTranslationY(this.w);
        this.r.setTranslationX(this.v);
        this.m = new AnimatorSet();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(90.0f, 0.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.avplayer.DWVideoViewController.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.width = (int) (DWVideoViewController.g(DWVideoViewController.this).mWidth + (((DWVideoViewController.l(DWVideoViewController.this) - DWVideoViewController.g(DWVideoViewController.this).mWidth) * floatValue) / 90.0f));
                layoutParams.height = (int) (DWVideoViewController.g(DWVideoViewController.this).mHeight + (((DWVideoViewController.m(DWVideoViewController.this) - DWVideoViewController.g(DWVideoViewController.this).mHeight) * floatValue) / 90.0f));
                DWVideoViewController.k(DWVideoViewController.this).setLayoutParams(layoutParams);
            }
        });
        this.m.setDuration(200L);
        this.m.play(ofFloat3);
        this.m.play(ofFloat);
        this.m.play(ofFloat2);
        this.m.start();
        this.m.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.DWVideoViewController.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    DWVideoViewController.u(DWVideoViewController.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    DWVideoViewController.u(DWVideoViewController.this);
                }
            }
        });
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        kcl.a(this.d.getWindow() == null ? this.d.getActivity().getWindow() : this.d.getWindow(), this.f);
        this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (DWVideoViewController.k(DWVideoViewController.this).getParent() != DWVideoViewController.s(DWVideoViewController.this)) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    if (DWVideoViewController.k(DWVideoViewController.this).getParent() != null && (DWVideoViewController.k(DWVideoViewController.this).getParent() instanceof ViewGroup)) {
                        ((ViewGroup) DWVideoViewController.k(DWVideoViewController.this).getParent()).removeView(DWVideoViewController.k(DWVideoViewController.this));
                        DWVideoViewController.s(DWVideoViewController.this).addView(DWVideoViewController.k(DWVideoViewController.this), layoutParams);
                    }
                    if (DWVideoViewController.g(DWVideoViewController.this).getVideo().t() == 4) {
                        DWVideoViewController.d(DWVideoViewController.this).a(DWVideoViewController.this.n(), false);
                    }
                    DWVideoViewController.k(DWVideoViewController.this).setTranslationX(DWVideoViewController.v(DWVideoViewController.this));
                    DWVideoViewController.k(DWVideoViewController.this).setTranslationY(DWVideoViewController.w(DWVideoViewController.this));
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    DWVideoViewController.c(DWVideoViewController.this, false);
                }
                DWVideoViewController.b(DWVideoViewController.this, DWVideoScreenType2.NORMAL);
                DWVideoViewController.g(DWVideoViewController.this).setVideoScreenType(DWVideoScreenType.NORMAL);
                DWVideoViewController.a(DWVideoViewController.this, DWVideoScreenType2.NORMAL);
                DWVideoViewController.d(DWVideoViewController.this).a(DWVideoScreenType.NORMAL);
                DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
            }
        });
        DWContext dWContext = this.d;
        if (dWContext == null || dWContext.mHookKeyBackToggleEvent) {
            return;
        }
        this.d.unregisterKeyBackEventListener(this);
    }

    private void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac4048b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.r, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.r, "translationY", i2);
        this.r.setTranslationY(this.w);
        this.r.setTranslationX(this.v);
        this.m = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, "rotation", 0.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.avplayer.DWVideoViewController.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.width = (int) (DWVideoViewController.g(DWVideoViewController.this).mWidth + (((DWVideoViewController.l(DWVideoViewController.this) - DWVideoViewController.g(DWVideoViewController.this).mWidth) * abs) / 90.0f));
                layoutParams.height = (int) (DWVideoViewController.g(DWVideoViewController.this).mHeight + (((DWVideoViewController.m(DWVideoViewController.this) - DWVideoViewController.g(DWVideoViewController.this).mHeight) * abs) / 90.0f));
                layoutParams.gravity = 17;
                DWVideoViewController.k(DWVideoViewController.this).setLayoutParams(layoutParams);
            }
        });
        this.m.setDuration(200L);
        this.m.play(ofFloat3);
        this.m.play(ofFloat);
        this.m.play(ofFloat2);
        this.m.start();
        this.m.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.DWVideoViewController.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    DWVideoViewController.x(DWVideoViewController.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    DWVideoViewController.x(DWVideoViewController.this);
                }
            }
        });
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        kcl.a(this.d.getWindow() == null ? this.d.getActivity().getWindow() : this.d.getWindow(), this.f);
        this.p.post(new Runnable() { // from class: com.taobao.avplayer.DWVideoViewController.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (DWVideoViewController.k(DWVideoViewController.this).getParent() != DWVideoViewController.s(DWVideoViewController.this)) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    if (DWVideoViewController.k(DWVideoViewController.this).getParent() != null && (DWVideoViewController.k(DWVideoViewController.this).getParent() instanceof ViewGroup)) {
                        ((ViewGroup) DWVideoViewController.k(DWVideoViewController.this).getParent()).removeView(DWVideoViewController.k(DWVideoViewController.this));
                        DWVideoViewController.s(DWVideoViewController.this).addView(DWVideoViewController.k(DWVideoViewController.this), layoutParams);
                    }
                    if (DWVideoViewController.g(DWVideoViewController.this).getVideo().t() == 4) {
                        DWVideoViewController.d(DWVideoViewController.this).a(DWVideoViewController.this.n(), false);
                    }
                    DWVideoViewController.k(DWVideoViewController.this).setTranslationX(DWVideoViewController.v(DWVideoViewController.this));
                    DWVideoViewController.k(DWVideoViewController.this).setTranslationY(DWVideoViewController.w(DWVideoViewController.this));
                    DWVideoViewController.k(DWVideoViewController.this).requestLayout();
                    DWVideoViewController.c(DWVideoViewController.this, false);
                }
                DWVideoViewController.b(DWVideoViewController.this, DWVideoScreenType2.NORMAL);
                DWVideoViewController.g(DWVideoViewController.this).setVideoScreenType(DWVideoScreenType.NORMAL);
                DWVideoViewController.a(DWVideoViewController.this, DWVideoScreenType2.NORMAL);
                DWVideoViewController.d(DWVideoViewController.this).a(DWVideoScreenType.NORMAL);
                DWVideoViewController.k(DWVideoViewController.this).setLayerType(0, null);
            }
        });
        DWContext dWContext = this.d;
        if (dWContext == null || dWContext.mHookKeyBackToggleEvent) {
            return;
        }
        this.d.unregisterKeyBackEventListener(this);
    }

    @Override // com.taobao.avplayer.common.b
    public boolean onBackKeyDown(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328efe1e", new Object[]{this, keyEvent})).booleanValue();
        }
        if (this.d.screenType() != DWVideoScreenType.LANDSCAPE_FULL_SCREEN && this.d.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            return false;
        }
        s();
        return true;
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.removeView(this.r);
        }
        try {
            if (this.G != null) {
                this.G.disable();
            }
        } catch (Throwable unused) {
        }
        this.e.x();
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.m.cancel();
        }
        AnimatorSet animatorSet2 = this.l;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.l.cancel();
        }
        Handler handler = this.p;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).a(ddeVar);
    }

    public void a(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a40a2", new Object[]{this, innerStartFuncListener});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).a(innerStartFuncListener);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.avplayer.player.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        ((com.taobao.avplayer.player.c) aVar).b(map);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }
}
