package com.tmall.android.dai.internal.streamprocessing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import com.ut.mini.h;
import com.ut.mini.module.trackerlistener.b;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes9.dex */
public class a extends com.ut.mini.module.trackerlistener.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String LISTENER_NAME = "WalleUtTrackerListener";
    public static final String TAG = "[StreamProcessing]";

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f23702a;

    /* renamed from: com.tmall.android.dai.internal.streamprocessing.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1031a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f23703a;

        static {
            kge.a(-283760794);
            f23703a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("adfa96ba", new Object[0]) : f23703a;
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this}) : LISTENER_NAME;
    }

    static {
        kge.a(-53804588);
        f23702a = new HashSet<String>() { // from class: com.tmall.android.dai.internal.streamprocessing.WalleUtTrackerListener$1
            {
                add("2001");
                add("2101");
                add("2201");
                add("2601");
                add("1010");
                add("1023");
            }
        };
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("adfa96ba", new Object[0]) : C1031a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            b.getInstance().registerListener(a());
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void beginEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca353937", new Object[]{this, hVar});
        } else if (hVar == null) {
        } else {
            WalleStreamSource.getInstance().beginEvent(hVar);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateEventPageName(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d04b23d", new Object[]{this, hVar});
        } else if (hVar == null) {
        } else {
            WalleStreamSource.getInstance().updateEventPageName(hVar);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816a9957", new Object[]{this, hVar});
        } else if (hVar == null) {
        } else {
            WalleStreamSource.getInstance().updateEvent(hVar);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void endEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e15369", new Object[]{this, hVar});
        } else if (hVar == null) {
        } else {
            WalleStreamSource.getInstance().endEvent(hVar);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void send(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
        } else {
            sendEvent(map);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void sendEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602af6ec", new Object[]{this, map});
        } else if (!a(map)) {
        } else {
            WalleStreamSource.getInstance().sendEventMap(map);
        }
    }

    private boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue() : f23702a.contains(map.get("EVENTID"));
    }
}
