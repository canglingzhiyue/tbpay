package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.app.PayTaskCompat;
import com.alipay.sdk.app.ResultStatus;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class StandardPayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static final class StandardPayResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4632a;
        private String b;
        private String c;

        public StandardPayResult(String str, String str2, String str3) {
            this.f4632a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultStatus", (Object) this.f4632a);
            jSONObject.put("memo", (Object) this.b);
            jSONObject.put("result", (Object) this.c);
            return jSONObject.toJSONString();
        }
    }

    public static /* synthetic */ MspContext a(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("d44e3134", new Object[]{standardPayStore}) : standardPayStore.f4584a;
    }

    public static /* synthetic */ MspContext b(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("62d9b235", new Object[]{standardPayStore}) : standardPayStore.f4584a;
    }

    public static /* synthetic */ MspContext c(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("f1653336", new Object[]{standardPayStore}) : standardPayStore.f4584a;
    }

    public static /* synthetic */ MspContext d(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("7ff0b437", new Object[]{standardPayStore}) : standardPayStore.f4584a;
    }

    public static /* synthetic */ MspContext e(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("e7c3538", new Object[]{standardPayStore}) : standardPayStore.f4584a;
    }

    public static /* synthetic */ MspContext f(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("9d07b639", new Object[]{standardPayStore}) : standardPayStore.f4584a;
    }

    public StandardPayStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null || !actionParamsJson.containsKey("orderStr")) {
            return new StandardPayResult(String.valueOf(ResultStatus.PARAMS_ERROR.getStatus()), ResultStatus.PARAMS_ERROR.getMemo(), "").toJSONString();
        }
        final Activity activity = null;
        MspUIClient mspUIClient = this.c;
        if (mspUIClient != null && (currentPresenter = mspUIClient.getCurrentPresenter()) != null) {
            activity = currentPresenter.getActivity();
        }
        final String string = actionParamsJson.getString("orderStr");
        LogUtil.record(2, "StandardPayStore", "onMspAction", "orderStr=".concat(String.valueOf(string)));
        Thread thread = new Thread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.StandardPayStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                String str;
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String str3 = null;
                    Map<String, String> payV2 = new PayTaskCompat(activity, StandardPayStore.a(StandardPayStore.this) == null ? null : StandardPayStore.b(StandardPayStore.this).getStatisticInfo()).payV2(string, false);
                    if (payV2 != null) {
                        str = null;
                        str2 = null;
                        for (String str4 : payV2.keySet()) {
                            if (TextUtils.equals(str4, "resultStatus")) {
                                str3 = payV2.get(str4);
                            } else if (TextUtils.equals(str4, "result")) {
                                str2 = payV2.get(str4);
                            } else if (TextUtils.equals(str4, "memo")) {
                                str = payV2.get(str4);
                            }
                        }
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (StandardPayStore.c(StandardPayStore.this) != null && !String.valueOf(ResultStatus.SUCCEEDED.getStatus()).equals(str3) && !String.valueOf(ResultStatus.CANCELED.getStatus()).equals(str3)) {
                        StandardPayStore.d(StandardPayStore.this).getStatisticInfo().addError("np", "StandardPay-".concat(String.valueOf(str3)), "memo-".concat(String.valueOf(str)));
                    }
                    LogUtil.record(2, "StandardPayStore", "onMspAction", "resultStatus=".concat(String.valueOf(str3)));
                    Utils.sendToDocument(eventAction, new StandardPayResult(str3, str, str2).toJSONString());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    if (StandardPayStore.e(StandardPayStore.this) != null) {
                        StandardPayStore.f(StandardPayStore.this).getStatisticInfo().addError(ErrorType.DEFAULT, "StandardPay-exception", th.getMessage());
                    }
                    Utils.sendToDocument(eventAction, new StandardPayResult(String.valueOf(ResultStatus.FAILED.getStatus()), ResultStatus.FAILED.getMemo(), "").toJSONString());
                }
            }
        });
        thread.setName("StandardPayStoreThread");
        TaskHelper.execute(thread);
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
