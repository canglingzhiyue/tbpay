package com.alipay.android.msp.drivers.stores.store.events;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.storecenter.StoreCenter;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.orange.OConstant;
import tb.jyx;

/* loaded from: classes3.dex */
public class InvokeQueryInfoStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeQueryInfoStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        String str;
        StEvent stEvent;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        String string = actionParamsJson.getString("queryKey");
        if (!StringUtils.isEmpty(string)) {
            char c = 65535;
            switch (string.hashCode()) {
                case -909043551:
                    if (string.equals("commonJSONInfo")) {
                        c = 4;
                        break;
                    }
                    break;
                case -800737816:
                    if (string.equals("apiInfo")) {
                        c = 1;
                        break;
                    }
                    break;
                case -139842824:
                    if (string.equals("configJSONInfo")) {
                        c = 3;
                        break;
                    }
                    break;
                case 831187728:
                    if (string.equals("configInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1499355507:
                    if (string.equals(UCPManager.APP_STATUS)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                string = jyx.a.POINT_NAME;
                if (c != 1) {
                    if (c == 2) {
                        String string2 = actionParamsJson.getString(OConstant.DIMEN_CONFIG_KEY);
                        boolean isDegrade = DrmManager.getInstance(this.d).isDegrade(string2, false, this.d);
                        jSONObject.put(string, (Object) Boolean.valueOf(isDegrade));
                        if (StringUtils.isEmpty(string2) && this.f != null) {
                            stEvent = this.f;
                            str2 = "queryInfo|" + string2 + "=" + isDegrade;
                        }
                    } else if (c == 3) {
                        String string3 = actionParamsJson.getString(OConstant.DIMEN_CONFIG_KEY);
                        JSONObject jSONObject2 = null;
                        try {
                            jSONObject2 = DrmManager.getInstance(this.d).getDrmValueFromKey(string3);
                            jSONObject.put("value", (Object) jSONObject2);
                        } catch (Throwable unused) {
                        }
                        if (!StringUtils.isEmpty(string3) && this.f != null) {
                            if (jSONObject2 != null) {
                                this.f.onStatistic("action", "queryInfo|" + string3 + "=" + Utils.truncateString(jSONObject2.toJSONString(), 30));
                            } else {
                                stEvent = this.f;
                                str2 = "queryInfo|" + string3 + "=null";
                            }
                        }
                    } else if (c == 4) {
                        boolean booleanValue = actionParamsJson.getBooleanValue("tid");
                        boolean booleanValue2 = actionParamsJson.getBooleanValue(MspGlobalDefine.UAC);
                        if (booleanValue) {
                            try {
                                jSONObject.put("tid", (Object) TidStorage.getInstance().getTid());
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                        if (booleanValue2) {
                            jSONObject.put(MspGlobalDefine.UAC, (Object) MspConfig.getInstance().getUserAgentC());
                        }
                    }
                    stEvent.onStatistic("action", str2);
                } else {
                    if (!InvokeActionPlugin.isJsPluginRegisterAsync()) {
                        String string4 = actionParamsJson.getString("apiName");
                        StoreCenter storeCenter = this.f4584a.getStoreCenter();
                        if (storeCenter != null) {
                            str = Boolean.valueOf(storeCenter.isActionNameSupported(string4));
                        }
                    }
                    str = Boolean.FALSE;
                }
            } else {
                str = PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(this.d) ? "background" : "foreground";
            }
            jSONObject.put(string, str);
        }
        return jSONObject.toJSONString();
    }
}
