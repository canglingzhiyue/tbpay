package com.alipay.security.mobile.bracelet.xiaomi;

import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.bracelet.BraceletAuthenticator;

/* loaded from: classes3.dex */
public class XiaomiAuthenticator extends BraceletAuthenticator {
    public static final String PACKAGE_NAME = "com.alipay.security.mobile.authenticator";
    public static final int PROTOCAL_VERSION = 1;
    public static final String SERVER_URL = "http://tfs.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk";
    public static final int VENDOR_TYPE = Constants.VENDOR_XIAOMI;
    public static final int PROTOCAL_TYPE = Constants.PROTOCOL_TYPE_ALIPAY;

    public XiaomiAuthenticator() {
        super(VENDOR_TYPE, PROTOCAL_TYPE, 1, "com.alipay.security.mobile.authenticator", SERVER_URL);
        this.mMinServiceVersion = 4;
    }
}
