package com.taobao.tao.log.interceptor;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.oki;
import tb.okk;

/* loaded from: classes.dex */
public class RealTimeLogMessageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static okk f20691a;

    /* loaded from: classes8.dex */
    public static class ServerMessage {
        public int command;
        public String data;

        static {
            kge.a(1784573994);
        }
    }

    static {
        kge.a(-1055510486);
    }

    public static /* synthetic */ void lambda$LoXOnoZpkl0g9H1a9GNVRrCn3Tk(int i, String str) {
        b(i, str);
    }

    public static /* synthetic */ void lambda$r1FVnY9yXrE_lVkQY84FS0YtGY0(byte[] bArr) {
        b(bArr);
    }

    public static void a(okk okkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8145269", new Object[]{okkVar});
        } else if (f20691a != null) {
        } else {
            f20691a = okkVar;
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
        } catch (Exception e) {
            Log.e("RealTimeMessageManager", "Init messenger exception", e);
        }
        if (f20691a != null) {
            oki okiVar = new oki();
            okiVar.b = context;
            okiVar.i = com.taobao.tao.log.f.a().d;
            f20691a.a(okiVar);
            return true;
        }
        Log.e("RealTimeMessageManager", "messageSender is null");
        return false;
    }

    public static void a(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{bArr});
        } else if (bArr == null) {
        } else {
            com.taobao.tao.log.utils.d.a().a(new Runnable() { // from class: com.taobao.tao.log.interceptor.-$$Lambda$RealTimeLogMessageManager$r1FVnY9yXrE_lVkQY84FS0YtGY0
                @Override // java.lang.Runnable
                public final void run() {
                    RealTimeLogMessageManager.lambda$r1FVnY9yXrE_lVkQY84FS0YtGY0(bArr);
                }
            });
        }
    }

    public static /* synthetic */ void b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffa270", new Object[]{bArr});
            return;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            if (decode == null) {
                Log.e("RealTimeMessageManager", "Failed to decode data");
            } else if (decode.length == 0) {
            } else {
                ServerMessage serverMessage = (ServerMessage) JSON.parseObject(decode, ServerMessage.class, new Feature[0]);
                if (serverMessage == null) {
                    Log.e("RealTimeMessageManager", "Failed to parse date to ServerMessage: " + new String(decode));
                    return;
                }
                a(serverMessage);
            }
        } catch (Exception e) {
            Log.e("RealTimeMessageManager", "handleServerMessage error.", e);
        }
    }

    private static void a(ServerMessage serverMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0843ad", new Object[]{serverMessage});
            return;
        }
        int i = serverMessage.command;
        if (i == 4) {
            a(d.a(com.taobao.tao.log.f.a().j(), serverMessage.data));
        } else if (i == 7) {
            a();
        } else {
            String str = "Unsupported command: " + serverMessage.command;
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        String str = "Send Config ACK, reason: " + i;
        a(5, String.valueOf(i));
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        String str = "Send Status: " + d.f20692a;
        a(8, String.valueOf(d.f20692a));
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            return;
        }
        String str = "Send real time stop, reason: " + i;
        a(8, String.valueOf(i));
    }

    private static void a(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
        } else if (f20691a == null) {
        } else {
            String.format("Send {command: %d, data: %S} to server", Integer.valueOf(i), str);
            com.taobao.tao.log.utils.d.a().a(new Runnable() { // from class: com.taobao.tao.log.interceptor.-$$Lambda$RealTimeLogMessageManager$LoXOnoZpkl0g9H1a9GNVRrCn3Tk
                @Override // java.lang.Runnable
                public final void run() {
                    RealTimeLogMessageManager.lambda$LoXOnoZpkl0g9H1a9GNVRrCn3Tk(i, str);
                }
            });
        }
    }

    public static /* synthetic */ void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{new Integer(i), str});
            return;
        }
        try {
            ServerMessage serverMessage = new ServerMessage();
            serverMessage.command = i;
            serverMessage.data = str;
            oki okiVar = new oki();
            okiVar.b = com.taobao.tao.log.f.a().j();
            okiVar.i = com.taobao.tao.log.f.a().d;
            okiVar.c = JSON.toJSONString(serverMessage);
            f20691a.b(okiVar);
        } catch (Exception e) {
            Log.e("RealTimeMessageManager", "sendCommand exception", e);
        }
    }
}
