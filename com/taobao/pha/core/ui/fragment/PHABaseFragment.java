package com.taobao.pha.core.ui.fragment;

import android.support.v4.app.Fragment;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ngr;

/* loaded from: classes7.dex */
public class PHABaseFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_CHILD_ANIMATION_DURATION = 150;
    public static final String TAG;

    public static /* synthetic */ Object ipc$super(PHABaseFragment pHABaseFragment, String str, Object... objArr) {
        if (str.hashCode() == 1088398452) {
            return super.onCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(994148271);
        TAG = PHABaseFragment.class.getSimpleName();
    }

    @Override // android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        Fragment rootFragment = getRootFragment();
        if (!z && rootFragment != null && rootFragment.isRemoving()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
            long j = 150;
            if (getContext() != null && getContext().getResources() != null) {
                try {
                    j = getContext().getResources().getInteger(17694720);
                } catch (Exception unused) {
                    ngr.b(TAG, "No such resource id exist");
                }
            }
            alphaAnimation.setDuration(j);
            return alphaAnimation;
        }
        return super.onCreateAnimation(i, z, i2);
    }

    public Fragment getRootFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c31d45b1", new Object[]{this});
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof PHABaseFragment) {
            return ((PHABaseFragment) parentFragment).getRootFragment();
        }
        return parentFragment != null ? parentFragment : this;
    }
}
