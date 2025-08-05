package com.tmall.android.dai.trigger;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.rlj;
import tb.rll;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String TAG = "TriggerEngine";

    /* renamed from: a */
    private static final c f23728a;
    private final ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();
    private final HashMap<String, HashMap<String, List<String>>> c = new HashMap<>();

    /* renamed from: lambda$SeaV6hfts93aMwN3KUDnnU-j494 */
    public static /* synthetic */ void m1600lambda$SeaV6hfts93aMwN3KUDnnUj494(c cVar, UserTrackDO userTrackDO, ArrayList arrayList, com.tmall.android.dai.trigger.protocol.a aVar) {
        cVar.a(userTrackDO, arrayList, aVar);
    }

    /* renamed from: lambda$Y21Btl-BHA2NE1Yn_2v7pD7SSG4 */
    public static /* synthetic */ void m1601lambda$Y21BtlBHA2NE1Yn_2v7pD7SSG4(Map map, ArrayList arrayList, com.tmall.android.dai.trigger.protocol.a aVar) {
        a(map, arrayList, aVar);
    }

    static {
        kge.a(-1539588693);
        f23728a = new c();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e0866985", new Object[0]) : f23728a;
    }

    private c() {
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final HashMap<String, List<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>>> f23729a = new HashMap<>();

        /* renamed from: com.tmall.android.dai.trigger.c$a$a */
        /* loaded from: classes9.dex */
        public interface InterfaceC1032a {
            void invoke(com.tmall.android.dai.trigger.protocol.a<?, ?, ?> aVar);
        }

        static {
            kge.a(1456115029);
        }

        private void a(String str, com.tmall.android.dai.trigger.protocol.a<?, ?, ?> aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec8db868", new Object[]{this, str, aVar});
                return;
            }
            List<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>> list = this.f23729a.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f23729a.put(str, list);
            }
            list.add(aVar);
        }

        public void a(com.tmall.android.dai.trigger.protocol.a<?, ?, ?> aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f079351e", new Object[]{this, aVar});
                return;
            }
            ArrayList<String> a2 = aVar.b.a();
            if (a2 != null && a2.size() > 0) {
                Iterator<String> it = a2.iterator();
                while (it.hasNext()) {
                    a(it.next(), aVar);
                }
                return;
            }
            a("__other__", aVar);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            for (Map.Entry<String, List<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>>> entry : this.f23729a.entrySet()) {
                Iterator<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next().a(), str)) {
                        it.remove();
                    }
                }
            }
        }

        private void a(List<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>> list, InterfaceC1032a interfaceC1032a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2360fa", new Object[]{this, list, interfaceC1032a});
            } else if (list != null) {
                for (com.tmall.android.dai.trigger.protocol.a<?, ?, ?> aVar : list) {
                    interfaceC1032a.invoke(aVar);
                }
            }
        }

        public void a(UserTrackDO userTrackDO, InterfaceC1032a interfaceC1032a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f608b61e", new Object[]{this, userTrackDO, interfaceC1032a});
                return;
            }
            String valueOf = String.valueOf(userTrackDO.getEventId());
            a(this.f23729a.get(valueOf), interfaceC1032a);
            String pageName = userTrackDO.getPageName();
            if (pageName != null) {
                HashMap<String, List<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>>> hashMap = this.f23729a;
                a(hashMap.get(valueOf + "#" + pageName), interfaceC1032a);
            }
            a(this.f23729a.get("__other__"), interfaceC1032a);
        }

        public void a(Map<String, String> map, InterfaceC1032a interfaceC1032a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf9762b6", new Object[]{this, map, interfaceC1032a});
                return;
            }
            String valueOf = String.valueOf(map.get("event_category"));
            a(this.f23729a.get(valueOf), interfaceC1032a);
            String str = map.get("page_name");
            if (str != null) {
                HashMap<String, List<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>>> hashMap = this.f23729a;
                a(hashMap.get(valueOf + "#" + str), interfaceC1032a);
            }
            a(this.f23729a.get("__other__"), interfaceC1032a);
        }
    }

    public void a(String str, com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45ed7ec", new Object[]{this, str, aVar});
            return;
        }
        synchronized (this) {
            b(str, aVar.b());
            for (com.tmall.android.dai.model.c cVar : aVar.e()) {
                com.tmall.android.dai.trigger.protocol.a<?, ?, ?> a2 = com.tmall.android.dai.trigger.protocol.b.a(cVar.a(), aVar.b(), cVar.c());
                if (a2 != null) {
                    a(str, a2);
                }
            }
        }
    }

    public ArrayList<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>> a(final UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a048950f", new Object[]{this, userTrackDO});
        }
        final ArrayList<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>> arrayList = new ArrayList<>();
        synchronized (this) {
            for (a aVar : this.b.values()) {
                aVar.a(userTrackDO, new a.InterfaceC1032a() { // from class: com.tmall.android.dai.trigger.-$$Lambda$c$SeaV6hfts93aMwN3KUDnnU-j494
                    @Override // com.tmall.android.dai.trigger.c.a.InterfaceC1032a
                    public final void invoke(com.tmall.android.dai.trigger.protocol.a aVar2) {
                        c.m1600lambda$SeaV6hfts93aMwN3KUDnnUj494(c.this, userTrackDO, arrayList, aVar2);
                    }
                });
            }
        }
        return arrayList;
    }

    public /* synthetic */ void a(UserTrackDO userTrackDO, ArrayList arrayList, com.tmall.android.dai.trigger.protocol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3f2f8b", new Object[]{this, userTrackDO, arrayList, aVar});
        } else if (aVar instanceof com.tmall.android.dai.trigger.protocol.c) {
            if (((com.tmall.android.dai.trigger.protocol.c) aVar).a((com.tmall.android.dai.trigger.protocol.c) userTrackDO) != EventProcessResult.RESULT_COMPLETE) {
                return;
            }
            arrayList.add(aVar);
        } else if (!(aVar instanceof rlj) || ((rlj) aVar).a(b(userTrackDO)) != EventProcessResult.RESULT_COMPLETE) {
        } else {
            arrayList.add(aVar);
        }
    }

    public ArrayList<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>> a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c1c3c577", new Object[]{this, map});
        }
        final ArrayList<com.tmall.android.dai.trigger.protocol.a<?, ?, ?>> arrayList = new ArrayList<>();
        synchronized (this) {
            for (a aVar : this.b.values()) {
                aVar.a(map, new a.InterfaceC1032a() { // from class: com.tmall.android.dai.trigger.-$$Lambda$c$Y21Btl-BHA2NE1Yn_2v7pD7SSG4
                    @Override // com.tmall.android.dai.trigger.c.a.InterfaceC1032a
                    public final void invoke(com.tmall.android.dai.trigger.protocol.a aVar2) {
                        c.m1601lambda$Y21BtlBHA2NE1Yn_2v7pD7SSG4(map, arrayList, aVar2);
                    }
                });
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void a(Map map, ArrayList arrayList, com.tmall.android.dai.trigger.protocol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb0ce23", new Object[]{map, arrayList, aVar});
        } else if (!(aVar instanceof rll) || ((rll) aVar).a((Map<String, String>) map) != EventProcessResult.RESULT_COMPLETE) {
        } else {
            arrayList.add(aVar);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        synchronized (this) {
            b(str, str2);
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        a aVar = this.b.get(str);
        if (aVar == null) {
            return;
        }
        aVar.a(str2);
    }

    private Map<String, String> b(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2eb1f62b", new Object[]{this, userTrackDO});
        }
        if (userTrackDO.getEventId() == -19999) {
            return com.tmall.android.dai.trigger.a.a(userTrackDO);
        }
        return com.tmall.android.dai.trigger.a.c(userTrackDO);
    }

    private void a(String str, com.tmall.android.dai.trigger.protocol.a<?, ?, ?> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8db868", new Object[]{this, str, aVar});
            return;
        }
        a aVar2 = this.b.get(str);
        if (aVar2 == null) {
            aVar2 = new a();
            this.b.put(str, aVar2);
        }
        aVar2.a(aVar);
    }
}
