package com.ali.user.open.ucc.alipay3;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.OauthService;
import com.ali.user.open.ucc.base.BaseUccServiceProvider;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class AlipayUccServiceProviderImpl extends BaseUccServiceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AlipayUccServiceProviderImpl";

    static {
        kge.a(1126982363);
    }

    @Override // com.ali.user.open.ucc.base.BaseUccServiceProvider
    public boolean isAuthByNative(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4750fede", new Object[]{this, context, str, map})).booleanValue() : map != null && StringUtils.equals(map.get(ParamsConstants.Key.PARAM_FORCE_NATIVE), "1");
    }

    @Override // com.ali.user.open.ucc.base.BaseUccServiceProvider, com.ali.user.open.ucc.UccServiceProvider
    public void cleanUp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426bb0dd", new Object[]{this, context});
        } else {
            ((OauthService) AliMemberSDK.getService(OauthService.class)).logout(context, "alipay");
        }
    }
}
