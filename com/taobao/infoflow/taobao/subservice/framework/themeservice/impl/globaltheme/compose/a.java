package com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import tb.esr;
import tb.gbg;
import tb.kge;
import tb.ldf;
import tb.onq;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f17576a;
    private String b;
    private Paint d;
    private int c = -1;
    private BitmapDrawable e = null;
    private Path f = null;
    private RectF g = null;
    private final int h = gbg.b(Globals.getApplication(), 18.0f);
    private int i = -1;
    private int j = gbg.b(Globals.getApplication());

    public static /* synthetic */ BitmapDrawable a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("87ec4ab7", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ BitmapDrawable a(a aVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("7186c862", new Object[]{aVar, bitmapDrawable});
        }
        aVar.e = bitmapDrawable;
        return bitmapDrawable;
    }

    public static /* synthetic */ void a(a aVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22b5078", new Object[]{aVar, drawable});
        } else {
            aVar.a(drawable);
        }
    }

    static {
        kge.a(-1315449537);
        f17576a = a.class.getSimpleName();
    }

    public a() {
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = new Paint(1);
        this.d.setStyle(Paint.Style.FILL_AND_STROKE);
        this.d.setColor(-1);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            a();
        } else {
            if (this.e == null || !str.equals(this.b)) {
                c(str);
            }
            this.b = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            try {
                this.c = Color.parseColor(str);
            } catch (Exception e) {
                ldf.d(f17576a, "setMaskBackgroundColor color error");
                e.printStackTrace();
            }
        } else {
            this.c = -1;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = null;
        this.b = null;
        this.d.setColor(-1);
    }

    public void a(Canvas canvas, ViewGroup viewGroup, View view, int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251e0d7b", new Object[]{this, canvas, viewGroup, view, new Integer(i), iArr});
            return;
        }
        canvas.save();
        this.d.setColor(this.c);
        if (view != null) {
            BitmapDrawable bitmapDrawable = this.e;
            if (bitmapDrawable != null) {
                bitmapDrawable.setBounds(0, view.getTop(), this.j, view.getTop() + this.i);
                this.e.draw(canvas);
                canvas.drawRect(viewGroup.getLeft(), view.getTop() + this.i, viewGroup.getRight(), viewGroup.getBottom(), this.d);
            } else {
                a(view, viewGroup);
                canvas.drawPath(this.f, this.d);
            }
        } else if (iArr != null && iArr[0] > i) {
            canvas.drawRect(0.0f, 0.0f, viewGroup.getRight(), viewGroup.getBottom(), this.d);
        } else {
            this.d.setColor(0);
            canvas.drawRect(0.0f, 0.0f, viewGroup.getRight(), viewGroup.getBottom(), this.d);
        }
        canvas.restore();
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            com.taobao.phenix.intf.b.h().a(onq.a(str, (String) null), str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, onq.b(str, "5401")).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    a.a(a.this, succPhenixEvent.getDrawable());
                    a aVar = a.this;
                    a.a(aVar, (Drawable) a.a(aVar));
                    return false;
                }
            }).fetch();
        }
    }

    private void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth < 0) {
            this.i = 0;
        } else {
            this.i = (this.j * intrinsicHeight) / intrinsicWidth;
        }
    }

    private void a(View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d971a9", new Object[]{this, view, viewGroup});
            return;
        }
        if (this.f == null) {
            this.f = new Path();
        }
        if (this.g == null) {
            this.g = new RectF();
        }
        this.f.reset();
        this.f.moveTo(viewGroup.getLeft(), viewGroup.getBottom());
        this.f.lineTo(viewGroup.getLeft(), view.getTop() + this.h);
        this.g.set(viewGroup.getLeft(), view.getTop(), viewGroup.getLeft() + (this.h * 2), view.getTop() + (this.h * 2));
        this.f.arcTo(this.g, 180.0f, 90.0f);
        this.f.lineTo(viewGroup.getRight() - this.h, view.getTop());
        this.g.set(viewGroup.getRight() - (this.h * 2), view.getTop(), viewGroup.getRight(), view.getTop() + (this.h * 2));
        this.f.arcTo(this.g, 270.0f, 90.0f);
        this.f.lineTo(viewGroup.getRight(), viewGroup.getBottom());
        this.f.close();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.j = gbg.b(Globals.getApplication());
        BitmapDrawable bitmapDrawable = this.e;
        if (bitmapDrawable == null) {
            return;
        }
        a(bitmapDrawable);
    }
}
