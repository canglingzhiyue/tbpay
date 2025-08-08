package com.ut.mini.behavior;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.trigger.Scene;
import com.ut.mini.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import tb.apr;
import tb.aqc;
import tb.aqe;
import tb.aqh;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private aqh f24083a;
    private Map<String, List<d>> b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static c f24087a;

        static {
            kge.a(1857400325);
            f24087a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e01a4921", new Object[0]) : f24087a;
        }
    }

    static {
        kge.a(-748508878);
    }

    public static /* synthetic */ void a(c cVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e54a34", new Object[]{cVar, hVar});
        } else {
            cVar.b(hVar);
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7b9d25", new Object[]{cVar, str});
        } else {
            cVar.a(str);
        }
    }

    public static /* synthetic */ void a(c cVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88489e0a", new Object[]{cVar, map});
        } else {
            cVar.b(map);
        }
    }

    private c() {
        try {
            this.f24083a = new aqh();
        } catch (Exception unused) {
        }
        this.b = new ConcurrentHashMap();
    }

    public static c getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3efdbd37", new Object[0]) : a.a();
    }

    public synchronized void registerTrigger(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8282d078", new Object[]{this, str, dVar});
            return;
        }
        if (!StringUtils.isEmpty(str) && dVar != null) {
            List<d> list = this.b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.b.put(str, list);
            }
            if (!list.contains(dVar)) {
                list.add(dVar);
            }
        }
    }

    public synchronized void unRegisterTrigger(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373a285f", new Object[]{this, str, dVar});
            return;
        }
        if (!StringUtils.isEmpty(str) && dVar != null) {
            List<d> list = this.b.get(str);
            if (list == null) {
                return;
            }
            list.remove(dVar);
        }
    }

    public void a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (this.f24083a == null || map == null) {
        } else {
            this.f24083a.a(new Runnable() { // from class: com.ut.mini.behavior.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        c.a(c.this, map);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public void a(final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdebe47", new Object[]{this, hVar});
        } else if (this.f24083a == null || hVar == null) {
        } else {
            this.f24083a.a(new Runnable() { // from class: com.ut.mini.behavior.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        c.a(c.this, hVar);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        List<Scene> sceneList = com.ut.mini.behavior.trigger.a.getInstance().getSceneList();
        if (sceneList == null) {
            return;
        }
        for (Scene scene : sceneList) {
            if (com.ut.mini.behavior.trigger.a.getInstance().triggerEvent(scene, map)) {
                a(scene.name);
            }
        }
    }

    private void b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738094a6", new Object[]{this, hVar});
            return;
        }
        List<Scene> sceneList = com.ut.mini.behavior.trigger.a.getInstance().getSceneList();
        if (sceneList == null) {
            return;
        }
        for (Scene scene : sceneList) {
            if (hVar.containScene(scene.name)) {
                apr.b("UTTrigger", "containScene", scene.name);
            } else if (com.ut.mini.behavior.trigger.a.getInstance().triggerEvent(scene, hVar)) {
                a(scene.name, scene.condition, hVar);
            }
        }
    }

    private synchronized void a(final String str, String str2, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b2d2b3", new Object[]{this, str, str2, hVar});
        } else if (hVar == null) {
        } else {
            hVar.addSceneName(str);
            if (aqc.e(str2)) {
                a(str);
                return;
            }
            if (str2.startsWith("delay")) {
                try {
                    int parseInt = Integer.parseInt(str2.substring(6));
                    ScheduledFuture a2 = aqe.a().a(null, new Runnable() { // from class: com.ut.mini.behavior.c.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.a(c.this, str);
                            }
                        }
                    }, parseInt);
                    apr.b("UTTrigger", "triggerObserverDelay", str, "delayTime", Integer.valueOf(parseInt));
                    hVar.addScheduledFuture(a2);
                } catch (Exception unused) {
                }
            }
        }
    }

    private synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            List<d> list = this.b.get(str);
            apr.b("UTTrigger", "triggerObserver", str);
            if (list != null) {
                for (d dVar : list) {
                    dVar.onTrigger(str);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
