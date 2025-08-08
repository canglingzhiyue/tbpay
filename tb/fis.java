package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.qrcode.data.QrCodeData;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class fis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f27979a;
    private static long b;
    private static long c;
    private static volatile boolean d;
    private static volatile WeakReference<Looper> e;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27981a;
        public String b;
        public String c;

        static {
            kge.a(-1576643491);
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

    public static /* synthetic */ a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("42278ed0", new Object[0]) : f27979a;
    }

    static {
        kge.a(-374863076);
        b = 0L;
        c = QrCodeData.QR_CODE_VALID_PERIOD;
        d = false;
        a aVar = new a();
        f27979a = aVar;
        aVar.f27981a = "0";
        a aVar2 = f27979a;
        aVar2.b = "0";
        aVar2.c = "0";
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [tb.fis$1] */
    private static void b(Context context) {
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
                    fjt.a("LocationStore", "15 min looper.quit() error", th);
                }
            }
        }
        new AsyncTask<Void, Void, Void>() { // from class: tb.fis.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                String str;
                String str2;
                String str3 = "0";
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                try {
                    TBLocationDTO b2 = TBLocationClient.b();
                    if (b2 == null && !fis.a()) {
                        TBLocationClient a2 = TBLocationClient.a(com.taobao.tao.navigation.a.b());
                        TBLocationOption tBLocationOption = new TBLocationOption();
                        Looper.prepare();
                        final Looper myLooper = Looper.myLooper();
                        fis.a(true);
                        fis.a(new WeakReference(myLooper));
                        a2.a(tBLocationOption, new com.taobao.location.client.a() { // from class: tb.fis.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.location.client.a
                            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                                    return;
                                }
                                fjt.a("LocationStore", "onLocationChanged");
                                try {
                                    fis.a(false);
                                    fis.a((WeakReference) null);
                                    myLooper.quit();
                                } catch (Throwable th2) {
                                    fjt.a("LocationStore", "looper.quit() error", th2);
                                }
                                if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess()) {
                                    return;
                                }
                                fis.a(0L);
                            }
                        }, myLooper);
                        Looper.loop();
                        fjt.a("LocationStore", "afterloop");
                        str = str3;
                        str2 = str;
                    } else {
                        str = !StringUtils.isEmpty(b2.getLongitude()) ? b2.getLongitude() : str3;
                        try {
                            str2 = !StringUtils.isEmpty(b2.getLatitude()) ? b2.getLatitude() : str3;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                        }
                        try {
                            if (!StringUtils.isEmpty(b2.cityCode)) {
                                str3 = b2.cityCode;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fjt.a("LocationStore", "", th);
                            fjt.a("LocationStore", String.format("longitude=%s, latitude=%s", str, str2));
                            fis.b().f27981a = str;
                            fis.b().b = str2;
                            fis.b().c = str3;
                            return null;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str = str3;
                    str2 = str;
                }
                fjt.a("LocationStore", String.format("longitude=%s, latitude=%s", str, str2));
                fis.b().f27981a = str;
                fis.b().b = str2;
                fis.b().c = str3;
                return null;
            }
        }.execute(new Void[0]);
    }

    public a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("10e44439", new Object[]{this, context});
        }
        a aVar = new a();
        aVar.b = f27979a.b;
        aVar.f27981a = f27979a.f27981a;
        aVar.c = f27979a.c;
        b(context);
        return aVar;
    }
}
