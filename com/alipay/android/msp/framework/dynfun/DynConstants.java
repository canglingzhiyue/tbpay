package com.alipay.android.msp.framework.dynfun;

import android.content.Context;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DynConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public @interface DynDataNames {
        public static final String D_AP_LINK_TOKEN = "ap_link_token";
        public static final String D_CHANGE_TOKENS = "changeTokens";
        public static final String D_CLIENT_LOG_DATA = "clientLogData";
        public static final String D_DYN_DATA_STUB = "dyn_data_stub";
        public static final String D_ORDER_STR = "orderStr";
        public static final String D_RESULT_END_CODE = "resultStatus";
        public static final String D_RESULT_MEMO = "resultMemo";
        public static final String D_RESULT_RESULT = "resultString";
        public static final String D_SESSION = "sessionId";
        public static final String D_TRADE_NO = "trade_no";
    }

    /* loaded from: classes3.dex */
    public @interface DynFunNames {
        public static final String F_APPEND_VALUE_TO_STR = "append_val_to_str";
        public static final String F_BIZ_TYPE_FOR_LOG = "biz_type_for_log";
        public static final String F_CTX_WILL_EXIT = "ctx_will_exit";
        public static final String F_PAY_EXIT = "pay_exit";
        public static final String F_PAY_SERVER_INVOKE = "pay_server_invoke";
        public static final String F_RESOLVE_RES = "resolve_res";
        public static final String F_TPL_PRELOAD = "tpl_preload";
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (AlertIntelligenceEngine.getInstance().byLogicContext()) {
            return false;
        }
        Context context = GlobalHelper.getInstance().getContext();
        return DrmManager.getInstance(context).isGray(DrmKey.GRAY_DYN_FUN, false, context);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        return DrmManager.getInstance(context).isGray(DrmKey.GRAY_DYN_FUN_VERIFY, false, context);
    }
}
