package com.taobao.mytaobao.homepage.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.mxo;

/* loaded from: classes7.dex */
public class TBMyTaobaoWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG;

    static {
        kge.a(-1391311049);
        TAG = "TBMyTaobaoWVPlugin";
    }

    @WindVaneInterface
    public boolean getPassParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2645afff", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        TLog.logi(TAG, "getPassParams");
        String a2 = mxo.a(TAG);
        if (StringUtils.isEmpty(a2)) {
            a2 = new JSONObject(0).toString();
        }
        wVCallBackContext.success(a2);
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"getPassParams".equals(str)) {
            return false;
        }
        return getPassParams(str2, wVCallBackContext);
    }
}
