package com.alipay.android.msp.core.section;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.db.MspDbManager;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.track.MspTrackInfo;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MqpBehavior implements IMqpSectionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MqpBehavior f4554a;

    private MqpBehavior() {
        MqpBizSection.checkConfig();
    }

    public static MqpBehavior getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MqpBehavior) ipChange.ipc$dispatch("1fb012a3", new Object[0]);
        }
        if (f4554a == null) {
            synchronized (MqpBehavior.class) {
                if (f4554a == null) {
                    f4554a = new MqpBehavior();
                }
            }
        }
        return f4554a;
    }

    private static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "MqpBehaviorEx|".concat(String.valueOf(str)), th);
        }
    }

    public void onServiceIn(final MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66b3018", new Object[]{this, mspContext});
            return;
        }
        try {
            final Context context = mspContext.getContext();
            MqpBizSection.handleService("service_in", mspContext);
            TaskHelper.executeForAI(new Runnable() { // from class: com.alipay.android.msp.core.section.MqpBehavior.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (AlertIntelligenceEngine.getInstance().byLogicContext()) {
                            String genToken = AlertIntelligenceEngine.getInstance().genToken();
                            if (mspContext != null) {
                                mspContext.setAlertIntelligenceToken(genToken);
                            }
                        } else {
                            MspDbManager dbManager = MspDbManager.getDbManager();
                            Context context2 = context;
                            if (MspExtSceneManager.getInstance(context).checkIsBigScreen() || MspExtSceneManager.getInstance(context).checkAccessibilityEnabled() || PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(mspContext.getBizId())) {
                                z = true;
                            }
                            dbManager.init(context2, z);
                        }
                        JSONObject jSONObject = new JSONObject();
                        String apLinkToken = mspContext.getApLinkToken();
                        if (!TextUtils.isEmpty(apLinkToken)) {
                            jSONObject.put("aplinktoken", (Object) apLinkToken);
                        }
                        AlertIntelligenceEngine.recordBizInfo(mspContext, "contextInit");
                        AlertIntelligenceEngine.recordBizInfoFirst(mspContext);
                        AlertIntelligenceEngine.startRecord(mspContext, "");
                        AlertIntelligenceEngine.startAction(mspContext, "service_in", mspContext.getClass().getSimpleName(), jSONObject.toJSONString(), "", "");
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        } catch (Throwable th) {
            a("onServiceIn", th);
        }
    }

    public void onServiceOut(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1693f95", new Object[]{this, mspContext});
            return;
        }
        try {
            MqpBizSection.handleService("service_out", mspContext);
            if (mspContext == null) {
                return;
            }
            MspWindowFrame topTplOrNativeFrame = mspContext.getWindowStack() != null ? mspContext.getWindowStack().getTopTplOrNativeFrame() : null;
            String attr = mspContext.getStatisticInfo().getAttr(Vector.Trade, "bizType");
            AlertIntelligenceEngine.startAction(mspContext, "service_out", mspContext.getClass().getSimpleName(), mspContext.uploadChanges(attr).toJSONString(), topTplOrNativeFrame == null ? "" : topTplOrNativeFrame.getFrameId(), topTplOrNativeFrame == null ? "" : topTplOrNativeFrame.getTplId());
            AlertIntelligenceEngine.recordBizInfo(mspContext, "contextExit");
            AlertIntelligenceEngine.recordBizInfoThird(mspContext, mspContext.getStatisticInfo().getAttr(Vector.Trade, "tradeNo"), mspContext.getStatisticInfo().getAttr(Vector.Id, "sessionId"), mspContext.getStatisticInfo().getAttr(Vector.Trade, "outTradeNo"), mspContext.getStatisticInfo().getAttr(Vector.Trade, "payerId"), attr, mspContext.getStatisticInfo().getAttr(Vector.Result, "endCode"), topTplOrNativeFrame == null ? "" : topTplOrNativeFrame.getTplId());
        } catch (Throwable th) {
            a("onServiceOut", th);
        }
    }

    public void onPageIn(MspContext mspContext, MspTrackInfo.SpmInfo spmInfo, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7201d2dd", new Object[]{this, mspContext, spmInfo, mspWindowFrame});
            return;
        }
        try {
            MqpBizSection.handlePage("page_in", mspContext, spmInfo, mspWindowFrame);
            if (spmInfo == null || mspWindowFrame == null) {
                return;
            }
            AlertIntelligenceEngine.startAction(mspContext, "page_in", spmInfo.spmId, mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
        } catch (Throwable th) {
            a("onPageIn", th);
        }
    }

    public void onPageAppear(MspContext mspContext, MspTrackInfo.SpmInfo spmInfo, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa14a36d", new Object[]{this, mspContext, spmInfo, mspWindowFrame});
            return;
        }
        try {
            MqpBizSection.handlePage("page_appear", mspContext, spmInfo, mspWindowFrame);
            if (spmInfo == null || mspWindowFrame == null) {
                return;
            }
            JSONObject pickAsNew = JsonUtil.pickAsNew(mspWindowFrame.getTplString(), "tplVersion", "time");
            AlertIntelligenceEngine.startAction(mspContext, "page_appear", spmInfo.spmId, pickAsNew != null ? pickAsNew.toString() : null, mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
        } catch (Throwable th) {
            a("onPageAppear", th);
        }
    }

    public void onPageOut(MspContext mspContext, MspTrackInfo.SpmInfo spmInfo, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99dc7330", new Object[]{this, mspContext, spmInfo, mspWindowFrame});
            return;
        }
        try {
            MqpBizSection.handlePage("page_out", mspContext, spmInfo, mspWindowFrame);
            if (spmInfo == null || mspWindowFrame == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", (Object) Integer.valueOf(mspWindowFrame.getClickCount()));
            jSONObject.put("clickInfo", (Object) mspWindowFrame.getClickInfo());
            AlertIntelligenceEngine.startAction(mspContext, "page_out", spmInfo.spmId, jSONObject.toJSONString(), mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
        } catch (Throwable th) {
            a("onPageOut", th);
        }
    }

    public void onCashierRpcStart(MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d687a9e2", new Object[]{this, mspTradeContext, str});
            return;
        }
        try {
            MqpBizSection.handleRpc("rpc_cashier_start", mspTradeContext, null, str);
            AlertIntelligenceEngine.startAction(mspTradeContext, "rpc_cashier_start", str, null, null);
        } catch (Throwable th) {
            a("onCashierRpcStart", th);
        }
    }

    public void onCashierRpcEnd(MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10344409", new Object[]{this, mspTradeContext, str});
            return;
        }
        try {
            MqpBizSection.handleRpc("rpc_cashier_end", mspTradeContext, null, str);
            AlertIntelligenceEngine.startAction(mspTradeContext, "rpc_cashier_end", str, null, null);
        } catch (Throwable th) {
            a("onCashierRpcEnd", th);
        }
    }

    public void onGeneralRpcStart(MspContext mspContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0e5337", new Object[]{this, mspContext, str, str2});
            return;
        }
        try {
            MqpBizSection.handleRpc("rpc_general_start", mspContext, str, str2);
            AlertIntelligenceEngine.startAction(mspContext, "rpc_general_start", str, null, null);
        } catch (Throwable th) {
            a("onGeneralRpcStart", th);
        }
    }

    public void onGeneralRpcEnd(MspContext mspContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b31f5b0", new Object[]{this, mspContext, str, str2});
            return;
        }
        try {
            MqpBizSection.handleRpc("rpc_general_end", mspContext, str, str2);
            AlertIntelligenceEngine.startAction(mspContext, "rpc_general_end", str, null, null);
        } catch (Throwable th) {
            a("onGeneralRpcEnd", th);
        }
    }

    public void onSync(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5f1221", new Object[]{this, mspContext, str});
            return;
        }
        try {
            MqpBizSection.handleBase("sync", mspContext);
            AlertIntelligenceEngine.startAction(mspContext, "sync", str, null, null);
        } catch (Throwable th) {
            a("onSync", th);
        }
    }

    public void onIdleOperation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1462db", new Object[]{this});
            return;
        }
        try {
            MqpBizSection.handleBase(IMqpSectionListener.SECTION_IDLE_OPERATION, null);
        } catch (Throwable th) {
            a("onIdleOperation", th);
        }
    }

    public void didEnterBackground(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d489e24", new Object[]{this, mspContext});
            return;
        }
        try {
            MqpBizSection.handleBase(IMqpSectionListener.SECTION_ENTER_BACKGROUND, mspContext);
            if (mspContext == null) {
                return;
            }
            MspWindowFrame topTplOrNativeFrame = mspContext.getWindowStack() != null ? mspContext.getWindowStack().getTopTplOrNativeFrame() : null;
            String str = mspContext.getClass().getSimpleName() + "_onStop";
            String str2 = "";
            String frameId = topTplOrNativeFrame == null ? str2 : topTplOrNativeFrame.getFrameId();
            if (topTplOrNativeFrame != null) {
                str2 = topTplOrNativeFrame.getTplId();
            }
            AlertIntelligenceEngine.startAction(mspContext, "sys", str, frameId, str2);
        } catch (Throwable th) {
            a("didEnterBackground", th);
        }
    }

    public void willEnterForeground(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3be0986", new Object[]{this, mspContext});
            return;
        }
        try {
            MqpBizSection.handleBase(IMqpSectionListener.SECTION_ENTER_FOREGROUND, mspContext);
            MspWindowFrame topTplOrNativeFrame = mspContext.getWindowStack() != null ? mspContext.getWindowStack().getTopTplOrNativeFrame() : null;
            String str = mspContext.getClass().getSimpleName() + "_onRestart";
            String str2 = "";
            String frameId = topTplOrNativeFrame == null ? str2 : topTplOrNativeFrame.getFrameId();
            if (topTplOrNativeFrame != null) {
                str2 = topTplOrNativeFrame.getTplId();
            }
            AlertIntelligenceEngine.startAction(mspContext, "sys", str, frameId, str2);
        } catch (Throwable th) {
            a("willEnterForeground", th);
        }
    }

    public void onBackPressed(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b9d3d9", new Object[]{this, mspContext});
            return;
        }
        try {
            MqpBizSection.handleBase("back_key", mspContext);
            AlertIntelligenceEngine.startAction(mspContext, "back_key", "", "", "");
        } catch (Throwable th) {
            a("onBackPressed", th);
        }
    }

    public void onCashierCmd(MspContext mspContext, MspWindowFrame mspWindowFrame, EventAction.MspEvent mspEvent, EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233352e3", new Object[]{this, mspContext, mspWindowFrame, mspEvent, eventAction});
        } else if (mspEvent == null || eventAction == null) {
        } else {
            try {
                String actionName = mspEvent.getActionName();
                MqpBizSection.handleCmd(mspContext, mspEvent);
                if (TextUtils.equals(actionName, "continue") || TextUtils.equals(actionName, "feedback") || TextUtils.equals(actionName, MspEventTypes.ACTION_TPL_MSG) || TextUtils.equals(actionName, MspEventTypes.ACTION_STRING_BNCB) || TextUtils.equals(actionName, "log") || TextUtils.equals(actionName, MspEventTypes.ACTION_INVOKE_QR_GEN) || TextUtils.equals(actionName, MspEventTypes.ACTION_STRING_DATABASE)) {
                    return;
                }
                String str = eventAction.getEventFrom() + "_" + mspEvent.getActionName();
                String str2 = "";
                String frameId = mspWindowFrame == null ? str2 : mspWindowFrame.getFrameId();
                if (mspWindowFrame != null) {
                    str2 = mspWindowFrame.getTplId();
                }
                AlertIntelligenceEngine.startAction(mspContext, "act", str, frameId, str2);
            } catch (Throwable th) {
                a("onCashierCmd", th);
            }
        }
    }

    public void onNotificationReceived(MspContext mspContext, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9987fc62", new Object[]{this, mspContext, str, new Boolean(z)});
            return;
        }
        try {
            MqpBizSection.handleNotificationClicked(mspContext, str, z);
        } catch (Throwable th) {
            a("onNotificationReceived", th);
        }
    }
}
