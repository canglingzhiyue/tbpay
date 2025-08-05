package android.taobao.windvane.extra.uc.pool;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVCoreSettings;
import android.taobao.windvane.extra.uc.WVGlobalState;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.monitor.a;
import android.taobao.windvane.webview.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.utils.c;
import com.taobao.themis.kernel.utils.n;
import com.uc.webview.export.WebView;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class WebViewPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Themis/Performance/Render";
    private static volatile Context sApplicationContext;
    private static final AtomicBoolean sInitialized;
    private static boolean sIsFirstPreCreate;
    private static CancelableTask sLastTask;
    private static final LinkedList<WVUCWebView> sWebViewPool;

    public static /* synthetic */ void access$000(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df811a47", new Object[]{new Long(j), new Boolean(z)});
        } else {
            preCreateWebViewWithDelay(j, z);
        }
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            preCreateWebView();
        }
    }

    static {
        kge.a(-1724882976);
        sWebViewPool = new LinkedList<>();
        sInitialized = new AtomicBoolean(false);
        sLastTask = null;
        sIsFirstPreCreate = true;
    }

    public static synchronized void setUp(Context context) {
        synchronized (WebViewPool.class) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ac527a4", new Object[]{context});
            } else if (context == null) {
            } else {
                if (sInitialized.compareAndSet(false, true)) {
                    if (context instanceof Application) {
                        sApplicationContext = context;
                    } else {
                        sApplicationContext = context.getApplicationContext();
                    }
                    final long j = 0;
                    try {
                        j = n.b(i.GROUP_THEMIS_COMMON_CONFIG, "wvWebPreCreateInitialDelay", 0);
                    } catch (Exception e) {
                        e.a(RVLLevel.Error, TAG, "getIntConfigLocal error: " + e.getMessage());
                    }
                    if (c.a(context)) {
                        WVCoreSettings.getInstance().setCoreEventCallback2(new b() { // from class: android.taobao.windvane.extra.uc.pool.WebViewPool.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                                if (str.hashCode() == 1847240272) {
                                    super.onUCCorePrepared();
                                    return null;
                                }
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                            }

                            @Override // android.taobao.windvane.webview.a
                            public void onUCCorePrepared() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                                    return;
                                }
                                super.onUCCorePrepared();
                                WebViewPool.access$000(j, false);
                            }
                        });
                    } else {
                        preCreateWebViewWithDelay(j.commonConfig.cQ, false);
                    }
                    if (sApplicationContext == null) {
                        z = false;
                    }
                    e.a(RVLLevel.Info, TAG).a("setUp").a("enable", Boolean.valueOf(j.commonConfig.cH)).a("webViewCreateDelayTimeMs", Long.valueOf(j.commonConfig.cQ)).a("initialDelay", Long.valueOf(j)).a("success", Boolean.valueOf(z)).a();
                }
            }
        }
    }

    public static WVUCWebView acquirePreCreateWebView(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("c4b04b86", new Object[]{context});
        }
        WVUCWebView poll = sWebViewPool.poll();
        if (poll != null) {
            Context context2 = poll.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context);
            }
            e.a(RVLLevel.Info, TAG).a("acquire").a("type", (Object) "webview").a();
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hitCache", (Object) Boolean.valueOf(z));
        a.commitSuccess("WVWebViewPreCreate", jSONObject.toJSONString());
        preCreateWebViewWithDelay(j.commonConfig.cQ, true);
        return poll;
    }

    private static void preCreateWebView() {
        Long l;
        Long l2;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a91921", new Object[0]);
        } else if (sApplicationContext == null || !j.commonConfig.cH) {
        } else {
            int i = j.commonConfig.cR;
            if (i <= 0) {
                i = 1;
            }
            if (sWebViewPool.size() >= i || !WVCore.getInstance().isUCSupport()) {
                return;
            }
            boolean urlHasBeenLoaded = WVGlobalState.urlHasBeenLoaded();
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z = sIsFirstPreCreate;
            sIsFirstPreCreate = false;
            MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(sApplicationContext);
            final WVUCWebView wVUCWebView = new WVUCWebView(mutableContextWrapper);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            wVUCWebView.setPreCreated(true);
            if (!c.a(sApplicationContext)) {
                sWebViewPool.push(wVUCWebView);
            } else if (urlHasBeenLoaded) {
                sWebViewPool.push(wVUCWebView);
            } else {
                l2 = Long.valueOf(SystemClock.uptimeMillis());
                wVUCWebView.setWebViewClient(new WVUCWebViewClient(mutableContextWrapper) { // from class: android.taobao.windvane.extra.uc.pool.WebViewPool.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                        if (str.hashCode() == -332805219) {
                            super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                    public void onPageFinished(WebView webView, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                            return;
                        }
                        super.onPageFinished(webView, str);
                        e.a(RVLLevel.Info, WebViewPool.TAG).a("onPageFinished").a();
                        WebViewPool.access$100();
                        try {
                            wVUCWebView.destroy();
                        } catch (Exception e) {
                            e.a(RVLLevel.Error, WebViewPool.TAG).a("destroy").a("error", (Object) e.getMessage()).a();
                        }
                    }
                });
                wVUCWebView.loadDataWithBaseURL(null, TemplateDocument.CONTENT, "text/html", "utf-8", null);
                l = Long.valueOf(SystemClock.uptimeMillis());
                wVUCWebView.getWebViewContext().setPreCreateInfo(new PreCreateInfo(uptimeMillis, uptimeMillis2, z, l2, l));
                j = 0;
                if (l2 != null && l != null) {
                    j = l.longValue() - l2.longValue();
                }
                e.a(RVLLevel.Info, TAG).a("preCreate").a("createCost", Long.valueOf(uptimeMillis2 - uptimeMillis)).a("loadUrlCost", Long.valueOf(j)).a("isFirstCreate", Boolean.valueOf(z)).a("type", (Object) "webview").a("urlHasBeenLoaded", Boolean.valueOf(urlHasBeenLoaded)).a();
            }
            l2 = null;
            l = null;
            wVUCWebView.getWebViewContext().setPreCreateInfo(new PreCreateInfo(uptimeMillis, uptimeMillis2, z, l2, l));
            j = 0;
            if (l2 != null) {
                j = l.longValue() - l2.longValue();
            }
            e.a(RVLLevel.Info, TAG).a("preCreate").a("createCost", Long.valueOf(uptimeMillis2 - uptimeMillis)).a("loadUrlCost", Long.valueOf(j)).a("isFirstCreate", Boolean.valueOf(z)).a("type", (Object) "webview").a("urlHasBeenLoaded", Boolean.valueOf(urlHasBeenLoaded)).a();
        }
    }

    private static void preCreateWebViewWithDelay(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda9dcfa", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            return;
        }
        if (z) {
            try {
                if (sLastTask != null) {
                    sLastTask.cancel();
                }
            } catch (Exception e) {
                e.a(RVLLevel.Error, TAG).a("preCreate").a("error", (Object) e.getMessage()).a();
                return;
            }
        }
        CancelableTask cancelableTask = new CancelableTask() { // from class: android.taobao.windvane.extra.uc.pool.WebViewPool.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.uc.pool.CancelableTask
            public void doRun() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4e76a87", new Object[]{this});
                } else {
                    WebViewPool.access$100();
                }
            }

            @Override // android.taobao.windvane.extra.uc.pool.CancelableTask
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    e.a(RVLLevel.Info, WebViewPool.TAG).a("cancel").a();
                }
            }
        };
        sLastTask = cancelableTask;
        if (i == 0 && c.a(sApplicationContext) && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            cancelableTask.run();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(cancelableTask, j);
        }
    }
}
