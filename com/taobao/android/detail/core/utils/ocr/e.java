package com.taobao.android.detail.core.utils.ocr;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.f;
import java.util.HashMap;
import tb.djt;
import tb.emu;
import tb.enp;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(762816929);
        emu.a("com.taobao.android.detail.core.utils.ocr.OCRTrack");
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!djt.a(context)) {
        } else {
            enp enpVar = new enp(null);
            enpVar.f27473a = new HashMap<>();
            enpVar.f27473a.put("trackId", "2201");
            enpVar.f27473a.put("trackPage", "Page_Detail_Show_Ocr");
            enpVar.f27473a.put("spm", "a2141.7631564.ocr");
            if (b.b()) {
                enpVar.f27473a.put("isAutoOCROpen", "true");
            }
            f.a(context, enpVar);
        }
    }
}
