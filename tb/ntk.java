package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.a;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.util.d;
import com.taobao.search.musie.r;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import org.android.agoo.common.AgooConstants;
import tb.isv;

/* loaded from: classes8.dex */
public final class ntk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iny<?, ?, ?, ?> f31753a;
    private final c b;

    static {
        kge.a(-1516114088);
    }

    public ntk(iny<?, ?, ?, ?> searchListWidget, c scopeDataSource) {
        q.c(searchListWidget, "searchListWidget");
        q.c(scopeDataSource, "scopeDataSource");
        this.f31753a = searchListWidget;
        this.b = scopeDataSource;
    }

    public final void a(DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("889f1e3", new Object[]{this, dynamicCardBean});
            return;
        }
        q.c(dynamicCardBean, "dynamicCardBean");
        ioa ioaVar = (ioa) this.f31753a.J();
        q.a((Object) ioaVar, "searchListWidget.iView");
        if (!(ioaVar.l() instanceof PartnerRecyclerView)) {
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.b.getTotalSearchResult();
        if (!(commonSearchResult instanceof BaseSearchResult)) {
            commonSearchResult = null;
        }
        CommonSearchResult commonSearchResult2 = commonSearchResult;
        if (commonSearchResult2 == null || dynamicCardBean.mDynamicCellBean == null) {
            return;
        }
        JSONObject jSONObject = dynamicCardBean.mOriginData;
        String string = jSONObject.getString("recedItems");
        String string2 = jSONObject.getString("recedItem");
        if (!TextUtils.isEmpty(string)) {
            this.b.setParam("recedItems", string);
        } else if (!TextUtils.isEmpty(string2)) {
            this.b.addParam("recedItems", string2);
        }
        int b = d.b(jSONObject.getString("position"), -1);
        if (TextUtils.equals(jSONObject.getString("insertType"), AgooConstants.MESSAGE_POPUP)) {
            b(dynamicCardBean);
        } else if (b >= 0) {
            a(b, commonSearchResult2, dynamicCardBean);
        } else {
            String itemId = jSONObject.getString("itemId");
            JSONObject b2 = a.b(jSONObject, "info");
            if (b2 != null && TextUtils.isEmpty(itemId)) {
                itemId = b2.getString("itemId");
            }
            if (TextUtils.isEmpty(itemId)) {
                return;
            }
            q.a((Object) itemId, "itemId");
            a(itemId, commonSearchResult2, dynamicCardBean);
        }
    }

    private final void b(DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36628c42", new Object[]{this, dynamicCardBean});
            return;
        }
        BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
        if (!(baseCellBean instanceof MuiseCellBean)) {
            baseCellBean = null;
        }
        MuiseCellBean muiseCellBean = (MuiseCellBean) baseCellBean;
        if (muiseCellBean == null) {
            return;
        }
        MuiseBean muiseBean = muiseCellBean.mMuiseBean;
        q.a((Object) muiseBean, "bean.mMuiseBean");
        TemplateBean templateBean = dynamicCardBean.mTemplates.get(muiseCellBean.type);
        if (templateBean == null) {
            return;
        }
        iul findComponentOfScope = this.f31753a.findComponentOfScope("childPageWidget");
        if (!(findComponentOfScope instanceof iup)) {
            findComponentOfScope = null;
        }
        iup iupVar = (iup) findComponentOfScope;
        if (iupVar == null) {
            return;
        }
        View view = iupVar.getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            return;
        }
        Activity activity = this.f31753a.getActivity();
        q.a((Object) activity, "searchListWidget.activity");
        iru iruVar = (iru) this.f31753a.getModel();
        q.a((Object) iruVar, "searchListWidget.model");
        nwz nwzVar = new nwz(activity, iupVar, iruVar, templateBean, viewGroup, new iug(viewGroup));
        nwzVar.a(muiseBean);
        nwzVar.attachToContainer();
    }

    private final void a(int i, BaseSearchResult baseSearchResult, DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716613ee", new Object[]{this, new Integer(i), baseSearchResult, dynamicCardBean});
        } else if (i >= baseSearchResult.getCellsCount()) {
        } else {
            BaseCellBean cell = baseSearchResult.getCell(i);
            if (cell instanceof SFAuctionBaseCellBean) {
                SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) cell;
                if (sFAuctionBaseCellBean.dynamicCardBean == null) {
                    sFAuctionBaseCellBean.dynamicCardBean = dynamicCardBean;
                }
            } else if (cell instanceof WeexCellBean) {
                WeexCellBean weexCellBean = (WeexCellBean) cell;
                if (weexCellBean.mExtraObj.get("dynamicCardBean") == null) {
                    Map<String, Object> map = weexCellBean.mExtraObj;
                    q.a((Object) map, "targetBean.mExtraObj");
                    map.put("dynamicCardBean", dynamicCardBean);
                }
            } else if (cell instanceof MuiseCellBean) {
                MuiseCellBean muiseCellBean = (MuiseCellBean) cell;
                if (muiseCellBean.mExtraObj.get("dynamicCardBean") == null) {
                    Map<String, Object> map2 = muiseCellBean.mExtraObj;
                    q.a((Object) map2, "targetBean.mExtraObj");
                    map2.put("dynamicCardBean", dynamicCardBean);
                }
            } else if (cell instanceof M3CellBean) {
                M3CellBean m3CellBean = (M3CellBean) cell;
                if (m3CellBean.getDynamicCardBean() == null) {
                    m3CellBean.setDynamicCardBean(dynamicCardBean);
                }
            }
            this.f31753a.postEvent(isv.c.a(i, 1));
        }
    }

    private final void a(String str, BaseSearchResult baseSearchResult, DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b794705", new Object[]{this, str, baseSearchResult, dynamicCardBean});
            return;
        }
        ioa ioaVar = (ioa) this.f31753a.J();
        q.a((Object) ioaVar, "searchListWidget.iView");
        RecyclerView l = ioaVar.l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) l;
        int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
        int findFirstPartlyVisibleItemPosition = partnerRecyclerView.findFirstPartlyVisibleItemPosition() - headerViewsCount;
        int findPartlyLastVisibleItemPosition = partnerRecyclerView.findPartlyLastVisibleItemPosition() - headerViewsCount;
        int cellsCount = baseSearchResult.getCellsCount();
        if (findPartlyLastVisibleItemPosition > cellsCount) {
            findPartlyLastVisibleItemPosition = cellsCount;
        }
        if (findFirstPartlyVisibleItemPosition >= 0) {
            i = findFirstPartlyVisibleItemPosition;
        }
        while (i < findPartlyLastVisibleItemPosition) {
            if (i >= 0) {
                if (i >= cellsCount) {
                    return;
                }
                BaseCellBean cell = baseSearchResult.getCell(i);
                if (TextUtils.equals(cell.cardType, "item") && TextUtils.equals(cell.itemId, str)) {
                    RecyclerView.Adapter adapter = partnerRecyclerView.getAdapter();
                    if (!(adapter instanceof TRecyclerView.HeaderViewAdapter)) {
                        adapter = null;
                    }
                    TRecyclerView.HeaderViewAdapter headerViewAdapter = (TRecyclerView.HeaderViewAdapter) adapter;
                    if (headerViewAdapter == null) {
                        return;
                    }
                    if (cell instanceof SFAuctionBaseCellBean) {
                        SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) cell;
                        if (sFAuctionBaseCellBean.dynamicCardBean != null) {
                            return;
                        }
                        sFAuctionBaseCellBean.dynamicCardBean = dynamicCardBean;
                        a(partnerRecyclerView, i, headerViewAdapter);
                        return;
                    } else if (cell instanceof MuiseCellBean) {
                        MuiseCellBean muiseCellBean = (MuiseCellBean) cell;
                        if (muiseCellBean.mExtraObj.get("dynamicCardBean") != null) {
                            return;
                        }
                        Map<String, Object> map = muiseCellBean.mExtraObj;
                        q.a((Object) map, "baseCellBean.mExtraObj");
                        map.put("dynamicCardBean", dynamicCardBean);
                        a(partnerRecyclerView, i, headerViewAdapter);
                        return;
                    } else if (!(cell instanceof M3CellBean)) {
                        return;
                    } else {
                        M3CellBean m3CellBean = (M3CellBean) cell;
                        if (m3CellBean.getDynamicCardBean() != null) {
                            return;
                        }
                        m3CellBean.setDynamicCardBean(dynamicCardBean);
                        a(partnerRecyclerView, i, headerViewAdapter);
                        return;
                    }
                }
            }
            i++;
        }
    }

    private final void a(RecyclerView recyclerView, int i, TRecyclerView.HeaderViewAdapter headerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4652eb34", new Object[]{this, recyclerView, new Integer(i), headerViewAdapter});
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(headerViewAdapter.getHeadersCount() + i);
        if (findViewHolderForAdapterPosition instanceof r) {
            ((r) findViewHolderForAdapterPosition).V();
        } else {
            headerViewAdapter.notifyItemChanged(i + headerViewAdapter.getHeadersCount());
        }
    }
}
