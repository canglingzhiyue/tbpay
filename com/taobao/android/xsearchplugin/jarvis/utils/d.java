package com.taobao.android.xsearchplugin.jarvis.utils;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/android/xsearchplugin/jarvis/utils/PositionInfoRecorder;", "Lcom/taobao/android/xsearchplugin/jarvis/utils/IPositionInfoRecorder;", "()V", "mPositionInfo", "Landroid/util/SparseArray;", "Lcom/taobao/android/xsearchplugin/jarvis/utils/PositionInfo;", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear, "", "getPositionInfo", "position", "", "recordPositionInfo", com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, "Lcom/taobao/android/searchbaseframe/datasource/impl/BaseSearchDatasource;", "Lcom/taobao/android/searchbaseframe/datasource/impl/BaseSearchResult;", "Lcom/taobao/android/searchbaseframe/datasource/LocalDataManager;", "xsearch_plugin_jarvis_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes6.dex */
public final class d implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<c> f16251a = new SparseArray<>();

    static {
        kge.a(1036558158);
        kge.a(1716157573);
    }

    @Override // com.taobao.android.xsearchplugin.jarvis.utils.a
    public void a(com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, LocalDataManager> dataSource) {
        BaseSearchResult baseSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24fb09", new Object[]{this, dataSource});
            return;
        }
        q.c(dataSource, "dataSource");
        BaseSearchResult baseSearchResult2 = (BaseSearchResult) dataSource.getTotalSearchResult();
        if (baseSearchResult2 == null || (baseSearchResult = (BaseSearchResult) dataSource.getLastSearchResult()) == null) {
            return;
        }
        int cellsCount = baseSearchResult2.getCellsCount() - baseSearchResult.getCellsCount();
        int cellsCount2 = baseSearchResult.getCellsCount();
        for (int i = 0; i < cellsCount2; i++) {
            BaseCellBean cell = baseSearchResult.getCell(i);
            this.f16251a.put(cellsCount + i, new c(cell.pageNo, cell.pagePos, cell.pageSize));
        }
    }

    @Override // com.taobao.android.xsearchplugin.jarvis.utils.a
    public c a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("36f45de2", new Object[]{this, new Integer(i)}) : this.f16251a.get(i);
    }

    @Override // com.taobao.android.xsearchplugin.jarvis.utils.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f16251a.clear();
        }
    }
}
