package com.taobao.android.dinamicx.widget;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fqp;
import tb.kge;

/* loaded from: classes5.dex */
public class bg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final a f;

    /* renamed from: a  reason: collision with root package name */
    public byte f12080a;
    public Map<String, fqp> b = new ConcurrentHashMap();
    public Map<String, Object> c = new ConcurrentHashMap();
    public Map<String, Object> d = new ConcurrentHashMap();
    public byte e;

    /* loaded from: classes5.dex */
    public static class a {
        static {
            kge.a(-327311637);
        }
    }

    static {
        kge.a(-1060309677);
        f = new a();
    }

    public void a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b)});
        } else {
            this.f12080a = b;
        }
    }

    public void a(String str, fqp fqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f9fd7d", new Object[]{this, str, fqpVar});
        } else {
            this.b.put(str, fqpVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.clear();
        }
    }

    public Object a(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ffdadd6f", new Object[]{this, str, dXRuntimeContext});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!this.c.containsKey(str)) {
            fqp fqpVar = this.b.get(str);
            if (fqpVar == null) {
                return null;
            }
            Object a2 = fqpVar.a(null, dXRuntimeContext);
            if (a2 == null) {
                a2 = f;
            }
            this.c.put(str, a2);
            return a2;
        }
        return this.c.get(str);
    }

    public Object b(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("457c200e", new Object[]{this, str, dXRuntimeContext});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!this.d.containsKey(str)) {
            fqp fqpVar = this.b.get(str);
            if (fqpVar == null) {
                return null;
            }
            Object a2 = fqpVar.a(null, dXRuntimeContext);
            if (a2 == null) {
                a2 = f;
            }
            this.d.put(str, a2);
            return a2;
        }
        return this.d.get(str);
    }

    public bg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bg) ipChange.ipc$dispatch("4d73aefd", new Object[]{this});
        }
        bg bgVar = new bg();
        bgVar.b = this.b;
        return bgVar;
    }

    public void b(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d651f3", new Object[]{this, new Byte(b)});
        } else {
            this.e = b;
        }
    }
}
