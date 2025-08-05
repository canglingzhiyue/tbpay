package com.taobao.android.order.core.dinamicX.view.barcode;

import android.content.Context;
import android.graphics.Bitmap;
import com.alipay.ma.encode.InputParameters.Gen0InputParameters;
import com.alipay.ma.encode.api.MaEncodeAPI;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.iaa;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(370463449);
    }

    public static Bitmap a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5eec20f0", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(EncodeHintType.MARGIN, 0);
            a a2 = new c().a(str, BarcodeFormat.CODE_128, i, i2, hashMap);
            int a3 = a2.a();
            int b = a2.b();
            int[] iArr = new int[a3 * b];
            for (int i3 = 0; i3 < b; i3++) {
                int i4 = i3 * a3;
                for (int i5 = 0; i5 < a3; i5++) {
                    iArr[i4 + i5] = a2.a(i5, i3) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(a3, b, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, a3, 0, 0, a3, b);
            return createBitmap;
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalArgumentException e2) {
            iaa.a((Context) null, "MaEncode", e2.toString(), (Map<String, String>) null);
            return null;
        }
    }

    public static Bitmap b(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5e75baf1", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        try {
            Gen0InputParameters gen0InputParameters = new Gen0InputParameters(i, str);
            gen0InputParameters.errorCorrectionLevel = 'H';
            return MaEncodeAPI.encodeMa2(gen0InputParameters);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
