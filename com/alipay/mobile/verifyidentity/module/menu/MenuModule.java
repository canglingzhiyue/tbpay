package com.alipay.mobile.verifyidentity.module.menu;

import android.content.Intent;
import android.os.Bundle;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.menu.ui.MenuActivity;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MenuModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String ModuleData = "moduleData";

    /* renamed from: a  reason: collision with root package name */
    private static final String f5913a = "MenuModule";
    private Bundle b;
    private boolean c;

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        VerifyLogCat.d(f5913a, "MenuModule onCreate");
        if (bundle != null) {
            this.c = bundle.getBoolean(PayPwdModule.IS_IPAY, false);
            String str4 = f5913a;
            VerifyLogCat.i(str4, "isPay:" + this.c);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.b = bundle;
        this.b.putString(ModuleData, str3);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5913a, "MenuModule onStart");
        Intent intent = new Intent(getMicroModuleContext().getContext(), MenuActivity.class);
        intent.putExtras(this.b);
        intent.putExtra(PayPwdModule.IS_IPAY, this.c);
        getMicroModuleContext().startActivity(this, intent);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            VerifyLogCat.d(f5913a, "MenuModule onDestroy");
        }
    }
}
