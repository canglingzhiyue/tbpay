package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.kge;
import tb.mfp;

/* loaded from: classes6.dex */
public class f extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLCARDDATAEXPO = 4879316639758331617L;

    static {
        kge.a(992521453);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
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
        JSONArray jSONArray;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 0 && (objArr[0] instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) objArr[0];
            if (jSONObject.getJSONArray("cardData") == null || (jSONArray = jSONObject.getJSONArray("cardData")) == null || jSONArray.size() == 0) {
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.SHOW_MAIDIAN);
                    String str3 = "";
                    if (jSONObject3 != null) {
                        String string = jSONObject3.getString("pageName");
                        String string2 = jSONObject3.getString("name");
                        str = jSONObject3.getString("params");
                        str2 = string;
                        str3 = string2;
                    } else {
                        str = str3;
                        str2 = str;
                    }
                    String string3 = jSONObject2.getString("trackInfo");
                    if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) string3)) {
                        str = str + ",trackInfo=" + string3;
                    }
                    if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) str3)) {
                        mfp.b(str2, str3, str);
                    }
                }
            }
        }
    }
}
