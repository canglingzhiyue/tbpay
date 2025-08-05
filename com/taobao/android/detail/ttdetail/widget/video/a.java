package com.taobao.android.detail.ttdetail.widget.video;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.avplayer.bk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f11075a;
    private Map<Integer, Map<String, C0436a>> b = new ConcurrentHashMap(3);
    private Map<Integer, Boolean> c = new ConcurrentHashMap(3);

    static {
        kge.a(-167338182);
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("22eb5e4", new Object[0]);
            }
            if (f11075a == null) {
                f11075a = new a();
            }
            return f11075a;
        }
    }

    public synchronized void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.b.put(Integer.valueOf(obj.hashCode()), new ConcurrentHashMap(3));
        }
    }

    public synchronized void a(Object obj, String str, C0436a c0436a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb518061", new Object[]{this, obj, str, c0436a});
        } else if (str == null) {
        } else {
            Map<String, C0436a> map = this.b.get(Integer.valueOf(obj.hashCode()));
            if (map == null) {
                return;
            }
            map.put(str, c0436a);
        }
    }

    public synchronized C0436a a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0436a) ipChange.ipc$dispatch("10cfe22d", new Object[]{this, obj, str});
        } else if (str == null) {
            return null;
        } else {
            Map<String, C0436a> map = this.b.get(Integer.valueOf(obj.hashCode()));
            if (map == null) {
                return null;
            }
            return map.get(str);
        }
    }

    public void a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
        } else {
            this.c.put(Integer.valueOf(obj.hashCode()), Boolean.valueOf(z));
        }
    }

    public boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
        }
        Boolean bool = this.c.get(Integer.valueOf(obj.hashCode()));
        if (!(bool instanceof Boolean)) {
            return false;
        }
        return bool.booleanValue();
    }

    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            return;
        }
        Map<String, C0436a> map = this.b.get(Integer.valueOf(obj.hashCode()));
        if (map == null) {
            return;
        }
        for (C0436a c0436a : map.values()) {
            int videoState = c0436a.a().getVideoState();
            c0436a.a(videoState);
            if (videoState == 1) {
                c0436a.a().pauseVideo();
            }
        }
    }

    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
            return;
        }
        Map<String, C0436a> map = this.b.get(Integer.valueOf(obj.hashCode()));
        if (map == null) {
            return;
        }
        for (C0436a c0436a : map.values()) {
            if (c0436a.c() == 1) {
                c0436a.a().playVideo();
            }
        }
    }

    public synchronized void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
            return;
        }
        int hashCode = obj.hashCode();
        Map<String, C0436a> map = this.b.get(Integer.valueOf(hashCode));
        if (map == null) {
            return;
        }
        for (C0436a c0436a : map.values()) {
            c0436a.a().destroy();
        }
        this.b.remove(Integer.valueOf(hashCode));
    }

    /* renamed from: com.taobao.android.detail.ttdetail.widget.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0436a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private TTImageUrlView f11076a;
        private bk b;
        private int c;

        static {
            kge.a(-1424290239);
        }

        public C0436a(bk bkVar, TTImageUrlView tTImageUrlView) {
            this.f11076a = tTImageUrlView;
            this.b = bkVar;
        }

        public bk a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bk) ipChange.ipc$dispatch("88d7d26e", new Object[]{this}) : this.b;
        }

        public TTImageUrlView b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TTImageUrlView) ipChange.ipc$dispatch("303a18eb", new Object[]{this}) : this.f11076a;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
        }
    }
}
