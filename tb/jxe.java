package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.d;

/* loaded from: classes6.dex */
public class jxe extends ImageSpan implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f29844a;
    private int b;
    private int c;
    private int d;
    private Object e;
    private String f;

    static {
        kge.a(-1779772293);
        kge.a(-983160102);
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public jxe(int i, int i2, int i3, int i4, String str) {
        super(new jxb(i, i2, i3, i4), 1);
        this.f29844a = i;
        this.b = i2;
        this.f = str;
        this.c = i3;
        this.d = i4;
        getDrawable().setBounds(0, 0, i + i3 + i4, i2);
    }

    public Drawable e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("7af0e7ce", new Object[]{this}) : ((jxb) getDrawable()).a();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.b;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.f29844a + this.c + this.d;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        Drawable drawable = getDrawable();
        int height = (i3 + ((i5 - i3) / 2)) - (drawable.getBounds().height() / 2);
        canvas.translate(f, height);
        drawable.draw(canvas);
        canvas.translate(-f, -height);
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
        } else {
            ((jxb) getDrawable()).a(drawable);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.e = obj;
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f29844a;
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b;
    }
}
