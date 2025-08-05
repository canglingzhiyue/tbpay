package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.kge;
import tb.mfl;

/* loaded from: classes6.dex */
public class c extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLSEARCHTAP = -3206170206360344375L;

    static {
        kge.a(1358117338);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
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
        } else if (objArr == null || objArr.length == 0 || dXRuntimeContext == null) {
        } else {
            try {
                if (dXRuntimeContext.m() instanceof Activity) {
                    com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.ATYPE, false, dXRuntimeContext.m());
                    com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.BTYPE, false, dXRuntimeContext.m());
                    if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.p() != null) {
                        if (com.taobao.android.live.plugin.proxy.f.p().getNonageServiceX().a((Activity) dXRuntimeContext.m(), "搜索")) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            JSONObject jSONObject = null;
            if (objArr[0] instanceof JSONObject) {
                jSONObject = (JSONObject) objArr[0];
            }
            if (jSONObject == null) {
                return;
            }
            String string = jSONObject.getString("jumpUrl");
            String string2 = jSONObject.getString("hotWordInfo");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("hotWordInfo", string2);
            mfl.a(dXRuntimeContext.m(), string, bundle);
        }
    }
}
