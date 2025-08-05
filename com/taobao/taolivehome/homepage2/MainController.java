package com.taobao.taolivehome.homepage2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.d;
import com.taobao.live.home.dinamic.sdk.DinamicSdkManager;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import tb.mfj;

/* loaded from: classes8.dex */
public final class MainController implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f22059a = 31;
    public static String b = "taolivehome";
    public static String c = "live_channel";
    private static AtomicInteger d = new AtomicInteger(0);

    public static void initializerPreload(DinamicSdkManager.IDinamicRegister iDinamicRegister) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e1d073", new Object[]{iDinamicRegister});
        }
    }

    public static void a(DinamicSdkManager.IDinamicRegister iDinamicRegister) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d4a19", new Object[]{iDinamicRegister});
            return;
        }
        mfj.a("MainController", "initializer");
        if (d.compareAndSet(0, 1)) {
            mfj.a("MainController", "initializer start");
            LiveHomeController.a().a(new d());
            LiveHomeController.a().a(1);
            DinamicSdkManager dinamicSdkManager = new DinamicSdkManager(f.z().getDXBizType(), f22059a, b);
            dinamicSdkManager.a(iDinamicRegister);
            LiveHomeController.a().a(dinamicSdkManager);
            return;
        }
        d.getAndIncrement();
    }

    public static void destroy4LiveHomeOnCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8d48e7", new Object[0]);
            return;
        }
        LiveHomeController.a().b();
        d = new AtomicInteger(0);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        mfj.a("MainController", "unInitializer");
        if (d.compareAndSet(1, 0)) {
            LiveHomeController.a().b();
        } else if (d.get() <= 0) {
        } else {
            d.getAndDecrement();
        }
    }
}
