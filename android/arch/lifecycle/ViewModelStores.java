package android.arch.lifecycle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/* loaded from: classes2.dex */
public class ViewModelStores {
    private ViewModelStores() {
    }

    public static ViewModelStore of(Fragment fragment) {
        return fragment instanceof ViewModelStoreOwner ? fragment.getViewModelStore() : HolderFragment.holderFragmentFor(fragment).getViewModelStore();
    }

    public static ViewModelStore of(FragmentActivity fragmentActivity) {
        return fragmentActivity instanceof ViewModelStoreOwner ? fragmentActivity.getViewModelStore() : HolderFragment.holderFragmentFor(fragmentActivity).getViewModelStore();
    }
}
