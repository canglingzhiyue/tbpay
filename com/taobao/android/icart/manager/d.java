package com.taobao.android.icart.manager;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.android.icart.core.data.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.adc;
import tb.bbz;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TUrlImageView f12843a;
    private String b;
    private View c;
    private ViewGroup d;
    private boolean e;
    private RecyclerView f;
    private adc g;
    private int h;
    private bbz i;

    static {
        kge.a(590784949);
    }

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399f332e", new Object[]{dVar});
        } else {
            dVar.c();
        }
    }

    public static /* synthetic */ View b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4f2a68b1", new Object[]{dVar}) : dVar.c;
    }

    public d(bbz bbzVar, adc adcVar, ViewGroup viewGroup, RecyclerView recyclerView) {
        this.d = viewGroup;
        this.f12843a = new TUrlImageView(bbzVar.m());
        this.h = bbzVar.x().a(160.0f);
        this.f12843a.setLayoutParams(new ViewGroup.LayoutParams(-1, this.h));
        this.f12843a.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f = recyclerView;
        this.g = adcVar;
        this.c = new View(bbzVar.m());
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, this.h));
        this.c.setAlpha(0.0f);
        this.c.setBackgroundColor(-1);
        this.i = bbzVar;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5598b34f", new Object[]{this, fVar});
            return;
        }
        if (fVar == null || fVar.j() == null) {
            z = false;
        }
        this.e = z;
        this.b = fVar != null ? fVar.j() : "";
        if (this.e) {
            b();
        } else {
            a();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == null) {
        } else {
            this.c.setAlpha(0.0f);
            this.f12843a.setImageUrl(this.b);
            if (this.f12843a.getParent() == null) {
                this.d.addView(this.f12843a, 0);
            }
            if (this.c.getParent() == null) {
                this.d.addView(this.c, 1);
            }
            this.f12843a.setVisibility(0);
            this.f.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.manager.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    } else if (i != 0) {
                    } else {
                        d.a(d.this);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    } else {
                        d.a(d.this);
                    }
                }
            });
            final ViewGroup y = this.i.x().d().y();
            y.post(new Runnable() { // from class: com.taobao.android.icart.manager.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int height = y.getHeight();
                    ViewGroup.LayoutParams layoutParams = d.b(d.this).getLayoutParams();
                    if (layoutParams == null) {
                        return;
                    }
                    layoutParams.height = height;
                    d.b(d.this).requestLayout();
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        float b = this.g.b();
        this.f12843a.setTranslationY(-b);
        int i = this.h;
        float f = 1.0f;
        if (b / i <= 1.0f) {
            f = b / i;
        }
        this.c.setAlpha(f);
        a(b > 0.0f ? com.taobao.android.weex_framework.util.a.ATOM_EXT_white : "dark");
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        List<IDMComponent> e = this.i.x().e().e();
        if (e == null) {
            return;
        }
        for (IDMComponent iDMComponent : e) {
            if (!TextUtils.equals(str, iDMComponent.getFields().getString("_themeState"))) {
                iDMComponent.getFields().put("_themeState", (Object) str);
                z = true;
            }
        }
        if (!z) {
            return;
        }
        this.i.x().d().a(1);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d.removeView(this.f12843a);
        this.d.removeView(this.c);
        this.f12843a.setVisibility(8);
        this.c.setAlpha(0.0f);
    }
}
