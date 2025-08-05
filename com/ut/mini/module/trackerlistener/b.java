package com.ut.mini.module.trackerlistener;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import com.ut.mini.h;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f24136a;
    private UTTrackerListenerConfig d = null;
    private Map<String, a> b = new ConcurrentHashMap();
    private Map<String, a> c = new ConcurrentHashMap();

    static {
        kge.a(1502673307);
    }

    public static /* synthetic */ void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7b68ef", new Object[]{bVar, str});
        } else {
            bVar.b(str);
        }
    }

    private b() {
        UTClientConfigMgr.a().a(new UTClientConfigMgr.a() { // from class: com.ut.mini.module.trackerlistener.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public String getKey() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : "trackerListener";
            }

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public void onChange(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                } else {
                    b.a(b.this, str);
                }
            }
        });
    }

    public static b getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8f760641", new Object[0]);
        }
        if (f24136a == null) {
            synchronized (b.class) {
                if (f24136a == null) {
                    f24136a = new b();
                }
            }
        }
        return f24136a;
    }

    public synchronized void registerListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fff429c", new Object[]{this, aVar});
            return;
        }
        if (aVar != null) {
            String trackerListenerName = aVar.trackerListenerName();
            if (!TextUtils.isEmpty(trackerListenerName) && !this.b.containsKey(trackerListenerName)) {
                this.b.put(trackerListenerName, aVar);
                if (a(trackerListenerName)) {
                    this.c.put(trackerListenerName, aVar);
                }
            }
        }
    }

    public synchronized void unregisterListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd92ff5", new Object[]{this, aVar});
            return;
        }
        if (aVar != null) {
            String trackerListenerName = aVar.trackerListenerName();
            if (!TextUtils.isEmpty(trackerListenerName)) {
                this.b.remove(trackerListenerName);
                this.c.remove(trackerListenerName);
            }
        }
    }

    public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.pageAppear(uTTracker, obj, str, z);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void pageDisAppear(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.pageDisAppear(uTTracker, obj);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void pageDisAppearEnd(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6fd959", new Object[]{this, uTTracker, obj, map});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.pageDisAppearEnd(uTTracker, obj, map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateNextPageProperties(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b15c54c", new Object[]{this, uTTracker, map});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updateNextPageProperties(uTTracker, map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageName(UTTracker uTTracker, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updatePageName(uTTracker, obj, str);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageProperties(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d74df5d", new Object[]{this, uTTracker, obj, map});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updatePageProperties(uTTracker, obj, map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePagePropertiesEnd(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c913703", new Object[]{this, uTTracker, obj});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updatePagePropertiesEnd(uTTracker, obj);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void send(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.send(uTTracker, map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void addExposureViewToCommit(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e457d457", new Object[]{this, str, str2, str3, str4, map});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.addExposureViewToCommit(str, str2, str3, str4, map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updatePageUtparam(obj, str);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updateNextPageUtparam(str);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void sessionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.sessionTimeout();
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void viewBecomeVisible(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7619ab", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.viewBecomeVisible(str, str2, str3);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void beginScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3d8d51", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.beginScene(str, map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9272571", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updateScene(str, map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void endScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1e3f03", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.endScene(str, map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void beginEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca353937", new Object[]{this, hVar});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.beginEvent(hVar);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateEventPageName(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d04b23d", new Object[]{this, hVar});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updateEventPageName(hVar);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816a9957", new Object[]{this, hVar});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updateEvent(hVar);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void endEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e15369", new Object[]{this, hVar});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.endEvent(hVar);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void sendEvent(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5345997", new Object[]{this, map, new Integer(i)});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null && a(value.getAttentionEventIdsForSendEvent(), i)) {
                    value.sendEvent(map);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    private boolean a(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27172051", new Object[]{this, iArr, new Integer(i)})).booleanValue();
        }
        if (iArr != null) {
            if (iArr[0] == -1) {
                return true;
            }
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        UTTrackerListenerConfig uTTrackerListenerConfig = this.d;
        if (uTTrackerListenerConfig == null) {
            return true;
        }
        List<String> open = uTTrackerListenerConfig.getOpen();
        if (open != null && open.contains(str)) {
            return true;
        }
        List<String> close = this.d.getClose();
        if (close != null && close.contains(str)) {
            return false;
        }
        String other = this.d.getOther();
        return TextUtils.isEmpty(other) || !other.equals("close");
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            this.d = (UTTrackerListenerConfig) JSONObject.parseObject(str, UTTrackerListenerConfig.class);
        } catch (Exception unused) {
            this.d = null;
        }
        for (Map.Entry<String, a> entry : this.b.entrySet()) {
            String key = entry.getKey();
            if (!a(key)) {
                this.c.remove(key);
            } else if (!this.c.containsKey(key)) {
                this.c.put(key, entry.getValue());
            }
        }
    }

    public void updatePageUrl(Object obj, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db943cd", new Object[]{this, obj, uri});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    if (uri != null) {
                        value.updatePageUrl(obj, uri.toString());
                    } else {
                        value.updatePageUrl(obj, "");
                    }
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.skipPage(obj);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageStatus(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8add622d", new Object[]{this, obj});
            return;
        }
        try {
            for (Map.Entry<String, a> entry : this.c.entrySet()) {
                a value = entry.getValue();
                if (value != null) {
                    value.updatePageStatus(obj);
                }
            }
        } catch (Throwable unused) {
            apr.e("UTTrackerListenerMgr", new Object[0]);
        }
    }
}
