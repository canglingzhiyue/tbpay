package com.taobao.trtc.accs;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsException;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.artc.internal.ADefines;
import com.taobao.artc.internal.ArtcEngineEventProxy;
import com.taobao.artc.internal.ArtcGlobal;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRTC_ACCS_SERVICE = "artccrc2";

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f23003a;
    public static String b;
    public static String c;
    public static int d;
    private static String e;
    private static com.taobao.trtc.signal.a f;
    private static final IAppReceiver g;
    private static final TrtcAccsConnectionBroadcastReceiver h;
    private static final Map<String, String> i;
    private static NetworkStatusHelper.INetworkStatusChangeListener j;

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : i;
    }

    static {
        kge.a(-682306659);
        f23003a = new AtomicBoolean(false);
        b = "";
        c = "";
        d = 0;
        e = "default";
        f = null;
        g = new IAppReceiver() { // from class: com.taobao.trtc.accs.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.accs.IAppReceiver
            public void onData(String str, String str2, byte[] bArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("20c4430b", new Object[]{this, str, str2, bArr});
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onSendData(String str, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("46c12d21", new Object[]{this, str, new Integer(i2)});
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onUnbindUser(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2f4f2cdc", new Object[]{this, new Integer(i2)});
                } else if (i2 != 200) {
                    h.b("TrtcAccsHandler", "unBindUser error | code: " + i2);
                } else {
                    h.a("TrtcAccsHandler", "Accs unBindUser success, userId: " + a.b + ", code: " + i2);
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onUnbindApp(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1230c610", new Object[]{this, new Integer(i2)});
                } else if (i2 != 200) {
                    h.b("TrtcAccsHandler", "Accs unBindApp error | code: " + i2);
                } else {
                    h.a("TrtcAccsHandler", "Accs unbindApp success, userId: " + a.b + ", code: " + i2);
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onBindUser(String str, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d2ee7e0b", new Object[]{this, str, new Integer(i2)});
                } else if (i2 != 200) {
                    h.b("TrtcAccsHandler", "Accs bindUser error | code: " + i2);
                } else {
                    h.a("TrtcAccsHandler", "Accs bindUser success, userId: " + str + " code: " + i2);
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onBindApp(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a1fbb8b7", new Object[]{this, new Integer(i2)});
                } else if (i2 != 200) {
                    h.b("TrtcAccsHandler", "Accs bindApp error | code: " + i2);
                } else {
                    h.a("TrtcAccsHandler", "Accs bindApp success, code: " + i2);
                    TrtcAccsConnectionBroadcastReceiver.f23002a = 1;
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public String getService(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("46264ad0", new Object[]{this, str});
                }
                String str2 = (String) a.c().get(str);
                if (!StringUtils.isEmpty(str2)) {
                    return str2;
                }
                TrtcLog.a("TrtcAccsHandler", "Can not get service by serviceId: " + str);
                return "";
            }

            @Override // com.taobao.accs.IAppReceiver
            public Map<String, String> getAllServices() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4e25da25", new Object[]{this}) : a.c();
            }
        };
        h = new TrtcAccsConnectionBroadcastReceiver();
        i = new HashMap<String, String>() { // from class: com.taobao.trtc.accs.TrtcAccsHandler$2
            private static final long serialVersionUID = 2527336442338823324L;

            {
                put(a.TRTC_ACCS_SERVICE, "com.taobao.trtc.accs.TrtcAccsService");
            }
        };
        j = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: com.taobao.trtc.accs.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
            public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                    return;
                }
                h.a("TrtcAccsHandler", "onNetworkStatusChanged: " + networkStatus.name());
            }
        };
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            e = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else {
            d = i2;
        }
    }

    public static void a(com.taobao.trtc.signal.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a583ee", new Object[]{aVar});
        } else {
            f = aVar;
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        String name = TrtcAccsService.class.getName();
        try {
            GlobalClientInfo.getInstance(com.taobao.trtc.impl.h.f23132a).registerService(TRTC_ACCS_SERVICE, name);
            ACCSClient.getAccsClient(e).bindService(str);
        } catch (AccsException e2) {
            h.b("TrtcAccsHandler", "Accs bindService exception: " + e2.getMessage());
        }
        h.a("TrtcAccsHandler", "Accs bindService, serviceId: artccrc2, service: " + name);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            return;
        }
        try {
            ACCSClient.getAccsClient(e).unRegisterSerivce(str);
            ACCSClient.getAccsClient(e).unbindService(str);
        } catch (AccsException e2) {
            h.b("TrtcAccsHandler", "Accs unbindService exception: " + e2.getMessage());
        }
        f23003a.set(false);
        h.a("TrtcAccsHandler", "Accs unbindService, serviceId: artccrc2");
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        b = str;
        try {
            ACCSClient.getAccsClient(e).bindUser(str, true);
        } catch (AccsException e2) {
            h.b("TrtcAccsHandler", "Accs bindUser exception: " + e2.getMessage());
        }
        h.a("TrtcAccsHandler", "Accs bindUser, userId: " + str);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            ACCSClient.getAccsClient(e).unbindUser();
        } catch (AccsException e2) {
            h.b("TrtcAccsHandler", "Accs unbindUser exception: " + e2.getMessage());
        }
        h.a("TrtcAccsHandler", "Accs unbindUser, userId: " + b);
    }

    public static void a(Context context, ArtcEngineEventProxy artcEngineEventProxy, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc9555df", new Object[]{context, artcEngineEventProxy, new Boolean(z)});
            return;
        }
        f = null;
        h.a("TrtcAccsHandler", "need sdk init accs:" + z + ", isAppBackground:" + GlobalAppRuntimeInfo.isAppBackground() + ", accsEnv:" + d);
        NetworkStatusHelper.addStatusChangeListener(j);
        c(TRTC_ACCS_SERVICE);
        ArtcGlobal.isAccsConnectd = true;
        ArtcGlobal.isAccsInit = ADefines.AccsStatus.ARTC_ACCS_INIT.ordinal();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        f = null;
        d(TRTC_ACCS_SERVICE);
        NetworkStatusHelper.removeStatusChangeListener(j);
        ArtcGlobal.isAccsInit = ADefines.AccsStatus.ARTC_ACCS_UNINIT.ordinal();
    }

    public static void a(String str, int i2, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4821c2c0", new Object[]{str, new Integer(i2), extraInfo});
        } else if (i2 != 200) {
            f23003a.set(false);
            h.b("TrtcAccsHandler", "Accs bind service error, serviceId:" + str + " code:" + i2);
        } else {
            f23003a.set(true);
            h.a("TrtcAccsHandler", "Accs bind service success, serviceId: " + str);
        }
    }

    public static void b(String str, int i2, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b4d7601", new Object[]{str, new Integer(i2), extraInfo});
        } else if (i2 != 200) {
            h.b("TrtcAccsHandler", "Accs unBind service error | serviceId:" + str + " code:" + i2);
        } else {
            h.a("TrtcAccsHandler", "Accs unbind service success | serviceId: " + str);
        }
    }

    public static void a(String str, String str2, int i2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97fe40e", new Object[]{str, str2, new Integer(i2), bArr});
            return;
        }
        if (i2 != 200) {
            h.b("TrtcAccsHandler", "Accs send error | serviceId:" + str + "dataId:" + str2 + " code:" + i2);
            if (i2 == -9) {
                TrtcLog.a("TrtcAccsHandler", "!!! accs send timeout, dataId: " + str2);
            }
        } else {
            TrtcLog.b("TrtcAccsHandler", "Accs send success, dataId: " + str2);
        }
        if (f == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("serviceId", str);
        hashMap.put("dataId", str2);
    }

    public static void a(String str, String str2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{str, str2, new Integer(i2)});
        } else if (f == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("serviceId", str);
            hashMap.put("dataId", str2);
        }
    }

    public static void a(String str, String str2, String str3, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573e4b8d", new Object[]{str, str2, str3, bArr});
        } else if (f == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("serviceId", str);
            hashMap.put("userId", str2);
            f.a(str3, bArr, hashMap);
        }
    }

    public static String a(String str, String str2, byte[] bArr) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a9fefbd", new Object[]{str, str2, bArr});
        }
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(str, str2, bArr, null);
        accsRequest.setTimeOut(6500);
        try {
            str3 = ACCSClient.getAccsClient(e).sendRequest(accsRequest);
        } catch (AccsException e2) {
            TrtcLog.a("TrtcAccsHandler", "sendData error: " + e2.getMessage());
            str3 = null;
        }
        if (str3 == null) {
            a(str2, (String) null, 0, (byte[]) null);
        } else {
            h.a("TrtcAccsHandler", "Accs send data, serviceId: " + str2 + ", dataId: " + str3 + ", len: " + bArr.length);
        }
        TrtcLog.b("TrtcAccsHandler", ">>>>>> sendData, userId: " + str + ", serviceId: " + str2 + ", dataId: " + str3);
        return str3;
    }
}
