package com.taobao.relationship.application;

import android.app.Application;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.relationship.jsbridge.AllSparkFollowJsBridge;
import com.taobao.relationship.weex.FollowWeexComponent;
import com.taobao.search.common.util.i;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.flexbox.layoutmanager.actionservice.core.a;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import tb.kge;

/* loaded from: classes7.dex */
public class RelationshipApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean isInit;
    private static Application sApplication;

    public static /* synthetic */ Object ipc$super(RelationshipApplication relationshipApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-194355211);
        isInit = false;
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        new TaoApplication().onCreate(this);
        TLog.logi("FavoriteApplication", i.b.MEASURE_ONCREATE + isInit);
        init();
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (!isInit) {
            init();
        }
        return sApplication;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (isInit) {
        } else {
            sApplication = Globals.getApplication();
            try {
                a.a(sApplication);
                q.a(AllSparkFollowJsBridge.PAGE, (Class<? extends e>) AllSparkFollowJsBridge.class);
                WXSDKEngine.registerComponent("followsdkbutton", FollowWeexComponent.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
            isInit = true;
        }
    }
}
