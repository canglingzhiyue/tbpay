package com.taobao.android.abilitykit.mega;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.e;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.dlg;
import tb.dln;
import tb.kge;

/* loaded from: classes.dex */
public final class b<DATA> implements dln<DATA> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.d f8950a;
    private final String b;
    private final String c;
    private final d d;

    static {
        kge.a(-1143416635);
        kge.a(-1749066050);
    }

    public b(String str, String str2) {
        this(str, str2, null, 4, null);
    }

    private final c a() {
        IpChange ipChange = $ipChange;
        return (c) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("16141bc7", new Object[]{this}) : this.f8950a.getValue());
    }

    public b(String megaName, String megaApi, d dVar) {
        q.d(megaName, "megaName");
        q.d(megaApi, "megaApi");
        this.b = megaName;
        this.c = megaApi;
        this.d = dVar;
        this.f8950a = e.a(new MegaHubBuilder$wrapper$2(this));
    }

    public /* synthetic */ b(String str, String str2, d dVar, int i, o oVar) {
        this(str, str2, (i & 4) != 0 ? null : dVar);
    }

    @Override // tb.dln
    public dlg<?> b(DATA data) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, data}) : a();
    }
}
