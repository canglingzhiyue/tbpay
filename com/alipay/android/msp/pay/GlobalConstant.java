package com.alipay.android.msp.pay;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class GlobalConstant {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_HK_PACKAGE_NAME = "hk.alipay.wallet";
    public static final String ALIPAY_PACKAGE_NAME = "com.eg.android.AlipayGphone";
    public static boolean DEBUG = false;
    public static final String GLOBAL_SETTINGS = "demo_global_settings";
    public static final String HARDWARE_PAY_TYPES = "fp;wear";
    public static int HTTP_CONNECTION_TIMEOUT = 30000;
    public static int HTTP_SOCKET_BUFFER_SIZE = 16384;
    public static int HTTP_SO_TIMEOUT = 30000;
    public static final String KEY_MC_PACKAGE_NAME = "an";
    public static final String KEY_RSA = "trideskey";
    public static final String LAST_MSP_PARAMS = "last_msp_params";
    public static String MEMORY_CACHE_APDIDTOKEN_VALUE = "";
    public static String MEMORY_CACHE_DECAY_VALUE = "";
    public static final String MSP_PACKAGENAME = "com.alipay.android.app";
    public static final String PAD_ADAPT_TPL_METADATA = "{\"QUICKPAY@cashier-unify-activity-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@bizapp-collect-money\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-no-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-type-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-apply-delivery\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-payandsign-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@message-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-detail-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-select-bank-flex\": {\"full_screen\": \"Y\", \"x\": \"Y\"},\"QUICKPAY@open-account-auth-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@deposit-index-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-activity-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@deduct-pre-confirm-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect-sms\": {\"full_screen\": \"Y\"},\"QUICKPAY@bizapp-store-pay\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wk-card-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-no-recorrect-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-sms-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-phone-login-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@frontpay-limit-query-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wkcard-billaddr-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect\": {\"full_screen\": \"Y\"},\"QUICKPAY@pwd-validate-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-channel-priority-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setspwd-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-login-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-account-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect-quiz-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-default-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-laboratory-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-activity-default-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-evalute-cashier-unified\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-apply-qrcode-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-peerpay-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-sign-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-evalute-cashier-unified\": {\"full_screen\": \"Y\"},\"QUICKPAY@afterpay-guide-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-transfer-detail-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@fingerprint-open-auth-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@large-box-pay-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-inst-select-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@special-account-deposit-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-phone-modification-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-new-wk-card-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-search-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-apply-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying-superpower-template\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying-superpower-exp\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-agreement-manage-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-usa-state-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wkcard-billaddr-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-country-and-area-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-qrcode-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-categories-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-order-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-country-and-area-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-date-first-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-laboratory-guide-flex\":{\"non_pad_adaptable\":\"Y\", \"auto_rotating\": \"Y\"},\"QUICKPAY@sharepay-apply-search\": {\"full_screen\": \"Y\"}}";
    public static String RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
    public static final String SCHEME_TO_WALLET_HOME = "alipays://platformapi/startapp?appId=20000001&actionType=20000002";
    public static final String SDK_TYPE = "AliChannelInfo";
    public static int SOCKET_OPERATION_TIMEOUT = 30000;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f4943a = false;

    public static synchronized void loadProperties(Context context) {
        synchronized (GlobalConstant.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cb05d08", new Object[]{context});
            } else if (context == null) {
            } else {
                GlobalHelper.getInstance().init(context);
                if (f4943a && !DEBUG) {
                    return;
                }
                try {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    String string = defaultSharedPreferences.getString(KEY_RSA, null);
                    if (!TextUtils.isEmpty(string)) {
                        RSA_PUBLIC = string;
                    } else {
                        RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
                        defaultSharedPreferences.edit().putString(KEY_RSA, RSA_PUBLIC).apply();
                    }
                    initializeDebug(context);
                    f4943a = true;
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.DEFAULT_INITIALIZE_PROP_EX, e);
                }
            }
        }
    }

    public static void initializeDebug(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b78f5e", new Object[]{context});
            return;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            DEBUG = z;
            SPTaskHelper.DEBUG = z;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public static String getTemplateVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba17df31", new Object[0]) : TemplateService.getBirdNestVersion();
    }
}
