package com.taobao.search.mmd.rebuild;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nsp;

/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private CommonSearchContext f19179a;
    private c b;
    private c c;
    private ArrayList<SearchBarTagBean> d;
    private boolean e;

    static {
        kge.a(566137702);
        Companion = new a(null);
    }

    @JvmStatic
    public static final d a(CommonSearchContext commonSearchContext, nsp nspVar, nsp nspVar2, ArrayList<SearchBarTagBean> arrayList, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9f887d77", new Object[]{commonSearchContext, nspVar, nspVar2, arrayList, new Boolean(z)}) : Companion.a(commonSearchContext, nspVar, nspVar2, arrayList, z);
    }

    public d(CommonSearchContext commonSearchContext, c rebuildInitDSRecord, c rebuildCurrentDSRecord, ArrayList<SearchBarTagBean> arrayList, boolean z) {
        q.c(rebuildInitDSRecord, "rebuildInitDSRecord");
        q.c(rebuildCurrentDSRecord, "rebuildCurrentDSRecord");
        this.f19179a = commonSearchContext;
        this.b = rebuildInitDSRecord;
        this.c = rebuildCurrentDSRecord;
        this.d = arrayList;
        this.e = z;
    }

    public final CommonSearchContext a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonSearchContext) ipChange.ipc$dispatch("ed7b16a9", new Object[]{this}) : this.f19179a;
    }

    public final c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ae8865aa", new Object[]{this}) : this.c;
    }

    public final ArrayList<SearchBarTagBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this}) : this.d;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1349388498);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final d a(CommonSearchContext searchContext, nsp initDatasource, nsp currentDatasource, ArrayList<SearchBarTagBean> arrayList, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("9f887d77", new Object[]{this, searchContext, initDatasource, currentDatasource, arrayList, new Boolean(z)});
            }
            q.c(searchContext, "searchContext");
            q.c(initDatasource, "initDatasource");
            q.c(currentDatasource, "currentDatasource");
            CommonSearchResult commonSearchResult = (CommonSearchResult) currentDatasource.getTotalSearchResult();
            if (commonSearchResult != null) {
                CommonSearchResult commonSearchResult2 = (CommonSearchResult) initDatasource.getTotalSearchResult();
                commonSearchResult.setTabs(commonSearchResult2 != null ? commonSearchResult2.getTabs() : null);
            }
            return new d(searchContext, c.Companion.a(initDatasource), c.Companion.a(currentDatasource), arrayList, z);
        }
    }
}
