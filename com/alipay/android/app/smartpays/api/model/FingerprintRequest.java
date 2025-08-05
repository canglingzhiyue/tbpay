package com.alipay.android.app.smartpays.api.model;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class FingerprintRequest {
    public String mData;
    public boolean mIsSamsung;
    public int mScanType;
    public String mTipsMsg;
    public String mUserId;
}
