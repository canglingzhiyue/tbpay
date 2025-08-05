package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MetaOpenUrlStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity g;

    public static /* synthetic */ Object ipc$super(MetaOpenUrlStore metaOpenUrlStore, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(MetaOpenUrlStore metaOpenUrlStore, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440e943c", new Object[]{metaOpenUrlStore, str});
        } else {
            metaOpenUrlStore.a(str);
        }
    }

    public MetaOpenUrlStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (this.f4584a == null) {
            return null;
        }
        if (this.c != null) {
            this.g = this.c.getCurrentPresenter().getActivity();
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson != null) {
            z = a(actionParamsJson);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        try {
            if (jSONObject.containsKey(MonitorItemConstants.KEY_URL)) {
                final String string = jSONObject.getString(MonitorItemConstants.KEY_URL);
                if (Integer.parseInt(jSONObject.getString("delay")) > 0) {
                    TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOpenUrlStore.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                MetaOpenUrlStore.a(MetaOpenUrlStore.this, string);
                            }
                        }
                    });
                } else {
                    a(string);
                }
                return true;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            StEvent stEvent = this.f;
            stEvent.onStatistic("action", "metaOpenUrl|" + Utils.truncateString(str, 100));
            if (str.startsWith(MspGlobalDefine.AFWEALTH_SCHEME)) {
                LogUtil.record(4, "", "OpenUrlStore::processUrl", "OpenUrl by AFWEALTH_SCHEME:".concat(String.valueOf(str)));
                Intent intent = new Intent();
                intent.setAction(MspGlobalDefine.AFWEALTH_OPNEURL_ACTION);
                intent.putExtra(MspGlobalDefine.AFWEALTH_OPENURL_PARAM, str);
                LocalBroadcastManager.getInstance(this.d).sendBroadcast(intent);
            } else if (str.startsWith(MspGlobalDefine.ALIPAY_SCHEME) && !DeviceInfo.hasAlipayWallet(this.d)) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://ds.alipay.com/help/guide.htm?page=forgotpwd"));
                MspBasePresenter currentPresenter = this.f4584a.getMspUIClient().getCurrentPresenter();
                if (currentPresenter == null || currentPresenter.mo545getIView() == null) {
                    return;
                }
                currentPresenter.mo545getIView().openActivity(intent2, null);
            } else {
                String packageName = this.g.getPackageName();
                if (TextUtils.equals(packageName, MspGlobalDefine.PACKAGE_AFWEALTH) && str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
                    str = str.replaceFirst(MspGlobalDefine.ALIPAYS_SCHEME, MspGlobalDefine.AFWEALTH_SCHEME);
                } else if (TextUtils.equals(packageName, "hk.alipay.wallet") && str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
                    str = str.replaceFirst(MspGlobalDefine.ALIPAYS_SCHEME, MspGlobalDefine.ALIPAYHK_SCHEME);
                }
                if (this.f4584a != null && this.f4584a.isFromWallet()) {
                    try {
                        MspBasePresenter currentPresenter2 = this.f4584a.getMspUIClient().getCurrentPresenter();
                        if (currentPresenter2 != null && currentPresenter2.mo545getIView() != null) {
                            if (currentPresenter2.mo545getIView().openUrl(str, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOpenUrlStore.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.msp.ui.base.OnResultReceived
                                public void onReceiveResult(String str2) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("e1927912", new Object[]{this, str2});
                                    }
                                }
                            })) {
                                return;
                            }
                            b(str);
                            return;
                        }
                        PhoneCashierMspEngine.getMspJump().processUrl(this.g, str);
                        return;
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
                b(str);
            }
        } else if (this.f4584a == null) {
        } else {
            this.f4584a.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_OPEN_URL_EMPTY, "toOpenUri:".concat(String.valueOf(str)));
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        MspBasePresenter currentPresenter = this.f4584a.getMspUIClient().getCurrentPresenter();
        if (currentPresenter != null && currentPresenter.mo545getIView() != null) {
            currentPresenter.mo545getIView().openActivity(intent, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOpenUrlStore.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.ui.base.OnResultReceived
                public void onReceiveResult(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e1927912", new Object[]{this, str2});
                    }
                }
            });
            return;
        }
        Activity activity = this.g;
        if (activity == null) {
            return;
        }
        activity.startActivity(intent);
    }
}
