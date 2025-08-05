package com.taobao.android.detail.core.perf.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class BarChart extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int COLUMNS_PER_SECTION;
    private static int SECTION_COUNT;
    public Integer[] colors;
    private int mColumnHeight;
    private int mColumnPadding;
    private int mDividerHeight;
    private Paint[] mPaints;
    private int mSectionPadding;
    private b[] mSections;
    private final Rect mTextBounds;
    private int mTextPadding;
    private TextPaint mTextPaint;

    public static /* synthetic */ Object ipc$super(BarChart barChart, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue() : COLUMNS_PER_SECTION;
    }

    static {
        kge.a(458605301);
        SECTION_COUNT = 5;
        COLUMNS_PER_SECTION = 5;
    }

    public BarChart(Context context) {
        super(context);
        this.mTextBounds = new Rect();
        this.colors = new Integer[]{-666735, -5641986, -1468772, -1146130, -4419697, -5374161, -2968436};
        init(context);
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTextBounds = new Rect();
        this.colors = new Integer[]{-666735, -5641986, -1468772, -1146130, -4419697, -5374161, -2968436};
        init(context);
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTextBounds = new Rect();
        this.colors = new Integer[]{-666735, -5641986, -1468772, -1146130, -4419697, -5374161, -2968436};
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        float f = context.getResources().getDisplayMetrics().density;
        this.mTextPaint = new TextPaint();
        this.mTextPaint.setColor(-872415232);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setTextSize(15.0f * f);
        this.mColumnHeight = (int) (20.0f * f);
        int i = (int) (2.0f * f);
        this.mColumnPadding = i;
        this.mSectionPadding = (int) (24.0f * f);
        this.mDividerHeight = i;
        this.mTextPadding = (int) (f * 4.0f);
        emu.a("com.taobao.android.detail.core.perf.widget.BarChart");
    }

    public void setSectionsAndColumnTItles(List<String> list, List<String> list2) {
        b[] bVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e037d01", new Object[]{this, list, list2});
            return;
        }
        COLUMNS_PER_SECTION = list2.size();
        SECTION_COUNT = list.size();
        this.mSections = new b[SECTION_COUNT];
        for (int i = 0; i < SECTION_COUNT; i++) {
            this.mSections[i] = new b();
            this.mSections[i].f9783a = list.get(i);
        }
        int length = this.colors.length;
        this.mPaints = new Paint[COLUMNS_PER_SECTION];
        for (b bVar : this.mSections) {
            for (int i2 = 0; i2 < COLUMNS_PER_SECTION; i2++) {
                b.a(bVar)[i2].f9782a = list2.get(i2);
                this.mPaints[i2] = new Paint();
                if (i2 < length) {
                    this.mPaints[i2].setColor(this.colors[i2].intValue());
                } else {
                    this.mPaints[i2].setColor(this.colors[i2 % length].intValue());
                }
            }
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        b[] bVarArr = this.mSections;
        if (bVarArr == null) {
            return;
        }
        for (b bVar : bVarArr) {
            bVar.f9783a = "";
            for (a aVar : b.a(bVar)) {
                a.a(aVar).clear();
            }
        }
        invalidate();
    }

    public void addTiming(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19bfface", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            return;
        }
        b.a(this.mSections[i])[i2].a(f);
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = SECTION_COUNT;
        setMeasuredDimension(size, (this.mSectionPadding * i3) + (i3 * COLUMNS_PER_SECTION * (this.mColumnPadding + this.mColumnHeight)));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int i = this.mSectionPadding;
        int i2 = SECTION_COUNT;
        int i3 = measuredHeight - (i * i2);
        int i4 = COLUMNS_PER_SECTION;
        int i5 = i3 - (((i2 * i4) - 1) * this.mColumnPadding);
        if (i2 * i4 == 0) {
            return;
        }
        int i6 = i5 / (i4 * i2);
        float[] fArr = new float[i2];
        int i7 = 0;
        while (true) {
            float f3 = 0.0f;
            if (i7 >= SECTION_COUNT) {
                break;
            }
            for (a aVar : b.a(this.mSections[i7])) {
                f3 = Math.max(f3, aVar.b());
            }
            fArr[i7] = f3;
            i7++;
        }
        int i8 = this.mSectionPadding;
        for (int i9 = 0; i9 < SECTION_COUNT; i9++) {
            b bVar = this.mSections[i9];
            float f4 = i8;
            canvas.drawLine(0.0f, i8 - this.mDividerHeight, measuredWidth, f4, this.mTextPaint);
            canvas.drawText(bVar.f9783a, this.mTextPadding, f4 - this.mTextPaint.descent(), this.mTextPaint);
            if (fArr[i9] > 0.0f) {
                int i10 = i8;
                for (int i11 = 0; i11 < COLUMNS_PER_SECTION; i11++) {
                    a aVar2 = b.a(bVar)[i11];
                    int i12 = i10;
                    canvas.drawRect(0.0f, i10, (int) ((aVar2.b() * f) / f2), i10 + i6, this.mPaints[i11]);
                    String a2 = aVar2.a();
                    if (!TextUtils.isEmpty(a2)) {
                        this.mTextPaint.getTextBounds(a2, 0, a2.length(), this.mTextBounds);
                        canvas.drawText(a2, this.mTextPadding, (i12 + (i6 / 2)) - this.mTextBounds.exactCenterY(), this.mTextPaint);
                    }
                    i10 = i12 + this.mColumnPadding + i6;
                }
                i8 = i10 + this.mSectionPadding;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9783a = "";
        private final a[] b = new a[BarChart.access$200()];

        static {
            kge.a(742679574);
        }

        public static /* synthetic */ a[] a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a[]) ipChange.ipc$dispatch("252a18aa", new Object[]{bVar}) : bVar.b;
        }

        public b() {
            for (int i = 0; i < BarChart.access$200(); i++) {
                this.b[i] = new a();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9782a;
        private List<Float> b = new ArrayList();

        static {
            kge.a(1653605381);
        }

        public static /* synthetic */ List a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f543ad80", new Object[]{aVar}) : aVar.b;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b.size() > 0 ? String.format("%s (cost: %.0fms)", this.f9782a, Float.valueOf(this.b.get(0).floatValue())) : this.f9782a;
        }

        public float b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue();
            }
            if (this.b.size() <= 0) {
                return 0.0f;
            }
            List<Float> list = this.b;
            return list.get(list.size() / 2).floatValue();
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                return;
            }
            this.b.add(Float.valueOf(f));
            Collections.sort(this.b);
        }
    }
}
