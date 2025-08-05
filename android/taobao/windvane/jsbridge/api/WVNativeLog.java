package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVNativeLog extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mUsedSize = 0;

    static {
        kge.a(562854112);
    }

    public static /* synthetic */ Object ipc$super(WVNativeLog wVNativeLog, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"write".equals(str)) {
            return false;
        }
        return write(str2, wVCallBackContext);
    }

    private boolean write(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b410071", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (!j.commonConfig.bF || wVCallBackContext == null || wVCallBackContext.getWebview() == null) {
            return false;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                return false;
            }
            String string = parseObject.getString("ext");
            String string2 = parseObject.getString("errorMsg");
            if (string != null) {
                this.mUsedSize += string.length();
            }
            if (string2 != null) {
                this.mUsedSize += string2.length();
            }
            if (this.mUsedSize >= j.commonConfig.bQ) {
                wVCallBackContext.error("FAILED", "累计的日志已超过单个页面写入客户端日志的上限 " + j.commonConfig.bQ + "KB");
                return false;
            }
            com.taobao.android.riverlogger.e.a("JS/TraceLog", wVCallBackContext.getPid(), str);
            wVCallBackContext.success();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
