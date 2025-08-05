package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.upload.HttpResponse;
import com.ta.audid.utils.UtdidLogger;
import tb.kge;

/* loaded from: classes4.dex */
public class UtdidResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(661185201);
    }

    public static boolean response(HttpResponse httpResponse) {
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62d8a01c", new Object[]{httpResponse})).booleanValue();
        }
        try {
            str = new String(httpResponse.data, "UTF-8");
        } catch (Exception e) {
            UtdidLogger.d(str, e);
        }
        if (!HttpResponse.checkSignature(str, httpResponse.signature)) {
            return false;
        }
        return a.a(a.a(str).f8151a);
    }
}
