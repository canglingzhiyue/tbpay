package com.taobao.android.purchase.core;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class TBBuyDegradeWVService extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GET_PURCHASE_PARAMS = "getBuildOrderParams";
    public static final String BRIDGE_PLUGIN_NAME = "TBPurchaseDegradeWVService";
    public static final String KEY_PARAMS = "originValue";
    private static String sResultParams;
    private String mParams = sResultParams;

    static {
        kge.a(710442147);
    }

    public static /* synthetic */ Object ipc$super(TBBuyDegradeWVService tBBuyDegradeWVService, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_GET_PURCHASE_PARAMS.equals(str) && wVCallBackContext != null) {
            r rVar = new r();
            rVar.a(KEY_PARAMS, this.mParams);
            wVCallBackContext.success(rVar);
        }
        return false;
    }

    public static void setBuildOrderParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d96f439", new Object[]{str});
        } else {
            sResultParams = str;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        sResultParams = null;
        this.mParams = null;
    }
}
