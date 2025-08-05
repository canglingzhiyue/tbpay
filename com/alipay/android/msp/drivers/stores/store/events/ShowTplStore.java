package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ShowTplStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShowTplStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspWindowFrameStack frameStack;
        MspWindowFrameStack frameStack2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null || this.c.getCurrentPresenter().mo545getIView() == null) {
            return null;
        }
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson != null) {
            StEvent stEvent = this.f;
            stEvent.onStatistic("action", MspEventTypes.ACTION_STRING_SHOWTPL + Utils.truncateString(actionParamsJson.toJSONString(), 50));
        }
        try {
            if (actionParamsArray != null && actionParamsArray.length > 0) {
                MspWindowFrame mspWindowFrame = new MspWindowFrame();
                mspWindowFrame.setStatisticEvent(this.f);
                mspWindowFrame.setTplId(actionParamsArray[0]);
                if (actionParamsArray.length > 1) {
                    mspWindowFrame.setTplString(new String(Base64.decode(actionParamsArray[1], 2)));
                }
                mspWindowFrame.setTemplateContentData(actionParamsArray.length > 2 ? JSON.parseObject(new String(Base64.decode(actionParamsArray[2], 2))) : new JSONObject());
                mspWindowFrame.setWindowType(11);
                if (this.c == null || (frameStack2 = this.c.getFrameStack()) == null) {
                    return "";
                }
                frameStack2.pushFrame(mspWindowFrame);
                return "";
            } else if (actionParamsJson == null) {
                return "";
            } else {
                String string = actionParamsJson.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID);
                String string2 = actionParamsJson.getString("tpl");
                String string3 = actionParamsJson.getString("data");
                String string4 = actionParamsJson.getString("noback");
                MspWindowFrame mspWindowFrame2 = new MspWindowFrame();
                mspWindowFrame2.setStatisticEvent(this.f);
                mspWindowFrame2.setTplId(string);
                if (!TextUtils.isEmpty(string2)) {
                    mspWindowFrame2.setTplString(new String(Base64.decode(string2, 2)));
                }
                mspWindowFrame2.setTemplateContentData(!TextUtils.isEmpty(string3) ? JSON.parseObject(new String(Base64.decode(string3, 2))) : new JSONObject());
                mspWindowFrame2.setNoBackTag(Integer.parseInt(string4));
                mspWindowFrame2.setWindowType(11);
                if (this.c == null || (frameStack = this.c.getFrameStack()) == null) {
                    return "";
                }
                frameStack.pushFrame(mspWindowFrame2);
                return "";
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }
}
