package com.alibaba.android.umbrella.performance;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.android.umbrella.performance.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.orq;

/* loaded from: classes2.dex */
public class UmbrellaProcessTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Handler trackHandler;
    private static HandlerThread trackHandlerThread = new HandlerThread("Umbrella-Performance-Trace-thread");
    private static final ConcurrentHashMap<String, Long> sPageList = new ConcurrentHashMap<>();

    private static synchronized void init() {
        synchronized (UmbrellaProcessTracker.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (trackHandlerThread.getState() == Thread.State.NEW) {
                trackHandlerThread.start();
                trackHandler = new Handler(trackHandlerThread.getLooper()) { // from class: com.alibaba.android.umbrella.performance.UmbrellaProcessTracker.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == 673877017) {
                            super.handleMessage((Message) objArr[0]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                            return;
                        }
                        super.handleMessage(message);
                        a aVar = (a) message.obj;
                        if (aVar.f2831a == 3) {
                            b.b(aVar);
                        } else if (aVar.f2831a == 4) {
                            b.c(aVar);
                        } else if (aVar.f2831a == 1) {
                            b.a(aVar);
                        } else if (aVar.f2831a == 2) {
                            b.e(aVar);
                        } else if (aVar.f2831a == 5) {
                            b.h(aVar);
                        } else if (aVar.f2831a == 7) {
                            b.f(aVar);
                        } else if (aVar.f2831a == 6) {
                            b.g(aVar);
                        } else if (aVar.f2831a != 8) {
                        } else {
                            b.d(aVar);
                        }
                    }
                };
            }
        }
    }

    public static void register(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d57cf4", new Object[]{str});
        } else if (com.alibaba.android.umbrella.trace.c.b(str)) {
        } else {
            if ((!com.alibaba.android.umbrella.trace.b.c() || !com.alibaba.android.umbrella.trace.b.d()) && !com.alibaba.android.umbrella.trace.b.a(str)) {
                return;
            }
            if (trackHandlerThread.getState() == Thread.State.NEW) {
                init();
            }
            recordBiz(str);
            sendProcessEvent(new a.C0107a(str).a(1).a());
        }
    }

    public static void commit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0d9088", new Object[]{str});
        } else if (com.alibaba.android.umbrella.trace.c.b(str) || !isContainBiz(str)) {
        } else {
            removeBiz(str);
            sendProcessEvent(new a.C0107a(str, 0L).a(5).a());
        }
    }

    public static void addProcess(String str, d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b9d471", new Object[]{str, dVar, new Long(j)});
        } else if (com.alibaba.android.umbrella.trace.c.b(str) || dVar == null || !isContainBiz(str)) {
        } else {
            sendProcessEvent(new a.C0107a(str).a(3).a(dVar).a(j).a());
        }
    }

    public static void addSubProcess(String str, d dVar, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c41ee5", new Object[]{str, dVar, str2, new Long(j)});
        } else if (com.alibaba.android.umbrella.trace.c.b(str) || dVar == null || TextUtils.isEmpty(str2) || !isContainBiz(str)) {
        } else {
            sendProcessEvent(new a.C0107a(str).a(4).a(dVar).a(str2).a(j).a());
        }
    }

    public static void addArgs(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4260276", new Object[]{str, map});
        } else if (com.alibaba.android.umbrella.trace.c.b(str) || map == null || map.size() <= 0 || !isContainBiz(str)) {
        } else {
            sendProcessEvent(new a.C0107a(str).a(2).a(map).a());
        }
    }

    public static void addArgs(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea77ec3", new Object[]{str, str2, str3});
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(str2, str3);
            addArgs(str, hashMap);
        }
    }

    public static void setChildBizName(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c18111f", new Object[]{str, str2});
        } else if (com.alibaba.android.umbrella.trace.c.b(str) || TextUtils.isEmpty(str2) || !isContainBiz(str)) {
        } else {
            sendProcessEvent(new a.C0107a(str).a(7).d(str2).a());
        }
    }

    public static void addAbTestInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5436afc7", new Object[]{str, str2, str3});
        } else if (com.alibaba.android.umbrella.trace.c.b(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || !isContainBiz(str)) {
        } else {
            sendProcessEvent(new a.C0107a(str).a(6).b(str2).c(str3).a());
        }
    }

    public static void addPageLoad(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb1b5bd", new Object[]{str, new Long(j)});
        } else if (com.alibaba.android.umbrella.trace.c.b(str) || !isContainBiz(str)) {
        } else {
            sendProcessEvent(new a.C0107a(str).a(3).a(d.PAGELOAD).a(j).a());
        }
    }

    public static void addOtherProcess(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97bff89", new Object[]{str, str2, new Long(j)});
        } else if (com.alibaba.android.umbrella.trace.c.b(str) || TextUtils.isEmpty(str2) || !isContainBiz(str)) {
        } else {
            sendProcessEvent(new a.C0107a(str).a(8).a(j).a(str2).a());
        }
    }

    private static void sendProcessEvent(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a20891", new Object[]{aVar});
            return;
        }
        Handler handler = trackHandler;
        if (handler == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.obj = aVar;
        trackHandler.sendMessage(obtainMessage);
    }

    private static boolean isContainBiz(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8250d23e", new Object[]{str})).booleanValue();
        }
        if (!sPageList.containsKey(str) || (l = sPageList.get(str)) == null) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() < orq.FRAME_CHECK_TIMEOUT) {
            return true;
        }
        removeBiz(str);
        return false;
    }

    private static void recordBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae41813", new Object[]{str});
        } else {
            sPageList.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    private static void removeBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f209b40", new Object[]{str});
        } else {
            sPageList.remove(str);
        }
    }
}
