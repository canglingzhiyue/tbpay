package com.alipay.mobile.verifyidentity.module.seccam;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.czb;

/* loaded from: classes3.dex */
public class SecCamActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f5935a = new Handler(Looper.getMainLooper());
    private boolean b = false;
    private AtomicBoolean c = new AtomicBoolean(false);

    public static /* synthetic */ Object ipc$super(SecCamActivity secCamActivity, String str, Object... objArr) {
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

    public static /* synthetic */ void access$000(SecCamActivity secCamActivity, String str, String str2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4d8cb2", new Object[]{secCamActivity, str, str2, hashMap});
        } else {
            secCamActivity.a(str, str2, hashMap);
        }
    }

    public static /* synthetic */ boolean access$100(SecCamActivity secCamActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3879ad70", new Object[]{secCamActivity})).booleanValue() : secCamActivity.b;
    }

    public static /* synthetic */ boolean access$102(SecCamActivity secCamActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b95fd1ee", new Object[]{secCamActivity, new Boolean(z)})).booleanValue();
        }
        secCamActivity.b = z;
        return z;
    }

    public static /* synthetic */ MicroModule access$300(SecCamActivity secCamActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("e4654d6c", new Object[]{secCamActivity}) : secCamActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$400(SecCamActivity secCamActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("2749ec8b", new Object[]{secCamActivity}) : secCamActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$500(SecCamActivity secCamActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("6a2e8baa", new Object[]{secCamActivity}) : secCamActivity.mModule;
    }

    public static /* synthetic */ AtomicBoolean access$600(SecCamActivity secCamActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("d5206d07", new Object[]{secCamActivity}) : secCamActivity.c;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        VerifyLogCat.i("SecCamTAG", "SecCamActivity onCreate");
        super.onCreate(bundle);
        if (getIntent() == null || getIntent().getExtras() == null) {
            VerifyLogCat.w("SecCamTAG", "Empty data! It can't go on");
            a();
            return;
        }
        String string = getIntent().getExtras().getString("moduleData");
        VerifyLogCat.i("SecCamTAG", "moduleData: " + string);
        JSONObject parseObject = JSON.parseObject(string);
        if (parseObject == null) {
            VerifyLogCat.w("SecCamTAG", "moduleDataOb null! It can't go on");
            a();
            return;
        }
        String string2 = parseObject.getString("faceData");
        VerifyLogCat.i("SecCamTAG", "faceData: " + string2);
        a("seccam", "UC-MobileIC-220801-01", null);
        AuthenticatorManager.getInstance(this);
        AuthenticatorManager.startSecCamH5Auth(this, string2, new czb() { // from class: com.alipay.mobile.verifyidentity.module.seccam.SecCamActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.czb
            public void authResult(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1ba7c4a1", new Object[]{this, new Integer(i), str});
                    return;
                }
                VerifyLogCat.i("SecCamTAG", "authResult, code: " + i + ", data: " + str);
                HashMap hashMap = new HashMap();
                hashMap.put("code", String.valueOf(i));
                hashMap.put("authString", str);
                SecCamActivity.access$000(SecCamActivity.this, "seccam", "UC-MobileIC-220801-02", hashMap);
                if (i != -6) {
                    SecCamActivity.access$102(SecCamActivity.this, true);
                }
                SecCamActivity.access$200(SecCamActivity.this, str);
            }
        });
    }

    private void a(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515b1096", new Object[]{this, moduleExecuteResult});
        } else {
            this.mMicroModuleContext.notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), moduleExecuteResult);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VerifyLogCat.d("SecCamTAG", "error");
        a(new DefaultModuleResult("2002"));
    }

    private void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable th) {
                VerifyLogCat.w("SecCamTAG", "logBehavior Exception", th);
                return;
            }
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str2, Constants.VI_ENGINE_APPID, str, this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        dismissProgressDialog();
    }

    public static /* synthetic */ void access$200(SecCamActivity secCamActivity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3949eb15", new Object[]{secCamActivity, str});
            return;
        }
        VerifyLogCat.i("SecCamTAG", "upload check result");
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.seccam.SecCamActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.module = SecCamActivity.access$300(SecCamActivity.this).getModuleName();
                    mICRpcRequest.verifyId = SecCamActivity.access$400(SecCamActivity.this).getVerifyId();
                    mICRpcRequest.action = "VERIFY_SECCAM_FACEVERIFY";
                    mICRpcRequest.token = SecCamActivity.access$500(SecCamActivity.this).getToken();
                    VerifyLogCat.i("SecCamTAG", "data str：" + str);
                    mICRpcRequest.data = str;
                    MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                    SecCamActivity.this.dismissProgressDialog();
                    SecCamActivity.access$600(SecCamActivity.this).set(true);
                    if (dispatch == null) {
                        SecCamActivity.access$800(SecCamActivity.this);
                    } else if (dispatch.verifySuccess || !SecCamActivity.access$100(SecCamActivity.this)) {
                        SecCamActivity.access$700(SecCamActivity.this, dispatch);
                    } else {
                        String str2 = dispatch.verifyMessage;
                        if (TextUtils.isEmpty(str2)) {
                            str2 = SecCamActivity.this.getResources().getString(R.string.verifyidentity_wrong_data);
                        }
                        SecCamActivity.this.toast(str2, 0);
                        SecCamActivity.access$700(SecCamActivity.this, dispatch);
                    }
                } catch (RpcException unused) {
                    SecCamActivity.this.dismissProgressDialog();
                    SecCamActivity.access$600(SecCamActivity.this).set(true);
                    VerifyLogCat.w("SecCamTAG", "upload result got rpc error");
                    SecCamActivity.access$800(SecCamActivity.this);
                }
            }
        }, "VERIFY_SEC_CAM");
        secCamActivity.f5935a.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.seccam.SecCamActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (SecCamActivity.access$600(SecCamActivity.this).get() || SecCamActivity.this.isFinishing()) {
                    VerifyLogCat.i("SecCamTAG", "rpc已返回，不再做处理");
                } else {
                    VerifyLogCat.i("SecCamTAG", "1秒后，rpc仍未返回");
                    SecCamActivity.this.showProgressDialog("");
                }
            }
        }, 1000L);
    }

    public static /* synthetic */ void access$700(SecCamActivity secCamActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd554d8", new Object[]{secCamActivity, mICRpcResponse});
            return;
        }
        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
        moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        secCamActivity.a(moduleExecuteResult);
    }

    public static /* synthetic */ void access$800(SecCamActivity secCamActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69c51c5", new Object[]{secCamActivity});
            return;
        }
        if (secCamActivity.b) {
            secCamActivity.toast(secCamActivity.getResources().getString(R.string.network_unavailable), 0);
        }
        MicroModuleContext.getInstance().notifyAndFinishModule(secCamActivity.mModule.getVerifyId(), secCamActivity.mModule.getToken(), secCamActivity.mModule.getModuleName(), new DefaultModuleResult("2003"));
    }
}
