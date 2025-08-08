package com.alipay.android.msp.core.callback;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.helper.HandleResponseDataUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.network.model.CustomCallback;
import com.alipay.android.msp.network.model.NetResponseData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class MspNetCallback extends CustomCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MspTradeContext f4503a;
    private RequestConfig b;

    public static /* synthetic */ Object ipc$super(MspNetCallback mspNetCallback, String str, Object... objArr) {
        if (str.hashCode() == 2035146358) {
            return super.onReqEnd((NetResponseData) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MspNetCallback(MspTradeContext mspTradeContext) {
        this.f4503a = mspTradeContext;
    }

    @Override // com.alipay.android.msp.network.model.CustomCallback
    public CustomCallback.WhatNext onBuildRequestConfig(RequestConfig requestConfig) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomCallback.WhatNext) ipChange.ipc$dispatch("a3149ad9", new Object[]{this, requestConfig});
        }
        MspTradeContext mspTradeContext = this.f4503a;
        if (mspTradeContext != null) {
            mspTradeContext.setSubmitState(true);
        }
        this.b = requestConfig;
        MspTradeContext mspTradeContext2 = this.f4503a;
        if (mspTradeContext2 != null && mspTradeContext2.isUpgradePreRendTpl()) {
            if (StringUtils.equals("cashier", requestConfig.getType()) && StringUtils.equals("main", requestConfig.getMethod()) && this.f4503a.getContext() != null) {
                MspRender.triggerPreRenderQUICKPAY(MspFlybirdDefine.FLYBIRD_HOME_TPL, this.f4503a.getContext().getApplicationContext());
            }
        } else {
            MspTradeContext mspTradeContext3 = this.f4503a;
            if (mspTradeContext3 != null && requestConfig != null && !requestConfig.isFirstRequest()) {
                try {
                    MspBasePresenter mspBasePresenter = mspTradeContext3.getMspBasePresenter();
                    if (mspBasePresenter != null && (activity = mspBasePresenter.getActivity()) != null) {
                        PreRendManager.getInstance().preRendTpl(activity, mspTradeContext3.getBizId(), requestConfig.getActionJson(), null, "network");
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
        }
        return CustomCallback.WhatNext.CONTINUE;
    }

    @Override // com.alipay.android.msp.network.model.CustomCallback
    public CustomCallback.WhatNext onReqException(Throwable th) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomCallback.WhatNext) ipChange.ipc$dispatch("68312b45", new Object[]{this, th});
        }
        MspTradeContext mspTradeContext = this.f4503a;
        if (mspTradeContext != null) {
            mspTradeContext.setSubmitState(false);
            RequestConfig requestConfig = this.b;
            if (requestConfig != null) {
                if (requestConfig.isFirstRequest()) {
                    str = "/cashier/main";
                } else if (!StringUtils.isEmpty(this.b.getActionJson())) {
                    try {
                        str = JSON.parseObject(this.b.getActionJson()).getString("name");
                    } catch (Throwable th2) {
                        LogUtil.printExceptionStackTrace(th2);
                    }
                }
                SpmHelper.spmExpSubmitResponse(this.f4503a, str, "true", null, false);
            }
            str = "";
            SpmHelper.spmExpSubmitResponse(this.f4503a, str, "true", null, false);
        }
        return CustomCallback.WhatNext.CONTINUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:10|11|(6:20|(4:22|(1:24)(1:48)|25|(1:27)(2:46|47))(1:49)|28|29|(3:35|36|(1:38)(2:39|(1:41)(1:42)))|43)|50|28|29|(4:33|35|36|(0)(0))|43) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7 A[Catch: Exception -> 0x00f8, TRY_ENTER, TryCatch #1 {Exception -> 0x00f8, blocks: (B:32:0x00ba, B:36:0x00c1, B:38:0x00c7, B:41:0x00d7, B:42:0x00de, B:44:0x00e6, B:45:0x00ed), top: B:57:0x00ba, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de A[Catch: Exception -> 0x00f8, TryCatch #1 {Exception -> 0x00f8, blocks: (B:32:0x00ba, B:36:0x00c1, B:38:0x00c7, B:41:0x00d7, B:42:0x00de, B:44:0x00e6, B:45:0x00ed), top: B:57:0x00ba, outer: #0 }] */
    @Override // com.alipay.android.msp.network.model.CustomCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.msp.network.model.CustomCallback.WhatNext onReqEnd(com.alipay.android.msp.network.model.NetResponseData r7) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.callback.MspNetCallback.onReqEnd(com.alipay.android.msp.network.model.NetResponseData):com.alipay.android.msp.network.model.CustomCallback$WhatNext");
    }

    private CustomCallback.WhatNext a(NetResponseData netResponseData, StEvent stEvent) throws AppErrorException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomCallback.WhatNext) ipChange.ipc$dispatch("458c0b64", new Object[]{this, netResponseData, stEvent});
        }
        ResData response = netResponseData.getResponse();
        RequestConfig config = netResponseData.getRequest().getConfig();
        JSONObject jSONObject = null;
        try {
            jSONObject = response.toJsonData();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        NativeDynFunManager.processWithFallbackAsync(this.f4503a.getBizId(), DynConstants.DynFunNames.F_RESOLVE_RES, new Object[]{jSONObject, "rpc"}, NativeDynFunManager.FallbackFunction.noop, NativeDynFunManager.ResultCallbackFunction.noop);
        if (jSONObject == null) {
            return CustomCallback.WhatNext.TERMINATE;
        }
        LogUtil.record(2, "MspNetCallback:onRpcResponse", "response not null");
        DrmManager.getInstance(this.f4503a.getContext()).onUpdate(jSONObject);
        TradeLogicData tradeLogicData = this.f4503a.getTradeLogicData();
        if (tradeLogicData == null) {
            return CustomCallback.WhatNext.TERMINATE;
        }
        if (jSONObject.containsKey("mspParam")) {
            tradeLogicData.setLdcHeaders(jSONObject.getString("mspParam"));
            LogUtil.record(4, "MspNetCallback.onReqEnd", "mspParam" + jSONObject.getString("mspParam"));
        }
        if (jSONObject.containsKey("resultStatus")) {
            String string = jSONObject.getString("resultStatus");
            if (StringUtils.equals(string, "1002") || StringUtils.equals(string, "1003")) {
                ExceptionUtils.sendUiMsgWhenException(this.f4503a.getBizId(), new AppErrorException(ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("flybird_mobilegwerror_tips", this.f4503a.getContext().getString(R.string.flybird_mobilegwerror_tips), new Object[0]), 303)));
            }
        }
        if (config.isPbv3ForSdk() || config.isPbv2() || config.isPbv3()) {
            if (HandleResponseDataUtil.handlePbV2Data(jSONObject, this.f4503a)) {
                ActionsCreator.get(this.f4503a).createUIShowAction(jSONObject, false, stEvent);
            }
        } else if (config.isPbV1()) {
            String parsePbV1DataToRendData = HandleResponseDataUtil.parsePbV1DataToRendData(jSONObject, this.f4503a);
            if (!StringUtils.isEmpty(parsePbV1DataToRendData)) {
                ActionsCreator.get(this.f4503a).createUIShowAction(JSON.parseObject(parsePbV1DataToRendData), false, stEvent);
            } else {
                throw new AppErrorException(ExceptionUtils.createExceptionMsg(206));
            }
        }
        RequestConfig requestConfig = this.b;
        if (requestConfig != null) {
            if (requestConfig.isFirstRequest()) {
                str = "/cashier/main";
            } else if (!StringUtils.isEmpty(this.b.getActionJson())) {
                try {
                    str = JSON.parseObject(this.b.getActionJson()).getString("name");
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            SpmHelper.spmExpSubmitResponse(this.f4503a, str, "false", jSONObject.getString("end_code"), false);
            return CustomCallback.WhatNext.CONTINUE;
        }
        str = "";
        SpmHelper.spmExpSubmitResponse(this.f4503a, str, "false", jSONObject.getString("end_code"), false);
        return CustomCallback.WhatNext.CONTINUE;
    }
}
