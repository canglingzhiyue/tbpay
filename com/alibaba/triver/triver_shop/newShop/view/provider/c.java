package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.support.v4.app.Fragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.cem;
import tb.jds;
import tb.kge;

/* loaded from: classes3.dex */
public class c implements cem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<JSONObject> f4011a;
    private final ArrayList<com.alibaba.triver.triver_shop.newShop.data.g> b;
    private final HashMap<Integer, ShopStandardFragment> c;

    static {
        kge.a(1099001952);
        kge.a(1166427008);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        q.d(shopDataParser, "shopDataParser");
        this.f4011a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = new HashMap<>();
        int i = 0;
        for (Object obj : shopDataParser.I()) {
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            if (obj instanceof JSONArray) {
                int i3 = 0;
                for (Object obj2 : (Iterable) obj) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p.b();
                    }
                    if (obj2 instanceof JSONObject) {
                        c().add(new com.alibaba.triver.triver_shop.newShop.data.g((JSONObject) obj2, shopDataParser, i, i3));
                        this.f4011a.add(obj2);
                    }
                    i3 = i4;
                }
            }
            i = i2;
        }
    }

    public final ArrayList<com.alibaba.triver.triver_shop.newShop.data.g> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this}) : this.b;
    }

    @Override // tb.cem
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b.size();
    }

    @Override // tb.cem
    public Fragment a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("91faf0fd", new Object[]{this, new Integer(i)});
        }
        ShopStandardFragment shopStandardFragment = this.c.get(Integer.valueOf(i));
        if (shopStandardFragment == null) {
            shopStandardFragment = new ShopStandardFragment();
            shopStandardFragment.setFragmentViewProvider(b(i));
        }
        this.c.put(Integer.valueOf(i), shopStandardFragment);
        return shopStandardFragment;
    }

    public a b(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3bf6115f", new Object[]{this, new Integer(i)});
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.get(i).g();
        if (g != null && g.t()) {
            z = true;
        }
        if (z) {
            com.alibaba.triver.triver_shop.newShop.data.g gVar = this.b.get(i);
            q.b(gVar, "tabBarItemDataModelList[position]");
            return new jds(gVar);
        }
        return new a(this.b.get(i));
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Iterator<com.alibaba.triver.triver_shop.newShop.data.g> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                return true;
            }
        }
        return false;
    }
}
