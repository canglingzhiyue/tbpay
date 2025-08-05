package tb;

import android.view.LayoutInflater;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.a;
import com.taobao.search.sf.widgets.list.listcell.tips.b;
import com.taobao.taobao.R;
import tb.itb;

/* loaded from: classes8.dex */
public class nux {
    public static final itb.a CROSS_TIPS_CREATOR;
    public static final itb.a DEFAULT_AUCTION_CELL_LIST_CREATOR;
    public static final itb.a DEFAULT_AUCTION_CELL_WF_CREATOR;
    public static final itb.a DEFAULT_SHOP_CELL_CREATOR;
    public static final itb.a INSHOP_AUCTION_2020_LIST_CREATOR;
    public static final itb.a INSHOP_AUCTION_2020_WF_CREATOR;
    public static final itb.a TIPS_CREATOR;
    public static final itb.a XSL_AUCTION_CREATOR;

    static {
        kge.a(1765979786);
        TIPS_CREATOR = new itb.a() { // from class: tb.nux.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new b(R.layout.tbsearch_item_list_tip, bVar.f29303a, bVar.b, bVar.c, bVar.d, bVar.e, (a) bVar.f);
            }
        };
        CROSS_TIPS_CREATOR = new itb.a() { // from class: tb.nux.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new com.taobao.search.sf.widgets.list.listcell.crosstips.b(bVar.f29303a, bVar.b, bVar.c, bVar.d, bVar.e, (a) bVar.f);
            }
        };
        INSHOP_AUCTION_2020_LIST_CREATOR = new itb.a() { // from class: tb.nux.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new com.taobao.search.sf.widgets.list.listcell.inshopauction2020.b(R.layout.sf_tbsearch_item_list_improve_inshop_2021, bVar.f29303a, bVar.b, bVar.c, bVar.d, bVar.e, (a) bVar.f);
            }
        };
        INSHOP_AUCTION_2020_WF_CREATOR = new itb.a() { // from class: tb.nux.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new com.taobao.search.sf.widgets.list.listcell.inshopauction2020.b(R.layout.sf_tbsearch_item_mid_improve_inshop_2021, bVar.f29303a, bVar.b, bVar.c, bVar.d, bVar.e, (a) bVar.f);
            }
        };
        XSL_AUCTION_CREATOR = new itb.a() { // from class: tb.nux.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new com.taobao.search.jarvis.rcmd.cell.b(LayoutInflater.from(bVar.f29303a).inflate(R.layout.tbsearch_xsl_downgrade_auction_item, bVar.c, false), bVar.f29303a, bVar.b, bVar.d, bVar.e);
            }
        };
        DEFAULT_AUCTION_CELL_LIST_CREATOR = new itb.a() { // from class: tb.nux.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new com.taobao.search.sf.widgets.list.listcell.defaultauction.b(LayoutInflater.from(bVar.f29303a).inflate(R.layout.tbsearch_item_default_auction_list, bVar.c, false), bVar.f29303a, bVar.b, bVar.d, bVar.e);
            }
        };
        DEFAULT_AUCTION_CELL_WF_CREATOR = new itb.a() { // from class: tb.nux.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new com.taobao.search.sf.widgets.list.listcell.defaultauction.b(LayoutInflater.from(bVar.f29303a).inflate(R.layout.tbsearch_item_default_auction_wf, bVar.c, false), bVar.f29303a, bVar.b, bVar.d, bVar.e);
            }
        };
        DEFAULT_SHOP_CELL_CREATOR = new itb.a() { // from class: tb.nux.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new com.taobao.search.sf.widgets.list.listcell.defaultshop.b(LayoutInflater.from(bVar.f29303a).inflate(R.layout.tbsearch_item_default_shop, bVar.c, false), bVar.f29303a, bVar.b, bVar.d, bVar.e, (a) bVar.f);
            }
        };
    }
}
