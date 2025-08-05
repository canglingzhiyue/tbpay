package com.taobao.mediaplay;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.Map;
import tb.ado;
import tb.dde;
import tb.kge;
import tb.mjv;
import tb.mkb;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* loaded from: classes7.dex */
public class j implements a, com.taobao.mediaplay.player.e, mjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MediaContext f18023a;
    private com.taobao.mediaplay.player.b b;
    private boolean c;
    private float f;
    private Runnable g;
    private boolean i;
    private AnimatorSet j;
    private AnimatorSet k;
    private ViewGroup l;
    private ViewGroup m;
    private FrameLayout n;
    private float o;
    private float p;
    private int r;
    private int s;
    private volatile boolean u;
    private int v;
    private int w;
    private int x;
    private boolean e = true;
    private int h = 0;
    private int[] q = new int[2];
    private boolean t = true;
    private final int y = 150;
    private Handler d = new Handler();

    static {
        kge.a(-1826387057);
        kge.a(-613305621);
        kge.a(1591729701);
        kge.a(-1748010089);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ int a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54dd98ea", new Object[]{jVar})).intValue() : jVar.r;
    }

    public static /* synthetic */ boolean a(j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46d638c1", new Object[]{jVar, new Boolean(z)})).booleanValue();
        }
        jVar.u = z;
        return z;
    }

    public static /* synthetic */ int b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e2d7d6b", new Object[]{jVar})).intValue() : jVar.v;
    }

    public static /* synthetic */ boolean b(j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4782e460", new Object[]{jVar, new Boolean(z)})).booleanValue();
        }
        jVar.i = z;
        return z;
    }

    public static /* synthetic */ int c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a77d61ec", new Object[]{jVar})).intValue() : jVar.s;
    }

    public static /* synthetic */ int d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d0cd466d", new Object[]{jVar})).intValue() : jVar.w;
    }

    public static /* synthetic */ ViewGroup e(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("2eafc4ba", new Object[]{jVar}) : jVar.l;
    }

    public static /* synthetic */ void f(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236d0f7c", new Object[]{jVar});
        } else {
            jVar.x();
        }
    }

    public static /* synthetic */ ViewGroup g(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8a60f978", new Object[]{jVar}) : jVar.m;
    }

    public static /* synthetic */ MediaContext h(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaContext) ipChange.ipc$dispatch("3696237a", new Object[]{jVar}) : jVar.f18023a;
    }

    public static /* synthetic */ com.taobao.mediaplay.player.b i(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mediaplay.player.b) ipChange.ipc$dispatch("6caddef2", new Object[]{jVar}) : jVar.b;
    }

    public static /* synthetic */ float j(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8aca170", new Object[]{jVar})).floatValue() : jVar.o;
    }

    public static /* synthetic */ float k(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1fc85f1", new Object[]{jVar})).floatValue() : jVar.p;
    }

    public static /* synthetic */ void l(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4c6a82", new Object[]{jVar});
        } else {
            jVar.y();
        }
    }

    public static /* synthetic */ AnimatorSet m(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("e74f9944", new Object[]{jVar}) : jVar.j;
    }

    public static /* synthetic */ boolean n(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6dec3388", new Object[]{jVar})).booleanValue() : jVar.i;
    }

    public static /* synthetic */ void o(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973c1805", new Object[]{jVar});
        } else {
            jVar.z();
        }
    }

    public static /* synthetic */ int[] p(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("50f3951e", new Object[]{jVar}) : jVar.q;
    }

    public static /* synthetic */ void q(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dbe107", new Object[]{jVar});
        } else {
            jVar.A();
        }
    }

    public static /* synthetic */ int r(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("132bc57b", new Object[]{jVar})).intValue();
        }
        int i = jVar.h;
        jVar.h = i + 1;
        return i;
    }

    public static /* synthetic */ float s(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c7ba9f9", new Object[]{jVar})).floatValue() : jVar.f;
    }

    public static /* synthetic */ int t(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65cb8e7d", new Object[]{jVar})).intValue() : jVar.h;
    }

    public static /* synthetic */ Runnable u(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("3ea888a9", new Object[]{jVar}) : jVar.g;
    }

    public static /* synthetic */ Handler v(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("92e433ba", new Object[]{jVar}) : jVar.d;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        MediaContext mediaContext = this.f18023a;
        if (mediaContext == null || !(mediaContext.getContext() instanceof Activity)) {
            return;
        }
        AnimatorSet animatorSet = this.j;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.k;
        if ((animatorSet2 != null && animatorSet2.isRunning()) || this.u) {
            return;
        }
        if (this.f18023a.screenType() == MediaPlayScreenType.NORMAL) {
            if ((this.b.q() <= 1.01d && this.b.q() != 0.0f && !this.f18023a.mMediaPlayContext.mEmbed) || (this.f18023a.mMediaPlayContext.mEmbed && !this.f18023a.mRequestLandscape)) {
                z = true;
            }
            h(z);
            this.x = DWViewUtil.hideNavigationBar(this.f18023a.getWindow() == null ? ((Activity) this.f18023a.getContext()).getWindow() : this.f18023a.getWindow());
            return;
        }
        if ((this.b.q() <= 1.01d && this.b.q() != 0.0f && !this.f18023a.mMediaPlayContext.mEmbed) || (this.f18023a.mMediaPlayContext.mEmbed && !this.f18023a.mRequestLandscape)) {
            z = true;
        }
        g(z);
        DWViewUtil.setNavigationBar(this.f18023a.getWindow() == null ? ((Activity) this.f18023a.getContext()).getWindow() : this.f18023a.getWindow(), this.x);
    }

    private void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.f18023a;
        if (mediaContext == null || !(mediaContext.getContext() instanceof Activity) || m().getParent() == null || m().getParent().getParent() == null) {
            return;
        }
        this.u = true;
        if (this.l == null && this.m == null) {
            this.l = (ViewGroup) m().getParent();
            this.m = (ViewGroup) this.l.getParent();
        }
        this.l.setLayerType(2, null);
        if (this.n == null) {
            this.n = (FrameLayout) ((Activity) this.f18023a.getContext()).getWindow().getDecorView();
        }
        if (Build.VERSION.SDK_INT == 18) {
            WindowManager.LayoutParams attributes = ((Activity) this.f18023a.getContext()).getWindow().getAttributes();
            attributes.flags &= -1025;
            ((Activity) this.f18023a.getContext()).getWindow().setAttributes(attributes);
            ((Activity) this.f18023a.getContext()).getWindow().clearFlags(512);
        }
        int statusBarHeight = (Build.VERSION.SDK_INT >= 18 || z) ? 0 : 0 - (DWViewUtil.getStatusBarHeight(this.f18023a.getContext()) / 2);
        if (z) {
            this.w = DWViewUtil.getVideoWidthInLandscape((Activity) this.f18023a.getContext());
            this.v = DWViewUtil.getPortraitScreenWidth();
            int[] iArr = this.q;
            a(iArr[0], statusBarHeight + iArr[1]);
            return;
        }
        this.w = DWViewUtil.getRealWithInPx(this.f18023a.getContext());
        this.v = DWViewUtil.getVideoWidthInLandscape((Activity) this.f18023a.getContext());
        int[] iArr2 = this.q;
        b(((-(this.w - this.r)) / 2) + iArr2[0], statusBarHeight + ((-(this.v - this.s)) / 2) + iArr2[1]);
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "translationX", 0.0f, i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, "translationY", 0.0f, i2);
        this.l.setTranslationY(this.p);
        this.l.setTranslationX(this.o);
        this.k = new AnimatorSet();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(90.0f, 0.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.mediaplay.j.1
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
                layoutParams.width = (int) (j.a(j.this) + (((j.b(j.this) - j.a(j.this)) * floatValue) / 90.0f));
                layoutParams.height = (int) (j.c(j.this) + (((j.d(j.this) - j.c(j.this)) * floatValue) / 90.0f));
                j.e(j.this).setLayoutParams(layoutParams);
            }
        });
        this.k.setDuration(150L);
        this.k.play(ofFloat3);
        this.k.play(ofFloat);
        this.k.play(ofFloat2);
        this.k.start();
        this.k.addListener(new Animator.AnimatorListener() { // from class: com.taobao.mediaplay.j.8
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
                    j.f(j.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    j.f(j.this);
                }
            }
        });
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        MediaContext mediaContext = this.f18023a;
        if (mediaContext == null || !(mediaContext.getContext() instanceof Activity)) {
            return;
        }
        DWViewUtil.setNavigationBar(this.f18023a.getWindow() == null ? ((Activity) this.f18023a.getContext()).getWindow() : this.f18023a.getWindow(), this.x);
        this.d.post(new Runnable() { // from class: com.taobao.mediaplay.j.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (j.e(j.this).getParent() != j.g(j.this)) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    j.e(j.this).requestLayout();
                    if (j.e(j.this).getParent() != null && (j.e(j.this).getParent() instanceof ViewGroup)) {
                        ((ViewGroup) j.e(j.this).getParent()).removeView(j.e(j.this));
                        j.g(j.this).addView(j.e(j.this), layoutParams);
                    }
                    if (j.h(j.this).getVideo().f() == 4) {
                        j.i(j.this).a(j.this.d(), false);
                    }
                    j.e(j.this).setTranslationX(j.j(j.this));
                    j.e(j.this).setTranslationY(j.k(j.this));
                    j.e(j.this).requestLayout();
                    j.a(j.this, false);
                }
                j.h(j.this).setVideoScreenType(MediaPlayScreenType.NORMAL);
                j.i(j.this).a(MediaPlayScreenType.NORMAL);
                j.e(j.this).setLayerType(0, null);
            }
        });
        MediaContext mediaContext2 = this.f18023a;
        if (mediaContext2 == null || mediaContext2.mHookKeyBackToggleEvent) {
            return;
        }
        this.f18023a.unregisterKeyBackEventListener(this);
    }

    private void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, "translationY", i2);
        this.l.setTranslationY(this.p);
        this.l.setTranslationX(this.o);
        this.k = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.l, "rotation", 0.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.mediaplay.j.10
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
                layoutParams.width = (int) (j.a(j.this) + (((j.b(j.this) - j.a(j.this)) * abs) / 90.0f));
                layoutParams.height = (int) (j.c(j.this) + (((j.d(j.this) - j.c(j.this)) * abs) / 90.0f));
                layoutParams.gravity = 17;
                j.e(j.this).setLayoutParams(layoutParams);
            }
        });
        this.k.setDuration(150L);
        this.k.play(ofFloat3);
        this.k.play(ofFloat);
        this.k.play(ofFloat2);
        this.k.start();
        this.k.addListener(new Animator.AnimatorListener() { // from class: com.taobao.mediaplay.j.11
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
                    j.l(j.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    j.l(j.this);
                }
            }
        });
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        MediaContext mediaContext = this.f18023a;
        if (mediaContext == null || !(mediaContext.getContext() instanceof Activity)) {
            return;
        }
        DWViewUtil.setNavigationBar(this.f18023a.getWindow() == null ? ((Activity) this.f18023a.getContext()).getWindow() : this.f18023a.getWindow(), this.x);
        this.d.post(new Runnable() { // from class: com.taobao.mediaplay.j.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (j.e(j.this).getParent() != j.g(j.this)) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    j.e(j.this).requestLayout();
                    if (j.e(j.this).getParent() != null && (j.e(j.this).getParent() instanceof ViewGroup)) {
                        ((ViewGroup) j.e(j.this).getParent()).removeView(j.e(j.this));
                        j.g(j.this).addView(j.e(j.this), layoutParams);
                    }
                    if (j.h(j.this).getVideo().f() == 4) {
                        j.i(j.this).a(j.this.d(), false);
                    }
                    j.e(j.this).setTranslationX(j.j(j.this));
                    j.e(j.this).setTranslationY(j.k(j.this));
                    j.e(j.this).requestLayout();
                    j.a(j.this, false);
                }
                j.h(j.this).setVideoScreenType(MediaPlayScreenType.NORMAL);
                j.i(j.this).a(MediaPlayScreenType.NORMAL);
                j.e(j.this).setLayerType(0, null);
            }
        });
        MediaContext mediaContext2 = this.f18023a;
        if (mediaContext2 == null || mediaContext2.mHookKeyBackToggleEvent) {
            return;
        }
        this.f18023a.unregisterKeyBackEventListener(this);
    }

    private void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.f18023a;
        if (mediaContext == null || !(mediaContext.getContext() instanceof Activity)) {
            return;
        }
        this.i = false;
        if (m().getParent() == null || m().getParent().getParent() == null) {
            return;
        }
        this.u = true;
        if (this.l == null && this.m == null) {
            this.l = (ViewGroup) m().getParent();
            this.m = (ViewGroup) this.l.getParent();
        }
        this.l.setLayerType(2, null);
        this.q = new int[2];
        this.m.getLocationInWindow(this.q);
        this.r = this.l.getWidth();
        this.s = this.l.getHeight();
        if (z) {
            this.o = this.l.getTranslationX();
            this.p = this.l.getTranslationY();
        }
        if (this.n == null) {
            this.n = (FrameLayout) ((Activity) this.f18023a.getContext()).getWindow().getDecorView();
        }
        if (z) {
            this.w = DWViewUtil.getVideoWidthInLandscape((Activity) this.f18023a.getContext());
            this.v = DWViewUtil.getPortraitScreenWidth();
        } else {
            this.w = DWViewUtil.getRealWithInPx(this.f18023a.getContext());
            this.v = DWViewUtil.getVideoWidthInLandscape((Activity) this.f18023a.getContext());
        }
        if (this.l.getParent() != this.n) {
            this.m.removeView(this.l);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.width = this.r;
            layoutParams.height = this.s;
            int i = layoutParams.topMargin;
            int[] iArr = this.q;
            if (i != iArr[1]) {
                layoutParams.topMargin = iArr[1];
            }
            int i2 = layoutParams.leftMargin;
            int[] iArr2 = this.q;
            if (i2 != iArr2[0]) {
                layoutParams.leftMargin = iArr2[0];
            }
            this.n.addView(this.l, layoutParams);
            if (this.f18023a.getVideo().f() == 4) {
                this.b.a(d(), false);
            }
        }
        int statusBarHeight = Build.VERSION.SDK_INT < 18 ? DWViewUtil.getStatusBarHeight(this.f18023a.getContext()) : 0;
        if (z) {
            int[] iArr3 = this.q;
            c(-iArr3[0], statusBarHeight - iArr3[1]);
            return;
        }
        int i3 = this.w;
        int i4 = this.v;
        int[] iArr4 = this.q;
        d(((i3 - i4) / 2) - iArr4[0], statusBarHeight + (((i4 - i3) / 2) - iArr4[1]));
    }

    private void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        MediaContext mediaContext = this.f18023a;
        if (mediaContext == null || !(mediaContext.getContext() instanceof Activity)) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, "translationY", i2);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 90.0f);
        this.j = new AnimatorSet();
        long j = 150;
        this.j.setDuration(j);
        this.j.play(ofFloat3);
        this.j.play(ofFloat);
        this.j.play(ofFloat2);
        this.d.post(new Runnable() { // from class: com.taobao.mediaplay.j.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    j.m(j.this).start();
                }
            }
        });
        ofFloat3.setDuration(j);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.mediaplay.j.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j.e(j.this).getLayoutParams();
                layoutParams.width = (int) (j.a(j.this) + (((j.b(j.this) - j.a(j.this)) * floatValue) / 90.0f));
                layoutParams.height = (int) (j.c(j.this) + (((j.d(j.this) - j.c(j.this)) * floatValue) / 90.0f));
                j.e(j.this).requestLayout();
                if (floatValue <= 20.0f || Build.VERSION.SDK_INT != 18 || j.n(j.this)) {
                    return;
                }
                ((Activity) j.h(j.this).getContext()).getWindow().setFlags(1024, 1024);
                j.b(j.this, true);
            }
        });
        ofFloat3.addListener(new Animator.AnimatorListener() { // from class: com.taobao.mediaplay.j.15
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
                    j.o(j.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    j.o(j.this);
                }
            }
        });
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.d.post(new Runnable() { // from class: com.taobao.mediaplay.j.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    j.e(j.this).requestLayout();
                    j.h(j.this).setVideoScreenType(MediaPlayScreenType.PORTRAIT_FULL_SCREEN);
                    j.i(j.this).a(MediaPlayScreenType.PORTRAIT_FULL_SCREEN);
                    if (j.h(j.this) != null && !j.h(j.this).mHookKeyBackToggleEvent) {
                        j.h(j.this).registerKeyBackEventListener(j.this);
                    }
                    j.e(j.this).setLayerType(0, null);
                    j.a(j.this, false);
                }
            });
        }
    }

    private void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac4048b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        MediaContext mediaContext = this.f18023a;
        if (mediaContext == null || !(mediaContext.getContext() instanceof Activity)) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, "translationY", i2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.l, "rotation", 0.0f, 90.0f);
        this.j = new AnimatorSet();
        this.j.setDuration(150);
        this.j.play(ofFloat3);
        this.j.play(ofFloat);
        this.j.play(ofFloat2);
        this.d.post(new Runnable() { // from class: com.taobao.mediaplay.j.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    j.m(j.this).start();
                }
            }
        });
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.mediaplay.j.4
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
                layoutParams.width = (int) (j.a(j.this) + (((j.b(j.this) - j.a(j.this)) * abs) / 90.0f));
                layoutParams.height = (int) (j.c(j.this) + (((j.d(j.this) - j.c(j.this)) * abs) / 90.0f));
                layoutParams.topMargin = j.p(j.this)[1];
                layoutParams.leftMargin = j.p(j.this)[0];
                j.e(j.this).setLayoutParams(layoutParams);
                if (abs <= 20.0f || Build.VERSION.SDK_INT != 18 || j.n(j.this)) {
                    return;
                }
                ((Activity) j.h(j.this).getContext()).getWindow().setFlags(1024, 1024);
                j.b(j.this, true);
            }
        });
        this.j.addListener(new Animator.AnimatorListener() { // from class: com.taobao.mediaplay.j.5
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
                    j.q(j.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    j.q(j.this);
                }
            }
        });
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else {
            this.d.post(new Runnable() { // from class: com.taobao.mediaplay.j.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    j.e(j.this).requestLayout();
                    j.h(j.this).setVideoScreenType(MediaPlayScreenType.LANDSCAPE_FULL_SCREEN);
                    j.i(j.this).a(MediaPlayScreenType.LANDSCAPE_FULL_SCREEN);
                    if (j.h(j.this) != null && !j.h(j.this).mHookKeyBackToggleEvent) {
                        j.h(j.this).registerKeyBackEventListener(j.this);
                    }
                    j.e(j.this).setLayerType(0, null);
                    j.a(j.this, false);
                }
            });
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
        } else {
            B();
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            B();
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (3 != j) {
        } else {
            AVSDKLog.d(RPCDataItems.SWITCH_TAG_LOG, " sdadsa MEDIA_INFO_VIDEO_RENDERING_START START ");
        }
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this});
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return bVar.x();
    }

    @Override // tb.mjv
    public boolean a(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e8cd358", new Object[]{this, keyEvent})).booleanValue();
        }
        if (this.f18023a.screenType() != MediaPlayScreenType.LANDSCAPE_FULL_SCREEN && this.f18023a.screenType() != MediaPlayScreenType.PORTRAIT_FULL_SCREEN) {
            return false;
        }
        h();
        return true;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.b.isPlaying();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.b.o();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.b.A();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b.b(str);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b.c(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.b.d(str);
        }
    }

    public void a(TaoLiveVideoView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a320bc1a", new Object[]{this, dVar});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(dVar);
    }

    public j(MediaContext mediaContext) {
        this.f18023a = mediaContext;
        if (!TextUtils.isEmpty(this.f18023a.getVideoToken())) {
            MediaContext mediaContext2 = this.f18023a;
            this.b = new com.taobao.mediaplay.player.k(mediaContext2, mediaContext2.getVideoToken());
        } else {
            this.b = new com.taobao.mediaplay.player.k(this.f18023a);
        }
        this.b.a(mediaContext.mLoop);
        this.b.a(this);
    }

    public View m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93b2e9b6", new Object[]{this}) : this.b.g();
    }

    public Bitmap n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d5829dd3", new Object[]{this});
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            return bVar.h();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "yezo:getCurrentFrame with mVideoView == null");
        return null;
    }

    public com.taobao.mediaplay.player.b o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mediaplay.player.b) ipChange.ipc$dispatch("62b5ed29", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.mediaplay.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if ((this.b.d() == 1 && TextUtils.isEmpty(this.f18023a.getVideoToken())) || (!TextUtils.isEmpty(this.f18023a.getVideoToken()) && this.b.d() == 1)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "start index=null because return by mVideoView.getVideoState()=" + this.b.d());
            com.taobao.mediaplay.player.b bVar = this.b;
            if (!(bVar instanceof com.taobao.mediaplay.player.k)) {
                return;
            }
            ((com.taobao.mediaplay.player.k) bVar).ai();
        } else {
            if (this.b.d() == 3 && this.f18023a.mEnableNewTBPlayer) {
                com.taobao.mediaplay.player.b bVar2 = this.b;
                if (bVar2 instanceof com.taobao.mediaplay.player.k) {
                    ((com.taobao.mediaplay.player.k) bVar2).am();
                }
            }
            q();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        if ((this.b.d() == 1 && TextUtils.isEmpty(this.f18023a.getVideoToken())) || (!TextUtils.isEmpty(this.f18023a.getVideoToken()) && this.b.d() == 1)) {
            z = true;
        }
        if (z) {
            return;
        }
        this.b.m();
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.b.d() == 5 || this.b.d() == 8 || !TextUtils.isEmpty(this.f18023a.getVideoToken())) {
            this.b.l();
        } else if (this.b.d() == 4 || (this.b.e() && this.b.f() == 4)) {
            if (this.b.e()) {
                this.b.e(0);
            } else {
                this.b.c(0);
            }
            b();
        } else if (this.b.d() == 2) {
            b();
        } else {
            this.b.l();
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, " enter setVideoSource , Url is " + str);
        if (TextUtils.isEmpty(str)) {
            MediaContext mediaContext = this.f18023a;
            if (mediaContext == null) {
                return;
            }
            com.taobao.taobaoavsdk.util.c.c(mediaContext.mMediaPlayContext.mTLogAdapter, "setVideoSource## sorry  VideoSource is Empty  ");
        } else if (this.f18023a.mMediaPlayContext.mLocalVideo) {
            this.b.a(str);
        } else {
            if (str.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + str;
            }
            this.b.a(this.f18023a.getUTParams());
            this.b.a(str);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d.removeCallbacks(this.g);
        MediaContext mediaContext = this.f18023a;
        if (mediaContext != null) {
            mediaContext.mMediaPlayContext.mute(z);
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null && (bVar instanceof com.taobao.mediaplay.player.k)) {
            ((com.taobao.mediaplay.player.k) bVar).i(z);
        }
        if (z) {
            this.e = true;
            this.b.a(0.0f);
            this.c = z;
            return;
        }
        this.f = com.taobao.mediaplay.player.b.l;
        this.c = z;
        if (this.e) {
            this.b.a(this.f * 0.2f);
            if (this.b.d() != 1) {
                return;
            }
            B();
            return;
        }
        this.b.a(this.f);
    }

    public void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{this, new Integer(i), str});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null || !(bVar instanceof com.taobao.mediaplay.player.k)) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).b(i, str);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null || !(bVar instanceof com.taobao.mediaplay.player.k)) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).h(i);
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        this.d.removeCallbacks(this.g);
        this.f = f;
        if (this.e && f != 0.0f) {
            this.b.a(f * 0.2f);
        } else {
            this.b.a(f);
        }
    }

    @Override // com.taobao.mediaplay.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.n();
        }
    }

    @Override // com.taobao.mediaplay.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.b(false);
        }
    }

    @Override // com.taobao.mediaplay.a
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.b.b(f);
        }
    }

    @Override // com.taobao.mediaplay.a
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b.p();
    }

    @Override // com.taobao.mediaplay.a
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.b.getCurrentPosition();
    }

    @Override // com.taobao.mediaplay.a
    public float C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5ab3a", new Object[]{this})).floatValue() : this.b.Q();
    }

    @Override // com.taobao.mediaplay.a
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.b.s();
    }

    @Override // com.taobao.mediaplay.a
    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.b.d();
    }

    @Override // com.taobao.mediaplay.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.d(z);
        }
    }

    @Override // com.taobao.mediaplay.a
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b.e(z);
        }
    }

    @Override // com.taobao.mediaplay.a
    public void a(com.taobao.mediaplay.player.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb8e9b8", new Object[]{this, eVar});
        } else {
            this.b.a(eVar);
        }
    }

    public void a(com.taobao.mediaplay.player.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bba46d5", new Object[]{this, hVar});
        } else {
            this.b.a(hVar);
        }
    }

    @Override // com.taobao.mediaplay.a
    public void a(com.taobao.mediaplay.player.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb87559", new Object[]{this, dVar});
        } else {
            this.b.a(dVar);
        }
    }

    @Override // com.taobao.mediaplay.a
    public void a(com.taobao.mediaplay.player.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb95e17", new Object[]{this, fVar});
        } else {
            this.b.a(fVar);
        }
    }

    public void b(com.taobao.mediaplay.player.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff89676", new Object[]{this, fVar});
        } else {
            this.b.b(fVar);
        }
    }

    @Override // com.taobao.mediaplay.a
    public void a(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f44224", new Object[]{this, mediaAspectRatio});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(mediaAspectRatio);
    }

    @Override // com.taobao.mediaplay.a
    public void a(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9d8762", new Object[]{this, onVideoClickListener});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(onVideoClickListener);
    }

    public void b(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80b83c1", new Object[]{this, onVideoClickListener});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.b(onVideoClickListener);
    }

    @Override // com.taobao.mediaplay.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(i, j);
    }

    @Override // com.taobao.mediaplay.a
    public void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(i, f);
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (this.c || this.f == 0.0f || !this.e) {
        } else {
            this.e = false;
            this.h = 0;
            if (this.g == null) {
                this.g = new Runnable() { // from class: com.taobao.mediaplay.j.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        j.r(j.this);
                        j.i(j.this).a(j.s(j.this) * ((j.t(j.this) * 0.2f) + 0.2f));
                        if (j.t(j.this) >= 4) {
                            return;
                        }
                        j.v(j.this).postDelayed(j.u(j.this), 500L);
                    }
                };
            }
            this.d.postDelayed(this.g, 500L);
        }
    }

    public void a(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d69515", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).a(mediaLiveWarmupConfig);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.b.r();
        Handler handler = this.d;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public boolean a(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4a689d8", new Object[]{this, mkbVar})).booleanValue();
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            return ((com.taobao.mediaplay.player.k) bVar).a(mkbVar);
        }
        return false;
    }

    public boolean b(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3299059", new Object[]{this, mkbVar})).booleanValue();
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            return ((com.taobao.mediaplay.player.k) bVar).b(mkbVar);
        }
        return false;
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).a(ddeVar);
    }

    public void a(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a40a2", new Object[]{this, innerStartFuncListener});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).a(innerStartFuncListener);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).g(z);
    }

    public boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef535ec", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return ((com.taobao.mediaplay.player.k) bVar).f(z);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).L();
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).e(str);
    }

    public void a(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2709489d", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).a(z, i, z2);
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).a(i, str);
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).h(z);
    }

    public void a(com.taobao.mediaplay.player.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbb2f93", new Object[]{this, jVar});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).a(jVar);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).N();
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).O();
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).P();
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).b(map);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        ((com.taobao.mediaplay.player.k) bVar).a(context);
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this});
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return bVar.B();
    }
}
