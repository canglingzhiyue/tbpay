package com.taobao.tao.powermsg.managers;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.ErrorMessage;
import com.taobao.tao.messagekit.core.utils.LRUQueue;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import com.taobao.tao.powermsg.common.g;
import com.taobao.tao.powermsg.model.MessageFrame;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.muz;
import tb.nam;
import tb.ols;
import tb.olt;

/* loaded from: classes8.dex */
public class c implements muz<com.taobao.tao.messagekit.core.model.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f20844a;
    private static final d b;
    private static final Map<String, StreamFullLinkMonitor> e;
    private LRUQueue<String> c = new LRUQueue<>(10000);
    private ConcurrentHashMap<String, LRUQueue<com.taobao.tao.messagekit.core.model.b<BaseMessage>>> d = new ConcurrentHashMap<>(16);

    static {
        kge.a(-1007388766);
        kge.a(1964950429);
        f20844a = 0L;
        b = new d();
        e = new LinkedHashMap<String, StreamFullLinkMonitor>() { // from class: com.taobao.tao.powermsg.managers.MsgManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, StreamFullLinkMonitor> entry) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > olt.c();
            }
        };
    }

    public static StreamFullLinkMonitor a(String str) {
        Object remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            remove = ipChange.ipc$dispatch("63a690b3", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            remove = e.remove(str);
        }
        return (StreamFullLinkMonitor) remove;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            StreamFullLinkMonitor streamFullLinkMonitor = new StreamFullLinkMonitor();
            streamFullLinkMonitor.namespace = str2;
            streamFullLinkMonitor.topic = str3;
            streamFullLinkMonitor.setPmUpTime(com.taobao.tao.messagekit.core.utils.a.a());
            e.put(str, streamFullLinkMonitor);
        }
    }

    public static StreamFullLinkMonitor b(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("a5bdbe12", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            obj = e.get(str);
        }
        return (StreamFullLinkMonitor) obj;
    }

    private void c(com.taobao.tao.messagekit.core.model.b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8a9ed", new Object[]{this, bVar});
        } else if (!(bVar.f20780a instanceof MessageFrame)) {
        } else {
            try {
                bVar.j = Long.parseLong(bVar.f20780a.header.n.get(RemoteMessageConst.SEND_TIME));
            } catch (Throwable unused) {
            }
        }
    }

    private int d(com.taobao.tao.messagekit.core.model.b<BaseMessage> bVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa496c61", new Object[]{this, bVar})).intValue();
        }
        try {
            PowerMessage a2 = com.taobao.tao.powermsg.d.a(bVar.f20780a);
            a2.sourceType = bVar.d;
            a2.fullLinkFlag = bVar.q;
            if (bVar.f20780a instanceof MessageFrame) {
                a2.copyStreamFromPackage(bVar);
            }
            if (bVar.o != null) {
                bVar.o.startDispatchTime = SystemClock.elapsedRealtime();
            }
            com.taobao.tao.powermsg.d.a("MsgManager", a2);
            HashMap<String, WeakReference<com.taobao.tao.powermsg.common.c>> a3 = a.a(a2.bizCode);
            try {
                if (a3 == null) {
                    com.taobao.tao.powermsg.common.c b2 = g.b(a2.bizCode, a2.topic);
                    if (b2 == null) {
                        MsgLog.c("MsgManager", "dispatch > not exist", Integer.valueOf(a2.bizCode), "msgid:", a2.messageId);
                        return 0;
                    }
                    b2.a(a2);
                    MsgLog.c("MsgManager", "dispatch stable >", Integer.valueOf(a2.bizCode), "msgid:", a2.messageId);
                    return 1;
                }
                i = 0;
                for (Map.Entry<String, WeakReference<com.taobao.tao.powermsg.common.c>> entry : a3.entrySet()) {
                    try {
                        String b3 = com.taobao.tao.powermsg.d.b(bVar.f20780a);
                        String key = entry.getKey();
                        if (e.a(a2.bizCode, a2.topic, b3, key)) {
                            com.taobao.tao.powermsg.common.c cVar = entry.getValue().get();
                            if (cVar != null) {
                                MsgLog.c("MsgManager", "dispatch start >", key, Integer.valueOf(a2.bizCode), "msgid:", a2.messageId);
                                cVar.a(a2);
                                MsgLog.c("MsgManager", "dispatch end >", key, Integer.valueOf(a2.bizCode), "msgid:", a2.messageId);
                                ols.a("dispatch", a2.messageId);
                                i = 1;
                            } else {
                                i = -1;
                                MsgLog.c("MsgManager", "dispatch > lost", key, Integer.valueOf(a2.bizCode), "msgid:", a2.messageId);
                                ols.a("dispatch", key, "1", a2.messageId);
                            }
                        } else {
                            if (!"ubee".equals(key)) {
                                ols.a("dispatch", key, "2", a2.messageId);
                                MsgLog.c("MsgManager", "dispatch > not bind", Integer.valueOf(a2.bizCode), a2.topic, b3, "channel:", key, "msgid:", a2.messageId);
                            }
                            if (bVar.d == 2 && e.b(bVar.f20780a.bizCode, bVar.f20780a.header.f31524a, b3, key) <= 0) {
                                com.taobao.tao.powermsg.d.a().getPullManager().a(bVar.f20780a.bizCode, bVar.f20780a.header.f31524a, b3, 1, 1);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        MsgLog.c("MsgManager", e, "dispatch exception");
                        return i;
                    }
                }
                return i;
            } catch (Exception e3) {
                e = e3;
                i = 1;
            }
        } catch (Exception e4) {
            e = e4;
            i = 0;
        }
    }

    private int e(com.taobao.tao.messagekit.core.model.b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44ea2ee2", new Object[]{this, bVar})).intValue();
        }
        if (bVar.o != null) {
            bVar.o.startDispatchTime = SystemClock.elapsedRealtime();
        }
        int i = -1;
        HashMap<String, WeakReference<com.taobao.tao.powermsg.common.c>> a2 = a.a(bVar.f20780a.bizCode);
        if (a2 != null) {
            for (Map.Entry<String, WeakReference<com.taobao.tao.powermsg.common.c>> entry : a2.entrySet()) {
                com.taobao.tao.powermsg.common.c cVar = entry.getValue().get();
                if (cVar != null) {
                    if (bVar.f20780a.type == -100) {
                        ErrorMessage errorMessage = (ErrorMessage) bVar.f20780a;
                        cVar.a(errorMessage.header.c, errorMessage.content);
                        MsgLog.b("MsgManager", "dispatch ALL errorMsg >", entry.getKey(), Integer.valueOf(errorMessage.bizCode), "code:", Integer.valueOf(errorMessage.header.c));
                    } else {
                        PowerMessage a3 = com.taobao.tao.powermsg.d.a(bVar.f20780a);
                        MsgLog.c("MsgManager", "dispatchALL start", Integer.valueOf(a3.bizCode), entry.getKey(), "msgid:", a3.messageId);
                        cVar.a(a3);
                        MsgLog.c("MsgManager", "dispatchALL end", Integer.valueOf(a3.bizCode), entry.getKey(), "msgid:", a3.messageId);
                    }
                    i = 1;
                } else {
                    MsgLog.c("MsgManager", "dispatchALL > lost", Integer.valueOf(bVar.f20780a.bizCode), entry.getKey(), "msgid:", bVar.f20780a.header.f);
                }
            }
        } else {
            MsgLog.c("MsgManager", "dispatch errorMsg > not exist", Integer.valueOf(bVar.f20780a.bizCode), "msgid:", bVar.f20780a.header.f, "code:", Integer.valueOf(bVar.f20780a.header.c));
        }
        return i;
    }

    public List<com.taobao.tao.messagekit.core.model.b<BaseMessage>> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        ConcurrentHashMap<String, LRUQueue<com.taobao.tao.messagekit.core.model.b<BaseMessage>>> concurrentHashMap = this.d;
        LRUQueue<com.taobao.tao.messagekit.core.model.b<BaseMessage>> lRUQueue = concurrentHashMap.get(str + str2);
        if (lRUQueue == null) {
            return null;
        }
        lRUQueue.drainTo(new ArrayList(10000));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0143 A[Catch: Throwable -> 0x0210, TryCatch #0 {Throwable -> 0x0210, blocks: (B:29:0x0107, B:31:0x0119, B:34:0x0123, B:36:0x013f, B:38:0x0143, B:42:0x014a, B:45:0x0167, B:50:0x01d8, B:52:0x01e6, B:53:0x01fc, B:48:0x017b, B:49:0x01a0, B:35:0x013b), top: B:58:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167 A[Catch: Throwable -> 0x0210, TRY_ENTER, TryCatch #0 {Throwable -> 0x0210, blocks: (B:29:0x0107, B:31:0x0119, B:34:0x0123, B:36:0x013f, B:38:0x0143, B:42:0x014a, B:45:0x0167, B:50:0x01d8, B:52:0x01e6, B:53:0x01fc, B:48:0x017b, B:49:0x01a0, B:35:0x013b), top: B:58:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6 A[Catch: Throwable -> 0x0210, TryCatch #0 {Throwable -> 0x0210, blocks: (B:29:0x0107, B:31:0x0119, B:34:0x0123, B:36:0x013f, B:38:0x0143, B:42:0x014a, B:45:0x0167, B:50:0x01d8, B:52:0x01e6, B:53:0x01fc, B:48:0x017b, B:49:0x01a0, B:35:0x013b), top: B:58:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fc A[Catch: Throwable -> 0x0210, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0210, blocks: (B:29:0x0107, B:31:0x0119, B:34:0x0123, B:36:0x013f, B:38:0x0143, B:42:0x014a, B:45:0x0167, B:50:0x01d8, B:52:0x01e6, B:53:0x01fc, B:48:0x017b, B:49:0x01a0, B:35:0x013b), top: B:58:0x0107 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.tao.messagekit.core.model.b r22) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.powermsg.managers.c.a(com.taobao.tao.messagekit.core.model.b):void");
    }

    public boolean b(com.taobao.tao.messagekit.core.model.b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7507e770", new Object[]{this, bVar})).booleanValue();
        }
        if (!this.c.add((LRUQueue<String>) bVar.f20780a.header.f)) {
            return false;
        }
        com.taobao.tao.messagekit.core.utils.d.a("MKT", "cd", 1.0d);
        bVar.f20780a.header.c = -3406;
        tao.reactivex.e.a(bVar).b(com.taobao.tao.powermsg.d.a().endStream());
        return true;
    }

    @Override // tb.muz
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        }
    }

    @Override // tb.muz
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        MsgLog.c("MsgManager", "onMsgManagerError >", th);
        th.printStackTrace();
    }

    @Override // tb.muz
    public /* synthetic */ void onNext(com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, bVar});
        } else {
            a(bVar);
        }
    }

    @Override // tb.muz
    public void onSubscribe(nam namVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab33248", new Object[]{this, namVar});
        } else {
            namVar.a(Long.MAX_VALUE);
        }
    }
}
