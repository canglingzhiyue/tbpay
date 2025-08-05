package com.alipay.android.msp.utils.net;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.network.MiscRequestUtils;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.widget.SystemDefaultDialog;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannelCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Map;

/* loaded from: classes3.dex */
public class ViSourceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.alipay.android.msp.utils.net.ViSourceUtil$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$action;
        public final /* synthetic */ int val$bizId;
        public final /* synthetic */ String val$params;
        public final /* synthetic */ VIMessageChannelCallback val$viMessageChannelCallback;

        public AnonymousClass1(int i, String str, String str2, VIMessageChannelCallback vIMessageChannelCallback) {
            this.val$bizId = i;
            this.val$action = str;
            this.val$params = str2;
            this.val$viMessageChannelCallback = vIMessageChannelCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.val$bizId);
            if (tradeContextByBizId == null) {
                return;
            }
            try {
                Map<String, String> requestViRpcData = MiscRequestUtils.ViRpcDataRequest.requestViRpcData(this.val$action, this.val$params, this.val$bizId);
                if (requestViRpcData == null) {
                    return;
                }
                LogUtil.record(4, "requestRpcData", "resultMap:".concat(String.valueOf(requestViRpcData)));
                if (!ViSourceUtil.access$000(requestViRpcData)) {
                    LogUtil.record(4, "requestRpcData", "!isVidAct");
                    ViSourceUtil.access$100(this.val$viMessageChannelCallback);
                }
                ActionsCreator.get(tradeContextByBizId).createUIShowAction(JsonUtil.map2Json(requestViRpcData), false, new StEvent());
                LogUtil.record(4, "requestRpcData", "resultMap:" + requestViRpcData.toString());
            } catch (Throwable th) {
                MspWindowClient mspWindowClient = tradeContextByBizId.getMspWindowClient();
                if (mspWindowClient != null && mspWindowClient.getCurrentPresenter() != null) {
                    final Activity activity = mspWindowClient.getCurrentPresenter().getActivity();
                    final Activity vidTopActivity = PhoneCashierMspEngine.getMspViSec().getVidTopActivity();
                    if (activity != null && vidTopActivity != null) {
                        activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.utils.net.ViSourceUtil.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    SystemDefaultDialog.showDialog(vidTopActivity, LanguageHelper.localizedStringForKey("mini_net_error_weak", activity.getString(R.string.mini_net_error_weak), new Object[0]), LanguageHelper.localizedStringForKey("mini_cancel", activity.getString(R.string.mini_cancel), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.utils.net.ViSourceUtil.1.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                                return;
                                            }
                                            dialogInterface.dismiss();
                                            ViSourceUtil.access$100(AnonymousClass1.this.val$viMessageChannelCallback);
                                        }
                                    }, LanguageHelper.localizedStringForKey("mini_redo", activity.getString(R.string.mini_redo), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.utils.net.ViSourceUtil.1.1.2
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                                return;
                                            }
                                            ViSourceUtil.requestRpcData(AnonymousClass1.this.val$action, AnonymousClass1.this.val$params, AnonymousClass1.this.val$bizId, AnonymousClass1.this.val$viMessageChannelCallback);
                                            dialogInterface.dismiss();
                                        }
                                    }).show();
                                } catch (Throwable th2) {
                                    LogUtil.printExceptionStackTrace(th2);
                                }
                            }
                        });
                        return;
                    }
                }
                LogUtil.printExceptionStackTrace(th);
                ViSourceUtil.access$100(this.val$viMessageChannelCallback);
            }
        }
    }

    public static /* synthetic */ boolean access$000(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c9b1732", new Object[]{map})).booleanValue() : isVidAct(map);
    }

    public static /* synthetic */ void access$100(VIMessageChannelCallback vIMessageChannelCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3205cc8", new Object[]{vIMessageChannelCallback});
        } else {
            callChannelError(vIMessageChannelCallback);
        }
    }

    public static void requestRpcData(String str, String str2, int i, VIMessageChannelCallback vIMessageChannelCallback) {
        MspWindowClient mspWindowClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99d66d8", new Object[]{str, str2, new Integer(i), vIMessageChannelCallback});
            return;
        }
        try {
            TaskHelper.execute(new AnonymousClass1(i, str, str2, vIMessageChannelCallback));
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null || (mspWindowClient = tradeContextByBizId.getMspWindowClient()) == null) {
                return;
            }
            mspWindowClient.setVidActivity(PhoneCashierMspEngine.getMspViSec().getVidTopActivity());
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    private static boolean isVidAct(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a97dd9b7", new Object[]{map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("wnd");
        if (str != null && str.contains("VIData")) {
            return true;
        }
        String str2 = map.get(MspFlybirdDefine.FLYBIRD_ONLOAD);
        return str2 != null && str2.contains("VIData");
    }

    private static void callChannelError(VIMessageChannelCallback vIMessageChannelCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ccf76", new Object[]{vIMessageChannelCallback});
        } else if (vIMessageChannelCallback == null) {
        } else {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("channelError", (Object) "-1001");
            bundle.putString("data", jSONObject.toString());
            vIMessageChannelCallback.onResult(bundle);
        }
    }
}
