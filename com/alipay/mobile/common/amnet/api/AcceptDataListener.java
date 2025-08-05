package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import java.util.Map;

/* loaded from: classes3.dex */
public interface AcceptDataListener {
    void onAcceptedDataEvent(AcceptedData acceptedData);

    void recycle(byte b, Map<String, String> map, byte[] bArr);

    void tell(byte b, long j, int i, int i2);
}
