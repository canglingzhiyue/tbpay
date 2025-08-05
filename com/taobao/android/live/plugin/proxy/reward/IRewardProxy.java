package com.taobao.android.live.plugin.proxy.reward;

import android.app.Activity;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* loaded from: classes6.dex */
public interface IRewardProxy extends IBTypeProxy {
    public static final String KEY = "IRewardProxy";

    /* loaded from: classes6.dex */
    public interface a {
        void a(Activity activity, String str, b bVar);
    }

    /* loaded from: classes6.dex */
    public interface b {
        public static final String ERR_CODE_LAST_RECHARGE_NOT_FINISH = "6";
        public static final String ERR_CODE_LINK_ID_INVALID = "5";
        public static final String ERR_CODE_NETWORK = "21005";
        public static final String ERR_CODE_PARAMS_INVALID = "1";
        public static final String ERR_CODE_PRODUCT_ID_INVALID = "2";
        public static final String ERR_CODE_RECHARGE_ID_INVALID = "3";
        public static final String ERR_CODE_TRANSACTION_ID_INVALID = "4";
        public static final String STEP_CREATE_ORDER = "creatOrder";
        public static final String STEP_H5CALL = "h5Call";
        public static final String STEP_RECHARGE = "recharge";

        void a();

        void a(String str, String str2, String str3);
    }

    a createRecharge();

    boolean enableTaoLiveReward();

    boolean isRewardEnable(TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar);
}
