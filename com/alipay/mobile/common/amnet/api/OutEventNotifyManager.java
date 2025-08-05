package com.alipay.mobile.common.amnet.api;

import android.content.Intent;

/* loaded from: classes3.dex */
public interface OutEventNotifyManager {
    public static final byte DNS_TYPE_ALL = 3;
    public static final byte DNS_TYPE_LONG = 1;
    public static final byte DNS_TYPE_MULTIPLEX = 4;
    public static final byte DNS_TYPE_SHORT = 2;
    public static final int STATE_CLOSE_DELAY_HANDSHAKE = 2;
    public static final int STATE_CLOSE_ORTT = 2;
    public static final int STATE_CLOSE_SMART_HEARTBEAT = 2;
    public static final int STATE_LOGIN = 1;
    public static final int STATE_LOGOUT = 2;
    public static final int STATE_MAIN_PROC_EXIST = 1;
    public static final int STATE_MAIN_PROC_NO_EXIST = 2;
    public static final int STATE_OPEN_DELAY_HANDSHAKE = 1;
    public static final int STATE_OPEN_ORTT = 1;
    public static final int STATE_OPEN_SMART_HEARTBEAT = 1;

    void notifyAppLeaveEvent();

    void notifyAppResumeEvent();

    void notifyLoginOrLogoutEvent(String str, String str2, byte[] bArr);

    void notifyMainProcExistStateChanged(int i);

    void notifyResendInitInfos();

    void notifyResendSessionid(String str, String str2);

    void notifySceneEvent(String str, boolean z);

    void notifySeceenOffEvent();

    void notifySeceenOnEvent();

    void notifySwitchDelayHandshake(int i);

    void notifySwitchOrtt(int i);

    void notifySwitchSmartHeartBeat(int i);

    void notifyUpdateDnsInfo(byte b, String str);

    void receiveNetInfo(Intent intent);
}
