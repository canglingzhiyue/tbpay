package android.taobao.windvane.extra.uc.prefetch;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import tb.kge;

/* loaded from: classes2.dex */
public class ResourcePrefetch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final ResourcePrefetch INSTANCE;
    private static final String MODULE = "WindVane/Prefetch";

    public WebResourceResponse fetch(WebView webView, ResourceRequest resourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("11905a01", new Object[]{this, webView, resourceRequest});
        }
        return null;
    }

    static {
        kge.a(-479725185);
        INSTANCE = new ResourcePrefetch();
    }

    private ResourcePrefetch() {
    }

    public static ResourcePrefetch getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResourcePrefetch) ipChange.ipc$dispatch("a5819894", new Object[0]) : INSTANCE;
    }

    @Deprecated
    public void prefetch(ResourceRequest resourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4425d5c", new Object[]{this, resourceRequest});
        } else {
            e.a(RVLLevel.Warn, MODULE, "prefetch is deprecated");
        }
    }
}
