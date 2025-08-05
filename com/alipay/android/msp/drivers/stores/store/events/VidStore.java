package com.alipay.android.msp.drivers.stores.store.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspViClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannelCallback;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VidStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public VidStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspViClient mspViClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.b == null || (mspViClient = this.b.getMspViClient()) == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        LogUtil.record(1, "VidStore:onDialogAction", "VIdJSON：" + actionParamsJson.toString() + " ");
        String string = actionParamsJson.getString("VIData");
        String string2 = actionParamsJson.getString("nextVid");
        LogUtil.record(1, "VidStore:onDialogAction", "nextVid：" + string2 + " ");
        if (!TextUtils.isEmpty(string2)) {
            mspViClient.setNextVid(string2);
        }
        VIMessageChannelCallback vIMessageChannelCallback = mspViClient.getVIMessageChannelCallback();
        if (vIMessageChannelCallback == null) {
            JSONObject parseObject = JSON.parseObject(string);
            String string3 = parseObject.getString(MspEventTypes.ACTION_STRING_VID);
            String string4 = parseObject.getString("data");
            LogUtil.record(1, "VidStore:onDialogAction", "verifyId::verifyData " + string3 + " " + string4);
            this.f.onStatistic("action", "vid|".concat(String.valueOf(string3)));
            if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4) && this.f4584a != null) {
                StatisticInfo statisticInfo = this.f4584a.getStatisticInfo();
                if (TextUtils.isEmpty(string)) {
                    string = "";
                }
                statisticInfo.addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_VID_DATA_ERROR, string);
            }
            PhoneCashierMspEngine.getMspViSec().unifiedStartByVerifyIdentity(this.e, string3, string4, actionParamsJson.toString());
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("data", string);
            this.f.onStatistic("action", "vid|");
            vIMessageChannelCallback.onResult(bundle);
        }
        return "";
    }
}
