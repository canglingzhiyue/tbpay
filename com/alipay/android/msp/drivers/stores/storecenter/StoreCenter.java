package com.alipay.android.msp.drivers.stores.storecenter;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.riy;

/* loaded from: classes3.dex */
public abstract class StoreCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f4652a;
    public MspContext b;
    public HashMap<String, LocalEventStore> c = new HashMap<>();
    public JSONObject d;

    public void doCleanBeforeWindowChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a08f7f", new Object[]{this, new Integer(i)});
        }
    }

    public abstract String handleAction(EventAction eventAction);

    public StoreCenter(MspContext mspContext) {
        this.f4652a = mspContext.getBizId();
        this.b = mspContext;
        this.d = FastStartActivityHelper.getJsonConfig(mspContext.getContext(), DrmKey.DEPRECATED_API);
    }

    public boolean isActionNameSupported(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d38bc98", new Object[]{this, str})).booleanValue();
        }
        LogUtil.record(2, "StoreCenter:isActionNameSupported", "pluginName-".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("loc:")) {
            str = str.substring(4);
        }
        if (str.startsWith("alias-")) {
            str = str.substring(6);
        }
        if (this.c.containsKey(str)) {
            return true;
        }
        if (JsonUtil.isJsonObjectString(str)) {
            for (String str2 : this.c.keySet()) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public LocalEventStore getJsPlugin(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocalEventStore) ipChange.ipc$dispatch("af8751cd", new Object[]{this, str}) : this.c.get(str);
    }

    public boolean a(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        JSONObject jSONObject;
        final StEvent stEvent;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f6f19d6", new Object[]{this, eventAction, mspEvent})).booleanValue();
        }
        if (this.b.getWorkerServiceDoc() != null) {
            try {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                JSONObject jSONObject2 = new JSONObject();
                if (mspEvent == null) {
                    StEvent stEvent2 = new StEvent("", "workService", "exeEvent_actionData");
                    JSONObject parseObject = JSONObject.parseObject(eventAction.getActionData());
                    if (parseObject != null && !parseObject.containsKey("action")) {
                        jSONObject2.put("action", (Object) parseObject);
                    } else if (parseObject != null && parseObject.containsKey("action")) {
                        jSONObject2 = parseObject;
                    }
                    stEvent = stEvent2;
                    jSONObject = jSONObject2;
                } else {
                    StEvent stEvent3 = new StEvent("", "workService", "exeEvent_" + mspEvent.getActionName());
                    JSONObject jSONObject3 = new JSONObject();
                    String str = "loc:" + mspEvent.getActionName();
                    if (mspEvent.getActionParamsArray() != null) {
                        String[] actionParamsArray = mspEvent.getActionParamsArray();
                        StringBuilder sb = new StringBuilder("loc:");
                        sb.append(mspEvent.getActionName());
                        sb.append(riy.BRACKET_START_STR);
                        int i2 = 0;
                        while (i2 < actionParamsArray.length) {
                            if (i2 != actionParamsArray.length - i) {
                                sb.append("'");
                                sb.append(actionParamsArray[i2]);
                                sb.append("',");
                            } else {
                                sb.append("'");
                                sb.append(actionParamsArray[i2]);
                                sb.append("')");
                            }
                            i2++;
                            i = 1;
                        }
                        str = sb.toString();
                    }
                    if (mspEvent.getActionParamsJson() != null) {
                        jSONObject3.put("params", (Object) mspEvent.getActionParamsJson());
                    }
                    jSONObject3.put("name", (Object) str);
                    jSONObject2.put("action", (Object) jSONObject3);
                    jSONObject = jSONObject2;
                    stEvent = stEvent3;
                }
                this.b.getStatisticInfo().addEvent(stEvent);
                LogUtil.record(2, "getWorkerServiceDoc", "getActionData=" + eventAction.getActionData() + ",  action=" + jSONObject.toJSONString());
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference = new AtomicReference();
                final JSONObject jSONObject4 = jSONObject;
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.storecenter.StoreCenter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        boolean z2 = false;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            FBDocument workerServiceDoc = StoreCenter.this.b.getWorkerServiceDoc();
                            if (workerServiceDoc != null) {
                                int executeJs = workerServiceDoc.executeJs("document.submit&&document.submit(" + jSONObject4.toJSONString() + ");");
                                stEvent.onStatistic(StEvent.CONVERT_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                                if (executeJs != 0) {
                                    StatisticInfo statisticInfo = StoreCenter.this.b.getStatisticInfo();
                                    if (!StoreCenter.this.b.isExit()) {
                                        statisticInfo.addError(ErrorType.DEFAULT, "event_dyapi_error", String.valueOf(executeJs) + "action=" + jSONObject4.toJSONString());
                                    }
                                    z = false;
                                }
                                try {
                                    LogUtil.record(2, "getWorkerServiceDoc", "res=".concat(String.valueOf(executeJs)));
                                    z2 = z;
                                } catch (Exception e) {
                                    e = e;
                                    z2 = z;
                                    LogUtil.printExceptionStackTrace(e);
                                    StoreCenter.this.b.getStatisticInfo().addError(ErrorType.DEFAULT, "event_dyapi_error", e);
                                    atomicReference.set(Boolean.valueOf(z2));
                                }
                            } else if (!StoreCenter.this.b.isExit()) {
                                StoreCenter.this.b.getStatisticInfo().addError("np", "event_no_main_service", Utils.truncateString(eventAction.getActionData(), 30));
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        try {
                            atomicReference.set(Boolean.valueOf(z2));
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
                });
                if (!(!countDownLatch.await(6L, TimeUnit.SECONDS))) {
                    return ((Boolean) atomicReference.get()).booleanValue();
                }
                this.b.getStatisticInfo().addError(ErrorType.DEFAULT, "event_dyapi_timeout", Utils.truncateString(eventAction.getActionData(), 30));
                return false;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                this.b.getStatisticInfo().addError(ErrorType.DEFAULT, "event_dyapi_error", e);
                return false;
            }
        }
        LogUtil.record(2, "getWorkerServiceDoc", "getActionData=" + eventAction.getActionData());
        if (this.b.isExit()) {
            return false;
        }
        this.b.getStatisticInfo().addError("np", "event_no_main_service", Utils.truncateString(eventAction.getActionData(), 30));
        return false;
    }

    public void a(EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf3d979", new Object[]{this, eventAction});
            return;
        }
        if (this.b == null) {
            this.b = MspContextManager.getInstance().getMspContextByBizId(this.f4652a);
        }
        if (eventAction == null || this.b == null) {
            return;
        }
        try {
            EventAction.MspEvent[] mspEvents = eventAction.getMspEvents();
            if (mspEvents == null || mspEvents.length <= 0) {
                return;
            }
            for (EventAction.MspEvent mspEvent : mspEvents) {
                if (!TextUtils.equals(mspEvent.getActionName(), MspEventTypes.ACTION_STRING_BNCB) && !TextUtils.equals(mspEvent.getActionName(), "continue") && !TextUtils.equals(mspEvent.getActionName(), "log") && !TextUtils.equals(mspEvent.getActionName(), MspEventTypes.ACTION_INVOKE_QR_GEN)) {
                    UserFeedBackUtil.getInstance().setUserFeedBackTag(null);
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Deprecated
    public boolean a(EventAction eventAction, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5491c73", new Object[]{this, eventAction, context})).booleanValue();
        }
        MspContext mspContext = this.b;
        boolean z = mspContext != null && mspContext.isGrayNative2Dyapi();
        EventAction.MspEvent[] mspEvents = eventAction.getMspEvents();
        if (mspEvents != null && context != null && z && !TextUtils.equals(eventAction.getEventFrom(), "invoke") && !TextUtils.equals(eventAction.getEventFrom(), "submit") && mspEvents.length > 1) {
            String actionData = eventAction.getActionData();
            if (!TextUtils.isEmpty(actionData) && actionData.contains(";loc")) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean a(EventAction eventAction, EventAction.MspEvent mspEvent, Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb83c23a", new Object[]{this, eventAction, mspEvent, context})).booleanValue();
        }
        MspContext mspContext = this.b;
        if (mspContext == null || !mspContext.isGrayNative2Dyapi()) {
            z = false;
        }
        if (eventAction.getMspEvents() != null && context != null && z && !TextUtils.equals(eventAction.getEventFrom(), "invoke") && !TextUtils.equals(eventAction.getEventFrom(), "submit")) {
            String actionName = mspEvent.getActionName();
            if (TextUtils.isEmpty(actionName)) {
                return false;
            }
            try {
                JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey("gray_dynamic_api");
                if (drmValueFromKey != null) {
                    String string = drmValueFromKey.getString(actionName);
                    if (!TextUtils.isEmpty(string)) {
                        boolean procGraySwitchWithRate = DrmManager.getInstance(context).procGraySwitchWithRate(context, Integer.parseInt(string));
                        LogUtil.record(2, "StoreCenter:needCastActionToDoc", "name=" + actionName + " needCastActionToDoc=" + procGraySwitchWithRate);
                        return procGraySwitchWithRate;
                    }
                }
            } catch (JSONException e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        return false;
    }

    public void registerJSPlugin(String str, LocalEventStore localEventStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564e61ea", new Object[]{this, str, localEventStore});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (localEventStore == null && !TextUtils.equals(str, "showLoading") && !TextUtils.equals(str, "hideLoading")) {
                return;
            }
            if (localEventStore != null && a(str, localEventStore.getContext())) {
                return;
            }
            this.c.put(str, localEventStore);
        }
    }

    public void cleanJsPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be5a94c", new Object[]{this});
            return;
        }
        HashMap<String, LocalEventStore> hashMap = this.c;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    private boolean a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e7fbda", new Object[]{this, str, context})).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                if (this.d != null) {
                    String string = this.d.getString(str);
                    if (!TextUtils.isEmpty(string)) {
                        boolean procGraySwitchWithRate = DrmManager.getInstance(context).procGraySwitchWithRate(context, Integer.parseInt(string));
                        LogUtil.record(2, "isDeprecatedApi", "apiName=" + str + " isDeprecatedApi=" + procGraySwitchWithRate);
                        return procGraySwitchWithRate;
                    }
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        return false;
    }
}
