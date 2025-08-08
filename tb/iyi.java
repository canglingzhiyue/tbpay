package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.AppCredential;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.OauthPlatformConfig;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.d;
import com.taobao.android.sns4android.f;
import com.taobao.android.sns4android.g;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class iyi extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String b = "Login.alipay3";
    public static String c = SNSPlatform.PLATFORM_ALIPAY.getPlatform();

    public static /* synthetic */ Object ipc$super(iyi iyiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static iyi a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iyi) ipChange.ipc$dispatch("9d39558b", new Object[]{dVar});
        }
        try {
            LoginTLogAdapter.e(b, "in Alipay3SignInHelper create");
            AppCredential appCredential = new AppCredential();
            appCredential.appKey = dVar.b;
            appCredential.pid = dVar.d;
            appCredential.signType = dVar.e;
            appCredential.targetId = dVar.f;
            appCredential.scope = dVar.g;
            OauthPlatformConfig.setOauthConfig("alipay", appCredential);
        } catch (Throwable unused) {
        }
        return new iyi();
    }

    private iyi() {
    }

    @Override // com.taobao.android.sns4android.f
    public void a(Activity activity, g gVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cefcd", new Object[]{this, activity, gVar, jSONObject});
        } else {
            a(false, activity, gVar, jSONObject);
        }
    }

    private void a(boolean z, Activity activity, g gVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd42f49", new Object[]{this, new Boolean(z), activity, gVar, jSONObject});
        } else {
            a(z, activity, gVar, jSONObject, null);
        }
    }

    private void a(boolean z, final Activity activity, final g gVar, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6452111c", new Object[]{this, new Boolean(z), activity, gVar, jSONObject, map});
            return;
        }
        String str = "Page_Extent_Alipay";
        HashMap hashMap = new HashMap();
        hashMap.put(ParamsConstants.Key.PARAM_ONLY_AUTHCODE, "1");
        boolean isInABTestRegion = LoginSwitch.isInABTestRegion(ParamsConstants.Key.PARAM_ALIPAY_QUICK_LOGIN, -1);
        if (z && isInABTestRegion) {
            hashMap.put(ParamsConstants.Key.PARAM_ALIPAY_QUICK_LOGIN, "1");
        }
        if (jSONObject != null) {
            try {
                hashMap.put(ParamsConstants.Key.PARAM_ALIPAY_URL, jSONObject.opt(ParamsConstants.Key.PARAM_ALIPAY_URL));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (map != null && !map.isEmpty()) {
            if (map.containsKey(UTConstant.PageName.UT_KEY_PAGE_NAME)) {
                str = map.remove(UTConstant.PageName.UT_KEY_PAGE_NAME);
            }
            if (!StringUtils.isEmpty(str)) {
                UserTrackAdapter.sendControlUT(str, "Btn_Login");
            }
            hashMap.putAll(map);
        }
        final String str2 = str;
        final Context applicationContext = DataProviderFactory.getApplicationContext();
        if (AliMemberSDK.getService(OauthService.class) != null) {
            LoginTLogAdapter.e(b, "oauthservice != null");
            ((OauthService) AliMemberSDK.getService(OauthService.class)).oauth(activity, "alipay", hashMap, new OauthCallback() { // from class: tb.iyi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.oauth.OauthCallback
                public void onSuccess(String str3, Map map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str3, map2});
                        return;
                    }
                    iyi.this.a("Page_Extent_Alipay", "T");
                    if (gVar == null) {
                        return;
                    }
                    SNSSignInAccount sNSSignInAccount = new SNSSignInAccount();
                    sNSSignInAccount.token = (String) map2.get("authCode");
                    sNSSignInAccount.snsType = iyi.c;
                    sNSSignInAccount.utPageName = str2;
                    gVar.onSucceed(activity, sNSSignInAccount);
                }

                @Override // com.ali.user.open.oauth.OauthCallback
                public void onFail(String str3, int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str3, new Integer(i), str4});
                        return;
                    }
                    iyi.this.a(str2, UTConstant.Args.UT_SUCCESS_F);
                    g gVar2 = gVar;
                    if (gVar2 == null) {
                        return;
                    }
                    if (i == 204) {
                        gVar2.onCancel(activity, iyi.c, str2);
                    } else {
                        gVar2.onError(activity, iyi.c, i, applicationContext.getString(R.string.aliuser_sns_platform_auth_fail), str2);
                    }
                }
            });
            return;
        }
        LoginTLogAdapter.e(b, "OauthService is null");
        if (gVar == null) {
            return;
        }
        gVar.onError(activity, c, 10012, applicationContext.getString(R.string.aliuser_SNS_platform_auth_not_init_ucc), str2);
    }

    @Override // com.taobao.android.sns4android.f
    public void a(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5944a8b", new Object[]{this, activity, map});
        } else {
            a(true, activity, this.f15264a, null, map);
        }
    }
}
