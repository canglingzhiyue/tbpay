package com.taobao.android.purchase.aura.utils;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.qrcode.data.QrCodeData;
import tb.bbh;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static TBLocationDTO f14753a;
    private static long b;

    public static /* synthetic */ TBLocationDTO a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("f9c29fee", new Object[]{tBLocationDTO});
        }
        f14753a = tBLocationDTO;
        return tBLocationDTO;
    }

    static {
        kge.a(1927764591);
        f14753a = null;
        b = 0L;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b < QrCodeData.QR_CODE_VALID_PERIOD) {
            return true;
        }
        b = currentTimeMillis;
        return false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (c()) {
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.aura.utils.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TBLocationDTO b2 = TBLocationClient.b();
                    if (b2 == null) {
                        return;
                    }
                    c.a(b2);
                }
            });
        }
    }

    public static String b() {
        TBLocationDTO b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        a();
        if (f14753a == null && (b2 = TBLocationClient.b()) != null) {
            f14753a = b2;
        }
        JSONObject jSONObject = new JSONObject();
        TBLocationDTO tBLocationDTO = f14753a;
        if (tBLocationDTO != null) {
            jSONObject.put(DispatchConstants.LONGTITUDE, (Object) tBLocationDTO.longitude);
            jSONObject.put(DispatchConstants.LATITUDE, (Object) f14753a.latitude);
            jSONObject.put("provinceDivisionCode", (Object) f14753a.provinceCode);
            jSONObject.put("cityDivisionCode", (Object) f14753a.cityCode);
            jSONObject.put("areaDivisionCode", (Object) f14753a.areaCode);
        }
        return jSONObject.toJSONString();
    }
}
