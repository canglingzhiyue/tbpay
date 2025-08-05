package com.taobao.android.detail.core.detail.kit.view.dinamic_ext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.DetailAdaptiveTextView;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailAdaptiveTextViewConstructor extends DTextViewConstructor implements IMTOPDataObject {
    public static final String VIEW_TAG = "XAdaptiveTextView";

    static {
        kge.a(240911179);
        kge.a(-350052935);
    }

    public DetailAdaptiveTextViewConstructor() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailAdaptiveTextViewConstructor");
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        return new DetailAdaptiveTextView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"dWidth", "dMaxWidth", "xTextList", "xTextName", "xSeparator", "xMaxLen", "xEllipsis"})
    public void setAttr(View view, String str, String str2, JSONArray jSONArray, String str3, String str4, String str5, String str6) {
        if (view == null || !(view instanceof DetailAdaptiveTextView)) {
            return;
        }
        ((DetailAdaptiveTextView) view).setViewAttr(view, str, str2, jSONArray, str3, str4, str5, str6);
    }
}
