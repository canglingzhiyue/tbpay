package com.etao.feimagesearch.capture.scan;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import java.util.HashMap;
import tb.cof;
import tb.cot;
import tb.cpe;
import tb.cpt;
import tb.kge;

/* loaded from: classes3.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-352603618);
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        cpt a2 = cpe.a(activity);
        if (a2 == null) {
            cot.b("ScanBizUtil", "baseCaptureController is null, it must something wrong");
            return false;
        }
        return a2.p();
    }

    public static HashMap<String, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5d70dbdf", new Object[]{str, str2});
        }
        HashMap<String, String> hashMap = new HashMap<>(10);
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("spm", str);
        }
        hashMap.put("rainbow", cof.a());
        hashMap.put(p.KEY_DEVICE_TYPE, p.a());
        if (!StringUtils.isEmpty(str2)) {
            hashMap.put("pssource", str2);
        }
        return hashMap;
    }

    public static long b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366f", new Object[]{activity})).longValue();
        }
        if (!a(activity)) {
            return 0L;
        }
        return com.etao.feimagesearch.config.b.G();
    }
}
