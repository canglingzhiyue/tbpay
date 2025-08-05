package com.taobao.android.fluid.framework.card.cards.video.manager.landscape;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.snv;

/* loaded from: classes5.dex */
public class a$a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f12507a;
    private int b;
    private ViewGroup.LayoutParams c;
    private int d;
    private int e;
    private float f;
    private float g;
    private float h;
    private float i;

    static {
        kge.a(-1481288232);
    }

    private a$a() {
    }

    public void a(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff16fb7d", new Object[]{this, snvVar});
            return;
        }
        ViewGroup f = snvVar.f();
        if (f == null) {
            return;
        }
        ViewParent parent = f.getParent();
        if ((parent instanceof ViewGroup) && parent != this.f12507a) {
            ((ViewGroup) parent).removeView(f);
        }
        ViewGroup viewGroup = this.f12507a;
        if (viewGroup != null) {
            viewGroup.addView(f, this.b, this.c);
        }
        f.setTranslationY(this.f);
        f.setScaleX(this.g);
        f.setScaleY(this.h);
        f.setRotation(this.i);
    }

    public void b(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9a01fe", new Object[]{this, snvVar});
            return;
        }
        ViewGroup f = snvVar.f();
        if (f == null) {
            return;
        }
        Context context = f.getContext();
        if (!(context instanceof Activity) || Build.VERSION.SDK_INT < 21) {
            return;
        }
        Activity activity = (Activity) context;
        activity.getWindow().getDecorView().setSystemUiVisibility(this.d);
        activity.getWindow().setStatusBarColor(this.e);
    }

    public void c(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1d087f", new Object[]{this, snvVar});
            return;
        }
        ViewGroup f = snvVar.f();
        if (f == null) {
            return;
        }
        this.f12507a = (ViewGroup) f.getParent();
        this.c = f.getLayoutParams();
        ViewGroup viewGroup = this.f12507a;
        if (viewGroup != null) {
            this.b = viewGroup.indexOfChild(f);
        }
        Context context = f.getContext();
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 21) {
            Activity activity = (Activity) context;
            this.d = activity.getWindow().getDecorView().getSystemUiVisibility();
            this.e = activity.getWindow().getStatusBarColor();
        }
        this.f = f.getTranslationY();
        this.g = f.getScaleX();
        this.h = f.getScaleY();
        this.i = f.getRotation();
    }
}
