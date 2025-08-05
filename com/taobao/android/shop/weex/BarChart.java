package com.taobao.android.shop.weex;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class BarChart extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int COLUMNS_PER_SECTION;
    private static int SECTION_COUNT;
    public static int mTitleMaxLength;
    public Integer[] colors;
    public Integer[] colorsAvg;
    private int mColumnHeight;
    private int mColumnHeightAvgHalf;
    private int mColumnPadding;
    private int mDividerHeight;
    private Paint[] mPaints;
    private Paint[] mPaintsAvgRect;
    private int mSectionPadding;
    private b[] mSections;
    private final Rect mTextBounds;
    private int mTextPadding;
    private TextPaint mTextPaint;
    private int mTextSize;

    public static /* synthetic */ Object ipc$super(BarChart barChart, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue() : COLUMNS_PER_SECTION;
    }

    static {
        kge.a(-373774669);
        SECTION_COUNT = 5;
        COLUMNS_PER_SECTION = 5;
        mTitleMaxLength = 0;
    }

    public BarChart(Context context) {
        super(context);
        this.mTextBounds = new Rect();
        this.colors = new Integer[]{-856304751, -861280002, -857106788, -856784146, -860057713, -861012177, -858606452};
        this.colorsAvg = new Integer[]{-1426730095, -1431705346, -1427532132, -1427209490, -1430483057, -1431437521, -1429031796};
        init(context);
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTextBounds = new Rect();
        this.colors = new Integer[]{-856304751, -861280002, -857106788, -856784146, -860057713, -861012177, -858606452};
        this.colorsAvg = new Integer[]{-1426730095, -1431705346, -1427532132, -1427209490, -1430483057, -1431437521, -1429031796};
        init(context);
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTextBounds = new Rect();
        this.colors = new Integer[]{-856304751, -861280002, -857106788, -856784146, -860057713, -861012177, -858606452};
        this.colorsAvg = new Integer[]{-1426730095, -1431705346, -1427532132, -1427209490, -1430483057, -1431437521, -1429031796};
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
        this.mColumnHeightAvgHalf = this.mColumnHeight / 6;
        int i = (int) (2.0f * f);
        this.mColumnPadding = i;
        this.mSectionPadding = (int) (24.0f * f);
        this.mDividerHeight = i;
        this.mTextPadding = (int) (4.0f * f);
        this.mTextSize = ((int) f) * 15;
    }

    public void setSectionsAndColumnTitles(List<String> list, List<String> list2) {
        b[] bVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208dd21", new Object[]{this, list, list2});
            return;
        }
        COLUMNS_PER_SECTION = list2.size();
        SECTION_COUNT = list.size();
        this.mSections = new b[SECTION_COUNT];
        for (int i = 0; i < SECTION_COUNT; i++) {
            this.mSections[i] = new b();
            this.mSections[i].f15126a = list.get(i);
        }
        int length = this.colors.length;
        int i2 = COLUMNS_PER_SECTION;
        this.mPaints = new Paint[i2];
        this.mPaintsAvgRect = new Paint[i2];
        for (b bVar : this.mSections) {
            for (int i3 = 0; i3 < COLUMNS_PER_SECTION; i3++) {
                b.a(bVar)[i3].f15125a = list2.get(i3);
                if (mTitleMaxLength < list2.get(i3).length()) {
                    mTitleMaxLength = list2.get(i3).length();
                }
                this.mPaints[i3] = new Paint();
                int i4 = i3 % length;
                this.mPaints[i3].setColor(this.colors[i4].intValue());
                this.mPaintsAvgRect[i3] = new Paint();
                this.mPaintsAvgRect[i3].setColor(this.colorsAvg[i4].intValue());
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
            bVar.f15126a = "";
            for (a aVar : b.a(bVar)) {
                aVar.c = Float.valueOf(0.0f);
            }
        }
        invalidate();
    }

    public void addTiming(int i, int i2, Pair<? extends Number, ? extends Number> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb1dc68", new Object[]{this, new Integer(i), new Integer(i2), pair});
        } else {
            b.a(this.mSections[i])[i2].a(Float.valueOf(((Number) pair.first).floatValue()), Float.valueOf(((Number) pair.second).floatValue()));
        }
    }

    public void addTiming(int i, int i2, Pair<? extends Number, ? extends Number> pair, Pair<? extends Number, ? extends Number> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e76b72", new Object[]{this, new Integer(i), new Integer(i2), pair, pair2});
        } else {
            b.a(this.mSections[i])[i2].a(Float.valueOf(((Number) pair.first).floatValue()), Float.valueOf(((Number) pair.second).floatValue()), Float.valueOf(((Number) pair2.first).floatValue()), Float.valueOf(((Number) pair2.second).floatValue()));
        }
    }

    public void addTiming(int i, int i2, Number number, Number number2, Number number3, Number number4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea27c7a", new Object[]{this, new Integer(i), new Integer(i2), number, number2, number3, number4});
        } else {
            b.a(this.mSections[i])[i2].a(Float.valueOf(number.floatValue()), Float.valueOf(number2.floatValue()), Float.valueOf(number3.floatValue()), Float.valueOf(number4.floatValue()));
        }
    }

    public void addTiming(int i, int i2, Number number, Number number2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530028d6", new Object[]{this, new Integer(i), new Integer(i2), number, number2});
        } else {
            b.a(this.mSections[i])[i2].a(Float.valueOf(number.floatValue()), Float.valueOf(number2.floatValue()));
        }
    }

    public void addTiming(int i, int i2, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84b3ae7", new Object[]{this, new Integer(i), new Integer(i2), f});
            return;
        }
        b.a(this.mSections[i])[i2].a(Float.valueOf(0.0f), f);
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
        int floatValue;
        a[] a2;
        Canvas canvas2 = canvas;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas2});
            return;
        }
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int i2 = this.mSectionPadding;
        int i3 = SECTION_COUNT;
        int i4 = measuredHeight - (i2 * i3);
        int i5 = COLUMNS_PER_SECTION;
        int i6 = (i4 - (((i3 * i5) - 1) * this.mColumnPadding)) / (i5 * i3);
        float[] fArr = new float[i3];
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i7 = 0; i7 < SECTION_COUNT; i7++) {
            float f3 = 0.0f;
            for (a aVar : b.a(this.mSections[i7])) {
                f3 = Math.max(Math.max(f3, aVar.b.floatValue() + aVar.c.floatValue()), aVar.d.floatValue() + aVar.e.floatValue());
            }
            fArr[i7] = f3;
            f2 = Math.max(f2, f3);
        }
        int i8 = this.mSectionPadding;
        int i9 = 0;
        while (i9 < SECTION_COUNT) {
            b bVar = this.mSections[i9];
            this.mTextPaint.setTextSize(this.mTextSize);
            canvas2.drawText(bVar.f15126a, this.mTextPadding, i8 - this.mTextPaint.descent(), this.mTextPaint);
            if (f2 > f) {
                int i10 = i8;
                int i11 = 0;
                while (i11 < COLUMNS_PER_SECTION) {
                    a aVar2 = b.a(bVar)[i11];
                    String a3 = (aVar2.c.floatValue() / f2 <= 0.15f || aVar2.c.floatValue() == f2) ? aVar2.a() : aVar2.b();
                    if (!TextUtils.isEmpty(a3)) {
                        this.mTextPaint.getTextBounds(a3, i, a3.length(), this.mTextBounds);
                        canvas2.drawText(a3, this.mTextPadding, ((i6 / 2) + i10) - this.mTextBounds.exactCenterY(), this.mTextPaint);
                    }
                    float f4 = measuredWidth;
                    int max = Math.max(1, (int) ((aVar2.c.floatValue() * f4) / f2));
                    int i12 = i10;
                    canvas.drawRect((int) ((aVar2.b.floatValue() * f4) / f2), i10, floatValue + max, i10 + i6, this.mPaints[i11]);
                    f = 0.0f;
                    if (aVar2.e.floatValue() > 0.0f) {
                        int max2 = Math.max(1, (int) ((f4 * aVar2.e.floatValue()) / f2));
                        int floatValue2 = (int) ((f4 * aVar2.d.floatValue()) / f2);
                        int i13 = i12 + (i6 / 2);
                        int i14 = this.mColumnHeightAvgHalf;
                        canvas.drawRect(floatValue2, i13 - i14, floatValue2 + max2, i13 + i14, this.mPaintsAvgRect[i11]);
                    }
                    i10 = i12 + this.mColumnPadding + i6;
                    i11++;
                    canvas2 = canvas;
                    i = 0;
                }
                i8 = i10 + this.mSectionPadding;
            }
            i9++;
            canvas2 = canvas;
            i = 0;
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f15126a = "";
        private final a[] b = new a[BarChart.access$100()];

        static {
            kge.a(836676052);
        }

        public static /* synthetic */ a[] a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a[]) ipChange.ipc$dispatch("33bf1f6a", new Object[]{bVar}) : bVar.b;
        }

        public b() {
            for (int i = 0; i < BarChart.access$100(); i++) {
                this.b[i] = new a();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f15125a;
        public Float b;
        public Float c;
        public Float d;
        public Float e;

        static {
            kge.a(-975761785);
        }

        public a() {
            Float valueOf = Float.valueOf(0.0f);
            this.b = valueOf;
            this.d = valueOf;
            this.e = valueOf;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e.floatValue() == 0.0f ? String.format("%s cost: %.0f", this.f15125a, this.c) : String.format("%s cost: %.0f, avg: %.0f", this.f15125a, this.c, this.e);
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
            }
            if (this.e.floatValue() != 0.0f) {
                return String.format("%s cost: %.0f, avg: %.0f", this.f15125a, this.c, this.e);
            }
            Float f = this.c;
            return String.format("%s cost: %.0f (%.0f - %.0f)", this.f15125a, f, this.b, Float.valueOf(f.floatValue() + this.b.floatValue()));
        }

        public void a(Float f, Float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f09e5f88", new Object[]{this, f, f2});
                return;
            }
            this.b = Float.valueOf(Math.max(0.0f, f.floatValue()));
            this.c = f2;
        }

        public void a(Float f, Float f2, Float f3, Float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68ab8aa8", new Object[]{this, f, f2, f3, f4});
                return;
            }
            this.b = Float.valueOf(Math.max(0.0f, f.floatValue()));
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }
    }
}
