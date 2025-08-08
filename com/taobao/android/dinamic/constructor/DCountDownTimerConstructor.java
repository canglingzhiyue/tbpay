package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.view.DCountDownTimerView;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.fpn;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public class DCountDownTimerConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final String TAG = "DCountDownTimerConstructor";
    private final int MARGIN_LEFT = 0;
    private final int MARGIN_TOP = 1;
    private final int MARGIN_RIGHT = 2;
    private final int MARGIN_BOTTOM = 3;
    private final int TEXT_SIZE = 6;
    private final int TEXT_COLOR = 7;
    private final int[] seeMoreTextDefaults = {0, 0, 0, 0, -1, -1, 12, -16777216};
    private final int[] timerTextDefaults = {0, 0, 0, 0, 20, 20, 12, -1};
    private final int[] colonTextDefaults = {0, 0, 0, 0, -1, -1, 10, -16777216};

    static {
        kge.a(-1022153590);
    }

    public static /* synthetic */ Object ipc$super(DCountDownTimerConstructor dCountDownTimerConstructor, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new DCountDownTimerView(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        DCountDownTimerView dCountDownTimerView = (DCountDownTimerView) view;
        if (arrayList.contains("dTimerTextMarginLeft") || arrayList.contains("dTimerTextMarginTop") || arrayList.contains("dTimerTextMarginRight") || arrayList.contains("dTimerTextMarginBottom") || arrayList.contains("dTimerTextWidth") || arrayList.contains("dTimerTextHeight") || arrayList.contains("dTimerTextSize") || arrayList.contains("dTimerTextColor") || arrayList.contains("dTimerBackgroundColor") || arrayList.contains("dTimerCornerRadius")) {
            setTimerTextViewStyle(dCountDownTimerView, (String) map.get("dTimerTextMarginLeft"), (String) map.get("dTimerTextMarginTop"), (String) map.get("dTimerTextMarginRight"), (String) map.get("dTimerTextMarginBottom"), (String) map.get("dTimerTextWidth"), (String) map.get("dTimerTextHeight"), (String) map.get("dTimerTextSize"), (String) map.get("dTimerTextColor"), (String) map.get("dTimerBackgroundColor"), (String) map.get("dTimerCornerRadius"));
        }
        if (arrayList.contains("dColonTextMarginLeft") || arrayList.contains("dColonTextMarginTop") || arrayList.contains("dColonTextMarginRight") || arrayList.contains("dColonTextMarginBottom") || arrayList.contains("dColonTextWidth") || arrayList.contains("dColonTextHeight") || arrayList.contains("dColonTextSize") || arrayList.contains("dColonTextColor") || arrayList.contains("dColonText")) {
            setColonTextViewStyle(dCountDownTimerView, (String) map.get("dColonTextMarginLeft"), (String) map.get("dColonTextMarginTop"), (String) map.get("dColonTextMarginRight"), (String) map.get("dColonTextMarginBottom"), (String) map.get("dColonTextWidth"), (String) map.get("dColonTextHeight"), (String) map.get("dColonTextSize"), (String) map.get("dColonTextColor"), (String) map.get("dColonText"));
        }
        if (arrayList.contains("dFutureTime") || arrayList.contains("dCurrentTime")) {
            setFutureTime(dCountDownTimerView, (String) map.get("dFutureTime"), (String) map.get("dCurrentTime"));
        }
        if (!arrayList.contains("dSeeMoreText") && !arrayList.contains("dSeeMoreTextMarginLeft") && !arrayList.contains("dSeeMoreTextMarginTop") && !arrayList.contains("dSeeMoreTextMarginRight") && !arrayList.contains("dSeeMoreTextMarginBottom") && !arrayList.contains("dSeeMoreTextWidth") && !arrayList.contains("dSeeMoreTextHeight") && !arrayList.contains("dSeeMoreTextSize") && !arrayList.contains("dSeeMoreTextColor")) {
            return;
        }
        setSeeMoreTextViewStyle(dCountDownTimerView, (String) map.get("dSeeMoreText"), (String) map.get("dSeeMoreTextMarginLeft"), (String) map.get("dSeeMoreTextMarginTop"), (String) map.get("dSeeMoreTextMarginRight"), (String) map.get("dSeeMoreTextMarginBottom"), (String) map.get("dSeeMoreTextWidth"), (String) map.get("dSeeMoreTextHeight"), (String) map.get("dSeeMoreTextSize"), (String) map.get("dSeeMoreTextColor"));
    }

    public void setSeeMoreTextViewStyle(DCountDownTimerView dCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f5cd95", new Object[]{this, dCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        TextView seeMoreView = dCountDownTimerView.getSeeMoreView();
        seeMoreView.setText(str);
        setTextViewStyle(seeMoreView, str2, str3, str4, str5, str6, str7, str8, str9, this.seeMoreTextDefaults);
    }

    public void setFutureTime(DCountDownTimerView dCountDownTimerView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a74b4b6", new Object[]{this, dCountDownTimerView, str, str2});
        } else if (StringUtils.isEmpty(str)) {
            dCountDownTimerView.hideCountDown();
            dCountDownTimerView.setFutureTime(-1L);
            dCountDownTimerView.getTimer().b();
        } else {
            dCountDownTimerView.setFutureTime(Long.valueOf(str).longValue());
            if (!StringUtils.isEmpty(str2)) {
                dCountDownTimerView.setCurrentTime(Long.valueOf(str2).longValue());
            }
            if (dCountDownTimerView.getLastTime() > 0) {
                dCountDownTimerView.showCountDown();
                dCountDownTimerView.updateCountDownViewTime();
                dCountDownTimerView.getTimer().a();
                return;
            }
            dCountDownTimerView.hideCountDown();
            dCountDownTimerView.getTimer().b();
        }
    }

    public void setColonTextViewStyle(DCountDownTimerView dCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34df2c", new Object[]{this, dCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        TextView colonFirst = dCountDownTimerView.getColonFirst();
        TextView colonSecond = dCountDownTimerView.getColonSecond();
        setTextViewStyle(colonFirst, str, str2, str3, str4, str5, str6, str7, str8, this.colonTextDefaults);
        setTextViewStyle(colonSecond, str, str2, str3, str4, str5, str6, str7, str8, this.colonTextDefaults);
        if (StringUtils.isEmpty(str9)) {
            return;
        }
        colonFirst.setText(str9);
        colonSecond.setText(str9);
    }

    public void setTimerTextViewStyle(DCountDownTimerView dCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9de925c", new Object[]{this, dCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9, str10});
            return;
        }
        TextView hour = dCountDownTimerView.getHour();
        TextView minute = dCountDownTimerView.getMinute();
        TextView second = dCountDownTimerView.getSecond();
        setTextViewStyle(hour, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTextViewStyle(minute, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTextViewStyle(second, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTimerTextBackground(hour, minute, second, str9, str10);
    }

    private void setTextViewStyle(TextView textView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int[] iArr) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb3e1fe", new Object[]{this, textView, str, str2, str3, str4, str5, str6, str7, str8, iArr});
            return;
        }
        if (!StringUtils.isEmpty(str7)) {
            textView.setTextSize(0, fpr.a(textView.getContext(), str7, 0));
        }
        if (!StringUtils.isEmpty(str8) && (a2 = fpn.a(str8, -16777216)) != -16777216) {
            textView.setTextColor(a2);
        }
        int[] textViewMargin = getTextViewMargin(textView.getContext(), str, str2, str3, str4, iArr);
        if (textViewMargin == null && StringUtils.isEmpty(str5) && StringUtils.isEmpty(str6)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        if (!StringUtils.isEmpty(str5)) {
            marginLayoutParams.width = fpr.a(textView.getContext(), str5, 0);
        }
        if (!StringUtils.isEmpty(str6)) {
            marginLayoutParams.height = fpr.a(textView.getContext(), str6, 0);
        }
        if (textViewMargin != null) {
            marginLayoutParams.setMargins(textViewMargin[0], textViewMargin[1], textViewMargin[2], textViewMargin[3]);
        }
        textView.setLayoutParams(marginLayoutParams);
    }

    private void setTimerTextBackground(TextView textView, TextView textView2, TextView textView3, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb47c793", new Object[]{this, textView, textView2, textView3, str, str2});
            return;
        }
        int a2 = !StringUtils.isEmpty(str) ? fpn.a(str, -16777216) : -16777216;
        int a3 = fpr.a(textView.getContext(), str2, 0);
        if (a2 == -16777216 && a3 == 0) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(a3);
        gradientDrawable.setColor(a2);
        textView.setBackgroundDrawable(gradientDrawable);
        textView2.setBackgroundDrawable(gradientDrawable);
        textView3.setBackgroundDrawable(gradientDrawable);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void applyDefaultProperty(View view, Map<String, Object> map, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f07c078", new Object[]{this, view, map, fpdVar});
            return;
        }
        super.applyDefaultProperty(view, map, fpdVar);
        DCountDownTimerView dCountDownTimerView = (DCountDownTimerView) view;
        TextView seeMoreView = dCountDownTimerView.getSeeMoreView();
        TextView hour = dCountDownTimerView.getHour();
        TextView minute = dCountDownTimerView.getMinute();
        TextView second = dCountDownTimerView.getSecond();
        TextView colonFirst = dCountDownTimerView.getColonFirst();
        TextView colonSecond = dCountDownTimerView.getColonSecond();
        setTextViewMarginAndColorAndSize(seeMoreView, this.seeMoreTextDefaults);
        seeMoreView.setText("");
        setTextViewMarginAndColorAndSize(hour, this.timerTextDefaults);
        setTextViewMarginAndColorAndSize(minute, this.timerTextDefaults);
        setTextViewMarginAndColorAndSize(second, this.timerTextDefaults);
        hour.setPadding(0, 0, 0, 0);
        minute.setPadding(0, 0, 0, 0);
        second.setPadding(0, 0, 0, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setColor(-16777216);
        hour.setBackgroundDrawable(gradientDrawable);
        minute.setBackgroundDrawable(gradientDrawable);
        second.setBackgroundDrawable(gradientDrawable);
        setTextViewMarginAndColorAndSize(colonFirst, this.colonTextDefaults);
        setTextViewMarginAndColorAndSize(colonSecond, this.colonTextDefaults);
        colonFirst.setText(":");
        colonSecond.setText(":");
    }

    private void setTextViewMarginAndColorAndSize(TextView textView, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd492841", new Object[]{this, textView, iArr});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextColor(iArr[7]);
        textView.setTextSize(1, iArr[6]);
    }

    private int[] getTextViewMargin(Context context, String str, String str2, String str3, String str4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4e9dc763", new Object[]{this, context, str, str2, str3, str4, iArr});
        }
        int a2 = fpr.a(context, str, iArr[0]);
        int a3 = fpr.a(context, str2, iArr[1]);
        int a4 = fpr.a(context, str3, iArr[2]);
        int a5 = fpr.a(context, str4, iArr[3]);
        if (a2 != iArr[0] || a3 != iArr[1] || a4 != iArr[2] || a5 != iArr[3]) {
            return new int[]{a2, a3, a4, a5};
        }
        return null;
    }
}
