package com.ali.user.open.ucc;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.model.LoginDataModel;
import com.ali.user.open.core.model.LoginReturnData;
import com.ali.user.open.core.util.JSONUtils;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.ucc.base.BaseUccServiceProvider;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class DefaultUccServiceProviderImpl extends BaseUccServiceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AlipayUccServiceProviderImpl";

    static {
        kge.a(1627744376);
    }

    @Override // com.ali.user.open.ucc.base.BaseUccServiceProvider
    public boolean isAuthByNative(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4750fede", new Object[]{this, context, str, map})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.open.ucc.base.BaseUccServiceProvider, com.ali.user.open.ucc.UccServiceProvider
    public void refreshWhenLogin(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852e92e5", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        LoginReturnData loginReturnData = (LoginReturnData) JSON.parseObject(str2, LoginReturnData.class);
        try {
            if (StringUtils.isEmpty(((LoginDataModel) JSONUtils.toPOJO(new JSONObject(loginReturnData.data), LoginDataModel.class)).sid)) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        if (z) {
            ((SessionService) AliMemberSDK.getService(SessionService.class)).refreshCookie(str, loginReturnData);
        } else {
            ((SessionService) AliMemberSDK.getService(SessionService.class)).refreshWhenLogin(str, loginReturnData);
        }
    }
}
