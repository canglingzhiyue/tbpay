package com.taobao.login4android;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.service.ABService;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.ab.ABDefault;
import tb.jqm;
import tb.kge;

/* loaded from: classes7.dex */
public class ABHelper implements ABService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String TAG = "Login.ab";

    static {
        kge.a(-223395667);
        kge.a(-1157778350);
    }

    @Override // com.ali.user.mobile.service.ABService
    public int getStrategyValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c16e8c", new Object[]{this, str})).intValue();
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if ("uninstall".equals(str)) {
            if (jqm.a() && DataProviderFactory.getDataProvider().getEnvType() == 2) {
                return 2;
            }
            return ABDefault.getValue("restoreSession");
        } else if ("oppo_finger".equals(str)) {
            return ABDefault.getValue(ALBiometricsActivityParentView.p);
        } else {
            if ("reinstall_login".equals(str)) {
                return ABDefault.getValue("blo");
            }
            return 0;
        }
    }
}
