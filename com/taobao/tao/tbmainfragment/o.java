package com.taobao.tao.tbmainfragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentationMagician;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.p;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.omh;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f21137a;
    private FragmentActivity b;
    private Handler c = new Handler(Looper.getMainLooper());

    static {
        kge.a(-1026431413);
    }

    public static /* synthetic */ void a(o oVar, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74938ee4", new Object[]{oVar, iSupportFragment, iSupportFragment2});
        } else {
            oVar.a(iSupportFragment, iSupportFragment2);
        }
    }

    public o(e eVar) {
        this.f21137a = eVar;
        this.b = (FragmentActivity) eVar;
    }

    public void a(FragmentManager fragmentManager, int i, ISupportFragment iSupportFragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f65bab", new Object[]{this, fragmentManager, new Integer(i), iSupportFragment, new Boolean(z), new Boolean(z2)});
            return;
        }
        a(i, iSupportFragment);
        String a2 = a(iSupportFragment.getClass().getName());
        p pVar = iSupportFragment.getSupportDelegate().d;
        if (pVar != null && pVar.f21139a != null) {
            a2 = pVar.f21139a;
        }
        a(fragmentManager, null, iSupportFragment, a2, true ^ z, null, z2, 10, true);
    }

    public void a(FragmentManager fragmentManager, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f9bd28", new Object[]{this, fragmentManager, iSupportFragment, iSupportFragment2, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            b(fragmentManager, iSupportFragment, iSupportFragment2, i, i2, i3);
        }
    }

    public void a(FragmentManager fragmentManager, FragmentActivity fragmentActivity) {
        ISupportFragment a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796475ea", new Object[]{this, fragmentManager, fragmentActivity});
        } else if (!FragmentationMagician.popBackStackImmediateAllowingStateLoss(fragmentManager) || (a2 = i.a(fragmentManager)) == null) {
        } else {
            a(a2);
            b.b(a2.asFragment(), fragmentActivity);
        }
    }

    public void a(String str, boolean z, FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0a9f90", new Object[]{this, str, new Boolean(z), fragmentManager, new Integer(i)});
        } else {
            b(a(str), z, fragmentManager, i);
        }
    }

    private void b(FragmentManager fragmentManager, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, int i, int i2, int i3) {
        String str;
        ArrayList<p.a> arrayList;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0eab07", new Object[]{this, fragmentManager, iSupportFragment, iSupportFragment2, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if ((i3 == 1 || i3 == 3) && iSupportFragment != null) {
            Fragment fragment = (Fragment) iSupportFragment;
            if (!fragment.isAdded()) {
                String str2 = fragment.getClass().getSimpleName() + " has not been attached yet! startForResult() converted to start()";
            } else {
                a(fragmentManager, fragment, (Fragment) iSupportFragment2, i);
            }
        }
        ISupportFragment a2 = a(iSupportFragment, fragmentManager);
        int i4 = a(iSupportFragment2.asFragment()).getInt("fragmentation_arg_container", 0);
        if (a2 == null && i4 == 0) {
            TLog.loge("Fragmentation", "There is no Fragment in the FragmentManager, maybe you need to call loadRootFragment()!");
            return;
        }
        if (a2 != null && i4 == 0) {
            a(a2.getSupportDelegate().c, iSupportFragment2);
        }
        String a3 = a(iSupportFragment2.getClass().getName());
        ArrayList<p.a> arrayList2 = null;
        p pVar = iSupportFragment2.getSupportDelegate().d;
        if (pVar != null) {
            if (pVar.f21139a != null) {
                a3 = pVar.f21139a;
            }
            boolean z2 = pVar.f;
            if (pVar.g != null) {
                arrayList2 = pVar.g;
            }
            str = a3;
            arrayList = arrayList2;
            z = z2;
        } else {
            str = a3;
            arrayList = null;
            z = false;
        }
        if (a(fragmentManager, a2, iSupportFragment2, str, i2)) {
            return;
        }
        a(fragmentManager, a2, iSupportFragment2, str, z, arrayList, false, i3, false);
    }

    private ISupportFragment a(ISupportFragment iSupportFragment, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISupportFragment) ipChange.ipc$dispatch("fb89dfbd", new Object[]{this, iSupportFragment, fragmentManager});
        }
        if (iSupportFragment == null) {
            return i.a(fragmentManager);
        }
        return i.a(fragmentManager, iSupportFragment.getSupportDelegate().c);
    }

    private void a(FragmentManager fragmentManager, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, String str, boolean z, List<p.a> list, boolean z2, int i, boolean z3) {
        int i2;
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f55045", new Object[]{this, fragmentManager, iSupportFragment, iSupportFragment2, str, new Boolean(z), list, new Boolean(z2), new Integer(i), new Boolean(z3)});
            return;
        }
        String a2 = a(str);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        boolean z4 = i == 0 || i == 1 || i == 2 || i == 3;
        Fragment asFragment = iSupportFragment == null ? null : iSupportFragment.asFragment();
        Fragment asFragment2 = iSupportFragment2.asFragment();
        Bundle a3 = a(asFragment2);
        if (list != null) {
            i2 = 1;
            a3.putBoolean("fragmentation_arg_is_shared_element", true);
            for (p.a aVar : list) {
                beginTransaction.addSharedElement(aVar.f21140a, aVar.b);
            }
        } else if (z4) {
            p pVar = iSupportFragment2.getSupportDelegate().d;
            if (pVar != null && pVar.b != Integer.MIN_VALUE) {
                beginTransaction.setCustomAnimations(pVar.b, pVar.c, pVar.d, pVar.e);
                a3.putInt("fragmentation_arg_custom_enter_anim", pVar.b);
                a3.putInt("fragmentation_arg_custom_exit_anim", pVar.e);
                a3.putInt("fragmentation_arg_custom_pop_exit_anim", pVar.c);
            } else if (i == 2) {
                beginTransaction.setTransition(0);
            } else {
                beginTransaction.setTransition(4097);
            }
            i2 = 1;
        } else {
            i2 = 1;
            a3.putInt("fragmentation_arg_root_status", 1);
        }
        if (iSupportFragment == null) {
            beginTransaction.replace(a3.getInt("fragmentation_arg_container"), asFragment2, a2);
            if (!z4) {
                beginTransaction.setTransition(4097);
                if (z2) {
                    i2 = 2;
                }
                a3.putInt("fragmentation_arg_root_status", i2);
            }
        } else if (z4) {
            beginTransaction.add(iSupportFragment.getSupportDelegate().c, asFragment2, a2);
            if (i != 2 && i != 3) {
                beginTransaction.hide(asFragment);
            }
        } else {
            beginTransaction.replace(iSupportFragment.getSupportDelegate().c, asFragment2, a2);
        }
        if (!z && i != 11) {
            beginTransaction.addToBackStack(a2);
        }
        if (!z3) {
            oVar = this;
            b.a(asFragment, oVar.b);
        } else {
            oVar = this;
        }
        oVar.a(fragmentManager, beginTransaction, z3);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        if (str.contains("@")) {
            return str;
        }
        return str + "@" + str.hashCode();
    }

    private void a(int i, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefdcebc", new Object[]{this, new Integer(i), iSupportFragment});
        } else {
            a(iSupportFragment.asFragment()).putInt("fragmentation_arg_container", i);
        }
    }

    private Bundle a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("e3e0af8e", new Object[]{this, fragment});
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return arguments;
        }
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return bundle;
    }

    private void a(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85f40fb", new Object[]{this, fragmentManager, fragmentTransaction, new Boolean(z)});
        } else if (z) {
            fragmentTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    private boolean a(FragmentManager fragmentManager, ISupportFragment iSupportFragment, final ISupportFragment iSupportFragment2, String str, int i) {
        final ISupportFragment b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50607702", new Object[]{this, fragmentManager, iSupportFragment, iSupportFragment2, str, new Integer(i)})).booleanValue();
        }
        if (iSupportFragment == null || (b = i.b(iSupportFragment2.getClass(), str, fragmentManager)) == null) {
            return false;
        }
        if (i == 1) {
            if (iSupportFragment2 == iSupportFragment || iSupportFragment2.getClass().getName().equals(iSupportFragment.getClass().getName())) {
                a(iSupportFragment2, b);
                return true;
            }
        } else if (i == 2) {
            b(a(str), false, fragmentManager, Integer.MAX_VALUE);
            this.c.post(new Runnable() { // from class: com.taobao.tao.tbmainfragment.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        o.a(o.this, iSupportFragment2, b);
                    }
                }
            });
            return true;
        }
        return false;
    }

    private void a(ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f460aa", new Object[]{this, iSupportFragment, iSupportFragment2});
            return;
        }
        Bundle bundle = iSupportFragment.getSupportDelegate().e;
        Bundle a2 = a((Fragment) iSupportFragment);
        if (a2.containsKey("fragmentation_arg_container")) {
            a2.remove("fragmentation_arg_container");
        }
        if (bundle != null) {
            a2.putAll(bundle);
        }
        iSupportFragment2.onNewBundle(a2);
    }

    private void a(FragmentManager fragmentManager, Fragment fragment, Fragment fragment2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0beaaca", new Object[]{this, fragmentManager, fragment, fragment2, new Integer(i)});
            return;
        }
        Bundle a2 = a(fragment2);
        ResultRecord resultRecord = new ResultRecord();
        resultRecord.requestCode = i;
        a2.putParcelable("fragment_arg_result_record", resultRecord);
        fragmentManager.putFragment(a2, "fragmentation_state_save_result", fragment);
    }

    private void b(String str, boolean z, FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca1791", new Object[]{this, str, new Boolean(z), fragmentManager, new Integer(i)});
            return;
        }
        String a2 = a(str);
        if (fragmentManager.findFragmentByTag(a2) == null) {
            TLog.loge("Fragmentation", "Pop failure! Can't find FragmentTag:" + a2 + " in the FragmentManager's Stack.");
            return;
        }
        List<Fragment> a3 = i.a(fragmentManager, a2, z);
        if (a3.isEmpty()) {
            return;
        }
        if (str.equals(a(TBMainFragment.class.getName())) && d.g()) {
            a(a2, fragmentManager, a3);
        } else {
            a(a2, fragmentManager, z ? 1 : 0);
        }
    }

    private void a(String str, FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611fba40", new Object[]{this, str, fragmentManager, new Integer(i)});
            return;
        }
        this.f21137a.getSupportDelegate().f21132a = true;
        FragmentationMagician.popBackStackAllowingStateLoss(fragmentManager, str, i);
        this.f21137a.getSupportDelegate().f21132a = false;
    }

    private void a(String str, FragmentManager fragmentManager, List<Fragment> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3a4414", new Object[]{this, str, fragmentManager, list});
            return;
        }
        try {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (findFragmentByTag == null) {
                TBMainLog.tlog("Fragmentation", "mockPopToMainFragmentWithAnim error: fragment is null");
                return;
            }
            this.f21137a.getSupportDelegate().f21132a = true;
            FragmentTransaction transition = fragmentManager.beginTransaction().setTransition(8194);
            for (Fragment fragment : list) {
                fragmentManager.popBackStack();
                transition.remove(fragment);
            }
            transition.show(findFragmentByTag);
            transition.setCustomAnimations(R.anim.h_fragment_enter, R.anim.h_fragment_exit);
            transition.commitAllowingStateLoss();
        } catch (Throwable th) {
            try {
                TBMainLog.tlog("Fragmentation", "mockPopToMainFragmentWithAnim error: " + th);
                omh.a("mockPopToMainFragmentWithAnim", th.toString());
            } finally {
                this.f21137a.getSupportDelegate().f21132a = false;
            }
        }
    }

    private void a(ISupportFragment iSupportFragment) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b68f989", new Object[]{this, iSupportFragment});
            return;
        }
        Bundle arguments = iSupportFragment.asFragment().getArguments();
        if (arguments == null) {
            return;
        }
        try {
            Uri uri = (Uri) arguments.getParcelable(s.KEY_FRAGMENT_URL);
            if (uri == null || (intent = this.b.getIntent()) == null) {
                return;
            }
            TLog.loge("Fragmentation", "into setData" + uri);
            intent.setData(uri);
        } catch (Throwable th) {
            Log.e("Fragmentation", "ee: " + th);
        }
    }
}
