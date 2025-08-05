package com.alipay.android.app.smartpays.api.model;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class WearableResult {
    public static final int ERROR_BTOFF = 123;
    public static final int ERROR_CANCELED = 102;
    public static final int ERROR_SUCCESS = 100;
    public static final int ERROR_TIMEOUT = 113;
    public static final int ERROR_UNMATCH = 103;
    public String mData;
    public String mMessage;
    public int mResult;
    public String mTokenId;
    public int mType;
}
