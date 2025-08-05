package com.alipay.android.msp.framework.assist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.engine.IJumpEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.SdkFlavor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspJumpImpl implements IJumpEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.engine.IJumpEngine
    public void startSmartDevicesApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fd0f2", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IJumpEngine
    public void startWalletApp(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6178303d", new Object[]{this, str, bundle});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IJumpEngine
    public void processScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d05bc85", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addFlags(268435456);
            GlobalHelper.getInstance().getContext().startActivity(intent);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IJumpEngine
    public int processUri(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecef8b36", new Object[]{this, uri})).intValue();
        }
        try {
            Intent intent = new Intent();
            intent.setData(uri);
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addFlags(268435456);
            GlobalHelper.getInstance().getContext().startActivity(intent);
            return 0;
        } catch (Throwable unused) {
            return 5;
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IJumpEngine
    public boolean processUrl(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d216c2f", new Object[]{this, context, str})).booleanValue() : SdkFlavor.processUrl(context, str);
    }
}
