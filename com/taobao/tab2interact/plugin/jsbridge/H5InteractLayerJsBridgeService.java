package com.taobao.tab2interact.plugin.jsbridge;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class H5InteractLayerJsBridgeService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(1461332287);
        kge.a(-1332442189);
        Companion = new a(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-2129473081);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        Application application = Globals.getApplication();
        if (str == null || application == null || (!q.a((Object) str, (Object) "GGInteractModule"))) {
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayerJsBridgeService", "application为空或name无效");
            return null;
        }
        return H5InteractLayerJsBridge.class;
    }
}
