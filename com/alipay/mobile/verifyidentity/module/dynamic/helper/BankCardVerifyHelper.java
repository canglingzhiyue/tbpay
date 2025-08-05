package com.alipay.mobile.verifyidentity.module.dynamic.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.framework.LauncherApplicationAgent;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class BankCardVerifyHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "BankCardVerifyHelper";

    /* renamed from: a  reason: collision with root package name */
    private MicroModule f5886a;
    private boolean d;
    private Handler b = new Handler(Looper.getMainLooper());
    private BroadcastReceiver e = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.helper.BankCardVerifyHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            BankCardVerifyHelper.access$000(BankCardVerifyHelper.this);
            if (intent == null || !"EVENT_ADD_BANK_CARD".equalsIgnoreCase(intent.getAction())) {
                VerifyLogCat.w(BankCardVerifyHelper.access$100(), "无效广播，忽略");
                return;
            }
            final String stringExtra = intent.getStringExtra("result");
            final String stringExtra2 = intent.getStringExtra("signId");
            String access$100 = BankCardVerifyHelper.access$100();
            VerifyLogCat.d(access$100, "receive bank card msg result: " + stringExtra + " signId:" + stringExtra2);
            BankCardVerifyHelper.access$300(BankCardVerifyHelper.this).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.helper.BankCardVerifyHelper.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BankCardVerifyHelper.access$200(BankCardVerifyHelper.this, stringExtra, stringExtra2);
                    }
                }
            });
        }
    };

    public static /* synthetic */ void access$000(BankCardVerifyHelper bankCardVerifyHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ac9807", new Object[]{bankCardVerifyHelper});
        } else {
            bankCardVerifyHelper.a();
        }
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : c;
    }

    public static /* synthetic */ Handler access$300(BankCardVerifyHelper bankCardVerifyHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8e904122", new Object[]{bankCardVerifyHelper}) : bankCardVerifyHelper.b;
    }

    public static /* synthetic */ MicroModule access$400(BankCardVerifyHelper bankCardVerifyHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("416865c5", new Object[]{bankCardVerifyHelper}) : bankCardVerifyHelper.f5886a;
    }

    public BankCardVerifyHelper(boolean z) {
        this.d = false;
        this.d = z;
    }

    public void startAddCard(MicroModule microModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea5be86", new Object[]{this, microModule, str});
            return;
        }
        try {
            this.f5886a = microModule;
            LocalBroadcastManager.getInstance(microModule.getMicroModuleContext().getContext()).registerReceiver(this.e, new IntentFilter("EVENT_ADD_BANK_CARD"));
            Bundle bundle = new Bundle();
            bundle.putString("source", str);
            LauncherApplicationAgent.getInstance().getMicroApplicationContext().startApp(Constants.VI_ENGINE_APPID, "09999983", bundle);
            updateMultiStatus(microModule, true);
        } catch (Exception unused) {
            microModule.getMicroModuleContext().notifyAndFinishModule(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName(), new DefaultModuleResult("2002"));
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e == null) {
        } else {
            LocalBroadcastManager.getInstance(this.f5886a.getMicroModuleContext().getContext()).unregisterReceiver(this.e);
            this.e = null;
        }
    }

    public void updateMultiStatus(MicroModule microModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb19f24b", new Object[]{this, microModule, new Boolean(z)});
            return;
        }
        microModule.getTask().isMultiTaskEnabled = z;
        microModule.getTask().canMultiTaskEnableOnPoP = z;
    }

    public void doNextStep(MICRpcResponse mICRpcResponse) {
        ModuleExecuteResult defaultModuleResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3432528d", new Object[]{this, mICRpcResponse});
            return;
        }
        VerifyLogCat.i(c, "next step");
        if (mICRpcResponse != null) {
            if (!mICRpcResponse.finish && this.f5886a.getModuleName().equalsIgnoreCase(mICRpcResponse.nextStep)) {
                String str = c;
                VerifyLogCat.i(str, "忽略本次RpcResponse，因为finish为false，且next step仍为：" + mICRpcResponse.nextStep);
                return;
            }
            defaultModuleResult = new ModuleExecuteResult();
            defaultModuleResult.setMICRpcResponse(mICRpcResponse);
        } else {
            defaultModuleResult = new DefaultModuleResult("1001");
        }
        notifyResult(defaultModuleResult);
    }

    public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
        } else if (this.d) {
            this.f5886a.getMicroModuleContext().notifyModuleResult(this.f5886a.getVerifyId(), this.f5886a.getToken(), this.f5886a.getModuleName(), moduleExecuteResult);
        } else {
            this.f5886a.getMicroModuleContext().notifyAndFinishModule(this.f5886a.getVerifyId(), this.f5886a.getToken(), this.f5886a.getModuleName(), moduleExecuteResult);
        }
    }

    public static /* synthetic */ void access$200(BankCardVerifyHelper bankCardVerifyHelper, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1a4b59", new Object[]{bankCardVerifyHelper, str, str2});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.helper.BankCardVerifyHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BankCardVerifyHelper.access$400(BankCardVerifyHelper.this).getMicroModuleContext().showProgressDialog("");
                        MICRpcRequest mICRpcRequest = new MICRpcRequest();
                        mICRpcRequest.module = BankCardVerifyHelper.access$400(BankCardVerifyHelper.this).getModuleName();
                        mICRpcRequest.action = "VERIFY_BANK_RISK_BIND";
                        mICRpcRequest.verifyId = BankCardVerifyHelper.access$400(BankCardVerifyHelper.this).getVerifyId();
                        mICRpcRequest.token = BankCardVerifyHelper.access$400(BankCardVerifyHelper.this).getToken();
                        HashMap hashMap = new HashMap();
                        hashMap.put("signId", str2);
                        hashMap.put("result", str);
                        mICRpcRequest.data = JSONObject.toJSONString(hashMap);
                        MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                        BankCardVerifyHelper.access$400(BankCardVerifyHelper.this).getMicroModuleContext().dismissProgressDialog();
                        BankCardVerifyHelper.access$500(BankCardVerifyHelper.this, dispatch);
                    } catch (RpcException unused) {
                        BankCardVerifyHelper.access$400(BankCardVerifyHelper.this).getMicroModuleContext().dismissProgressDialog();
                        BankCardVerifyHelper.access$500(BankCardVerifyHelper.this, null);
                    } catch (Throwable unused2) {
                        BankCardVerifyHelper.access$400(BankCardVerifyHelper.this).getMicroModuleContext().dismissProgressDialog();
                        BankCardVerifyHelper.access$500(BankCardVerifyHelper.this, null);
                    }
                }
            }, "sendCardRpc");
        }
    }

    public static /* synthetic */ void access$500(BankCardVerifyHelper bankCardVerifyHelper, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd4749c", new Object[]{bankCardVerifyHelper, mICRpcResponse});
            return;
        }
        LauncherApplicationAgent.getInstance().getMicroApplicationContext().finishApp(Constants.VI_ENGINE_APPID, "09999983", (Bundle) null);
        bankCardVerifyHelper.doNextStep(mICRpcResponse);
        bankCardVerifyHelper.updateMultiStatus(bankCardVerifyHelper.f5886a, false);
        bankCardVerifyHelper.a();
    }
}
