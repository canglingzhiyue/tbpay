package com.taobao.alilive.aliliveframework.frame;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.search.common.util.i;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.ac;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.q;
import com.uc.webview.export.media.MessageID;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.riy;

/* loaded from: classes4.dex */
public abstract class BaseFrame implements IComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_INIT_SUCCESS = 1;
    private static final String TAG = "BaseFrame";
    public static final int VIEW_STATUS_APPEAR = 2;
    public static final int VIEW_STATUS_DISAPPEAR = 3;
    public static final int VIEW_STATUS_INIT = 1;
    public static final int VIEW_STATUS_WILL_APPEAR = 4;
    private static int count;
    public static String name;
    public static long startTime;
    public static long time;
    public boolean layoutFrozen;
    public List<IComponent> mComponents;
    public View mContainer;
    public Context mContext;
    public long mCreateViewTime;
    public a mFrameContext;
    private AtomicBoolean mIsCallCleanUp;
    private AtomicBoolean mIsCallDataReceived;
    public boolean mIsPaused;
    public boolean mLandscape;
    public TBLiveDataModel mLiveDataModel;
    public int mViewStatus;
    public ViewStub mViewStub;
    public boolean viewCreated;

    public boolean asyncRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3514e8f6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean childrenAppearImmediately() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b790d775", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return 0;
    }

    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Deprecated
    public BaseFrame(Context context) {
        this(context, false);
    }

    @Deprecated
    public BaseFrame(Context context, boolean z) {
        this.mLandscape = false;
        this.mViewStatus = 1;
        this.viewCreated = false;
        this.mComponents = new CopyOnWriteArrayList();
        this.mIsCallCleanUp = new AtomicBoolean(false);
        this.mIsCallDataReceived = new AtomicBoolean(false);
        this.layoutFrozen = false;
        q.c(TAG, this + " 调用构造函数");
        this.mContext = context;
        this.mLandscape = z;
        if (b.d(this.mContext)) {
            name = getClass().getSimpleName();
            time = System.currentTimeMillis();
        }
        pnj m = pmd.a().m();
        m.b(TAG, "registerFrame name---" + name);
        startTime = System.currentTimeMillis();
    }

    public BaseFrame(Context context, a aVar) {
        this(context, aVar.b);
        this.mFrameContext = aVar;
    }

    @Deprecated
    public BaseFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        this(context, z);
        this.mLiveDataModel = tBLiveDataModel;
    }

    public BaseFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        this(context, z, tBLiveDataModel);
        this.mFrameContext = aVar;
    }

    public boolean keepViewStubWithoutInflate(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b637faa", new Object[]{this, viewStub})).booleanValue();
        }
        this.mViewStub = viewStub;
        return true;
    }

    public void inflateViewOnNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed34788", new Object[]{this});
            return;
        }
        ViewStub viewStub = this.mViewStub;
        if (viewStub == null || viewStub.getParent() == null || !createView(this.mViewStub)) {
            return;
        }
        String str = getComponentName() + " inflate view lazily " + System.currentTimeMillis();
    }

    public final void asyncRenderComponentWithSerialFrameInstaller(final BaseFrame baseFrame, final ViewGroup viewGroup, final ViewStub viewStub, Handler handler, final Handler handler2, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2725786", new Object[]{this, baseFrame, viewGroup, viewStub, handler, handler2, obj, new Long(j)});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.alilive.aliliveframework.frame.BaseFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                final View inflateViewNoAdd = BaseFrame.this.inflateViewNoAdd(viewStub);
                handler2.post(new f(inflateViewNoAdd) { // from class: com.taobao.alilive.aliliveframework.frame.BaseFrame.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        BaseFrame.this.replaceSelfWithView(inflateViewNoAdd, viewGroup, viewStub);
                        BaseFrame.this.mContainer = inflateViewNoAdd;
                        BaseFrame.this.onViewCreated(BaseFrame.this.mContainer);
                        baseFrame.addComponent(BaseFrame.this);
                    }
                });
            }
        };
        if (Build.VERSION.SDK_INT >= 28) {
            handler.postDelayed(runnable, obj, j);
        } else {
            handler.postDelayed(runnable, j);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public boolean createView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f881d80", new Object[]{this, viewStub})).booleanValue();
        }
        q.c(TAG, this + " 调用 createView(ViewStub stub)");
        ac.a(getComponentClassName(), "createView_by_stub");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        e.h();
        if (viewStub != null && viewStub.getParent() != null) {
            viewStub.setLayoutResource(getLayoutResId());
            this.mContainer = viewStub.inflate();
            onViewCreated(this.mContainer);
            this.mCreateViewTime = SystemClock.elapsedRealtime() - elapsedRealtime;
            q.c(TAG, this + " createView cost = " + this.mCreateViewTime);
            ac.a();
            return true;
        }
        createView((ViewGroup) null);
        ac.a();
        return false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void createView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50080207", new Object[]{this, viewGroup});
            return;
        }
        q.c(TAG, this + " 调用 createView(ViewGroup root)");
        ac.a(getComponentClassName(), "createView_by_view");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int layoutResId = getLayoutResId();
        if (layoutResId > 0) {
            this.mContainer = LayoutInflater.from(this.mContext).inflate(layoutResId, viewGroup);
        }
        onViewCreated(this.mContainer);
        this.mCreateViewTime = SystemClock.elapsedRealtime() - elapsedRealtime;
        q.c(TAG, this + " createView cost = " + this.mCreateViewTime);
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        q.c(TAG, this + " 调用 onViewCreated");
        this.viewCreated = true;
    }

    @Deprecated
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
            return;
        }
        q.c(TAG, this + " 调用 onCreateView");
        createView(viewStub);
    }

    @Deprecated
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        q.c(TAG, this + " 调用 onCreateView2");
        createView(viewGroup);
    }

    public boolean isLandscape() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89cf8bc", new Object[]{this})).booleanValue() : this.mLandscape;
    }

    static {
        kge.a(758415767);
        kge.a(378338681);
        count = 0;
    }

    public void dispatchChildrenOnDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f55803", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list == null) {
            return;
        }
        for (IComponent iComponent : list) {
            if (iComponent.getViewStatus() != 2) {
                iComponent.onDidAppear();
            }
        }
    }

    public void onFreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00894a7", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onFreezeLayout");
        this.layoutFrozen = true;
    }

    public void onUnfreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d54d80", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onFreezeLayout");
        this.layoutFrozen = false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void addComponent(IComponent iComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4912ef9", new Object[]{this, iComponent});
        } else if (iComponent == null || this.mComponents == null) {
        } else {
            if (this.mLiveDataModel != null && iComponent.getLiveDataModel() == null) {
                iComponent.onBindData(this.mLiveDataModel);
            }
            if (this.mViewStatus == 2 && iComponent.getViewStatus() != 2) {
                iComponent.onDidAppear();
            }
            this.mComponents.add(iComponent);
            if (!b.d(this.mContext)) {
                return;
            }
            count++;
            long j = 0;
            if (name.equals(iComponent.getClass().getSimpleName())) {
                j = System.currentTimeMillis() - time;
            }
            String str = "addComponent:" + iComponent.getClass().getSimpleName() + " " + count + " " + j;
            if (j <= 10) {
                return;
            }
            Log.e("LiveMonitor", iComponent.getClass().getSimpleName() + "组件耗时" + j + "ms过长,请优化");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void deleteComponent(IComponent iComponent) {
        List<IComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4828ddaf", new Object[]{this, iComponent});
        } else if (iComponent == null || (list = this.mComponents) == null) {
        } else {
            list.remove(iComponent);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public IComponent getComponentByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IComponent) ipChange.ipc$dispatch("58361172", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(getComponentName())) {
            return this;
        }
        for (IComponent iComponent : this.mComponents) {
            IComponent componentByName = iComponent.getComponentByName(str);
            if (componentByName != null) {
                return componentByName;
            }
        }
        return null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public View getViewByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6b6e3610", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (StringUtils.equals(str, getComponentName())) {
            return getComponentView();
        }
        for (IComponent iComponent : this.mComponents) {
            View viewByName = iComponent.getViewByName(str);
            if (viewByName != null) {
                return viewByName;
            }
        }
        return null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void clearComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cab9b7", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list == null) {
            return;
        }
        list.clear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onCreate");
        ac.a(getComponentClassName(), i.b.MEASURE_ONCREATE);
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onCreate();
            }
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onPause");
        ac.a(getComponentClassName(), "onPause");
        this.mIsPaused = true;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onPause();
            }
        }
        ac.a();
    }

    @Override // tb.deh
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onStart");
        ac.a(getComponentClassName(), "onStart");
        for (IComponent iComponent : this.mComponents) {
            iComponent.onStart();
        }
        ac.a();
    }

    @Override // tb.deh
    public void onRemove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885fa4a", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onRemove");
        ac.a(getComponentClassName(), "onRemove");
        for (IComponent iComponent : this.mComponents) {
            iComponent.onRemove();
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onResume");
        ac.a(getComponentClassName(), "onResume");
        this.mIsPaused = false;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onResume();
            }
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onStop");
        ac.a(getComponentClassName(), MessageID.onStop);
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onStop();
            }
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onDestroy");
        ac.a(getComponentClassName(), MessageID.onDestroy);
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onDestroy();
            }
            this.mComponents.clear();
        }
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(8);
        }
        internalCleanUp();
        count = 0;
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        View view = this.mContainer;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        View view = this.mContainer;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : getClass().getSimpleName();
    }

    public String getComponentClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93e3add", new Object[]{this}) : getClass().getSimpleName();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void onVideoStatusChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2319dd36", new Object[]{this, new Integer(i)});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (IComponent iComponent : this.mComponents) {
            iComponent.onVideoStatusChanged(i);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public View getComponentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2d47995", new Object[]{this}) : this.mContainer;
    }

    public final View getContainerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3268c19", new Object[]{this}) : this.mContainer;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void onBindData(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292c0dc6", new Object[]{this, tBLiveDataModel});
            return;
        }
        q.c(TAG, this + " 调用 onBindData");
        ac.a(getComponentClassName(), "onBindData");
        this.mLiveDataModel = tBLiveDataModel;
        if (this.mViewStatus == 2) {
            onStatusChange(1, this.mLiveDataModel);
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onBindData(tBLiveDataModel);
            }
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onDidAppear");
        ac.a(getComponentClassName(), "onDidAppear");
        this.mViewStatus = 2;
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null) {
            onStatusChange(1, tBLiveDataModel);
        }
        if (childrenAppearImmediately()) {
            dispatchChildrenOnDidAppear();
        }
        this.mIsCallCleanUp.set(false);
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onDidDisappear");
        ac.a(getComponentClassName(), "onDidDisappear");
        this.mViewStatus = 3;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                if (iComponent.getViewStatus() != 3) {
                    iComponent.onDidDisappear();
                }
            }
        }
        internalCleanUp();
        this.mLiveDataModel = null;
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onWillAppear");
        ac.a(getComponentClassName(), "onWillAppear");
        this.mViewStatus = 4;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onWillAppear();
            }
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onWillDisappear");
        ac.a(getComponentClassName(), "onWillDisappear");
        this.mViewStatus = 3;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onWillDisappear();
            }
        }
        this.mLiveDataModel = null;
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPreloadView(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72946fa", new Object[]{this, iRecyclerModel});
            return;
        }
        q.c(TAG, this + " 调用 onPreloadView");
        ac.a(getComponentClassName(), "onPreloadView");
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onPreloadView(iRecyclerModel);
            }
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onUnloadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931608a", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onUnloadView");
        ac.a(getComponentClassName(), "onUnloadView");
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onUnloadView();
            }
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        ac.a(getComponentClassName(), "onStatusChange");
        if (i == 1 && (obj instanceof TBLiveDataModel) && this.mIsCallDataReceived.compareAndSet(false, true)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            onDataReceived((TBLiveDataModel) obj);
            q.c(TAG, this + "Frame total cost = " + (this.mCreateViewTime + (SystemClock.elapsedRealtime() - elapsedRealtime)));
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public int getViewStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a37da4e7", new Object[]{this})).intValue() : this.mViewStatus;
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onScrollStateChanged(i);
            }
        }
        a aVar = this.mFrameContext;
        if (aVar == null || aVar.z().D() == null) {
            return;
        }
        if (i == 1 || i == 2) {
            if (this.layoutFrozen) {
                return;
            }
            onFreezeLayout();
            return;
        }
        View view = this.mContainer;
        if (view == null || !view.isAttachedToWindow() || this.mFrameContext.z().D().getChildCount() != 1 || !this.layoutFrozen) {
            return;
        }
        onUnfreezeLayout();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public TBLiveDataModel getLiveDataModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("82cec8ab", new Object[]{this}) : this.mLiveDataModel;
    }

    public View findViewById(int i) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        View view = this.mContainer;
        if (view == null) {
            return null;
        }
        View findViewById2 = view.findViewById(i);
        if (findViewById2 != null) {
            return findViewById2;
        }
        View decorView = getDecorView();
        if (decorView != null && (findViewById = decorView.findViewById(i)) != null) {
            return findViewById;
        }
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            return null;
        }
        return ((Activity) context).findViewById(i);
    }

    private View getDecorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6d69b8fd", new Object[]{this});
        }
        View view = this.mContainer;
        if (view != null) {
            while (view.getParent() instanceof View) {
                view = (View) view.getParent();
            }
        }
        return view;
    }

    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        q.c(TAG, this + " 调用 onDataReceived");
    }

    private void internalCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41110e4e", new Object[]{this});
            return;
        }
        if (this.mIsCallCleanUp.compareAndSet(false, true)) {
            onCleanUp();
        }
        this.layoutFrozen = false;
        this.mIsCallDataReceived.set(false);
    }

    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        q.c(TAG, this + " 调用 onCleanUp, mViewStatus: " + this.mViewStatus + ", mViewCreated: " + this.viewCreated);
    }

    public a getFrameContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a9297eb4", new Object[]{this}) : this.mFrameContext;
    }

    public View inflateViewNoAdd(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("336fd62b", new Object[]{this, viewStub});
        }
        View inflate = LayoutInflater.from(this.mContext).cloneInContext(this.mContext).inflate(getLayoutResId(), (ViewGroup) null);
        inflate.setId(viewStub.getInflatedId());
        return inflate;
    }

    public void replaceSelfWithView(View view, ViewGroup viewGroup, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4519165", new Object[]{this, view, viewGroup, viewStub});
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return riy.ARRAY_START_STR + getComponentName() + "@" + hashCode() + riy.ARRAY_END_STR;
    }
}
