package com.taobao.android.live.plugin.atype.flexalocal.good.tab;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabManager;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.taolive.sdk.goodlist.i;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.hiq;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c f13823a;
    private final List<d> b;
    private int c = 0;

    static {
        kge.a(-730566114);
        kge.a(2095084149);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void a(Map<String, String> map, List<View> list, Context context, ViewGroup viewGroup, GoodsMultiTabManager.a aVar, GoodsMultiTabManager.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f909f8", new Object[]{this, map, list, context, viewGroup, aVar, bVar});
        }
    }

    public b(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, List<d> list) {
        this.f13823a = cVar;
        this.b = list;
        his.b("GLTabHelper", "[GLTabHelper] init");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r9 == 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r9 == 2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r7 = a(r12.f13823a.f(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
        r7 = b(r12.f13823a.f(), r7);
     */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.tab.b.a(java.util.Map):void");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void a(ViewPager viewPager, PagerAdapter pagerAdapter, ArrayList<VideoInfo.ExtraGoodsTabItem> arrayList) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8400aec", new Object[]{this, viewPager, pagerAdapter, arrayList});
        } else if (arrayList != null && arrayList.size() != 0 && pagerAdapter != null && !TextUtils.isEmpty(arrayList.get(0).type)) {
            ArrayList arrayList2 = new ArrayList();
            boolean z3 = false;
            for (int i = 0; i < arrayList.size(); i++) {
                VideoInfo.ExtraGoodsTabItem extraGoodsTabItem = arrayList.get(i);
                Iterator<d> it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    d next = it.next();
                    if (hiq.a(next.tabItem, extraGoodsTabItem)) {
                        arrayList2.add(next);
                        it.remove();
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    his.b("GLTabHelper", "refreshTab | createTab " + extraGoodsTabItem.type);
                    d a2 = a(extraGoodsTabItem);
                    if (a2 != null) {
                        arrayList2.add(a2);
                    }
                    z3 = true;
                }
            }
            if (!this.b.isEmpty() || z3) {
                z2 = false;
            }
            c();
            this.b.addAll(arrayList2);
            pagerAdapter.notifyDataSetChanged();
            if (z2) {
                return;
            }
            viewPager.setCurrentItem(0);
            this.c = 0;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public GoodsMultiTabManager.NativeDXTabBundle a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GoodsMultiTabManager.NativeDXTabBundle) ipChange.ipc$dispatch("940f4b36", new Object[]{this});
        }
        if (this.b.isEmpty()) {
            return null;
        }
        for (d dVar : this.b) {
            if (dVar instanceof GoodsMultiTabManager.NativeDXTabBundle) {
                return (GoodsMultiTabManager.NativeDXTabBundle) dVar;
            }
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public List<d> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a1db0338", new Object[]{this}) : a(this.c);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.c;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    private d a(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c6dc497a", new Object[]{this, extraGoodsTabItem});
        }
        String str = extraGoodsTabItem.type;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3277) {
            if (hashCode != 3645441) {
                if (hashCode == 2045685483 && str.equals("nativeDX")) {
                    c = 2;
                }
            } else if (str.equals("weex")) {
                c = 1;
            }
        } else if (str.equals("h5")) {
            c = 0;
        }
        if (c == 0) {
            return c(this.f13823a.f(), extraGoodsTabItem);
        }
        if (c == 1) {
            return b(this.f13823a.f(), extraGoodsTabItem);
        }
        if (c == 2) {
            return a(this.f13823a.f(), extraGoodsTabItem);
        }
        return null;
    }

    private GoodsMultiTabManager.NativeDXTabBundle a(Context context, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GoodsMultiTabManager.NativeDXTabBundle) ipChange.ipc$dispatch("c5b0d8bd", new Object[]{this, context, extraGoodsTabItem});
        }
        GoodsMultiTabManager.NativeDXTabBundle nativeDXTabBundle = new GoodsMultiTabManager.NativeDXTabBundle(0, extraGoodsTabItem);
        his.b("GLTabHelper", "[initNativeDXContainer].");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.f13823a;
        GoodsLiveStateMutitabView goodsLiveStateMutitabView = new GoodsLiveStateMutitabView(cVar, cVar.r());
        frameLayout.addView(goodsLiveStateMutitabView);
        goodsLiveStateMutitabView.initData();
        if (extraGoodsTabItem == null) {
            his.b("GLTabHelper", "[initNativeDXContainer] isLandscape = " + this.f13823a.r());
            nativeDXTabBundle.key = "nativeDX_宝贝";
            nativeDXTabBundle.tabType = "nativeDX";
        } else {
            nativeDXTabBundle.tabType = extraGoodsTabItem.type;
        }
        nativeDXTabBundle.baseFrame = null;
        nativeDXTabBundle.stateMultiTabView = goodsLiveStateMutitabView;
        nativeDXTabBundle.tabFrameLayout = frameLayout;
        nativeDXTabBundle.frameView = goodsLiveStateMutitabView;
        return nativeDXTabBundle;
    }

    private d b(Context context, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5d88e091", new Object[]{this, context, extraGoodsTabItem});
        }
        if (context == null || extraGoodsTabItem == null) {
            his.b("GLTabHelper", "[initWeexContainer] tabItem = null");
            return null;
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l() == null) {
            his.b("GLTabHelper", "[initWeexContainer] IWeexAuctionAdapter = null");
            return null;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l() == null) {
                his.b("GLTabHelper", "[initWeexContainer] WeexAuctionAdapter = null");
                return null;
            }
            Object a2 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l().a(this.f13823a.f(), extraGoodsTabItem);
            if (a2 != null) {
                View a3 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l().a(a2);
                if (a3 != null) {
                    his.b("GLTabHelper", "[initWeexContainer] frameView added");
                    frameLayout.addView(a3);
                    GoodsMultiTabManager.WeexTabBundle weexTabBundle = new GoodsMultiTabManager.WeexTabBundle(0, extraGoodsTabItem);
                    weexTabBundle.url = extraGoodsTabItem.url;
                    weexTabBundle.anchorTab = Boolean.parseBoolean(extraGoodsTabItem.anchorTab);
                    weexTabBundle.baseFrame = a2;
                    weexTabBundle.frameView = a3;
                    weexTabBundle.tabFrameLayout = frameLayout;
                    return weexTabBundle;
                }
            } else {
                his.b("GLTabHelper", "[initWeexContainer] baseFrame = null");
            }
            return null;
        }
    }

    private d c(Context context, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4b5143b0", new Object[]{this, context, extraGoodsTabItem});
        }
        if (context == null || extraGoodsTabItem == null) {
            his.b("GLTabHelper", "[initH5Container] tabItem = null");
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().q() == null) {
            his.b("GLTabHelper", "[initH5Container] H5TabFrameAdapter = null");
            return null;
        }
        i.a a2 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().q().a(this.f13823a.f(), extraGoodsTabItem, this.f13823a.r(), this.f13823a.s());
        if (a2 != null) {
            View a3 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().q().a(a2);
            if (a3 != null) {
                his.b("GLTabHelper", "[initH5Container] frameView added");
                frameLayout.addView(a3);
                GoodsMultiTabManager.H5TabBundle h5TabBundle = new GoodsMultiTabManager.H5TabBundle(0, extraGoodsTabItem);
                h5TabBundle.url = extraGoodsTabItem.url;
                h5TabBundle.showTopBarType = extraGoodsTabItem.showTopBarType;
                h5TabBundle.baseFrame = a2;
                h5TabBundle.frameView = a3;
                h5TabBundle.tabFrameLayout = frameLayout;
                return h5TabBundle;
            }
        } else {
            his.b("GLTabHelper", "[initH5Container] baseFrame = null");
        }
        return null;
    }

    private d a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d261fc46", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            his.b("GLTabHelper", "[findTabBundleByIndex] index < 0");
            return null;
        } else if (this.b.isEmpty()) {
            his.b("GLTabHelper", "[findTabBundleByIndex] tabBundles isEmpty");
            return null;
        } else if (i >= this.b.size()) {
            his.b("GLTabHelper", "[findTabBundleByIndex] index >= this.tabBundles.size()");
            return null;
        } else {
            try {
                return this.b.get(i);
            } catch (Exception e) {
                his.b("GLTabHelper", "[findTabBundleByIndex] error = " + e.getMessage());
                return null;
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.c
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (d dVar : this.b) {
            if (dVar != null) {
                his.b("GLTabHelper", "destroyTabs | bundle=" + dVar);
                dVar.destroy();
            }
        }
        this.b.clear();
    }
}
