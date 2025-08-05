package tb;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.LiveHomeController2;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.a;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.d;
import java.util.UUID;

/* loaded from: classes6.dex */
public class sqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TabManager.TabBottom B;
    public TabManager.TabUp C;
    public String D;
    public String F;
    private boolean G;
    public int H;

    /* renamed from: a  reason: collision with root package name */
    public Object f33847a;
    public boolean b;
    public boolean c;
    public Uri d;
    public String e;
    public String f;
    public String g;
    public Intent h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public ISmartLandingProxy.b o;
    private boolean p;
    private a q;
    private c r;
    private d s;
    private JSONObject t;
    private boolean u;
    private b v;
    private JSONArray w;
    private com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.b x;
    private LiveHomeController2 y;
    public volatile boolean z;
    public String A = UUID.randomUUID().toString() + System.currentTimeMillis();
    private JSONArray E = new JSONArray();

    static {
        kge.a(-491676276);
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        if (this.E == null) {
            this.E = new JSONArray();
        }
        this.E.add(jSONObject);
    }

    public JSONArray k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6697548c", new Object[]{this});
        }
        JSONArray jSONArray = this.E;
        this.E = new JSONArray();
        return jSONArray;
    }

    public void a(LiveHomeController2 liveHomeController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6098aaf8", new Object[]{this, liveHomeController2});
        } else {
            this.y = liveHomeController2;
        }
    }

    public LiveHomeController2 a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveHomeController2) ipChange.ipc$dispatch("b8cc257e", new Object[]{this}) : this.y;
    }

    public void a(com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c97f57c", new Object[]{this, bVar});
        } else {
            this.x = bVar;
        }
    }

    public com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.b) ipChange.ipc$dispatch("d56555a1", new Object[]{this}) : this.x;
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.w = jSONArray;
        }
    }

    public JSONArray c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("c49d9194", new Object[]{this}) : this.w;
    }

    public b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("61b5d653", new Object[]{this}) : this.v;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7303c1f0", new Object[]{this, bVar});
        } else {
            this.v = bVar;
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.t = jSONObject;
        }
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.t;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.p;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.G;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c97811d", new Object[]{this, aVar});
        } else {
            this.q = aVar;
        }
    }

    public a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("526bed9d", new Object[]{this}) : this.q;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9869db", new Object[]{this, cVar});
        } else {
            this.r = cVar;
        }
    }

    public c h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6b6d3f7a", new Object[]{this}) : this.r;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c98de3a", new Object[]{this, dVar});
        } else {
            this.s = dVar;
        }
    }

    public d i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("846e9138", new Object[]{this}) : this.s;
    }
}
