package com.taobao.tbpoplayer.view;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.utils.f;
import com.alibaba.poplayer.utils.g;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_EVENT_EDITION_SWITCHED = "editionSwitched";
    public static final String PAGE_EVENT_LOGIN_STATUS_SWITCHED = "loginStatusSwitched";
    public static final String PAGE_EVENT_NAME = "PopLayer.OnPopPageEvent";
    public static final String PAGE_EVENT_SCROLLED = "scrolled";
    public static final String PAGE_EVENT_SCROLL_STATE_CHANGED = "scrollStateChanged";
    public static final String SCROLL_STATE_DRAGGING = "1";
    public static final String SCROLL_STATE_IDLE = "0";
    public static final String SCROLL_STATE_SETTLING = "2";
    public static final String SOURCE_NAME_POPLAYER = "PopLayer";
    private final Map<String, b> c = new ConcurrentHashMap();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private boolean e = true;

    /* loaded from: classes9.dex */
    public interface a {
        void a(String str, JSONObject jSONObject);

        void b(String str, JSONObject jSONObject);
    }

    /* loaded from: classes9.dex */
    public static class b {
        public a b;

        /* renamed from: a */
        public AtomicBoolean f22266a = new AtomicBoolean(false);
        public Map<String, Map<String, WeakReference<PopLayerBaseView>>> c = new ConcurrentHashMap();

        static {
            kge.a(2010407666);
        }
    }

    /* renamed from: com.taobao.tbpoplayer.view.c$c */
    /* loaded from: classes9.dex */
    public static class C0921c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final c f22267a;

        static {
            kge.a(-264198658);
            f22267a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("aa1324b6", new Object[0]) : f22267a;
        }
    }

    static {
        kge.a(1860612907);
    }

    /* renamed from: lambda$-kXEsixwAWCPuesqzKAZN5wkXwQ */
    public static /* synthetic */ void m1465lambda$kXEsixwAWCPuesqzKAZN5wkXwQ(c cVar, String str) {
        cVar.c(str);
    }

    public static /* synthetic */ void lambda$NWPwbqjr29EayszY8ObcXWxITF4(c cVar, String str, Collection collection, String str2) {
        cVar.b(str, collection, str2);
    }

    public static /* synthetic */ void lambda$OM50BPolxv8eDU_MHl45GZrapgA(c cVar, String str, a aVar) {
        cVar.b(str, aVar);
    }

    public static /* synthetic */ void lambda$fb0pB2kNucf18TTzHKl1wAKzlvY(c cVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        cVar.b(str, str2, jSONObject, jSONObject2);
    }

    public static /* synthetic */ void lambda$r7X0nzQjKpZOX77AgrVtwViIbCo(c cVar, String str) {
        cVar.d(str);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("aa1324b6", new Object[0]) : C0921c.a();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            if (!this.d.getAndSet(true)) {
                this.e = com.taobao.tbpoplayer.info.a.a().m();
            }
            return this.e;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.isEnable.error.", th);
            return false;
        }
    }

    public boolean a(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cccb4ca1", new Object[]{this, str, aVar})).booleanValue();
        }
        com.alibaba.poplayer.utils.c.a("PopPageEventCenter.registerPageEventLifecycle.sourceName=%s.", str);
        if (!b()) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.registerPageEventLifecycle.isEnable.False.sourceName=%s.", str);
            return false;
        }
        f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$c$OM50BPolxv8eDU_MHl45GZrapgA
            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.lambda$OM50BPolxv8eDU_MHl45GZrapgA(c.this, str, aVar);
            }
        });
        return true;
    }

    public /* synthetic */ void b(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61fa1de", new Object[]{this, str, aVar});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && aVar != null) {
                b bVar = this.c.get(str);
                if (bVar == null) {
                    bVar = new b();
                    this.c.put(str, bVar);
                }
                bVar.b = aVar;
                com.alibaba.poplayer.utils.c.a("PopPageEventCenter.registerPageEventLifecycle.Success.sourceName=%s.", str);
                return;
            }
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.registerPageEventLifecycle.Failed.sourceNameIsNull.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.registerPageEventLifecycle.error.", th);
        }
    }

    public boolean a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        com.alibaba.poplayer.utils.c.a("PopPageEventCenter.unRegisterPageEventLifecycle.sourceName=%s.", str);
        if (!b()) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.unRegisterPageEventLifecycle.isEnable.False.sourceName=%s.", str);
            return false;
        }
        f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$c$r7X0nzQjKpZOX77AgrVtwViIbCo
            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.lambda$r7X0nzQjKpZOX77AgrVtwViIbCo(c.this, str);
            }
        });
        return true;
    }

    public /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                com.alibaba.poplayer.utils.c.a("PopPageEventCenter.unRegisterPageEventLifecycle.Failed.sourceNameIsNull.", new Object[0]);
                return;
            }
            b bVar = this.c.get(str);
            if (bVar == null) {
                com.alibaba.poplayer.utils.c.a("PopPageEventCenter.unRegisterPageEventLifecycle.Failed.sourceName=%s.", str);
                return;
            }
            bVar.b = null;
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.unRegisterPageEventLifecycle.Success.sourceName=%s.", str);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.unRegisterPageEventLifecycle.error.", th);
        }
    }

    public void a(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04f5c7c", new Object[]{this, str, str2, jSONObject, jSONObject2});
        } else if (!b()) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.postEvent.isEnable.False.sourceName=%s.", str);
        } else {
            f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$c$fb0pB2kNucf18TTzHKl1wAKzlvY
                @Override // java.lang.Runnable
                public final void run() {
                    c.lambda$fb0pB2kNucf18TTzHKl1wAKzlvY(c.this, str, str2, jSONObject, jSONObject2);
                }
            });
        }
    }

    public /* synthetic */ void b(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a433d", new Object[]{this, str, str2, jSONObject, jSONObject2});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                b bVar = this.c.get(str);
                if (bVar == null) {
                    com.alibaba.poplayer.utils.c.a("PopPageEventCenter.sourceNameInvalid.", new Object[0]);
                    return;
                }
                Map<String, WeakReference<PopLayerBaseView>> map = bVar.c.get(str2);
                if (map == null) {
                    com.alibaba.poplayer.utils.c.a("PopPageEventCenter.eventNameInvalid.", new Object[0]);
                    return;
                } else if (map.isEmpty()) {
                    com.alibaba.poplayer.utils.c.a("PopPageEventCenter.noPopListeningThisEvent.", new Object[0]);
                    return;
                } else {
                    com.alibaba.poplayer.utils.c.a("PopPageEventCenter.postEvent.%s.%s.%s.%s", str, str2, jSONObject, jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    if (PAGE_EVENT_SCROLL_STATE_CHANGED.equals(str2)) {
                        if (jSONObject != null && !jSONObject.isEmpty() && jSONObject.containsKey("newState")) {
                            String string = jSONObject.getString("newState");
                            if ("0".equals(string)) {
                                jSONObject3.put("state", "0");
                            } else if ("1".equals(string)) {
                                jSONObject3.put("state", "1");
                            } else if ("2".equals(string)) {
                                jSONObject3.put("state", "1");
                            } else {
                                com.alibaba.poplayer.utils.c.a("PopPageEventCenter.newStateInvalid.", new Object[0]);
                                return;
                            }
                        }
                        return;
                    } else if (PAGE_EVENT_SCROLLED.equals(str2)) {
                        if (jSONObject != null && !jSONObject.isEmpty()) {
                            int intValue = jSONObject.getInteger("dx").intValue();
                            int intValue2 = jSONObject.getInteger("dy").intValue();
                            int intValue3 = jSONObject.getInteger("offsetx").intValue();
                            int intValue4 = jSONObject.getInteger("offsety").intValue();
                            Application app = PopLayer.getReference().getApp();
                            jSONObject3.put("dx", (Object) Integer.valueOf((int) g.b(app, intValue)));
                            jSONObject3.put("dy", (Object) Integer.valueOf((int) g.b(app, intValue2)));
                            jSONObject3.put("offsetx", (Object) Integer.valueOf((int) g.b(app, intValue3)));
                            jSONObject3.put("offsety", (Object) Integer.valueOf((int) g.b(app, intValue4)));
                        }
                        return;
                    } else if (jSONObject != null) {
                        jSONObject3 = jSONObject;
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("sourceName", (Object) str);
                    jSONObject4.put("event", (Object) str2);
                    jSONObject4.put("content", (Object) jSONObject3);
                    jSONObject4.put("externalParams", (Object) jSONObject2);
                    String jSONString = jSONObject4.toJSONString();
                    for (String str3 : map.keySet()) {
                        WeakReference<PopLayerBaseView> weakReference = map.get(str3);
                        if (weakReference != null) {
                            PopLayerBaseView popLayerBaseView = weakReference.get();
                            if (popLayerBaseView != null && !popLayerBaseView.isClosed()) {
                                popLayerBaseView.onReceiveEvent(PAGE_EVENT_NAME, jSONString);
                            } else {
                                map.remove(str3);
                            }
                        }
                    }
                    return;
                }
            }
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.paramInvalid.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.postEvent.error.", th);
        }
    }

    public boolean a(final String str, final Collection<String> collection, final String str2, final PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a154373b", new Object[]{this, str, collection, str2, popLayerBaseView})).booleanValue();
        }
        if (!b()) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.addPageEventListener.isEnable.False.sourceName=%s.", str);
            return false;
        }
        f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$c$sy5WkxGshuv4bCEQql-RnREt1gw
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(str, collection, popLayerBaseView, str2);
            }
        });
        return true;
    }

    public /* synthetic */ void a(String str, Collection collection, PopLayerBaseView popLayerBaseView, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c328b", new Object[]{this, str, collection, popLayerBaseView, str2});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && collection != null && !collection.isEmpty() && popLayerBaseView != null && !popLayerBaseView.isClosed()) {
                b bVar = this.c.get(str);
                if (bVar == null) {
                    bVar = new b();
                    this.c.put(str, bVar);
                }
                if (bVar.c == null) {
                    bVar.c = new ConcurrentHashMap();
                }
                for (Object obj : collection) {
                    if (obj instanceof String) {
                        Map<String, WeakReference<PopLayerBaseView>> map = bVar.c.get(obj);
                        if (map == null) {
                            map = new ConcurrentHashMap<>();
                            bVar.c.put((String) obj, map);
                        }
                        map.put(str2, new WeakReference<>(popLayerBaseView));
                    }
                }
                a(str, bVar);
                return;
            }
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.addPageEventListener.paramInvalid.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.addPageEventListener.error.", th);
        }
    }

    public boolean a(final String str, final Collection<String> collection, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d656ff71", new Object[]{this, str, collection, str2})).booleanValue();
        }
        if (!b()) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.removePageEventListener.isEnable.False.sourceName=%s.", str);
            return false;
        }
        f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$c$NWPwbqjr29EayszY8ObcXWxITF4
            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.lambda$NWPwbqjr29EayszY8ObcXWxITF4(c.this, str, collection, str2);
            }
        });
        return true;
    }

    public /* synthetic */ void b(String str, Collection collection, String str2) {
        Map<String, WeakReference<PopLayerBaseView>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e683ae", new Object[]{this, str, collection, str2});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && collection != null && !collection.isEmpty() && !StringUtils.isEmpty(str2)) {
                b bVar = this.c.get(str);
                if (bVar != null && bVar.c != null) {
                    for (Object obj : collection) {
                        if ((obj instanceof String) && (map = bVar.c.get(obj)) != null) {
                            map.remove(str2);
                        }
                    }
                }
                a(str, bVar);
                return;
            }
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.removePageEventListener.paramInvalid.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.removePageEventListener.error.", th);
        }
    }

    public boolean b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (!b()) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.removeAllPageEventListener.isEnable.False.indexId=%s.", str);
            return false;
        }
        f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$c$-kXEsixwAWCPuesqzKAZN5wkXwQ
            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.m1465lambda$kXEsixwAWCPuesqzKAZN5wkXwQ(c.this, str);
            }
        });
        return true;
    }

    public /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                com.alibaba.poplayer.utils.c.a("PopPageEventCenter.removeAllPageEventListener.paramInvalid.", new Object[0]);
                return;
            }
            for (String str2 : this.c.keySet()) {
                b bVar = this.c.get(str2);
                if (bVar != null && bVar.c != null) {
                    for (String str3 : bVar.c.keySet()) {
                        Map<String, WeakReference<PopLayerBaseView>> map = bVar.c.get(str3);
                        if (map != null) {
                            map.remove(str);
                        }
                    }
                }
                a(str2, bVar);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.removeAllPageEventListener.error.", th);
        }
    }

    private void a(String str, b bVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccbc0fc", new Object[]{this, str, bVar});
            return;
        }
        try {
            if (bVar.b == null) {
                return;
            }
            if (bVar.c != null && !bVar.c.isEmpty()) {
                for (String str2 : bVar.c.keySet()) {
                    Map<String, WeakReference<PopLayerBaseView>> map = bVar.c.get(str2);
                    if (map != null && !map.isEmpty()) {
                        if (bVar.f22266a.compareAndSet(false, true)) {
                            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.syncLifeCycle.onStart.sourceName=%s", str);
                            bVar.b.a(str, new JSONObject());
                            return;
                        }
                        z = false;
                        if (!z || !bVar.f22266a.compareAndSet(true, false)) {
                        }
                        com.alibaba.poplayer.utils.c.a("PopPageEventCenter.syncLifeCycle.onFinish.sourceName=%s", str);
                        bVar.b.b(str, new JSONObject());
                        return;
                    }
                }
            }
            z = true;
            if (!z) {
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopPageEventCenter.syncLifeCycle.error.", th);
        }
    }
}
