package com.taobao.search.weex.module;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nqh;

/* loaded from: classes8.dex */
public final class SearchHistoryModule extends WXModule implements nqh.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final nqh historyManager = new nqh(this);

    static {
        kge.a(858971503);
        kge.a(670348989);
    }

    @Override // tb.nqh.a
    public void onHistoryDeleted(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89c853", new Object[]{this, historyCellBean});
        }
    }

    @Override // tb.nqh.a
    public void onHistoryUpdated(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800ee4f5", new Object[]{this, historyCellBean});
        }
    }

    @JSMethod(uiThread = false)
    public final JSON getHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("42dceb44", new Object[]{this});
        }
        List<ActivateBean> historyBeanList = this.historyManager.c();
        q.a((Object) historyBeanList, "historyBeanList");
        List<ActivateBean> list = historyBeanList;
        ArrayList arrayList = new ArrayList(p.a((Iterable) list, 10));
        for (ActivateBean activateBean : list) {
            arrayList.add(activateBean.keyword);
        }
        Object json = JSON.toJSON(arrayList);
        if (json == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSON");
        }
        return (JSON) json;
    }

    @JSMethod
    public final void deleteSingleHistory(String history) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f247312", new Object[]{this, history});
            return;
        }
        q.c(history, "history");
        this.historyManager.b(history);
    }

    @JSMethod
    public final void clearHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dee8e", new Object[]{this});
        } else {
            this.historyManager.a();
        }
    }
}
