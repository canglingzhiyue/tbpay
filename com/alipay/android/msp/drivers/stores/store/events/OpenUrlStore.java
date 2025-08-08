package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class OpenUrlStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity g;
    private BroadcastReceiver h;

    public static /* synthetic */ Object ipc$super(OpenUrlStore openUrlStore, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(OpenUrlStore openUrlStore, String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa9a2fe", new Object[]{openUrlStore, str, jSONObject, str2});
        } else {
            openUrlStore.a(str, jSONObject, str2);
        }
    }

    public OpenUrlStore(int i) {
        super(i);
        this.h = null;
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
            String str = null;
            if (this.f4584a == null) {
                return null;
            }
            if (this.c != null) {
                this.g = this.c.getCurrentPresenter().getActivity();
            }
            String[] actionParamsArray = mspEvent.getActionParamsArray();
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (actionParamsArray != null) {
                if (actionParamsArray.length == 1) {
                    a(actionParamsArray[0], null, null, null, null);
                    return "";
                } else if (actionParamsArray.length < 2) {
                    return "";
                } else {
                    a(actionParamsArray[0], null, actionParamsArray[1], null, null);
                    return "";
                }
            } else if (actionParamsJson == null) {
                return "";
            } else {
                JSONObject parseObject = JSON.parseObject(actionParamsJson.toJSONString());
                if (parseObject.containsKey("endflag")) {
                    str = parseObject.getString("endflag");
                }
                String str2 = str;
                if ("6".equals(str2) && (this.f4584a instanceof MspTradeContext)) {
                    ((MspTradeContext) this.f4584a).setCanMulti(false);
                }
                if (!parseObject.containsKey("url")) {
                    return "";
                }
                a(parseObject.getString("url"), parseObject.getString("type"), str2, parseObject.getJSONObject("followAct"), parseObject);
                return "";
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }

    private void a(final String str, String str2, final String str3, final JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d85c4c6", new Object[]{this, str, str2, str3, jSONObject, jSONObject2});
            return;
        }
        if ("6".equals(str3) && (this.f4584a instanceof MspTradeContext)) {
            ((MspTradeContext) this.f4584a).setCanMulti(false);
            MspBasePresenter currentPresenter = this.f4584a.getMspUIClient().getCurrentPresenter();
            if (currentPresenter != null && currentPresenter.mo545getIView() != null) {
                currentPresenter.mo545getIView().showLoadingView(new String[0]);
            }
        }
        if (!StringUtils.isEmpty(str)) {
            StEvent stEvent = this.f;
            stEvent.onStatistic("action", "openUrl|" + Utils.truncateString(str, 100));
            if ("6".equals(str3) && "h5".equals(str2)) {
                LogUtil.record(4, "", "OpenUrlStore::processUrl", "OpenUrl by env h5:".concat(String.valueOf(str)));
                try {
                    MspBasePresenter currentPresenter2 = this.f4584a.getMspUIClient().getCurrentPresenter();
                    if (currentPresenter2 != null && currentPresenter2.mo545getIView() != null) {
                        if (!currentPresenter2.mo545getIView().openUrl(str, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.ui.base.OnResultReceived
                            public void onReceiveResult(String str4) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e1927912", new Object[]{this, str4});
                                } else {
                                    OpenUrlStore.a(OpenUrlStore.this, str3, jSONObject, str);
                                }
                            }
                        })) {
                            a(str, str3, jSONObject);
                        }
                    } else {
                        PhoneCashierMspEngine.getMspJump().processUrl(this.g, str);
                    }
                } catch (Exception e) {
                    LogUtil.record(4, "", "OpenUrlStore::processUrl", "failed to open env h5");
                    LogUtil.printExceptionStackTrace(e);
                    a(str, str3, jSONObject);
                }
            } else if ("2".equals(str3)) {
                a(str, jSONObject2);
            } else if (str.startsWith(MspGlobalDefine.AFWEALTH_SCHEME)) {
                LogUtil.record(4, "", "OpenUrlStore::processUrl", "OpenUrl by AFWEALTH_SCHEME:".concat(String.valueOf(str)));
                Intent intent = new Intent();
                intent.setAction(MspGlobalDefine.AFWEALTH_OPNEURL_ACTION);
                intent.putExtra(MspGlobalDefine.AFWEALTH_OPENURL_PARAM, str);
                LocalBroadcastManager.getInstance(this.d).sendBroadcast(intent);
            } else if (str.startsWith(MspGlobalDefine.ALIPAY_SCHEME) && !DeviceInfo.hasAlipayWallet(this.d)) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://ds.alipay.com/help/guide.htm?page=forgotpwd"));
                MspBasePresenter currentPresenter3 = this.f4584a.getMspUIClient().getCurrentPresenter();
                if (currentPresenter3 != null && currentPresenter3.mo545getIView() != null) {
                    currentPresenter3.mo545getIView().openActivity(intent2, null);
                }
            } else {
                String packageName = this.g.getPackageName();
                if (StringUtils.equals(packageName, MspGlobalDefine.PACKAGE_AFWEALTH) && str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
                    str = str.replaceFirst(MspGlobalDefine.ALIPAYS_SCHEME, MspGlobalDefine.AFWEALTH_SCHEME);
                } else if (StringUtils.equals(packageName, "hk.alipay.wallet") && str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
                    str = str.replaceFirst(MspGlobalDefine.ALIPAYS_SCHEME, MspGlobalDefine.ALIPAYHK_SCHEME);
                }
                if (this.f4584a != null && this.f4584a.isFromWallet()) {
                    try {
                        MspBasePresenter currentPresenter4 = this.f4584a.getMspUIClient().getCurrentPresenter();
                        if (currentPresenter4 != null && currentPresenter4.mo545getIView() != null) {
                            if (!currentPresenter4.mo545getIView().openUrl(str, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.msp.ui.base.OnResultReceived
                                public void onReceiveResult(String str4) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("e1927912", new Object[]{this, str4});
                                    } else {
                                        OpenUrlStore.a(OpenUrlStore.this, str3, jSONObject, str);
                                    }
                                }
                            })) {
                                a(str, str3, jSONObject);
                            }
                        } else {
                            PhoneCashierMspEngine.getMspJump().processUrl(this.g, str);
                        }
                    } catch (Exception e2) {
                        LogUtil.printExceptionStackTrace(e2);
                    }
                }
                a(str, str3, jSONObject);
            }
        } else if (this.f4584a != null) {
            this.f4584a.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_OPEN_URL_EMPTY, "toOpenUri:".concat(String.valueOf(str)));
        }
        a(str3, (JSONObject) null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r6, com.alibaba.fastjson.JSONObject r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "6635bcfe"
            r0.ipc$dispatch(r6, r1)
            return
        L18:
            java.lang.String r0 = "alipays:"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L28
            android.content.Context r0 = r5.d
            boolean r0 = com.alipay.android.msp.framework.sys.DeviceInfo.hasAlipayWallet(r0)
            if (r0 == 0) goto L60
        L28:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L5c
            r0.<init>()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.setAction(r1)     // Catch: java.lang.Exception -> L5c
            android.net.Uri r1 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> L5c
            r0.setData(r1)     // Catch: java.lang.Exception -> L5c
            android.app.Activity r1 = r5.g     // Catch: java.lang.Exception -> L5c
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L5c
            android.content.ComponentName r0 = r0.resolveActivity(r1)     // Catch: java.lang.Exception -> L5c
            if (r0 == 0) goto L4c
            java.lang.String r0 = "2"
            r1 = 0
            r5.a(r6, r0, r1)     // Catch: java.lang.Exception -> L5c
            goto L61
        L4c:
            android.content.ActivityNotFoundException r0 = new android.content.ActivityNotFoundException     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "cannot resolve url: "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L5c
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Exception -> L5c
            r0.<init>(r6)     // Catch: java.lang.Exception -> L5c
            throw r0     // Catch: java.lang.Exception -> L5c
        L5c:
            r6 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r6)
        L60:
            r3 = 0
        L61:
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "jumpSucc: "
            java.lang.String r6 = r0.concat(r6)
            java.lang.String r0 = "OpenUrlStore"
            java.lang.String r1 = "sdkJumpOut"
            com.alipay.android.msp.utils.LogUtil.record(r2, r0, r1, r6)
            if (r3 == 0) goto L7a
            java.lang.String r6 = "succact"
            goto L7c
        L7a:
            java.lang.String r6 = "failact"
        L7c:
            com.alibaba.fastjson.JSONObject r6 = r7.getJSONObject(r6)
            if (r6 == 0) goto L95
            com.alipay.android.msp.drivers.actions.MspEventCreator r7 = com.alipay.android.msp.drivers.actions.MspEventCreator.get()
            java.lang.String r0 = "OpenUrlAfterAction"
            com.alipay.android.msp.drivers.actions.EventAction r6 = r7.createMspEvent(r0, r6)
            com.alipay.android.msp.core.context.MspContext r7 = r5.f4584a
            com.alipay.android.msp.drivers.actions.ActionsCreator r7 = com.alipay.android.msp.drivers.actions.ActionsCreator.get(r7)
            r7.createEventAction(r6)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.a(java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r10.equals("3") != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r10, com.alibaba.fastjson.JSONObject r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.a(java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String):void");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.e);
        if (tradeContextByBizId == null || tradeContextByBizId.getMspPayResult() == null) {
            return;
        }
        LogUtil.record(4, "", "OpenUrlStore::processUrl", "exitNoCallback");
        tradeContextByBizId.getMspPayResult().addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
        this.f4584a.exit(600);
    }

    private void a(final String str, final String str2, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        MspBasePresenter currentPresenter = this.f4584a.getMspUIClient().getCurrentPresenter();
        if (currentPresenter != null && currentPresenter.mo545getIView() != null) {
            currentPresenter.mo545getIView().openActivity(intent, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.ui.base.OnResultReceived
                public void onReceiveResult(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e1927912", new Object[]{this, str3});
                    } else {
                        OpenUrlStore.a(OpenUrlStore.this, str2, jSONObject, str);
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
