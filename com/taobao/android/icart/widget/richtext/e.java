package com.taobao.android.icart.widget.richtext;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Layout f12901a;
    private TextPaint b;
    private CharSequence c;
    private Context d;
    private int g;
    private int h;
    private float k;
    private final CharSequence f = "";
    private int i = -7829368;
    private Layout.Alignment j = Layout.Alignment.ALIGN_NORMAL;
    private final List<d> e = new ArrayList();

    static {
        kge.a(1909465171);
    }

    public e(Context context) {
        this.d = context;
        this.h = gbg.b(this.d, 13.0f);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b1abc7", new Object[]{this, dVar});
        } else {
            this.e.add(dVar);
        }
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        canvas.save();
        int i = this.g;
        canvas.translate(i, i);
        Layout layout = this.f12901a;
        if (layout != null) {
            layout.draw(canvas);
        }
        canvas.restore();
    }

    public a a(int i, int i2) {
        int size;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("473864af", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        a();
        CharSequence charSequence = this.c;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            size = View.MeasureSpec.getSize(i);
        } else {
            size = View.MeasureSpec.getSize(i);
            if (charSequence != null) {
                size = Math.min(((int) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.b))) + (this.g << 1), size);
            }
        }
        if (size != 0 && !TextUtils.isEmpty(charSequence)) {
            int max = size - (Math.max(this.g, 0) << 1);
            Layout layout = this.f12901a;
            if (layout != null) {
                if (layout.getWidth() < max) {
                    this.f12901a.increaseWidthTo(size);
                }
            } else {
                this.f12901a = a(max, charSequence);
            }
        }
        if (this.f12901a != null && charSequence != null) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                i3 = size2;
            } else if (!TextUtils.isEmpty(charSequence)) {
                i3 = Math.min(this.f12901a.getHeight() + (this.g << 1), size2);
            }
            return new a(size, i3);
        }
        return new a(size, 0);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.e != null) {
            CharSequence a2 = a(true);
            if (!a2.equals(this.c)) {
                this.c = a2;
            }
        }
        if (this.c == null) {
            return;
        }
        if (this.b == null) {
            this.b = new TextPaint();
        }
        this.b.setAntiAlias(true);
        int i = this.h;
        if (i >= 0) {
            this.b.setTextSize(i);
        }
        this.b.setColor(this.i);
    }

    public <T> T[] a(int i, int i2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("c55d5096", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        if (this.e == null) {
            return null;
        }
        CharSequence a2 = a(false);
        if (a2 instanceof Spannable) {
            return (T[]) ((Spannable) a2).getSpans(i, i2, cls);
        }
        return null;
    }

    public int a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0fea5b", new Object[]{this, new Float(f), new Float(f2)})).intValue();
        }
        Layout layout = this.f12901a;
        if (layout == null) {
            return -1;
        }
        int lineForVertical = layout.getLineForVertical((int) f2);
        int offsetForHorizontal = this.f12901a.getOffsetForHorizontal(lineForVertical, f);
        int i = this.f12901a.getPrimaryHorizontal(offsetForHorizontal) < f ? offsetForHorizontal + 1 : offsetForHorizontal - 1;
        int lineStart = this.f12901a.getLineStart(lineForVertical);
        return i < lineStart ? lineStart : i;
    }

    public Layout a(int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Layout) ipChange.ipc$dispatch("e22d99a4", new Object[]{this, new Integer(i), charSequence}) : new StaticLayout(charSequence, this.b, Math.max(i, 0), this.j, 1.0f, this.k, true);
    }

    public CharSequence a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("88e23ace", new Object[]{this, new Boolean(z)});
        }
        if (this.e.size() == 0) {
            return this.f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (d dVar : this.e) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) dVar.a());
            for (Object obj : dVar.a(z)) {
                spannableStringBuilder.setSpan(obj, length, dVar.a().length() + length, 33);
            }
        }
        return spannableStringBuilder;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        if (this.g >= 0) {
            return;
        }
        this.g = 0;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.k;
    }

    public Layout c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Layout) ipChange.ipc$dispatch("2cde5a4f", new Object[]{this}) : this.f12901a;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.k = f;
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12902a;
        public int b;

        static {
            kge.a(-1130006422);
        }

        public a(int i, int i2) {
            this.f12902a = i;
            this.b = i2;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f12902a;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }
    }
}
