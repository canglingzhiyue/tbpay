package com.taobao.search.refactor.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.h;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.iru;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends com.taobao.android.meta.structure.list.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f19318a;
    private boolean b;
    private boolean c;

    static {
        kge.a(1799843962);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h widget) {
        super(widget);
        q.c(widget, "widget");
        this.b = true;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.c;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (this.f19318a == null) {
            iru iruVar = (iru) i().getModel();
            q.a((Object) iruVar, "widget.model");
            com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
            q.a((Object) d, "widget.model.scopeDatasource");
            BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
            if (baseSearchResult != null) {
                if (baseSearchResult != null) {
                    this.f19318a = Boolean.valueOf(((CommonSearchResult) baseSearchResult).newSearch);
                    Boolean bool = this.f19318a;
                    if (bool == null) {
                        q.a();
                    }
                    return bool.booleanValue();
                }
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            }
            this.f19318a = false;
        }
        Boolean bool2 = this.f19318a;
        if (bool2 == null) {
            q.a();
        }
        return bool2.booleanValue();
    }

    @Override // com.taobao.android.meta.structure.list.e
    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a(this.b);
        this.b = false;
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.c = false;
        }
    }
}
