package com.alipay.android.msp.framework.assist;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.cache.SecurityCacheStorage;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.engine.IBaseEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspBaseImpl implements IBaseEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public String getOaid(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("baea1f42", new Object[]{this, context}) : "";
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public void invokePay(String str, String str2, EventAction eventAction, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435f970e", new Object[]{this, str, str2, eventAction, activity});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public void resetResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a718484", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : GlobalHelper.getInstance().getContext();
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public void loadProperties(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb05d08", new Object[]{this, context});
        } else {
            GlobalConstant.loadProperties(context);
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public String getApdidToken(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("684513e", new Object[]{this, context});
        }
        try {
            return APSecuritySdk.getInstance(context).getApdidToken();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public Resources getResources(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("bbd2e259", new Object[]{this, activity});
        }
        if (activity == null) {
            return getContext().getResources();
        }
        return activity.getApplicationContext().getResources();
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public String getPackageName(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b1a51a", new Object[]{this, context}) : context.getPackageName();
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public int getMspLocale(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30ed0fd2", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String replaceAll = str.replaceAll("-", "_");
        if ("zh_CN".equals(replaceAll) || "zh_Hans".equals(replaceAll)) {
            return 1;
        }
        if ("zh_TW".equals(replaceAll) || "zh_Hant".equals(replaceAll)) {
            return 2;
        }
        if ("zh_HK".equals(replaceAll) || "zh-HK".equals(replaceAll)) {
            return 3;
        }
        return ("en_US".equals(replaceAll) || "en".equals(replaceAll)) ? 4 : -1;
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public String readSecStorage(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("efdd30c7", new Object[]{this, str, str2, new Boolean(z)}) : SecurityCacheStorage.get(str, str2, z);
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public void setSecStorage(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d211c1e3", new Object[]{this, str, str2, str3, new Boolean(z)});
        } else {
            SecurityCacheStorage.set(str, str2, str3, z);
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBaseEngine
    public boolean isCurrentOrderInfoPaying(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("479198dc", new Object[]{this, str})).booleanValue() : MspContextManager.getInstance().getTradeContextByOrderInfo(str) != null;
    }
}
