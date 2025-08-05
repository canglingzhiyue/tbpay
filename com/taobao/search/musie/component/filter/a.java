package com.taobao.search.musie.component.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.muise.h;
import com.taobao.android.xsearchplugin.muise.o;
import com.taobao.weex.WXSDKInstance;
import tb.ius;
import tb.jze;
import tb.jzf;
import tb.kge;

/* loaded from: classes7.dex */
public class a implements View.OnClickListener, ViewTreeObserver.OnScrollChangedListener, h, b, jze {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ius f19231a;
    public String b;
    private final int c;
    private final TbFilter d;
    private boolean e = false;
    private boolean f = false;
    private View g;
    private ValueAnimator h;
    private int i;
    private View j;

    static {
        kge.a(-753983443);
        kge.a(-313493272);
        kge.a(-1201612728);
        kge.a(-1055616380);
        kge.a(-1249230565);
        kge.a(-1433887687);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public static /* synthetic */ TbFilter a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TbFilter) ipChange.ipc$dispatch("8a6e5c41", new Object[]{aVar}) : aVar.d;
    }

    public a(TbFilter tbFilter, ius iusVar, int i, String str) {
        this.d = tbFilter;
        this.f19231a = iusVar;
        this.c = i;
        this.b = str;
    }

    @Override // com.taobao.search.musie.component.filter.b
    public void a(FrameLayout frameLayout, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2021bf07", new Object[]{this, frameLayout, view});
            return;
        }
        this.j = view;
        this.e = true;
        View view2 = this.f19231a.getView();
        if (view2 == null) {
            return;
        }
        view2.setOnClickListener(this);
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        a(view);
        frameLayout.addView(view2);
        ius iusVar = this.f19231a;
        if (iusVar instanceof o) {
            ((o) iusVar).a(this);
        } else if (iusVar instanceof jzf) {
            ((jzf) iusVar).a(this);
        }
        this.d.scrollObservers.add(this);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || this.f19231a.getView() == 0 || ((FrameLayout.LayoutParams) this.f19231a.getView().getLayoutParams()) == null) {
        } else {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            int i = rect.top;
            this.d.getInstance().getRenderRoot().getGlobalVisibleRect(rect);
            this.f19231a.getView().setTranslationY((rect.bottom + this.c) - i);
        }
    }

    @Override // com.taobao.search.musie.component.filter.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e = false;
        if (!this.f || !z) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.search.musie.component.filter.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.this.f19231a.destroyAndRemoveFromParent();
                    }
                }
            });
            this.d.scrollObservers.remove(this);
            return;
        }
        b(false);
    }

    @Override // com.taobao.search.musie.component.filter.b
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.g == null) {
        } else {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.h.cancel();
                this.h = null;
            }
            if (z) {
                this.h = ObjectAnimator.ofFloat(this.g, View.TRANSLATION_Y, -this.i, 0.0f);
            } else {
                this.h = ObjectAnimator.ofFloat(this.g, View.TRANSLATION_Y, this.g.getTranslationY(), -this.i);
                this.h.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.search.musie.component.filter.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            return;
                        }
                        a.this.f19231a.destroyAndRemoveFromParent();
                        a.a(a.this).scrollObservers.remove(a.this);
                    }
                });
            }
            this.h.setDuration(200L);
            this.h.start();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.h
    public void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
            return;
        }
        this.f = true;
        this.g = pVar.getRenderRoot();
        this.i = pVar.getRootHeight();
        this.g.setTranslationY(-this.i);
        if (!this.e) {
            return;
        }
        b(true);
    }

    @Override // com.taobao.android.xsearchplugin.muise.h, tb.jze
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f = false;
        }
    }

    @Override // com.taobao.search.musie.component.filter.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f19231a.attachToContainer();
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
        } else {
            a(this.j);
        }
    }

    @Override // tb.jze
    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
            return;
        }
        this.f = true;
        this.g = wXSDKInstance.al();
        this.i = wXSDKInstance.P();
        this.g.setTranslationY(-this.i);
        if (!this.e) {
            return;
        }
        b(true);
    }
}
