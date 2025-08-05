package com.taobao.tao.tbmainfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.TBMainActivity;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes.dex */
public class SupportFragment extends Fragment implements ISupportFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SupportFragment";
    private static final CopyOnWriteArrayList<l> sLifecycleCallbacks;
    private boolean isLoaded;
    public SupportActivity mActivity;
    private boolean mViewChangeWhenVisibleChange;
    public final h mDelegate = new h(this);
    private boolean hasEnterAnimation = false;

    public static /* synthetic */ Object ipc$super(SupportFragment supportFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
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
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
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

    @Override // com.taobao.tao.tbmainfragment.ISupportFragment
    public Fragment asFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("41d3098b", new Object[]{this}) : this;
    }

    public void onFragmentResult(int i, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c27981", new Object[]{this, new Integer(i), new Integer(i2), bundle});
        }
    }

    @Override // com.taobao.tao.tbmainfragment.ISupportFragment
    public void onNewBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ef4a6a", new Object[]{this, bundle});
        }
    }

    public Animation onSupportCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("809d5243", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        return null;
    }

    public static /* synthetic */ void access$000(SupportFragment supportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461bfb43", new Object[]{supportFragment});
        } else {
            supportFragment.onEnterAnimationEnd();
        }
    }

    static {
        kge.a(1182808839);
        kge.a(-691403570);
        sLifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    @Override // com.taobao.tao.tbmainfragment.ISupportFragment
    public h getSupportDelegate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("2408b5a6", new Object[]{this}) : this.mDelegate;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        this.mDelegate.a(context);
        if (context instanceof SupportActivity) {
            this.mActivity = (SupportActivity) context;
        }
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentAttached(getFragmentManager(), this, context);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.mDelegate.a();
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentStarted(getFragmentManager(), this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        SupportActivity supportActivity = this.mActivity;
        if ((supportActivity instanceof TBMainActivity) && bundle != null && ABGlobal.isFeatureOpened(supportActivity, s.KEY_SET_CLASS_LOADER)) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        this.mDelegate.a(bundle);
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentCreated(getFragmentManager(), this, bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        this.mDelegate.c(bundle);
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentActivityCreated(getFragmentManager(), this, bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentViewCreated(getFragmentManager(), this, onCreateView, bundle);
        }
        return onCreateView;
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        this.mDelegate.b(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mDelegate.b();
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentResumed(getFragmentManager(), this);
        }
        if (this.hasEnterAnimation) {
            return;
        }
        realResume();
    }

    private void realResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("becbb672", new Object[]{this});
        } else if (this.isLoaded || isHidden()) {
        } else {
            lazyInit();
            this.isLoaded = true;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mDelegate.c();
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentPaused(getFragmentManager(), this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.mDelegate.d();
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentStopped(getFragmentManager(), this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        this.mDelegate.e();
        super.onDestroyView();
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentViewDestroyed(getFragmentManager(), this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mDelegate.f();
        super.onDestroy();
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentDestroyed(getFragmentManager(), this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        Iterator<l> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentDetached(getFragmentManager(), this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        this.mDelegate.a(z);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        this.mDelegate.b(z);
    }

    @Override // android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        Animation onSupportCreateAnimation = onSupportCreateAnimation(i, z, i2);
        if (onSupportCreateAnimation == null) {
            onSupportCreateAnimation = this.mDelegate.a(i, z, i2);
        }
        if (z) {
            if (onSupportCreateAnimation == null) {
                z2 = false;
            }
            this.hasEnterAnimation = z2;
        }
        if (z && onSupportCreateAnimation != null) {
            onSupportCreateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.tbmainfragment.SupportFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    } else {
                        SupportFragment.access$000(SupportFragment.this);
                    }
                }
            });
        }
        return onSupportCreateAnimation;
    }

    private void onEnterAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280cf617", new Object[]{this});
            return;
        }
        realResume();
        this.hasEnterAnimation = false;
    }

    public void onSupportVisible() {
        View view;
        ViewGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        TLog.loge(TAG, getClass().getSimpleName() + " onSupportVisible");
        if (!this.mViewChangeWhenVisibleChange || (view = getView()) == null || view.getParent() != null || getArguments() == null || (a2 = i.a(this.mActivity, this, getArguments().getInt("fragmentation_arg_container"))) == null) {
            return;
        }
        a2.addView(getView());
    }

    public void onSupportInvisible() {
        ViewGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        TLog.loge(TAG, getClass().getSimpleName() + " onSupportInvisible");
        if (!this.mViewChangeWhenVisibleChange || getArguments() == null || (a2 = i.a(this.mActivity, this, getArguments().getInt("fragmentation_arg_container"))) == null) {
            return;
        }
        a2.removeView(getView());
    }

    @Override // com.taobao.tao.tbmainfragment.ISupportFragment
    public final boolean isSupportVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acaff78", new Object[]{this})).booleanValue() : this.mDelegate.g();
    }

    public FragmentAnimator onCreateFragmentAnimator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentAnimator) ipChange.ipc$dispatch("c5eed56d", new Object[]{this}) : this.mDelegate.h();
    }

    public FragmentAnimator getFragmentAnimator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentAnimator) ipChange.ipc$dispatch("ce8bca08", new Object[]{this}) : this.mDelegate.i();
    }

    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a7c6a4", new Object[]{this, fragmentAnimator});
        } else {
            this.mDelegate.a(fragmentAnimator);
        }
    }

    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue() : this.mDelegate.j();
    }

    public void setFragmentResult(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570d6287", new Object[]{this, new Integer(i), bundle});
        } else {
            this.mDelegate.a(i, bundle);
        }
    }

    public void putNewBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12902f9a", new Object[]{this, bundle});
        } else {
            this.mDelegate.d(bundle);
        }
    }

    public boolean isViewChangeWhenVisiableChange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9db6f8f7", new Object[]{this})).booleanValue() : this.mViewChangeWhenVisibleChange;
    }

    public void setViewChangeWhenVisiableChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34bf009", new Object[]{this, new Boolean(z)});
        } else {
            this.mViewChangeWhenVisibleChange = z;
        }
    }

    public static void registerTBLifecycleCallbacks(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef1fbb1", new Object[]{lVar});
        } else {
            sLifecycleCallbacks.add(lVar);
        }
    }

    public static void unRegisterTBLifecycleCallbacks(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56dd0818", new Object[]{lVar});
        } else {
            sLifecycleCallbacks.remove(lVar);
        }
    }

    public void lazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
            return;
        }
        String str = "lazyInit: " + getClass().getSimpleName();
    }
}
