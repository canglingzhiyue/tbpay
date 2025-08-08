package com.taobao.tao.flexbox.layoutmanager.ac;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.a;
import com.taobao.tao.flexbox.layoutmanager.ac.e;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.AnyThread;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogg;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, e.a> f19923a = new HashMap();

    /* loaded from: classes8.dex */
    public interface a {
        void a(e.a aVar);

        void a(String str);
    }

    static {
        kge.a(1071067037);
    }

    public void a(String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85142f2", new Object[]{this, str, aVar});
            return;
        }
        final e.a c = c(str);
        if (c == null) {
            aVar.a("jsCode not found " + str);
            ogg.a("TNode", "jsCode not found " + str);
        } else if (c.b != null) {
            aVar.a(c);
        } else if (c.f19926a.startsWith("file://")) {
            String[] split = c.f19926a.split("/");
            String a2 = oec.a(split[split.length - 1], ab.a());
            if (!StringUtils.isEmpty(a2)) {
                c.b = a2;
                aVar.a(c);
                return;
            }
            aVar.a("JS code not exist in " + c.f19926a);
        } else if (c.f19926a.startsWith("http")) {
            byte[] a3 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().p().a(c.f19926a);
            if (a3 != null && a3.length > 0) {
                try {
                    c.b = new String(a3, 0, a3.length, "utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                aVar.a(c);
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.ac.a.a().a(c.f19926a, new a.InterfaceC0829a() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.InterfaceC0829a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    e.a aVar2 = c;
                    aVar2.b = str2;
                    aVar.a(aVar2);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.InterfaceC0829a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    a aVar2 = aVar;
                    aVar2.a("faile to download JS code from " + c.f19926a);
                }
            });
        } else {
            aVar.a("jsCode not found");
        }
    }

    public e.a a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (e.a) ipChange.ipc$dispatch("11438d25", new Object[]{this, str});
        }
        e.a c = c(str);
        if (c == null || (c.c == null && c.d == null)) {
            z = false;
        }
        if (!z) {
            return null;
        }
        return c;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        e.a c = c(str);
        return (c == null || (c.f19926a == null && c.b == null)) ? false : true;
    }

    public e.a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e.a) ipChange.ipc$dispatch("c8c684a7", new Object[]{this, str});
        }
        e.a a2 = e.a(str);
        return a2 == null ? this.f19923a.get(str) : a2;
    }

    public void a(String str, Class cls) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{this, str, cls});
            return;
        }
        e.a aVar = new e.a();
        aVar.d = cls;
        if (cls.getAnnotation(AnyThread.class) == null) {
            z = false;
        }
        aVar.f = z;
        this.f19923a.put(str, aVar);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (this.f19923a.containsKey(str)) {
        } else {
            e.a aVar = new e.a();
            aVar.b = str2;
            this.f19923a.put(str, aVar);
        }
    }
}
