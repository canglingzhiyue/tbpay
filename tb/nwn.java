package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.e;
import com.taobao.search.refactor.g;
import com.taobao.search.refactor.j;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nwn extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public nwr e;
    private boolean f;
    private final Activity g;

    static {
        kge.a(1596315439);
    }

    public static /* synthetic */ Object ipc$super(nwn nwnVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2089841624:
                return new Boolean(super.a((j) objArr[0], (e) objArr[1], (ListStyle) objArr[2]));
            case -1364543859:
                super.b((j) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 177953217:
                super.a((j) objArr[0], (e) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (com.taobao.android.meta.data.e) objArr[4]);
                return null;
            case 980123182:
                super.a((j) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.refactor.g
    public void a(j scopeDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc16166", new Object[]{this, scopeDataSource});
        } else {
            q.c(scopeDataSource, "scopeDataSource");
        }
    }

    @Override // com.taobao.search.refactor.g
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwn(imn core, Activity context) {
        super(core);
        q.c(core, "core");
        q.c(context, "context");
        this.g = context;
    }

    @Override // com.taobao.search.refactor.g, com.taobao.android.meta.srp.b, com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(b bVar, a aVar, boolean z, boolean z2, com.taobao.android.meta.data.e eVar) {
        a((j) bVar, (e) aVar, z, z2, (com.taobao.android.meta.data.e<e>) eVar);
    }

    @Override // com.taobao.search.refactor.g, com.taobao.android.meta.srp.b, com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6da71", new Object[]{this, bVar, new Boolean(z)});
        } else {
            b((j) bVar, z);
        }
    }

    @Override // com.taobao.search.refactor.g, com.taobao.android.meta.srp.b, com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* synthetic */ void b(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f97710", new Object[]{this, bVar, new Boolean(z)});
        } else {
            a((j) bVar, z);
        }
    }

    public final void a(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70bc26f", new Object[]{this, nwrVar});
            return;
        }
        q.c(nwrVar, "<set-?>");
        this.e = nwrVar;
    }

    @Override // com.taobao.search.refactor.g, com.taobao.search.sf.datasource.e.b
    public j a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("d66c5a68", new Object[]{this, new Boolean(z)});
        }
        nsm nsmVar = new nsm(true, l(), new nng(new nul("Default")));
        nsmVar.setParam("tb2021", String.valueOf(this.f));
        if (z) {
            nsmVar.a(this);
        }
        return nsmVar;
    }

    @Override // com.taobao.search.refactor.g
    public void b(j initDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaab68d", new Object[]{this, initDataSource, new Boolean(z)});
            return;
        }
        q.c(initDataSource, "initDataSource");
        super.b(initDataSource, z);
        nwr nwrVar = this.e;
        if (nwrVar == null) {
            q.b("module");
        }
        nwrVar.a(true, z);
    }

    @Override // com.taobao.search.refactor.g
    public void a(j scopeDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6b7e2e", new Object[]{this, scopeDataSource, new Boolean(z)});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        super.a(scopeDataSource, z);
        nwr nwrVar = this.e;
        if (nwrVar == null) {
            q.b("module");
        }
        nwrVar.a(true, z);
    }

    @Override // com.taobao.search.refactor.g, com.taobao.android.meta.srp.b
    public void a(j scopeDataSource, e eVar, boolean z, boolean z2, com.taobao.android.meta.data.e<e> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b59c1", new Object[]{this, scopeDataSource, eVar, new Boolean(z), new Boolean(z2), config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(config, "config");
        super.a(scopeDataSource, eVar, z, z2, config);
        if (!z) {
            return;
        }
        nwr nwrVar = this.e;
        if (nwrVar == null) {
            q.b("module");
        }
        nwrVar.a(false, z2);
    }

    @Override // com.taobao.search.refactor.g, com.taobao.android.meta.logic.a
    public boolean a(j scopeDataSource, e combo, ListStyle newStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836f8c28", new Object[]{this, scopeDataSource, combo, newStyle})).booleanValue();
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        q.c(newStyle, "newStyle");
        nwr nwrVar = this.e;
        if (nwrVar == null) {
            q.b("module");
        }
        nwrVar.k();
        return super.a(scopeDataSource, combo, newStyle);
    }
}
