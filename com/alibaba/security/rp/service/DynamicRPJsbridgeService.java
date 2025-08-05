package com.alibaba.security.rp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.security.realidentity.ui.webview.jsbridge.RP;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DynamicRPJsbridgeService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.equals("RP")) {
            return null;
        }
        return RP.class;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
