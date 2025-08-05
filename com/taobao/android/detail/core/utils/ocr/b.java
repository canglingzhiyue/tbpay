package com.taobao.android.detail.core.utils.ocr;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epo;
import tb.kge;
import tb.mxo;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(180977848);
        emu.a("com.taobao.android.detail.core.utils.ocr.DescOCRUtils");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        String a2 = a(mxo.OCR_SWITCH_NAME);
        return !TextUtils.isEmpty(a2) && a2.trim().toLowerCase().equals("true");
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        Application a2 = epo.a();
        if (a2 == null) {
            return null;
        }
        return a2.getSharedPreferences(mxo.JSON_SHAREDPREFERENCES, 0).getString(str, null);
    }
}
