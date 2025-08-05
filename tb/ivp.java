package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.section.c;
import com.taobao.android.searchbaseframe.xsl.section.h;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.iru;

/* loaded from: classes6.dex */
public class ivp<MODEL extends iru<? extends a<? extends BaseSearchResult, ?>>> extends inv<MODEL> implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public boolean c;

    static {
        kge.a(-1478125735);
        kge.a(-506941635);
    }

    public static /* synthetic */ Object ipc$super(ivp ivpVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1760699264:
                return new Integer(super.getItemCount());
            case -789925697:
                super.a(((Number) objArr[0]).intValue(), (TRecyclerView) objArr[1]);
                return null;
            case -603323580:
                super.a((itd) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1572498288:
                super.c(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (TRecyclerView) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.inv
    public itd a(ipq ipqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("e572eadf", new Object[]{this, ipqVar});
        }
        return null;
    }

    @Override // tb.inv
    public itd b(ipq ipqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("cd14c13e", new Object[]{this, ipqVar});
        }
        return null;
    }

    @Override // tb.inv, tb.isz, android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, itdVar, new Integer(i)});
        } else {
            a(itdVar, i);
        }
    }

    public ivp(ListStyle listStyle, Activity activity, ium iumVar, MODEL model, int i) {
        super(listStyle, activity, iumVar, model, i);
        this.b = -1;
        this.c = false;
        setHasStableIds(true);
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: tb.ivp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1172900388) {
                    super.onChanged();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                super.onChanged();
                ivp.this.h();
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        Object a2 = a(i);
        if (a2 != null) {
            return a2.hashCode();
        }
        return -1L;
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!a()) {
            return false;
        }
        BaseCellBean baseCellBean = (BaseCellBean) a(i);
        return baseCellBean.isSection || baseCellBean.sectionPos >= 0;
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef4f61b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!a() || i < 0 || i >= getItemCount()) {
            return false;
        }
        return ((BaseCellBean) a(i)).isSection;
    }

    @Override // tb.inv, android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        int itemCount = super.getItemCount();
        int i = this.b;
        return (i >= 0 && i < itemCount + (-1)) ? i + 1 : itemCount;
    }

    @Override // tb.ivo.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public boolean f(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0a9ceba", new Object[]{this, new Integer(i)})).booleanValue() : i == getItemCount() - 1;
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public boolean g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b25ea759", new Object[]{this, new Integer(i)})).booleanValue();
        }
        BaseCellBean j = j(i);
        Object obj = null;
        if (j instanceof MuiseCellBean) {
            obj = ((MuiseCellBean) j).mExtraObj.get("fullSpan");
        }
        return j.comboFullSpan || j.isSection || j.isFullspan || ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) || (j.combo != null && j.combo.n() == ListStyle.LIST);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public BaseCellBean h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("9a0a32b4", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        BaseCellBean baseCellBean = (BaseCellBean) a(i);
        return baseCellBean.isSection ? baseCellBean : (BaseCellBean) a(baseCellBean.sectionPos);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public itd b(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("6a5a21d2", new Object[]{this, viewGroup, new Integer(i)}) : createViewHolder(viewGroup, i);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public void a(itd itdVar, int i, BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("167f4916", new Object[]{this, itdVar, new Integer(i), baseCellBean});
        } else if (baseCellBean == null || !baseCellBean.isSection) {
        } else {
            itdVar.b(i, baseCellBean);
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public h i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("c449d140", new Object[]{this, new Integer(i)});
        }
        if (i >= getItemCount()) {
            return null;
        }
        Object a2 = a(i);
        if (!(a2 instanceof BaseCellBean)) {
            return null;
        }
        return ((BaseCellBean) a2).ownedSectionStyle;
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.c
    public BaseCellBean j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("1668836", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < getItemCount()) {
            return (BaseCellBean) a(i);
        }
        return null;
    }

    @Override // tb.inv, tb.isz
    public void a(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0a0344", new Object[]{this, itdVar, new Integer(i)});
        } else if (e(i)) {
            d(itdVar);
        } else {
            if (itdVar.itemView.getLayoutParams() != null && itdVar.itemView.getLayoutParams().height == 0) {
                itdVar.itemView.getLayoutParams().height = -2;
                itdVar.itemView.requestLayout();
            }
            super.a(itdVar, i);
        }
    }

    private void d(itd itdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dbf722", new Object[]{this, itdVar});
            return;
        }
        ViewGroup.LayoutParams layoutParams = itdVar.itemView.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        layoutParams.height = 0;
        itdVar.itemView.setLayoutParams(layoutParams);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.b = -1;
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((iru) g()).d().getTotalSearchResult();
        if (baseSearchResult == null) {
            return;
        }
        if (baseSearchResult.hasBarrier()) {
            int itemCount = super.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                BaseCellBean baseCellBean = (BaseCellBean) a(i);
                a(i, baseCellBean);
                if (baseCellBean.barrier) {
                    break;
                }
            }
        }
        j();
    }

    private void a(int i, BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c604c42d", new Object[]{this, new Integer(i), baseCellBean});
        } else if (this.b >= 0 || !baseCellBean.barrier) {
        } else {
            this.b = i;
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((iru) g()).d().getTotalSearchResult();
        if (baseSearchResult == null || this.b >= 0) {
            return;
        }
        baseSearchResult.setHasBarrier(false);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!a()) {
            i();
        } else {
            this.b = -1;
            int itemCount = super.getItemCount();
            BaseCellBean baseCellBean = null;
            h hVar = null;
            int i = -1;
            for (int i2 = 0; i2 < itemCount; i2++) {
                BaseCellBean baseCellBean2 = (BaseCellBean) a(i2);
                a(i2, baseCellBean2);
                baseCellBean2.sectionPos = -1;
                if (baseCellBean2.isSection) {
                    baseCellBean2.nextSectionPos = -1;
                    if (baseCellBean != null) {
                        baseCellBean.nextSectionPos = i2;
                    }
                    baseCellBean2.sectionPos = i2;
                    i = i2;
                    hVar = baseCellBean2.ownedSectionStyle;
                    baseCellBean = baseCellBean2;
                } else if (baseCellBean != null) {
                    baseCellBean2.sectionPos = i;
                    baseCellBean2.ownedSectionStyle = hVar;
                } else {
                    baseCellBean2.ownedSectionStyle = null;
                }
            }
            j();
        }
    }

    @Override // tb.isz
    public void a(int i, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0eab0bf", new Object[]{this, new Integer(i), tRecyclerView});
            return;
        }
        super.a(i, tRecyclerView);
        h();
    }

    @Override // tb.isz
    public void c(int i, int i2, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dba6b70", new Object[]{this, new Integer(i), new Integer(i2), tRecyclerView});
            return;
        }
        super.c(i, i2, tRecyclerView);
        h();
    }
}
