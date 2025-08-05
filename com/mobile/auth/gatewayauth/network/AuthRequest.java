package com.mobile.auth.gatewayauth.network;

import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.mobile.auth.OO00O;
import com.nirvana.tools.jsoner.JsonerTag;

/* loaded from: classes4.dex */
public class AuthRequest extends OO00O {
    @JsonerTag(keyName = HeaderConstant.HEADER_KEY_VERSION)
    private String Version = "2017-05-25";
    @JsonerTag(keyName = "Format")
    private String Format = "JSON";
}
