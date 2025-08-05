package tb;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cej extends FragmentPagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cem f26244a;

    static {
        kge.a(1760450334);
    }

    public static /* synthetic */ Object ipc$super(cej cejVar, String str, Object... objArr) {
        if (str.hashCode() == 705961164) {
            super.destroyItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cej(FragmentManager fm) {
        super(fm);
        q.d(fm, "fm");
    }

    public final cem a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cem) ipChange.ipc$dispatch("f032e33", new Object[]{this});
        }
        cem cemVar = this.f26244a;
        if (cemVar != null) {
            return cemVar;
        }
        q.b("shopPageProvider");
        throw null;
    }

    public final void a(cem cemVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34686ad", new Object[]{this, cemVar});
            return;
        }
        q.d(cemVar, "<set-?>");
        this.f26244a = cemVar;
    }

    @Override // android.support.v4.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("3c4466d5", new Object[]{this, new Integer(i)}) : a().a(i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : a().a();
    }

    @Override // android.support.v4.app.FragmentPagerAdapter, android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            super.destroyItem(viewGroup, i, obj);
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Fragment item = getItem(i);
        if (!(item instanceof ShopStandardFragment)) {
            return;
        }
        ((ShopStandardFragment) item).onFragmentSelected();
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        Fragment item = getItem(i);
        if (!(item instanceof ShopStandardFragment)) {
            return;
        }
        ((ShopStandardFragment) item).onFragmentUnSelected();
    }
}
