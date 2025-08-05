package com.taobao.android.purchase.core;

import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static final String BIND_ALIPAY_BIZ_SCENE = "login";
    public static final String BUY_URL_FORMAT = "%s&sid=%s&ttid=%s&refer=tbc";
    public static final String NETWORK_ERROR_MSG;
    public static final String UT_PAGE_NAME = "ConfirmOrder";

    static {
        kge.a(1797712963);
        NETWORK_ERROR_MSG = com.alibaba.ability.localization.b.a(R.string.purchase_taobao_app_1029_1_19071);
    }
}
