package com.taobao.browser.jsbridge;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.utils.d;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class WVClient extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1307805459);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"open".equals(str)) {
            return false;
        }
        open(str2, wVCallBackContext);
        return true;
    }

    public final void open(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a52d18", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            String optString = new JSONObject(str).optString("url", "");
            d.a().b();
            if (d.a().a(optString)) {
                rVar.a("msg", "This is intercepted!!!");
                wVCallBackContext.error(rVar);
            } else if (Nav.from(this.mContext).allowEscape().toUri(Uri.parse(optString))) {
                wVCallBackContext.success();
            } else {
                rVar.a("msg", "Nav error");
                wVCallBackContext.error(rVar);
            }
        } catch (JSONException unused) {
            rVar.a("msg", "JSON parse error");
            wVCallBackContext.error();
        }
    }
}
