package com.taobao.tao.flexbox.layoutmanager.player;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.bl;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.odz;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, odz> f20464a;
    private boolean b;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f20465a;

        static {
            kge.a(20431819);
            f20465a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("94082ebc", new Object[0]) : f20465a;
        }
    }

    static {
        kge.a(-466342675);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("94082ebc", new Object[0]) : a.a();
    }

    private b() {
        this.f20464a = new HashMap<>();
        this.b = false;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : d(str);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        odz n = n(str);
        if (n == null) {
            return null;
        }
        return n.i();
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        odz n = n(str);
        if (n == null) {
            return false;
        }
        return n.j();
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        odz n = n(str);
        if (n == null) {
            return false;
        }
        return n.l();
    }

    public bl e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bl) ipChange.ipc$dispatch("c50c05ff", new Object[]{this, str});
        }
        odz n = n(str);
        if (n == null) {
            return null;
        }
        return n.f();
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        odz n = n(str);
        if (n == null) {
            return true;
        }
        return n.k();
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue();
        }
        odz n = n(str);
        if (n == null) {
            return false;
        }
        return n.m();
    }

    public void a(String str, odz odzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a2f53d", new Object[]{this, str, odzVar});
            return;
        }
        HashMap<String, odz> hashMap = this.f20464a;
        if (hashMap == null) {
            return;
        }
        hashMap.put(str, odzVar);
    }

    public odz h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("812bfac8", new Object[]{this, str});
        }
        HashMap<String, odz> hashMap = this.f20464a;
        if (hashMap != null && hashMap.size() > 0) {
            return this.f20464a.get(str);
        }
        return null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap<String, odz> hashMap = this.f20464a;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{this, str});
        }
        odz n = n(str);
        if (n == null) {
            return null;
        }
        if (!TextUtils.isEmpty(n.o())) {
            return n.o();
        }
        if (TextUtils.isEmpty(n.n())) {
            return null;
        }
        return n.n();
    }

    public Map<String, Object> j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70248e70", new Object[]{this, str});
        }
        odz n = n(str);
        if (n == null) {
            return null;
        }
        return n.q();
    }

    public JSONObject k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("112303dc", new Object[]{this, str});
        }
        odz n = n(str);
        if (n == null) {
            return null;
        }
        return n.r();
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23c7e201", new Object[]{this, str})).booleanValue() : (k(str) == null || j(str) == null) ? false : true;
    }

    public boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6df97b42", new Object[]{this, str})).booleanValue();
        }
        odz n = n(str);
        if (n == null) {
            return false;
        }
        return n.s();
    }

    private odz n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("85380082", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return h(str);
        }
        return null;
    }
}
