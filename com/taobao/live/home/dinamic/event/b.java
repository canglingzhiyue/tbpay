package com.taobao.live.home.dinamic.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import tb.mfp;
import tb.pro;

/* loaded from: classes7.dex */
public class b extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_LSCROLLEXPOSE = -6303467050116154020L;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0 || dXRuntimeContext.m() == null) {
        } else {
            JSONObject jSONObject = null;
            int i = -1;
            if (dXEvent instanceof DXViewEvent) {
                i = ((DXViewEvent) dXEvent).getItemIndex();
            } else if (dXEvent instanceof DXPageChangeEvent) {
                i = ((DXPageChangeEvent) dXEvent).pageIndex;
            }
            Object obj = objArr[0];
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i >= 0 && i < jSONArray.size()) {
                    jSONObject = jSONArray.getJSONObject(i);
                }
            } else if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            }
            if (jSONObject == null) {
                return;
            }
            String string = jSONObject.getString("trackInfo");
            JSONObject jSONObject2 = jSONObject.getJSONObject(d.SHOW_MAIDIAN);
            if (jSONObject2 == null || jSONObject2.get("params") == null) {
                return;
            }
            String string2 = !pro.e(jSONObject2.getString("pageName")) ? jSONObject2.getString("pageName") : "Page_TaobaoLive";
            if (!pro.e(string)) {
                String string3 = jSONObject2.getString("name");
                mfp.b(string2, string3, jSONObject2.getString("params") + ",trackInfo=" + string);
                return;
            }
            mfp.b(string2, jSONObject2.getString("name"), jSONObject2.getString("params"));
        }
    }
}
