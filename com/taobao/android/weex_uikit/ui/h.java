package com.taobao.android.weex_uikit.ui;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class h<T extends h> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f16134a = new HashMap();
    public UINode b;
    public boolean c;
    private Map<String, Object> d;
    private a e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a {
        void a(Map<String, Object> map);
    }

    static {
        kge.a(736177087);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        }
    }

    public static /* synthetic */ a b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("93428a30", new Object[]{hVar}) : hVar.e;
    }

    public h(UINode uINode) {
        this.b = uINode;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.c;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f344f75", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.f16134a.put(str, obj);
        }
    }

    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
        } else if (StringUtils.isEmpty(str)) {
            if (!com.taobao.android.weex_framework.util.g.a()) {
                return;
            }
            com.taobao.android.weex_framework.util.g.c("MUSNodeProperty", riy.ARRAY_START_STR + getClass().getSimpleName() + "]-put:key is empty", new Exception());
        } else {
            this.f16134a.put(str, obj);
            if (!this.c) {
                return;
            }
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.put(str, obj);
        }
    }

    public final <T> T a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : (T) this.f16134a.get(str);
    }

    public void a(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        m();
        Map<String, Object> map = this.d;
        if (map == null || map.isEmpty()) {
            return;
        }
        final Map<String, Object> map2 = this.d;
        this.d = null;
        list.add(new Runnable() { // from class: com.taobao.android.weex_uikit.ui.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (h.b(h.this) == null) {
                } else {
                    h.b(h.this).a(map2);
                }
            }
        });
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f16134a.putAll(map);
        }
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609103d2", new Object[]{this, t});
            return;
        }
        t.f16134a.clear();
        t.f16134a.putAll(this.f16134a);
    }
}
