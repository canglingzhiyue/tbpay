package com.alibaba.android.aura.taobao.adapter.extension.event.openUrl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.config.a;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fke;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAWVJsBridgePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRIDGE_PLUGIN_NAME = "BuyBridgeComponent";
    public static final String KEY_H5_RESULT = "data";
    private static final String KEY_SET_DATA_BRIDGE = "setData";
    private static final String KEY_SET_INTO_BRIDGE = "setInfo";

    static {
        kge.a(1785876076);
    }

    public static /* synthetic */ Object ipc$super(AURAWVJsBridgePlugin aURAWVJsBridgePlugin, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode != -1504501726) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroy();
            return null;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("setInfo".equals(str) || KEY_SET_DATA_BRIDGE.equals(str)) {
            setInfo(wVCallBackContext, str2);
            return true;
        }
        returnError(wVCallBackContext);
        return false;
    }

    @WindVaneInterface
    public final void setInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9abf3e", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (this.mContext instanceof Activity) {
            Intent intent = new Intent();
            intent.putExtra("data", str);
            intent.putExtra("bridge_data", str);
            ((Activity) this.mContext).setResult(-1, intent);
            fke.a(this.mContext);
        }
        returnSuccess(wVCallBackContext);
    }

    private void returnError(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad160fc", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("HY_PARAM_ERR");
        wVCallBackContext.error(rVar);
    }

    private void returnSuccess(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ce35f7", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("os", "android");
        rVar.a("version", a.VERSION);
        wVCallBackContext.success(rVar);
    }
}
