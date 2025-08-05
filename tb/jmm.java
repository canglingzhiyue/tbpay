package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.testutils.a;
import com.taobao.android.ucp.bridge.NativeBroadcast;

/* loaded from: classes6.dex */
public class jmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(41900489);
    }

    public static boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            a.C0599a.a(str, false);
            NativeBroadcast.sendMessageFromJava("preview", parseObject, null);
            wVCallBackContext.success();
            return true;
        } catch (JSONException unused) {
            wVCallBackContext.error();
            return false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a.C0599a.a();
    }
}
