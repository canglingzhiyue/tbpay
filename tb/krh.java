package tb;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.qrcode.data.QrCodeData;
import com.taobao.runtimepermission.d;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class krh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f30274a;
    private static long b;
    private static long c;
    private static volatile boolean d;
    private static volatile WeakReference<Looper> e;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f30277a;
        public String b;

        static {
            kge.a(-1533907732);
        }
    }

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

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : d;
    }

    public static /* synthetic */ a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2d0766fe", new Object[0]) : f30274a;
    }

    static {
        kge.a(-1005173331);
        b = 0L;
        c = QrCodeData.QR_CODE_VALID_PERIOD;
        d = false;
        a aVar = new a();
        f30274a = aVar;
        aVar.f30277a = "0";
        f30274a.b = "0";
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("694bd3c0", new Object[0]);
        }
        Application a2 = f.a();
        a aVar = new a();
        aVar.b = f30274a.b;
        aVar.f30277a = f30274a.f30277a;
        if (b(a2)) {
            a(a2);
        }
        return aVar;
    }

    private static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
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
                    i.a("LocationUtils", "15 min looper.quit() error", th);
                }
            }
        }
        bf.a(new Runnable() { // from class: tb.krh.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                String str;
                String str2 = "0";
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    TBLocationDTO b2 = TBLocationClient.b();
                    if (b2 != null || krh.b()) {
                        str = !TextUtils.isEmpty(b2.getLongitude()) ? b2.getLongitude() : str2;
                        try {
                            if (!TextUtils.isEmpty(b2.getLatitude())) {
                                str2 = b2.getLatitude();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i.a("LocationUtils", "", th);
                            krh.c().f30277a = str;
                            krh.c().b = str2;
                        }
                    } else {
                        TBLocationClient a2 = TBLocationClient.a(context);
                        TBLocationOption tBLocationOption = new TBLocationOption();
                        Looper.prepare();
                        final Looper myLooper = Looper.myLooper();
                        krh.a(true);
                        krh.a(new WeakReference(myLooper));
                        a2.a(tBLocationOption, new com.taobao.location.client.a() { // from class: tb.krh.9.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.location.client.a
                            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                                    return;
                                }
                                try {
                                    krh.a(false);
                                    krh.a((WeakReference) null);
                                    myLooper.quit();
                                } catch (Throwable th3) {
                                    i.a("LocationUtils", "looper.quit() error", th3);
                                }
                                if (tBLocationDTO != null && tBLocationDTO.isNavSuccess()) {
                                    krh.a(0L);
                                } else if (tBLocationDTO == null) {
                                } else {
                                    i.a("LocationUtils", "地理位置获取错误");
                                }
                            }
                        }, myLooper);
                        Looper.loop();
                        str = str2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = str2;
                }
                krh.c().f30277a = str;
                krh.c().b = str2;
            }
        });
    }

    private static boolean b(Context context) {
        d a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : (context == null || (a2 = com.taobao.runtimepermission.f.a(context, "TB_SHOPPING_PROCESS", new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION})) == null || a2.b == null || a2.b.length <= 0 || a2.b[0] != 0) ? false : true;
    }
}
