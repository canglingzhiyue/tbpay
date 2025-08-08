package com.alipay.birdnest.api;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.AdapterView;
import com.alipay.android.app.template.EventHandler;
import com.alipay.android.app.template.FBBridge;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.ITemplateDisposable;
import com.alipay.android.app.template.JsPluginFactory;
import com.alipay.android.app.template.OnLoadCallback;
import com.alipay.android.app.template.Template;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.template.TemplatePasswordService;
import com.alipay.android.app.template.event.TElementEventHandler;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.store.TemplateStorage;
import com.alipay.birdnest.util.FBImageLoader;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBDocumentAssistor;
import com.flybird.GlobalCacheForApi;
import com.flybird.support.basics.a;
import com.flybird.support.basics.d;
import com.flybird.support.basics.e;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.cul;
import tb.cum;
import tb.riy;

/* loaded from: classes3.dex */
public class BirdNestEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5250a = false;
    public static int globalPerfRatioOf10000 = 0;
    public static boolean rollbackAntEvent = false;
    public static boolean useDelayedImgLoading = false;
    public static boolean useDelayedTorchBind = false;
    public static boolean useLogBatch = false;
    public static boolean useNoFootprint = false;
    public static boolean useSimpleActionSplit = false;
    public static boolean useSkipOldSwitches = false;
    public static boolean useValueCache = false;
    public Config config;
    @Deprecated
    private TemplateStorage f;
    @Deprecated
    private TemplateManager g;
    private FBImageLoader h;
    private int i;
    private ExecutorService j;
    private ExecutorService k;
    private final LogTracer2 l;
    private volatile ExecutorService m;
    public static String optimizationFlag = String.valueOf(0);
    public static a<AntEvent> eventBatchRunner = new a<>(48, 10, new cum<AntEvent, Void, Throwable>() { // from class: com.alipay.birdnest.api.BirdNestEngine.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // tb.cum
        public Void apply(AntEvent antEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7a74adc1", new Object[]{this, antEvent});
            }
            antEvent.send();
            return null;
        }

        @Override // tb.cum
        public void error(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25621cab", new Object[]{this, th});
            }
        }
    });
    private static boolean b = false;
    private static final int c = Runtime.getRuntime().availableProcessors();
    private ConcurrentMap<String, Set<Integer>> d = null;
    private ConcurrentMap<Integer, Set<FBContext>> e = null;
    private Handler n = new Handler(Looper.getMainLooper());
    public d inMemKV = new d();
    private Object o = null;
    private SampledLogContext p = null;

    /* loaded from: classes3.dex */
    public static class Config {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f5254a;
        public Context b;
        public TemplateTransport c;
        public EmbedTemplateProvider d;
        public ResourceProvider e;
        public IdProvider f;
        public SettingProvider g;
        public UiWidgetProvider h;
        public UiVideoProvider i;
        public EmojiProvider j;
        public DevicePropProvider k;
        public LogTracer2 l;
        public ThemeColorProvider m;

        public Config(boolean z, Context context, TemplateTransport templateTransport, EmbedTemplateProvider embedTemplateProvider, ResourceProvider resourceProvider, IdProvider idProvider, SettingProvider settingProvider, LogTracer2 logTracer2, UiWidgetProvider uiWidgetProvider, UiVideoProvider uiVideoProvider, DevicePropProvider devicePropProvider, EmojiProvider emojiProvider, ThemeColorProvider themeColorProvider) {
            this.f5254a = false;
            this.f5254a = z;
            this.b = context;
            this.c = templateTransport;
            this.d = embedTemplateProvider;
            this.e = resourceProvider;
            this.f = idProvider;
            this.g = settingProvider;
            this.l = logTracer2;
            this.h = uiWidgetProvider;
            this.i = uiVideoProvider;
            this.k = devicePropProvider;
            this.j = emojiProvider;
            this.m = themeColorProvider;
        }

        public Context getApplicationCtx() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("950e78ac", new Object[]{this}) : this.b;
        }

        public DevicePropProvider getDevicePropProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DevicePropProvider) ipChange.ipc$dispatch("b6a15fb9", new Object[]{this}) : this.k;
        }

        public EmbedTemplateProvider getEmbedTemplateProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EmbedTemplateProvider) ipChange.ipc$dispatch("1de2bfe1", new Object[]{this}) : this.d;
        }

        public EmojiProvider getEmojiProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EmojiProvider) ipChange.ipc$dispatch("70b93bfb", new Object[]{this}) : this.j;
        }

        public IdProvider getIdProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IdProvider) ipChange.ipc$dispatch("3441e079", new Object[]{this}) : this.f;
        }

        public LogTracer2 getLogTracer() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LogTracer2) ipChange.ipc$dispatch("d0d03dbd", new Object[]{this}) : this.l;
        }

        public ResourceProvider getResourceProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ResourceProvider) ipChange.ipc$dispatch("3e0a5059", new Object[]{this}) : this.e;
        }

        public SettingProvider getSettingProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SettingProvider) ipChange.ipc$dispatch("fe916fa7", new Object[]{this}) : this.g;
        }

        public ThemeColorProvider getThemeColorProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThemeColorProvider) ipChange.ipc$dispatch("a0251c19", new Object[]{this}) : this.m;
        }

        public TemplateTransport getTransport() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TemplateTransport) ipChange.ipc$dispatch("604ad171", new Object[]{this}) : this.c;
        }

        public UiVideoProvider getUiVideoProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UiVideoProvider) ipChange.ipc$dispatch("45ec8e39", new Object[]{this}) : this.i;
        }

        public UiWidgetProvider getUiWidgetProvider() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UiWidgetProvider) ipChange.ipc$dispatch("17eb8299", new Object[]{this}) : this.h;
        }

        public boolean isDebuggable() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[]{this})).booleanValue() : this.f5254a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Config{debuggable=" + this.f5254a + ", applicationCtx=" + this.b + ", transport=" + this.c + ", embedTemplateProvider=" + this.d + ", resourceProvider=" + this.e + ", idProvider=" + this.f + ", settingProvider=" + this.g + ", uiWidgetProvider=" + this.h + ", devicePropProvider=" + this.k + ", logTracer=" + this.l + ", themeColorProvider=" + this.m + '}';
        }
    }

    /* loaded from: classes3.dex */
    public interface ContentAdapter {
        Object convert(Object obj, String str);
    }

    /* loaded from: classes3.dex */
    public interface DevicePropProvider {
        boolean capableOf(String str);

        String getProperty(String str, Map<String, String> map);
    }

    /* loaded from: classes3.dex */
    public interface EmbedTemplateProvider {
        String getTemplate(Context context, String str);
    }

    /* loaded from: classes3.dex */
    public interface EmojiProvider {
        String prepareContent(String str);

        int renderEmojiReturncount(Context context, SpannableStringBuilder spannableStringBuilder, int i);
    }

    /* loaded from: classes3.dex */
    public interface IdProvider {
        int getUniqueResId(String str);
    }

    /* loaded from: classes3.dex */
    public interface LogTracer {
        public static final int BIZ_BIRDNEST = 2;
        public static final int BIZ_COMM = 0;
        public static final int TYPE_ERROR = 3;
        public static final int TYPE_EXCEPTION = 2;
        public static final int TYPE_FOOTPRINT = 0;
        public static final int TYPE_PERF = 1;

        void trace(int i, int i2, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Throwable th);
    }

    /* loaded from: classes3.dex */
    public interface LogTracer2 extends LogTracer {
        public static final LogTracer2 noopLogTracer2 = new LogTracer2() { // from class: com.alipay.birdnest.api.BirdNestEngine.LogTracer2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
            public void addCoreSampleLog(int i, long j, long j2, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b0cb276", new Object[]{this, new Integer(i), new Long(j), new Long(j2), str, str2});
                }
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
            public void addEventLog(String str, String str2, Map<String, String> map, Map<String, String> map2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("79292006", new Object[]{this, str, str2, map, map2});
                }
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
            public void addViewLog(Object obj, String str, String str2, Map<String, String> map, Map<String, String> map2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("159fcbd5", new Object[]{this, obj, str, str2, map, map2});
                }
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
            public void flushCoreSampleLog() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("95053cbe", new Object[]{this});
                }
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2, com.alipay.birdnest.api.BirdNestEngine.LogTracer
            public void trace(int i, int i2, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("463bc02e", new Object[]{this, new Integer(i), new Integer(i2), str, str2, str3, str4, str5, map, th});
                }
            }
        };

        @Deprecated
        void addCoreSampleLog(int i, long j, long j2, String str, String str2);

        void addEventLog(String str, String str2, Map<String, String> map, Map<String, String> map2);

        void addViewLog(Object obj, String str, String str2, Map<String, String> map, Map<String, String> map2);

        @Deprecated
        void flushCoreSampleLog();

        @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer
        /* synthetic */ void trace(int i, int i2, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Throwable th);
    }

    /* loaded from: classes3.dex */
    public interface ResourceProvider {

        /* loaded from: classes3.dex */
        public interface Callback {
            void onLoadFailure(int i, int i2, Object obj);

            void onLoadSuccess(int i, int i2, Object obj);
        }

        Object getResource(Context context, String str, String str2, String str3);

        Object getResourceAsync(View view, String str, int i, int i2, Drawable drawable, Drawable drawable2, int i3, boolean z, Callback callback, Bundle bundle);
    }

    /* loaded from: classes3.dex */
    public interface SampledLogContext {
        String provideSampleLogIdentity();

        ArrayList<?> provideSampleLogSpace();
    }

    /* loaded from: classes3.dex */
    public interface SettingProvider {
        String getLocale();

        String getRawSwitch(String str, String str2);

        boolean getSwitch(String str, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface TemplateFilter {
        boolean accept(String str, String str2);
    }

    /* loaded from: classes3.dex */
    public enum TemplateStatus {
        FAIL,
        ADD,
        UPDATE,
        EXIST
    }

    /* loaded from: classes3.dex */
    public interface TemplateTransport {
        List<String> fetchTemplates(Map<String, String> map);
    }

    /* loaded from: classes3.dex */
    public interface ThemeColorProvider {
        public static final int THEME_CUSTOM_THEME = 65536;
        public static final int THEME_DARK_MODE = 1;
        public static final int THEME_NORMAL = 0;

        void addThemeChangeListener(FBDocument fBDocument, cul<Integer, Void> culVar);

        int mapHexColor(int i, int i2);

        int mapVarColor(String str, int i);

        int themeBitsForCurrentDocument(FBDocument fBDocument);
    }

    /* loaded from: classes3.dex */
    public interface UiVideoProvider {

        /* loaded from: classes3.dex */
        public interface VideoCallback {
            void onCompletion();

            void onError(int i, String str, Object obj);

            void onFinish();

            void onPlaying();

            void onStart();

            void onUserAction(String str, String str2);

            void onViewClicked(Point point, Point point2);

            void playerBuffering();

            void playerBufferingEnd();

            void playerPaused();

            void playerSeekComplete(boolean z);

            void playerSeeking();

            void playerStopped();
        }

        View createVideoView(Context context, VideoCallback videoCallback);

        void destroyVideoView(View view);

        Object getAttribute(View view, String str);

        void loadUri(View view, HashMap<String, String> hashMap);

        void pause(View view);

        void play(View view);

        void prepare(View view);

        void resume(View view);

        void setAttribute(View view, String str, Object obj);

        @Deprecated
        void setRollbackWrapper(boolean z);
    }

    /* loaded from: classes3.dex */
    public interface UiWidgetProvider {

        /* loaded from: classes3.dex */
        public interface CreateCallback {
            void onError(String str);

            void onSuccess(View view, Bundle bundle);
        }

        /* loaded from: classes3.dex */
        public interface LoadUrlListener {
            boolean onLoadUrl(String str);

            void onPageEvent(String str, String str2);
        }

        /* loaded from: classes3.dex */
        public interface YearMounthPickerCallback {
            void onPick(String str, String str2);
        }

        Dialog createDialog(Context context, String str, String str2, String str3, String[] strArr, AdapterView.OnItemClickListener onItemClickListener);

        View createIconView(Context context, String str, String str2, String str3);

        View createLoadingView(Context context);

        FBOverView createOverView(Context context);

        View createViewByTag(Context context, String str, Map<String, String> map);

        View createWebView(Context context, String str, LoadUrlListener loadUrlListener, Map<String, String> map);

        void createWebViewAsync(Context context, String str, LoadUrlListener loadUrlListener, Map<String, String> map, CreateCallback createCallback);

        Dialog createYearMounthPickerDialog(Context context, int i, int i2, int i3, String str, YearMounthPickerCallback yearMounthPickerCallback);

        void destroyWebView(View view);

        void loadData(View view, String str, String str2, String str3);

        void loadUrlWithWebView(View view, String str);

        void openWebPage(String str, String str2, Context context);

        void updateWebViewProperties(View view, String str, String str2);
    }

    public BirdNestEngine(Config config) {
        GlobalCacheForApi.a();
        Platform.h();
        this.config = config;
        LogTracer2 logTracer = config.getLogTracer() != null ? config.getLogTracer() : LogTracer2.noopLogTracer2;
        this.l = logTracer;
        this.f = new TemplateStorage(getConfig().getApplicationCtx(), this.config.isDebuggable(), logTracer);
        this.g = new TemplateManager();
        this.h = new FBImageLoader(this);
    }

    private void a(Context context, FBContext fBContext) {
        Set<FBContext> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fee9e", new Object[]{this, context, fBContext});
            return;
        }
        int hashCode = context.hashCode();
        if (this.e == null) {
            this.e = new ConcurrentHashMap();
        }
        if (this.e.containsKey(Integer.valueOf(hashCode))) {
            set = this.e.get(Integer.valueOf(hashCode));
        } else {
            HashSet hashSet = new HashSet();
            this.e.put(Integer.valueOf(hashCode), hashSet);
            set = hashSet;
        }
        set.add(fBContext);
    }

    private void a(Params params, String str) {
        Set<Integer> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e18a168", new Object[]{this, params, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (this.d == null) {
                this.d = new ConcurrentHashMap();
            }
            if (this.d.containsKey(str)) {
                set = this.d.get(str);
            } else {
                HashSet hashSet = new HashSet();
                this.d.put(str, hashSet);
                set = hashSet;
            }
            set.add(Integer.valueOf(params.context.hashCode()));
        }
    }

    public static BirdNestEngine create(Config config) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine) ipChange.ipc$dispatch("7436a9cf", new Object[]{config});
        }
        if (f5250a && config != null && config.getApplicationCtx() != null && config.getEmbedTemplateProvider() != null && config.getResourceProvider() != null && config.getTransport() != null && config.getIdProvider() != null && config.getSettingProvider() != null && config.getUiWidgetProvider() != null) {
            BirdNestEngine birdNestEngine = new BirdNestEngine(config);
            birdNestEngine.i = config.getIdProvider().getUniqueResId("alipay_msp_tag_view_holder");
            return birdNestEngine;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The config is invalid(");
        sb.append(config == null ? com.taobao.android.weex_framework.util.a.ATOM_EXT_Null : config.toString());
        sb.append(riy.BRACKET_END_STR);
        throw new RuntimeException(sb.toString());
    }

    public static String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]) : "6.2.2";
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        FBDocumentAssistor.a(context);
        f5250a = true;
    }

    @Deprecated
    public String birdParams(String str, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9d4ba4f", new Object[]{this, str, resources});
        }
        String str2 = Platform.f5257a;
        return "";
    }

    public void clearCachedElement(int i, boolean z) {
        Set<FBContext> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47003365", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.d.keySet()) {
                Set<Integer> set = this.d.get(str);
                if (set != null && set.contains(Integer.valueOf(i))) {
                    set.remove(Integer.valueOf(i));
                    if (set.size() == 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    String str2 = (String) arrayList.get(i2);
                    this.d.remove(str2);
                    this.f.removeInMemTpl(str2);
                }
                arrayList.clear();
            }
        }
        ConcurrentMap<Integer, Set<FBContext>> concurrentMap = this.e;
        if (concurrentMap != null && (remove = concurrentMap.remove(Integer.valueOf(i))) != null) {
            if (!z) {
                for (FBContext fBContext : (FBContext[]) remove.toArray(new FBContext[remove.size()])) {
                    fBContext.destroy(null);
                }
            }
            remove.clear();
        }
        getImageLoader().clearCache(i);
    }

    public void destroyView(View view, Map<String, Object> map) {
        int i;
        TemplateFilter templateFilter;
        Object obj;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ad41b9", new Object[]{this, view, map});
        } else if (view == null) {
        } else {
            Object tag = view.getTag(this.i);
            if (tag != null && this.e != null) {
                if (tag instanceof ITemplateDisposable) {
                    ITemplateDisposable iTemplateDisposable = (ITemplateDisposable) tag;
                    if (!iTemplateDisposable.isDestroyed()) {
                        i = iTemplateDisposable.getContextHashCode();
                        Set<FBContext> set = this.e.get(Integer.valueOf(i));
                        if (set != null) {
                            set.remove(iTemplateDisposable);
                        }
                        iTemplateDisposable.destroy();
                    }
                } else if (tag instanceof FBDocument) {
                    FBDocument fBDocument = (FBDocument) tag;
                    if (!fBDocument.mo650getBodyView().isDestroyed()) {
                        i = fBDocument.mo650getBodyView().getContextHashCode();
                        Set<FBContext> set2 = this.e.get(Integer.valueOf(i));
                        if (set2 != null) {
                            set2.remove(fBDocument);
                        }
                        fBDocument.destroy(map);
                    }
                }
                templateFilter = null;
                view.setTag(this.i, null);
                if (map != null || !map.containsKey(FBContext.OPTION_DESTROY_ONLY_SINGLE_VIEW) || !map.get(FBContext.OPTION_DESTROY_ONLY_SINGLE_VIEW).equals(Boolean.TRUE)) {
                    z = false;
                }
                if (i != 0 && !z) {
                    clearCachedElement(i, false);
                }
                if (map != null && map.containsKey(FBContext.OPTION_DEFER_DOWNLOAD) && map.get(FBContext.OPTION_DEFER_DOWNLOAD).equals(Boolean.TRUE)) {
                    obj = map.get(FBContext.OPTION_DEFER_DOWNLOAD_FILTER);
                    if (obj != null && (obj instanceof TemplateFilter)) {
                        templateFilter = (TemplateFilter) obj;
                    }
                    triggerTemplateUpdate(view.getContext().getResources(), templateFilter);
                }
                eventBatchRunner.a();
            }
            i = 0;
            templateFilter = null;
            view.setTag(this.i, null);
            if (map != null) {
            }
            z = false;
            if (i != 0) {
                clearCachedElement(i, false);
            }
            if (map != null) {
                obj = map.get(FBContext.OPTION_DEFER_DOWNLOAD_FILTER);
                if (obj != null) {
                    templateFilter = (TemplateFilter) obj;
                }
                triggerTemplateUpdate(view.getContext().getResources(), templateFilter);
            }
            eventBatchRunner.a();
        }
    }

    @Deprecated
    public Map<String, TemplateStatus> downloadTemplate(Map<String, String> map, Resources resources, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a47138f5", new Object[]{this, map, resources, map2});
        }
        String str = Platform.f5257a;
        return new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.app.template.FBContext generateFBContext(com.alipay.birdnest.api.BirdNestEngine.Params r27, java.lang.String r28, int r29) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.api.BirdNestEngine.generateFBContext(com.alipay.birdnest.api.BirdNestEngine$Params, java.lang.String, int):com.alipay.android.app.template.FBContext");
    }

    public LogTracer getBatchLogTracer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogTracer) ipChange.ipc$dispatch("c1bd3bf5", new Object[]{this}) : this.l;
    }

    public LogTracer2 getBatchLogTracer2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogTracer2) ipChange.ipc$dispatch("c07ef387", new Object[]{this}) : this.l;
    }

    public Config getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("a83f41b9", new Object[]{this}) : this.config;
    }

    public ExecutorService getDetachedExecutorService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("eb09c7da", new Object[]{this});
        }
        if (this.m == null) {
            synchronized (this) {
                this.m = Platform.makeComputeExecutorService(Runtime.getRuntime().availableProcessors(), 128, 60, "FB-Det-Trd");
            }
        }
        return this.m;
    }

    public LogTracer getEngineLogTracer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogTracer) ipChange.ipc$dispatch("a0c898a9", new Object[]{this}) : this.l;
    }

    @Deprecated
    public ExecutorService getExecutorService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("d9806c48", new Object[]{this});
        }
        if (this.j == null) {
            String str = Platform.f5257a;
            this.j = Executors.newCachedThreadPool();
        }
        return this.j;
    }

    public FBImageLoader getImageLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBImageLoader) ipChange.ipc$dispatch("550b0a9a", new Object[]{this}) : this.h;
    }

    public ExecutorService getInvokeExecutorService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("24811c60", new Object[]{this});
        }
        if (this.k == null) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            int max = Math.max(2, Math.min(availableProcessors - 1, 4)) + availableProcessors;
            if (getConfig().getSettingProvider().getSwitch("bn_rollback_limitThreadPool", false)) {
                this.k = new ThreadPoolExecutor(max, max, 120L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) { // from class: com.alipay.birdnest.api.BirdNestEngine.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public int f5251a = 0;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                        }
                        this.f5251a = (this.f5251a + 1) % 100;
                        return new Thread(runnable, "FBApiThrd-" + this.f5251a);
                    }
                });
            } else {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) { // from class: com.alipay.birdnest.api.BirdNestEngine.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public int f5252a = 0;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                        }
                        this.f5252a = (this.f5252a + 1) % 100;
                        return new Thread(runnable, "FBApiThrd-" + this.f5252a);
                    }
                });
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.k = threadPoolExecutor;
            }
        }
        return this.k;
    }

    public String getRawSwitch(String str) {
        SettingProvider settingProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79708ca9", new Object[]{this, str});
        }
        Config config = getConfig();
        if (config != null && (settingProvider = config.getSettingProvider()) != null) {
            return settingProvider.getRawSwitch(str, null);
        }
        return null;
    }

    public SampledLogContext getStandaloneLogCtx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SampledLogContext) ipChange.ipc$dispatch("2dffba90", new Object[]{this}) : this.p;
    }

    public Object getStandaloneOptions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("309e0f88", new Object[]{this}) : this.o;
    }

    public boolean getSwitch(String str, boolean z) {
        SettingProvider settingProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c2620fd", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Config config = getConfig();
        return (config == null || (settingProvider = config.getSettingProvider()) == null) ? z : settingProvider.getSwitch(str, z);
    }

    public int getTagId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("558c0d99", new Object[]{this})).intValue() : this.i;
    }

    @Deprecated
    public Template getTemplate(String str, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("fd91a03b", new Object[]{this, str, resources});
        }
        try {
            return this.f.getTemplate(str, resources);
        } catch (SQLException e) {
            FBLogger.e("BirdNestEngine", e);
            return null;
        }
    }

    @Deprecated
    public TemplateStorage getTplStorage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateStorage) ipChange.ipc$dispatch("e2c9be6d", new Object[]{this}) : this.f;
    }

    @Deprecated
    public Map<String, TemplateStatus> handleBirdResponse(Map<String, String> map, Resources resources, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("752ce7b5", new Object[]{this, map, resources, map2});
        }
        String str = Platform.f5257a;
        return new HashMap();
    }

    @Deprecated
    public void preloadTemplateToMem(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c181122d", new Object[]{this, resources, str});
        } else {
            this.f.getTemplateFromResource(resources, str);
        }
    }

    @Deprecated
    public void removeTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4192d52f", new Object[]{this, str});
        } else {
            this.f.removeTpl(str);
        }
    }

    public void runOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
        } else {
            this.n.post(runnable);
        }
    }

    @Deprecated
    public void saveTemplate(Template template) throws SQLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803af903", new Object[]{this, template});
        } else {
            this.f.saveTemplate(template);
        }
    }

    public void setParamsEngine(Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618baff5", new Object[]{this, params});
        } else if (params == null) {
        } else {
            params.f5255a = this;
        }
    }

    public void setStandaloneOptsGenLogCtx(Object obj, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4004cc19", new Object[]{this, obj, str});
            return;
        }
        this.o = obj;
        this.p = new SampledLogContext(this) { // from class: com.alipay.birdnest.api.BirdNestEngine.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<?> f5253a = new ArrayList<>(1);

            @Override // com.alipay.birdnest.api.BirdNestEngine.SampledLogContext
            public String provideSampleLogIdentity() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("68110fe2", new Object[]{this});
                }
                return "std." + str;
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.SampledLogContext
            public ArrayList<?> provideSampleLogSpace() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ArrayList) ipChange2.ipc$dispatch("e3af6cce", new Object[]{this}) : this.f5253a;
            }
        };
    }

    @Deprecated
    public void triggerTemplateUpdate(Resources resources, TemplateFilter templateFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffffebb", new Object[]{this, resources, templateFilter});
        } else {
            String str = Platform.f5257a;
        }
    }

    /* loaded from: classes3.dex */
    public static class Params {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_INDEX_URL = "indexUrl";
        public static final String KEY_VIRTUAL_HOST = "virtualHost";

        /* renamed from: a  reason: collision with root package name */
        public BirdNestEngine f5255a;
        public int actionBarHeight;
        public Map<String, String> appParams;
        public String bizSource;
        public String bundleName;
        public String businessId;
        public OnLoadCallback callback;
        public Context context;
        public Resources contextResources;
        public boolean createImmediately;
        public DevicePropProvider devicePropProvider;
        public FBResourceClient.Type docType;
        public EventHandler dtmEventListener;
        public FBBridge eventBridge;
        public Object eventTarget;
        public Map<String, Object> extParams;
        public FBPluginFactory factory;
        public boolean inBg;
        public int initialWinHeight;
        public int initialWinWidth;
        public boolean jsDebugger;
        public JsPluginFactory jsPluginFactory;
        public TemplateKeyboardService keyboardService;
        public TElementEventHandler mElementEventObserver;
        public View paramView;
        public TemplatePasswordService passwordService;
        public e prepareTiming;
        public int renderOptFlag;
        public FBResourceClient resourceClient;
        public boolean reuse;
        public String tid;
        public boolean tmFlagsPrerenderV2;
        public String tplHtml;
        public String tplJson;
        public String ttime;
        public String tversion;
        public String varJson;

        public Params() {
            this.docType = FBResourceClient.Type.MAIN_FRAME;
            this.createImmediately = true;
            this.ttime = "";
            this.tversion = "";
            this.prepareTiming = e.a();
        }

        public String getContent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
            }
            String str = this.tplHtml;
            return (StringUtils.isEmpty(str) || StringUtils.equals("{}", str)) ? this.tplJson : str;
        }

        public BirdNestEngine getEngine() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BirdNestEngine) ipChange.ipc$dispatch("66fb5877", new Object[]{this}) : this.f5255a;
        }

        public Params(Params params) {
            this.docType = FBResourceClient.Type.MAIN_FRAME;
            this.createImmediately = true;
            this.ttime = "";
            this.tversion = "";
            this.f5255a = params.f5255a;
            this.extParams = params.extParams;
            this.docType = params.docType;
            this.createImmediately = params.createImmediately;
            this.tid = params.tid;
            this.ttime = params.ttime;
            this.tversion = params.tversion;
            this.tplHtml = params.tplHtml;
            this.tplJson = params.tplJson;
            this.varJson = params.varJson;
            this.bizSource = null;
            this.dtmEventListener = params.dtmEventListener;
            this.mElementEventObserver = params.mElementEventObserver;
            this.actionBarHeight = params.actionBarHeight;
            this.businessId = params.businessId;
            this.context = params.context;
            this.bundleName = params.bundleName;
            this.paramView = params.paramView;
            this.reuse = false;
            this.inBg = false;
            this.factory = params.factory;
            this.jsPluginFactory = params.jsPluginFactory;
            this.callback = params.callback;
            this.keyboardService = params.keyboardService;
            this.passwordService = params.passwordService;
            this.appParams = params.appParams;
            this.eventTarget = params.eventTarget;
            this.eventBridge = params.eventBridge;
            this.resourceClient = params.resourceClient;
            this.contextResources = null;
            this.devicePropProvider = params.devicePropProvider;
            this.jsDebugger = params.jsDebugger;
            this.initialWinWidth = params.initialWinWidth;
            this.initialWinHeight = params.initialWinHeight;
            this.renderOptFlag = params.renderOptFlag;
            this.tmFlagsPrerenderV2 = params.tmFlagsPrerenderV2;
            this.prepareTiming = e.a();
        }
    }

    public FBContext generateFBContext(Params params) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (FBContext) ipChange.ipc$dispatch("6833a20f", new Object[]{this, params});
        }
        String str = params.tplHtml;
        if (StringUtils.isEmpty(str) || StringUtils.equals("{}", str)) {
            str = params.tplJson;
        } else {
            i = 0;
        }
        FBResourceClient.Type type = params.docType;
        FBResourceClient.Type type2 = FBResourceClient.Type.MAIN_FRAME;
        if (type == type2 && (map = params.appParams) != null && params.resourceClient != null) {
            Object shouldInterceptResource = params.resourceClient.shouldInterceptResource(map.get(Params.KEY_INDEX_URL), type2);
            if (shouldInterceptResource instanceof String) {
                str = FBDocumentAssistor.a((String) shouldInterceptResource);
                if (str.charAt(0) == '<') {
                    params.tplHtml = str;
                    i = 21;
                } else {
                    params.tplJson = str;
                    i = 22;
                }
            }
        }
        return generateFBContext(params, str, i);
    }
}
