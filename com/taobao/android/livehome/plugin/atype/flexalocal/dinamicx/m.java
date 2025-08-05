package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import java.util.UUID;
import tb.fuf;
import tb.kge;
import tb.sdt;

/* loaded from: classes6.dex */
public class m extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLFETCHDEVICEINFO = 3909709391975154874L;

    static {
        kge.a(-1553034282);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appVersion", (Object) TaoLiveHomePageX.getAppVersion(null));
        jSONObject.put("taobaoAppVersion", (Object) sdt.e());
        jSONObject.put(TransportConstants.KEY_UUID, (Object) UUID.randomUUID());
        String str = "debug";
        jSONObject.put("currentEnvironment", (Object) (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.j() ? str : "release"));
        jSONObject.put("devicePackage", (Object) (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.j() ? str : "release"));
        if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.g() != 1) {
            str = "release";
        }
        jSONObject.put("deviceEnvironment", (Object) str);
        jSONObject.put("newWorkQuality", (Object) com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.h());
        jSONObject.put("netWorkQuality", (Object) com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.h());
        jSONObject.put("bottomSafeAreaHeight", (Object) 0);
        if (dXRuntimeContext != null) {
            jSONObject.put("foldDevice", (Object) Boolean.valueOf(sdt.a(dXRuntimeContext.m())));
            jSONObject.put("isLandscape", (Object) Boolean.valueOf(sdt.c(dXRuntimeContext.m())));
            jSONObject.put("isPadOrFoldLandscape", (Object) Boolean.valueOf(sdt.d(dXRuntimeContext.m())));
        }
        return jSONObject;
    }
}
