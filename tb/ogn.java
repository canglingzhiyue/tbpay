package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;

/* loaded from: classes8.dex */
public class ogn extends ImageSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f32038a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private a m;
    private String n;

    /* loaded from: classes8.dex */
    public interface a {
        int getLineCount();

        int getLineSpacing();
    }

    public static /* synthetic */ Object ipc$super(ogn ognVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -441663370) {
            super.draw((Canvas) objArr[0], (CharSequence) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).floatValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), (Paint) objArr[8]);
            return null;
        } else if (hashCode != 1176909976) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.getSize((Paint) objArr[0], (CharSequence) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), (Paint.FontMetricsInt) objArr[4]));
        }
    }

    static {
        kge.a(-703348940);
        f32038a = null;
    }

    public ogn(a aVar, Drawable drawable, int i) {
        super(drawable, i);
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.m = aVar;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i6), paint});
            return;
        }
        canvas.save();
        canvas.translate(this.g, 0.0f);
        int a2 = a(paint, charSequence, i, i2);
        int width = getDrawable().getBounds().width();
        int height = getDrawable().getBounds().height();
        a aVar = this.m;
        int lineSpacing = (aVar == null || aVar.getLineCount() <= 1) ? 0 : this.m.getLineSpacing();
        if (this instanceof RichTextContainerComponent.a) {
            i6 += lineSpacing;
        } else if (!(this instanceof RichTextContainerComponent.b)) {
            i6 -= lineSpacing;
        }
        a aVar2 = this.m;
        if (aVar2 != null && i6 > ((height + aVar2.getLineSpacing()) * this.m.getLineCount()) - this.m.getLineSpacing()) {
            i6 -= this.m.getLineSpacing();
        }
        int i7 = i6;
        int i8 = i7 - (((i7 - i3) - height) / 2);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i8, paint);
        int i9 = this.b;
        if (i9 != 0) {
            paint.setColor(i9);
        }
        if (this.l) {
            paint.setTypeface(Typeface.DEFAULT_BOLD);
        }
        int a3 = a(i4, i3, i8, i7, height, paint);
        String str = this.n;
        if (str != null) {
            if ("line-through".equals(str)) {
                paint.setStrikeThruText(true);
            } else if ("underline".equals(this.n)) {
                paint.setUnderlineText(true);
            }
        } else {
            paint.setStrikeThruText(false);
            paint.setUnderlineText(false);
        }
        a(canvas, charSequence, i, i2, (int) (((width - a2) / 2) + f), a3, paint);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        int i3 = this.j;
        if (i3 == 0) {
            i3 = a(paint, charSequence, i, i2) + this.e + this.f + (this.i * 2);
        }
        int i4 = this.k;
        if (i4 == 0) {
            i4 = a(paint) + this.c + this.d + (this.i * 2);
        }
        getDrawable().setBounds(0, 0, i3, i4);
        if (f32038a == null) {
            if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().u() != null) {
                f32038a = Boolean.valueOf(com.taobao.tao.flexbox.layoutmanager.adapter.a.a().u().a("updateFontMetrics", "true").equals("true"));
            } else {
                f32038a = true;
            }
        }
        if (f32038a.booleanValue()) {
            return i3 + this.g + this.h;
        }
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.g + this.h;
    }

    public int a(Paint paint, CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e401634", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2)})).intValue() : Math.round(paint.measureText(charSequence, i, i2));
    }

    public int a(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b8e3c70", new Object[]{this, paint})).intValue();
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) Math.ceil(fontMetrics.bottom - fontMetrics.top);
    }

    public String a(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("233233b4", new Object[]{this, charSequence, new Integer(i), new Integer(i2)}) : charSequence.toString().substring(i, i2);
    }

    public void a(Canvas canvas, CharSequence charSequence, int i, int i2, int i3, int i4, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988534f6", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), paint});
        } else {
            canvas.drawText(a(charSequence, i, i2), i3, i4, paint);
        }
    }

    public int a(int i, int i2, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a84dde3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), paint})).intValue();
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (oeb.aZ()) {
            return i + (((int) (i5 - (fontMetrics.bottom - fontMetrics.top))) / 2);
        }
        return (int) Math.ceil((i3 - (((i5 - fontMetrics.descent) + fontMetrics.ascent) / 2.0f)) - fontMetrics.descent);
    }
}
