package com.alipay.android.msp.network;

import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionTypes;
import com.alipay.android.msp.drivers.actions.NetAction;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.network.model.CustomCallback;
import com.alipay.android.msp.network.model.NetRequestData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class MspNetworkClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private NetAction f4917a = null;
    private final MspTradeContext b;
    private final MspRequestSender c;

    /* renamed from: com.alipay.android.msp.network.MspNetworkClient$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4918a = new int[ActionTypes.values().length];

        static {
            try {
                f4918a[ActionTypes.NET_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4918a[ActionTypes.NET_RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4918a[ActionTypes.NET_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final boolean handleAction(NetAction netAction) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4c5ac77", new Object[]{this, netAction})).booleanValue();
        }
        if (netAction == null) {
            LogUtil.record(8, "MspNetworkClient", "handleRequestAction", "ignoring invalid action");
            return false;
        }
        LogUtil.record(2, "MspNetworkClient", "handleRequestAction", "begin with action: " + netAction.hashCode());
        ActionTypes type = netAction.getType();
        int i = AnonymousClass1.f4918a[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                LogUtil.record(8, "MspNetworkClient", "handleRequestAction", "not implemented type: ".concat(String.valueOf(type)));
                return false;
            }
            NetAction netAction2 = this.f4917a;
            if (netAction2 != null) {
                LogUtil.record(2, "MspNetworkClient", "retryLastAction", "retrying: ".concat(String.valueOf(netAction2)));
                netAction2.retryCount++;
                this.b.getMspLogicClient().newCall(netAction2).execute();
                return true;
            }
            LogUtil.record(4, "MspNetworkClient", "retryLastAction", "cannot retry, action is null");
            throw new RuntimeException("MspNetworkCLient: lastAction is null, cannot retry last action");
        }
        Boolean bool = (Boolean) netAction.get(NetAction.DataKeys.isFirstRequest, Boolean.class);
        String str = (String) netAction.get(NetAction.DataKeys.contentData, String.class);
        String str2 = (String) netAction.get(NetAction.DataKeys.actionJson, String.class);
        StEvent stEvent = (StEvent) netAction.get(NetAction.DataKeys.statistic, StEvent.class);
        CustomCallback customCallback = (CustomCallback) netAction.get(NetAction.DataKeys.callback, CustomCallback.class);
        if (bool == null || str == null || customCallback == null) {
            LogUtil.record(8, "MspNetworkClient", "handleRequestAction", "ignoring invalid action - missing key(s)");
            return false;
        }
        this.f4917a = netAction;
        boolean booleanValue = bool.booleanValue();
        this.b.getTradeLogicData().setFirstRequest(booleanValue);
        RequestConfig requestConfig = new RequestConfig(str, str2, this.b.getBizId(), booleanValue);
        TradeLogicData tradeLogicData = this.b.getTradeLogicData();
        if (tradeLogicData != null) {
            requestConfig.setHasTryLogin(tradeLogicData.hasTryLogin());
            requestConfig.setSessionId(tradeLogicData.getSessionId());
            requestConfig.isSupportGzip(tradeLogicData.isIsSupportGzip());
            requestConfig.setmUac(tradeLogicData.getUac());
        }
        if (booleanValue) {
            requestConfig.setType("cashier");
            requestConfig.setMethod("main");
        }
        requestConfig.setFromWallet(this.b.isFromWallet());
        requestConfig.setExtendParamsMap(this.b.getExtendParamsMap());
        requestConfig.setStatisticEvent(stEvent);
        this.c.a(new NetRequestData(requestConfig, str, customCallback), booleanValue);
        return true;
    }

    public MspNetworkClient(MspTradeContext mspTradeContext) {
        LogUtil.i("MspNetworkClient", "MspNetworkClient", String.format("constructed with %s", mspTradeContext));
        this.b = mspTradeContext;
        this.c = new MspRequestSender(mspTradeContext);
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<MspNetworkClient of trade %s>", Integer.valueOf(this.b.getBizId()));
    }
}
