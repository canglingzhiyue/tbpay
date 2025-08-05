package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.support.v4.app.Fragment;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cel;
import tb.cem;
import tb.kge;

/* loaded from: classes3.dex */
public final class f implements cem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.data.f f4014a;
    private final Fragment[] b;

    static {
        kge.a(-911739990);
        kge.a(1166427008);
    }

    public f(com.alibaba.triver.triver_shop.newShop.data.f fVar) {
        this.f4014a = fVar;
        f fVar2 = this;
        com.alibaba.triver.triver_shop.newShop.data.f fVar3 = fVar2.f4014a;
        Fragment[] fragmentArr = null;
        if (fVar3 != null && fVar3.a() != 0) {
            int a2 = fVar2.f4014a.a();
            Fragment[] fragmentArr2 = new Fragment[a2];
            for (int i = 0; i < a2; i++) {
                ShopStandardFragment shopStandardFragment = new ShopStandardFragment();
                com.alibaba.triver.triver_shop.newShop.data.g a3 = fVar2.f4014a.a(i);
                if (a3 != null) {
                    shopStandardFragment.setFragmentViewProvider(new a(a3));
                }
                fragmentArr2[i] = shopStandardFragment;
            }
            fragmentArr = fragmentArr2;
        }
        this.b = fragmentArr;
    }

    public ShopStandardFragment a(cel celVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopStandardFragment) ipChange.ipc$dispatch("3b4bd96b", new Object[]{this, celVar}) : cem.a.a(this, celVar);
    }

    @Override // tb.cem
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        com.alibaba.triver.triver_shop.newShop.data.f fVar = this.f4014a;
        if (fVar != null) {
            return fVar.a();
        }
        return 0;
    }

    @Override // tb.cem
    public Fragment a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("91faf0fd", new Object[]{this, new Integer(i)});
        }
        Fragment[] fragmentArr = this.b;
        if (fragmentArr == null || i >= fragmentArr.length) {
            return a((cel) null);
        }
        return fragmentArr[i];
    }
}
