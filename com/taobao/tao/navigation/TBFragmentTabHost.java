package com.taobao.tao.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.res.ResourcesCompat;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.omi;
import tb.oml;
import tb.omo;
import tb.omr;
import tb.riy;

/* loaded from: classes.dex */
public class TBFragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBFragmentTabHost";
    private a exposureCallback;
    private boolean isUnset;
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private b mCurrentTab;
    private FragmentManager mFragmentManager;
    private HashMap<String, Fragment> mFragments;
    private boolean mFromLogin;
    private b mLastTab;
    private com.taobao.tao.navigation.b mLauncherTaskNotPreparedCallback;
    private com.taobao.tao.navigation.c mLoginCallback;
    private TabHost.OnTabChangeListener mOnTabChangeListener;
    private b mPreTab;
    private FrameLayout mRealTabContent;
    private FrameLayout mTabBackground;
    private View mTabDivide;
    private final ArrayList<b> mTabs;
    private NavigationTabIndicatorView.b tabIndicatorViewAbilityCallback;
    private final omi visibilityController;

    /* loaded from: classes.dex */
    public static class DummyTabFactory implements TabHost.TabContentFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Context mContext;

        public DummyTabFactory(Context context) {
            this.mContext = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("57322dd3", new Object[]{this, str});
            }
            View view = new View(this.mContext);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f20799a;
        public final Class<?> b;
        public final String c;
        public final Bundle d;
        public Fragment e;

        public b(String str, Class<?> cls, Bundle bundle) {
            this.f20799a = str;
            this.b = cls;
            this.d = bundle;
            this.c = null;
        }

        public b(String str, String str2, Bundle bundle) {
            this.f20799a = str;
            this.b = null;
            this.c = str2;
            this.d = bundle;
        }
    }

    public static /* synthetic */ Object ipc$super(TBFragmentTabHost tBFragmentTabHost, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1705336120:
                super.setVisibility(((Number) objArr[0]).intValue());
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 916363010:
                super.setOnTabChangedListener((TabHost.OnTabChangeListener) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1173054777:
                super.clearAllTabs();
                return null;
            case 1557018756:
                super.setup();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1755658430:
                super.setCurrentTab(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$000(TBFragmentTabHost tBFragmentTabHost) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("246af14a", new Object[]{tBFragmentTabHost})).booleanValue() : tBFragmentTabHost.mAttached;
    }

    public static /* synthetic */ void access$100(TBFragmentTabHost tBFragmentTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52438ba5", new Object[]{tBFragmentTabHost});
        } else {
            tBFragmentTabHost.updateTabWidgetIndicatorViews();
        }
    }

    public static /* synthetic */ void access$300(TBFragmentTabHost tBFragmentTabHost, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aaae07", new Object[]{tBFragmentTabHost, drawable});
        } else {
            tBFragmentTabHost.setTabWidgetBackgroundInternal(drawable);
        }
    }

    public void setExposureCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8a6f2b", new Object[]{this, aVar});
        } else {
            this.exposureCallback = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.taobao.tao.navigation.TBFragmentTabHost.SavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.tao.navigation.TBFragmentTabHost$SavedState] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.tao.navigation.TBFragmentTabHost$SavedState[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public SavedState a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("f1769f6", new Object[]{this, parcel}) : new SavedState(parcel);
            }

            public SavedState[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("cd9fe4a5", new Object[]{this, new Integer(i)}) : new SavedState[i];
            }
        };
        String curTab;
        boolean fromLogin;
        String preTab;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.curTab = parcel.readString();
            this.preTab = parcel.readString();
            this.fromLogin = parcel.readInt() != 1 ? false : true;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.curTab);
            parcel.writeString(this.preTab);
            parcel.writeInt(this.fromLogin ? 1 : 0);
        }

        public String toString() {
            return "TBFragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.curTab + riy.BLOCK_END_STR + " preTab=" + this.preTab + riy.BLOCK_END_STR;
        }
    }

    public TBFragmentTabHost(Context context) {
        super(context, null);
        this.mTabs = new ArrayList<>();
        this.mFromLogin = false;
        initFragmentTabHost(context, null);
        this.visibilityController = new omi(this);
        f.a();
    }

    public TBFragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabs = new ArrayList<>();
        this.mFromLogin = false;
        initFragmentTabHost(context, attributeSet);
        this.visibilityController = new omi(this);
        f.a();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        String a2 = com.taobao.tao.navigation.a.a();
        StringBuilder sb = new StringBuilder();
        sb.append("set visibility");
        if (i != 0) {
            z = false;
        }
        sb.append(z);
        TLog.loge(a2, TAG, sb.toString());
        super.setVisibility(i);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        String a2 = com.taobao.tao.navigation.a.a();
        StringBuilder sb = new StringBuilder();
        sb.append("onWindowVisibilityChanged is visibility ");
        if (i != 0) {
            z = false;
        }
        sb.append(z);
        TLog.loge(a2, TAG, sb.toString());
        super.onWindowVisibilityChanged(i);
        a aVar = this.exposureCallback;
        if (aVar == null || i != 0) {
            return;
        }
        aVar.a();
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5dce8a", new Object[]{this, context, attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.mContainerId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (context instanceof com.taobao.tao.navigation.c) {
            this.mLoginCallback = (com.taobao.tao.navigation.c) context;
        }
        super.setOnTabChangedListener(this);
    }

    private void ensureHierarchy(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cef7cea", new Object[]{this, context});
            return;
        }
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0, 0.0f);
            layoutParams.gravity = 80;
            linearLayout.addView(frameLayout, layoutParams);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.mRealTabContent = frameLayout2;
            this.mRealTabContent.setId(this.mContainerId);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setShowDividers(0);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.mTabBackground = (FrameLayout) findViewById(R.id.uik_navigation_tab_background);
        this.mTabDivide = findViewById(R.id.uik_navigation_tab_divide);
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setup(Context context, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71dc6b5", new Object[]{this, context, fragmentManager});
            return;
        }
        ensureHierarchy(context);
        super.setup();
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        ensureContent();
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.tao.navigation.TBFragmentTabHost.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1547495758) {
                    super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentResumed(FragmentManager fragmentManager2, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager2, fragment});
                    return;
                }
                super.onFragmentResumed(fragmentManager2, fragment);
                if (!TBFragmentTabHost.access$000(TBFragmentTabHost.this) || e.h() == null || !e.h().contains(fragment.getClass().getName())) {
                    return;
                }
                TBFragmentTabHost.access$100(TBFragmentTabHost.this);
            }
        }, false);
    }

    public void setup(Context context, FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9b82ee", new Object[]{this, context, fragmentManager, new Integer(i)});
            return;
        }
        ensureHierarchy(context);
        super.setup();
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        this.mContainerId = i;
        ensureContent();
        this.mRealTabContent.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.tao.navigation.TBFragmentTabHost.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -1547495758) {
                    super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentResumed(FragmentManager fragmentManager2, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager2, fragment});
                    return;
                }
                super.onFragmentResumed(fragmentManager2, fragment);
                if (!TBFragmentTabHost.access$000(TBFragmentTabHost.this) || e.h() == null || !e.h().contains(fragment.getClass().getName())) {
                    return;
                }
                TBFragmentTabHost.access$100(TBFragmentTabHost.this);
            }
        }, false);
    }

    public void unset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc464330", new Object[]{this});
        } else {
            this.isUnset = true;
        }
    }

    private void ensureContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3346d62", new Object[]{this});
        } else if (this.mRealTabContent != null) {
        } else {
            this.mRealTabContent = (FrameLayout) findViewById(this.mContainerId);
            if (this.mRealTabContent != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.mContainerId);
        }
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369e9702", new Object[]{this, onTabChangeListener});
        } else {
            this.mOnTabChangeListener = onTabChangeListener;
        }
    }

    @Override // android.widget.TabHost
    public void setCurrentTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a538be", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.isUnset) {
            omr.a(com.taobao.android.weex_framework.util.a.ATOM_EXT_unset, "setCurrentTab");
        }
        int currentTab = getCurrentTab();
        if (currentTab != getLastTab() && i == currentTab) {
            onTabChanged(this.mTabs.get(i).f20799a);
        } else {
            super.setCurrentTab(i);
        }
    }

    public void setLoginCallback(com.taobao.tao.navigation.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6beb66", new Object[]{this, cVar});
        } else {
            this.mLoginCallback = cVar;
        }
    }

    public void setTBLauncherTaskNotPreparedCallback(com.taobao.tao.navigation.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4801473", new Object[]{this, bVar});
        } else {
            this.mLauncherTaskNotPreparedCallback = bVar;
        }
    }

    public void addTab(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc949463", new Object[]{this, tabSpec, cls, bundle});
            return;
        }
        tabSpec.setContent(new DummyTabFactory(this.mContext));
        String tag = tabSpec.getTag();
        b bVar = new b(tag, cls, bundle);
        if (this.mAttached) {
            bVar.e = this.mFragmentManager.findFragmentByTag(tag);
            if (bVar.e != null && !bVar.e.isDetached()) {
                FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                beginTransaction.detach(bVar.e);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        this.mTabs.add(bVar);
        addTab(tabSpec);
    }

    public void addTab(TabHost.TabSpec tabSpec, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25d2e5e", new Object[]{this, tabSpec, str, bundle});
            return;
        }
        tabSpec.setContent(new DummyTabFactory(this.mContext));
        String tag = tabSpec.getTag();
        b bVar = new b(tag, str, bundle);
        Log.e(TAG, "mAttached:" + this.mAttached);
        if (this.mAttached) {
            bVar.e = this.mFragmentManager.findFragmentByTag(tag);
            if (bVar.e != null && !bVar.e.isDetached()) {
                FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                beginTransaction.detach(bVar.e);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        this.mTabs.add(bVar);
        addTab(tabSpec);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.taobao.tao.navigation.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        k.a(e.e());
        updateTabWidgetStyle();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransaction = null;
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.mTabs.get(i);
            bVar.e = this.mFragmentManager.findFragmentByTag(bVar.f20799a);
            if (bVar.e != null && !bVar.e.isDetached()) {
                if (bVar.f20799a.equals(currentTabTag)) {
                    this.mLastTab = bVar;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.mFragmentManager.beginTransaction();
                    }
                    fragmentTransaction.detach(bVar.e);
                }
            }
        }
        this.mAttached = true;
        b tabInfoForTag = getTabInfoForTag(currentTabTag);
        b bVar2 = this.mLastTab;
        if (bVar2 != tabInfoForTag) {
            if (e.e().get(getCurrentTab()).s() && (cVar = this.mLoginCallback) != null && !cVar.checkLogin()) {
                this.mLoginCallback.doLogin();
                return;
            }
            FragmentTransaction doTabChanged = doTabChanged(currentTabTag, fragmentTransaction);
            if (doTabChanged == null) {
                return;
            }
            doTabChanged.commitAllowingStateLoss();
            this.mFragmentManager.executePendingTransactions();
            return;
        }
        this.mCurrentTab = bVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mAttached = false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.curTab = getCurrentTabTag();
        b bVar = this.mPreTab;
        if (bVar != null) {
            savedState.preTab = bVar.f20799a;
        } else {
            savedState.preTab = null;
        }
        savedState.fromLogin = this.mFromLogin;
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            List<Fragment> fragments = this.mFragmentManager.getFragments();
            ArrayList<Fragment> arrayList = new ArrayList(fragments);
            Iterator<g> it = e.e().iterator();
            g gVar = null;
            g gVar2 = null;
            while (it.hasNext()) {
                g next = it.next();
                if (next.y().equals(savedState.curTab)) {
                    gVar = next;
                }
                if (next.y().equals(savedState.preTab)) {
                    gVar2 = next;
                }
                for (Fragment fragment : fragments) {
                    if (fragment.getTag().equals(next.y()) || fragment.getTag().equals("TBAutoSize.ConfigChangeObserver")) {
                        arrayList.remove(fragment);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                for (Fragment fragment2 : arrayList) {
                    beginTransaction.remove(fragment2);
                }
                beginTransaction.commitAllowingStateLoss();
            }
            if (gVar == null) {
                return;
            }
            if (savedState.fromLogin && this.mLoginCallback != null && gVar.s() && !this.mLoginCallback.checkLogin()) {
                if (gVar2 != null && !gVar2.s()) {
                    if (StringUtils.isEmpty(savedState.preTab)) {
                        return;
                    }
                    setCurrentTabByTag(savedState.preTab);
                    return;
                }
                setCurrentTab(0);
                return;
            }
            setCurrentTabByTag(savedState.curTab);
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        FragmentTransaction doTabChanged;
        com.taobao.tao.navigation.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        b tabInfoForTag = getTabInfoForTag(str);
        this.mPreTab = this.mCurrentTab;
        if (this.mLastTab == tabInfoForTag) {
            return;
        }
        com.taobao.tao.navigation.b bVar = this.mLauncherTaskNotPreparedCallback;
        if (bVar != null && !bVar.a()) {
            this.mLauncherTaskNotPreparedCallback.a(getTabInfoIndex(str));
        } else if (e.e().get(getCurrentTab()).s() && (cVar = this.mLoginCallback) != null && !cVar.checkLogin()) {
            this.mLoginCallback.doLogin();
        } else {
            if (this.mAttached && (doTabChanged = doTabChanged(str, null)) != null) {
                doTabChanged.commitAllowingStateLoss();
            }
            TabHost.OnTabChangeListener onTabChangeListener = this.mOnTabChangeListener;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            if (e.g != null && !e.g.isEmpty()) {
                Iterator<d> it = e.g.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    next.onTabChanged(getCurrentTab(), str);
                    Log.e(TAG, "onTabChanged: " + (SystemClock.uptimeMillis() - uptimeMillis2) + "  " + next);
                }
            }
            String a2 = com.taobao.tao.navigation.a.a();
            TLog.loge(a2, TAG, "onTabChanged, function total time: " + (SystemClock.uptimeMillis() - uptimeMillis));
            NavigationTabIndicatorView currentTabView = getCurrentTabView();
            if (currentTabView == null) {
                return;
            }
            String a3 = com.taobao.tao.navigation.a.a();
            TLog.loge(a3, TAG, "tab change from click total time: " + (SystemClock.uptimeMillis() - currentTabView.mClickTime));
        }
    }

    private FragmentTransaction doTabChanged(String str, FragmentTransaction fragmentTransaction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("c86698db", new Object[]{this, str, fragmentTransaction});
        }
        b tabInfoForTag = getTabInfoForTag(str);
        g gVar = e.e().get(this.mTabs.indexOf(tabInfoForTag));
        if (gVar != null) {
            if (!"逛逛".equals(gVar.c())) {
                setUnSeletedNavigationTabsColorFilter(-1, null, null);
            }
            if (!f.d()) {
                com.android.tools.ir.runtime.c.a(gVar.t(), null);
            }
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(gVar.h());
        }
        if (this.mLastTab != tabInfoForTag) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.mFragmentManager.beginTransaction();
            }
            b bVar = this.mLastTab;
            if (bVar != null && bVar.e != null) {
                fragmentTransaction.detach(this.mLastTab.e);
            }
            if (tabInfoForTag != null) {
                if (tabInfoForTag.e == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    tabInfoForTag.e = Fragment.instantiate(this.mContext, StringUtils.isEmpty(tabInfoForTag.c) ? tabInfoForTag.b.getName() : tabInfoForTag.c, tabInfoForTag.d);
                    com.taobao.tao.navigation.a.a(tabInfoForTag.e, "CONSTRUCT_PAGE_TIME", uptimeMillis);
                    if (this.mFragments == null) {
                        this.mFragments = new HashMap<>();
                    }
                    this.mFragments.put(tabInfoForTag.f20799a, tabInfoForTag.e);
                    fragmentTransaction.add(this.mContainerId, tabInfoForTag.e, tabInfoForTag.f20799a);
                } else {
                    fragmentTransaction.attach(tabInfoForTag.e);
                }
            }
            this.mCurrentTab = tabInfoForTag;
            this.mLastTab = tabInfoForTag;
        }
        return fragmentTransaction;
    }

    private b getTabInfoForTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("183e55be", new Object[]{this, str});
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.mTabs.get(i);
            if (bVar.f20799a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    private int getTabInfoIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31715be9", new Object[]{this, str})).intValue();
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            if (this.mTabs.get(i).f20799a.equals(str)) {
                return i;
            }
        }
        return 0;
    }

    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
        }
        b bVar = this.mCurrentTab;
        if (bVar == null) {
            return null;
        }
        return bVar.e;
    }

    public ArrayList<Fragment> getFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("52bc814e", new Object[]{this});
        }
        HashMap<String, Fragment> hashMap = this.mFragments;
        if (hashMap != null && hashMap.size() > 0) {
            return new ArrayList<>(this.mFragments.values());
        }
        return null;
    }

    public Fragment getFragmentForTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("ebda5a2a", new Object[]{this, str});
        }
        HashMap<String, Fragment> hashMap = this.mFragments;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(str);
    }

    @Override // android.widget.TabHost
    public NavigationTabIndicatorView getCurrentTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIndicatorView) ipChange.ipc$dispatch("557506f9", new Object[]{this});
        }
        if (getTabWidget() != null) {
            return (NavigationTabIndicatorView) getTabWidget().getChildTabViewAt(getCurrentTab());
        }
        return null;
    }

    public NavigationTabIndicatorView getTabViewAtIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIndicatorView) ipChange.ipc$dispatch("649b58d6", new Object[]{this, new Integer(i)});
        }
        if (getTabWidget() != null && i >= 0) {
            return (NavigationTabIndicatorView) getTabWidget().getChildTabViewAt(i);
        }
        return null;
    }

    public int getLastTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed77c8e3", new Object[]{this})).intValue() : this.mTabs.indexOf(this.mPreTab);
    }

    private NavigationTabIndicatorView.b getTabIndicatorViewAbilityCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIndicatorView.b) ipChange.ipc$dispatch("25a23618", new Object[]{this});
        }
        if (this.tabIndicatorViewAbilityCallback == null) {
            this.tabIndicatorViewAbilityCallback = new c();
        }
        return this.tabIndicatorViewAbilityCallback;
    }

    public View createIndicatorView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d865b3e6", new Object[]{this, new Integer(i)});
        }
        NavigationTabIndicatorView navigationTabIndicatorView = new NavigationTabIndicatorView(getContext());
        navigationTabIndicatorView.updateStyle(e.e().get(i), e.c, false, false);
        navigationTabIndicatorView.mTabHost = this;
        navigationTabIndicatorView.tabIndicatorViewAbilityCallback = getTabIndicatorViewAbilityCallback();
        return navigationTabIndicatorView;
    }

    public void preloadIndicatorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8e0cd2", new Object[]{this});
        } else if (!f.b(this.mContext)) {
            TLog.loge(com.taobao.tao.navigation.a.a(), TAG, "cancel pre load indicator view, due to switch off");
        } else {
            TabWidget tabWidget = getTabWidget();
            if (tabWidget == null) {
                return;
            }
            final ArrayList arrayList = new ArrayList(5);
            for (int i = 0; i < tabWidget.getChildCount(); i++) {
                arrayList.add((NavigationTabIndicatorView) tabWidget.getChildTabViewAt(i));
            }
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.navigation.TBFragmentTabHost.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (NavigationTabIndicatorView navigationTabIndicatorView : arrayList) {
                        if (navigationTabIndicatorView != null) {
                            navigationTabIndicatorView.preloadDrawable();
                        }
                    }
                    TLog.loge(com.taobao.tao.navigation.a.a(), TBFragmentTabHost.TAG, "preload indicator view finished");
                }
            });
        }
    }

    public void updateTabWidgetStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be86428", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(i.b)) {
            com.taobao.phenix.intf.b.h().a(getContext()).a(i.b).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.navigation.TBFragmentTabHost.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                        i.f20806a = succPhenixEvent.getDrawable();
                        i.b = null;
                        TBFragmentTabHost.access$300(TBFragmentTabHost.this, i.f20806a);
                    } else {
                        TBFragmentTabHost.access$300(TBFragmentTabHost.this, i.f20806a);
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.navigation.TBFragmentTabHost.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    TBFragmentTabHost.access$300(TBFragmentTabHost.this, i.f20806a);
                    return true;
                }
            }).fetch();
        } else {
            setTabWidgetBackgroundInternal(i.f20806a);
        }
        View view = this.mTabDivide;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i.c);
    }

    private void setTabWidgetBackgroundInternal(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a58d88d", new Object[]{this, drawable});
            return;
        }
        FrameLayout frameLayout = this.mTabBackground;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setBackground(drawable);
    }

    private void updateTabWidgetIndicatorViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e03636", new Object[]{this});
        } else if (getTabWidget() != null) {
            for (int i = 0; i < getTabWidget().getTabCount(); i++) {
                NavigationTabIndicatorView navigationTabIndicatorView = (NavigationTabIndicatorView) getTabWidget().getChildAt(i);
                if (navigationTabIndicatorView != null) {
                    if (i == getCurrentTab()) {
                        if (!navigationTabIndicatorView.getSelected()) {
                            navigationTabIndicatorView.setSelect(true, false);
                        }
                    } else if (navigationTabIndicatorView.getSelected()) {
                        navigationTabIndicatorView.setSelect(false, false);
                    }
                }
            }
        }
    }

    public void fromLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeff0ae", new Object[]{this, new Boolean(z)});
        } else {
            this.mFromLogin = z;
        }
    }

    @Override // android.widget.TabHost
    public void clearAllTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb6539", new Object[]{this});
            return;
        }
        super.clearAllTabs();
        this.mLastTab = null;
        this.mPreTab = null;
        try {
            Iterator<b> it = this.mTabs.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next.e != null) {
                    this.mFragmentManager.beginTransaction().remove(next.e).commitNow();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mTabs.clear();
    }

    public void clearAllTabsWithoutFramgent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fedc0aa", new Object[]{this, new Integer(i)});
            return;
        }
        super.clearAllTabs();
        if (this.isUnset) {
            omr.a("isUnset", "clearAllTabsWithoutFramgent");
        }
        this.mLastTab = null;
        this.mPreTab = null;
        for (int i2 = 0; i2 < 5; i2++) {
            Fragment fragment = this.mTabs.get(i2).e;
            if (fragment != null) {
                g gVar = e.e().get(i2);
                if (!fragment.getClass().getName().equals(gVar.k())) {
                    this.mFragmentManager.beginTransaction().remove(fragment).add(this.mContainerId, Fragment.instantiate(this.mContext, gVar.k(), gVar.v() == null ? new Bundle() : gVar.v()), gVar.y()).commitNowAllowingStateLoss();
                }
            }
        }
        this.mTabs.clear();
    }

    public FragmentManager getFragmentManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("8c88dd79", new Object[]{this}) : this.mFragmentManager;
    }

    private void setAndUpdateNavigationStyle(Integer num) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2686d1", new Object[]{this, num});
        } else if (!(i.f20806a instanceof ColorDrawable)) {
        } else {
            int intValue = num == null ? -1 : num.intValue();
            Context context = getContext();
            if (num == null && context != null) {
                try {
                    i = ResourcesCompat.getColor(context.getResources(), R.color.uik_divider_color, null);
                } catch (Resources.NotFoundException e) {
                    TLog.loge("uikit_navigation", TAG, "setAndUpdateNavigationStyle", e);
                }
            }
            i.f20806a = new ColorDrawable(intValue);
            i.c = i;
            setTabWidgetBackgroundInternal(i.f20806a);
            View view = this.mTabDivide;
            if (view != null) {
                view.setBackgroundColor(i.c);
            }
            if (!(context instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) context;
            setNavigationBarColor(activity, intValue);
            setNavigationBarButtonsColor(activity, intValue);
        }
    }

    private void setTabsUnselectedDrawableColorFilter(int i, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847d6be4", new Object[]{this, new Integer(i), num});
        } else {
            setTabDrawableColorFilterInner(i, num, false);
        }
    }

    private void setTabSelectedDrawableColorFilter(int i, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b536376a", new Object[]{this, new Integer(i), num});
        } else {
            setTabDrawableColorFilterInner(i, num, true);
        }
    }

    private void setTabDrawableColorFilterInner(int i, Integer num, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b368400d", new Object[]{this, new Integer(i), num, new Boolean(z)});
            return;
        }
        Iterator<g> it = e.e().iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (i != next.o()) {
                NavigationTabIndicatorView navigationTabIndicatorView = (NavigationTabIndicatorView) getTabWidget().getChildAt(next.o());
                if (navigationTabIndicatorView == null) {
                    return;
                }
                if (z) {
                    navigationTabIndicatorView.setSelectedDrawableColorFilter(num);
                } else {
                    navigationTabIndicatorView.setUnselectedDrawableColorFilter(num);
                }
            }
        }
    }

    public synchronized void setUnSeletedNavigationTabsColorFilter(int i, Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff720", new Object[]{this, new Integer(i), num, num2});
            return;
        }
        String a2 = com.taobao.tao.navigation.a.a();
        TLog.loge(a2, TAG, "setUnselectedNavigationTabsColorFilter index: " + i + " iconColorFilter: " + num + " backgroundColorFilter: " + num2);
        setTabsUnselectedDrawableColorFilter(i, num);
        setAndUpdateNavigationStyle(num2);
    }

    public void setTabsColorFilter(Integer num, Integer num2, Integer num3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580f5d75", new Object[]{this, num, num2, num3});
            return;
        }
        String a2 = com.taobao.tao.navigation.a.a();
        TLog.loge(a2, TAG, "setTabsColorFilter selectedIconColorFilter: " + num + " unselectedIconColorFilter: " + num2 + " backgroundColorFilter: " + num3);
        setTabsUnselectedDrawableColorFilter(-1, num2);
        setTabSelectedDrawableColorFilter(-1, num);
        setAndUpdateNavigationStyle(num3);
    }

    private void setNavigationBarColor(Activity activity, int i) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4ec884", new Object[]{this, activity, new Integer(i)});
        } else if (activity == null || (window = activity.getWindow()) == null) {
        } else {
            window.setNavigationBarColor(i);
        }
    }

    private void setNavigationBarButtonsColor(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d239f10b", new Object[]{this, activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 26) {
        } else {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(omo.a(i) ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }

    public void setNavigationVisibleCallback(oml omlVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c4514a", new Object[]{this, omlVar});
            return;
        }
        this.visibilityController.a(omlVar);
        String a2 = com.taobao.tao.navigation.a.a();
        StringBuilder sb = new StringBuilder();
        sb.append("setNavigationVisibleCallback is null?");
        if (omlVar != null) {
            z = false;
        }
        sb.append(z);
        TLog.loge(a2, TAG, sb.toString());
    }

    public boolean hideNavigationAnimate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f94f5d06", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (f.c()) {
            return this.visibilityController.a(z);
        }
        return false;
    }

    public boolean hideNavigation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac744ffb", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (f.c()) {
            return this.visibilityController.b(z);
        }
        return false;
    }

    public boolean isNavigationVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ffc363f", new Object[]{this})).booleanValue() : getVisibility() == 0;
    }

    /* loaded from: classes8.dex */
    public class c implements NavigationTabIndicatorView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private c() {
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.b
        public void a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55e548ad", new Object[]{this, gVar});
                return;
            }
            Context context = TBFragmentTabHost.this.getContext();
            Intent intent = null;
            if (context instanceof Activity) {
                intent = ((Activity) context).getIntent();
                intent.putExtra("referrer", intent.getData());
                intent.setData(Uri.parse(gVar.e()));
                intent.putExtra(com.taobao.tao.navigation.a.EXTRA_KEY_CLICK_TO_TAB_CHANGE, true);
            }
            TBFragmentTabHost.this.setCurrentTab(gVar.o());
            if (intent != null) {
                intent.removeExtra(com.taobao.tao.navigation.a.EXTRA_KEY_CLICK_TO_TAB_CHANGE);
            }
            e.c(gVar.y());
            String a2 = com.taobao.tao.navigation.a.a();
            TLog.loge(a2, TBFragmentTabHost.TAG, "onUnselectedClicked, biz:" + gVar.y());
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.b
        public void b(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93050ccc", new Object[]{this, gVar});
            } else {
                e.a(gVar.y(), 14, gVar.A);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.b
        public void a(g gVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f10c8137", new Object[]{this, gVar, str});
            } else {
                e.a(gVar.y(), 15, str);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.b
        public void c(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d024d0eb", new Object[]{this, gVar});
            } else {
                e.b(gVar.y(), 14, gVar.B);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.b
        public void b(g gVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ee51b96", new Object[]{this, gVar, str});
            } else {
                e.b(gVar.y(), 15, str);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.b
        public void d(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d44950a", new Object[]{this, gVar});
            } else {
                e.b(gVar.y(), 13, gVar.A);
            }
        }
    }

    public void updateTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77966c5b", new Object[]{this});
            return;
        }
        for (int i = 0; i < e.e().size(); i++) {
            g gVar = e.e().get(i);
            addTab(newTabSpec(gVar.y()).setIndicator(createIndicatorView(i)), gVar.k(), gVar.v() == null ? new Bundle() : gVar.v());
        }
    }
}
