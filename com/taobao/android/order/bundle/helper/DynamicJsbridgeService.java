package com.taobao.android.order.bundle.helper;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.weex2.TBRegisterWeex2Module;
import tb.kge;

/* loaded from: classes6.dex */
public class DynamicJsbridgeService extends Service implements android.taobao.windvane.jsbridge.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(745207308);
        kge.a(-1332442189);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends android.taobao.windvane.jsbridge.e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (CoreConstants.ORDER_WV_KEY.equals(str)) {
            return TBRefreshOrder.class;
        }
        if (CoreConstants.ORDER_WV_KEY_WEEX2_MODULE.equals(str)) {
            return TBRegisterWeex2Module.class;
        }
        if (CoreConstants.ORDER_WV_TB_ODER.equals(str)) {
            return WvOrderPlugin.class;
        }
        if (!CoreConstants.ORDER_LIST_FILTER.equals(str)) {
            return null;
        }
        return OrderRequestJSPlugin.class;
    }
}
