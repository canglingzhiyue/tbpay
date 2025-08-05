package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.api.model.DnsInfo;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface AmnetGeneralListener {
    void change(int i);

    Map<Byte, Map<String, String>> collect(Map<Byte, Map<String, String>> map);

    Map<Byte, byte[]> collectV2(Map<Byte, byte[]> map);

    void listenSessionInvalid();

    void notifyGift(String str, String str2);

    void notifyInitOk();

    void notifyInitResponse(Initialization.RspInit rspInit);

    void notifyReconnect();

    void notifyResendSessionid();

    void notifyUpdateConfigInfo(Map<String, String> map);

    void notifyUpdateDnsInfo(List<DnsInfo> list);

    void onFinalErrorEvent(long j, int i, String str, Map<String, String> map);

    void panic(int i, String str);

    void report(String str, double d);

    void restrict(int i, String str);

    void touch(String str, String str2, String str3, String str4);
}
