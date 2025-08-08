package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.IImageLoader;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.f;
import com.taobao.pha.core.h;
import com.taobao.pha.core.j;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.k;
import com.taobao.pha.core.l;
import com.taobao.pha.core.n;
import com.taobao.pha.core.p;
import com.taobao.pha.core.phacontainer.b;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import com.taobao.pha.webview.PHAPopUpWebView;
import com.taobao.pha.webview.c;
import com.taobao.uikit.extend.component.TBProgressBar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public abstract class ngy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private static final AtomicBoolean sHasInited;

    public void afterSetup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ec2a08", new Object[]{this});
        }
    }

    public a getBridgeApiHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("961dd714", new Object[]{this});
        }
        return null;
    }

    public ngq getDataSourceProviderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngq) ipChange.ipc$dispatch("3c8a5e89", new Object[]{this});
        }
        return null;
    }

    public abstract com.taobao.pha.core.tabcontainer.a getDowngradeHandler();

    public Map<String, String> getEnvironmentOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7991a33d", new Object[]{this});
        }
        return null;
    }

    public nfy getH5WebViewFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfy) ipChange.ipc$dispatch("7a83fdaa", new Object[]{this});
        }
        return null;
    }

    public nel getJsiHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nel) ipChange.ipc$dispatch("8075364a", new Object[]{this});
        }
        return null;
    }

    public j getLocaleHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("8227cadf", new Object[]{this});
        }
        return null;
    }

    public nga getPageViewFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nga) ipChange.ipc$dispatch("77c0dcf7", new Object[]{this});
        }
        return null;
    }

    public ngb getPreRenderViewHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngb) ipChange.ipc$dispatch("e86254b4", new Object[]{this});
        }
        return null;
    }

    public IPullRefreshLayout.a getPullRefreshLayoutFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullRefreshLayout.a) ipChange.ipc$dispatch("cbe3652b", new Object[]{this});
        }
        return null;
    }

    public nfi getSsrFilterHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfi) ipChange.ipc$dispatch("9236f798", new Object[]{this});
        }
        return null;
    }

    static {
        kge.a(1809199444);
        TAG = ngy.class.getSimpleName();
        sHasInited = new AtomicBoolean(false);
    }

    public ngh getWebViewFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngh) ipChange.ipc$dispatch("a092c629", new Object[]{this}) : new ngh() { // from class: tb.ngy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ngh
            public ngf a(Context context, String str, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ngf) ipChange2.ipc$dispatch("5f26d5de", new Object[]{this, context, str, map}) : AgooConstants.MESSAGE_POPUP.equals(str) ? new c(new PHAPopUpWebView(context, map)) : new c(context);
            }
        };
    }

    public IImageLoader getImageLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IImageLoader) ipChange.ipc$dispatch("1bc62f8a", new Object[]{this}) : new ngx();
    }

    public com.taobao.pha.core.c getAssetsHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.c) ipChange.ipc$dispatch("fe646dfd", new Object[]{this}) : new nee();
    }

    public h getConfigProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("aa70c250", new Object[]{this}) : new neg();
    }

    public b getDataPrefetchFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("48603029", new Object[]{this}) : new b() { // from class: tb.ngy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public nhe f31458a = null;

            @Override // com.taobao.pha.core.phacontainer.b
            public nfd a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (nfd) ipChange2.ipc$dispatch("7c72d9e8", new Object[]{this, str});
                }
                if (!StringUtils.isEmpty(str) && !"mtop".equals(str)) {
                    return null;
                }
                if (this.f31458a == null) {
                    this.f31458a = new nhe();
                }
                return this.f31458a;
            }

            @Override // com.taobao.pha.core.phacontainer.b
            public nfe a(AppController appController, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (nfe) ipChange2.ipc$dispatch("6460dab9", new Object[]{this, appController, str});
                }
                if (!"triverMtop".equals(str)) {
                    return null;
                }
                return new nhd(appController);
            }
        };
    }

    public f getBroadcastHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("93fee508", new Object[]{this}) : new nef();
    }

    public k getLogHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("6d4c7800", new Object[]{this}) : new ngz();
    }

    public nfc getMonitorHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfc) ipChange.ipc$dispatch("fc25d28e", new Object[]{this}) : new nha();
    }

    public nfu getStorageHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfu) ipChange.ipc$dispatch("6824b39d", new Object[]{this}) : new nhi();
    }

    public l getUserTrack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("bc3c98cd", new Object[]{this}) : new nhb();
    }

    public nfg getNetworkHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfg) ipChange.ipc$dispatch("990062de", new Object[]{this}) : new nhc();
    }

    public nfa getProgressBarFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfa) ipChange.ipc$dispatch("ee8629dc", new Object[]{this}) : new nfa() { // from class: tb.ngy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nfa
            public nez a(Context context) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (nez) ipChange2.ipc$dispatch("34c6d0e3", new Object[]{this, context});
                }
                final TBProgressBar tBProgressBar = new TBProgressBar(context);
                tBProgressBar.setMax(100);
                if (Build.VERSION.SDK_INT >= 26) {
                    tBProgressBar.setMin(0);
                }
                return new nez() { // from class: tb.ngy.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.nez
                    public void a(int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                            return;
                        }
                        if (i == 0) {
                            tBProgressBar.resetProgress();
                        }
                        tBProgressBar.setCurrentProgress(i);
                    }

                    @Override // tb.nez
                    public View a() {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? (View) ipChange3.ipc$dispatch("195fbaaa", new Object[]{this}) : tBProgressBar;
                    }
                };
            }
        };
    }

    public ney getDevToolsLoggerHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ney) ipChange.ipc$dispatch("3807133f", new Object[]{this}) : new ngw();
    }

    public void start(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586dc6dd", new Object[]{this, application, hashMap});
            return;
        }
        String str = "PHA V2 process name:" + android.taobao.windvane.util.a.c(application) + ", pkg name:" + application.getPackageName() + ", inited" + sHasInited.get();
        if (sHasInited.get() || !sHasInited.compareAndSet(false, true)) {
            return;
        }
        try {
            if (p.d()) {
                return;
            }
            Map<String, String> environmentOptions = getEnvironmentOptions();
            if (environmentOptions == null) {
                environmentOptions = new HashMap<>();
                environmentOptions.put("appGroup", "AliApp");
                environmentOptions.put("appName", RVEnvironmentService.PLATFORM_TB);
            }
            p.a(application, new n.a().a(environmentOptions).a(getImageLoader()).a(getAssetsHandler()).a(getWebViewFactory()).a(getPageViewFactory()).a(getPreRenderViewHandler()).a(getDataPrefetchFactory()).a(getLogHandler()).a(getMonitorHandler()).a(getStorageHandler()).a(getUserTrack()).a(getNetworkHandler()).a(getBridgeApiHandler()).a(getBroadcastHandler()).a(getDowngradeHandler()).a(getPullRefreshLayoutFactory()).a(getLocaleHandler()).a(getDataSourceProviderFactory()).a(getProgressBarFactory()).a(getDevToolsLoggerHandler()).a(getSsrFilterHandler()).a(getJsiHandler()).a(), getConfigProvider());
            afterSetup();
            ngr.c(TAG, "PHA V2 initialized succeed.");
        } catch (Throwable th) {
            th.printStackTrace();
            ngr.b(TAG, "PHA V2 initialized failed.\n" + Log.getStackTraceString(th));
        }
    }
}
