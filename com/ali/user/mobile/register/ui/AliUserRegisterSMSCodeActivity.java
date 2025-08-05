package com.ali.user.mobile.register.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserRegisterSMSCodeActivity extends AliUserRegisterActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-236786720);
    }

    public static /* synthetic */ Object ipc$super(AliUserRegisterSMSCodeActivity aliUserRegisterSMSCodeActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static Intent getCallingIntent(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("8fcdf196", new Object[]{context, bundle});
        }
        Intent intent = new Intent(context, AliUserRegisterSMSCodeActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterActivity, com.ali.user.mobile.base.ui.BaseActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue() : R.layout.aliuser_activity_container;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterActivity
    public Fragment getMobileRegisterFragment(Intent intent, LoginApprearanceExtensions loginApprearanceExtensions) throws InstantiationException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("8f81e6e4", new Object[]{this, intent, loginApprearanceExtensions}) : new AliUserRegisterSMSVerificationFragment();
    }
}
