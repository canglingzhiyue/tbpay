package com.alipay.android.msp.core.section;

import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.section.MqpSectionModel;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.track.MspTrackInfo;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class MqpBizSection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MqpBizSection";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f4556a = false;
    private static JSONArray b;

    public static void checkConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793eadf1", new Object[0]);
            return;
        }
        f4556a = TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_gray_biz_worker"), "10000");
        String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_config_pay_worker_cmd_list");
        LogUtil.record(2, TAG, "MQP_config_pay_worker_cmd_list=".concat(String.valueOf(walletConfig)));
        if (TextUtils.isEmpty(walletConfig)) {
            return;
        }
        try {
            b = new JSONArray(walletConfig);
        } catch (JSONException unused) {
        }
    }

    public static void fillSectionModel(String str, MqpSectionModel mqpSectionModel, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75af1a2d", new Object[]{str, mqpSectionModel, mspContext});
        } else if (mspContext == null) {
        } else {
            boolean z2 = mspContext instanceof MspTradeContext;
            try {
                MspWindowFrame topTplFrame = mspContext.getWindowStack() != null ? mspContext.getWindowStack().getTopTplFrame() : null;
                if (topTplFrame != null) {
                    mqpSectionModel.getPageInfo().tplInfo(topTplFrame.getTplId(), topTplFrame.getTplString()).isPayFirstPage(topTplFrame.isFirstTplFrame() && z2).clickCnt(topTplFrame.getClickCount());
                }
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "MqpBehaviorEx|fillSectionModel_".concat(String.valueOf(str)), th);
            }
            int bizId = mspContext.getBizId();
            if (z2) {
                MspTradeContext mspTradeContext = (MspTradeContext) mspContext;
                MqpSectionModel.PaySessionInfo outTradeLaunchType = mqpSectionModel.getPaySessionInfo().sessionId(mspContext.getGlobalSession()).orderStr(mspTradeContext.getOrderInfo()).clientLogData(mspTradeContext.getClientLogData()).clientBizType(mspContext.getStatisticInfo().getAttr(Vector.Trade, "bizType")).endCode(mspContext.getStatisticInfo().getAttr(Vector.Result, "endCode")).outTradeLaunchType(mspContext.getStatisticInfo().getAttr(Vector.Trade, "processTime"));
                if (!mspContext.isFromWallet() || mspContext.isFromOutScheme()) {
                    z = false;
                }
                outTradeLaunchType.trdfrom(z);
            }
            mqpSectionModel.getSectionParams().serviceId(bizId);
            mqpSectionModel.getSectionParams().apLinkToken(mspContext.getApLinkToken());
        }
    }

    private static void a(final MqpSectionModel mqpSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e17007", new Object[]{mqpSectionModel});
        } else if (!f4556a || mqpSectionModel == null || !mqpSectionModel.dataReady()) {
        } else {
            TaskHelper.executeForAI(new Runnable() { // from class: com.alipay.android.msp.core.section.MqpBizSection.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        PhoneCashierMspEngine.getMqpBizSectionEngine().callSection(MqpSectionModel.this.buildJson());
                    } catch (Throwable th) {
                        LogUtil.record(8, MqpBizSection.TAG, "exception: ".concat(String.valueOf(th)));
                    }
                }
            });
        }
    }

    public static void handleBase(String str, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af971460", new Object[]{str, mspContext});
        } else if (!f4556a) {
        } else {
            a(MqpSectionModel.buildBaseMode(str, mspContext));
        }
    }

    public static void handleService(String str, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5203b4", new Object[]{str, mspContext});
        } else if (!f4556a) {
        } else {
            a(new MqpSectionModel(str, new MqpSectionModel.ServiceParams(mspContext != null ? mspContext.getContextType() : "unknown"), mspContext));
        }
    }

    public static void handlePage(String str, MspContext mspContext, MspTrackInfo.SpmInfo spmInfo, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ccc6cf", new Object[]{str, mspContext, spmInfo, mspWindowFrame});
        } else if (!f4556a) {
        } else {
            MqpSectionModel buildBaseMode = MqpSectionModel.buildBaseMode(str, mspContext);
            if (mspWindowFrame != null) {
                buildBaseMode.getPageInfo().tplInfo(mspWindowFrame.getTplId(), mspWindowFrame.getTplString()).clickCnt(mspWindowFrame.getClickCount());
            }
            a(buildBaseMode);
        }
    }

    public static void handleRpc(String str, MspContext mspContext, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a201f8", new Object[]{str, mspContext, str2, str3});
        } else if (!f4556a) {
        } else {
            a(new MqpSectionModel(str, new MqpSectionModel.RpcParams(str2, str3), mspContext));
        }
    }

    public static void handleCmd(MspContext mspContext, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b16e1c", new Object[]{mspContext, mspEvent});
        } else if (!f4556a) {
        } else {
            String actionName = mspEvent.getActionName();
            String jSONString = mspEvent.getActionParamsJson() != null ? mspEvent.getActionParamsJson().toJSONString() : null;
            String[] actionParamsArray = mspEvent.getActionParamsArray();
            if (!TextUtils.equals(actionName, MspEventTypes.ACTION_STRING_OPENWEB) && !TextUtils.equals(actionName, MspEventTypes.ACTION_STRING_OPENURL) && !TextUtils.equals(actionName, MspEventTypes.ACTION_META_OPENURL) && !TextUtils.equals(actionName, MspEventTypes.ACTION_STRING_VID) && !a(actionName)) {
                return;
            }
            a(new MqpSectionModel(IMqpSectionListener.SECTION_CASHIER_CMD, new MqpSectionModel.CashierCmdParams(actionName, jSONString, actionParamsArray), mspContext));
        }
    }

    private static boolean a(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (jSONArray = b) != null && jSONArray.length() > 0) {
            for (int i = 0; i < b.length(); i++) {
                try {
                    if (b.get(i).equals(str)) {
                        return true;
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }
        return false;
    }

    public static void handleNotificationClicked(MspContext mspContext, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7314a739", new Object[]{mspContext, str, new Boolean(z)});
        } else if (!f4556a) {
        } else {
            a(new MqpSectionModel(IMqpSectionListener.SECTION_RECEIVE_NOTIFICATION, new MqpSectionModel.NotificationClickedParams(str, z), mspContext));
        }
    }
}
