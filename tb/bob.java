package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.h;
import tb.boc;

/* loaded from: classes2.dex */
public class bob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bny f26017a;
    private bd b = null;

    static {
        kge.a(2097255582);
    }

    public static bob a(bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bob) ipChange.ipc$dispatch("f79cc706", new Object[]{bnyVar});
        }
        if (bnyVar == null) {
            throw new IllegalArgumentException("params viewEngine can not be null");
        }
        return new bob(bnyVar);
    }

    private bob(bny bnyVar) {
        this.f26017a = null;
        this.f26017a = bnyVar;
        c();
    }

    public bd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("6a370b68", new Object[]{this}) : this.b;
    }

    public void a(long j, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc4c810", new Object[]{this, new Long(j), hVar});
        } else {
            this.b.a(j, hVar);
        }
    }

    public void a(String str, a aVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4eb6f3", new Object[]{this, str, aVar});
        } else {
            this.b.a(str, aVar);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b != null) {
        } else {
            boc E = this.f26017a.E();
            if (E != null) {
                this.b = E.h();
                if (this.b != null) {
                    a(this.f26017a.k(), E, this.b);
                    jqg.b(this.f26017a.r(), "命中DinamicXEngineRouter预加载");
                    return;
                }
            }
            DXEngineConfig.a aVar = null;
            if (E != null) {
                aVar = E.f();
            }
            if (aVar == null) {
                aVar = new DXEngineConfig.a(this.f26017a.o());
            }
            this.b = new bd(aVar.a(this.f26017a.y()).b(2).d(this.f26017a.w()).a(this.f26017a.x()).d(this.f26017a.B()).g(this.f26017a.z()).a());
            a(this.f26017a.k(), E, this.b);
        }
    }

    private void a(Context context, boc bocVar, bd bdVar) {
        boc.b g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5990c94", new Object[]{this, context, bocVar, bdVar});
        } else if (bocVar == null || (g = bocVar.g()) == null) {
        } else {
            g.a(context, bdVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        bd bdVar = this.b;
        if (bdVar == null || bdVar.d() == null) {
            return;
        }
        this.b.d().o();
    }
}
