package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.EventLogUtilMig;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.weex.common.WXConfig;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FeedbackStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FeedbackStore feedbackStore, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FeedbackStore(int i) {
        super(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r27, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r28) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.FeedbackStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("eventId");
            String string2 = parseObject.getString("bizCode");
            boolean booleanValue = parseObject.getBooleanValue("autoBizInfo");
            JSONObject jSONObject = parseObject.getJSONObject("data");
            HashMap hashMap = new HashMap();
            if (jSONObject != null && jSONObject.size() > 0) {
                for (String str2 : jSONObject.keySet()) {
                    hashMap.put(str2, jSONObject.getString(str2));
                }
            }
            if (booleanValue) {
                EventLogUtilMig.appendBizInfoToLogMap(hashMap, this.f4584a);
            }
            if (TextUtils.isEmpty(string2)) {
                EventLogUtil.logPayEvent(string, hashMap);
            } else {
                PhoneCashierMspEngine.getMspLog().walletEventLog(string, string2, hashMap);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                PhoneCashierMspEngine.getMspLog().walletBehaviorLog(parseObject.getString("type"), parseObject.getString("seedId"), parseObject.getString("ucId"), parseObject.getString("bizType"), parseObject.getString(WXConfig.logLevel), parseObject.getString(JarvisConstant.KEY_ACTION_ID), parseObject.getString("spmId"), parseObject.getString("param1"), parseObject.getString("param2"), parseObject.getString("param3"), parseObject.getString("param4"));
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public static String createSpmSessionId(int i, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfc3499b", new Object[]{new Integer(i), mspWindowFrame});
        }
        if (mspWindowFrame == null) {
            return null;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (mspContextByBizId != null) {
            return mspContextByBizId.getSpmSessionId();
        }
        return "dpCheck_" + String.valueOf(i) + GlobalHelper.getInstance().getUtdid(GlobalHelper.getInstance().getContext()) + "_null";
    }
}
