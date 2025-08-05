package com.amap.api.location;

import android.content.Context;
import android.os.Handler;
import com.loc.fr;
import com.loc.o;

/* loaded from: classes3.dex */
public class UmidtokenInfo {
    private static AMapLocationClient d;

    /* renamed from: a  reason: collision with root package name */
    static Handler f6392a = new Handler();
    static String b = null;
    private static long e = 30000;
    static boolean c = true;

    /* loaded from: classes3.dex */
    static class a implements AMapLocationListener {
        a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            try {
                if (UmidtokenInfo.d == null) {
                    return;
                }
                UmidtokenInfo.f6392a.removeCallbacksAndMessages(null);
                UmidtokenInfo.d.onDestroy();
            } catch (Throwable th) {
                fr.a(th, "UmidListener", "onLocationChanged");
            }
        }
    }

    public static String getUmidtoken() {
        return b;
    }

    public static void setLocAble(boolean z) {
        c = z;
    }

    public static synchronized void setUmidtoken(Context context, String str) {
        synchronized (UmidtokenInfo.class) {
            try {
                b = str;
                o.a(str);
                if (d == null && c) {
                    a aVar = new a();
                    d = new AMapLocationClient(context);
                    AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
                    aMapLocationClientOption.setOnceLocation(true);
                    aMapLocationClientOption.setNeedAddress(false);
                    d.setLocationOption(aMapLocationClientOption);
                    d.setLocationListener(aVar);
                    d.startLocation();
                    f6392a.postDelayed(new Runnable() { // from class: com.amap.api.location.UmidtokenInfo.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (UmidtokenInfo.d == null) {
                                    return;
                                }
                                UmidtokenInfo.d.onDestroy();
                            } catch (Throwable th) {
                                fr.a(th, "UmidListener", "postDelayed");
                            }
                        }
                    }, 30000L);
                }
            } catch (Throwable th) {
                fr.a(th, "UmidListener", "setUmidtoken");
            }
        }
    }
}
