package com.taobao.android.detail.provider;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.detail.protocol.adapter.optional.d;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.qrcode.data.QrCodeData;
import tb.eva;
import tb.kge;

/* loaded from: classes4.dex */
public class e implements com.taobao.android.detail.protocol.adapter.optional.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d.a f10214a;
    private static long b;
    private static long c;

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        b = j;
        return j;
    }

    public static /* synthetic */ d.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.a) ipChange.ipc$dispatch("7a34977b", new Object[0]) : f10214a;
    }

    static {
        kge.a(-76175993);
        kge.a(397937332);
        b = 0L;
        c = QrCodeData.QR_CODE_VALID_PERIOD;
        d.a aVar = new d.a();
        f10214a = aVar;
        aVar.f10211a = "0";
        f10214a.b = "0";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.detail.provider.e$1] */
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
        new AsyncTask<Void, Void, Void>() { // from class: com.taobao.android.detail.provider.e.1
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
                    if (b2 == null) {
                        TBLocationClient a2 = TBLocationClient.a(context);
                        TBLocationOption tBLocationOption = new TBLocationOption();
                        Looper.prepare();
                        a2.a(tBLocationOption, new com.taobao.location.client.a() { // from class: com.taobao.android.detail.provider.e.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.location.client.a
                            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                                } else if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess()) {
                                } else {
                                    e.a(0L);
                                }
                            }
                        }, (Looper) null);
                        Looper.loop();
                        str = str2;
                    } else {
                        str = !StringUtils.isEmpty(b2.getLongitude()) ? b2.getLongitude() : str2;
                        try {
                            if (!StringUtils.isEmpty(b2.getLatitude())) {
                                str2 = b2.getLatitude();
                            }
                        } catch (Throwable th) {
                            th = th;
                            eva.b("LocationStore", th.getMessage());
                            eva.b("LocationStore", String.format("longitude=%s, latitude=%s", str, str2));
                            e.a().f10211a = str;
                            e.a().b = str2;
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = str2;
                }
                eva.b("LocationStore", String.format("longitude=%s, latitude=%s", str, str2));
                e.a().f10211a = str;
                e.a().b = str2;
                return null;
            }
        }.execute(new Void[0]);
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.d
    public d.a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d.a) ipChange.ipc$dispatch("7efd4773", new Object[]{this, context});
        }
        d.a aVar = new d.a();
        aVar.b = f10214a.b;
        aVar.f10211a = f10214a.f10211a;
        if (b()) {
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue() : (context == null || (a2 = com.taobao.runtimepermission.f.a(context, "TB_SHOPPING_PROCESS", new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION})) == null || a2.b == null || a2.b.length <= 0 || a2.b[0] != 0) ? false : true;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        return Boolean.parseBoolean(a2.a("android_detail", "using_tb_location_permission", "true"));
    }
}
