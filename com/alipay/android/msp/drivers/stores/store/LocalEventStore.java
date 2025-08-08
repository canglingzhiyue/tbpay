package com.alipay.android.msp.drivers.stores.store;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* loaded from: classes3.dex */
public abstract class LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MspContext f4584a;
    public MspTradeContext b;
    public MspUIClient c;
    public Context d;
    public int e;
    public StEvent f = new StEvent();

    public boolean a(String str, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d091bd", new Object[]{this, str, mspEvent})).booleanValue();
        }
        return false;
    }

    public abstract String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent);

    public LocalEventStore(int i) {
        this.e = i;
        initWithContext();
    }

    public void initWithContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9ebae0", new Object[]{this});
            return;
        }
        this.f4584a = MspContextManager.getInstance().getMspContextByBizId(this.e);
        MspContext mspContext = this.f4584a;
        if (mspContext == null) {
            return;
        }
        this.c = mspContext.getMspUIClient();
        this.d = this.f4584a.getContext();
        MspContext mspContext2 = this.f4584a;
        if (!(mspContext2 instanceof MspTradeContext)) {
            return;
        }
        this.b = (MspTradeContext) mspContext2;
    }

    public static void invokeCallback(final EventAction eventAction, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578879b", new Object[]{eventAction, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (eventAction == null) {
            LogUtil.record(8, "LocalEventStore:sendToDocument", "eventAction is null");
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(eventAction.getBizId());
        if (mspContextByBizId != null && mspContextByBizId.isUseSafeJsExecute()) {
            final ITemplateClickCallback templateClickCallback = eventAction.getTemplateClickCallback();
            if (templateClickCallback != null) {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.LocalEventStore.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            ITemplateClickCallback.this.onClickCallback(jSONObject.toJSONString());
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                    }
                });
                return;
            }
            try {
                FBDocument invokeDoc = eventAction.getInvokeDoc();
                long invokeFunKey = eventAction.getInvokeFunKey();
                if (invokeFunKey == 0) {
                    return;
                }
                MspRender.safeSendNativeResult(invokeDoc, invokeFunKey, jSONObject.toString());
                return;
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.LocalEventStore.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ITemplateClickCallback templateClickCallback2 = EventAction.this.getTemplateClickCallback();
                try {
                    if (templateClickCallback2 != null) {
                        templateClickCallback2.onClickCallback(jSONObject.toJSONString());
                        return;
                    }
                    FBDocument invokeDoc2 = EventAction.this.getInvokeDoc();
                    long invokeFunKey2 = EventAction.this.getInvokeFunKey();
                    if (invokeFunKey2 == 0) {
                        return;
                    }
                    JSPlugin.sendNativeResult(invokeDoc2, invokeFunKey2, jSONObject.toString());
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
            }
        });
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.d;
    }

    public final String onstMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspWindowFrame mspWindowFrame;
        JSONObject windowData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92cd172d", new Object[]{this, eventAction, mspEvent});
        }
        if (eventAction != null && mspEvent != null && this.f4584a != null) {
            try {
                this.f = new StEvent();
                MspWindowFrameStack windowStack = this.f4584a.getWindowStack();
                String str = "";
                if (windowStack != null) {
                    mspWindowFrame = windowStack.getTopTplOrNativeFrame();
                    if (mspWindowFrame != null) {
                        int windowType = mspWindowFrame.getWindowType();
                        if (windowType == 11) {
                            str = mspWindowFrame.getTplId();
                        } else if (windowType == 14 && (windowData = mspWindowFrame.getWindowData()) != null) {
                            str = windowData.getString("name");
                        }
                    }
                } else {
                    mspWindowFrame = null;
                }
                String actionName = mspEvent.getActionName();
                if (eventAction.getStartDispatchTime() != 0 && !StringUtils.equals(actionName, "submit")) {
                    this.f.onStatistic(StEvent.CONVERT_TIME, String.valueOf(SystemClock.elapsedRealtime() - eventAction.getStartDispatchTime()));
                }
                eventAction.setStartExecuteTime(SystemClock.elapsedRealtime());
                this.f.onStatistic(StEvent.CURRENT_VIEW, str);
                this.f.onStatistic("actionType", eventAction.getEventFrom());
                this.f.onStatistic("action", actionName);
                MqpBehavior.getInstance().onCashierCmd(this.f4584a, mspWindowFrame, mspEvent, eventAction);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        String simpleName = getClass().getSimpleName();
        if (!"LogStore".equals(simpleName) && !"FeedbackStore".equals(simpleName)) {
            LogUtil.i(simpleName, "onMspAction", eventAction.hashCode() + " " + eventAction.getType() + " " + JSON.toJSONString(mspEvent));
        }
        String onMspAction = onMspAction(eventAction, mspEvent);
        if (mspEvent != null && this.f4584a != null) {
            try {
                String actionName2 = mspEvent.getActionName();
                if (eventAction.getStartExecuteTime() != 0 && !StringUtils.equals(actionName2, "submit")) {
                    this.f.onStatistic(StEvent.PARSE_TIME, String.valueOf(SystemClock.elapsedRealtime() - eventAction.getStartExecuteTime()));
                }
                if (!StringUtils.equals(actionName2, "continue") && !StringUtils.equals(actionName2, "log") && !StringUtils.equals(actionName2, "feedback") && !StringUtils.equals(actionName2, MspEventTypes.ACTION_INVOKE_QR_GEN) && !StringUtils.equals(actionName2, MspEventTypes.ACTION_STRING_DATABASE) && !StringUtils.equals(actionName2, MspEventTypes.ACTION_META_MSP_LOG_ERROR) && !StringUtils.equals(actionName2, MspEventTypes.ACTION_META_MSP_LOG_PERF) && !StringUtils.equals(actionName2, MspEventTypes.ACTION_META_MSP_LOG_COUNT) && !StringUtils.equals(actionName2, MspEventTypes.ACTION_META_MSP_LOG_EVENT) && !StringUtils.equals(actionName2, MspEventTypes.ACTION_TPL_MSG) && !a(actionName2, mspEvent)) {
                    this.f4584a.getStatisticInfo().addEvent(this.f);
                }
                if (!StringUtils.equals(actionName2, MspEventTypes.ACTION_STRING_BNCB) && !StringUtils.equals(actionName2, "continue") && !StringUtils.equals(actionName2, "log") && !StringUtils.equals(actionName2, MspEventTypes.ACTION_INVOKE_QR_GEN) && !StringUtils.equals(actionName2, MspEventTypes.ACTION_STRING_DATABASE) && !StringUtils.equals(actionName2, MspEventTypes.ACTION_TPL_MSG)) {
                    UserFeedBackUtil.getInstance().setUserFeedBackTag(null);
                }
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
        }
        return onMspAction;
    }
}
