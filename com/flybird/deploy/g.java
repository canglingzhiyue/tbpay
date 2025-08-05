package com.flybird.deploy;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;
import java.util.concurrent.Callable;
import tb.drl;
import tb.drm;
import tb.dyv;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f7213a = false;

    public static synchronized void a() {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (f7213a) {
            } else {
                drm.a(new drl("App:PackageInfo", new dyv(), new Callable<PackageInfo>() { // from class: com.flybird.deploy.g.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, android.content.pm.PackageInfo] */
                    @Override // java.util.concurrent.Callable
                    public PackageInfo call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        Context context = AppContextHolder.f7228a;
                        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    }
                }));
                f7213a = true;
            }
        }
    }
}
