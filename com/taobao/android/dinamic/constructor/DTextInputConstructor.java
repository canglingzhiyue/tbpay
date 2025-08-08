package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.expressionv2.i;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import java.util.ArrayList;
import java.util.Map;
import tb.fnj;
import tb.fpd;
import tb.fpn;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public class DTextInputConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final String TAG = "DTextInputConstructor";

    static {
        kge.a(1331120633);
    }

    public static /* synthetic */ Object ipc$super(DTextInputConstructor dTextInputConstructor, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new EditText(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        EditText editText = (EditText) view;
        if (arrayList.contains("dText")) {
            setText(editText, (String) map.get("dText"));
        }
        if (arrayList.contains("dTextSize")) {
            setTextSize(editText, (String) map.get("dTextSize"));
        }
        if (arrayList.contains("dTextColor")) {
            setTextColor(editText, (String) map.get("dTextColor"));
        }
        if (arrayList.contains("dTextGravity") || arrayList.contains("dTextAlignment")) {
            setTextGravity(editText, (String) map.get("dTextGravity"), (String) map.get("dTextAlignment"));
        }
        if (arrayList.contains("dPlaceholder")) {
            editText.setHint((String) map.get("dPlaceholder"));
        }
        if (arrayList.contains("dPlaceholderColor")) {
            setHintColor(editText, (String) map.get("dPlaceholderColor"));
        }
        if (arrayList.contains("dKeyboard")) {
            setKeyBoardType(editText, (String) map.get("dKeyboard"));
        }
        if (arrayList.contains("dMaxLength")) {
            setMaxLength(editText, (String) map.get("dMaxLength"));
        }
        if (!arrayList.contains("dInputFocusable")) {
            return;
        }
        boolean a2 = i.a((String) map.get("dInputFocusable"));
        editText.setFocusable(a2);
        editText.setFocusableInTouchMode(a2);
    }

    private void setMaxLength(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6388103a", new Object[]{this, editText, str});
        } else if (StringUtils.isEmpty(str)) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
        } else {
            Integer valueOf = Integer.valueOf(str);
            if (valueOf.intValue() <= 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(valueOf.intValue())});
            }
        }
    }

    private void setKeyBoardType(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0df", new Object[]{this, editText, str});
        } else if (StringUtils.isEmpty(str)) {
            editText.setInputType(1);
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                editText.setInputType(1);
            } else if (intValue == 1) {
                editText.setInputType(2);
            } else if (intValue == 2) {
                editText.setInputType(3);
            } else if (intValue == 3) {
                editText.setInputType(128);
            } else {
                editText.setInputType(1);
            }
        }
    }

    private void setHintColor(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd851248", new Object[]{this, editText, str});
        } else {
            editText.setHintTextColor(fpn.a(str, -16777216));
        }
    }

    private void setBackground(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff662732", new Object[]{this, editText, str});
        } else {
            editText.setBackgroundColor(fpn.a(str, -16777216));
        }
    }

    public void setText(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27083bd3", new Object[]{this, editText, str});
        } else {
            editText.setText(str);
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
        EditText editText = (EditText) view;
        editText.setLines(1);
        editText.setSingleLine();
        editText.setImeOptions(6);
        if (!map.containsKey("dTextSize")) {
            editText.setTextSize(1, 12.0f);
        }
        if (!map.containsKey("dTextColor")) {
            editText.setTextColor(-16777216);
        }
        if (!map.containsKey("dLineBreakMode")) {
            editText.setEllipsize(null);
        }
        if (map.containsKey("dTextGravity") || map.containsKey("dTextAlignment")) {
            return;
        }
        editText.setGravity(16);
    }

    public void setTextSize(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92642512", new Object[]{this, editText, str});
            return;
        }
        int a2 = fpr.a(editText.getContext(), str, -1);
        if (a2 == -1) {
            editText.setTextSize(1, 12.0f);
        } else {
            editText.setTextSize(0, a2);
        }
    }

    public void setTextStyle(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ca35e0", new Object[]{this, editText, str});
        } else if (StringUtils.isEmpty(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                editText.setTypeface(Typeface.defaultFromStyle(0));
            } else if (intValue == 1) {
                editText.setTypeface(Typeface.defaultFromStyle(1));
            } else if (intValue == 2) {
                editText.setTypeface(Typeface.defaultFromStyle(2));
            } else if (intValue != 3) {
            } else {
                editText.setTypeface(Typeface.defaultFromStyle(3));
            }
        }
    }

    public void setTextTheme(EditText editText, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be991292", new Object[]{this, editText, str, str2});
        } else if (str != null) {
            if ("normal".equals(str)) {
                editText.setTypeface(Typeface.defaultFromStyle(0));
            } else if ("bold".equals(str)) {
                editText.setTypeface(Typeface.defaultFromStyle(1));
            } else if ("italic".equals(str)) {
                editText.setTypeface(Typeface.defaultFromStyle(2));
            } else {
                editText.setTypeface(Typeface.defaultFromStyle(0));
            }
        } else {
            setTextStyle(editText, str2);
        }
    }

    public void setTextColor(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd291ee", new Object[]{this, editText, str});
        } else {
            editText.setTextColor(fpn.a(str, -16777216));
        }
    }

    public void setTextLineBreakMode(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442d9d43", new Object[]{this, editText, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            editText.setEllipsize(null);
        } else if (intValue == 1) {
            editText.setEllipsize(StringUtils.TruncateAt.START);
        } else if (intValue == 2) {
            editText.setEllipsize(StringUtils.TruncateAt.MIDDLE);
        } else if (intValue != 3) {
        } else {
            editText.setEllipsize(StringUtils.TruncateAt.END);
        }
    }

    public void setTextGravity(EditText editText, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1126ed", new Object[]{this, editText, str, str2});
        } else if (str != null) {
            if ("left".equals(str)) {
                editText.setGravity(19);
            } else if ("center".equals(str)) {
                editText.setGravity(17);
            } else if ("right".equals(str)) {
                editText.setGravity(21);
            } else {
                editText.setGravity(16);
            }
        } else {
            setTextAlignment(editText, str2);
        }
    }

    public void setTextAlignment(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f828fee", new Object[]{this, editText, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            editText.setGravity(19);
        } else if (intValue == 1) {
            editText.setGravity(17);
        } else if (intValue != 2) {
        } else {
            editText.setGravity(21);
        }
    }

    public void setMaxLines(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dfbc45", new Object[]{this, editText, str});
            return;
        }
        Integer valueOf = Integer.valueOf(str);
        if (valueOf.intValue() <= 0) {
            editText.setMaxLines(Integer.MAX_VALUE);
        } else if (valueOf.intValue() == 1) {
            editText.setMaxLines(1);
        } else {
            editText.setMaxLines(valueOf.intValue());
        }
    }

    public void setMaxWidth(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce8f29e", new Object[]{this, editText, str});
            return;
        }
        int a2 = fpr.a(editText.getContext(), str, -1);
        if (a2 == -1) {
            return;
        }
        editText.setMaxWidth(a2);
    }

    public void setDeleteLine(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8868001", new Object[]{this, editText, str});
        } else if (!StringUtils.equals(PromotionFilterBean.SINGLE, str)) {
        } else {
            editText.getPaint().setFlags(16);
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setEvents(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a6a1c6", new Object[]{this, view, fpdVar});
        } else {
            new fnj().a(view, fpdVar);
        }
    }
}
