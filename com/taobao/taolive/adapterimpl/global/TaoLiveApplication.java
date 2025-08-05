package com.taobao.taolive.adapterimpl.global;

import android.app.Application;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appfrmbundle.mkt.MKTHandler;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.taolive.room.H5EmbedView;
import com.taobao.taolive.room.H5EmbedWVPlugin;
import com.taobao.taolive.room.mediaplatform.container.h5.TBLiveGoodsWVPlugin;
import com.taobao.taolive.room.mediaplatform.h;
import com.taobao.taolive.room.openarchitecture.openh5.TaoliveOpenH5PlatformView;
import java.io.Serializable;
import tb.kge;
import tb.ozt;
import tb.pbq;
import tb.pbt;
import tb.plo;

/* loaded from: classes8.dex */
public class TaoLiveApplication extends Application implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;

    public static /* synthetic */ Object ipc$super(TaoLiveApplication taoLiveApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1928511898);
        kge.a(1028243835);
        TAG = TaoLiveApplication.class.getSimpleName();
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        init(Globals.getApplication());
    }

    public static void init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        new TaoApplication().onCreate(application);
        MKTHandler.a().a(application);
        ozt.a();
        plo.a();
        q.a("TaoLiveH5EmbedWVPlugin", (Class<? extends e>) H5EmbedWVPlugin.class, true);
        android.taobao.windvane.embed.a.a(H5EmbedView.VIEW_TYPE, (Class<? extends BaseEmbedView>) H5EmbedView.class, true);
        android.taobao.windvane.embed.a.a(TaoliveOpenH5PlatformView.ViewType, (Class<? extends BaseEmbedView>) TaoliveOpenH5PlatformView.class, true);
        q.a("TBLiveGoodsWVPlugin", (Class<? extends e>) TBLiveGoodsWVPlugin.class, true);
        pbq pbqVar = new pbq();
        pbqVar.a(h.a(application));
        pbqVar.b(h.b(application));
        pbt.a().a(pbqVar);
        com.taobao.taolive.sdk.monitor.b.b().a(com.taobao.application.common.c.b());
        Log.e("TaoLiveApplication", "application init time = " + (System.currentTimeMillis() - currentTimeMillis));
    }

    private static void startInstallLiveHome(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7cd4", new Object[]{application});
        } else {
            com.taobao.taolive.sdk.morelive.e.a().a(application);
        }
    }
}
