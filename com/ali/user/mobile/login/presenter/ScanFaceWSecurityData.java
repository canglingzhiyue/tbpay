package com.ali.user.mobile.login.presenter;

import android.os.Build;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class ScanFaceWSecurityData extends WSecurityData {
    public String deviceBrand = Build.BRAND;
    public String deviceModel = Build.MODEL;
    public String deviceName = Build.BRAND + riy.BRACKET_START_STR + Build.MODEL + riy.BRACKET_END_STR;
    public ExtRiskData extRiskData;

    static {
        kge.a(-1632171598);
    }
}
