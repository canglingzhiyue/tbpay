package com.taobao.android.miniLive.weex;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.IExternalModuleGetter;
import tb.kge;

/* loaded from: classes6.dex */
public class TBLiveModuleRegisterService extends Service implements IExternalModuleGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1504415319);
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
        if (!StringUtils.equals(str, "tbMiniLiveRoom")) {
            return null;
        }
        return TBMiniLiveModule.class;
    }
}
