package com.taobao.tao.powermsg.common;

import java.util.Map;

/* loaded from: classes8.dex */
public interface d {
    void countValue(int i, String str, Map<String, Double> map, boolean z, b bVar, Object... objArr);

    void doFullLink(PowerMessage powerMessage, com.taobao.tao.messagekit.base.monitor.e eVar);

    c getStableDispatcher(String str);

    boolean queryMessagesByStream(int i, String str, f fVar);

    int registerDispatcher(int i, String str, c cVar);

    void registerStableDispatcher(String str, c cVar);

    void report(int i, PowerMessage powerMessage, int i2);

    void sendMessage(int i, PowerMessage powerMessage, b bVar, Object... objArr);

    void sendRequest(int i, String str, int i2, int i3, int i4, b bVar, Object... objArr);

    void sendStreamMessage(int i, PowerMessage powerMessage, f fVar, b bVar, Object... objArr);

    void sendText(int i, TextPowerMessage textPowerMessage, b bVar, Object... objArr);

    void setMsgFetchMode(int i, String str, int i2);

    void subscribe(int i, String str, String str2, String str3, String str4, b bVar, Object... objArr);

    void subscribe(int i, String str, String str2, String str3, String str4, String str5, b bVar, f fVar, Object... objArr);

    void subscribe(int i, String str, String str2, String str3, String str4, String str5, b bVar, Object... objArr);

    void unRegisterStableDispatcher(String str);

    void unSubscribe(int i, String str, String str2, String str3, String str4, b bVar, Object... objArr);

    void unSubscribe(int i, String str, String str2, String str3, String str4, String str5, b bVar, f fVar, Object... objArr);

    void unSubscribe(int i, String str, String str2, String str3, String str4, String str5, b bVar, Object... objArr);
}
