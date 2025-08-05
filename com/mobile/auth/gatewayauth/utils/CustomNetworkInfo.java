package com.mobile.auth.gatewayauth.utils;

import java.io.Serializable;

/* loaded from: classes4.dex */
class CustomNetworkInfo implements Serializable {
    String operatorId;
    String simCarrierIdName;
    String simCountryIso;
    String simOperatorName;
    int simSpecificCarrierId;
    String simSpecificCarrierName;
    String vendor;
    String vendorKey;
    int simCarrierId = -1;
    int dataSubId = -1;

    CustomNetworkInfo() {
    }
}
