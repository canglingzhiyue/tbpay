package com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import tb.emu;
import tb.fpn;
import tb.kge;

/* loaded from: classes5.dex */
public class KAPContainerConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TAG = "XKAPView";

    static {
        kge.a(1143478525);
    }

    public KAPContainerConstructor() {
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerConstructor");
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new KAPContainerView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"xkapCellsData", "normalTextColor", "highlightTextColor", "normalMenuColor", "highlightmenuColor"})
    public void setTagsAttrs(View view, JSONObject jSONObject, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f73c054", new Object[]{this, view, jSONObject, str, str2, str3, str4});
            return;
        }
        i.d("KAP", "setTagsAttrs");
        if (!(view instanceof KAPContainerView)) {
            return;
        }
        i.d("KAP", "setTagsAttrs view instanceof KAPContainerView");
        KAPContainerView kAPContainerView = (KAPContainerView) view;
        kAPContainerView.setNormalTextColor(fpn.a(str, -6710887));
        kAPContainerView.setHighlightTextColor(fpn.a(str2, -45056));
        kAPContainerView.setNormalMenuColor(fpn.a(str3, (int) KAPContainerView.DEFAULT_MENU_COLOR));
        kAPContainerView.setHighlightMenuColor(fpn.a(str4, -45056));
        kAPContainerView.bindData(jSONObject);
    }
}
