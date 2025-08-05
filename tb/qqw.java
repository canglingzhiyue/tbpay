package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.service.SNSService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.alipay3.AlipayRpcPresenter;
import com.ali.user.open.oauth.alipay3.GetSignCallback;
import com.ali.user.open.oauth.alipay3.SignRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.d;
import com.taobao.android.sns4android.f;
import com.taobao.android.sns4android.g;
import com.taobao.taobao.R;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class qqw extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int b = -1;
    public static int c = -2;
    public static int d = -3;
    public static int e = -4;
    public static String f = SNSPlatform.PLATFORM_ALIPAYHK.getPlatform();

    public static /* synthetic */ Object ipc$super(qqw qqwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(qqw qqwVar, Activity activity, g gVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ff285e", new Object[]{qqwVar, activity, gVar, str, str2});
        } else {
            qqwVar.a(activity, gVar, str, str2);
        }
    }

    public static qqw a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqw) ipChange.ipc$dispatch("9d3cdc2d", new Object[]{dVar}) : new qqw();
    }

    @Override // com.taobao.android.sns4android.f
    public void a(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5944a8b", new Object[]{this, activity, map});
        } else {
            a(true, activity, this.f15264a, (JSONObject) null, map);
        }
    }

    @Override // com.taobao.android.sns4android.f
    public void a(Activity activity, g gVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cefcd", new Object[]{this, activity, gVar, jSONObject});
        } else {
            a(false, activity, gVar, jSONObject, (Map<String, String>) null);
        }
    }

    private void a(boolean z, final Activity activity, final g gVar, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6452111c", new Object[]{this, new Boolean(z), activity, gVar, jSONObject, map});
            return;
        }
        final String remove = (map == null || map.isEmpty() || !map.containsKey(UTConstant.PageName.UT_KEY_PAGE_NAME)) ? "Page_Extent_AlipayHK" : map.remove(UTConstant.PageName.UT_KEY_PAGE_NAME);
        LoginContext.alipayHkCallback = new CommonDataCallback() { // from class: tb.qqw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map2});
                } else if (gVar == null) {
                } else {
                    SNSSignInAccount sNSSignInAccount = new SNSSignInAccount();
                    sNSSignInAccount.token = map2.get("authCode");
                    sNSSignInAccount.snsType = qqw.f;
                    sNSSignInAccount.utPageName = remove;
                    gVar.onSucceed(activity, sNSSignInAccount);
                }
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                } else if (gVar == null) {
                } else {
                    if (i == qqw.d) {
                        gVar.onCancel(activity, qqw.f, remove);
                    } else {
                        gVar.onError(activity, qqw.f, i, activity.getString(R.string.aliuser_sns_platform_auth_fail), remove);
                    }
                }
            }
        };
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString(ParamsConstants.Key.PARAM_ALIPAY_URL);
                if (!TextUtils.isEmpty(optString)) {
                    a(activity, gVar, remove, optString);
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        SignRequest signRequest = new SignRequest();
        signRequest.app_id = "";
        signRequest.pid = "";
        signRequest.sign_type = f;
        signRequest.target_id = "";
        signRequest.scope = "";
        if (activity != null) {
            ((SNSService) ServiceFactory.getService(SNSService.class)).showLoading(activity);
        }
        AlipayRpcPresenter.getAlipaySign(new GetSignCallback() { // from class: tb.qqw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.callback.FailureCallback
            public void onFailure(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                    return;
                }
                if (activity != null) {
                    ((SNSService) ServiceFactory.getService(SNSService.class)).dismissLoading(activity);
                }
                gVar.onError(activity, qqw.f, i, activity.getString(R.string.aliuser_sns_platform_auth_fail), remove);
            }

            @Override // com.ali.user.open.oauth.alipay3.GetSignCallback
            public void onGetSignSuccessed(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("644662ff", new Object[]{this, str});
                    return;
                }
                if (activity != null) {
                    ((SNSService) ServiceFactory.getService(SNSService.class)).dismissLoading(activity);
                }
                qqw.a(qqw.this, activity, gVar, remove, str);
            }
        }, signRequest);
    }

    private void a(Activity activity, g gVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7251b725", new Object[]{this, activity, gVar, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(new StringBuilder(str2).toString()));
        if (activity.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            intent.setFlags(268468224);
            try {
                activity.startActivity(intent);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                gVar.onError(activity, f, c, activity.getString(R.string.aliuser_sns_platform_auth_fail), str);
                return;
            }
        }
        gVar.onError(activity, f, 10011, activity.getString(R.string.aliuser_sns_platform_auth_fail), str);
    }
}
