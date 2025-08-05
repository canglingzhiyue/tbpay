package com.taobao.trtc.signal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcSignalChannelHandler;
import com.taobao.trtc.accs.c;
import com.taobao.trtc.impl.k;
import com.taobao.trtc.utils.TrtcLog;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcSignalChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f23181a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    private static volatile boolean f;
    private static b g;
    private static a h;

    private static native void nativeOnTrtcSignalRecv(String str);

    static {
        kge.a(-1652345322);
        f23181a = "accs";
        b = "lwp";
        c = "mqtt";
        d = com.taobao.trtc.accs.a.TRTC_ACCS_SERVICE;
        f = false;
        g = null;
        h = null;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        if (str.equals(f23181a)) {
            g = new c();
            h = new com.taobao.trtc.accs.b();
        }
        e = str2;
        com.taobao.trtc.accs.a.a(h);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        g = null;
        h = null;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        e = str;
        TrtcLog.d("TrtcSignalChannel", "update local user id: " + str);
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        f = z;
        TrtcLog.d("TrtcSignalChannel", "set is grtn: " + z);
    }

    public static String sendSignalData(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f4d0eee", new Object[]{bArr, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("userId", e);
        hashMap.put("serviceId", d);
        b bVar = g;
        if (bVar == null) {
            return "default";
        }
        String a2 = bVar.a(bArr, hashMap);
        TrtcLog.a("TrtcSignalChannel", ">>>>>> sendSignalData, channelId: " + ((String) hashMap.get("channelId")) + ", deviceId: " + ((String) hashMap.get("deviceId")) + ", sequenceId: " + ((String) hashMap.get(ArtcSignalChannelHandler.ArgsKey.KEY_SEQUENCE_ID)) + ", commandId: " + ((String) hashMap.get(ArtcSignalChannelHandler.ArgsKey.KEY_TYPE_ID)) + ", userId: " + ((String) hashMap.get("userId")) + ", dataId: " + a2);
        return a2;
    }

    public static String sendSignalData(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95fc050b", new Object[]{str, str2}) : sendSignalData(str.getBytes(StandardCharsets.UTF_8), str2);
    }

    public static void a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{bArr, str});
            return;
        }
        TrtcLog.a("TrtcSignalChannel", "<<<<<< recvSignalData, len: " + bArr.length);
        if (k.a(bArr, str)) {
            return;
        }
        b(bArr, str);
    }

    public static void b(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6b103a", new Object[]{bArr, str});
        } else {
            nativeOnTrtcSignalRecv(new String(bArr));
        }
    }
}
