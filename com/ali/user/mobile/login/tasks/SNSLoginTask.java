package com.ali.user.mobile.login.tasks;

import android.app.Activity;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.e;
import com.taobao.android.sns4android.g;
import com.taobao.android.sns4android.util.b;
import com.taobao.taobao.R;
import java.util.Properties;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class SNSLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity activity;
    public JSONObject params;
    public SNSPlatform platform;

    static {
        kge.a(-2138345339);
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this});
        }
        return null;
    }

    public SNSLoginTask(SNSPlatform sNSPlatform, Activity activity, JSONObject jSONObject) {
        this.platform = sNSPlatform;
        this.activity = activity;
        this.params = jSONObject;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else if (commonDataCallback == null) {
        } else {
            if (this.platform == null) {
                commonDataCallback.onFail(3002, ResourceUtil.getInvalidParam());
            } else if (e.a().a(this.platform) != null) {
                Properties properties = LoginComponent.getProperties();
                String str = null;
                JSONObject jSONObject = this.params;
                if (jSONObject != null) {
                    try {
                        str = jSONObject.getString(UTConstant.PageName.UT_KEY_PAGE_NAME);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                UserTrackAdapter.sendUT(str, "snsAuthCode_commit", "", b.c(this.platform.getPlatform()), properties);
                e.a().a(this.platform).a(this.activity, new g() { // from class: com.ali.user.mobile.login.tasks.SNSLoginTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.sns4android.g
                    public void onSucceed(Activity activity, SNSSignInAccount sNSSignInAccount) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8032b9ea", new Object[]{this, activity, sNSSignInAccount});
                            return;
                        }
                        if (SNSLoginTask.this.loginParam == null) {
                            SNSLoginTask.this.loginParam = new LoginBaseParam();
                        }
                        SNSLoginTask.this.loginParam.snsTrustLoginToken = sNSSignInAccount.token;
                        SNSLoginTask.this.loginParam.snsType = sNSSignInAccount.snsType;
                        commonDataCallback.onSuccess(null);
                    }

                    @Override // com.taobao.android.sns4android.g
                    public void onCancel(Activity activity, String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("77c620a6", new Object[]{this, activity, str2, str3});
                        } else {
                            commonDataCallback.onFail(3007, activity.getResources().getString(R.string.aliuser_sns_platform_auth_cancel));
                        }
                    }

                    @Override // com.taobao.android.sns4android.g
                    public void onError(Activity activity, String str2, int i, String str3, String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7321aa0b", new Object[]{this, activity, str2, new Integer(i), str3, str4});
                        } else {
                            commonDataCallback.onFail(i, str3);
                        }
                    }
                }, this.params);
            } else {
                commonDataCallback.onFail(703, this.activity.getResources().getString(R.string.aliuser_sns_platform_auth_fail));
            }
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            UserLoginServiceImpl.getInstance().snslogin(loginBaseParam, rpcRequestCallback);
        }
    }
}
