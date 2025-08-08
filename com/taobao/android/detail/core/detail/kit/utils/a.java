package com.taobao.android.detail.core.detail.kit.utils;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f9545a;
    private TextView b;

    static {
        kge.a(-422313574);
    }

    public a() {
        emu.a("com.taobao.android.detail.core.detail.kit.utils.CtOfferPriceHolder");
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.f9545a = (TextView) view.findViewById(R.id.origin_price);
        this.b = (TextView) view.findViewById(R.id.current_price);
    }

    public void a(PriceNode.PriceData priceData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f15b8a", new Object[]{this, priceData});
            return;
        }
        String b = b(priceData);
        if (StringUtils.isEmpty(b)) {
            this.b.setVisibility(4);
            return;
        }
        String a2 = i.a(b);
        float f = epo.f27511a * 40.0f;
        this.b.setTextSize(0, f);
        this.b.setText(a(a2, a(this.b, a2, (int) (((epo.b - (epo.f27511a * 10.0f)) / 2.0f) - (epo.f27511a * 95.0f)), f)));
        this.b.setVisibility(0);
    }

    public void a(ArrayList<PriceNode.PriceData> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList.isEmpty()) {
        } else {
            String str = arrayList.get(0).priceText;
            if (StringUtils.isEmpty(str)) {
                this.f9545a.setVisibility(4);
                return;
            }
            String str2 = "¥" + str + " ";
            int i = (int) (epo.f27511a * 60.0f);
            float f = epo.f27511a * 16.0f;
            this.f9545a.setTextSize(0, f);
            this.f9545a.setText(a(str2, a(this.b, str2, i, f)));
            this.f9545a.getPaint().setFlags(16);
        }
    }

    public static float a(TextView textView, String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15c56d33", new Object[]{textView, str, new Integer(i), new Float(f)})).floatValue();
        }
        if (textView == null) {
            return f;
        }
        TextPaint paint = textView.getPaint();
        while (paint.measureText(str) > i - 30) {
            paint.setTextSize(paint.getTextSize() - epo.f27511a);
            a(textView, str, i, f);
        }
        return paint.getTextSize() > f ? f : paint.getTextSize();
    }

    public static SpannableStringBuilder a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("92879cf1", new Object[]{str, new Float(f)});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!str.contains(".")) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) f), 0, str.length(), 17);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 17);
        } else {
            int i = (int) f;
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i), 0, str.indexOf("."), 17);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.indexOf("."), 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((i * 22) / 40), str.indexOf("."), str.length(), 18);
        }
        return spannableStringBuilder;
    }

    public static String b(PriceNode.PriceData priceData) {
        char charAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("619d2a75", new Object[]{priceData});
        }
        if (priceData == null) {
            return null;
        }
        String str = priceData.priceText;
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        int i = -1;
        for (int i2 = 0; i2 < str.length() && (((charAt = str.charAt(i2)) >= '0' && charAt <= '9') || charAt == '.'); i2++) {
            i = i2;
        }
        return i == -1 ? str : str.substring(0, i + 1).trim();
    }
}
