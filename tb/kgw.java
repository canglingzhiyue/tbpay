package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.a;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.g;
import com.taobao.tbpoplayer.nativerender.l;
import com.taobao.tbpoplayer.nativerender.r;
import com.taobao.tbpoplayer.nativerender.render.component.c;

/* loaded from: classes7.dex */
public class kgw extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-283108149);
        kge.a(717479522);
    }

    public static /* synthetic */ Object ipc$super(kgw kgwVar, String str, Object... objArr) {
        if (str.hashCode() == -2050524656) {
            return super.a((StateModel) objArr[0], (StateVersionModel) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$jdttnT6psSHn7mBUhLNXCNQBpSY(e.b bVar) {
        b(bVar);
    }

    public kgw(e eVar) {
        super(eVar);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        g.a(this.f22221a, this.f22221a.a().k(), jSONObject);
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.a(str, jSONObject);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e();
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e();
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.f();
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.a
    public View a(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("85c77a10", new Object[]{this, stateModel, stateVersionModel});
        }
        View a2 = super.a(stateModel, stateVersionModel);
        r.a(this.f22221a, a2, stateModel, this.f22221a.a().k().style);
        return a2;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        StateBaseModel k = this.f22221a.a().k();
        if (k == null) {
            return;
        }
        this.f22221a.e().a(this.f22221a, "expose", k.animation, this.b, null);
    }

    public void a(final e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad932ea8", new Object[]{this, bVar});
            return;
        }
        try {
            this.f22221a.e().a(this.f22221a, "close", this.f22221a.a().k().animation, this.b, new l.b() { // from class: tb.-$$Lambda$kgw$jdttnT6psSHn7mBUhLNXCNQBpSY
                @Override // com.taobao.tbpoplayer.nativerender.l.b
                public final void onAnimationEnd() {
                    kgw.lambda$jdttnT6psSHn7mBUhLNXCNQBpSY(e.b.this);
                }
            });
        } catch (Throwable th) {
            kgz.a("WindowStateManager.onClosed.error", th);
            if (bVar == null) {
                return;
            }
            bVar.onPreCloseDone(false);
        }
    }

    public static /* synthetic */ void b(e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4833f129", new Object[]{bVar});
        } else if (bVar == null) {
        } else {
            bVar.onPreCloseDone(false);
        }
    }
}
