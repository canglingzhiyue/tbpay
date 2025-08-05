package com.taobao.android.live.plugin.atype.flexalocal.topbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Message;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.h;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.f;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes6.dex */
public class a implements com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f14025a;
    public View b;
    public LottieAnimationView c;
    public AnimatorSet d;
    public AnimatorSet e;
    public f f;
    public o<g> g;

    static {
        kge.a(-817007736);
        kge.a(-1905361424);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283c02fb", new Object[]{aVar});
        } else {
            aVar.d();
        }
    }

    public a(View view) {
        this.b = view;
        this.f = new f(this);
        c();
    }

    public a(Context context, View view, LottieAnimationView lottieAnimationView) {
        this(view);
        this.f14025a = context;
        this.c = lottieAnimationView;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotationY", 0.0f, 90.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b, "rotationY", 270.0f, 360.0f);
        this.d = new AnimatorSet();
        this.d.setDuration(500L);
        this.d.playSequentially(ofFloat, ofFloat2);
        this.d.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

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
                } else if (a.this.e == null) {
                } else {
                    a.this.e.start();
                }
            }
        });
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b, "rotationY", 0.0f, 22.5f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.b, "rotationY", 22.5f, 0.0f);
        this.e = new AnimatorSet();
        this.e.setDuration(500L);
        this.e.playSequentially(ofFloat3, ofFloat4);
        this.e.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

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
                    return;
                }
                a.a(a.this);
                if (a.this.f == null) {
                    return;
                }
                a.this.f.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.a.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.this.a();
                        }
                    }
                }, 10000L);
            }
        });
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Context context = this.f14025a;
        if (context == null || str == null) {
            return;
        }
        try {
            this.g = h.a(context, str);
            this.g.a(new j<g>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.airbnb.lottie.j
                public /* synthetic */ void onResult(g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8251d27f", new Object[]{this, gVar});
                    } else {
                        a(gVar);
                    }
                }

                public void a(g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("471c924d", new Object[]{this, gVar});
                    } else if (gVar == null) {
                        pmd.a().m().a("OfficialEnhanceAnimatorManager", "loadLottieAnimation#onResult success, lottieComposition is null");
                    } else {
                        if (a.this.c != null) {
                            a.this.c.setComposition(gVar);
                        }
                        if (a.this.g == null) {
                            return;
                        }
                        a.this.g.b(this);
                    }
                }
            }).c(new j<Throwable>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.airbnb.lottie.j
                public /* synthetic */ void onResult(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8251d27f", new Object[]{this, th});
                    } else {
                        a(th);
                    }
                }

                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                        return;
                    }
                    pnj m = pmd.a().m();
                    m.a("OfficialEnhanceAnimatorManager", "loadLottieAnimation#onResult fail, msg=" + th.getMessage());
                    if (a.this.g == null) {
                        return;
                    }
                    a.this.g.d(this);
                }
            });
        } catch (Throwable unused) {
            pmd.a().m().a("OfficialEnhanceAnimatorManager", "loadLottieAnimation error");
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.c;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.cancelAnimation();
        this.c.setVisibility(0);
        this.c.playAnimation();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            return;
        }
        animatorSet.start();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null) {
            view.setRotationY(0.0f);
            this.b.requestLayout();
        }
        LottieAnimationView lottieAnimationView = this.c;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
            this.c.setVisibility(8);
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.e;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        f fVar = this.f;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }
}
