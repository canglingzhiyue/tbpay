package com.taobao.trtc.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.signal.TrtcSignalChannel;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.android.agoo.common.AgooConstants;
import tb.kge;

/* loaded from: classes9.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f23142a;
    private static final ReentrantLock b;
    private static boolean c;
    private static volatile boolean d;
    private static Map<String, Map<String, TrtcDefines.d>> g;
    private static final ReentrantLock h;
    private static ArrayList<String> j;
    private static Context k;
    private final Handler e;
    private a f;
    private final Runnable i = new Runnable() { // from class: com.taobao.trtc.impl.k.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                k.b().lock();
                if (k.c() != null && !k.c().isEmpty()) {
                    for (String str : k.c().keySet()) {
                        TrtcLog.d("TrtcServiceManager", "process cached channel notify msg for service: " + str + ", count: " + ((Map) k.c().get(str)).size());
                        if (((a) k.d().get(str)) != null) {
                            for (String str2 : ((Map) k.c().get(str)).keySet()) {
                                k.a(str, (TrtcDefines.d) ((Map) k.c().get(str)).get(str2));
                            }
                            k.c().clear();
                        }
                    }
                }
                TrtcLog.d("TrtcServiceManager", "All cached msg processed done");
            } finally {
                for (a aVar : k.d().values()) {
                    aVar.c = true;
                }
                k.b().unlock();
            }
        }
    };

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TrtcConfig f23144a;
        public AtomicBoolean b;
        public boolean c = false;
        public boolean d = false;

        static {
            kge.a(1904167492);
        }
    }

    public static /* synthetic */ void a(String str, TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ef8a48", new Object[]{str, dVar});
        } else {
            b(str, dVar);
        }
    }

    public static /* synthetic */ ReentrantLock b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReentrantLock) ipChange.ipc$dispatch("a624e0e3", new Object[0]) : h;
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : g;
    }

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[0]) : f23142a;
    }

    static {
        kge.a(1447707525);
        f23142a = new HashMap();
        b = new ReentrantLock();
        c = false;
        d = true;
        h = new ReentrantLock();
        j = null;
        k = null;
    }

    public k(Handler handler) {
        this.e = handler;
    }

    public static void a(Context context, boolean z, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb31df85", new Object[]{context, new Boolean(z), str, str2, new Integer(i), str3});
            return;
        }
        try {
            b.lock();
            if (!c) {
                TrtcLog.d("TrtcServiceManager", "checkNeedInitAccs: true");
                TrtcEngineImpl.a(context, z, str, str2, i, str3);
                c = true;
            } else {
                TrtcLog.d("TrtcServiceManager", "checkNeedInitAccs: false | update user id:" + str);
                TrtcSignalChannel.a(str);
            }
        } finally {
            b.unlock();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            b.lock();
            if (c && f23142a.isEmpty()) {
                TrtcLog.d("TrtcServiceManager", "unInitAccs | no running service");
                TrtcEngineImpl.h();
                c = false;
            } else {
                TrtcLog.d("TrtcServiceManager", "no need unInitAccs with running service");
            }
        } finally {
            b.unlock();
        }
    }

    public void a(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91fcae", new Object[]{this, runnable, new Boolean(z)});
        } else if (z) {
            this.e.postDelayed(runnable, 3000L);
        } else {
            this.e.removeCallbacks(runnable);
        }
    }

    public synchronized boolean a(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22d8a334", new Object[]{this, trtcConfig, new Boolean(z)})).booleanValue();
        } else if (trtcConfig == null || TextUtils.isEmpty(trtcConfig.getServerName())) {
            TrtcLog.a("TrtcServiceManager", "trtc config invalid");
            return false;
        } else {
            b.lock();
            if (f23142a == null) {
                f23142a = new HashMap();
            }
            if (f23142a.get(trtcConfig.getServerName()) == null) {
                a aVar = new a();
                aVar.f23144a = trtcConfig;
                aVar.b = new AtomicBoolean(false);
                if (z) {
                    aVar.d = true;
                    this.f = aVar;
                    a(this.i, true);
                }
                f23142a.put(trtcConfig.getServerName(), aVar);
                com.taobao.trtc.utils.h.a("TrtcServiceManager", "start service | name: " + trtcConfig.getServerName() + " isMainService: " + z);
            } else {
                TrtcLog.d("TrtcServiceManager", "service already started | " + trtcConfig.getServerName());
            }
            com.taobao.trtc.accs.a.e(trtcConfig.getUserId());
            b.unlock();
            a(h.f23132a, trtcConfig.isInitAccs(), trtcConfig.getUserId(), trtcConfig.getAppKey(), trtcConfig.getEnvironment(), trtcConfig.getAccsCfgTag());
            return false;
        }
    }

    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (f23142a == null || str.isEmpty()) {
        } else {
            b.lock();
            if (f23142a.get(str) != null) {
                com.taobao.trtc.utils.h.a("TrtcServiceManager", "stop service: " + str);
                f23142a.remove(str);
            }
            b.unlock();
            a();
        }
    }

    public synchronized void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (str == null || str.isEmpty()) {
        } else {
            b.lock();
            a aVar = f23142a.get(str);
            if (aVar != null) {
                aVar.b.set(z);
                com.taobao.trtc.utils.h.a("TrtcServiceManager", "set service " + str + " is running: " + z);
            }
            b.unlock();
        }
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        try {
            b.lock();
            for (a aVar : f23142a.values()) {
                if (z == aVar.d && aVar.b.get()) {
                    TrtcLog.a("TrtcServiceManager", "service : " + aVar.f23144a.getServerName() + ", is running");
                    return true;
                }
            }
            return false;
        } finally {
            b.unlock();
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
            b.lock();
            for (a aVar : f23142a.values()) {
                if (aVar.b.get() && !aVar.f23144a.getServerName().equals(str)) {
                    TrtcLog.a("TrtcServiceManager", "service : " + aVar.f23144a.getServerName() + ", is running, can not run new service: " + str);
                    return false;
                }
            }
            return true;
        } finally {
            b.unlock();
        }
    }

    public static boolean a(TrtcEngineImpl trtcEngineImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d84cee78", new Object[]{trtcEngineImpl, str})).booleanValue();
        }
        if (trtcEngineImpl != null && !TextUtils.isEmpty(str) && trtcEngineImpl.i() != null) {
            TrtcConfig trtcConfig = trtcEngineImpl.i().config;
            if (!b(str) && trtcConfig != null) {
                if (trtcConfig.getEngineObserver() != null) {
                    ITrtcObserver.e engineObserver = trtcConfig.getEngineObserver();
                    TrtcDefines.TrtcErrorEvent trtcErrorEvent = TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_INITIALIZE;
                    engineObserver.a(trtcErrorEvent, 2005, "inactive by service:" + str);
                }
                if (trtcConfig.getEventHandler() != null) {
                    com.taobao.trtc.api.b eventHandler = trtcConfig.getEventHandler();
                    TrtcDefines.TrtcErrorEvent trtcErrorEvent2 = TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_INITIALIZE;
                    eventHandler.a(trtcErrorEvent2, 2005, "inactive by service:" + str);
                }
                com.taobao.trtc.utils.h.a("TrtcServiceManager", "inactive service: " + trtcEngineImpl.i().config.getServerName() + " by " + str);
                return true;
            }
        }
        return false;
    }

    public boolean c(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (aVar = this.f) == null || !aVar.f23144a.getServerName().equals(str)) {
            z = false;
        }
        TrtcLog.d("TrtcServiceManager", "isMainService, service name: " + str + " ret: " + z);
        return z;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        try {
            b.lock();
            a aVar = f23142a.get(str);
            if (aVar != null) {
                z = aVar.b.get();
            }
            return z;
        } finally {
            b.unlock();
        }
    }

    private static void b(String str, TrtcDefines.d dVar) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dca167", new Object[]{str, dVar});
        } else if (dVar == null || (aVar = f23142a.get(str)) == null) {
        } else {
            com.taobao.trtc.utils.h.a("TrtcServiceManager", "onRemoteNotifyChannel | action: " + dVar.f23036a + " channel:" + dVar.c + " remoteUserId: " + dVar.b + " extension:" + dVar.f);
            ITrtcObserver.c channelEventObserver = aVar.f23144a.getChannelEventObserver();
            if (channelEventObserver != null) {
                channelEventObserver.a(dVar.f23036a, dVar.b, dVar.c, dVar.f);
            }
            com.taobao.trtc.api.b eventHandler = aVar.f23144a.getEventHandler();
            if (eventHandler == null) {
                return;
            }
            TrtcLog.d("TrtcServiceManager", "remote notify channel event");
            eventHandler.a(dVar.f23036a, dVar.b, dVar.c, dVar.f);
            eventHandler.a(dVar);
        }
    }

    private static boolean a(Map<String, String> map, String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33c1493c", new Object[]{map, str, str2, bArr})).booleanValue();
        }
        if (!str2.equals("deliverChannelNotify")) {
            return false;
        }
        if (g == null) {
            g = new HashMap();
        }
        if (g.get(str) == null) {
            g.put(str, new HashMap());
        }
        TrtcDefines.d dVar = new TrtcDefines.d();
        JSONObject parseObject = JSONObject.parseObject(map.get("data"));
        if (parseObject == null || parseObject.getString("channelInfo") == null || parseObject.getString("notifyType") == null) {
            TrtcLog.a("TrtcServiceManager", "no need cached message for:no data info");
            return false;
        }
        String string = parseObject.getString("notifyType");
        if (TextUtils.isEmpty(string)) {
            TrtcLog.a("TrtcServiceManager", "no need cached message for:notify type is empty");
            return false;
        }
        dVar.f23036a = string.equals(AgooConstants.MESSAGE_NOTIFICATION) ? TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_INVITE : TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_CANCELED;
        JSONObject parseObject2 = JSONObject.parseObject(parseObject.getString("channelInfo"));
        if (parseObject2 == null) {
            TrtcLog.a("TrtcServiceManager", "no need cached message for:no channel info");
            return false;
        }
        dVar.c = parseObject2.getString("channelId");
        if (TextUtils.isEmpty(dVar.c)) {
            TrtcLog.a("TrtcServiceManager", "no need cached message for:no channel id");
            return false;
        }
        JSONObject parseObject3 = JSONObject.parseObject(parseObject.getString("srcUserInfo"));
        if (parseObject3 == null) {
            TrtcLog.a("TrtcServiceManager", "maybeNeedCachedMessage var6");
            return false;
        }
        dVar.b = parseObject3.getString("userId");
        if (TextUtils.isEmpty(dVar.b)) {
            TrtcLog.a("TrtcServiceManager", "no need cached message for:no remote user id");
            return false;
        }
        dVar.f = parseObject.getString("extInfo");
        if (dVar.f == null) {
            dVar.f = "";
        }
        dVar.d = "1".equals(parseObject.getString("audioEnable"));
        dVar.e = "1".equals(parseObject.getString(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE));
        a aVar = f23142a.get(str);
        if (aVar != null && aVar.c) {
            TrtcLog.d("TrtcServiceManager", "<<<<<<< " + new String(bArr));
            b(str, dVar);
            return true;
        }
        TrtcDefines.d dVar2 = g.get(str).get(dVar.c);
        if (dVar2 != null) {
            if (dVar2.f23036a == TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_INVITE && dVar.f23036a == TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_CANCELED) {
                dVar2.f23036a = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_CANCELED;
                dVar2.b = dVar.b;
                dVar2.f = dVar.f;
                dVar2.d = dVar.d;
                dVar2.e = dVar.e;
                g.get(str).put(dVar.c, dVar2);
                TrtcLog.d("TrtcServiceManager", "Cached channel notify cancel, channel: " + dVar.c);
            } else {
                TrtcLog.d("TrtcServiceManager", "drop msg: " + str2);
            }
        } else {
            g.get(str).put(dVar.c, dVar);
            TrtcLog.d("TrtcServiceManager", "new cached msg: " + str2 + " channel : " + dVar.c + " remoteUserId:" + dVar.b + "action:" + dVar.f23036a);
        }
        return true;
    }

    private static void a(Map<String, String> map) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        String str = map.get("data");
        TrtcLog.b("TrtcServiceManager", "<<<<<< " + str);
        JSONObject parseObject = JSONObject.parseObject(str);
        String str2 = "grtn";
        if (parseObject != null && (string = parseObject.getString("sdkType")) != null && string.equals(str2)) {
            d = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("get sdk type: ");
        if (!d) {
            str2 = "artc";
        }
        sb.append(str2);
        com.taobao.trtc.utils.h.a("TrtcServiceManager", sb.toString());
        TrtcSignalChannel.a(d);
    }

    public static void a(Context context, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9bb14a", new Object[]{context, arrayList});
        } else if (arrayList.isEmpty()) {
        } else {
            k = context;
            j = arrayList;
        }
    }

    public static boolean a(byte[] bArr, String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba3ac33d", new Object[]{bArr, str})).booleanValue();
        }
        if (bArr != null && bArr.length > 0 && (map = (Map) JSON.parseObject(new String(bArr), new TypeReference<Map<String, String>>() { // from class: com.taobao.trtc.impl.k.2
        }, new Feature[0])) != null && !map.isEmpty() && map.get("api") != null) {
            String str2 = (String) map.get("api");
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            if (k != null && !j.isEmpty() && j.contains(str2)) {
                TrtcLog.d("TrtcServiceManager", "accsObserveList: " + j + " ,api: " + str2);
                try {
                    String str3 = new String(bArr);
                    Intent intent = new Intent("com.taobao.action.artc_accs_receive");
                    intent.putExtra("content", str3);
                    LocalBroadcastManager.getInstance(k).sendBroadcast(intent);
                    TrtcLog.d("TrtcServiceManager", "accsObserveList LocalBroadcastManager.");
                } catch (Exception e) {
                    TrtcLog.a("TrtcServiceManager", "accsObserveList LocalBroadcastManager Exception: " + e);
                }
            }
            String str4 = (String) map.get(FluidException.SERVICE_NAME);
            if (str4 == null || str4.isEmpty()) {
                TrtcLog.a("TrtcServiceManager", "Receive signal data, can not process for:no service name");
            } else if (str2.equals("getSdkConfigRsp")) {
                a(map);
                return true;
            } else if (d(str4) || !d) {
                return false;
            } else {
                if (a(false)) {
                    com.taobao.trtc.utils.h.a("TrtcServiceManager", "Drop msg: " + str2 + " for have other running service");
                    return true;
                }
                try {
                    h.lock();
                    return a(map, str4, str2, bArr);
                } finally {
                    h.unlock();
                }
            }
        }
        return false;
    }
}
