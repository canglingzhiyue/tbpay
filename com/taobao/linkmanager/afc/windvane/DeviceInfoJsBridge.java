package com.taobao.linkmanager.afc.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.flowcustoms.afc.utils.c;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class DeviceInfoJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "getDeviceInfo";
    public static final String NAME = "WVBCBase";

    static {
        kge.a(-393288261);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals(str, ACTION)) {
            b.a("device_info_count", "", "", null);
            if (wVCallBackContext != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    String a2 = AfcUtils.a(this.mContext, true);
                    String a3 = AfcUtils.a(this.mContext);
                    jSONObject.put("imei", a2);
                    jSONObject.put("imsi", a3);
                    c.a("linkx", "DeviceInfoJsBridge === DeviceInfoJsBridge: imei：" + a2 + " imsi: " + a3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                r rVar = new r();
                rVar.a("data", jSONObject);
                wVCallBackContext.success(rVar);
                return true;
            }
        }
        return false;
    }
}
