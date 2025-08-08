package com.taobao.android.purchase.aura.external;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.RPVerify;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.arc;
import tb.ard;
import tb.icx;
import tb.kge;

/* loaded from: classes6.dex */
public class TBBuyExternalRPVerifyService implements icx.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String UMBRELLA_BIZ = "ultronTrade";
    private static final String UMBRELLA_FEATURE_TYPE = "umbrella.ultron.submit";
    private static final String UMBRELLA_TAG_ID = "verifyFailure";
    private static final String UMBRELLA_TAG_VERSION = "1.0";
    private static final String VERIFY_CODE_NETWORK_ERROR = "-30";

    static {
        kge.a(890487566);
        kge.a(-1600950959);
    }

    @Override // tb.icx.a
    public void verify(Context context, String str, final icx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce983a6", new Object[]{this, context, str, bVar});
        } else {
            RPVerify.startByNative(context, str, new RPEventListener() { // from class: com.taobao.android.purchase.aura.external.TBBuyExternalRPVerifyService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.security.realidentity.RPEventListener
                public void onFinish(RPResult rPResult, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str2, str3});
                        return;
                    }
                    ard a2 = arc.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("code:");
                    sb.append(StringUtils.isEmpty(str2) ? "" : str2);
                    sb.append(",msg:");
                    if (StringUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                    sb.append(str3);
                    a2.c("TBBuyExternalRPVerifyService", "verify", sb.toString());
                    boolean equals = StringUtils.equals(str2, String.valueOf(RPResult.AUDIT_PASS.code));
                    bVar.a(equals, str2, b.a(equals ? R.string.purchase_taobao_app_1029_1_19080 : StringUtils.equals(TBBuyExternalRPVerifyService.VERIFY_CODE_NETWORK_ERROR, str2) ? R.string.purchase_taobao_app_1029_1_19067 : R.string.purchase_taobao_app_1029_1_19079));
                }
            });
        }
    }
}
