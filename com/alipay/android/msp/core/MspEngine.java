package com.alipay.android.msp.core;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspBNPlugin;
import com.alipay.android.app.birdnest.api.MspViewMessageListener;
import com.alipay.android.app.birdnest.api.MspWindowLoadListener;
import com.alipay.android.msp.container.MspContainerClient;
import com.alipay.android.msp.container.MspContainerResult;
import com.alipay.android.msp.core.callback.MspContextFinishCallback;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.framework.assist.MspBNPluginImpl;
import com.alipay.android.msp.framework.encrypt.EncryptUtil;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.network.PackUtils;
import com.alipay.android.msp.pay.CashierSceneDictionary;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.plugin.engine.IWalletEngine;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.ExchangeDataProcessor;
import com.alipay.android.msp.ui.views.MspProxyActivity;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tmgcashier.constant.a;
import java.util.Map;

/* loaded from: classes3.dex */
public class MspEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int createMspView(JSONObject jSONObject, boolean z, Bundle bundle, String str, Activity activity, MspWindowLoadListener mspWindowLoadListener) {
        JSONObject jSONObject2 = jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("545da59c", new Object[]{jSONObject2, new Boolean(z), bundle, str, activity, mspWindowLoadListener})).intValue();
        }
        LogUtil.i("MspEngine", "createMspView", "loadListener ".concat(String.valueOf(mspWindowLoadListener)));
        String str2 = MspContext.CONTEXT_TYPE_RENDER;
        if (TextUtils.equals(str, "H5NBComp") || TextUtils.equals(str, "BNFrame")) {
            str2 = MspContext.CONTEXT_TYPE_BNFRAME;
        }
        if (jSONObject2.containsKey("type") && "PluginBN".equalsIgnoreCase(jSONObject2.getString("type"))) {
            jSONObject2 = Utils.frameTplInfo2CommonTplInfo(jSONObject);
            str2 = MspContext.CONTEXT_TYPE_BNFRAME;
        }
        JSONObject jSONObject3 = jSONObject2;
        String str3 = str2;
        int hashCode = (jSONObject3.toString() + System.currentTimeMillis()).hashCode();
        new MspContainerContext(hashCode, jSONObject3, "", "", activity, z, bundle, null, str, false, null, str3).startGenerateView(new MspProxyActivity(activity, hashCode).getPresenter(), mspWindowLoadListener == null ? new MspWindowLoadListener() { // from class: com.alipay.android.msp.core.MspEngine.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
            public void onCloseWindow(View view, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("69ce5f72", new Object[]{this, view, bundle2});
                }
            }

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
            public void onWindowLoadFail(int i, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("13a3cbeb", new Object[]{this, new Integer(i), bundle2});
                }
            }

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
            public void onWindowLoadSuccess(View view, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9afa297", new Object[]{this, view, bundle2});
                }
            }

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
            public void onWindowResize(int i, int i2, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b647d36a", new Object[]{this, new Integer(i), new Integer(i2), bundle2});
                }
            }
        } : mspWindowLoadListener);
        return hashCode;
    }

    public static MspBNPlugin createMspView(JSONObject jSONObject, boolean z, Bundle bundle, String str, Activity activity, String str2, MspViewMessageListener mspViewMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspBNPlugin) ipChange.ipc$dispatch("39a73fe7", new Object[]{jSONObject, new Boolean(z), bundle, str, activity, str2, mspViewMessageListener});
        }
        LogUtil.i("MspEngine", "createMspView", "tplInfo: " + jSONObject.toJSONString());
        MspBNPluginImpl mspBNPluginImpl = new MspBNPluginImpl();
        mspBNPluginImpl.init(jSONObject, z, bundle, str, activity, str2, mspViewMessageListener);
        return mspBNPluginImpl;
    }

    public static JSONObject exchangeData(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("363e9ff6", new Object[]{str, bundle}) : ExchangeDataProcessor.route(str, bundle);
    }

    public static void startRend(JSONObject jSONObject, String str, String str2, boolean z, Bundle bundle, Bundle bundle2, String str3, boolean z2, Context context, MspContextFinishCallback mspContextFinishCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625aeee", new Object[]{jSONObject, str, str2, new Boolean(z), bundle, bundle2, str3, new Boolean(z2), context, mspContextFinishCallback});
        } else if (jSONObject == null) {
        } else {
            new MspContainerContext((jSONObject.toString() + System.currentTimeMillis()).hashCode(), jSONObject, str, str2, context, z, bundle, bundle2, str3, z2, mspContextFinishCallback, MspContext.CONTEXT_TYPE_RENDER).startRend();
        }
    }

    public static MspContainerResult startRenderForResult(JSONObject jSONObject, String str, boolean z, Context context) {
        MspContainerClient mspContainerClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerResult) ipChange.ipc$dispatch("98d6510c", new Object[]{jSONObject, str, new Boolean(z), context});
        }
        MspContainerResult mspContainerResult = new MspContainerResult();
        if (TextUtils.isEmpty(str)) {
            mspContainerResult.setErrorCode("101");
            return mspContainerResult;
        } else if (jSONObject == null) {
            mspContainerResult.setErrorCode("103");
            return mspContainerResult;
        } else if (context == null) {
            mspContainerResult.setErrorCode("104");
            return mspContainerResult;
        } else {
            int hashCode = (jSONObject.toString() + System.currentTimeMillis()).hashCode();
            int hashCode2 = str.hashCode();
            MspContainerContext renderContextByBizId = MspContextManager.getInstance().getRenderContextByBizId(MspContextManager.getInstance().getBizIdByRaw(hashCode2));
            if (renderContextByBizId != null && (mspContainerClient = renderContextByBizId.getMspContainerClient()) != null) {
                mspContainerClient.finishDupContainer();
            }
            MspContainerContext mspContainerContext = new MspContainerContext(hashCode, jSONObject, str, z, context, (MspContextFinishCallback) null);
            MspContextManager.getInstance().addRawBizId(hashCode2, hashCode);
            mspContainerContext.setMspBgTransparent(true);
            MspContainerResult startContainer = mspContainerContext.startContainer(jSONObject);
            if (startContainer != null) {
                LogUtil.i("MspEngine", "startRenderForResult", "mspContainerResult=" + startContainer.toString());
            } else {
                LogUtil.i("MspEngine", "startRenderForResult", "mspContainerResult null");
            }
            MspContextManager.getInstance().removeRawBizId(hashCode2);
            MspContextManager.getInstance().removeMspContextByBizId(hashCode);
            return startContainer;
        }
    }

    public static MspContainerResult startContainer(String str, String str2, boolean z, Context context) {
        MspContainerClient mspContainerClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerResult) ipChange.ipc$dispatch("41376921", new Object[]{str, str2, new Boolean(z), context});
        }
        MspContainerResult mspContainerResult = new MspContainerResult();
        if (TextUtils.isEmpty(str)) {
            mspContainerResult.setErrorCode("101");
            return mspContainerResult;
        }
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        int hashCode = (str + str3 + System.currentTimeMillis()).hashCode();
        int hashCode2 = str.hashCode();
        MspContainerContext renderContextByBizId = MspContextManager.getInstance().getRenderContextByBizId(MspContextManager.getInstance().getBizIdByRaw(hashCode2));
        if (renderContextByBizId != null && (mspContainerClient = renderContextByBizId.getMspContainerClient()) != null) {
            mspContainerClient.finishDupContainer();
        }
        MspContainerContext mspContainerContext = new MspContainerContext(hashCode, str3, str, z, context, (MspContextFinishCallback) null);
        MspContextManager.getInstance().addRawBizId(hashCode2, hashCode);
        MspContainerResult startContainer = mspContainerContext.startContainer(null);
        if (startContainer != null) {
            LogUtil.i("MspEngine", "startContainer", "mspContainerContext=" + startContainer.toString());
        } else {
            LogUtil.i("MspEngine", "startContainer", "mspContainerContext null");
        }
        MspContextManager.getInstance().removeRawBizId(hashCode2);
        MspContextManager.getInstance().removeMspContextByBizId(hashCode);
        return startContainer;
    }

    public static String startPay(MspPaySession mspPaySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c1115ca", new Object[]{mspPaySession}) : startPayment(mspPaySession).formatResult(0);
    }

    public static MspPayResult startPayment(MspPaySession mspPaySession) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (MspPayResult) ipChange.ipc$dispatch("681dce52", new Object[]{mspPaySession});
        }
        String orderSuffix = mspPaySession.getOrderSuffix();
        int bizId = mspPaySession.getBizId();
        LogUtil.i("MspEngine", a.BRIDGE_ACTION_STARTPAYMENT, bizId + " " + mspPaySession);
        CashierSceneDictionary.MspSchemePayContext mspSchemePayContext = CashierSceneDictionary.getInstance().getMspSchemePayContext(orderSuffix);
        if (orderSuffix != null && orderSuffix.contains("com.alipay.account.auth")) {
            if (!mspPaySession.isFromEntranceActivity() || TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_degrade_auth_from_ent_activity"), "true")) {
                IWalletEngine mspWallet = PhoneCashierMspEngine.getMspWallet();
                if (mspSchemePayContext != null) {
                    z = true;
                }
                JSONObject handleOpenServiceAuth = mspWallet.handleOpenServiceAuth(orderSuffix, z);
                if (handleOpenServiceAuth != null && handleOpenServiceAuth.containsKey("endCode")) {
                    MspPayResult mspPayResult = new MspPayResult(null);
                    mspPayResult.setEndCode(handleOpenServiceAuth.getString("endCode"));
                    mspPayResult.setMemo(handleOpenServiceAuth.getString("memo"));
                    mspPayResult.setResult(handleOpenServiceAuth.getString("result"));
                    return mspPayResult;
                }
            }
        }
        mspPaySession.ensureCallingPidUid();
        mspPaySession.updateOuterPackageNameByCallingUid();
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(bizId);
        if (tradeContextByBizId == null) {
            tradeContextByBizId = new MspTradeContext(mspPaySession);
            LogUtil.i("MspEngine", a.BRIDGE_ACTION_STARTPAYMENT, bizId + " new MspTradeContext created");
        } else {
            LogUtil.i("MspEngine", a.BRIDGE_ACTION_STARTPAYMENT, bizId + " MspTradeContext already exists");
        }
        MspPayResult startPay = tradeContextByBizId.startPay();
        LogUtil.i("MspEngine", a.BRIDGE_ACTION_STARTPAYMENT, bizId + " result=" + startPay);
        return startPay;
    }

    public static void startForkCashier(String str, int i, MspContext mspContext, MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ad48f7", new Object[]{str, new Integer(i), mspContext, mspTradeContext});
            return;
        }
        String AliyunSlot = Utils.AliyunSlot(str);
        if (i == 0) {
            i = Utils.getBizId(AliyunSlot);
        }
        int callingPid = Binder.getCallingPid();
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId == null) {
            String extendParamString = mspTradeContext == null ? null : mspTradeContext.getExtendParamString();
            if (mspTradeContext != null && !mspTradeContext.isFromWallet()) {
                z = false;
            }
            MspPaySession mspPaySession = new MspPaySession(AliyunSlot, extendParamString, z);
            mspPaySession.setBizId(i);
            mspPaySession.setCallingPid(callingPid);
            if (mspContext != null) {
                String apLinkTokenOrLogTraceId = mspContext.getApLinkTokenOrLogTraceId();
                if (!TextUtils.isEmpty(apLinkTokenOrLogTraceId)) {
                    mspPaySession.setApLinkToken(apLinkTokenOrLogTraceId);
                }
            }
            tradeContextByBizId = new MspTradeContext(mspPaySession);
            if (mspContext != null && !TextUtils.isEmpty(mspContext.getTradeNo())) {
                tradeContextByBizId.getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", mspContext.getTradeNo());
            }
            LogUtil.i("MspEngine", "startForkCashier", "new MspTradeContext created ".concat(String.valueOf(i)));
        } else {
            LogUtil.i("MspEngine", "startForkCashier", "MspTradeContext already exists ".concat(String.valueOf(i)));
        }
        if (mspTradeContext != null && mspTradeContext.getTradeLogicData() != null && mspTradeContext.getTradeLogicData().toTransfer() != null) {
            tradeContextByBizId.setTradeLogicData(mspTradeContext.getTradeLogicData().toTransfer());
        }
        LogUtil.i("MspEngine", "startForkCashier", "result= ".concat(String.valueOf(tradeContextByBizId.startPay())));
    }

    public static JSONObject getPreposeCashierRequestParams(Map<String, String> map, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("520aae1a", new Object[]{map, context}) : PackUtils.packPreposeCashierRequestData(map, context);
    }

    public static Map<String, Object> decCashierObfs(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8b1b0467", new Object[]{str}) : EncryptUtil.decCashierObfs(str);
    }
}
