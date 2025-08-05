package com.alipay.module.face;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.RPVerify;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.module.face.helper.AliFaceCertHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;

/* loaded from: classes3.dex */
public class AliFaceCertModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6107a = "AliFaceCertModule";
    public AliFaceCertHelper aliFaceCertHelper;

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        String str4 = f6107a;
        VerifyLogCat.d(str4, i.b.MEASURE_ONCREATE + getModuleName());
        this.aliFaceCertHelper = new AliFaceCertHelper(this, str, str2, str3, bundle);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        String str = f6107a;
        VerifyLogCat.d(str, "onStart" + getModuleName());
        AliFaceCertHelper aliFaceCertHelper = this.aliFaceCertHelper;
        VerifyLogCat.d("AliFaceCertHelper", "AliFaceCertHelper onStart");
        if (TextUtils.isEmpty(aliFaceCertHelper.c)) {
            VerifyLogCat.w("AliFaceCertHelper", "mModuleData is empty");
            MicroModuleContext.getInstance().notifyAndFinishModule(aliFaceCertHelper.f6110a, aliFaceCertHelper.b, aliFaceCertHelper.d.getModuleName(), new DefaultModuleResult("2002"));
            return;
        }
        String string = JSON.parseObject(aliFaceCertHelper.c).getString(BaseJsExecutor.NAME_VERIFY_TOKEN);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        VerifyLogCat.i("AliFaceCertHelper", "本次走集团人脸, aliface:" + string);
        AliFaceCertHelper.a("UC-MobileIC-180108-1", aliFaceCertHelper.f6110a, "", "", "");
        aliFaceCertHelper.f = SystemClock.elapsedRealtime();
        RPVerify.start(MicroModuleContext.getInstance().getContext(), string, aliFaceCertHelper.g);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        String str = f6107a;
        VerifyLogCat.d(str, MessageID.onDestroy + getModuleName());
    }
}
