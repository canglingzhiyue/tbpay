package com.taobao.trtc.rtcroom;

/* loaded from: classes9.dex */
public interface b {
    void onMiniWindowClicked();

    void sendAudioMode(int i);

    void sendEnterRoom();

    void sendError(int i, String str);

    void sendFirstRender(String str);

    void sendLeaveRoom();

    void sendNetStat(boolean z);

    void sendRemoteJoin(String str);

    void sendRemoteLeave(String str, String str2);
}
