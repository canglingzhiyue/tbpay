package com.alibaba.triver.triver_shop.extension;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.triver.app.TriverLoadingController;
import com.alibaba.triver.kit.api.utils.TRiverUrlUtils;
import com.alibaba.triver.kit.api.utils.m;
import com.alibaba.triver.miniapp.downgrade.c;
import com.alibaba.triver.point.InterceptShowErrorPoint;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class ShopInterceptErrorExtension implements InterceptShowErrorPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2068649163);
        kge.a(-1723089934);
    }

    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    public boolean interceptLaunchError(final App app, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dc82127", new Object[]{this, app, str, str2, map})).booleanValue();
        }
        if (app == null) {
            return false;
        }
        String i = m.i(app);
        if (!StringUtils.isEmpty(i)) {
            ExtensionPoint.as(TriverLoadingController.DowngradePoint.class).node(app).create().downgradeTo(i);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alibaba.triver.triver_shop.extension.ShopInterceptErrorExtension.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    App app2 = app;
                    if (app2 == null || app2.isDestroyed()) {
                        return;
                    }
                    app.exit();
                }
            }, 500L);
            return true;
        } else if (TRiverUrlUtils.n(app) || !TRiverUrlUtils.i(app)) {
            return false;
        } else {
            c.a(app, (String) null);
            return true;
        }
    }
}
