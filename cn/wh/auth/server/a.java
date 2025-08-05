package cn.wh.auth.server;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public OnWHResultDispatcherFragment f1736a;

    /* renamed from: cn.wh.auth.server.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0030a {
        void a(int i, int i2, Intent intent);
    }

    public a(Activity activity) {
        this.f1736a = a(activity);
    }

    private OnWHResultDispatcherFragment a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        OnWHResultDispatcherFragment a2 = a(fragmentManager);
        if (a2 == null) {
            OnWHResultDispatcherFragment onWHResultDispatcherFragment = new OnWHResultDispatcherFragment();
            fragmentManager.beginTransaction().add(onWHResultDispatcherFragment, OnWHResultDispatcherFragment.TAG).commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return onWHResultDispatcherFragment;
        }
        return a2;
    }

    private OnWHResultDispatcherFragment a(FragmentManager fragmentManager) {
        return (OnWHResultDispatcherFragment) fragmentManager.findFragmentByTag(OnWHResultDispatcherFragment.TAG);
    }

    public void a(Intent intent, InterfaceC0030a interfaceC0030a) {
        this.f1736a.a(intent, interfaceC0030a);
    }
}
