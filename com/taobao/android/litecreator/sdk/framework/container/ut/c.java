package com.taobao.android.litecreator.sdk.framework.container.ut;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.hfi;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f13467a;
    private String b;
    private Map<String, String> c;

    static {
        kge.a(648575905);
        kge.a(-1161751512);
    }

    public c(String str, String str2) {
        this(str, str2, null);
    }

    public c(String str, String str2, Map<String, String> map) {
        this.f13467a = str;
        this.b = str2;
        this.c = map;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Map<String, String> map = this.c;
        if (map == null) {
            map = new HashMap<>();
        }
        this.c = map;
        this.c.putAll(hfi.a());
        this.c.put("spm-cnt", this.b);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
        } else {
            a(context, map, false);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void a(Context context, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3072ec4f", new Object[]{this, context, map, new Boolean(z)});
            return;
        }
        String str = this.f13467a;
        String str2 = this.b;
        if (!z) {
            map = hfi.a(a(map), false);
        }
        hfi.a(context, str, str2, map);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, (Map<String, String>) null);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(str, map, false);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void a(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a5f021", new Object[]{this, str, map, new Boolean(z)});
            return;
        }
        String str2 = this.f13467a;
        if (!z) {
            map = hfi.a(a(map), true);
        }
        hfi.b(str2, str, map);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            b(str, null);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
        } else {
            b(str, map, false);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void b(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a6e762", new Object[]{this, str, map, new Boolean(z)});
            return;
        }
        String str2 = this.f13467a;
        if (!z) {
            map = hfi.a(a(map), true);
        }
        hfi.a(str2, str, map);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            c(str, null);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec9e51", new Object[]{this, str, map});
        } else {
            c(str, map, false);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.ut.a
    public void c(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa7dea3", new Object[]{this, str, map, new Boolean(z)});
            return;
        }
        String str2 = this.f13467a;
        if (!z) {
            map = hfi.a(a(map), false);
        }
        hfi.c(str2, str, map);
    }

    private Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        Map<String, String> map2 = this.c;
        if (map2 != null && map2.size() > 0) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.putAll(this.c);
        }
        return map;
    }
}
