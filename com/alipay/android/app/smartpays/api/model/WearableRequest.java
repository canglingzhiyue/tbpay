package com.alipay.android.app.smartpays.api.model;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class WearableRequest {
    public static final int BARCELET = 1;
    public static final int WATCH = 2;
    public String mData;
    public int mDeviceType;
    public String mUserId;
}
