package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class HolderFragment extends Fragment implements ViewModelStoreOwner {
    public static final String HOLDER_TAG = "android.arch.lifecycle.state.StateProviderHolderFragment";
    private static final String LOG_TAG = "ViewModelStores";
    private static final HolderFragmentManager sHolderFragmentManager = new HolderFragmentManager();
    private ViewModelStore mViewModelStore = new ViewModelStore();

    /* loaded from: classes2.dex */
    static class HolderFragmentManager {
        private Map<Activity, HolderFragment> mNotCommittedActivityHolders = new HashMap();
        private Map<Fragment, HolderFragment> mNotCommittedFragmentHolders = new HashMap();
        private Application.ActivityLifecycleCallbacks mActivityCallbacks = new EmptyActivityLifecycleCallbacks() { // from class: android.arch.lifecycle.HolderFragment.HolderFragmentManager.1
            @Override // android.arch.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (((HolderFragment) HolderFragmentManager.this.mNotCommittedActivityHolders.remove(activity)) != null) {
                    Log.e(HolderFragment.LOG_TAG, "Failed to save a ViewModel for " + activity);
                }
            }
        };
        private boolean mActivityCallbacksIsAdded = false;
        private FragmentManager.FragmentLifecycleCallbacks mParentDestroyedCallback = new FragmentManager.FragmentLifecycleCallbacks() { // from class: android.arch.lifecycle.HolderFragment.HolderFragmentManager.2
            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                super.onFragmentDestroyed(fragmentManager, fragment);
                if (((HolderFragment) HolderFragmentManager.this.mNotCommittedFragmentHolders.remove(fragment)) != null) {
                    Log.e(HolderFragment.LOG_TAG, "Failed to save a ViewModel for " + fragment);
                }
            }
        };

        HolderFragmentManager() {
        }

        private static HolderFragment createHolderFragment(FragmentManager fragmentManager) {
            HolderFragment holderFragment = new HolderFragment();
            fragmentManager.beginTransaction().add(holderFragment, HolderFragment.HOLDER_TAG).commitAllowingStateLoss();
            return holderFragment;
        }

        private static HolderFragment findHolderFragment(FragmentManager fragmentManager) {
            if (!fragmentManager.isDestroyed()) {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag(HolderFragment.HOLDER_TAG);
                if (findFragmentByTag != null && !(findFragmentByTag instanceof HolderFragment)) {
                    throw new IllegalStateException("Unexpected fragment instance was returned by HOLDER_TAG");
                }
                return (HolderFragment) findFragmentByTag;
            }
            throw new IllegalStateException("Can't access ViewModels from onDestroy");
        }

        void holderFragmentCreated(Fragment fragment) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                this.mNotCommittedActivityHolders.remove(fragment.getActivity());
                return;
            }
            this.mNotCommittedFragmentHolders.remove(parentFragment);
            parentFragment.getFragmentManager().unregisterFragmentLifecycleCallbacks(this.mParentDestroyedCallback);
        }

        HolderFragment holderFragmentFor(Fragment fragment) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            HolderFragment findHolderFragment = findHolderFragment(childFragmentManager);
            if (findHolderFragment != null) {
                return findHolderFragment;
            }
            HolderFragment holderFragment = this.mNotCommittedFragmentHolders.get(fragment);
            if (holderFragment != null) {
                return holderFragment;
            }
            fragment.getFragmentManager().registerFragmentLifecycleCallbacks(this.mParentDestroyedCallback, false);
            HolderFragment createHolderFragment = createHolderFragment(childFragmentManager);
            this.mNotCommittedFragmentHolders.put(fragment, createHolderFragment);
            return createHolderFragment;
        }

        HolderFragment holderFragmentFor(FragmentActivity fragmentActivity) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            HolderFragment findHolderFragment = findHolderFragment(supportFragmentManager);
            if (findHolderFragment != null) {
                return findHolderFragment;
            }
            HolderFragment holderFragment = this.mNotCommittedActivityHolders.get(fragmentActivity);
            if (holderFragment != null) {
                return holderFragment;
            }
            if (!this.mActivityCallbacksIsAdded) {
                this.mActivityCallbacksIsAdded = true;
                fragmentActivity.getApplication().registerActivityLifecycleCallbacks(this.mActivityCallbacks);
            }
            HolderFragment createHolderFragment = createHolderFragment(supportFragmentManager);
            this.mNotCommittedActivityHolders.put(fragmentActivity, createHolderFragment);
            return createHolderFragment;
        }
    }

    public HolderFragment() {
        setRetainInstance(true);
    }

    public static HolderFragment holderFragmentFor(Fragment fragment) {
        return sHolderFragmentManager.holderFragmentFor(fragment);
    }

    public static HolderFragment holderFragmentFor(FragmentActivity fragmentActivity) {
        return sHolderFragmentManager.holderFragmentFor(fragmentActivity);
    }

    @Override // android.support.v4.app.Fragment, android.arch.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.mViewModelStore;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sHolderFragmentManager.holderFragmentCreated(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mViewModelStore.clear();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}
