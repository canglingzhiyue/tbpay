package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.scheme.MspSchemeActivity;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrameDispatcher;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.EmptySchemeActivity;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.model.a;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class ThirdPayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ int a(ThirdPayStore thirdPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("632a0d15", new Object[]{thirdPayStore})).intValue() : thirdPayStore.e;
    }

    public static /* synthetic */ MspTradeContext b(ThirdPayStore thirdPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("c5c73b33", new Object[]{thirdPayStore}) : thirdPayStore.b;
    }

    public static /* synthetic */ MspTradeContext c(ThirdPayStore thirdPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("df767ff4", new Object[]{thirdPayStore}) : thirdPayStore.b;
    }

    public static /* synthetic */ MspTradeContext d(ThirdPayStore thirdPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("f925c4b5", new Object[]{thirdPayStore}) : thirdPayStore.b;
    }

    public ThirdPayStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return ThirdPayManager.ThirdPayInvokeResult.makeErr("failed").toJson().toJSONString();
        }
        final String string = actionParamsJson.getString("type");
        final String string2 = actionParamsJson.getString("jumpFailedDialog");
        final String string3 = actionParamsJson.getString("jumpSucceedDialog");
        Activity activity = null;
        MspUIClient mspUIClient = this.c;
        if (mspUIClient != null && (currentPresenter = mspUIClient.getCurrentPresenter()) != null) {
            activity = currentPresenter.getActivity();
        }
        final Activity activity2 = activity;
        MspTradeContext mspTradeContext = this.b;
        if (mspTradeContext == null) {
            LogUtil.record(8, "ThirdPayStore", "error on task 0");
        } else {
            MspBasePresenter mspBasePresenter = mspTradeContext.getMspBasePresenter();
            if (mspBasePresenter == null) {
                LogUtil.record(8, "ThirdPayStore", "error on task 1");
            } else {
                Activity activity3 = mspBasePresenter.getActivity();
                if (activity3 == null) {
                    LogUtil.record(8, "ThirdPayStore", "error on task 2");
                } else if (!DrmManager.getInstance(activity3).isDegrade(DrmKey.DEGRADE_PAYRESULT_SWITCH_FRONT_THIRDPAY, false, activity3)) {
                    final WeakReference weakReference = new WeakReference(activity3);
                    MspSchemeActivity.registerHandler(new MspSchemeActivity.MspSchemeHandler() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
                        public String getName() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("7c09e698", new Object[]{this}) : "ThirdPayStore";
                        }

                        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
                        public boolean shouldHandle(Intent intent) {
                            Uri data;
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("86262e83", new Object[]{this, intent})).booleanValue() : intent != null && (data = intent.getData()) != null && "alipay".equals(data.getScheme()) && "processpaymentresult".equals(data.getHost());
                        }

                        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
                        public void handle(Intent intent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f96ac96c", new Object[]{this, intent});
                                return;
                            }
                            MspSchemeActivity.unregisterHandler(this);
                            Activity activity4 = (Activity) weakReference.get();
                            if (activity4 != null && intent != null && intent.getIntExtra(a.COL_TASK, 0) == activity4.getTaskId()) {
                                return;
                            }
                            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Activity activity5 = (Activity) weakReference.get();
                                    if (activity5 == null || activity5.isFinishing()) {
                                        return;
                                    }
                                    activity5.startActivity(new Intent(activity5, EmptySchemeActivity.class));
                                }
                            });
                        }
                    });
                }
            }
        }
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ThirdPayManager.triggerThirdPay(string, actionParamsJson, ThirdPayStore.a(ThirdPayStore.this), activity2, new ThirdPayManager.ThirdPayFinishCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.msp.biz.thirdpay.ThirdPayManager.ThirdPayFinishCallback
                        public void finish(ThirdPayManager.ThirdPayInvokeResult thirdPayInvokeResult) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f2ef8e5", new Object[]{this, thirdPayInvokeResult});
                                return;
                            }
                            String str = "{}";
                            if (thirdPayInvokeResult == null || thirdPayInvokeResult.invocationErr != null) {
                                LogUtil.record(8, "ThirdPayStore", "res but failed, action: " + string2);
                                ThirdPayStore.a(ThirdPayStore.this, ThirdPayStore.b(ThirdPayStore.this), string2);
                                EventAction eventAction2 = eventAction;
                                if (thirdPayInvokeResult != null) {
                                    str = thirdPayInvokeResult.toJson().toJSONString();
                                }
                                Utils.sendToDocument(eventAction2, str);
                            } else if (thirdPayInvokeResult.isJumpSucc()) {
                                LogUtil.record(8, "ThirdPayStore", "jumpSuccess, action: " + string3);
                                ThirdPayStore.a(ThirdPayStore.this, ThirdPayStore.c(ThirdPayStore.this), string3);
                            } else {
                                EventAction eventAction3 = eventAction;
                                if (thirdPayInvokeResult != null) {
                                    str = thirdPayInvokeResult.toJson().toJSONString();
                                }
                                Utils.sendToDocument(eventAction3, str);
                            }
                        }
                    }, new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.record(8, "ThirdPayStore", "failed, action: " + string2);
                            ThirdPayStore.a(ThirdPayStore.this, ThirdPayStore.d(ThirdPayStore.this), string2);
                            Utils.sendToDocument(eventAction, ThirdPayManager.ThirdPayInvokeResult.makeErr("failed").toJson().toJSONString());
                        }
                    });
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }

    public static /* synthetic */ void a(ThirdPayStore thirdPayStore, MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc21508", new Object[]{thirdPayStore, mspTradeContext, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                MspWindowFrameDispatcher mspWindowFrameDispatcher = mspTradeContext.getMspUIClient().getMspWindowFrameDispatcher();
                JSONObject parseObject = JSONObject.parseObject(str);
                JSONObject jSONObject = new JSONObject();
                parseObject.put("type", (Object) MspFlybirdDefine.FLYBIRD_WIN_TYPE_DIALOG);
                jSONObject.put("wnd", (Object) parseObject);
                if (mspWindowFrameDispatcher.parseRendDataFromUIShow(jSONObject, false, thirdPayStore.f)) {
                    return;
                }
                LogUtil.record(8, "ThirdPayStore", "frame == null");
            } catch (Throwable th) {
                LogUtil.record(8, "ThirdPayStore", "error on dialog");
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
