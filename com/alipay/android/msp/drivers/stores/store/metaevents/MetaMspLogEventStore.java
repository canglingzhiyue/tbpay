package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.model.a;

/* loaded from: classes3.dex */
public class MetaMspLogEventStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaMspLogEventStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspWindowFrame findFrameBySender;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.c == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        String string = actionParamsJson.getString("type");
        String string2 = actionParamsJson.getString("name");
        String string3 = actionParamsJson.getString("currView");
        actionParamsJson.getString("nextView");
        actionParamsJson.getLongValue("prepTime");
        actionParamsJson.getLongValue("netTime");
        actionParamsJson.getLongValue(a.COL_S_TIME);
        actionParamsJson.getLongValue(StEvent.PARSE_TIME);
        actionParamsJson.getLongValue("bnParseTime");
        actionParamsJson.getLongValue("bnCreateTime");
        actionParamsJson.getLongValue(StEvent.SHOW_TIME);
        actionParamsJson.getLongValue("sendSize");
        actionParamsJson.getLongValue("recvSize");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return "";
        }
        if (this.f4584a != null && this.c != null && TextUtils.isEmpty(string3)) {
            string3 = this.f4584a.getCurrentWinTpName();
            MspWindowFrameStack frameStack = this.c.getFrameStack();
            if (frameStack != null && eventAction.getSender() != null && (findFrameBySender = frameStack.findFrameBySender(eventAction.getSender())) != null) {
                string3 = findFrameBySender.getTplId();
            }
        }
        if (this.f4584a == null) {
            return "";
        }
        this.f4584a.getStatisticInfo().addEvent(new StEvent(string3, string, string2));
        return "";
    }
}
