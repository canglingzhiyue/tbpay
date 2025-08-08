package com.taobao.taolive.dinamicext.taolivedinamic;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.nav.Nav;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class DXTBLDinamicClickHandler extends h implements IMTOPDataObject {
    public static final long DX_EVENT_TBLTAP = 10220236261038765L;

    static {
        kge.a(158281196);
        kge.a(-350052935);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        if (objArr == null || objArr.length <= 0 || dXRuntimeContext == null) {
            return;
        }
        Context m = dXRuntimeContext.m();
        JSONObject jSONObject = (JSONObject) objArr[0];
        if (jSONObject == null || m == null) {
            return;
        }
        if (jSONObject.get("nativeFeedDetailUrl") != null) {
            String string = jSONObject.getString("nativeFeedDetailUrl");
            if (!StringUtils.isEmpty(string)) {
                Nav.from(m).toUri(string);
            }
        }
        getClickCallback(dXRuntimeContext.v());
    }

    private a getClickCallback(View view) {
        if (view instanceof a) {
            return (a) view;
        }
        if (view == null) {
            return null;
        }
        return getClickCallback((ViewGroup) view.getParent());
    }
}
