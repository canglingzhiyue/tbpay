package com.taobao.android.tbabilitykit;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import com.ut.mini.module.trackerlistener.a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes6.dex */
public final class u extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f15362a;
    private final f b;

    static {
        kge.a(265539403);
    }

    public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2123720361:
                super.updateEvent((com.ut.mini.h) objArr[0]);
                return null;
            case -1940644637:
                super.updatePageUtparam(objArr[0], (String) objArr[1]);
                return null;
            case -1921720483:
                super.updatePageProperties((UTTracker) objArr[0], objArr[1], (Map) objArr[2]);
                return null;
            case -1693072052:
                super.updateNextPageProperties((UTTracker) objArr[0], (Map) objArr[1]);
                return null;
            case -1660636611:
                super.updateEventPageName((com.ut.mini.h) objArr[0]);
                return null;
            case -1491668773:
                super.pageAppear((UTTracker) objArr[0], objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -920181391:
                super.updateScene((String) objArr[0], (Map) objArr[1]);
                return null;
            case -902481609:
                super.beginEvent((com.ut.mini.h) objArr[0]);
                return null;
            case -464006057:
                super.addExposureViewToCommit((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (Map) objArr[4]);
                return null;
            case -79852207:
                super.beginScene((String) objArr[0], (Map) objArr[1]);
                return null;
            case 210843395:
                super.updatePagePropertiesEnd((UTTracker) objArr[0], objArr[1]);
                return null;
            case 321029302:
                super.send((UTTracker) objArr[0], (Map) objArr[1]);
                return null;
            case 553274522:
                super.updatePageName((UTTracker) objArr[0], objArr[1], (String) objArr[2]);
                return null;
            case 692154911:
                super.pageDisAppear((UTTracker) objArr[0], objArr[1]);
                return null;
            case 818830612:
                super.updateNextPageUtparam((String) objArr[0]);
                return null;
            case 1282808235:
                super.viewBecomeVisible((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case 1601165657:
                super.pageDisAppearEnd((UTTracker) objArr[0], objArr[1], (Map) objArr[2]);
                return null;
            case 1613428460:
                super.sendEvent((Map) objArr[0]);
                return null;
            case 1675711337:
                super.endEvent((com.ut.mini.h) objArr[0]);
                return null;
            case 2065579779:
                super.endScene((String) objArr[0], (Map) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this}) : "ability_ut_tracker";
    }

    public u(f listener) {
        kotlin.jvm.internal.q.d(listener, "listener");
        this.b = listener;
        this.f15362a = new AtomicBoolean(true);
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
        } else {
            super.pageAppear(uTTracker, obj, str, z);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void pageDisAppear(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
            return;
        }
        super.pageDisAppear(uTTracker, obj);
        this.f15362a.set(true);
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void pageDisAppearEnd(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6fd959", new Object[]{this, uTTracker, obj, map});
        } else {
            super.pageDisAppearEnd(uTTracker, obj, map);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateNextPageProperties(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b15c54c", new Object[]{this, uTTracker, map});
        } else {
            super.updateNextPageProperties(uTTracker, map);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updatePageName(UTTracker uTTracker, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
            return;
        }
        super.updatePageName(uTTracker, obj, str);
        this.f15362a.compareAndSet(true, false);
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updatePageProperties(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d74df5d", new Object[]{this, uTTracker, obj, map});
        } else {
            super.updatePageProperties(uTTracker, obj, map);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updatePagePropertiesEnd(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c913703", new Object[]{this, uTTracker, obj});
        } else {
            super.updatePagePropertiesEnd(uTTracker, obj);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void send(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
            return;
        }
        super.send(uTTracker, map);
        this.b.a(uTTracker, map);
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void addExposureViewToCommit(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e457d457", new Object[]{this, str, str2, str3, str4, map});
        } else {
            super.addExposureViewToCommit(str, str2, str3, str4, map);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
        } else {
            super.updatePageUtparam(obj, str);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
        } else {
            super.updateNextPageUtparam(str);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void viewBecomeVisible(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7619ab", new Object[]{this, str, str2, str3});
        } else {
            super.viewBecomeVisible(str, str2, str3);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void beginScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3d8d51", new Object[]{this, str, map});
        } else {
            super.beginScene(str, map);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9272571", new Object[]{this, str, map});
        } else {
            super.updateScene(str, map);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void endScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1e3f03", new Object[]{this, str, map});
        } else {
            super.endScene(str, map);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void beginEvent(com.ut.mini.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca353937", new Object[]{this, hVar});
        } else {
            super.beginEvent(hVar);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateEventPageName(com.ut.mini.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d04b23d", new Object[]{this, hVar});
        } else {
            super.updateEventPageName(hVar);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateEvent(com.ut.mini.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816a9957", new Object[]{this, hVar});
        } else {
            super.updateEvent(hVar);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void endEvent(com.ut.mini.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e15369", new Object[]{this, hVar});
        } else {
            super.endEvent(hVar);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void sendEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602af6ec", new Object[]{this, map});
        } else {
            super.sendEvent(map);
        }
    }
}
