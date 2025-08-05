package com.alipay.android.msp.drivers.stores.store.events;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import anet.channel.Constants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.edit.EditTextManager;
import com.alipay.android.msp.utils.edit.EditTextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class SubmitStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean g;
    private MspWindowClient h;
    private final int i;
    private final Handler j;

    public static /* synthetic */ Object ipc$super(SubmitStore submitStore, String str, Object... objArr) {
        if (str.hashCode() == -610354464) {
            super.initWithContext();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(SubmitStore submitStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("989fd6ec", new Object[]{submitStore})).intValue() : submitStore.e;
    }

    public static /* synthetic */ MspTradeContext b(SubmitStore submitStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("c141d3ca", new Object[]{submitStore}) : submitStore.b;
    }

    public static /* synthetic */ MspTradeContext c(SubmitStore submitStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("4fcd54cb", new Object[]{submitStore}) : submitStore.b;
    }

    public static /* synthetic */ MspTradeContext d(SubmitStore submitStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("de58d5cc", new Object[]{submitStore}) : submitStore.b;
    }

    public SubmitStore(int i) {
        super(i);
        this.g = false;
        this.i = 4;
        this.j = new Handler(Looper.getMainLooper()) { // from class: com.alipay.android.msp.drivers.stores.store.events.SubmitStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(SubmitStore.a(SubmitStore.this));
                if (message.what != 4 || !(mspContextByBizId instanceof MspTradeContext)) {
                    return;
                }
                MspTradeContext mspTradeContext = (MspTradeContext) mspContextByBizId;
                if (mspTradeContext.isHasRPC()) {
                    return;
                }
                mspTradeContext.setSubmitState(false);
                StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                StringBuilder sb = new StringBuilder();
                sb.append(mspContextByBizId.getBizId());
                statisticInfo.addError(ErrorType.DEFAULT, "LoadingTimeout", sb.toString());
                ActionsCreator.get(mspContextByBizId).createExceptionAction(new RuntimeException(LanguageHelper.localizedStringForKey("msp_request_timeout", mspContextByBizId.getContext().getString(R.string.msp_request_timeout), new Object[0])));
            }
        };
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public void initWithContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9ebae0", new Object[]{this});
            return;
        }
        super.initWithContext();
        if (this.b == null || this.c == null) {
            return;
        }
        this.h = (MspWindowClient) this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01cd  */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r18, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r19) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.SubmitStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }

    private static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        long j = 0;
        String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_MiniPDialog_outtime");
        if (walletConfig != null && walletConfig.length() > 0) {
            try {
                j = Long.parseLong(walletConfig);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return j < Constants.RECV_TIMEOUT ? Constants.RECV_TIMEOUT : j;
    }

    private JSONObject[] a(EventAction eventAction) {
        JSONObject jSONObject;
        String str = "pwd";
        String str2 = "param";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject[]) ipChange.ipc$dispatch("b005a1b8", new Object[]{this, eventAction});
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            this.g = false;
            jSONObject = JSON.parseObject(eventAction.getActionData());
            if (jSONObject.containsKey(str2) || jSONObject.containsKey("params")) {
                if (!jSONObject.containsKey(str2)) {
                    str2 = "params";
                }
                jSONObject2 = jSONObject.getJSONObject(str2);
            }
            if (jSONObject.containsKey("action")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("action");
                if (jSONObject3.containsKey("params")) {
                    jSONObject2 = JsonUtil.merge(jSONObject2, jSONObject3.getJSONObject("params"));
                }
                jSONObject = jSONObject.getJSONObject("action");
                if (jSONObject.containsKey("viChannelMode") && jSONObject.getIntValue("viChannelMode") == 1) {
                    this.g = true;
                }
                if (!jSONObject2.containsKey(str)) {
                    str = jSONObject2.containsKey("spwd") ? "spwd" : "";
                }
                if (!TextUtils.isEmpty(str) && !this.g) {
                    String editTextContent = EditTextManager.getEditTextContent(this.e);
                    if (TextUtils.isEmpty(editTextContent)) {
                        editTextContent = jSONObject2.getString(str);
                    }
                    jSONObject2.put(str, (Object) editTextContent);
                    EditTextUtil editTextUtils = EditTextManager.getEditTextUtils();
                    if (editTextUtils != null) {
                        editTextUtils.clear(this.e);
                    }
                }
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return new JSONObject[]{jSONObject2, jSONObject};
    }

    private static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue() : jSONObject != null && jSONObject.toString().contains("VIData");
    }
}
