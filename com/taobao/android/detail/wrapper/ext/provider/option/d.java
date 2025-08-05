package com.taobao.android.detail.wrapper.ext.provider.option;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.c;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.qrcode.data.QrCodeData;
import com.taobao.runtimepermission.f;
import java.lang.ref.WeakReference;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class d implements com.taobao.android.detail.datasdk.protocol.adapter.optional.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c.a f11345a;
    private static long b;
    private static long c;
    private static volatile boolean d;
    private static volatile WeakReference<Looper> e;

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        b = j;
        return j;
    }

    public static /* synthetic */ WeakReference a(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("ad2eef04", new Object[]{weakReference});
        }
        e = weakReference;
        return weakReference;
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ c.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("8c373f3c", new Object[0]) : f11345a;
    }

    static {
        kge.a(420119749);
        kge.a(1227153107);
        b = 0L;
        c = QrCodeData.QR_CODE_VALID_PERIOD;
        d = false;
        c.a aVar = new c.a();
        f11345a = aVar;
        aVar.f10067a = "0";
        f11345a.b = "0";
    }

    public d() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.option.TBLocationProvider");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.detail.wrapper.ext.provider.option.d$1] */
    private static void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b < c) {
            return;
        }
        b = currentTimeMillis;
        if (e != null) {
            Looper looper = e.get();
            e = null;
            if (looper != null) {
                try {
                    d = false;
                    looper.quit();
                } catch (Throwable th) {
                    i.a("LocationStore", "15 min looper.quit() error", th);
                }
            }
        }
        new AsyncTask<Void, Void, Void>() { // from class: com.taobao.android.detail.wrapper.ext.provider.option.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                String str;
                String str2 = "0";
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                try {
                    TBLocationDTO b2 = TBLocationClient.b();
                    if (b2 == null && !d.a()) {
                        TBLocationClient a2 = TBLocationClient.a(context);
                        TBLocationOption tBLocationOption = new TBLocationOption();
                        Looper.prepare();
                        final Looper myLooper = Looper.myLooper();
                        d.a(true);
                        d.a(new WeakReference(myLooper));
                        a2.a(tBLocationOption, new com.taobao.location.client.a() { // from class: com.taobao.android.detail.wrapper.ext.provider.option.d.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.location.client.a
                            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                                    return;
                                }
                                try {
                                    d.a(false);
                                    d.a((WeakReference) null);
                                    myLooper.quit();
                                } catch (Throwable th2) {
                                    i.a("LocationStore", "looper.quit() error", th2);
                                }
                                if (tBLocationDTO != null && tBLocationDTO.isNavSuccess()) {
                                    d.a(0L);
                                } else if (tBLocationDTO == null) {
                                } else {
                                    ecg.k(context, String.valueOf(tBLocationDTO.errorCode), "");
                                }
                            }
                        }, myLooper);
                        Looper.loop();
                        str = str2;
                    } else {
                        str = !TextUtils.isEmpty(b2.getLongitude()) ? b2.getLongitude() : str2;
                        try {
                            if (!TextUtils.isEmpty(b2.getLatitude())) {
                                str2 = b2.getLatitude();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i.a("LocationStore", "", th);
                            i.d("LocationStore", String.format("longitude=%s, latitude=%s", str, str2));
                            d.b().f10067a = str;
                            d.b().b = str2;
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = str2;
                }
                i.d("LocationStore", String.format("longitude=%s, latitude=%s", str, str2));
                d.b().f10067a = str;
                d.b().b = str2;
                return null;
            }
        }.execute(new Void[0]);
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.c
    public c.a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("c1dae7b3", new Object[]{this, context});
        }
        c.a aVar = new c.a();
        aVar.b = f11345a.b;
        aVar.f10067a = f11345a.f10067a;
        if (c()) {
            if (c(context)) {
                b(context);
            }
        } else {
            b(context);
        }
        return aVar;
    }

    private boolean c(Context context) {
        com.taobao.runtimepermission.d a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue() : (context == null || (a2 = f.a(context, "TB_SHOPPING_PROCESS", new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION})) == null || a2.b == null || a2.b.length <= 0 || a2.b[0] != 0) ? false : true;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        return Boolean.parseBoolean(a2.a("android_detail", "using_tb_location_permission", "true"));
    }
}
