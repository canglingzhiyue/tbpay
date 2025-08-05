package com.ut.mini;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.apr;
import tb.aqc;
import tb.kge;

/* loaded from: classes9.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, h> f24117a;
    private int b;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static i f24119a;

        static {
            kge.a(-951390234);
            f24119a = new i();
        }

        public static /* synthetic */ i a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("2e625766", new Object[0]) : f24119a;
        }
    }

    static {
        kge.a(-883831533);
    }

    private i() {
        this.b = 0;
        this.f24117a = new ConcurrentHashMap();
    }

    public static i getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("1c45d290", new Object[0]) : a.a();
    }

    public String getKeyForObject(Object obj) {
        String simpleName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf5ac53e", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            simpleName = (String) obj;
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        return simpleName + hashCode;
    }

    public synchronized h getEventByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("bbd403b4", new Object[]{this, str});
        }
        h hVar = this.f24117a.get(str);
        if (hVar != null) {
            return hVar;
        }
        return new h(str);
    }

    public synchronized void beginEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca353937", new Object[]{this, hVar});
        } else if (hVar == null) {
        } else {
            String key = hVar.getKey();
            if (aqc.e(key)) {
                return;
            }
            if (this.f24117a.containsKey(key)) {
                if (!hVar.d()) {
                    return;
                }
            } else {
                this.b++;
            }
            hVar.a();
            this.f24117a.put(key, hVar);
            com.ut.mini.module.trackerlistener.b.getInstance().beginEvent(hVar);
            if (this.b > 500) {
                long currentTimeMillis = System.currentTimeMillis();
                a();
                apr.c("UTEventTracker", "removeOldEvent cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }

    public synchronized void sendAndBeginEvent(h hVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8fdc3d", new Object[]{this, hVar, map});
            return;
        }
        if (map != null) {
            map.put(h.TAG_UTEVENT, "1");
            UTAnalytics.getInstance().getDefaultTracker().send(map);
        }
        if (hVar != null) {
            hVar.setToLog(false);
            hVar.setToTrigger(false);
            beginEvent(hVar);
        }
    }

    public synchronized void updateEventPageName(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d04b23d", new Object[]{this, hVar});
            return;
        }
        if (hVar != null && this.f24117a.containsKey(hVar.getKey())) {
            com.ut.mini.module.trackerlistener.b.getInstance().updateEventPageName(hVar);
        }
    }

    public synchronized void updateEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816a9957", new Object[]{this, hVar});
            return;
        }
        if (hVar != null && this.f24117a.containsKey(hVar.getKey())) {
            com.ut.mini.module.trackerlistener.b.getInstance().updateEvent(hVar);
        }
    }

    public synchronized void endEventByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3097511a", new Object[]{this, str});
            return;
        }
        if (this.f24117a.containsKey(str)) {
            endEvent(getEventByKey(str));
        }
    }

    public synchronized void endEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e15369", new Object[]{this, hVar});
            return;
        }
        if (hVar != null && this.f24117a.containsKey(hVar.getKey())) {
            this.f24117a.remove(hVar.getKey());
            this.b--;
            hVar.b();
            com.ut.mini.module.trackerlistener.b.getInstance().endEvent(hVar);
            if (hVar.getEventId() >= 0 && hVar.getToLog()) {
                UTAnalytics.getInstance().getDefaultTracker().send(hVar.c());
            }
        }
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(this.f24117a.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, h>>() { // from class: com.ut.mini.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(Map.Entry<String, h> entry, Map.Entry<String, h> entry2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, entry, entry2})).intValue() : a(entry, entry2);
            }

            public int a(Map.Entry<String, h> entry, Map.Entry<String, h> entry2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("f17356bb", new Object[]{this, entry, entry2})).intValue();
                }
                h value = entry.getValue();
                h value2 = entry2.getValue();
                if (value == null || value2 == null || value.getBeginTime() > value2.getBeginTime()) {
                    return 1;
                }
                return value.getBeginTime() < value2.getBeginTime() ? -1 : 0;
            }
        });
        for (Map.Entry entry : arrayList) {
            this.f24117a.remove((String) entry.getKey());
            this.b--;
            i++;
            if (i >= 50) {
                return;
            }
        }
    }
}
