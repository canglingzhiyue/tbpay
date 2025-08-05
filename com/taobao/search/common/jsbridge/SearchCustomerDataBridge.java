package com.taobao.search.common.jsbridge;

import android.app.Activity;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.util.k;
import com.uc.webview.export.extension.UCCore;
import org.json.JSONObject;
import tb.kge;
import tb.nom;

/* loaded from: classes7.dex */
public class SearchCustomerDataBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "customerDataJSBridge";

    static {
        kge.a(1800626790);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("finishEdit".equals(str)) {
            searchAgain(str2);
            return true;
        } else if (!"searchAgain".equals(str)) {
            return false;
        } else {
            searchAgain(str2);
            return true;
        }
    }

    @WindVaneInterface
    public final void searchAgain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1fcdf29", new Object[]{this, str});
            return;
        }
        try {
            String optString = new JSONObject(str).optString("isChanged");
            ((Activity) this.mContext).finish();
            Bundle bundle = null;
            if (nom.VALUE_YES.equals(optString)) {
                bundle = new Bundle();
                bundle.putString(k.KEY_IS_REFRESH, "true");
            }
            Nav.from(this.mContext).withFlags(UCCore.VERIFY_POLICY_PAK_QUICK).withExtras(bundle).toUri(k.SEARCHLIST_H5);
        } catch (Exception unused) {
            Log.e("SearchCustomBridge", "search again error");
        }
    }
}
