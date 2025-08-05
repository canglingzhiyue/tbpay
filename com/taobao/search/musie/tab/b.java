package com.taobao.search.musie.tab;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f19278a;
    public d c;
    public d d;
    public Boolean e;
    public boolean b = true;
    private boolean f = true;

    static {
        kge.a(-1212000530);
    }

    public abstract View b(Context context);

    public abstract void b();

    public abstract void b(boolean z);

    public abstract void c();

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.f19278a = b(context);
        this.f19278a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.search.musie.tab.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
            }
        });
        return this.f19278a;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f19278a;
    }

    public void a(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ee156c", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
        } else if (z && this.f) {
            this.f19278a.animate().scaleX(f).scaleY(f2);
        } else {
            this.f19278a.setScaleX(f);
            this.f19278a.setScaleY(f2);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Boolean bool = this.e;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        this.e = Boolean.valueOf(z);
        if (this.b) {
            b();
            this.b = false;
            return;
        }
        b(z);
    }

    public void a(d dVar, d dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ca0008", new Object[]{this, dVar, dVar2});
            return;
        }
        this.c = dVar;
        this.d = dVar2;
        if (this.b) {
            return;
        }
        c();
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }
}
