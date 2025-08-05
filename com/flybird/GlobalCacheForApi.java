package com.flybird;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird._FBDocumentInitializer;
import com.flybird.support.basics.AppContextHolder;
import com.taobao.android.weex_framework.util.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import tb.drl;
import tb.drm;
import tb.dvy;
import tb.dyv;
import tb.hiv;
import tb.ied;

/* loaded from: classes4.dex */
public class GlobalCacheForApi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f7196a = false;

    public static synchronized void a() {
        synchronized (GlobalCacheForApi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (f7196a) {
            } else {
                drm.a(new drl("Conf:CtxDisplayMetrics", new dvy(AppContextHolder.f7228a), new Callable<DisplayMetrics>() { // from class: com.flybird.GlobalCacheForApi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, android.util.DisplayMetrics] */
                    @Override // java.util.concurrent.Callable
                    public DisplayMetrics call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        Context context = AppContextHolder.f7228a;
                        try {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            Display defaultDisplay = ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay();
                            defaultDisplay.getRealMetrics(displayMetrics);
                            if (displayMetrics.heightPixels * 9 > (displayMetrics.widthPixels << 4)) {
                                return displayMetrics;
                            }
                            defaultDisplay.getMetrics(displayMetrics);
                            return displayMetrics;
                        } catch (Throwable unused) {
                            return context.getResources().getDisplayMetrics();
                        }
                    }
                }));
                drm.a(new drl("Conf:DefDisplayMetrics", new dvy(AppContextHolder.f7228a), new Callable<DisplayMetrics>() { // from class: com.flybird.GlobalCacheForApi.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, android.util.DisplayMetrics] */
                    @Override // java.util.concurrent.Callable
                    public DisplayMetrics call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        Context context = AppContextHolder.f7228a;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
                        return displayMetrics;
                    }
                }));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                drm.a(new drl("Timed:ActiveNetworkInfo", new hiv(10L, timeUnit), new Callable<NetworkInfo>() { // from class: com.flybird.GlobalCacheForApi.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v5, types: [android.net.NetworkInfo, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public NetworkInfo call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : ((ConnectivityManager) AppContextHolder.f7228a.getSystemService("connectivity")).getActiveNetworkInfo();
                    }
                }));
                drm.a(new drl("App:RpcEnv", new dyv(), new Callable<Integer>() { // from class: com.flybird.GlobalCacheForApi.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Integer] */
                    @Override // java.util.concurrent.Callable
                    public Integer call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        String str = Platform.f5257a;
                        return 0;
                    }
                }));
                drm.a(new drl("Timed:EngineDocSwitches", new hiv(120L, timeUnit), new Callable<_FBDocumentInitializer.CachingModel>() { // from class: com.flybird.GlobalCacheForApi.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.flybird._FBDocumentInitializer$CachingModel] */
                    @Override // java.util.concurrent.Callable
                    public _FBDocumentInitializer.CachingModel call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        String str = Platform.f5257a;
                        _FBDocumentInitializer.CachingModel cachingModel = new _FBDocumentInitializer.CachingModel();
                        cachingModel.f7200a = true;
                        cachingModel.b = true;
                        cachingModel.d = true;
                        cachingModel.e = true;
                        cachingModel.f = true;
                        cachingModel.g = true;
                        cachingModel.h = true;
                        cachingModel.i = true;
                        float f = FBDocumentAssistor.f7139a;
                        Integer num = (Integer) drm.b("Timed:GlobalPerfRatio");
                        cachingModel.j = num != null ? num.intValue() : 0;
                        boolean[] zArr = {cachingModel.f7200a, cachingModel.d, cachingModel.e, false, cachingModel.f, cachingModel.g, cachingModel.h, cachingModel.i};
                        int i = ied.f28960a;
                        long j = 0;
                        for (int i2 = 0; i2 < 8 && i2 < 16; i2++) {
                            if (zArr[i2]) {
                                j |= 1 << i2;
                            }
                        }
                        cachingModel.k = String.valueOf(j);
                        return cachingModel;
                    }
                }));
                drm.a(new drl("App:PackageInfo", new dyv(), new Callable<PackageInfo>() { // from class: com.flybird.GlobalCacheForApi.6
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
                drm.a(new drl("User:UserInfoId", new hiv(10L, timeUnit), $$Lambda$DWw1X2mf0rF4XOQwHoPxZKSuZ0.INSTANCE));
                drm.a(new drl("App:TalkbackEnabled", new hiv(10L, timeUnit), $$Lambda$yztIxu9g1huRVyAgnYqJSTQvd_s.INSTANCE));
                drm.a(new drl("App:OlderVersionEnabled", new hiv(10L, timeUnit), $$Lambda$R7uwvUX2g3vztBotQpy27FODHI.INSTANCE));
                drm.a(new drl("App:ApLang", new hiv(10L, timeUnit), $$Lambda$4fEs2VT2aH6f72PRCdfzDIpLj4.INSTANCE));
                drm.a(new drl("App:ServerTime", new hiv(10L, timeUnit), $$Lambda$NKCUpXXTcMuqXvrvMs8WAna_b7A.INSTANCE));
                drm.a(new drl("User:UtdidOrEquiv", new dyv(), $$Lambda$TsbQMZFpMT0AbSWnsKqRDB8kw5g.INSTANCE));
                drm.a(new drl("Timed:ApsecTokenResult", new hiv(120L, timeUnit), $$Lambda$A1tRUav0W6fukCKippI9OmTa334.INSTANCE));
                f7196a = true;
            }
        }
    }
}
