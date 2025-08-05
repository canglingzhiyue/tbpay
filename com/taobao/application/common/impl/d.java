package com.taobao.application.common.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d implements com.taobao.application.common.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final d f16333a = new d();
    private final Map<String, Object> b = new ConcurrentHashMap();

    private d() {
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6d063f6", new Object[0]) : f16333a;
    }

    @Override // com.taobao.application.common.d
    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        Integer num = (Integer) b(str);
        return num != null ? num.intValue() : i;
    }

    public void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
        } else {
            a(str, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.application.common.d
    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        Long l = (Long) b(str);
        return l != null ? l.longValue() : j;
    }

    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
        } else {
            a(str, Long.valueOf(j));
        }
    }

    @Override // com.taobao.application.common.d
    public float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue();
        }
        Float f2 = (Float) b(str);
        return f2 != null ? f2.floatValue() : f;
    }

    public void b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d2530ad", new Object[]{this, str, new Float(f)});
        } else {
            a(str, Float.valueOf(f));
        }
    }

    @Override // com.taobao.application.common.d
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String str3 = (String) b(str);
        return str3 != null ? str3 : str2;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            a(str, (Object) str2);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.b.remove(str);
        }
    }

    @Override // com.taobao.application.common.d
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Boolean bool = (Boolean) b(str);
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // com.taobao.application.common.d
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : this.b.containsKey(str);
    }

    public void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
        } else {
            a(str, Boolean.valueOf(z));
        }
    }

    private <T> T b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : (T) this.b.get(str);
    }

    private void a(String str, Object obj) {
        Object put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (str != null && obj != null && (put = this.b.put(str, obj)) != null && put.getClass() != obj.getClass()) {
            throw new IllegalArgumentException(String.format("new value type:%s != old value type:%s", obj.getClass(), put.getClass()));
        }
    }
}
