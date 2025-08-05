package com.alipay.mobile.common.amnet.ipcapi.mainproc;

import com.alipay.mobile.common.transportext.amnet.Initialization;
import java.util.Map;

/* loaded from: classes3.dex */
public interface MainProcGeneralListenService {
    public static final byte ACTIVED = 2;
    public static final byte SHUTDOWND = 1;

    void change(int i);

    Map<Byte, Map<String, String>> collect(Map<Byte, Map<String, String>> map);

    void listenSessionInvalid();

    void notifyAmnetLifeChanged(byte b);

    void notifyGift(String str, String str2);

    void notifyInitOk();

    void notifyInitResponse(Initialization.RspInit rspInit);

    void onFinalErrorEvent(long j, int i, String str, Map<String, String> map);

    void panic(int i, String str);

    void report(String str, double d);

    void resendSessionid();

    void restrict(int i, String str);

    void touch(String str, String str2, String str3, String str4);
}
