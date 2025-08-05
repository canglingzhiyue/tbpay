package com.taobao.login4android.membercenter.security;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.search.common.util.k;
import tb.kge;

/* loaded from: classes7.dex */
public class SecurityEntranceActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2080445518);
    }

    public static /* synthetic */ Object ipc$super(SecurityEntranceActivity securityEntranceActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        colorDrawable.setAlpha(160);
        getWindow().setBackgroundDrawable(colorDrawable);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        initUrl();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        overridePendingTransition(0, 0);
    }

    private void initUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44775b46", new Object[]{this});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(k.HTTPS_PREFIX);
            if (DataProviderFactory.getDataProvider().getEnvType() == LoginEnvType.ONLINE.getSdkEnvType()) {
                sb.append("market.m.taobao.com");
            } else if (DataProviderFactory.getDataProvider().getEnvType() == LoginEnvType.PRE.getSdkEnvType()) {
                sb.append("market.wapa.taobao.com");
            } else {
                sb.append("market.waptest.taobao.com");
            }
            boolean isInABTestRegion = LoginSwitch.isInABTestRegion(LoginSwitch.SECURITY_SETTING_USE_H5_PERCENT, 10000);
            sb.append("/app/vip/member4weex/pages/account_securty?wh_weex=");
            sb.append(isInABTestRegion ? "false" : "true");
            NavUtil.navTo(this, LoginSwitch.getConfig(LoginSwitch.SECURITY_SETTING_URL, sb.toString()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }
}
