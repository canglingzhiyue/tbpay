package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import java.util.HashMap;
import java.util.List;
import tb.fjp;
import tb.kge;
import tb.mfl;
import tb.tip;

/* loaded from: classes6.dex */
public class b extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<FlexiblePageViewEntity> f14152a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;

    static {
        kge.a(1121481460);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public static /* synthetic */ int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ba515c55", new Object[]{bVar})).intValue() : bVar.f;
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910d99c6", new Object[]{bVar, jSONObject, new Boolean(z)});
        } else {
            bVar.a(jSONObject, z);
        }
    }

    public b(boolean z, boolean z2, int i, int i2, int i3) {
        this.g = true;
        this.g = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public void a(List<FlexiblePageViewEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f14152a = list;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        List<FlexiblePageViewEntity> list = this.f14152a;
        if (list != null) {
            this.f = i % list.size();
        } else {
            this.f = i;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<FlexiblePageViewEntity> list = this.f14152a;
        if (list == null) {
            return 0;
        }
        if (list.size() > 3) {
            return this.f14152a.size();
        }
        return this.f14152a.size() << 1;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        List<FlexiblePageViewEntity> list = this.f14152a;
        if (list != null && list.size() > 0) {
            List<FlexiblePageViewEntity> list2 = this.f14152a;
            return a(viewGroup, i, list2.get(i % list2.size()));
        }
        return new TextView(viewGroup.getContext());
    }

    private Object a(final ViewGroup viewGroup, final int i, final FlexiblePageViewEntity flexiblePageViewEntity) {
        FlexiblePageViewNormal flexiblePageViewPriceAnimation;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c01d2af4", new Object[]{this, viewGroup, new Integer(i), flexiblePageViewEntity});
        }
        if ("normal".equals(flexiblePageViewEntity.style)) {
            flexiblePageViewPriceAnimation = new FlexiblePageViewNormal(viewGroup.getContext());
        } else if ("priceAnimation".equals(flexiblePageViewEntity.style)) {
            flexiblePageViewPriceAnimation = new FlexiblePageViewPriceAnimation(viewGroup.getContext());
        } else {
            return new TextView(viewGroup.getContext());
        }
        flexiblePageViewPriceAnimation.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                mfl.a(viewGroup.getContext(), flexiblePageViewEntity.jumpUrl);
                b bVar = b.this;
                JSONObject jSONObject = flexiblePageViewEntity.clickMaidian;
                if (b.a(b.this) != i) {
                    z2 = false;
                }
                b.a(bVar, jSONObject, z2);
            }
        });
        flexiblePageViewPriceAnimation.setPageViewEntity(flexiblePageViewEntity);
        flexiblePageViewPriceAnimation.setEnableAutoJellyMarquee(this.g);
        if (i != 0) {
            z = false;
        }
        flexiblePageViewPriceAnimation.updateView(z, this.c, this.e, this.d);
        flexiblePageViewPriceAnimation.updateViewProgress(i == 0 ? 1.0f : 0.0f, i == 0 ? this.c : this.e, this.d);
        viewGroup.addView(flexiblePageViewPriceAnimation, new FrameLayout.LayoutParams(-1, -1));
        return flexiblePageViewPriceAnimation;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        List<FlexiblePageViewEntity> list = this.f14152a;
        if (list == null) {
            return;
        }
        list.size();
        this.f14152a.size();
    }

    private void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        String str = a.TAG;
        Log.e(str, "track4Click " + this.b);
        if (this.b || jSONObject == null) {
            return;
        }
        String string = jSONObject.getString("pageName");
        String string2 = jSONObject.getString("name");
        HashMap hashMap = new HashMap();
        hashMap.putAll(tip.a(jSONObject.getString("params")));
        hashMap.put(fjp.BIZ_CONTEXT_KEY_CARD_TYPE, z ? "open" : "close");
        k.b(string, string2, hashMap);
    }
}
