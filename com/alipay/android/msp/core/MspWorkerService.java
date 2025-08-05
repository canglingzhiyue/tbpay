package com.alipay.android.msp.core;

import android.app.Activity;
import android.os.SystemClock;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.callback.IRenderCallback;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.events.DatabaseStore;
import com.alipay.android.msp.drivers.stores.store.events.FeedbackStore;
import com.alipay.android.msp.drivers.stores.store.events.TplMsgStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.RenderConfig;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MspWorkerService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void doLoadWorkerFbDocument(final Activity activity, final int i) {
        final MspContext mspContextByBizId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d4c384", new Object[]{activity, new Integer(i)});
        } else if (activity == null) {
            LogUtil.record(4, "MspWorkerService:doLoadWorkerFbDocument", "context=" + ((Object) null) + " bizId=" + i);
        } else if (AlertIntelligenceEngine.getInstance().byLogicContext() || (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i)) == null || (mspContextByBizId instanceof MspContainerContext) || mspContextByBizId.getWorkerServiceDoc() != null) {
        } else {
            LogUtil.record(4, "MspWorkerService:doLoadWorkerFbDocument", "try doLoadWorkerFbDocument");
            boolean isGray = DrmManager.getInstance(activity).isGray(DrmKey.GRAY_NATIVE_TO_DYAPI, false, activity);
            mspContextByBizId.setGrayNative2Dyapi(isGray);
            if (!isGray) {
                return;
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.MspWorkerService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            StEvent stEvent = new StEvent("", "workService", "loadDoc");
                            stEvent.onStatistic(StEvent.CONVERT_TIME, String.valueOf(elapsedRealtime2 - elapsedRealtime));
                            IRenderCallback iRenderCallback = new IRenderCallback() { // from class: com.alipay.android.msp.core.MspWorkerService.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.msp.core.callback.IRenderCallback
                                public void onEvent(Object obj, String str) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("9d9ed8a8", new Object[]{this, obj, str});
                                    } else {
                                        onAsyncEvent(null, obj, str);
                                    }
                                }

                                @Override // com.alipay.android.msp.core.callback.IRenderCallback
                                public void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str) {
                                    IpChange ipChange3 = $ipChange;
                                    int i2 = 0;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("ea659cdf", new Object[]{this, iTemplateClickCallback, obj, str});
                                        return;
                                    }
                                    EventAction createMspEventWithJsonString = MspEventCreator.get().createMspEventWithJsonString("workService.IRenderCallback.onAsyncEvent", str);
                                    if (createMspEventWithJsonString == null) {
                                        return;
                                    }
                                    createMspEventWithJsonString.setSender(obj);
                                    createMspEventWithJsonString.setEventFrom("submit");
                                    if (iTemplateClickCallback != null) {
                                        createMspEventWithJsonString.setTemplateClickCallback(iTemplateClickCallback);
                                    }
                                    EventAction.MspEvent[] mspEvents = createMspEventWithJsonString.getMspEvents();
                                    int length = mspEvents.length;
                                    boolean z = false;
                                    while (true) {
                                        if (i2 < length) {
                                            EventAction.MspEvent mspEvent = mspEvents[i2];
                                            if (mspEvent != null && "feedback".equals(mspEvent.getActionName())) {
                                                new FeedbackStore(i).onstMspAction(createMspEventWithJsonString, mspEvent);
                                                z = true;
                                                break;
                                            }
                                            if (mspEvent != null && MspEventTypes.ACTION_STRING_DATABASE.equals(mspEvent.getActionName())) {
                                                new DatabaseStore(i).onstMspAction(createMspEventWithJsonString, mspEvent);
                                            } else {
                                                if (mspEvent != null && MspEventTypes.ACTION_TPL_MSG.equals(mspEvent.getActionName())) {
                                                    new TplMsgStore(i).onstMspAction(createMspEventWithJsonString, mspEvent);
                                                }
                                                i2++;
                                            }
                                            z = true;
                                            i2++;
                                        } else {
                                            break;
                                        }
                                    }
                                    if (z) {
                                        return;
                                    }
                                    ActionsCreator.get(mspContextByBizId).createEventAction(createMspEventWithJsonString);
                                }
                            };
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("trace", mspContextByBizId.getAlertIntelligenceId());
                            jSONObject.put("serviceId", String.valueOf(i));
                            jSONObject.put("bizType", TradeCollector.getBizType(i));
                            if (mspContextByBizId instanceof MspTradeContext) {
                                MspTradeContext mspTradeContext = (MspTradeContext) mspContextByBizId;
                                jSONObject.put("order_str", mspTradeContext.getOrderInfo());
                                if (mspTradeContext.getOrderInfoMap() != null) {
                                    jSONObject.put("trade_no", mspTradeContext.getOrderInfoMap().get("trade_no"));
                                }
                                jSONObject.put("ap_link_token", mspTradeContext.getApLinkToken());
                            }
                            FBDocument fBDocument = (FBDocument) ((PreparedResult) PluginManager.getRender().preloadView(activity, i, MspFlybirdDefine.FLYBIRD_MAIN_SERVICE_TPL, "", jSONObject.toString(), null, null, iRenderCallback, new RenderConfig(true))).mResult;
                            if (fBDocument != null) {
                                mspContextByBizId.setWorkerServiceDoc(fBDocument);
                            }
                            stEvent.onStatistic(StEvent.PARSE_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime2));
                            mspContextByBizId.getStatisticInfo().addEvent(stEvent);
                            AlertIntelligenceEngine.startAction(mspContextByBizId, AlertIntelligenceEngine.ACTION_MAIN_SERVICE_RENDER_FINISH, "", null, null);
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                    }
                });
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
