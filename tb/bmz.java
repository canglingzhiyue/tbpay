package tb;

import android.content.Context;
import com.alibaba.android.ultron.trade.presenter.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bmz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f25991a;
    private String b;
    private String c;
    private IDMComponent d;
    private c e;
    private Object f;
    private Map<String, Object> g = new HashMap();
    private bnf h;

    static {
        kge.a(1406725562);
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f25991a;
    }

    public bmz a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("34c17a77", new Object[]{this, context});
        }
        this.f25991a = context;
        return this;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public bmz a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("7c6d8265", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public IDMComponent c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("f7d9f66e", new Object[]{this}) : this.d;
    }

    public bmz a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("fe24a16b", new Object[]{this, iDMComponent});
        }
        this.d = iDMComponent;
        return this;
    }

    public c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("18197fe3", new Object[]{this}) : this.e;
    }

    public bmz a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("a4df9757", new Object[]{this, cVar});
        }
        this.e = cVar;
        return this;
    }

    public bmz a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("2f83bb89", new Object[]{this, str, obj});
        }
        if (str != null) {
            this.g.put(str, obj);
        }
        return this;
    }

    public bmz a(Map<? extends String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("24ae4e1a", new Object[]{this, map});
        }
        if (map != null) {
            this.g.putAll(map);
        }
        return this;
    }

    public <T> T b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
        }
        if (str != null) {
            return (T) this.g.get(str);
        }
        return null;
    }

    public <T> T e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d74af246", new Object[]{this});
        }
        try {
            return (T) this.f;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public bmz a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("16b92413", new Object[]{this, obj});
        }
        this.f = obj;
        return this;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    public bmz c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("7dc6d9a3", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public void a(bnf bnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20d52fe", new Object[]{this, bnfVar});
        } else {
            this.h = bnfVar;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        bnf bnfVar = this.h;
        if (bnfVar == null) {
            return;
        }
        bnfVar.a();
    }
}
