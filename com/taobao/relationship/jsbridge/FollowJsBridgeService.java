package com.taobao.relationship.jsbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.relationship.application.RelationshipApplication;
import com.taobao.tao.TaobaoApplication;
import tb.kge;

/* loaded from: classes7.dex */
public class FollowJsBridgeService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1524119943);
        kge.a(-1332442189);
    }

    public static /* synthetic */ Object ipc$super(FollowJsBridgeService followJsBridgeService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    public FollowJsBridgeService() {
        ApplicationInvoker.getInstance("com.taobao.relationship").invoke("com.taobao.relationship.application.RelationshipApplication", TaobaoApplication.sApplication);
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        RelationshipApplication.init();
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
        if (TextUtils.equals(AllSparkFollowJsBridge.PAGE, str)) {
            return AllSparkFollowJsBridge.class;
        }
        if (!TextUtils.equals(AllSparkFollowJsBridgeV3.PAGE, str)) {
            return null;
        }
        return AllSparkFollowJsBridgeV3.class;
    }
}
