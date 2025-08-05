package com.taobao.message.lab.comfrm.support.trace;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.FrameMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.PluginAdapter;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class PageLoadPlugin extends PluginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PageTracePlugin";
    private boolean isCheckListener;
    private final WeakReference<Activity> mActivityRef;
    public final Data mData = new Data();
    private WeakReference<Window.OnFrameMetricsAvailableListener> mOnFrameMetricsListenerRef;
    private WeakReference<ViewTreeObserver.OnGlobalLayoutListener> mOnGlobalLayoutListenerRef;

    /* loaded from: classes7.dex */
    public static class Data {
        public volatile String bizConfigKey;
        public volatile long checkRealDataFinishTime;
        public volatile long checkRealViewFinishTime;
        public volatile long checkSnapshotDataFinishTime;
        public volatile long checkSnapshotViewFinishTime;
        public volatile long containerStartTime;
        public volatile long originStartTime;
        public volatile long pageEndTime;
        public volatile long pageStartTime;
        public volatile List<String> sourceTimeoutList;
        public volatile String version;

        static {
            kge.a(-1340239670);
        }
    }

    static {
        kge.a(-770881628);
    }

    public static /* synthetic */ Object ipc$super(PageLoadPlugin pageLoadPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract boolean checkVO(ViewObject viewObject);

    public abstract boolean checkView(WeakReference<Activity> weakReference);

    public Map<String, String> getCustomDimension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a302f7b", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ boolean access$000(PageLoadPlugin pageLoadPlugin, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86abf6e0", new Object[]{pageLoadPlugin, weakReference})).booleanValue() : pageLoadPlugin.checkViewImpl(weakReference);
    }

    public static /* synthetic */ void access$100(PageLoadPlugin pageLoadPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4012bec3", new Object[]{pageLoadPlugin});
        } else {
            pageLoadPlugin.releaseViewListener();
        }
    }

    public static /* synthetic */ WeakReference access$200(PageLoadPlugin pageLoadPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("6d227952", new Object[]{pageLoadPlugin}) : pageLoadPlugin.mActivityRef;
    }

    public static /* synthetic */ WeakReference access$300(PageLoadPlugin pageLoadPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("9568b993", new Object[]{pageLoadPlugin}) : pageLoadPlugin.mOnFrameMetricsListenerRef;
    }

    public static /* synthetic */ WeakReference access$302(PageLoadPlugin pageLoadPlugin, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("7933fa05", new Object[]{pageLoadPlugin, weakReference});
        }
        pageLoadPlugin.mOnFrameMetricsListenerRef = weakReference;
        return weakReference;
    }

    public static /* synthetic */ WeakReference access$400(PageLoadPlugin pageLoadPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("bdaef9d4", new Object[]{pageLoadPlugin}) : pageLoadPlugin.mOnGlobalLayoutListenerRef;
    }

    public static /* synthetic */ WeakReference access$402(PageLoadPlugin pageLoadPlugin, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("956d4d64", new Object[]{pageLoadPlugin, weakReference});
        }
        pageLoadPlugin.mOnGlobalLayoutListenerRef = weakReference;
        return weakReference;
    }

    public PageLoadPlugin(Activity activity, long j, long j2) {
        Data data = this.mData;
        data.originStartTime = j;
        data.pageStartTime = j2;
        this.mActivityRef = new WeakReference<>(activity);
        Schedules.getLowBackground().schedule(new ReportRunnable(), 5000L, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
            return;
        }
        Data data = this.mData;
        data.bizConfigKey = str2;
        data.version = str3;
        data.containerStartTime = SystemClock.uptimeMillis();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceTimeout(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300e271f", new Object[]{this, list});
        } else {
            this.mData.sourceTimeoutList = list;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec26feb0", new Object[]{this, viewObject, viewGroup});
        } else if (viewObject == null || this.mData.checkRealDataFinishTime > 0 || !checkVO(viewObject)) {
        } else {
            if (viewObject.isSnapshot) {
                if (this.mData.checkSnapshotDataFinishTime <= 0) {
                    this.mData.checkSnapshotDataFinishTime = SystemClock.uptimeMillis();
                }
            } else if (this.mData.checkRealDataFinishTime <= 0) {
                this.mData.checkRealDataFinishTime = SystemClock.uptimeMillis();
            }
            if (this.isCheckListener) {
                return;
            }
            this.isCheckListener = true;
            Activity activity = this.mActivityRef.get();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.1
                    @Override // android.view.Window.OnFrameMetricsAvailableListener
                    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                        if (PageLoadPlugin.access$000(PageLoadPlugin.this, new WeakReference(viewGroup))) {
                            PageLoadPlugin.access$100(PageLoadPlugin.this);
                        }
                    }
                };
                activity.getWindow().addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, new Handler(Looper.getMainLooper()));
                this.mOnFrameMetricsListenerRef = new WeakReference<>(onFrameMetricsAvailableListener);
                return;
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    } else if (!PageLoadPlugin.access$000(PageLoadPlugin.this, new WeakReference(viewGroup))) {
                    } else {
                        PageLoadPlugin.access$100(PageLoadPlugin.this);
                    }
                }
            });
        }
    }

    private boolean checkViewImpl(WeakReference<ViewGroup> weakReference) {
        Activity activity;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9fb6d8e", new Object[]{this, weakReference})).booleanValue();
        }
        if (this.mData.checkRealViewFinishTime > 0 || (activity = this.mActivityRef.get()) == null || (viewGroup = weakReference.get()) == null) {
            return false;
        }
        if (checkView(this.mActivityRef)) {
            ApplicationUtil.isDebug();
            if (WidgetRenderImpl.isSnapshot(viewGroup)) {
                if (this.mData.checkSnapshotViewFinishTime <= 0) {
                    activity.getWindow().getDecorView().post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ApplicationUtil.isDebug();
                            if (PageLoadPlugin.this.mData.checkSnapshotViewFinishTime > 0) {
                                return;
                            }
                            PageLoadPlugin.this.mData.checkSnapshotViewFinishTime = SystemClock.uptimeMillis();
                        }
                    });
                }
            } else if (this.mData.checkRealViewFinishTime <= 0) {
                activity.getWindow().getDecorView().post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ApplicationUtil.isDebug();
                        if (PageLoadPlugin.this.mData.checkRealViewFinishTime > 0) {
                            return;
                        }
                        PageLoadPlugin.this.mData.checkRealViewFinishTime = SystemClock.uptimeMillis();
                    }
                });
            }
            return true;
        }
        ApplicationUtil.isDebug();
        return false;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerDisposeFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56faef6", new Object[]{this});
            return;
        }
        if (this.mData.pageEndTime <= 0) {
            this.mData.pageEndTime = SystemClock.uptimeMillis();
        }
        releaseViewListener();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventReceived(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e5ba16", new Object[]{this, event});
        } else if (event == null || !"onDisappear".equals(event.getName()) || this.mData.pageEndTime > 0) {
        } else {
            this.mData.pageEndTime = SystemClock.uptimeMillis();
        }
    }

    private void releaseViewListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc20ca7", new Object[]{this});
        } else {
            Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity activity = (Activity) PageLoadPlugin.access$200(PageLoadPlugin.this).get();
                    if (activity == null) {
                        return;
                    }
                    if (PageLoadPlugin.access$300(PageLoadPlugin.this) != null) {
                        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = (Window.OnFrameMetricsAvailableListener) PageLoadPlugin.access$300(PageLoadPlugin.this).get();
                        if (onFrameMetricsAvailableListener != null && Build.VERSION.SDK_INT >= 24) {
                            activity.getWindow().removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
                        }
                        PageLoadPlugin.access$302(PageLoadPlugin.this, null);
                    }
                    if (PageLoadPlugin.access$400(PageLoadPlugin.this) == null) {
                        return;
                    }
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) PageLoadPlugin.access$400(PageLoadPlugin.this).get();
                    if (onGlobalLayoutListener != null) {
                        ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
                        if (Build.VERSION.SDK_INT >= 16) {
                            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        } else {
                            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                        }
                    }
                    PageLoadPlugin.access$402(PageLoadPlugin.this, null);
                }
            });
        }
    }

    /* loaded from: classes7.dex */
    public class ReportRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String DIMENSION_APP_FULL_NEW_INSTALL = "isFullNewInstall";
        private static final String DIMENSION_APP_LAUNCH_TYPE = "appLaunchType";
        private static final String DIMENSION_BIZ_CONFIG_KEY = "bizConfigKey";
        private static final String DIMENSION_BIZ_VERSION = "version";
        private static final String DIMENSION_CUSTOM_ARGS = "customArgs";
        private static final String DIMENSION_HIT_SNAPSHOT = "hitSnapshot";
        private static final String DIMENSION_IN_APP_START_8_SECOND = "inAppStart8Second";
        private static final String DIMENSION_IS_SUCCESS = "isSuccess";
        private static final String DIMENSION_REAL_LOAD_FINISH = "realLoadFinish";
        private static final String DIMENSION_SOURCE_TIMEOUT = "sourceTimeout";
        private static final String DIMENSION_VALID_STAY = "validStay";
        private static final String MEASURE_CHECK_REAL_DATA_FINISH_TIME = "checkRealDataFinishTime";
        private static final String MEASURE_CHECK_REAL_VIEW_FINISH_TIME = "checkRealViewFinishTime";
        private static final String MEASURE_CHECK_SNAPSHOT_DATA_FINISH_TIME = "checkSnapshotDataFinishTime";
        private static final String MEASURE_CHECK_SNAPSHOT_VIEW_FINISH_TIME = "checkSnapshotViewFinishTime";
        private static final String MEASURE_CONTAINER_START_TIME = "containerStartTime";
        private static final String MEASURE_CONTAINER_TOTAL = "containerTotal";
        private static final String MEASURE_FAIL_COUNT = "failCount";
        private static final String MEASURE_HIT_SNAPSHOT_COUNT = "hitSnapshotCount";
        private static final String MEASURE_ORIGIN_START_TIME = "originStartTime";
        private static final String MEASURE_ORIGIN_TOTAL = "originTotal";
        private static final String MEASURE_PAGE_END_TIME = "pageEndTime";
        private static final String MEASURE_PAGE_START_TIME = "pageStartTime";
        private static final String MEASURE_PAGE_TOTAL = "pageTotal";
        private static final String MEASURE_REAL_CONTAINER_TOTAL = "realContainerTotal";
        private static final String MEASURE_REAL_LOAD_FINISH_COUNT = "realLoadFinishCount";
        private static final String MEASURE_REAL_ORIGIN_TOTAL = "realOriginTotal";
        private static final String MEASURE_REAL_PAGE_TOTAL = "realPageTotal";
        private static final String MEASURE_SNAPSHOT_CONTAINER_TOTAL = "snapshotContainerTotal";
        private static final String MEASURE_SNAPSHOT_ORIGIN_TOTAL = "snapshotOriginTotal";
        private static final String MEASURE_SNAPSHOT_PAGE_TOTAL = "snapshotPageTotal";
        private static final String MEASURE_SUCCESS_COUNT = "successCount";
        private static final String MODULE = "BricksDojo";
        private static final String POINT = "pageLoadStat";

        static {
            kge.a(1472713105);
            kge.a(-1390502639);
        }

        public ReportRunnable() {
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0262  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0264  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x026c  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0277  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0284  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0286  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0321  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0323  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0331  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x033e  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0340  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x034d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1034
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.ReportRunnable.run():void");
        }
    }
}
