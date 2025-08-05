package com.etao.feimagesearch;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.a;
import tb.cox;
import tb.cpe;
import tb.kge;

/* loaded from: classes3.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-494720113);
    }

    public static void a(String str, CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e12594", new Object[]{str, captureManager});
        } else {
            captureManager.b(cpe.a.a(str));
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : cpe.a.a(str) != cpe.a.a(str2);
    }

    public static boolean a(String str, boolean z, CaptureManager captureManager, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb523b2", new Object[]{str, new Boolean(z), captureManager, str2})).booleanValue();
        }
        int a2 = cpe.a.a(str);
        if (!z && captureManager.p() == a2) {
            return true;
        }
        if (a2 == 0) {
            cox.a(a.f6987a, "clickScanTab", "pssource", str2);
        } else if (a2 == 1) {
            cox.a(a.f6987a, "clickPhotoSearchTab", "pssource", str2);
        } else if (a2 == 2) {
            cox.a(a.f6987a, "clickMarketingTab", "pssource", str2);
        }
        return false;
    }
}
