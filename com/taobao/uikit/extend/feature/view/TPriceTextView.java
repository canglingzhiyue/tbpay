package com.taobao.uikit.extend.feature.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TTextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes9.dex */
public class TPriceTextView extends TTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DECIMAL_TEXT_FONT_RATIO = 0.75f;
    private static final int TEXT_COLOR = -45056;
    private float mDecimalNumRatio;
    private float mDollarRatio;
    private float mPrice;

    static {
        kge.a(1207572771);
    }

    public static /* synthetic */ Object ipc$super(TPriceTextView tPriceTextView, String str, Object... objArr) {
        if (str.hashCode() == -260017868) {
            super.setTextSize(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TPriceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDollarRatio = 0.75f;
        this.mDecimalNumRatio = 0.75f;
        this.mPrice = 0.0f;
        init(attributeSet, i);
    }

    public TPriceTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDollarRatio = 0.75f;
        this.mDecimalNumRatio = 0.75f;
        this.mPrice = 0.0f;
        init(attributeSet, 0);
    }

    public TPriceTextView(Context context) {
        super(context);
        this.mDollarRatio = 0.75f;
        this.mDecimalNumRatio = 0.75f;
        this.mPrice = 0.0f;
        init(null, 0);
    }

    private void init(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a9cdcc", new Object[]{this, attributeSet, new Integer(i)});
        } else if (attributeSet == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.TPriceTextView)) == null) {
        } else {
            this.mPrice = obtainStyledAttributes.getFloat(R.styleable.TPriceTextView_uik_price, this.mPrice);
            this.mDollarRatio = obtainStyledAttributes.getFloat(R.styleable.TPriceTextView_uik_dollar_ratio, this.mDollarRatio);
            this.mDecimalNumRatio = obtainStyledAttributes.getFloat(R.styleable.TPriceTextView_uik_decimal_ratio, this.mDecimalNumRatio);
            setTextColor(obtainStyledAttributes.getColor(R.styleable.TPriceTextView_android_textColor, -45056));
            setDollarRatio(this.mDollarRatio);
            setDecimalNumRatio(this.mDecimalNumRatio);
            setPrice(this.mPrice);
            obtainStyledAttributes.recycle();
        }
    }

    public void setPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc05d58", new Object[]{this, str});
            return;
        }
        Pattern compile = Pattern.compile("^[0-9]+[.]*[0-9]*");
        Pattern compile2 = Pattern.compile("(^([0-9]|[/?])+[.]*([0-9]|[/?])*)");
        Matcher matcher = compile.matcher(str);
        Matcher matcher2 = compile2.matcher(str);
        if (matcher.matches()) {
            setPrice(Float.valueOf(str).floatValue());
        } else if (matcher2.matches()) {
            setFestivalPrice(str);
        } else {
            setText(str);
        }
    }

    private void setFestivalPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480442c0", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int indexOf = str.indexOf(".");
        if (indexOf >= 9) {
            int i = indexOf - 8;
            sb2.insert(0, str.substring(0, i));
            sb2.append(".");
            sb2.append(str.substring(i, indexOf - 7));
            sb.insert(0, b.a(R.string.taobao_app_1012_1_13386));
        } else if (indexOf >= 5) {
            int i2 = indexOf - 4;
            sb2.insert(0, str.substring(0, i2));
            sb2.append(".");
            sb2.append(str.substring(i2, indexOf - 3));
            sb.insert(0, b.a(R.string.taobao_app_1012_1_13391));
        } else if (indexOf == -1) {
            sb2.insert(0, str);
        } else if (str.length() - indexOf >= 3) {
            sb2.insert(0, str.substring(0, indexOf + 3));
        } else {
            sb2.insert(0, str.length());
        }
        String sb3 = sb2.toString();
        if (sb3.endsWith(".00")) {
            sb3 = sb3.substring(0, sb2.length() - 3);
        } else if (sb3.endsWith(".0")) {
            sb3 = sb3.substring(0, sb3.length() - 2);
        }
        sb.insert(0, sb3);
        sb.insert(0, "¥ ");
        setText(sb.toString());
        if (1.0f == this.mDollarRatio) {
            return;
        }
        SpannableString spannableString = new SpannableString(getText());
        if (spannableString.length() > 2) {
            spannableString.setSpan(new RelativeSizeSpan(this.mDollarRatio), 0, 2, 33);
        }
        setText(spannableString);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPrice(float r10) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.uikit.extend.feature.view.TPriceTextView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r9
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r10)
            r1[r2] = r3
            java.lang.String r10 = "c2592e72"
            r0.ipc$dispatch(r10, r1)
            return
        L1a:
            r9.mPrice = r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#0.0"
            r5 = 1287568416(0x4cbebc20, float:1.0E8)
            int r6 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r6 < 0) goto L35
            float r10 = r10 / r5
            int r5 = com.taobao.taobao.R.string.taobao_app_1012_1_13386
            java.lang.String r5 = com.alibaba.ability.localization.b.a(r5)
            r0.insert(r4, r5)
            goto L49
        L35:
            r5 = 1176256512(0x461c4000, float:10000.0)
            int r6 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r6 < 0) goto L47
            float r10 = r10 / r5
            int r5 = com.taobao.taobao.R.string.taobao_app_1012_1_13391
            java.lang.String r5 = com.alibaba.ability.localization.b.a(r5)
            r0.insert(r4, r5)
            goto L49
        L47:
            java.lang.String r1 = "#0.00"
        L49:
            java.text.DecimalFormatSymbols r5 = new java.text.DecimalFormatSymbols
            r5.<init>()
            r6 = 46
            r5.setDecimalSeparator(r6)
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            r6.<init>(r1, r5)
            double r7 = (double) r10
            java.lang.String r10 = r6.format(r7)
            java.lang.String r1 = ".00"
            boolean r1 = r10.endsWith(r1)
            if (r1 == 0) goto L71
            int r1 = r10.length()
            int r1 = r1 + (-3)
            java.lang.String r10 = r10.substring(r4, r1)
        L6f:
            r2 = 0
            goto L83
        L71:
            java.lang.String r1 = ".0"
            boolean r1 = r10.endsWith(r1)
            if (r1 == 0) goto L83
            int r1 = r10.length()
            int r1 = r1 - r3
            java.lang.String r10 = r10.substring(r4, r1)
            goto L6f
        L83:
            r0.insert(r4, r10)
            java.lang.String r10 = "¥ "
            r0.insert(r4, r10)
            if (r2 == 0) goto L96
            java.lang.String r10 = r0.toString()
            r9.fixSpan(r10)
            goto L9d
        L96:
            java.lang.String r10 = r0.toString()
            r9.setText(r10)
        L9d:
            r10 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.mDollarRatio
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto Lc3
            android.text.SpannableString r10 = new android.text.SpannableString
            java.lang.CharSequence r0 = r9.getText()
            r10.<init>(r0)
            int r0 = r10.length()
            if (r0 <= r3) goto Lc0
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r9.mDollarRatio
            r0.<init>(r1)
            r1 = 33
            r10.setSpan(r0, r4, r3, r1)
        Lc0:
            r9.setText(r10)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.feature.view.TPriceTextView.setPrice(float):void");
    }

    private void fixSpan(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bceac650", new Object[]{this, str});
            return;
        }
        if (str == null && getText() != null) {
            str = getText().toString();
        }
        if (str == null || -1 == (indexOf = str.indexOf("."))) {
            return;
        }
        int indexOf2 = str.indexOf(b.a(R.string.taobao_app_1012_1_13391));
        if (-1 == indexOf2) {
            indexOf2 = str.indexOf(b.a(R.string.taobao_app_1012_1_13386));
        }
        if (-1 == indexOf2) {
            indexOf2 = str.length();
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(this.mDecimalNumRatio), indexOf, indexOf2, 33);
        setText(spannableString);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        super.setTextSize(i, f);
        fixSpan(null);
    }

    public void setDollarRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e2194c", new Object[]{this, new Float(f)});
            return;
        }
        this.mDollarRatio = f;
        float f2 = this.mPrice;
        if (f2 < 0.0f) {
            return;
        }
        setPrice(f2);
    }

    public void setDecimalNumRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e27ec5", new Object[]{this, new Float(f)});
            return;
        }
        this.mDecimalNumRatio = f;
        float f2 = this.mPrice;
        if (f2 < 0.0f) {
            return;
        }
        setPrice(f2);
    }
}
