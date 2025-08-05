package com.taobao.tmgcashier.jsbridge;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.tmgcashier.constant.a;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class CashJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMGCashJSBridge";

    static {
        kge.a(468018427);
    }

    public static /* synthetic */ Object ipc$super(CashJSBridge cashJSBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (a.BRIDGE_ACTION_SKIP2TNGD.equalsIgnoreCase(str)) {
            skip2TNGD(str2, wVCallBackContext);
        }
        return true;
    }

    private void skip2TNGD(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1a4b8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                TLog.logd("tmgcashier", TAG, "skip2TNGD params 为空！");
                wVCallBackContext.error("skip2TNGD params 为空！");
                return;
            }
            Nav withFlags = Nav.from(this.mContext).allowEscape().withFlags(268435456);
            Uri parse = Uri.parse(new JSONObject(str).getString("url"));
            if ("tngdwallet".equalsIgnoreCase(parse.getScheme())) {
                if (withFlags.toUri(parse)) {
                    wVCallBackContext.success();
                    return;
                } else {
                    wVCallBackContext.error("Nav error!");
                    return;
                }
            }
            wVCallBackContext.error("只支持tngdwallet类型schema");
        } catch (Exception e) {
            e.printStackTrace();
            TLog.logd("tmgcashier", TAG, e.getMessage());
            wVCallBackContext.error(e.getMessage());
        }
    }
}
