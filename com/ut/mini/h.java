package com.ut.mini;

import android.os.SystemClock;
import com.alibaba.analytics.core.model.LogField;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import tb.apr;
import tb.aqc;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_UTEVENT = "_UtEvent";

    /* renamed from: a  reason: collision with root package name */
    private String f24116a;
    private WeakReference<Object> b;
    private String c;
    private String d;
    private String f;
    private String g;
    private String h;
    private List<String> p;
    private List<ScheduledFuture> q;
    private int e = 0;
    private long i = 0;
    private long j = 0;
    private long k = 0;
    private Map<String, String> l = new HashMap(16);
    private boolean m = false;
    private boolean n = true;
    private boolean o = true;
    private int r = 0;
    private int s = 0;
    private boolean t = true;

    static {
        kge.a(273258085);
    }

    public h(String str) {
        this.f24116a = str;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.f24116a;
    }

    public void setContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd381fd0", new Object[]{this, obj});
        } else if (obj == null) {
            this.b = null;
        } else {
            this.b = new WeakReference<>(obj);
        }
    }

    public Object getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e519b5b2", new Object[]{this});
        }
        WeakReference<Object> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this}) : this.c;
    }

    public void setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this}) : this.d;
    }

    public int getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : this.e;
    }

    public void setEventId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0cdca9", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : this.f;
    }

    public void setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String getArg1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this}) : this.g;
    }

    public void setArg1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec196ee", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String getArg2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7e2b527", new Object[]{this}) : this.h;
    }

    public void setArg2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f3302f", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public String getArg3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e686fc6", new Object[]{this});
        }
        return "" + this.k;
    }

    public void setScrollPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e5693f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.t) {
            this.r = i;
            this.s = i2;
        } else {
            int i3 = i - this.r;
            int i4 = i2 - this.s;
            setArg2(riy.BLOCK_START_STR + i3 + "," + i4 + riy.BLOCK_END_STR);
        }
        this.t = false;
    }

    public synchronized void updateProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1dcdd9", new Object[]{this, str, str2});
        } else if (aqc.e(str) || str2 == null) {
            apr.c("UTEvent", "updateProperty key", str, "value", str2);
        } else {
            this.l.put(str, str2);
        }
    }

    public synchronized void updateProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
            return;
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!(key instanceof String) || !(value instanceof String)) {
                    apr.c("UTEvent", "updateProperty key", key, "value", value);
                } else {
                    updateProperty(key, value);
                }
            }
        }
    }

    public synchronized Map<String, String> getProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("deb64b65", new Object[]{this});
        }
        return new HashMap(this.l);
    }

    public long getBeginTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c1f88db", new Object[]{this})).longValue() : this.i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.i <= 0) {
            this.i = System.currentTimeMillis();
        }
        if (this.j > 0) {
            return;
        }
        this.j = SystemClock.elapsedRealtime();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.i <= 0) {
        } else {
            if (this.k <= 0) {
                this.k = SystemClock.elapsedRealtime() - this.j;
            }
            e();
        }
    }

    private synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.p != null) {
            this.p.clear();
        }
        if (this.q != null) {
            for (ScheduledFuture scheduledFuture : this.q) {
                apr.b("UTEvent", "scheduledFuture.cancel");
                scheduledFuture.cancel(false);
            }
            this.q.clear();
        }
    }

    public void setToLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90645406", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public boolean getToLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b096b01e", new Object[]{this})).booleanValue() : this.n;
    }

    public void setToTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9739f392", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public boolean getToTrigger() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61864912", new Object[]{this})).booleanValue() : this.o;
    }

    public synchronized Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        } else if (this.e <= 0) {
            return null;
        } else {
            HashMap hashMap = new HashMap(this.l);
            hashMap.put(TAG_UTEVENT, "1");
            a(hashMap);
            b(hashMap);
            return hashMap;
        }
    }

    @Deprecated
    public synchronized Map<String, String> getLogMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("768d56a", new Object[]{this});
        } else if (this.e <= 0) {
            return null;
        } else {
            HashMap hashMap = new HashMap(this.l);
            a(hashMap);
            b(hashMap);
            return hashMap;
        }
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            map.remove(LogField.PAGE.toString());
            map.remove(LogField.EVENTID.toString());
            map.remove(LogField.ARG1.toString());
            map.remove(LogField.ARG2.toString());
            map.remove(LogField.ARG3.toString());
            map.remove(LogField.ARGS.toString());
        }
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null) {
        } else {
            if (this.e >= 0) {
                String logField = LogField.EVENTID.toString();
                map.put(logField, "" + this.e);
            }
            if (this.f != null) {
                map.put(LogField.PAGE.toString(), this.f);
            }
            if (this.g != null) {
                map.put(LogField.ARG1.toString(), this.g);
            }
            if (this.h != null) {
                map.put(LogField.ARG2.toString(), this.h);
            }
            String logField2 = LogField.RECORD_TIMESTAMP.toString();
            map.put(logField2, "" + this.i);
            String logField3 = LogField.ARG3.toString();
            map.put(logField3, "" + this.k);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.m;
    }

    @Deprecated
    public synchronized void addSceneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153f3a7", new Object[]{this, str});
            return;
        }
        if (this.p == null) {
            this.p = new ArrayList();
        }
        if (!this.p.contains(str)) {
            this.p.add(str);
        }
    }

    @Deprecated
    public synchronized boolean containScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b78680ad", new Object[]{this, str})).booleanValue();
        } else if (this.p == null) {
            return false;
        } else {
            return this.p.contains(str);
        }
    }

    @Deprecated
    public synchronized void addScheduledFuture(ScheduledFuture scheduledFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebee564d", new Object[]{this, scheduledFuture});
            return;
        }
        if (this.q == null) {
            this.q = new ArrayList();
        }
        if (!this.q.contains(scheduledFuture)) {
            this.q.add(scheduledFuture);
        }
    }

    @Deprecated
    public synchronized String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        } else if (LogField.PAGE.toString().equals(str)) {
            return this.f;
        } else if (LogField.EVENTID.toString().equals(str)) {
            return "" + this.e;
        } else if (LogField.ARG1.toString().equals(str)) {
            return this.g;
        } else if (LogField.ARG2.toString().equals(str)) {
            return this.h;
        } else if (LogField.ARG3.toString().equals(str)) {
            return "" + this.k;
        } else if (LogField.RECORD_TIMESTAMP.toString().equals(str)) {
            return "" + this.i;
        } else {
            return this.l.get(str);
        }
    }
}
