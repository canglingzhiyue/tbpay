package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.expressionv2.i;
import com.taobao.android.dinamicx.p;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.fpn;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public class DTextViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final String TAG = "DTextViewConstructor";

    static {
        kge.a(1972432588);
    }

    public static /* synthetic */ Object ipc$super(DTextViewConstructor dTextViewConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        } else if (hashCode != 2131214456) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (fpd) objArr[2]);
            return null;
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new TextView(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        TextView textView = (TextView) view;
        if (arrayList.contains("dText")) {
            setText(textView, (String) map.get("dText"));
        }
        if (arrayList.contains("dTextSize")) {
            if (p.a(fpdVar.b())) {
                if (map.containsKey("dEnableTextSizeStrategy")) {
                    z = i.a((String) map.get("dEnableTextSizeStrategy"));
                }
                if (z) {
                    setElderTextSize(textView, (String) map.get("dTextSize"));
                } else {
                    setTextSize(textView, (String) map.get("dTextSize"));
                }
            } else {
                setTextSize(textView, (String) map.get("dTextSize"));
            }
        }
        if (arrayList.contains("dTextTheme") || arrayList.contains("dTextStyle")) {
            setTextTheme(textView, (String) map.get("dTextTheme"), (String) map.get("dTextStyle"));
        }
        if (arrayList.contains("dTextColor")) {
            setTextColor(textView, (String) map.get("dTextColor"));
        }
        if (arrayList.contains("dMaxLines")) {
            setMaxLines(textView, (String) map.get("dMaxLines"));
        }
        if (arrayList.contains("dMaxWidth")) {
            setMaxWidth(textView, (String) map.get("dMaxWidth"));
        }
        if (arrayList.contains("dLineBreakMode")) {
            setTextLineBreakMode(textView, (String) map.get("dLineBreakMode"));
        }
        if (arrayList.contains("dStrikeThroughStyle")) {
            setDeleteLine(textView, (String) map.get("dStrikeThroughStyle"));
        }
        if (!arrayList.contains("dTextGravity") && !arrayList.contains("dTextAlignment")) {
            return;
        }
        setTextGravity(textView, (String) map.get("dTextGravity"), (String) map.get("dTextAlignment"));
    }

    public void setText(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9914798", new Object[]{this, textView, str});
        } else {
            textView.setText(str);
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void applyDefaultProperty(View view, Map<String, Object> map, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f07c078", new Object[]{this, view, map, fpdVar});
            return;
        }
        super.applyDefaultProperty(view, map, fpdVar);
        TextView textView = (TextView) view;
        if (!map.containsKey("dTextSize")) {
            textView.setTextSize(1, 12.0f);
        }
        if (!map.containsKey("dTextColor")) {
            textView.setTextColor(-16777216);
        }
        if (!map.containsKey("dMaxLines")) {
            textView.setMaxLines(1);
        }
        if (!map.containsKey("dLineBreakMode")) {
            textView.setEllipsize(null);
        }
        if (!map.containsKey("dTextGravity") && !map.containsKey("dTextAlignment")) {
            textView.setGravity(16);
        }
        if (map.containsKey("dAccessibilityTextHidden")) {
            return;
        }
        setAccessibilityHidden(view, true);
    }

    public void setTextSize(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ed30d7", new Object[]{this, textView, str});
            return;
        }
        int a2 = fpr.a(textView.getContext(), str, -1);
        if (a2 == -1) {
            textView.setTextSize(1, 12.0f);
        } else {
            textView.setTextSize(0, a2);
        }
    }

    public void setElderTextSize(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbb8fb1", new Object[]{this, textView, str});
            return;
        }
        int a2 = (int) p.a(fpr.a(textView.getContext(), str, -1));
        if (a2 == -1) {
            textView.setTextSize(1, 18.0f);
        } else {
            textView.setTextSize(0, a2);
        }
    }

    public void setTextStyle(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955341a5", new Object[]{this, textView, str});
        } else if (TextUtils.isEmpty(str)) {
            textView.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            } else if (intValue == 1) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            } else if (intValue == 2) {
                textView.setTypeface(Typeface.defaultFromStyle(2));
            } else if (intValue != 3) {
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(3));
            }
        }
    }

    public void setTextTheme(TextView textView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7329717", new Object[]{this, textView, str, str2});
        } else if (str != null) {
            if ("normal".equals(str)) {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            } else if ("bold".equals(str)) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            } else if ("italic".equals(str)) {
                textView.setTypeface(Typeface.defaultFromStyle(2));
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
        } else {
            setTextStyle(textView, str2);
        }
    }

    public void setTextColor(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b9db3", new Object[]{this, textView, str});
        } else {
            textView.setTextColor(fpn.a(str, -16777216));
        }
    }

    public void setTextLineBreakMode(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6a908", new Object[]{this, textView, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            textView.setEllipsize(null);
        } else if (intValue == 1) {
            textView.setEllipsize(TextUtils.TruncateAt.START);
        } else if (intValue == 2) {
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (intValue != 3) {
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void setTextGravity(TextView textView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12aaab72", new Object[]{this, textView, str, str2});
        } else if (str != null) {
            if ("left".equals(str)) {
                textView.setGravity(19);
            } else if ("center".equals(str)) {
                textView.setGravity(17);
            } else if ("right".equals(str)) {
                textView.setGravity(21);
            } else {
                textView.setGravity(16);
            }
        } else {
            setTextAlignment(textView, str2);
        }
    }

    public void setTextAlignment(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520b9bb3", new Object[]{this, textView, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            textView.setGravity(19);
        } else if (intValue == 1) {
            textView.setGravity(17);
        } else if (intValue != 2) {
        } else {
            textView.setGravity(21);
        }
    }

    public void setMaxLines(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a68c80a", new Object[]{this, textView, str});
            return;
        }
        Integer valueOf = Integer.valueOf(str);
        if (valueOf.intValue() <= 0) {
            textView.setMaxLines(Integer.MAX_VALUE);
        } else if (valueOf.intValue() == 1) {
            textView.setMaxLines(1);
        } else {
            textView.setMaxLines(valueOf.intValue());
        }
    }

    public void setMaxWidth(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f71fe63", new Object[]{this, textView, str});
            return;
        }
        int a2 = fpr.a(textView.getContext(), str, -1);
        if (a2 == -1) {
            return;
        }
        textView.setMaxWidth(a2);
    }

    public void setDeleteLine(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0f8bc6", new Object[]{this, textView, str});
        } else if (!TextUtils.equals(PromotionFilterBean.SINGLE, str)) {
        } else {
            textView.getPaint().setFlags(16);
        }
    }
}
