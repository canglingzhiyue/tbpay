package com.taobao.taolive.launcherx;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.media.MediaConstant;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.sdk.utils.q;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoLiveIdleTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaoLiveIdleTask";

    static {
        kge.a(-1512456484);
        kge.a(1028243835);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, TAG, "init");
        q.b(TAG, "init");
        e.a().a(e.TAOLIVE_HOMEPAGE, false, application);
        e.a().a(e.ATYPE, false, application);
        e.a().a(e.BTYPE, false, application);
        com.taobao.taolive.sdk.morelive.e.a().a(application);
        a.a();
        a.b(application);
        a.a(application);
        TLog.loge(MediaConstant.LBLIVE_SOURCE, TAG, "dx preload success");
        TaoLiveLaunchInitializer.init();
        TLog.loge(MediaConstant.LBLIVE_SOURCE, TAG, "live init success");
    }
}
