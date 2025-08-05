package com.taobao.tao.flexbox.layoutmanager.container;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.AbsContainerTransition;
import com.taobao.tao.flexbox.layoutmanager.container.h;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.oha;

/* loaded from: classes8.dex */
public abstract class f implements oha.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SHARE_TRANSITION_STATE_COMPLETED = 2;
    public static final int SHARE_TRANSITION_STATE_EXECUTING = 1;
    public static final int SHARE_TRANSITION_STATE_INIT = 0;
    public static final int STATE_CREATE = 0;
    public static final int STATE_DESTROY = 5;
    private static final int STATE_INIT = -1;
    public static final int STATE_PAUSE = 3;
    public static final int STATE_RESUME = 2;
    public static final int STATE_START = 1;
    public static final int STATE_STOP = 4;
    private Transition enterTransition;
    public boolean enterTransitionExecuted;
    private Transition exitTransition;
    private h pageTransition;
    private List<Runnable> pendingTasks;
    private Transition sharedElementEnterTransition;
    private Transition sharedElementReturnTransition;
    private List<Pair<View, String>> sharedViews;
    public n transition;
    public String url;
    private int pageState = -1;
    public volatile int shareElementTransitionExecuteState = 0;
    private volatile int pendingTaskCount = 0;
    private Object lock = new Object();

    static {
        kge.a(1624338131);
        kge.a(1214028227);
    }

    public abstract void finish(boolean z);

    public abstract Activity getActivity();

    public abstract View getContentView();

    public abstract View getDecorView();

    public abstract e getPageContainer();

    public ab getTNodeEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("11c783b4", new Object[]{this});
        }
        return null;
    }

    public abstract Object getUTObject();

    public void hideActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6efde2", new Object[]{this});
        }
    }

    public abstract boolean isFinishing();

    public boolean isFullPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2c98193", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract void onBackButtonClick();

    public abstract boolean onBackPressed(boolean z);

    public void onBeforeStartTransition(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc4f976", new Object[]{this, hVar, new Boolean(z)});
        }
    }

    public abstract void onWindowFocusChanged(boolean z);

    public abstract void postponedEnterTransition();

    public abstract void setIsFinishing();

    public abstract void setNavigationBarColor(int i);

    public abstract void setStatusBarColor(int i);

    public abstract void setTitle(String str);

    public void showActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422f6807", new Object[]{this});
        }
    }

    public abstract void startPostponedEnterTransition(View view);

    public static /* synthetic */ Object access$000(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cd1cb93b", new Object[]{fVar}) : fVar.lock;
    }

    public static /* synthetic */ int access$100(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e400fcb", new Object[]{fVar})).intValue() : fVar.pendingTaskCount;
    }

    public static /* synthetic */ int access$108(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68e2b9d3", new Object[]{fVar})).intValue();
        }
        int i = fVar.pendingTaskCount;
        fVar.pendingTaskCount = i + 1;
        return i;
    }

    public static /* synthetic */ int access$110(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f7662aa", new Object[]{fVar})).intValue();
        }
        int i = fVar.pendingTaskCount;
        fVar.pendingTaskCount = i - 1;
        return i;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
    }

    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            this.pageState = 0;
        }
    }

    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.pageState = 1;
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.pageState = 2;
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.pageState = 3;
        }
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.pageState = 4;
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.pageState = 5;
        }
    }

    public final boolean canMoveToState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2df6bcab", new Object[]{this, new Integer(i)})).booleanValue();
        }
        ogg.c("PageInterface", "currentState:" + this.pageState + "  newState:" + i);
        if (i == 0) {
            return this.pageState == -1;
        } else if (i == 1) {
            int i2 = this.pageState;
            return i2 == 0 || i2 == 4;
        } else if (i == 2) {
            int i3 = this.pageState;
            return i3 == 1 || i3 == 3;
        } else if (i == 3) {
            return this.pageState == 2;
        } else if (i != 4) {
            return i == 5 && this.pageState == 4;
        } else {
            int i4 = this.pageState;
            return i4 == 3 || i4 == 1;
        }
    }

    public boolean isRootPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f75b7236", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return getPageContainer().h().isEmpty();
        }
        return !getPageContainer().h().isEmpty() && getPageContainer().h().get(0) == this;
    }

    public boolean isEnterTransitionExecuted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3778f7fd", new Object[]{this})).booleanValue() : this.enterTransitionExecuted;
    }

    public n getTransitionInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("ace6abce", new Object[]{this}) : this.transition;
    }

    public List<Pair<View, String>> getCurrentSharedViews() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3696f15a", new Object[]{this}) : this.sharedViews;
    }

    public void setCurrentSharedViews(List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83544a", new Object[]{this, list});
        } else {
            this.sharedViews = list;
        }
    }

    public void setPageTransition(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab02126b", new Object[]{this, hVar});
        } else {
            this.pageTransition = hVar;
        }
    }

    public h getPageTransition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("b6d47c13", new Object[]{this}) : this.pageTransition;
    }

    public void setEnterTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb23200", new Object[]{this, transition});
            return;
        }
        this.enterTransition = transition;
        if (getPageContainer().a() || !getPageContainer().h().isEmpty()) {
            return;
        }
        getActivity().getWindow().setEnterTransition(transition);
    }

    public Transition getEnterTransition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Transition) ipChange.ipc$dispatch("75737160", new Object[]{this}) : this.enterTransition;
    }

    public void setExitTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c243936", new Object[]{this, transition});
            return;
        }
        this.exitTransition = transition;
        if (getPageContainer().a() || !getPageContainer().h().isEmpty()) {
            return;
        }
        getActivity().getWindow().setReturnTransition(transition);
    }

    public Transition getExitTransition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Transition) ipChange.ipc$dispatch("fb4a82d2", new Object[]{this}) : this.exitTransition;
    }

    public void setSharedElementReturnTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469a2ed1", new Object[]{this, transition});
            return;
        }
        Transition transition2 = this.sharedElementReturnTransition;
        if (transition2 != null) {
            if (transition2 instanceof TransitionSet) {
                ((TransitionSet) transition2).addTransition(transition);
            } else {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(this.sharedElementReturnTransition);
                transitionSet.addTransition(transition);
                this.sharedElementReturnTransition = transitionSet;
            }
        } else {
            this.sharedElementReturnTransition = transition;
        }
        if (transition instanceof AbsContainerTransition) {
            ((AbsContainerTransition) transition).setPageInterface(this);
        }
        if (getPageContainer().a() || !getPageContainer().h().isEmpty()) {
            return;
        }
        getActivity().getWindow().setSharedElementReturnTransition(this.sharedElementReturnTransition);
    }

    public Transition getSharedElementReturnTransition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Transition) ipChange.ipc$dispatch("f00cf16f", new Object[]{this}) : this.sharedElementReturnTransition;
    }

    public Transition getSharedElementEnterTransition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Transition) ipChange.ipc$dispatch("fcd720f5", new Object[]{this}) : this.sharedElementEnterTransition;
    }

    public void setSharedElementEnterTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803e8473", new Object[]{this, transition});
            return;
        }
        Transition transition2 = this.sharedElementEnterTransition;
        if (transition2 != null) {
            if (transition2 instanceof TransitionSet) {
                ((TransitionSet) transition2).addTransition(transition);
            } else {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(this.sharedElementEnterTransition);
                transitionSet.addTransition(transition);
                this.sharedElementEnterTransition = transitionSet;
            }
        } else {
            this.sharedElementEnterTransition = transition;
        }
        if (transition instanceof AbsContainerTransition) {
            ((AbsContainerTransition) transition).setPageInterface(this);
        }
        if (getPageContainer().a() || !getPageContainer().h().isEmpty()) {
            return;
        }
        getActivity().getWindow().setSharedElementEnterTransition(this.sharedElementEnterTransition);
    }

    public void setTransitionCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d7f3b", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            executePendingTasks();
            this.shareElementTransitionExecuteState = 2;
        }
    }

    public boolean isExecutingEnterTransition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("caf57a50", new Object[]{this})).booleanValue() : this.shareElementTransitionExecuteState == 1;
    }

    public void setExecutingEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5624a584", new Object[]{this});
        } else {
            this.shareElementTransitionExecuteState = 1;
        }
    }

    public boolean checkAndAddPendingTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6791d573", new Object[]{this, runnable})).booleanValue();
        }
        if (!isTransitionCompleted() && oeb.bf()) {
            if (this.pendingTasks == null) {
                this.pendingTasks = new ArrayList();
            }
            synchronized (this.lock) {
                if (isExecutingEnterTransition()) {
                    this.pendingTaskCount++;
                    this.pendingTasks.add(runnable);
                    return true;
                }
            }
        }
        return false;
    }

    private void executePendingTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb0aad3", new Object[]{this});
            return;
        }
        List<Runnable> list = this.pendingTasks;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        this.pendingTasks.clear();
    }

    public boolean isTransitionCompleted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d3ccd77", new Object[]{this})).booleanValue() : this.shareElementTransitionExecuteState == 2;
    }

    public void startNormalTransition(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1571967d", new Object[]{this, nVar});
        } else if (!this.enterTransitionExecuted && nVar != null) {
            this.enterTransitionExecuted = true;
            boolean z = !getPageContainer().a() && isRootPage(true);
            if (z && !(getActivity() instanceof o)) {
                n.a(getActivity(), nVar, false);
            } else {
                String[] strArr = nVar.f20267a;
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    Animator a2 = n.a(getDecorView(), str, nVar.e, nVar.c, nVar.g, false);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                if (arrayList.size() == 1) {
                    ((Animator) arrayList.get(0)).start();
                } else {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(nVar.e);
                    animatorSet.setInterpolator(nVar.c);
                    animatorSet.start();
                }
            }
            if (!z) {
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.container.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        f.this.getActivity().startPostponedEnterTransition();
                    }
                }
            });
        }
    }

    public boolean startExitTransition(final h.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18e11aa1", new Object[]{this, aVar})).booleanValue();
        }
        n nVar = this.transition;
        if (nVar != null) {
            if (nVar.a("share")) {
                return false;
            }
            if ((!getPageContainer().a() && isRootPage(true)) && !(getActivity() instanceof o)) {
                if (aVar != null) {
                    aVar.a();
                }
                n.a(getActivity(), this.transition, true);
            } else {
                String[] strArr = this.transition.b;
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    Animator a2 = n.a(getDecorView(), str, this.transition.e, this.transition.c, this.transition.g, true);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: com.taobao.tao.flexbox.layoutmanager.container.f.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                return;
                            }
                            h.a aVar2 = aVar;
                            if (aVar2 == null) {
                                return;
                            }
                            aVar2.a();
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                                return;
                            }
                            h.a aVar2 = aVar;
                            if (aVar2 == null) {
                                return;
                            }
                            aVar2.a();
                        }
                    };
                    if (arrayList.size() == 1) {
                        ((Animator) arrayList.get(0)).addListener(animatorListener);
                        ((Animator) arrayList.get(0)).start();
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(arrayList);
                        animatorSet.setDuration(this.transition.e);
                        animatorSet.setInterpolator(this.transition.c);
                        animatorSet.addListener(animatorListener);
                        animatorSet.start();
                    }
                } else if (aVar != null) {
                    aVar.a();
                }
            }
        } else if (aVar != null) {
            aVar.a();
        }
        return true;
    }

    public boolean enablePullScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e37df4d", new Object[]{this})).booleanValue();
        }
        n nVar = this.transition;
        return nVar != null && nVar.a(getActivity());
    }

    public boolean isSuitableForFragmentTransition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23a69dc8", new Object[]{this})).booleanValue() : getPageContainer().a() || getPageContainer().h().indexOf(this) > 0;
    }

    /* loaded from: classes8.dex */
    public static abstract class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private f f20258a;
        private boolean b;

        static {
            kge.a(1779338319);
            kge.a(-1390502639);
        }

        public a(Object obj, boolean z) {
            if (obj instanceof f) {
                this.f20258a = (f) obj;
            }
            this.b = z;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            f fVar = this.f20258a;
            if (fVar == null) {
                return;
            }
            synchronized (f.access$000(fVar)) {
                f.access$110(this.f20258a);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            f fVar = this.f20258a;
            if (fVar == null || this.b) {
                run();
                return;
            }
            synchronized (f.access$000(fVar)) {
                if (f.access$100(this.f20258a) > 0) {
                    f.access$108(this.f20258a);
                    this.f20258a.getTNodeEngine().D().post(this);
                    z = true;
                }
            }
            if (z) {
                return;
            }
            run();
        }
    }

    public static f findPageOfView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("7b51a10f", new Object[]{view});
        }
        if (view != null) {
            View view2 = null;
            while (true) {
                if (view.getId() != R.id.layout_manager_multi_page_container && view != null) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        view2 = view;
                        break;
                    }
                    View view3 = (View) parent;
                    view2 = view;
                    view = view3;
                } else {
                    break;
                }
            }
            if (view.getId() == R.id.layout_manager_multi_page_container && view2 != null && (view instanceof ViewGroup)) {
                return ((e) view.getTag()).b(((ViewGroup) view).indexOfChild(view2));
            }
        }
        return null;
    }
}
