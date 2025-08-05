package com.taobao.search.refactor.list;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.h;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.search.common.util.r;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.sf.MainSearchResultActivity;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.ArrayList;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.iru;
import tb.kge;

/* loaded from: classes7.dex */
public final class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(814536563);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h widget) {
        super(widget);
        q.c(widget, "widget");
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (k()) {
        } else {
            l();
        }
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (r.bt()) {
            iru iruVar = (iru) i().getModel();
            q.a((Object) iruVar, "widget.model");
            com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
            if (d == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonBaseDatasource");
            }
            com.taobao.search.sf.datasource.c cVar = (com.taobao.search.sf.datasource.c) d;
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
            if (commonSearchResult == null) {
                return;
            }
            q.a((Object) commonSearchResult, "datasource.totalSearchResult ?: return");
            if (!commonSearchResult.isPreDetail()) {
                return;
            }
            boolean z = !(i().getActivity() instanceof MainSearchResultActivity);
            if (!(i().K() instanceof com.taobao.android.meta.structure.list.f)) {
                return;
            }
            com.taobao.android.meta.structure.list.a aVar = (com.taobao.android.meta.structure.list.a) i().K();
            if (aVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.structure.list.MetaListPresenter");
            }
            Set<Integer> l = ((com.taobao.android.meta.structure.list.f) aVar).l();
            if (l.size() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Integer itemPos : l) {
                if (q.a(itemPos.intValue(), 0) >= 0 && q.a(itemPos.intValue(), commonSearchResult.getCellsCount()) < 0) {
                    q.a((Object) itemPos, "itemPos");
                    BaseCellBean cell = commonSearchResult.getCell(itemPos.intValue());
                    if (cell instanceof MuiseCellBean) {
                        MuiseCellBean muiseCellBean = (MuiseCellBean) cell;
                        if (muiseCellBean.ndPreview && !TextUtils.isEmpty(muiseCellBean.ndPreviewUrl) && !muiseCellBean.ndPreviewTriggered) {
                            muiseCellBean.ndPreviewTriggered = true;
                            arrayList2.add(cell);
                        }
                        if (!(!q.a((Object) "item", (Object) cell.cardType)) && !muiseCellBean.hasPreRequestDetail) {
                            arrayList.add(cell);
                            muiseCellBean.hasPreRequestDetail = true;
                        }
                    } else if (cell instanceof SFAuctionBaseCellBean) {
                        SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) cell;
                        if (!sFAuctionBaseCellBean.hasPreRequestDetail && sFAuctionBaseCellBean.auctionBaseBean != null) {
                            arrayList.add(cell);
                            sFAuctionBaseCellBean.hasPreRequestDetail = true;
                        }
                    } else if (cell instanceof M3CellBean) {
                        M3CellBean m3CellBean = (M3CellBean) cell;
                        if (!m3CellBean.getHasPreRequestDetail()) {
                            m3CellBean.setHasPreRequestDetail(true);
                            arrayList.add(cell);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                com.taobao.search.sf.detailpre.a.Companion.a().a(cVar.Q(), arrayList, cVar.getKeyword(), z);
            }
            if (!(!arrayList2.isEmpty())) {
                return;
            }
            com.taobao.search.sf.detailpre.a.Companion.a().a(arrayList2);
        }
    }
}
