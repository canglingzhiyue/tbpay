package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/* loaded from: classes2.dex */
public class ViewModelProviders {

    @Deprecated
    /* loaded from: classes2.dex */
    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        @Deprecated
        public DefaultFactory(Application application) {
            super(application);
        }
    }

    private static Activity checkActivity(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    private static Application checkApplication(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    public static ViewModelProvider of(Fragment fragment) {
        return new ViewModelProvider(ViewModelStores.of(fragment), ViewModelProvider.AndroidViewModelFactory.getInstance(checkApplication(checkActivity(fragment))));
    }

    public static ViewModelProvider of(Fragment fragment, ViewModelProvider.Factory factory) {
        checkApplication(checkActivity(fragment));
        return new ViewModelProvider(ViewModelStores.of(fragment), factory);
    }

    public static ViewModelProvider of(FragmentActivity fragmentActivity) {
        return new ViewModelProvider(ViewModelStores.of(fragmentActivity), ViewModelProvider.AndroidViewModelFactory.getInstance(checkApplication(fragmentActivity)));
    }

    public static ViewModelProvider of(FragmentActivity fragmentActivity, ViewModelProvider.Factory factory) {
        checkApplication(fragmentActivity);
        return new ViewModelProvider(ViewModelStores.of(fragmentActivity), factory);
    }
}
