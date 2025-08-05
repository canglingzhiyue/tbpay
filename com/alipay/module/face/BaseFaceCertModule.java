package com.alipay.module.face;

import android.os.Bundle;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.module.face.helper.FaceCertHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;

/* loaded from: classes3.dex */
public class BaseFaceCertModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6108a = "BaseFaceCertModule";
    public FaceCertHelper mFaceCertHelper;

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        String str4 = f6108a;
        VerifyLogCat.d(str4, i.b.MEASURE_ONCREATE + getModuleName());
        this.mFaceCertHelper = new FaceCertHelper(this, str, str2, str3, bundle);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        String str = f6108a;
        VerifyLogCat.d(str, "onStart" + getModuleName());
        this.mFaceCertHelper.a();
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        String str = f6108a;
        VerifyLogCat.d(str, MessageID.onDestroy + getModuleName());
    }
}
