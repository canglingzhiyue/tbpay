package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cel;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopStandardFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cel fragmentViewProvider;
    private FrameLayout rootView;

    static {
        kge.a(2074758796);
    }

    public static /* synthetic */ Object ipc$super(ShopStandardFragment shopStandardFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ void access$createViewSafely(ShopStandardFragment shopStandardFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3edba5", new Object[]{shopStandardFragment});
        } else {
            shopStandardFragment.createViewSafely();
        }
    }

    public final cel getFragmentViewProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cel) ipChange.ipc$dispatch("e3b5e0f9", new Object[]{this}) : this.fragmentViewProvider;
    }

    public final void setFragmentViewProvider(cel celVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7712b915", new Object[]{this, celVar});
        } else {
            this.fragmentViewProvider = celVar;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        Context context = layoutInflater == null ? null : layoutInflater.getContext();
        if (context == null) {
            context = viewGroup == null ? null : viewGroup.getContext();
            if (context == null) {
                context = getContext();
            }
        }
        if (context == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = frameLayout;
        com.alibaba.triver.triver_shop.newShop.ext.o.g(frameLayout2);
        com.alibaba.triver.triver_shop.newShop.ext.o.k(frameLayout2);
        this.rootView = frameLayout;
        return this.rootView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        createViewSafely();
    }

    private final void createViewSafely() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4803f602", new Object[]{this});
        } else if (isAdded()) {
            createViewCommon();
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopStandardFragment$createViewSafely$1(this));
        }
    }

    private final void createViewCommon() {
        View a2;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2089193", new Object[]{this});
            return;
        }
        cel celVar = this.fragmentViewProvider;
        if (celVar == null || (a2 = celVar.a(getContext(), this)) == null || (frameLayout = this.rootView) == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout, a2);
    }

    public final void switchSubTabTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f15f3f8", new Object[]{this, new Integer(i)});
            return;
        }
        cel celVar = this.fragmentViewProvider;
        if (celVar == null) {
            return;
        }
        celVar.a(i);
    }

    public final int getCurrentSubTabIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0f96ed4", new Object[]{this})).intValue();
        }
        cel celVar = this.fragmentViewProvider;
        Integer valueOf = celVar == null ? null : Integer.valueOf(celVar.b());
        if (valueOf == null) {
            return 0;
        }
        valueOf.intValue();
        return valueOf.intValue();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        cel celVar = this.fragmentViewProvider;
        if (celVar == null) {
            return;
        }
        celVar.d();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        cel celVar = this.fragmentViewProvider;
        if (celVar == null) {
            return;
        }
        celVar.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        cel celVar = this.fragmentViewProvider;
        if (celVar == null) {
            return;
        }
        celVar.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    public final void onFragmentSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f28c91", new Object[]{this});
            return;
        }
        cel celVar = this.fragmentViewProvider;
        if (celVar == null) {
            return;
        }
        celVar.e();
    }

    public final void onFragmentUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53dcd20a", new Object[]{this});
            return;
        }
        cel celVar = this.fragmentViewProvider;
        if (celVar == null) {
            return;
        }
        celVar.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            return;
        }
        onFragmentUnSelected();
    }
}
