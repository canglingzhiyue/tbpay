package com.taobao.android.order.bundle.helper.orderplugin.impl;

import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.TBOrderListActivity;
import com.taobao.android.order.bundle.constants.CoreConstants;
import java.util.HashMap;
import tb.hxc;
import tb.hyl;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends hxc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "rebuyPopBridge";
    public static final String QUERY_KEY_SHOW_REBUYPOP = "showRebuyPop";

    static {
        kge.a(1142701212);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.hxc
    public boolean a(Context context, IWVWebView iWVWebView, String str, WVCallBackContext wVCallBackContext) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df9fc10f", new Object[]{this, context, iWVWebView, str, wVCallBackContext})).booleanValue();
        }
        if (str == null || context == null || (a2 = hyl.a(str)) == null) {
            return false;
        }
        if (context instanceof TBOrderListActivity) {
            b(context, a2.getString(QUERY_KEY_SHOW_REBUYPOP));
        } else {
            a(context, a2.getString("orderListUrl"));
        }
        return true;
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            Nav.from(context).toUri(str);
        }
    }

    private void b(Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
            return;
        }
        Intent intent = null;
        if (!TextUtils.isEmpty(str)) {
            intent = new Intent();
            intent.putExtra(CoreConstants.QUERY_PARAM_KEY_CONDITION, new HashMap<String, Object>() { // from class: com.taobao.android.order.bundle.helper.orderplugin.impl.OrderPluginRebuyPopAction$1
                {
                    a.this = this;
                    put(a.QUERY_KEY_SHOW_REBUYPOP, str);
                }
            });
        }
        com.taobao.android.order.bundle.helper.a.a(context, true, intent);
    }
}
