package com.taobao.android.meta.srp;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.data.e;
import com.taobao.android.meta.srp.ui.list.SrpStateCell;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.meta.structure.state.MetaState;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.htg;
import tb.hth;
import tb.iru;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b<D extends com.taobao.android.meta.data.b<C, R>, C extends htg, R extends MetaResult<C>> extends hth<D, C, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(11769272);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1845922032:
                super.b((b) ((com.taobao.android.meta.data.b) objArr[0]), ((Boolean) objArr[1]).booleanValue());
                return null;
            case 64625904:
                super.a((b) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.data.b) ((com.taobao.android.meta.data.a) objArr[1]), ((Boolean) objArr[2]).booleanValue(), (Map<String, String>) objArr[3]);
                return null;
            case 199868663:
                super.a((b) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.data.b) ((com.taobao.android.meta.data.a) objArr[1]), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (e<com.taobao.android.meta.data.b>) objArr[4]);
                return null;
            case 816241265:
                super.a((b) ((com.taobao.android.meta.data.b) objArr[0]), ((Boolean) objArr[1]).booleanValue());
                return null;
            case 1101502405:
                super.c((com.taobao.android.meta.data.b) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void f(D scopeDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9f1248", new Object[]{this, scopeDataSource});
        } else {
            q.c(scopeDataSource, "scopeDataSource");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, Map map) {
        a((b<D, C, R>) bVar, (com.taobao.android.meta.data.b) ((htg) aVar), z, (Map<String, String>) map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, boolean z2, e eVar) {
        a((b<D, C, R>) bVar, (com.taobao.android.meta.data.b) ((htg) aVar), z, z2, (e<com.taobao.android.meta.data.b>) eVar);
    }

    public void a(D scopeDataSource, C c, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b17a9", new Object[]{this, scopeDataSource, c, new Boolean(z), map});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        super.a((b<D, C, R>) scopeDataSource, (D) c, z, map);
        if (c == null || z) {
            return;
        }
        if (((iru) c().getModel()).a().ar()) {
            f(scopeDataSource);
        } else {
            a((b<D, C, R>) scopeDataSource, (D) c, new SrpStateCell());
        }
    }

    @Override // com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public void c(D scopeDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a797c5", new Object[]{this, scopeDataSource});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        super.c(scopeDataSource);
        ((com.taobao.android.meta.structure.page.b) c().J()).d().unfold();
        g d = d(scopeDataSource);
        if (d == null) {
            return;
        }
        d.p();
    }

    public void a(D scopeDataSource, C c, boolean z, boolean z2, e<C> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e0df70", new Object[]{this, scopeDataSource, c, new Boolean(z), new Boolean(z2), config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(config, "config");
        super.a((b<D, C, R>) scopeDataSource, (D) c, z, z2, (e<D>) config);
        if (c == null || z) {
            return;
        }
        if (z2 && c.k() != MetaState.EMPTY) {
            return;
        }
        a((b<D, C, R>) scopeDataSource, (D) c, new SrpStateCell());
    }

    @Override // com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public void b(D scopeDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f97710", new Object[]{this, scopeDataSource, new Boolean(z)});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        super.b((b<D, C, R>) scopeDataSource, z);
        c((b<D, C, R>) scopeDataSource, z);
    }

    private final void c(D d, boolean z) {
        MetaResult metaResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34c13af", new Object[]{this, d, new Boolean(z)});
        } else if (z && (metaResult = (MetaResult) d.getTotalSearchResult()) != null) {
            int comboSize = metaResult.comboSize();
            for (int i = 0; i < comboSize; i++) {
                htg htgVar = (htg) metaResult.getCombo(i);
                if (htgVar != null && !htgVar.f()) {
                    htgVar.a(MetaState.EMPTY);
                    a((b<D, C, R>) d, (D) htgVar, new SrpStateCell());
                }
            }
        }
    }

    @Override // com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public void a(D initDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6da71", new Object[]{this, initDataSource, new Boolean(z)});
            return;
        }
        q.c(initDataSource, "initDataSource");
        super.a((b<D, C, R>) initDataSource, z);
        c((b<D, C, R>) initDataSource, z);
    }

    public void a(D scopeDataSource, C combo, SrpStateCell cell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f18d3a", new Object[]{this, scopeDataSource, combo, cell});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        q.c(cell, "cell");
        combo.a(cell);
        g d = d(scopeDataSource);
        if (d == null) {
            return;
        }
        d.n();
    }
}
