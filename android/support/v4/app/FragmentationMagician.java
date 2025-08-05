package android.support.v4.app;

import java.util.List;
import java.util.concurrent.Callable;
import tb.kge;

/* loaded from: classes2.dex */
public class FragmentationMagician {
    static {
        kge.a(-270505137);
    }

    public static void executePendingTransactionsAllowingStateLoss(final FragmentManager fragmentManager) {
        hookStateSaved(fragmentManager, new Runnable() { // from class: android.support.v4.app.FragmentationMagician.4
            @Override // java.lang.Runnable
            public void run() {
                FragmentManager.this.executePendingTransactions();
            }
        });
    }

    public static List<Fragment> getActiveFragments(FragmentManager fragmentManager) {
        return fragmentManager.getFragments();
    }

    private static <T extends Boolean> T hookStateSaved(FragmentManager fragmentManager, Callable<T> callable) throws Exception {
        if (!(fragmentManager instanceof FragmentManagerImpl)) {
            return (T) false;
        }
        FragmentManagerImpl fragmentManagerImpl = (FragmentManagerImpl) fragmentManager;
        if (!isStateSaved(fragmentManager)) {
            return callable.call();
        }
        boolean z = fragmentManagerImpl.mStateSaved;
        boolean z2 = fragmentManagerImpl.mStopped;
        fragmentManagerImpl.mStateSaved = false;
        fragmentManagerImpl.mStopped = false;
        T call = callable.call();
        fragmentManagerImpl.mStopped = z2;
        fragmentManagerImpl.mStateSaved = z;
        return call;
    }

    private static void hookStateSaved(FragmentManager fragmentManager, Runnable runnable) {
        if (!(fragmentManager instanceof FragmentManagerImpl)) {
            return;
        }
        FragmentManagerImpl fragmentManagerImpl = (FragmentManagerImpl) fragmentManager;
        if (!isStateSaved(fragmentManager)) {
            runnable.run();
            return;
        }
        boolean z = fragmentManagerImpl.mStateSaved;
        boolean z2 = fragmentManagerImpl.mStopped;
        fragmentManagerImpl.mStateSaved = false;
        fragmentManagerImpl.mStopped = false;
        runnable.run();
        fragmentManagerImpl.mStopped = z2;
        fragmentManagerImpl.mStateSaved = z;
    }

    public static boolean isStateSaved(FragmentManager fragmentManager) {
        if (!(fragmentManager instanceof FragmentManagerImpl)) {
            return false;
        }
        try {
            return ((FragmentManagerImpl) fragmentManager).isStateSaved();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void popBackStackAllowingStateLoss(final FragmentManager fragmentManager) {
        hookStateSaved(fragmentManager, new Runnable() { // from class: android.support.v4.app.FragmentationMagician.1
            @Override // java.lang.Runnable
            public void run() {
                FragmentManager.this.popBackStack();
            }
        });
    }

    public static void popBackStackAllowingStateLoss(final FragmentManager fragmentManager, final String str, final int i) {
        hookStateSaved(fragmentManager, new Runnable() { // from class: android.support.v4.app.FragmentationMagician.3
            @Override // java.lang.Runnable
            public void run() {
                FragmentManager.this.popBackStackImmediate(str, i);
            }
        });
    }

    public static boolean popBackStackImmediateAllowingStateLoss(final FragmentManager fragmentManager) {
        try {
            return hookStateSaved(fragmentManager, new Callable<Boolean>() { // from class: android.support.v4.app.FragmentationMagician.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                /* renamed from: call */
                public Boolean mo31call() throws Exception {
                    return Boolean.valueOf(FragmentManager.this.popBackStackImmediate());
                }
            }).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
