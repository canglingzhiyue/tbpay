package com.taobao.android.shop.weex;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.IExternalModuleGetter;
import tb.kge;

/* loaded from: classes6.dex */
public class ShopWeexRegisterService extends Service implements IExternalModuleGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-192886445);
        kge.a(470773675);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // com.taobao.weex.ui.IExternalModuleGetter
    public Class<? extends WXModule> getExternalModuleClass(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f9116d39", new Object[]{this, str, context});
        }
        com.taobao.android.shop.utils.a.c("main-cost", "ShopWeexRegisterService " + str);
        if ("com.taobao.android.shop.weex.ShopReportModule".equals(str) || "shopReport".equals(str)) {
            return ShopReportModule.class;
        }
        if (!"com.taobao.android.shop.weex.ShopDataModule".equals(str) && !"shopData".equals(str)) {
            return null;
        }
        return ShopDataModule.class;
    }
}
