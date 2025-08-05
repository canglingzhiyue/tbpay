package com.taobao.android.live.plugin.atype.flexalocal.good.tab;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.taolive.sdk.goodlist.i;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.hir;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodsMultiTabManager implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAB_TYPE_H5 = "h5";
    public static final String TAB_TYPE_NATIVE_DX = "nativeDX";
    public static final String TAB_TYPE_WEEX = "weex";
    private static boolean e;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c f13820a;
    private NativeDXTabBundle c;
    private final List<d> b = new ArrayList();
    private int d = 0;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13821a;
        public final GoodsLiveStateMutitabView.b b;

        static {
            kge.a(-288684014);
        }

        public a(boolean z, GoodsLiveStateMutitabView.b bVar) {
            this.f13821a = z;
            this.b = bVar;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(List<d> list, List<String> list2, int i);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void a(ViewPager viewPager, PagerAdapter pagerAdapter, ArrayList<VideoInfo.ExtraGoodsTabItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8400aec", new Object[]{this, viewPager, pagerAdapter, arrayList});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        }
    }

    static {
        kge.a(1097419899);
        kge.a(2095084149);
        e = true;
    }

    public GoodsMultiTabManager(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        this.f13820a = cVar;
        his.b("GoodsMultiTabManager", "[GoodsMultiTabManager] init");
        e = hir.B();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public NativeDXTabBundle a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NativeDXTabBundle) ipChange.ipc$dispatch("940f4b36", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public List<d> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a1db0338", new Object[]{this});
        }
        if (this.d < this.b.size()) {
            return this.b.get(this.d);
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void a(Map<String, String> map, List<View> list, Context context, ViewGroup viewGroup, a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f909f8", new Object[]{this, map, list, context, viewGroup, aVar, bVar});
            return;
        }
        this.b.clear();
        if (a(map, context, viewGroup, aVar)) {
            ArrayList arrayList = new ArrayList();
            for (d dVar : this.b) {
                if (dVar.tabFrameLayout != null) {
                    arrayList.add(dVar.tabFrameLayout);
                }
            }
            if (!arrayList.isEmpty()) {
                his.b("GoodsMultiTabManager", "[initMultiContainer] tempList is not empty");
                list.clear();
                list.addAll(arrayList);
            }
            if (list.isEmpty()) {
                his.b("GoodsMultiTabManager", "[initMultiContainer] frameList is empty, start back up plan");
                a(context, viewGroup, aVar);
                for (d dVar2 : this.b) {
                    list.add(dVar2.tabFrameLayout);
                }
            } else {
                his.b("GoodsMultiTabManager", "[initMultiContainer] 主线");
            }
            his.b("GoodsMultiTabManager", "[initMultiContainer] frameList size = " + list.size());
        } else {
            if (list.isEmpty()) {
                a(context, viewGroup, aVar);
            }
            for (d dVar3 : this.b) {
                list.add(dVar3.tabFrameLayout);
            }
        }
        if (bVar == null) {
            return;
        }
        his.b("GoodsMultiTabManager", "[initMultiContainer] initGoodsMultiTabSuccess");
        for (int i = 0; i < this.b.size(); i++) {
            his.b("GoodsMultiTabManager", "[initMultiContainer] index = " + i + ", tabBundle = " + this.b.get(i).toString());
        }
        List<String> h = h();
        int i2 = 0;
        while (true) {
            if (i2 >= this.b.size()) {
                i2 = 0;
                break;
            }
            d dVar4 = this.b.get(i2);
            if (dVar4 != null && dVar4.anchorTab) {
                break;
            }
            i2++;
        }
        bVar.a(this.b, h, i2);
    }

    private List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        if (this.b.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.b) {
            arrayList.add(dVar.title);
        }
        return arrayList;
    }

    private void a(Context context, ViewGroup viewGroup, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e277a98a", new Object[]{this, context, viewGroup, aVar});
            return;
        }
        his.b("GoodsMultiTabManager", "[initMultiContainer] 兜底支线");
        this.b.add(a(context, viewGroup, 0, null, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0381 A[Catch: Throwable -> 0x038c, TRY_LEAVE, TryCatch #0 {Throwable -> 0x038c, blocks: (B:13:0x0092, B:15:0x009e, B:17:0x00a4, B:18:0x00ad, B:20:0x00b3, B:22:0x00bb, B:23:0x00bf, B:26:0x00c6, B:27:0x00e4, B:47:0x0116, B:48:0x0151, B:51:0x0162, B:53:0x0194, B:55:0x01ce, B:54:0x01cc, B:56:0x01d5, B:57:0x01d9, B:59:0x01df, B:61:0x01ed, B:62:0x021a, B:64:0x0220, B:65:0x0224, B:67:0x022a, B:69:0x0238, B:73:0x029c, B:74:0x02a2, B:76:0x02a8, B:80:0x02b9, B:82:0x02c1, B:83:0x02c6, B:86:0x02d0, B:88:0x02fa, B:90:0x0300, B:92:0x030b, B:94:0x0311, B:96:0x031b, B:98:0x0321, B:121:0x0365, B:122:0x037b, B:123:0x0381, B:105:0x033d, B:108:0x0345, B:111:0x0350, B:70:0x0264, B:72:0x026a, B:29:0x00e8, B:32:0x00f2, B:35:0x00fc), top: B:132:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162 A[Catch: Throwable -> 0x038c, TRY_ENTER, TryCatch #0 {Throwable -> 0x038c, blocks: (B:13:0x0092, B:15:0x009e, B:17:0x00a4, B:18:0x00ad, B:20:0x00b3, B:22:0x00bb, B:23:0x00bf, B:26:0x00c6, B:27:0x00e4, B:47:0x0116, B:48:0x0151, B:51:0x0162, B:53:0x0194, B:55:0x01ce, B:54:0x01cc, B:56:0x01d5, B:57:0x01d9, B:59:0x01df, B:61:0x01ed, B:62:0x021a, B:64:0x0220, B:65:0x0224, B:67:0x022a, B:69:0x0238, B:73:0x029c, B:74:0x02a2, B:76:0x02a8, B:80:0x02b9, B:82:0x02c1, B:83:0x02c6, B:86:0x02d0, B:88:0x02fa, B:90:0x0300, B:92:0x030b, B:94:0x0311, B:96:0x031b, B:98:0x0321, B:121:0x0365, B:122:0x037b, B:123:0x0381, B:105:0x033d, B:108:0x0345, B:111:0x0350, B:70:0x0264, B:72:0x026a, B:29:0x00e8, B:32:0x00f2, B:35:0x00fc), top: B:132:0x0092 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.util.Map<java.lang.String, java.lang.String> r17, android.content.Context r18, android.view.ViewGroup r19, com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabManager.a r20) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabManager.a(java.util.Map, android.content.Context, android.view.ViewGroup, com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabManager$a):boolean");
    }

    /* loaded from: classes5.dex */
    public static class NativeDXTabBundle extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public GoodsLiveStateMutitabView stateMultiTabView;

        static {
            kge.a(-996118077);
        }

        public static /* synthetic */ Object ipc$super(NativeDXTabBundle nativeDXTabBundle, String str, Object... objArr) {
            if (str.hashCode() == -1983604863) {
                super.destroy();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public NativeDXTabBundle(int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
            super(i, extraGoodsTabItem);
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.d
        public void onHide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
                return;
            }
            GoodsLiveStateMutitabView goodsLiveStateMutitabView = this.stateMultiTabView;
            if (goodsLiveStateMutitabView == null) {
                return;
            }
            goodsLiveStateMutitabView.onHide();
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.d
        public void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            super.destroy();
            GoodsLiveStateMutitabView goodsLiveStateMutitabView = this.stateMultiTabView;
            if (goodsLiveStateMutitabView == null) {
                return;
            }
            goodsLiveStateMutitabView.destroy();
        }
    }

    private NativeDXTabBundle a(Context context, ViewGroup viewGroup, int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NativeDXTabBundle) ipChange.ipc$dispatch("7252b644", new Object[]{this, context, viewGroup, new Integer(i), extraGoodsTabItem, aVar, new Boolean(z)});
        }
        if (this.c == null) {
            this.c = a(context, viewGroup, i, extraGoodsTabItem, aVar);
        }
        if (z) {
            if (extraGoodsTabItem == null) {
                NativeDXTabBundle nativeDXTabBundle = this.c;
                nativeDXTabBundle.key = "nativeDX_宝贝";
                nativeDXTabBundle.tabType = "nativeDX";
                nativeDXTabBundle.anchorTab = true;
                nativeDXTabBundle.showTab = true;
            } else {
                this.c.tabType = extraGoodsTabItem.type;
                this.c.anchorTab = Boolean.parseBoolean(extraGoodsTabItem.anchorTab);
                this.c.showTab = Boolean.parseBoolean(extraGoodsTabItem.showTab);
                this.c.showTopBarType = extraGoodsTabItem.showTopBarType;
            }
        }
        return this.c;
    }

    public NativeDXTabBundle a(Context context, ViewGroup viewGroup, int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NativeDXTabBundle) ipChange.ipc$dispatch("b52e6dec", new Object[]{this, context, viewGroup, new Integer(i), extraGoodsTabItem, aVar});
        }
        NativeDXTabBundle nativeDXTabBundle = this.c;
        if (nativeDXTabBundle != null && nativeDXTabBundle.stateMultiTabView != null && this.c.tabFrameLayout != null) {
            his.b("GoodsMultiTabManager", "[initNativeDXContainer] this.nativeDXTabBundle.frameView != null && this.nativeDXTabBundle.tabFrameLayout != null");
            return this.c;
        }
        if (context == null) {
            his.b("GoodsMultiTabManager", "[initNativeDXContainer] context = null");
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        GoodsLiveStateMutitabView goodsLiveStateMutitabView = new GoodsLiveStateMutitabView(this.f13820a, aVar.f13821a);
        goodsLiveStateMutitabView.setTopDataObserver(aVar.b);
        frameLayout.addView(goodsLiveStateMutitabView);
        goodsLiveStateMutitabView.initData();
        this.c = new NativeDXTabBundle(i, extraGoodsTabItem);
        if (extraGoodsTabItem == null) {
            his.b("GoodsMultiTabManager", "[initNativeDXContainer] isLandscape = " + this.f13820a.r());
            NativeDXTabBundle nativeDXTabBundle2 = this.c;
            nativeDXTabBundle2.title = "宝贝口袋";
            nativeDXTabBundle2.key = "nativeDX_宝贝";
            nativeDXTabBundle2.tabType = "nativeDX";
            nativeDXTabBundle2.anchorTab = true;
            nativeDXTabBundle2.showTab = true;
        } else {
            this.c.title = extraGoodsTabItem.title;
            this.c.tabType = extraGoodsTabItem.type;
            this.c.anchorTab = Boolean.parseBoolean(extraGoodsTabItem.anchorTab);
            this.c.showTab = true;
        }
        NativeDXTabBundle nativeDXTabBundle3 = this.c;
        nativeDXTabBundle3.baseFrame = null;
        nativeDXTabBundle3.frameView = null;
        nativeDXTabBundle3.stateMultiTabView = goodsLiveStateMutitabView;
        nativeDXTabBundle3.tabFrameLayout = frameLayout;
        return nativeDXTabBundle3;
    }

    /* loaded from: classes5.dex */
    public static class WeexTabBundle extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(994241773);
        }

        public static /* synthetic */ Object ipc$super(WeexTabBundle weexTabBundle, String str, Object... objArr) {
            if (str.hashCode() == -1983604863) {
                super.destroy();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public WeexTabBundle(int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
            super(i, extraGoodsTabItem);
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.d
        public void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            super.destroy();
            if (this.baseFrame == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l() == null) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l();
        }
    }

    private void a(Context context, int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b2b80c", new Object[]{this, context, new Integer(i), extraGoodsTabItem});
            return;
        }
        if (context == null) {
            his.b("GoodsMultiTabManager", "[initWeexContainer] context = null");
        }
        if (extraGoodsTabItem == null) {
            his.b("GoodsMultiTabManager", "[initWeexContainer] tabItem = null");
            return;
        }
        extraGoodsTabItem.showTab = "true";
        if (!Boolean.parseBoolean(extraGoodsTabItem.showTab)) {
            his.b("GoodsMultiTabManager", "[initWeexContainer] showTab = false, key = " + d.createTabKey(extraGoodsTabItem));
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l() == null) {
            his.b("GoodsMultiTabManager", "[initWeexContainer] IWeexAuctionAdapter = null");
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l() == null) {
                his.b("GoodsMultiTabManager", "[initWeexContainer] WeexAuctionAdapter = null");
                return;
            }
            Object a2 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l().a(this.f13820a.f(), extraGoodsTabItem);
            if (a2 != null) {
                View a3 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l().a(a2);
                if (a3 == null) {
                    return;
                }
                his.b("GoodsMultiTabManager", "[initWeexContainer] frameView added");
                frameLayout.addView(a3);
                WeexTabBundle weexTabBundle = new WeexTabBundle(i, extraGoodsTabItem);
                weexTabBundle.url = extraGoodsTabItem.url;
                weexTabBundle.anchorTab = Boolean.parseBoolean(extraGoodsTabItem.anchorTab);
                weexTabBundle.showTab = true;
                weexTabBundle.showTopBarType = extraGoodsTabItem.showTopBarType;
                weexTabBundle.baseFrame = a2;
                weexTabBundle.frameView = a3;
                weexTabBundle.tabFrameLayout = frameLayout;
                this.b.add(weexTabBundle);
                return;
            }
            his.b("GoodsMultiTabManager", "[initWeexContainer] baseFrame = null");
        }
    }

    /* loaded from: classes5.dex */
    public static class H5TabBundle extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String url;

        static {
            kge.a(763008865);
        }

        public static /* synthetic */ Object ipc$super(H5TabBundle h5TabBundle, String str, Object... objArr) {
            if (str.hashCode() == -1983604863) {
                super.destroy();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public H5TabBundle(int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
            super(i, extraGoodsTabItem);
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.d
        public void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            super.destroy();
            if (this.baseFrame == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().q() == null) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().q().b(this.baseFrame);
        }
    }

    private void b(Context context, int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4347feb", new Object[]{this, context, new Integer(i), extraGoodsTabItem});
            return;
        }
        if (context == null) {
            his.b("GoodsMultiTabManager", "[initH5Container] context = null");
        }
        if (extraGoodsTabItem == null) {
            his.b("GoodsMultiTabManager", "[initH5Container] tabItem = null");
            return;
        }
        extraGoodsTabItem.showTab = "true";
        if (!Boolean.parseBoolean(extraGoodsTabItem.showTab)) {
            his.b("GoodsMultiTabManager", "[initH5Container] showTab = false, key = " + d.createTabKey(extraGoodsTabItem));
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().q() == null) {
            his.b("GoodsMultiTabManager", "[initH5Container] H5TabFrameAdapter = null");
            return;
        }
        i.a a2 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().q().a(this.f13820a.f(), extraGoodsTabItem, this.f13820a.r(), this.f13820a.s());
        if (a2 != null) {
            View a3 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().q().a(a2);
            if (a3 == null) {
                return;
            }
            his.b("GoodsMultiTabManager", "[initH5Container] frameView added");
            frameLayout.addView(a3);
            H5TabBundle h5TabBundle = new H5TabBundle(i, extraGoodsTabItem);
            h5TabBundle.url = extraGoodsTabItem.url;
            h5TabBundle.anchorTab = Boolean.parseBoolean(extraGoodsTabItem.anchorTab);
            h5TabBundle.showTab = true;
            h5TabBundle.showTopBarType = extraGoodsTabItem.showTopBarType;
            h5TabBundle.baseFrame = a2;
            h5TabBundle.frameView = a3;
            h5TabBundle.tabFrameLayout = frameLayout;
            this.b.add(h5TabBundle);
            return;
        }
        his.b("GoodsMultiTabManager", "[initH5Container] baseFrame = null");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.d;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.f13820a = null;
        for (d dVar : this.b) {
            if (dVar != null) {
                dVar.destroy();
            }
        }
        this.b.clear();
        this.c = null;
    }
}
