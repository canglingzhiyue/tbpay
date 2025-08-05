package com.taobao.android.weex_uikit.widget.text;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jwy;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends jwy implements Drawable.Callback, com.taobao.android.weex_uikit.ui.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Layout b;
    private boolean c;
    private CharSequence d;
    private ColorStateList e;
    private int f;
    private int g;
    private ClickableSpan[] h;
    private ImageSpan[] i;
    private int j;
    private int k;
    private Path l;
    private Path m;
    private boolean n;
    private Paint o;
    private b p;
    private float q;
    private boolean r;
    private Handler s;
    private a t;
    private com.taobao.android.weex_uikit.widget.text.a u;
    private String v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface b {
    }

    static {
        kge.a(-1229267558);
        kge.a(781481041);
        kge.a(-1139115842);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == 1073557659) {
            return new Boolean(super.onStateChange((int[]) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.jwy, android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // tb.jwy, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    public static /* synthetic */ com.taobao.android.weex_uikit.widget.text.a a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_uikit.widget.text.a) ipChange.ipc$dispatch("b9540d60", new Object[]{gVar}) : gVar.u;
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aebc7257", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.r = z;
        return z;
    }

    @Override // tb.jwy
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
        } else if (this.b == null) {
        } else {
            if (e() != 0 || f() != 0) {
                canvas.translate(e(), f());
            }
            try {
                this.b.draw(canvas, c(), this.o, 0);
            } catch (ArrayIndexOutOfBoundsException e) {
                com.taobao.android.weex_framework.util.g.a(e);
            }
            if (e() == 0 && f() == 0) {
                return;
            }
            canvas.translate(-e(), -f());
        }
    }

    public void a(Layout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc35b8d", new Object[]{this, layout});
            return;
        }
        this.b = layout;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b242421", new Object[]{this})).booleanValue() : this.e != null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Layout layout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ffd309b", new Object[]{this, iArr})).booleanValue();
        }
        if (this.e != null && (layout = this.b) != null) {
            int color = layout.getPaint().getColor();
            int colorForState = this.e.getColorForState(iArr, this.f);
            if (colorForState != color) {
                this.b.getPaint().setColor(colorForState);
                invalidateSelf();
            }
        }
        return super.onStateChange(iArr);
    }

    @Override // com.taobao.android.weex_uikit.ui.j
    public boolean a(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de83139", new Object[]{this, motionEvent, view})).booleanValue();
        }
        if ((c(motionEvent) || d(motionEvent)) && b(motionEvent, view)) {
            return true;
        }
        if (f(motionEvent)) {
            b(motionEvent);
        }
        return false;
    }

    private boolean b(MotionEvent motionEvent, View view) {
        com.taobao.android.weex_uikit.widget.text.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f91d758", new Object[]{this, motionEvent, view})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            d();
            b();
            return false;
        }
        if (actionMasked == 2 && !this.r && this.t != null) {
            e(motionEvent);
        }
        boolean z = !this.r;
        if (actionMasked == 1) {
            b();
        }
        Rect bounds = getBounds();
        if (!a(bounds, motionEvent)) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - bounds.left;
        int y = ((int) motionEvent.getY()) - bounds.top;
        ClickableSpan a2 = a(x, y);
        if (a2 == null) {
            float f = this.q;
            if (f > 0.0f) {
                a2 = a(x, y, f);
            }
        }
        if (a2 == null) {
            d();
            return false;
        }
        if (actionMasked == 1) {
            d();
            if (z && ((aVar = this.u) == null || !aVar.a(a2, view))) {
                a2.onClick(view);
            }
        } else if (actionMasked == 0) {
            if (a2 instanceof c) {
                a((c) a2, view);
            }
            a(a2);
        }
        return true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Handler handler = this.s;
        if (handler != null) {
            handler.removeCallbacks(this.t);
            this.t = null;
        }
        this.r = false;
    }

    private void a(c cVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d68d18d", new Object[]{this, cVar, view});
            return;
        }
        this.t = new a(cVar, view);
        this.s.postDelayed(this.t, ViewConfiguration.getLongPressTimeout());
    }

    private void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
            return;
        }
        Rect bounds = getBounds();
        if (b(((int) motionEvent.getX()) - bounds.left, ((int) motionEvent.getY()) - bounds.top) < 0) {
            return;
        }
        this.d.length();
    }

    @Override // com.taobao.android.weex_uikit.ui.j
    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue() : c(motionEvent) || d(motionEvent) || f(motionEvent);
    }

    private boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89094503", new Object[]{this, motionEvent})).booleanValue();
        }
        return (this.c && a(getBounds(), motionEvent)) || motionEvent.getActionMasked() == 3;
    }

    private boolean d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9df20d44", new Object[]{this, motionEvent})).booleanValue() : (!this.c || this.s == null || motionEvent.getAction() == 0) ? false : true;
    }

    private static boolean a(Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("295fc00a", new Object[]{rect, motionEvent})).booleanValue() : rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private void e(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dad581", new Object[]{this, motionEvent});
            return;
        }
        Rect bounds = getBounds();
        if (!a(bounds, motionEvent)) {
            b();
        } else if (a.a(this.t) == a(((int) motionEvent.getX()) - bounds.left, ((int) motionEvent.getY()) - bounds.top)) {
        } else {
            b();
        }
    }

    private boolean f(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7c39dc6", new Object[]{this, motionEvent})).booleanValue() : this.p != null && motionEvent.getActionMasked() == 0 && getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public void a(CharSequence charSequence, Layout layout, ColorStateList colorStateList, int i, int i2, ClickableSpan[] clickableSpanArr, ImageSpan[] imageSpanArr, com.taobao.android.weex_uikit.widget.text.a aVar, b bVar, int i3, int i4, float f, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf81120", new Object[]{this, charSequence, layout, colorStateList, new Integer(i), new Integer(i2), clickableSpanArr, imageSpanArr, aVar, bVar, new Integer(i3), new Integer(i4), new Float(f), str});
            return;
        }
        this.b = layout;
        this.d = charSequence;
        this.h = clickableSpanArr;
        this.u = aVar;
        this.p = bVar;
        this.c = clickableSpanArr != null && clickableSpanArr.length > 0;
        this.g = i2;
        this.q = f;
        if (i != 0) {
            this.e = null;
            this.f = i;
            Layout layout2 = this.b;
            if (layout2 != null) {
                layout2.getPaint().setColor(i);
            }
        } else {
            this.e = colorStateList != null ? colorStateList : f.c;
            this.f = this.e.getDefaultColor();
            Layout layout3 = this.b;
            if (layout3 != null) {
                layout3.getPaint().setColor(this.e.getColorForState(getState(), this.f));
            }
        }
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                Drawable drawable = imageSpan.getDrawable();
                drawable.setCallback(this);
                drawable.setVisible(true, false);
            }
        }
        this.i = imageSpanArr;
        this.v = str;
        invalidateSelf();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        this.d = null;
        this.h = null;
        this.c = false;
        this.g = 0;
        this.u = null;
        this.p = null;
        this.e = null;
        this.f = 0;
        ImageSpan[] imageSpanArr = this.i;
        if (imageSpanArr == null) {
            return;
        }
        int length = imageSpanArr.length;
        for (int i = 0; i < length; i++) {
            Drawable drawable = this.i[i].getDrawable();
            drawable.setCallback(null);
            drawable.setVisible(false, false);
        }
        this.i = null;
    }

    @Override // tb.jwy, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        Layout layout = this.b;
        if (layout == null || layout.getPaint() == null) {
            return;
        }
        this.b.getPaint().setAlpha(i);
    }

    private ClickableSpan a(int i, int i2) {
        ClickableSpan[] clickableSpanArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClickableSpan) ipChange.ipc$dispatch("5d2e15b1", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int b2 = b(i, i2);
        if (b2 < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) this.d).getSpans(b2, b2, ClickableSpan.class)) == null || clickableSpanArr.length <= 0) {
            return null;
        }
        return clickableSpanArr[0];
    }

    private int b(int i, int i2) {
        float width;
        float f;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f78dfc", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int lineForVertical = this.b.getLineForVertical(i2);
        if (this.b.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            width = this.b.getLineLeft(lineForVertical);
            f = this.b.getLineRight(lineForVertical);
        } else {
            if (this.b.getParagraphDirection(lineForVertical) != -1) {
                z = false;
            }
            width = z ? this.b.getWidth() - this.b.getLineMax(lineForVertical) : this.b.getParagraphLeft(lineForVertical);
            f = z ? this.b.getParagraphRight(lineForVertical) : this.b.getLineMax(lineForVertical);
        }
        float f2 = i;
        if (f2 >= width && f2 <= f) {
            try {
                return this.b.getOffsetForHorizontal(lineForVertical, f2);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    private ClickableSpan a(float f, float f2, float f3) {
        ClickableSpan[] clickableSpanArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClickableSpan) ipChange.ipc$dispatch("64dad021", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
        Region region = new Region();
        Region region2 = new Region();
        if (this.m == null) {
            this.m = new Path();
        }
        region2.set(0, 0, com.taobao.android.weex_uikit.widget.text.b.a(this.b), com.taobao.android.weex_uikit.widget.text.b.b(this.b));
        this.m.reset();
        this.m.addCircle(f, f2, f3, Path.Direction.CW);
        region.setPath(this.m, region2);
        ClickableSpan clickableSpan = null;
        for (ClickableSpan clickableSpan2 : this.h) {
            if (a(clickableSpan2, (Spanned) this.d, this.b, region, region2)) {
                if (clickableSpan != null) {
                    return null;
                }
                clickableSpan = clickableSpan2;
            }
        }
        return clickableSpan;
    }

    private Path c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("61bcdf12", new Object[]{this});
        }
        if (this.j == this.k || Color.alpha(this.g) == 0) {
            return null;
        }
        if (this.n) {
            if (this.l == null) {
                this.l = new Path();
            }
            this.b.getSelectionPath(this.j, this.k, this.l);
            this.n = false;
        }
        return this.l;
    }

    private void a(ClickableSpan clickableSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be9cacb", new Object[]{this, clickableSpan});
            return;
        }
        Spanned spanned = (Spanned) this.d;
        c(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    private void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Color.alpha(this.g) == 0) {
        } else {
            if (i == i && i2 == i2) {
                return;
            }
            this.j = i;
            this.k = i2;
            Paint paint = this.o;
            if (paint == null) {
                this.o = new Paint();
                this.o.setColor(this.g);
            } else {
                paint.setColor(this.g);
            }
            this.n = true;
            invalidateSelf();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            c(0, 0);
        }
    }

    private boolean a(ClickableSpan clickableSpan, Spanned spanned, Layout layout, Region region, Region region2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de818400", new Object[]{this, clickableSpan, spanned, layout, region, region2})).booleanValue();
        }
        Region region3 = new Region();
        Path path = new Path();
        layout.getSelectionPath(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan), path);
        region3.setPath(path, region2);
        return region3.op(region, Region.Op.INTERSECT);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
        } else {
            scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
        } else {
            unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private c b;
        private View c;

        static {
            kge.a(1344683775);
            kge.a(-1390502639);
        }

        public static /* synthetic */ c a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c4625901", new Object[]{aVar}) : aVar.b;
        }

        public a(c cVar, View view) {
            this.b = cVar;
            this.c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            g gVar = g.this;
            if ((g.a(gVar) != null && g.a(g.this).a(this.b, this.c)) || this.b.a(this.c)) {
                z = true;
            }
            g.a(gVar, z);
        }
    }
}
