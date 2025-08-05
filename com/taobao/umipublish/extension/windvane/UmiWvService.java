package com.taobao.umipublish.extension.windvane;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class UmiWvService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1914999580);
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
    public Class<? extends e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(UmiWvPlugin.PLUGIN_NAME)) {
            return UmiWvPlugin.class;
        }
        if (str.equals(UmiResourceDownloadBridge.PLUGIN_NAME)) {
            return UmiResourceDownloadBridge.class;
        }
        if (!str.equals(UmiPublishAbilityPlugin.PLUGIN_NAME)) {
            return null;
        }
        return UmiPublishAbilityPlugin.class;
    }
}
