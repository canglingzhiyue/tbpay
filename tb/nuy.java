package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.globaladdress.a;
import com.taobao.search.sf.widgets.list.promotionfilter.b;
import com.taobao.search.sf.widgets.onesearch.c;
import com.taobao.search.sf.widgets.preposefilter.d;

/* loaded from: classes8.dex */
public class nuy {
    public static final ise<irq, a> GLOBAL_ADDRESS_CREATOR;
    public static final ise<irq, ius> INSHOP_TOPBAR_CREATOR;
    public static final ise<irq, c> ONESEARCH_CREATOR;
    public static final ise<irq, ius<?, ?, ?>> PREPOSE_FILTER_CREATOR;
    public static final ise<irq, b> PROMOTION_FILTER_WIDGET_CREATOR;
    public static final ise<irq, ius<?, ?, ?>> RECYCLER_PREPOSE_FILTER_CREATOR;
    public static final ise<Void, nxg> TAB_PRESENTER_CREATOR;
    public static final ise<Void, nxh> TAB_VIEW_CREATOR;
    public static final ise<irq, ius> TOPBAR_CREATOR;

    static {
        kge.a(726741512);
        ONESEARCH_CREATOR = new ise<irq, c>() { // from class: tb.nuy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public c a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b8e64db", new Object[]{this, irqVar}) : new c(irqVar.c, irqVar.d, (com.taobao.search.sf.a) irqVar.e, irqVar.f, irqVar.g);
            }
        };
        TOPBAR_CREATOR = new ise<irq, ius>() { // from class: tb.nuy.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public ius a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("f4d63b2f", new Object[]{this, irqVar}) : new nxl(irqVar.c, irqVar.d, irqVar.e, irqVar.f, irqVar.g);
            }
        };
        PREPOSE_FILTER_CREATOR = new ise<irq, ius<?, ?, ?>>() { // from class: tb.nuy.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public ius<?, ?, ?> a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("f4d63b2f", new Object[]{this, irqVar}) : new d(irqVar.c, irqVar.d, (com.taobao.search.sf.a) irqVar.e, irqVar.f, irqVar.g);
            }
        };
        RECYCLER_PREPOSE_FILTER_CREATOR = new ise<irq, ius<?, ?, ?>>() { // from class: tb.nuy.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public ius<?, ?, ?> a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("f4d63b2f", new Object[]{this, irqVar}) : new com.taobao.search.sf.widgets.preposefilter.perf.a(irqVar.c, irqVar.d, (com.taobao.search.sf.a) irqVar.e, irqVar.f, irqVar.g);
            }
        };
        INSHOP_TOPBAR_CREATOR = new ise<irq, ius>() { // from class: tb.nuy.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public ius a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("f4d63b2f", new Object[]{this, irqVar}) : new nxl(irqVar.c, irqVar.d, (com.taobao.search.sf.a) irqVar.e, irqVar.f, irqVar.g);
            }
        };
        TAB_VIEW_CREATOR = new ise<Void, nxh>() { // from class: tb.nuy.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public nxh a(Void r4) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (nxh) ipChange.ipc$dispatch("2286a4f9", new Object[]{this, r4}) : new nxh();
            }
        };
        TAB_PRESENTER_CREATOR = new ise<Void, nxg>() { // from class: tb.nuy.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public nxg a(Void r4) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (nxg) ipChange.ipc$dispatch("2286a4da", new Object[]{this, r4}) : new nxg();
            }
        };
        PROMOTION_FILTER_WIDGET_CREATOR = new ise<irq, b>() { // from class: tb.nuy.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public b a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5b0cca1c", new Object[]{this, irqVar}) : new b(irqVar.c, irqVar.d, (com.taobao.search.sf.a) irqVar.e, irqVar.f, irqVar.g);
            }
        };
        GLOBAL_ADDRESS_CREATOR = new ise<irq, a>() { // from class: tb.nuy.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public a a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3f5cd95a", new Object[]{this, irqVar}) : new a(irqVar.c, irqVar.d, (com.taobao.search.sf.a) irqVar.e, irqVar.f, irqVar.g);
            }
        };
    }
}
