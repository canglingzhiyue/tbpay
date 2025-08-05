package com.alipay.mobile.common.amnet.ipcapi.pushproc;

import android.content.Intent;
import java.util.Map;

/* loaded from: classes3.dex */
public interface OutEventNotifyService {
    void notifyAppLeaveEvent();

    void notifyAppResumeEvent();

    void notifyLoginOrLogoutEvent(String str, String str2, byte[] bArr);

    void notifyResendSessionid(String str, String str2);

    void notifySceneEvent(String str, boolean z);

    void notifySeceenOffEvent();

    void notifySeceenOnEvent();

    void notifyUpdateDnsInfo(byte b, String str);

    void onSyncInitChanged(Map<String, String> map);

    void receiveNetInfo(Intent intent);
}
