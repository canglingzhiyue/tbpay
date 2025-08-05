package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.CustomToast;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class CopyStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CopyStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.c == null || (currentPresenter = this.c.getCurrentPresenter()) == null) {
            return null;
        }
        final Activity activity = currentPresenter.getActivity();
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            final boolean z2 = actionParamsJson.containsKey(LoginConstants.SHOW_TOAST) ? !TextUtils.equals(actionParamsJson.getString(LoginConstants.SHOW_TOAST), "false") : true;
            if (actionParamsJson.containsKey("type")) {
                z = true ^ TextUtils.equals(actionParamsJson.getString("type"), "read");
            }
            final String string = actionParamsJson.containsKey("text") ? actionParamsJson.getString("text") : "";
            if (z) {
                if (!TextUtils.isEmpty(string)) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.CopyStore.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            boolean z3 = false;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                z3 = PhoneCashierMspEngine.getMspWallet().writeClipData(activity, string, "pay");
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                            if (!z2) {
                                return;
                            }
                            CopyStore.a(CopyStore.this, activity, z3);
                        }
                    });
                }
                return "";
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.CopyStore.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        str = PhoneCashierMspEngine.getMspWallet().readClipData(activity, r3, "pay");
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                        str = "";
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pasteboardStr", (Object) str);
                    LocalEventStore.invokeCallback(eventAction, jSONObject);
                }
            });
            return InvokeActionPlugin.AYSNC_CALLBACK;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public static /* synthetic */ void a(CopyStore copyStore, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3590452c", new Object[]{copyStore, activity, new Boolean(z)});
        } else if (z) {
            CustomToast.showToast(activity, R.drawable.alipay_msp_copy_successful, LanguageHelper.localizedStringForKey("msp_copy_success", activity.getString(R.string.msp_copy_success), new Object[0]), 2000L);
        } else {
            CustomToast.showToast(activity, R.drawable.alipay_msp_copy_failed, LanguageHelper.localizedStringForKey("msp_copy_failed", activity.getString(R.string.msp_copy_failed), new Object[0]), 2000L);
        }
    }
}
