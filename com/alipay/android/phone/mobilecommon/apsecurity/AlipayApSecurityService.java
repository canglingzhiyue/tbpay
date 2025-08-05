package com.alipay.android.phone.mobilecommon.apsecurity;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayApSecurityService extends ApSecurityService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c = null;
    private String d = "face_get_apdidtoken_failed";

    @Override // com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            BioLog.i("ZolozApSecurityService init");
        }
    }

    @Override // com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService
    public String getApDidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc416e5a", new Object[]{this});
        }
        try {
            this.c = APSecuritySdk.getInstance(this.f5818a).getApdidToken();
        } catch (Throwable th) {
            BioLog.w("APSecuritySdk.getInstance() GOT EXCEPTION!", th);
        }
        String str = this.c;
        if (str == null) {
            str = this.d;
        }
        BioLog.d("ZolozApSecurityService.getApDidToken() == " + str);
        return str;
    }
}
