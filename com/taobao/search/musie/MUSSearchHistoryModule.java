package com.taobao.search.musie;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import tb.kge;
import tb.nqh;

/* loaded from: classes7.dex */
public final class MUSSearchHistoryModule extends MUSModule implements nqh.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final nqh historyManager;

    static {
        kge.a(-1005022583);
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

    public MUSSearchHistoryModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.historyManager = new nqh(this);
    }

    @MUSMethod(uiThread = false)
    public final JSON getHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("42dceb44", new Object[]{this});
        }
        List<ActivateBean> historyBeanList = this.historyManager.c();
        kotlin.jvm.internal.q.a((Object) historyBeanList, "historyBeanList");
        List<ActivateBean> list = historyBeanList;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
        for (ActivateBean activateBean : list) {
            arrayList.add(activateBean.keyword);
        }
        Object json = JSON.toJSON(arrayList);
        if (json == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSON");
        }
        return (JSON) json;
    }

    @MUSMethod
    public final void deleteSingleHistory(String history) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f247312", new Object[]{this, history});
            return;
        }
        kotlin.jvm.internal.q.c(history, "history");
        this.historyManager.b(history);
    }

    @MUSMethod
    public final void clearHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dee8e", new Object[]{this});
        } else {
            this.historyManager.a();
        }
    }
}
