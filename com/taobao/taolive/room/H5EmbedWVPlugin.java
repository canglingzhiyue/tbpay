package com.taobao.taolive.room;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aa;
import tb.kge;
import tb.psm;

/* loaded from: classes8.dex */
public class H5EmbedWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(391339838);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.taobao.tbliveinteractive.container.h5.e eVar = new com.taobao.tbliveinteractive.container.h5.e(str, str2, wVCallBackContext);
        if (!"enableEmbedLiveRoom".equals(str)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enable", (Object) Boolean.valueOf(com.taobao.taolive.room.utils.d.b() && psm.l()));
        if (aa.j() && aa.k()) {
            z = true;
        }
        jSONObject.put("enableH5UT", (Object) Boolean.valueOf(z));
        jSONObject.put("h5EmbedVersion", (Object) 1);
        eVar.a(jSONObject.toJSONString());
        return true;
    }
}
