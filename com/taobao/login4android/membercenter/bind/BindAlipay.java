package com.taobao.login4android.membercenter.bind;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.h5.MtopAccountCenterUrlResponseData;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.url.model.AccountCenterParam;
import com.ali.user.mobile.url.service.impl.UrlFetchServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginSceneConstants;
import com.taobao.login4android.constants.LoginStatus;
import tb.kge;

/* loaded from: classes7.dex */
public class BindAlipay {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BindAlipay";
    public static OnBindCaller mBindCaller;

    static {
        kge.a(2104324599);
    }

    public static /* synthetic */ void access$000(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3ec773", new Object[]{loginAction});
        } else {
            sendBroadcast(loginAction);
        }
    }

    public static void bindAlipay(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7383a802", new Object[]{str, str2});
        } else if (LoginSwitch.getSwitch(LoginSwitch.BIND_ALIPAY_SWITCH, "true")) {
            try {
                BindParam bindParam = new BindParam();
                bindParam.bizSence = str;
                bindParam.signData = str2;
                bind(DataProviderFactory.getApplicationContext(), bindParam, new OnBindCaller() { // from class: com.taobao.login4android.membercenter.bind.BindAlipay.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.login4android.membercenter.bind.OnBindCaller
                    public void onBindSuccess(Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2c839366", new Object[]{this, bundle});
                        } else {
                            BindAlipay.access$000(LoginAction.BIND_ALIPAY_SUCCESS);
                        }
                    }

                    @Override // com.taobao.login4android.membercenter.bind.OnBindCaller
                    public void onBindError(Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4a7452c1", new Object[]{this, bundle});
                        } else {
                            BindAlipay.access$000(LoginAction.BIND_ALIPAY_FAILED);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            sendBroadcast(LoginAction.BIND_ALIPAY_FAILED);
        }
    }

    public static void bind(final Context context, final BindParam bindParam, final OnBindCaller onBindCaller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3facf17", new Object[]{context, bindParam, onBindCaller});
            return;
        }
        preCheckBindParam(bindParam);
        AccountCenterParam accountCenterParam = new AccountCenterParam();
        accountCenterParam.fromSite = DataProviderFactory.getDataProvider().getSite();
        accountCenterParam.scene = LoginSceneConstants.SCNEN_BINDALIPAY;
        UrlFetchServiceImpl.getInstance().navBySceneRemote(accountCenterParam, new RpcRequestCallback() { // from class: com.taobao.login4android.membercenter.bind.BindAlipay.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    return;
                }
                MtopAccountCenterUrlResponseData mtopAccountCenterUrlResponseData = (MtopAccountCenterUrlResponseData) rpcResponse;
                if (mtopAccountCenterUrlResponseData != null && !TextUtils.isEmpty(mtopAccountCenterUrlResponseData.h5Url)) {
                    BindAlipay.mBindCaller = onBindCaller;
                    BindAlipay.openAccountBindPage(context, mtopAccountCenterUrlResponseData.h5Url + "?" + BindParam.this.toString());
                    return;
                }
                OnBindCaller onBindCaller2 = onBindCaller;
                if (onBindCaller2 == null) {
                    return;
                }
                onBindCaller2.onBindError(null);
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    return;
                }
                OnBindCaller onBindCaller2 = onBindCaller;
                if (onBindCaller2 == null) {
                    return;
                }
                onBindCaller2.onBindError(null);
            }
        });
    }

    public static void openAccountBindPage(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96222bc", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent(context, NewAccountBindActivity.class);
        intent.putExtra(WebConstant.WEBURL, str);
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private static void preCheckBindParam(BindParam bindParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68610d61", new Object[]{bindParam});
            return;
        }
        bindParam.appKey = DataProviderFactory.getDataProvider().getAppkey();
        bindParam.apdid = AlipayInfo.getInstance().getApdid();
    }

    private static void sendBroadcast(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920b6c1c", new Object[]{loginAction});
        } else {
            BroadCastHelper.sendBroadcast(loginAction, false, LoginStatus.browserRefUrl);
        }
    }
}
