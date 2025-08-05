package com.taobao.android.fluid.business.containerframe.frames;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import tb.kge;
import tb.plm;

/* loaded from: classes5.dex */
public abstract class c extends b implements plm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a.c e;
    private boolean f;
    private final Handler g;

    static {
        kge.a(1526284030);
        kge.a(-896969833);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Handler a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("2f6cf9d3", new Object[]{cVar}) : cVar.g;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adcb9725", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.f = z;
        return z;
    }

    public c(FluidContext fluidContext) {
        super(fluidContext, fluidContext.getContext());
        this.g = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.business.containerframe.frames.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else {
                    c.a(c.this, false);
                }
            }
        };
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            g();
        }
    }

    public boolean onHandleBackKeyEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cb96814", new Object[]{this})).booleanValue();
        }
        g();
        return true;
    }

    public void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5eda45", new Object[]{this, cVar});
            return;
        }
        this.e = cVar;
        this.d = false;
        if (this.c == null) {
            return;
        }
        this.c.setVisibility(0);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f || this.c == null) {
        } else {
            Animation j = j();
            j.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.fluid.business.containerframe.frames.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    c.this.a();
                    c.a(c.this).removeMessages(0);
                    c.a(c.this).sendEmptyMessageDelayed(0, 150L);
                }
            });
            this.c.startAnimation(j);
            ((IBackEventService) this.f12380a.getService(IBackEventService.class)).getBackKeyEventDetector().a(this);
            this.f = true;
            this.g.sendEmptyMessageDelayed(0, 550L);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        b();
        if (this.c != null) {
            this.c.startAnimation(i());
        }
        if (!c()) {
            return;
        }
        ((IBackEventService) this.f12380a.getService(IBackEventService.class)).getBackKeyEventDetector().b(this);
    }

    public Animation i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("410ae6a6", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public Animation j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("a25d8345", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }
}
