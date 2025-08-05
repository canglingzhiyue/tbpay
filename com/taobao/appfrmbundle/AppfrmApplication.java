package com.taobao.appfrmbundle;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appfrmbundle.mkt.MKTHandler;
import com.taobao.tao.Globals;

/* loaded from: classes6.dex */
public class AppfrmApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Appfrm";

    public static /* synthetic */ Object ipc$super(AppfrmApplication appfrmApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        System.setProperty("rx.scheduler.jdk6.purge-frequency-millis", "30000");
        System.setProperty("rx.ring-buffer.size", "300");
        int availableProcessors = Runtime.getRuntime().availableProcessors() / 2;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (availableProcessors < 2) {
            availableProcessors = 2;
        }
        sb.append(availableProcessors);
        System.setProperty("rx.scheduler.max-computation-threads", sb.toString());
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        MKTHandler.a().a(Globals.getApplication());
    }
}
