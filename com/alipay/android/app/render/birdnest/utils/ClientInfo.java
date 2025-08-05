package com.alipay.android.app.render.birdnest.utils;

import android.os.Build;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import tb.riy;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class ClientInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String buildClientInfo(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55c43657", new Object[]{iCashierProvider});
        }
        return riy.BLOCK_START_STR + String.format("\"%s\":\"%s\"", "client.version", "") + ", " + String.format("\"%s\":\"%s\"", "client.patch", "") + ", " + String.format("\"%s\":\"%s\"", "umidToken", "") + "," + String.format("\"%s\":\"%s\"", "os.name", "Android") + "," + String.format("\"%s\":\"%s\"", "os.version", Build.VERSION.RELEASE) + "," + String.format("\"%s\":\"%s\"", "device.id", "") + riy.BLOCK_END_STR;
    }
}
