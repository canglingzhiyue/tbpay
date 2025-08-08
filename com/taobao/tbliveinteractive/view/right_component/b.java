package com.taobao.tbliveinteractive.view.right_component;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.tbliveinteractive.e;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.kge;
import tb.qmz;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f22163a;
    private final String b;
    private Context c;
    private FrameLayout d;
    private a e;
    private e f;
    private final int j;
    private final int k;
    private final int l;
    private ConcurrentLinkedQueue<InteractiveComponentRightAnim> g = new ConcurrentLinkedQueue<>();
    private boolean h = false;
    private boolean i = false;
    private final float m = 0.4f;
    private final int n = 300;
    private final int o = 100;
    private final float p = 0.5f;

    /* renamed from: com.taobao.tbliveinteractive.view.right_component.b$3  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass3 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f22167a;
        public final /* synthetic */ InteractiveComponentRightAnim b;

        public AnonymousClass3(DXRootView dXRootView, InteractiveComponentRightAnim interactiveComponentRightAnim) {
            this.f22167a = dXRootView;
            this.b = interactiveComponentRightAnim;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (b.b(b.this) == null) {
            } else {
                int measuredWidth = b.b(b.this).getMeasuredWidth();
                int measuredHeight = b.b(b.this).getMeasuredHeight();
                String c = b.c();
                Log.e(c, "停留动画 " + b.b(b.this).getTranslationX() + "," + b.b(b.this).getTranslationY() + "   " + b.b(b.this).getScaleX() + "," + b.b(b.this).getScaleY());
                this.f22167a.setPivotX(0.0f);
                this.f22167a.setPivotY(0.0f);
                this.f22167a.animate().translationX(((float) measuredWidth) * 0.25f).translationY(((float) measuredHeight) * 0.25f).scaleX(0.5f).scaleY(0.5f).alpha(1.0f).setStartDelay((long) this.b.stayDuration).setDuration((long) this.b.dxDisAppearDuration).withStartAction(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.3.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.b(b.this) == null || StringUtils.isEmpty(AnonymousClass3.this.b.additionalAnimation)) {
                        } else {
                            AliUrlImageView aliUrlImageView = new AliUrlImageView(b.d(b.this));
                            aliUrlImageView.setSkipAutoSize(true);
                            aliUrlImageView.setImageUrl(AnonymousClass3.this.b.additionalAnimation);
                            b.b(b.this).addView(aliUrlImageView, new ViewGroup.LayoutParams(-1, -1));
                        }
                    }
                }).withEndAction(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.b(b.this) == null) {
                        } else {
                            b.b(b.this).postDelayed(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.3.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        b.a(b.this, AnonymousClass3.this.b);
                                    }
                                }
                            }, AnonymousClass3.this.b.apngStayDuration);
                        }
                    }
                }).start();
            }
        }
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71616c9c", new Object[]{bVar});
        } else {
            bVar.d();
        }
    }

    public static /* synthetic */ void a(b bVar, InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef55c18", new Object[]{bVar, interactiveComponentRightAnim});
        } else {
            bVar.c(interactiveComponentRightAnim);
        }
    }

    public static /* synthetic */ void a(b bVar, InteractiveComponentRightAnim interactiveComponentRightAnim, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4919999", new Object[]{bVar, interactiveComponentRightAnim, dXRootView});
        } else {
            bVar.a(interactiveComponentRightAnim, dXRootView);
        }
    }

    public static /* synthetic */ FrameLayout b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("abe0083e", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ e c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("303ce380", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : f22163a;
    }

    public static /* synthetic */ Context d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f86cf5f1", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ String e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8fc7e88", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ int f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3202e02a", new Object[]{bVar})).intValue() : bVar.j;
    }

    public static /* synthetic */ int g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("beeff749", new Object[]{bVar})).intValue() : bVar.l;
    }

    public static /* synthetic */ int h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4bdd0e68", new Object[]{bVar})).intValue() : bVar.k;
    }

    public static /* synthetic */ void i(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ca2594", new Object[]{bVar});
        } else {
            bVar.e();
        }
    }

    static {
        kge.a(391612876);
        f22163a = b.class.getSimpleName();
    }

    public b(String str, Context context, FrameLayout frameLayout, e eVar, a aVar) {
        this.b = str;
        this.c = context;
        this.d = frameLayout;
        this.f = eVar;
        this.e = aVar;
        this.j = com.taobao.taolive.sdk.utils.b.a(this.c, 28.0f);
        this.l = com.taobao.taolive.sdk.utils.b.a(this.c, 20.0f);
        this.k = com.taobao.taolive.sdk.utils.b.a(this.c, 48.0f);
    }

    public void a(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40cdcc", new Object[]{this, interactiveComponentRightAnim});
            return;
        }
        if (interactiveComponentRightAnim != null && "lottery".equals(interactiveComponentRightAnim.animationType)) {
            if (this.g.contains(interactiveComponentRightAnim)) {
                this.g.remove(interactiveComponentRightAnim);
                this.g.offer(interactiveComponentRightAnim);
            } else {
                this.g.offer(interactiveComponentRightAnim);
            }
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            return;
        }
        frameLayout.postDelayed(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a(b.this);
                }
            }
        }, 300L);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h = true;
        d();
    }

    private void d() {
        InteractiveComponentRightAnim poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.h || this.g.isEmpty() || this.i || (poll = this.g.poll()) == null || b(poll)) {
        } else {
            d();
        }
    }

    private boolean b(final InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73e2106f", new Object[]{this, interactiveComponentRightAnim})).booleanValue();
        }
        if (u.aU() && p.a("enableBanShowRightAnim", false)) {
            return false;
        }
        e eVar = this.f;
        if (eVar != null && eVar.r() != null && this.f.r().R() != null) {
            this.f.r().R().a("hasShowRightAnim", "true");
        }
        final Integer num = null;
        a aVar = this.e;
        if (aVar != null) {
            num = aVar.a(interactiveComponentRightAnim);
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout == null || num == null) {
            return false;
        }
        this.i = true;
        frameLayout.post(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b.b(b.this) == null) {
                } else {
                    b.b(b.this).removeAllViews();
                    final DXRootView a2 = qmz.a(b.c(b.this), b.d(b.this), interactiveComponentRightAnim.dxTemplate);
                    if (a2 == null) {
                        return;
                    }
                    qmz.a(b.c(b.this), a2, interactiveComponentRightAnim.parseJsonComponentRightAnim(), b.e(b.this));
                    b.b(b.this).addView(a2);
                    b.b(b.this).setVisibility(0);
                    int measuredWidth = b.b(b.this).getMeasuredWidth();
                    int measuredHeight = b.b(b.this).getMeasuredHeight();
                    b.b(b.this).setPivotX(0.0f);
                    b.b(b.this).setPivotY(0.0f);
                    b.b(b.this).setScaleX(0.0f);
                    b.b(b.this).setScaleY(0.0f);
                    b.b(b.this).setTranslationX(b.f(b.this) + measuredWidth);
                    b.b(b.this).setTranslationY(b.g(b.this) + (b.h(b.this) * num.intValue()));
                    b.b(b.this).setAlpha(0.0f);
                    String c = b.c();
                    Log.e(c, "出现动画 " + b.b(b.this).getTranslationX() + "," + b.b(b.this).getTranslationY() + "   " + b.b(b.this).getScaleX() + "," + b.b(b.this).getScaleY());
                    b.b(b.this).animate().translationX(((float) measuredWidth) * 0.3f).translationY(((float) measuredHeight) * 0.3f).scaleX(0.4f).scaleY(0.4f).alpha(1.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                b.a(b.this, interactiveComponentRightAnim, a2);
                            }
                        }
                    }).start();
                }
            }
        });
        return true;
    }

    private void a(InteractiveComponentRightAnim interactiveComponentRightAnim, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1076474d", new Object[]{this, interactiveComponentRightAnim, dXRootView});
        } else if (this.d == null) {
        } else {
            String str = f22163a;
            Log.e(str, "放大动画 " + this.d.getTranslationX() + "," + this.d.getTranslationY() + "   " + this.d.getScaleX() + "," + this.d.getScaleY());
            this.d.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new AnonymousClass3(dXRootView, interactiveComponentRightAnim)).start();
        }
    }

    private void c(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b983530a", new Object[]{this, interactiveComponentRightAnim});
        } else if (this.d == null) {
        } else {
            final Integer num = null;
            a aVar = this.e;
            if (aVar != null) {
                num = aVar.b(interactiveComponentRightAnim);
            }
            final int measuredWidth = this.d.getMeasuredWidth();
            int measuredHeight = this.d.getMeasuredHeight();
            if (num != null) {
                String str = f22163a;
                Log.e(str, "缩小动画 " + this.d.getTranslationX() + "," + this.d.getTranslationY() + "   " + this.d.getScaleX() + "," + this.d.getScaleY());
                this.d.animate().translationX(((float) measuredWidth) * 0.3f).translationY(((float) measuredHeight) * 0.3f).scaleX(0.4f).scaleY(0.4f).alpha(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.b(b.this) == null) {
                        } else {
                            String c = b.c();
                            Log.e(c, "消失动画 " + b.b(b.this).getTranslationX() + "," + b.b(b.this).getTranslationY() + "   " + b.b(b.this).getScaleX() + "," + b.b(b.this).getScaleY());
                            b.b(b.this).animate().translationX((float) (b.f(b.this) + measuredWidth)).translationY((float) (b.g(b.this) + (b.h(b.this) * num.intValue()))).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        b.i(b.this);
                                    }
                                }
                            }).start();
                        }
                    }
                }).start();
                return;
            }
            this.d.animate().translationX(measuredWidth / 2.0f).translationY(measuredHeight / 2.0f).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(400L).withEndAction(new Runnable() { // from class: com.taobao.tbliveinteractive.view.right_component.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.i(b.this);
                    }
                }
            }).start();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.d.setVisibility(8);
        }
        this.i = false;
        d();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h = false;
        this.g.clear();
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            return;
        }
        frameLayout.animate().cancel();
        this.d.clearAnimation();
        this.d.removeAllViews();
        this.d.setVisibility(8);
        this.d = null;
    }
}
