package tb;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.af;
import com.taobao.android.litecreator.sdk.editor.ai;
import com.taobao.android.litecreator.sdk.editor.v;
import com.taobao.android.litecreator.sdk.framework.container.ut.a;
import com.taobao.android.litecreator.widgets.LCBubble;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ios;

/* loaded from: classes5.dex */
public class hez extends hew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private hew f28580a;
    public Map<String, String> s = new HashMap();
    public Map<String, String> t = new HashMap();
    public Map<String, Object> u = new HashMap();

    static {
        kge.a(775306757);
        kge.a(-1792113754);
    }

    public hew R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hew) ipChange.ipc$dispatch("9b9cc4b3", new Object[]{this}) : this;
    }

    public void W_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c5db6f", new Object[]{this});
        }
    }

    public void X_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7ab40e", new Object[]{this});
        }
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public void a(hew hewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd34d7e", new Object[]{this, hewVar});
            return;
        }
        this.f28580a = hewVar;
        this.r = hewVar.r;
    }

    @Override // tb.hew
    @Deprecated
    public MutableLiveData f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableLiveData) ipChange.ipc$dispatch("e43e4290", new Object[]{this, str}) : this.f28580a.f(str);
    }

    public <T> void a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, t});
        } else {
            this.f28580a.f(str).setValue(t);
        }
    }

    public <T> void a(String str, Observer<T> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b26a9b", new Object[]{this, str, observer});
        } else {
            this.f28580a.f(str).observe((LifecycleOwner) this.r, observer);
        }
    }

    public <T> void b(String str, Observer<T> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e8bd7a", new Object[]{this, str, observer});
        } else {
            this.f28580a.f(str).removeObserver(observer);
        }
    }

    @Override // tb.hew
    public hew C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hew) ipChange.ipc$dispatch("28341422", new Object[]{this}) : this.f28580a;
    }

    @Override // tb.hew
    public void a(View view, heu heuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89b9c2", new Object[]{this, view, heuVar});
        } else {
            this.f28580a.a(view, heuVar);
        }
    }

    @Override // tb.hew
    public void Y_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2f8cad", new Object[]{this});
        } else {
            this.f28580a.Y_();
        }
    }

    @Override // tb.hew
    public void a(hez hezVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd4aa9b", new Object[]{this, hezVar});
        } else {
            this.f28580a.a(hezVar);
        }
    }

    @Override // tb.hew
    public void Z_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee4654c", new Object[]{this});
        } else {
            this.f28580a.Z_();
        }
    }

    @Override // tb.hew
    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : this.f28580a.O();
    }

    @Override // tb.hew
    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue() : this.f28580a.b(view);
    }

    @Override // tb.hew
    public String P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11580a9", new Object[]{this}) : this.f28580a.P();
    }

    @Override // tb.hew
    public void a(LCBubble lCBubble, LCBubble.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d43442a", new Object[]{this, lCBubble, bVar});
        } else {
            this.f28580a.a(lCBubble, bVar);
        }
    }

    @Override // tb.hew
    public ai H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ai) ipChange.ipc$dispatch("bdab3545", new Object[]{this}) : this.f28580a.H();
    }

    @Override // tb.hew
    public af I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (af) ipChange.ipc$dispatch("af54db07", new Object[]{this}) : this.f28580a.I();
    }

    @Override // tb.hew
    public <T extends v> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6e493a19", new Object[]{this, cls}) : (T) this.f28580a.a(cls);
    }

    @Override // tb.hew
    public <T extends v> List<T> b(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2da1953", new Object[]{this, cls}) : this.f28580a.b(cls);
    }

    @Override // tb.hew
    public int J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4284fc4", new Object[]{this})).intValue() : this.f28580a.J();
    }

    @Override // tb.hew
    public a K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("76b01dfa", new Object[]{this}) : this.f28580a.K();
    }

    @Override // tb.hew
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.f28580a.g(str);
        }
    }

    @Override // tb.hew
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else {
            this.f28580a.L();
        }
    }

    @Override // tb.hew
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.f28580a.d(z);
        }
    }

    @Override // tb.hew
    public ios.a N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ios.a) ipChange.ipc$dispatch("a246e547", new Object[]{this}) : this.f28580a.N();
    }

    @Override // tb.hew
    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
        } else {
            this.f28580a.a(charSequence);
        }
    }

    @Override // tb.hew
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else {
            this.f28580a.M();
        }
    }

    @Override // tb.hew
    public void e(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4819e4ad", new Object[]{this, afVar});
        } else {
            this.f28580a.e(afVar);
        }
    }

    @Override // tb.hew
    public boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue() : this.f28580a.Q();
    }
}
