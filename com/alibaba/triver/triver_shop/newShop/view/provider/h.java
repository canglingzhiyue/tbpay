package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.support.v4.app.Fragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cem;
import tb.kge;

/* loaded from: classes3.dex */
public final class h implements cem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.view.embed.c f4016a;
    private final ArrayList<Fragment> b;
    private boolean c;
    private int d;
    private int e;

    static {
        kge.a(1256803209);
        kge.a(1166427008);
    }

    public h(com.alibaba.triver.triver_shop.newShop.view.embed.c swipeBigCardComponent) {
        q.d(swipeBigCardComponent, "swipeBigCardComponent");
        this.f4016a = swipeBigCardComponent;
        this.b = new ArrayList<>();
        JSONArray aT = this.f4016a.c().aT();
        this.d = aT == null ? 0 : aT.size();
        this.c = this.f4016a.k();
        int i = this.d;
        if (i == 1) {
            this.e = 1;
        } else if (i > 1) {
            this.e = this.c ? 2 : 1;
        }
        if (this.e == 1) {
            ArrayList<Fragment> arrayList = this.b;
            ShopStandardFragment shopStandardFragment = new ShopStandardFragment();
            shopStandardFragment.setFragmentViewProvider(new g(this.f4016a, 0, this.c));
            t tVar = t.INSTANCE;
            arrayList.add(shopStandardFragment);
            return;
        }
        ArrayList<Fragment> arrayList2 = this.b;
        ShopStandardFragment shopStandardFragment2 = new ShopStandardFragment();
        shopStandardFragment2.setFragmentViewProvider(new g(this.f4016a, 0, true));
        t tVar2 = t.INSTANCE;
        arrayList2.add(shopStandardFragment2);
        ArrayList<Fragment> arrayList3 = this.b;
        ShopStandardFragment shopStandardFragment3 = new ShopStandardFragment();
        shopStandardFragment3.setFragmentViewProvider(new g(this.f4016a, 1, false));
        t tVar3 = t.INSTANCE;
        arrayList3.add(shopStandardFragment3);
    }

    @Override // tb.cem
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.e;
    }

    @Override // tb.cem
    public Fragment a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("91faf0fd", new Object[]{this, new Integer(i)});
        }
        Fragment fragment = this.b.get(i);
        q.b(fragment, "fragments[position]");
        return fragment;
    }
}
