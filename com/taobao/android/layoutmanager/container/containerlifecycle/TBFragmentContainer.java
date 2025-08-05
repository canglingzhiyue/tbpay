package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.e;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.l;
import com.taobao.tao.tbmainfragment.SupportFragment;
import com.taobao.tao.tbmainfragment.TBMainFragment;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import java.util.List;
import tb.kge;
import tb.oeb;

/* loaded from: classes5.dex */
public class TBFragmentContainer extends SupportFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c pageManager;
    private l.a shareViewInfo;

    static {
        kge.a(-1222792086);
    }

    public static /* synthetic */ Object ipc$super(TBFragmentContainer tBFragmentContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1615357278:
                return new Boolean(super.onBackPressedSupport());
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public FragmentAnimator getFragmentAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("ce8bca08", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public FragmentAnimator onCreateFragmentAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("c5eed56d", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ l access$000(TBFragmentContainer tBFragmentContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("f3176630", new Object[]{tBFragmentContainer}) : tBFragmentContainer.getFragmentContainer();
    }

    private l getFragmentContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("4c85960e", new Object[]{this});
        }
        try {
            List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
            if (fragments == null) {
                return null;
            }
            for (Fragment fragment : fragments) {
                if (fragment instanceof TBMainFragment) {
                    for (Fragment fragment2 : ((TBMainFragment) fragment).getChildFragmentManager().getFragments()) {
                        if (fragment2 instanceof l) {
                            return (l) fragment2;
                        }
                    }
                    continue;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void setSharedViewInfo(View view, List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f97922", new Object[]{this, view, list});
        } else {
            this.shareViewInfo = new l.a(view, list);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.pageManager == null) {
            String string = getArguments().getString("url");
            Bundle bundle2 = getArguments().getBundle("params");
            this.pageManager = new c(getActivity());
            this.pageManager.a(oeb.be());
            this.pageManager.a(true, this.shareViewInfo);
            c cVar = this.pageManager;
            l.a aVar = this.shareViewInfo;
            cVar.a(string, aVar != null ? aVar.b : null, bundle2);
            this.pageManager.a(new e.a() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.TBFragmentContainer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.container.e.a
                public void a(int i, f fVar) {
                    l access$000;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6f0cc1fb", new Object[]{this, new Integer(i), fVar});
                    } else if (i != 0 || (access$000 = TBFragmentContainer.access$000(TBFragmentContainer.this)) == null) {
                    } else {
                        access$000.pop();
                    }
                }
            });
        }
        return this.pageManager.c();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        c cVar = this.pageManager;
        if (cVar == null) {
            return;
        }
        cVar.f();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        c cVar = this.pageManager;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        c cVar = this.pageManager;
        if (cVar == null) {
            return;
        }
        if (isRemoving() || isDetached()) {
            z = true;
        }
        cVar.a(z);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        c cVar = this.pageManager;
        if (cVar == null) {
            return;
        }
        cVar.g();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        c cVar = this.pageManager;
        if (cVar != null) {
            cVar.i();
        }
        l fragmentContainer = getFragmentContainer();
        if (fragmentContainer != null) {
            fragmentContainer.onTBFragmentContainerDestroy();
        }
        resumeShareViewVisible();
    }

    private void resumeShareViewVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb7a202", new Object[]{this});
            return;
        }
        l.a aVar = this.shareViewInfo;
        if (aVar == null || aVar.b == null) {
            return;
        }
        for (Pair<View, String> pair : this.shareViewInfo.b) {
            ((View) pair.first).setVisibility(0);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        c cVar = this.pageManager;
        if (cVar != null && !cVar.h().isEmpty()) {
            this.pageManager.a(true, true);
            return true;
        }
        return super.onBackPressedSupport();
    }
}
