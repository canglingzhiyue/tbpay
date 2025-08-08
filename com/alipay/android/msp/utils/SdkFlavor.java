package com.alipay.android.msp.utils;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.application.common.c;
import com.taobao.tao.log.TLog;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;

/* loaded from: classes3.dex */
public class SdkFlavor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "minipaysdk";
    public static final String SDK_KERNEL_VERSION = "6";
    private static final String TAG = "msp";
    private static boolean hasRecJsEvent = false;
    private static boolean isFollowAction;
    private static JSONObject mFollowActionJsonFromH5;
    private static JsEventListener mJsEventListener;

    /* loaded from: classes3.dex */
    public static class JsEventListener implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int mBizId;
        private final String mNotifyName;

        public JsEventListener(String str, int i) {
            this.mNotifyName = str;
            this.mBizId = i;
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
            }
            if (i == 3005 && (objArr[0] instanceof String)) {
                try {
                    JSONObject parseObject = JSON.parseObject((String) objArr[0]);
                    String string = parseObject.getString("event");
                    JSONObject jSONObject = parseObject.getJSONObject("param");
                    if (!StringUtils.isEmpty(this.mNotifyName) && string.contains(this.mNotifyName)) {
                        SdkFlavor.access$302(true);
                        SdkFlavor.access$102(jSONObject.getBooleanValue("isFollowAction"));
                        LogUtil.record(1, SdkFlavor.TAG, "JsEventListener isFollowAction:" + SdkFlavor.access$100());
                        JSONObject jSONObject2 = jSONObject.containsKey("action") ? jSONObject.getJSONObject("action") : jSONObject.containsKey("param") ? jSONObject.getJSONObject("param") : null;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2;
                        }
                        if (!SdkFlavor.access$100()) {
                            EventAction createMspEvent = MspEventCreator.get().createMspEvent("JsEventListener.onEvent", jSONObject);
                            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
                            if (mspContextByBizId != null) {
                                ActionsCreator.get(mspContextByBizId).createEventAction(createMspEvent);
                            }
                        } else {
                            SdkFlavor.access$202(jSONObject);
                        }
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    SdkFlavor.access$302(false);
                    SdkFlavor.access$102(false);
                }
            }
            return null;
        }
    }

    public static /* synthetic */ JsEventListener access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JsEventListener) ipChange.ipc$dispatch("f5017bcf", new Object[0]) : mJsEventListener;
    }

    public static /* synthetic */ JsEventListener access$002(JsEventListener jsEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsEventListener) ipChange.ipc$dispatch("c6f2447d", new Object[]{jsEventListener});
        }
        mJsEventListener = jsEventListener;
        return jsEventListener;
    }

    public static /* synthetic */ boolean access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue() : isFollowAction;
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        isFollowAction = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d4830519", new Object[0]) : mFollowActionJsonFromH5;
    }

    public static /* synthetic */ JSONObject access$202(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b6d67075", new Object[]{jSONObject});
        }
        mFollowActionJsonFromH5 = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ boolean access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue() : hasRecJsEvent;
    }

    public static /* synthetic */ boolean access$302(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f8d21c", new Object[]{new Boolean(z)})).booleanValue();
        }
        hasRecJsEvent = z;
        return z;
    }

    public static void printLog(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db09b5b", new Object[]{str, new Integer(i)});
            return;
        }
        try {
            if (!GlobalConstant.DEBUG) {
                if (i == 0) {
                    return;
                }
                TLog.loge(MODULE, TAG, str);
            } else if (i == 0 || i == 1 || i == 2) {
                TLog.logi(MODULE, TAG, str);
            } else if (i == 4) {
                TLog.logw(MODULE, TAG, str);
            } else {
                TLog.loge(MODULE, TAG, str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void onException(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17742d4", new Object[]{str, th});
            return;
        }
        try {
            TLog.loge(MODULE, str, th);
        } catch (Throwable unused) {
        }
    }

    public static Activity getCurrentTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b7065160", new Object[0]);
        }
        try {
            return c.b();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean isBackgroundRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a678db2", new Object[0])).booleanValue();
        }
        try {
            return c.a().a("isInBackground", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean processUrl(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d216c2f", new Object[]{context, str})).booleanValue();
        }
        if (str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
            PhoneCashierMspEngine.getMspJump().processScheme(str);
            return true;
        }
        try {
            return Nav.from(context).toUri(str);
        } catch (Throwable unused) {
            PhoneCashierMspEngine.getMspJump().processScheme(str);
            return true;
        }
    }

    public static boolean handleTaobaoWeb(final JSONObject jSONObject, String str, final MspContext mspContext, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c0d2fa6", new Object[]{jSONObject, str, mspContext, new Integer(i), str2})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("MQPWVOnAction");
        sb.append((str + SystemClock.elapsedRealtime()).hashCode());
        String sb2 = sb.toString();
        if (!StringUtils.equals(str2, "true")) {
            str = str + "&cashierNotifyName=" + sb2;
        }
        mJsEventListener = new JsEventListener(sb2, i);
        aem.a().a(mJsEventListener);
        MspBasePresenter currentPresenter = mspContext.getMspUIClient().getCurrentPresenter();
        if (currentPresenter != null && currentPresenter.mo545getIView() != null && currentPresenter.mo545getIView().openUrl(str, new OnResultReceived() { // from class: com.alipay.android.msp.utils.SdkFlavor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.ui.base.OnResultReceived
            public void onReceiveResult(String str3) {
                EventAction createMspEvent;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e1927912", new Object[]{this, str3});
                    return;
                }
                if (SdkFlavor.access$000() != null) {
                    aem.a().b(SdkFlavor.access$000());
                    SdkFlavor.access$002(null);
                }
                LogUtil.record(1, "currentIFormShower onReceiveResult", "results=".concat(String.valueOf(str3)));
                if (SdkFlavor.access$100() && SdkFlavor.access$200() != null) {
                    EventAction createMspEvent2 = MspEventCreator.get().createMspEvent("handleTaobaoWeb.mFollowActionJsonFromH5", SdkFlavor.access$200());
                    if (createMspEvent2 == null) {
                        return;
                    }
                    createMspEvent2.setFromLocalEvent(true);
                    ActionsCreator.get(MspContext.this).createEventAction(createMspEvent2);
                } else if (SdkFlavor.access$300() || jSONObject == null || (createMspEvent = MspEventCreator.get().createMspEvent("handleTaobaoWeb.exitAct", jSONObject)) == null) {
                } else {
                    createMspEvent.setFromLocalEvent(true);
                    ActionsCreator.get(MspContext.this).createEventAction(createMspEvent);
                }
            }
        })) {
            return true;
        }
        if (mJsEventListener != null) {
            aem.a().b(mJsEventListener);
            mJsEventListener = null;
        }
        return false;
    }
}
