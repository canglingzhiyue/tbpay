package com.taobao.wetao.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.flexbox.layoutmanager.save.TBSNSWVSavePlugin;
import com.taobao.wetao.common.module.TBSNSWVPlugin;

/* loaded from: classes9.dex */
public class DynamicJsbridgeService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    public DynamicJsbridgeService() {
        ApplicationInvoker.getInstance("com.taobao.allspark").invoke("com.taobao.allspark.AllSparkApplication", TaobaoApplication.sApplication);
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
        if ("TBSNSWVPlugin".equals(str)) {
            return TBSNSWVPlugin.class;
        }
        if (!"TBSNSWVSave".equals(str)) {
            return null;
        }
        return TBSNSWVSavePlugin.class;
    }
}
