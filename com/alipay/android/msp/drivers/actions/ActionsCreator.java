package com.alipay.android.msp.drivers.actions;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.callback.NetActionCallback;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.NetAction;
import com.alipay.android.msp.drivers.actions.UIAction;
import com.alipay.android.msp.drivers.dipatchers.Call;
import com.alipay.android.msp.drivers.dipatchers.Callback;
import com.alipay.android.msp.drivers.dipatchers.MspResponse;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.network.model.CustomCallback;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class ActionsCreator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile SparseArray<ActionsCreator> b = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    private final MspContext f4564a;
    private Timer c;
    private final Timer d;
    private boolean e;
    private boolean f;

    public static /* synthetic */ MspContext a(ActionsCreator actionsCreator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("e2dc06d4", new Object[]{actionsCreator}) : actionsCreator.f4564a;
    }

    public static /* synthetic */ boolean a(ActionsCreator actionsCreator, Action action, Callback callback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("854091e3", new Object[]{actionsCreator, action, callback})).booleanValue() : actionsCreator.a(action, callback);
    }

    private ActionsCreator(MspContext mspContext) {
        this.f4564a = mspContext;
        Context context = mspContext.getContext();
        boolean z = true;
        this.e = context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_TIMER_RUNNABLE);
        this.f = (context == null || !FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) ? false : z;
        if (this.e) {
            this.c = new Timer("ActionsCreatorTimer:".concat(String.valueOf(mspContext)));
        }
        this.d = new Timer("ActionsCreatorCheckTimer:".concat(String.valueOf(mspContext)));
    }

    public static synchronized ActionsCreator get(MspContext mspContext) {
        synchronized (ActionsCreator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActionsCreator) ipChange.ipc$dispatch("16f85c23", new Object[]{mspContext});
            }
            if (b.get(mspContext.getBizId()) == null) {
                b.put(mspContext.getBizId(), new ActionsCreator(mspContext));
            }
            return b.get(mspContext.getBizId());
        }
    }

    public static synchronized void removeActionsCreator(int i) {
        synchronized (ActionsCreator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84979d29", new Object[]{new Integer(i)});
            } else {
                b.remove(i);
            }
        }
    }

    public MspResponse createUIFirstAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("224ba6f", new Object[]{this});
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.put(UIAction.DataKeys.isFirstEnter, Boolean.TRUE);
        return this.f4564a.getMspLogicClient().newCall(new UIAction(ActionTypes.UI_START, dataBundle)).execute();
    }

    public MspResponse createUIRecoverAction(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("eb322ab7", new Object[]{this, str, str2});
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.put(UIAction.DataKeys.isFirstEnter, Boolean.FALSE);
        dataBundle.put(UIAction.DataKeys.data, str);
        dataBundle.put(UIAction.DataKeys.action, str2);
        return this.f4564a.getMspLogicClient().newCall(new UIAction(ActionTypes.UI_START, dataBundle)).execute();
    }

    public MspResponse createUIShowAction(JSONObject jSONObject, boolean z, StEvent stEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("3cbecf95", new Object[]{this, jSONObject, new Boolean(z), stEvent});
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("rendData must not be empty");
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.put(UIAction.DataKeys.renderData, jSONObject);
        dataBundle.put(UIAction.DataKeys.fromSync, Boolean.valueOf(z));
        dataBundle.put(UIAction.DataKeys.statistic, stEvent);
        return this.f4564a.getMspLogicClient().newCall(new UIAction(ActionTypes.UI_SHOW, dataBundle)).execute();
    }

    public MspResponse createUIExitAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspResponse) ipChange.ipc$dispatch("6b732c3d", new Object[]{this}) : this.f4564a.getMspLogicClient().newCall(new UIAction(ActionTypes.EXIT, new DataBundle())).execute();
    }

    public MspResponse createExceptionAction(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("e7399bb7", new Object[]{this, th});
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.put(UIAction.DataKeys.exception, th);
        return this.f4564a.getMspLogicClient().newCall(new UIAction(ActionTypes.EXCEPTION, dataBundle)).execute();
    }

    public void createNetRequestAction(String str, String str2, EventAction eventAction, StEvent stEvent, CustomCallback customCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36712a27", new Object[]{this, str, str2, eventAction, stEvent, customCallback});
            return;
        }
        if (eventAction.getSubmitType() != EventAction.SubmitType.FirstRequest && eventAction.getSubmitType() != EventAction.SubmitType.FirstRequestAfterPage) {
            z = false;
        }
        NetAction put = new NetAction(ActionTypes.NET_REQUEST).put(NetAction.DataKeys.contentData, str).put(NetAction.DataKeys.actionJson, str2).put(NetAction.DataKeys.isFirstRequest, Boolean.valueOf(z)).put(NetAction.DataKeys.statistic, stEvent).put(NetAction.DataKeys.callback, customCallback);
        if (eventAction.getSubmitType() == EventAction.SubmitType.FirstRequestAfterPage && !TaskHelper.isMainThread()) {
            this.f4564a.getMspLogicClient().newCall(put).execute();
        } else {
            a(put, new NetActionCallback(this.f4564a));
        }
    }

    public boolean createNetRetryRequestAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1baf0649", new Object[]{this})).booleanValue() : a(new NetAction(ActionTypes.NET_RETRY), new NetActionCallback(this.f4564a));
    }

    private boolean a(Action action, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ab9b3", new Object[]{this, action, callback})).booleanValue();
        }
        if (callback == null) {
            try {
                callback = new Callback() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.drivers.dipatchers.Callback
                    public void onResponse(Call call, MspResponse mspResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("46e8ab36", new Object[]{this, call, mspResponse});
                        }
                    }

                    @Override // com.alipay.android.msp.drivers.dipatchers.Callback
                    public void onFailure(Call call, Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf48ae4f", new Object[]{this, call, exc});
                        } else {
                            LogUtil.printExceptionStackTrace("ActionsCreator", "enqueue action callback", exc);
                        }
                    }
                };
            } catch (NullPointerException e) {
                LogUtil.printExceptionStackTrace("ActionsCreator", "dispatchActionAsync null", e);
                return false;
            } catch (RejectedExecutionException e2) {
                LogUtil.printExceptionStackTrace("ActionsCreator", "dispatchActionAsync reject", e2);
                return false;
            } catch (Exception e3) {
                LogUtil.printExceptionStackTrace("ActionsCreator", "dispatchActionAsync Exception", e3);
                MspContext mspContext = this.f4564a;
                if (mspContext != null) {
                    StatisticInfo statisticInfo = mspContext.getStatisticInfo();
                    statisticInfo.addError(ErrorType.DEFAULT, "dispatchErr", action.getData().toString() + e3);
                }
                return false;
            }
        }
        this.f4564a.getMspLogicClient().newCall(action).enqueue(callback);
        return true;
    }

    public void createEventAction(final EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b1b6ec", new Object[]{this, eventAction});
        } else if (eventAction != null) {
            int delayTime = eventAction.getDelayTime();
            if (delayTime > 0) {
                LogUtil.i("ActionsCreator", "createEventAction", eventAction.hashCode() + " mDelayTime=" + delayTime);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                if (this.f) {
                    TaskHelper.getInstance().executeDelayed(new Runnable() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.i("ActionsCreator", "createEventAction", "threadHandler Runnable=" + eventAction);
                            atomicBoolean.set(true);
                            eventAction.setStartDispatchTime(SystemClock.elapsedRealtime());
                            ActionsCreator.a(ActionsCreator.this, eventAction, null);
                        }
                    }, delayTime, TaskHelper.ThreadName.EventAction);
                } else if (this.e) {
                    this.c.schedule(new TimerTask() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.i("ActionsCreator", "createEventAction", "timer Runnable=" + eventAction);
                            atomicBoolean.set(true);
                            eventAction.setStartDispatchTime(SystemClock.elapsedRealtime());
                            ActionsCreator.a(ActionsCreator.this, eventAction, null);
                        }
                    }, delayTime);
                } else {
                    TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.i("ActionsCreator", "createEventAction", "schedule Runnable=" + eventAction);
                            atomicBoolean.set(true);
                            eventAction.setStartDispatchTime(SystemClock.elapsedRealtime());
                            ActionsCreator.a(ActionsCreator.this, eventAction, null);
                        }
                    }, delayTime);
                }
                this.d.schedule(new TimerTask() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (atomicBoolean.get()) {
                        } else {
                            LogUtil.i("ActionsCreator", "createEventAction", "delay check result false");
                            StatisticInfo statisticInfo = ActionsCreator.a(ActionsCreator.this).getStatisticInfo();
                            statisticInfo.addError(ErrorType.DEFAULT, "DelayTask", "excDelayTooLong" + eventAction);
                        }
                    }
                }, delayTime * 5);
            } else if (eventAction.getMspEvents() != null && eventAction.getMspEvents().length == 1 && StringUtils.equals(eventAction.getMspEvents()[0].getActionName(), "submit")) {
                createEventActionThisThread(eventAction);
            } else {
                a(eventAction, null);
            }
        } else {
            LogUtil.e("ActionsCreator", "createEventAction", "eventAction=null");
        }
    }

    public String createEventActionThisThread(EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e9f8acc", new Object[]{this, eventAction});
        }
        if (eventAction != null) {
            try {
                eventAction.setStartDispatchTime(SystemClock.elapsedRealtime());
                JSONObject responseBody = this.f4564a.getMspLogicClient().newCall(eventAction).execute().getResponseBody();
                return (responseBody == null || !responseBody.containsKey("result")) ? "" : responseBody.getString("result");
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        } else {
            LogUtil.e("ActionsCreator", "createEventActionThisThread", "eventAction=null");
            this.f4564a.getStatisticInfo().addError(ErrorType.DEFAULT, "eventActionNull", "");
        }
        return "";
    }

    public void createSubmitEventAction(String str, String str2, EventAction.SubmitType submitType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b02bc71", new Object[]{this, str, str2, submitType, new Integer(i)});
            return;
        }
        EventAction eventAction = new EventAction("submit");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) str);
        if (submitType == EventAction.SubmitType.FirstRequest || submitType == EventAction.SubmitType.FirstRequestAfterPage) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(MspGlobalDefine.EXTERNAL_INFO, (Object) str2);
            jSONObject.put("params", (Object) jSONObject2);
        } else {
            jSONObject.put("params", (Object) str2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("action", (Object) jSONObject.toJSONString());
        eventAction.setActionData(jSONObject3.toJSONString());
        eventAction.setDelayTime(i);
        eventAction.setSubmitType(submitType);
        if (i > 0) {
            get(this.f4564a).createEventAction(eventAction);
        } else {
            createEventActionThisThread(eventAction);
        }
    }

    public void createDialogEventAction(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5666fd", new Object[]{this, str});
            return;
        }
        try {
            EventAction createMspEventWithJsonString = MspEventCreator.get().createMspEventWithJsonString("createDialogEventAction", str);
            if (createMspEventWithJsonString == null) {
                return;
            }
            createMspEventWithJsonString.setStartDispatchTime(SystemClock.elapsedRealtime());
            createMspEventWithJsonString.setEventFrom("submit");
            EventAction.MspEvent[] mspEvents = createMspEventWithJsonString.getMspEvents();
            if (mspEvents != null) {
                for (EventAction.MspEvent mspEvent : mspEvents) {
                    if (StringUtils.equals(mspEvent.getActionName(), "back")) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                EventAction.MspEvent[] mspEventArr = new EventAction.MspEvent[mspEvents.length - 1];
                boolean z2 = true;
                int i = 0;
                for (EventAction.MspEvent mspEvent2 : mspEvents) {
                    if (!z2 || !StringUtils.equals(mspEvent2.getActionName(), "back")) {
                        mspEventArr[i] = mspEvent2;
                        i++;
                    } else {
                        z2 = false;
                    }
                }
                createMspEventWithJsonString.setMspEvents(mspEventArr);
            }
            if (createMspEventWithJsonString.isDelayEventType()) {
                createMspEventWithJsonString.setDelayTime(400);
            }
            createEventAction(createMspEventWithJsonString);
        } catch (Exception e) {
            MspContext mspContext = this.f4564a;
            if (mspContext != null) {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, e.getClass().getName(), e);
            }
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
