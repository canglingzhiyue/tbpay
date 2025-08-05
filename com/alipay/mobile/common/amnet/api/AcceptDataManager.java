package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import java.util.Map;

/* loaded from: classes3.dex */
public interface AcceptDataManager {
    void addPushAcceptDataListener(AcceptDataListener acceptDataListener);

    void addRpcAcceptDataListener(AcceptDataListener acceptDataListener);

    void addSyncAcceptDataListener(AcceptDataListener acceptDataListener);

    void addSyncDirectAcceptDataListener(AcceptDataListener acceptDataListener);

    void notifyAcceptedData(AcceptedData acceptedData);

    void notifyRecycle(byte b, Map<String, String> map, byte[] bArr);

    void notifyReqPacketSize(byte b, long j, int i, int i2);

    void removePushAcceptDataListener();

    void removeRpcAcceptDataListener();

    void removeSyncAcceptDataListener();

    void removeSyncDirectAcceptDataListener();
}
