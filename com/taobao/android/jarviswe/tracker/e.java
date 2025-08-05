package com.taobao.android.jarviswe.tracker;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.tracker.b;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.gsi;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements JarvisTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private String c;
    private String d;
    private long e;
    private long f;
    private long h;
    private String i;
    private final WeakReference<Object> l;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12984a = false;
    private final Map<String, String> g = new HashMap();
    private final Map<String, Long> j = new HashMap();
    private boolean k = false;

    static {
        kge.a(1464533395);
        kge.a(-120533805);
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onClick(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add73f8b", new Object[]{this, str, map});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onItemAppear(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47785263", new Object[]{this, str, str2, map});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onItemDisappear(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fefb4c", new Object[]{this, str, str2});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPopupAppear(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3160412", new Object[]{this, str, map});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPopupDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9827119d", new Object[]{this});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void updateAreaArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7104a4b", new Object[]{this, map});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void updatePopupArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c058333e", new Object[]{this, map});
        }
    }

    public e(Object obj) {
        this.l = new WeakReference<>(obj);
        try {
            this.b = UUID.randomUUID().toString();
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPageCreate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee4876a", new Object[]{this, str, map});
            return;
        }
        try {
            this.c = str;
            if (map == null) {
                return;
            }
            this.g.putAll(map);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
            return;
        }
        try {
            a(b.EVENT_DESTORY);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        try {
            this.f12984a = true;
            long currentTimeMillis = System.currentTimeMillis();
            this.e = currentTimeMillis;
            if (this.i == null) {
                return;
            }
            this.h = currentTimeMillis;
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPageDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6518a43c", new Object[]{this});
            return;
        }
        try {
            this.f12984a = false;
            long currentTimeMillis = System.currentTimeMillis();
            this.f += currentTimeMillis - this.e;
            if (this.i != null) {
                long j = currentTimeMillis - this.h;
                Long l = this.j.get(this.i);
                if (l != null) {
                    this.j.put(this.i, Long.valueOf(l.longValue() + j));
                } else {
                    this.j.put(this.i, Long.valueOf(j));
                }
            }
            if (!this.k) {
                return;
            }
            a(b.EVENT_UPDATE_STAY_TIME);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void updatePageArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc89609", new Object[]{this, map});
            return;
        }
        try {
            Object obj = this.l.get();
            Map<String, String> map2 = null;
            if (obj instanceof Activity) {
                try {
                    map2 = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties((Activity) obj);
                } catch (Exception unused) {
                }
                this.d = a(map2);
                if (this.d == null) {
                    try {
                        this.d = a(UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj));
                    } catch (Exception unused2) {
                    }
                }
            }
            if (map != null) {
                this.g.putAll(map);
            }
            if (this.k) {
                return;
            }
            this.k = true;
            a(b.EVENT_ENTER);
        } catch (Exception unused3) {
        }
    }

    private String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value != null) {
                String a2 = gsi.a(value);
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(a2);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onAreaAppear(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e575b3", new Object[]{this, str, map});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.h;
            if (this.i != null) {
                Long l = this.j.get(this.i);
                if (l != null) {
                    this.j.put(this.i, Long.valueOf(l.longValue() + j));
                } else {
                    this.j.put(this.i, Long.valueOf(j));
                }
            }
            this.i = str;
            this.h = currentTimeMillis;
        } catch (Exception unused) {
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (str.equals(b.EVENT_DESTORY) && this.c == null) {
                return;
            }
            b(str).b();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private b.a b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("5796e45", new Object[]{this, str}) : b.a(str).c(this.b).a(this.c).b(this.d).a(this.f).a(this.j).a("pageArgs", new HashMap(this.g));
    }
}
