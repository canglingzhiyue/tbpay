package com.alipay.android.msp.pay;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.MqpConfigService;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.encrypt.TriDes;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspByPassProcessor;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.network.decorator.RpcRequestDecorator;
import com.alipay.android.msp.network.http.http.PhoneCashierHttpClient;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.common.logging.api.LogCustomerControl;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.customer.LogUploadInfo;
import com.alipay.mobile.common.logging.api.customer.LogWriteInfo;
import com.alipay.mobile.common.logging.api.customer.UploadResultInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class MspPayClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f4944a;
    private final MspTradeContext b;
    private final MspPayResult c;
    private boolean d = false;
    private boolean e = false;

    /* loaded from: classes3.dex */
    private interface CheckPayResult {
        public static final String CONTINUE = "continue";
        public static final String DUP_5S = "pay_ns_dup";
        public static final String NOT_LOGIN = "pay_login";
    }

    public static /* synthetic */ MspTradeContext a(MspPayClient mspPayClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("7350c1bd", new Object[]{mspPayClient}) : mspPayClient.b;
    }

    public MspPayClient(MspTradeContext mspTradeContext) {
        this.f4944a = mspTradeContext.getBizId();
        this.b = mspTradeContext;
        this.c = mspTradeContext.getMspPayResult();
    }

    public MspPayResult pay() {
        MspPaySession.CertPayModel certPayModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPayResult) ipChange.ipc$dispatch("6a2dfb89", new Object[]{this});
        }
        String orderInfo = this.b.getOrderInfo();
        if (TextUtils.isEmpty(orderInfo)) {
            RpcRequestDecorator.getFirstRequestParamsString(new RequestConfig("", "", 0, true), "", 0);
            this.b.getStatisticInfo().addError(ErrorType.DEFAULT, "exit", "pay_nil");
            this.b.exit(0);
            LogUtil.record(4, "MspPayClient:pay", "preloadPayConn = ".concat(String.valueOf(orderInfo)));
            return this.c;
        } else if (!this.b.isFromWallet() && !TextUtils.isEmpty(PhoneCashierMspEngine.getMspWallet().getProductId()) && PhoneCashierMspEngine.getMspWallet().getProductId().contains("WALLET_MO_ANDROID")) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.pay.MspPayClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(MspPayClient.a(MspPayClient.this).getContext().getApplicationContext(), LanguageHelper.localizedStringForKey("msp_need_change_alipay_zone", MspPayClient.a(MspPayClient.this).getContext().getApplicationContext().getString(R.string.msp_need_change_alipay_zone), new Object[0]), 1).show();
                    }
                }
            });
            this.b.getStatisticInfo().addError(ErrorType.WARNING, "exit", "pay_macao");
            this.b.exit(0);
            LogUtil.record(4, "MspPayClient:pay", "cur is in macao, need change to CN.");
            return this.c;
        } else {
            FlybirdUtil.initLoggingSdk(this.b.getContext());
            try {
                LogUtil.record(4, "MspPayClient:pay", "externalInfo = ".concat(String.valueOf(orderInfo)));
                int hashCode = orderInfo.hashCode();
                String a2 = a(orderInfo, hashCode);
                if (!TextUtils.equals(a2, "continue")) {
                    try {
                        MspContextManager.getInstance().removeRawBizId(hashCode);
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                    this.d = true;
                    this.b.getStatisticInfo().addError(ErrorType.WARNING, "exit", a2);
                    this.b.exit(0);
                    MspPayResult mspPayResult = this.c;
                    NativeDynFunManager.processWithFallbackAsync(this.f4944a, DynConstants.DynFunNames.F_PAY_EXIT, new Object[]{this.c.getEndCode(), this.c.getResult(), this.c.getMemo()}, NativeDynFunManager.FallbackFunction.noop, NativeDynFunManager.ResultCallbackFunction.noop);
                    String formatResult = this.c.formatResult(1);
                    a(orderInfo, formatResult);
                    if (this.b.isSchemePay()) {
                        a(orderInfo, formatResult, this.b.getContext());
                    }
                    a();
                    a(formatResult);
                    return mspPayResult;
                }
                PreRendManager.getInstance().removeContext();
                MspContextManager.getInstance().addRawBizId(hashCode, this.f4944a);
                ActionsCreator.get(this.b).createUIFirstAction();
                int i = this.f4944a;
                if (OrderInfoUtil.isOutTradeOrder(orderInfo)) {
                    PhoneCashierMspEngine.getMspWallet().initAuthToken();
                }
                BroadcastUtil.sendEnterBroadcast(this.b.getContext(), this.b);
                StringBuilder sb = new StringBuilder();
                sb.append(orderInfo.hashCode());
                String sb2 = sb.toString();
                String str = null;
                MspPaySession paySession = this.b.getPaySession();
                if (paySession != null && (certPayModel = paySession.getCertPayModel()) != null) {
                    str = certPayModel.pid;
                }
                if (!TextUtils.isEmpty(str)) {
                    CashierSceneDictionary.getInstance().saveCertPaySession(sb2, i);
                }
                if (this.b.isExit() ? MqpConfigService.isTrue(DrmKey.DEGRADE_NOT_WAIT_EXITING_CONTEXT) : true) {
                    if (this.b.isUseNewPayResultLock()) {
                        this.b.blockPayCallbackLock();
                    } else {
                        synchronized (this.b) {
                            try {
                                this.b.wait();
                            } catch (InterruptedException e2) {
                                LogUtil.printExceptionStackTrace(e2);
                            }
                        }
                    }
                }
                MspContextManager.getInstance().removeRawBizId(hashCode);
                NativeDynFunManager.processWithFallbackAsync(this.f4944a, DynConstants.DynFunNames.F_PAY_EXIT, new Object[]{this.c.getEndCode(), this.c.getResult(), this.c.getMemo()}, NativeDynFunManager.FallbackFunction.noop, NativeDynFunManager.ResultCallbackFunction.noop);
                String formatResult2 = this.c.formatResult(1);
                a(orderInfo, formatResult2);
                if (this.b.isSchemePay()) {
                    a(orderInfo, formatResult2, this.b.getContext());
                }
                a();
                a(formatResult2);
                return this.c;
            } catch (Throwable th) {
                NativeDynFunManager.processWithFallbackAsync(this.f4944a, DynConstants.DynFunNames.F_PAY_EXIT, new Object[]{this.c.getEndCode(), this.c.getResult(), this.c.getMemo()}, NativeDynFunManager.FallbackFunction.noop, NativeDynFunManager.ResultCallbackFunction.noop);
                String formatResult3 = this.c.formatResult(1);
                a(orderInfo, formatResult3);
                if (this.b.isSchemePay()) {
                    a(orderInfo, formatResult3, this.b.getContext());
                }
                a();
                a(formatResult3);
                throw th;
            }
        }
    }

    public void exitWithoutPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90310380", new Object[]{this});
            return;
        }
        MspTradeContext mspTradeContext = this.b;
        if (mspTradeContext == null) {
            return;
        }
        if (mspTradeContext.getOrderInfo() != null) {
            MspContextManager.getInstance().removeRawBizId(this.b.getOrderInfo().hashCode());
        }
        MspPayResult mspPayResult = this.c;
        a(mspPayResult != null ? mspPayResult.formatResult(1) : "");
    }

    private String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i)});
        }
        if (a(this.b, i, this.f4944a)) {
            return CheckPayResult.DUP_5S;
        }
        Context context = this.b.getContext();
        if (context != null) {
            context.getPackageName();
        }
        this.b.isFromWallet();
        PhoneCashierMspEngine.getMspWallet().clearCheckLoginStatus();
        this.b.setPaying(true);
        MspContextManager.getInstance().clearFingerPayTask(this.b, str);
        if (!this.b.isFromWallet()) {
            PhoneCashierMspEngine.getMspViSec().cleanFpCache();
        }
        try {
            if (GlobalSdkConstant.getSdkType()) {
                return "continue";
            }
            LoggerFactory.getLogContext().setLogCustomerControl(new LogCustomerControl() { // from class: com.alipay.android.msp.pay.MspPayClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.logging.api.LogCustomerControl
                public boolean isLogWrite(LogWriteInfo logWriteInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8dc020d8", new Object[]{this, logWriteInfo})).booleanValue();
                    }
                    return true;
                }

                @Override // com.alipay.mobile.common.logging.api.LogCustomerControl
                public UploadResultInfo isLogUpload(LogUploadInfo logUploadInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (UploadResultInfo) ipChange2.ipc$dispatch("13849b1", new Object[]{this, logUploadInfo});
                    }
                    UploadResultInfo uploadResultInfo = new UploadResultInfo();
                    uploadResultInfo.isUpload = false;
                    return uploadResultInfo;
                }
            });
            return "continue";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "continue";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x010c, code lost:
        if (r2 != r6) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149 A[Catch: all -> 0x01f3, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000c, B:9:0x002d, B:11:0x003f, B:12:0x0041, B:14:0x004b, B:16:0x0055, B:18:0x005f, B:21:0x0069, B:23:0x007b, B:54:0x0151, B:56:0x016a, B:57:0x016d, B:59:0x017e, B:61:0x018d, B:63:0x0193, B:64:0x019b, B:66:0x01a1, B:68:0x01ab, B:70:0x01b3, B:71:0x01c0, B:73:0x01e0, B:25:0x0086, B:26:0x00a2, B:28:0x00c8, B:30:0x00ce, B:31:0x00d9, B:37:0x00f8, B:40:0x0102, B:51:0x0121, B:53:0x0149, B:45:0x0112, B:47:0x0118), top: B:79:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized boolean a(com.alipay.android.msp.core.context.MspTradeContext r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.pay.MspPayClient.a(com.alipay.android.msp.core.context.MspTradeContext, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x016b A[Catch: all -> 0x022a, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0012, B:9:0x0038, B:14:0x004e, B:15:0x0079, B:17:0x00a9, B:19:0x00c2, B:22:0x00ca, B:25:0x00d7, B:31:0x00f6, B:34:0x011f, B:36:0x0129, B:39:0x0133, B:41:0x0139, B:43:0x013f, B:45:0x0145, B:49:0x014d, B:51:0x0157, B:53:0x015d, B:54:0x0165, B:56:0x016b, B:58:0x0175, B:61:0x0180, B:64:0x0197, B:66:0x01b6, B:67:0x01d2, B:70:0x0223), top: B:78:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197 A[Catch: all -> 0x022a, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0012, B:9:0x0038, B:14:0x004e, B:15:0x0079, B:17:0x00a9, B:19:0x00c2, B:22:0x00ca, B:25:0x00d7, B:31:0x00f6, B:34:0x011f, B:36:0x0129, B:39:0x0133, B:41:0x0139, B:43:0x013f, B:45:0x0145, B:49:0x014d, B:51:0x0157, B:53:0x015d, B:54:0x0165, B:56:0x016b, B:58:0x0175, B:61:0x0180, B:64:0x0197, B:66:0x01b6, B:67:0x01d2, B:70:0x0223), top: B:78:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized boolean a(int r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.pay.MspPayClient.a(int, int, int):boolean");
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.e) {
        } else {
            this.e = true;
            if (!GlobalSdkConstant.getSdkType()) {
                try {
                    LoggerFactory.getLogContext().setLogCustomerControl(null);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            MspTradeContext mspTradeContext = this.b;
            if (mspTradeContext != null) {
                if (str != null) {
                    mspTradeContext.getStatisticInfo().updateResult(str, this.b.getCurrentWinTpName());
                } else {
                    mspTradeContext.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_PAY_RESULT_NULL, ErrorCode.DEFAULT_PAY_RESULT_NULL);
                }
                try {
                    this.b.isFromWallet();
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
            }
            final MspTradeContext mspTradeContext2 = this.b;
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.pay.MspPayClient.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspTradeContext mspTradeContext3 = mspTradeContext2;
                    if (mspTradeContext3 == null) {
                        return;
                    }
                    mspTradeContext3.getStatisticInfo().updateBiz(mspTradeContext2.getClientLogData());
                    mspTradeContext2.getStatisticInfo().updateAttr(Vector.Device, "oaid", PhoneCashierMspEngine.getMspBase().getOaid(mspTradeContext2.getContext()));
                    mspTradeContext2.getStatisticInfo().onStatisticEnd();
                }
            }, 300L);
            Context context = mspTradeContext2.getContext();
            if (context != null && DrmManager.getInstance(context).isGray(DrmKey.GRAY_DELAY_THREAD_RUNNABLE, false, context)) {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 300L, TaskHelper.ThreadName.UI_CONTEXT);
            } else {
                TaskHelper.execute(monitorRunnable, 300L);
            }
            LogUtil.record(4, "phonecashiermsp#MspService", "PayEntrance.onPayEnd");
            String str2 = "";
            if (!this.d) {
                String globalSession = (this.b == null || mspTradeContext2.getGlobalSession() == null) ? str2 : mspTradeContext2.getGlobalSession();
                LogUtil.record(4, "PayEntrance.onPayEnd", " ,sessionId=".concat(String.valueOf(globalSession)));
                BroadcastUtil.sendEndBroadcast(GlobalHelper.getInstance().getContext(), globalSession, this.b, str);
            }
            if (PhoneCashierHttpClient.isNeedShutdownAtPayEnd()) {
                LogUtil.record(4, "PayEntrance.onPayEnd", "net cost too long:shutdown");
                try {
                    PhoneCashierHttpClient.newInstance().shutdown();
                } catch (Throwable th3) {
                    LogUtil.printExceptionStackTrace(th3);
                }
                PhoneCashierHttpClient.setIsNeedShutdownAtPayEnd(false);
            }
            PluginManager.getDnsEngine().updateDns();
            if (this.b != null) {
                FlybirdUtil.initHTTPDNS(mspTradeContext2);
                this.b.setPaying(false);
            }
            try {
                MspContextManager.getInstance().removeMspContextByBizId(this.f4944a);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            if (MspByPassProcessor.isUpdateSceneEnabled("scene4")) {
                MspByPassProcessor.getInstance().triggerByPassProcess(LogItem.TemplateUpdateScene.CashierExit);
            }
            MspPayResult mspPayResult = this.c;
            if (mspPayResult != null) {
                str2 = mspPayResult.getEndCode();
            }
            SpmHelper.spmExpPayActionEnd(this.b, str2);
        }
    }

    private void a(String str, String str2) {
        String str3;
        String str4;
        MspPaySession.CertPayModel certPayModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        String sb2 = sb.toString();
        MspPaySession paySession = this.b.getPaySession();
        String str5 = null;
        if (paySession == null || (certPayModel = paySession.getCertPayModel()) == null) {
            str3 = null;
            str4 = null;
        } else {
            str5 = certPayModel.pid;
            str4 = certPayModel.packageName;
            str3 = certPayModel.callbackUrl;
        }
        if (TextUtils.isEmpty(str5) || str.contains("biz_type=\"share_pp\"")) {
            return;
        }
        try {
            Context context = this.b.getContext();
            Intent intent = new Intent("com.alipay.android.app.certpayresult");
            intent.putExtra("certpay_session", sb2);
            intent.putExtra(MspGlobalDefine.SCHEME_PAY_RESULT, str2);
            if (!TextUtils.isEmpty(str4)) {
                intent.setPackage(str4);
            }
            LogUtil.record(2, "MspPayClient:sendCertPayResult", "mspCtx=" + this.b);
            context.sendBroadcast(intent);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (DeviceInfo.isProcessExit(this.b.getContext(), str5)) {
            return;
        }
        try {
            PhoneCashierMspEngine.getMspJump().processScheme(str3);
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
    }

    private void a(String str, String str2, Context context) {
        String str3;
        MspPaySession.SchemePayModel schemePayModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d63e1cc", new Object[]{this, str, str2, context});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        String sb2 = sb.toString();
        Intent intent = new Intent(MspGlobalDefine.SCHEME_PAY_ACTION);
        MspPaySession paySession = this.b.getPaySession();
        String str4 = null;
        if (paySession == null || (schemePayModel = paySession.getSchemePayModel()) == null) {
            str3 = null;
        } else {
            str4 = schemePayModel.desKey;
            str3 = schemePayModel.packageName;
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.setPackage(str3);
        }
        intent.putExtra(MspGlobalDefine.SCHEME_PAY_SESSION, TriDes.encrypt(str4, sb2));
        intent.putExtra(MspGlobalDefine.SCHEME_PAY_RESULT, TriDes.encrypt(str4, str2));
        LogUtil.record(4, "MspPayClient:sendSchemePayResult", "mCtx=" + this.b);
        context.sendBroadcast(intent);
    }

    private void a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MspTradeContext mspTradeContext = this.b;
        if (mspTradeContext == null) {
            return;
        }
        String orderInfo = mspTradeContext.getOrderInfo();
        if (TextUtils.isEmpty(orderInfo)) {
            return;
        }
        MspPaySession paySession = this.b.getPaySession();
        boolean z = paySession != null && paySession.isFromWalletH5Pay();
        boolean z2 = orderInfo.contains("h5_route_token=\"") && orderInfo.contains("is_h5_route=\"true\"") && !z;
        if (orderInfo.contains("isMoveTaskToBack=\"true\"")) {
            z2 = true;
        }
        if (!TextUtils.isEmpty((paySession == null || paySession.getCertPayModel() == null) ? null : paySession.getCertPayModel().pid) && !orderInfo.contains("external_spec_action=\"/shareppay/sendMsg\"")) {
            z2 = true;
        }
        if (this.b.isSchemePay()) {
            z2 = true;
        }
        String[] split = orderInfo.split("&");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = null;
                break;
            }
            str = split[i];
            if (!TextUtils.isEmpty(str) && str.startsWith("bizcontext=")) {
                break;
            }
            i++;
        }
        if (!TextUtils.isEmpty(str) && str.contains("\"fromH5\":\"true\"") && !z) {
            z2 = true;
        }
        String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.GO_WHERE_FROM_ON_PAY_END);
        String outPackageName = this.b.getOutPackageName();
        String sceneType = paySession != null ? paySession.getSceneType() : null;
        boolean isConfigJsonContainsTarget = Utils.isConfigJsonContainsTarget(walletConfig, outPackageName, "blackPkg", "whitePkg", "all");
        boolean equals = "h5Route".equals(sceneType);
        LogUtil.record(2, "MspPayClient:tryMoveTaskToBack", "needJumpBack=" + isConfigJsonContainsTarget + ", isMoveTaskToBack=" + z2 + ", orderSceneType=" + sceneType);
        if (isConfigJsonContainsTarget && z2) {
            try {
                if (PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity() != null) {
                    Intent launchIntentForPackage = PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity().getPackageManager().getLaunchIntentForPackage(outPackageName);
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.setPackage(null);
                        PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity().startActivity(launchIntentForPackage);
                    }
                    this.b.getMspPayResult().setWontCallbackUrlJump(true);
                    EventLogUtil.logPayEvent("1010469", "packageName", outPackageName, "scene", sceneType);
                    return;
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        if (equals || !z2) {
            return;
        }
        try {
            if (PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity() == null) {
                return;
            }
            PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity().moveTaskToBack(true);
        } catch (Throwable th2) {
            LogUtil.printExceptionStackTrace(th2);
        }
    }
}
