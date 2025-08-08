package android.taobao.windvane.extra.uc.preRender;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.webview.f;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class PreRenderWebView extends WVUCWebView implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long expireTime;
    public boolean isPreRender;
    private boolean preRenderSuccess;
    private String realUrl;

    static {
        kge.a(1659939124);
        kge.a(1847775823);
    }

    public static /* synthetic */ Object ipc$super(PreRenderWebView preRenderWebView, String str, Object... objArr) {
        if (str.hashCode() == 1626033557) {
            super.onAttachedToWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void preRenderInit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80c4c9a", new Object[]{this, str});
        }
    }

    public PreRenderWebView(Context context) {
        super(context);
        this.isPreRender = false;
        this.preRenderSuccess = false;
        this.expireTime = 0L;
        this.realUrl = null;
    }

    public PreRenderWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isPreRender = false;
        this.preRenderSuccess = false;
        this.expireTime = 0L;
        this.realUrl = null;
    }

    public PreRenderWebView(Context context, Map<String, String> map) {
        super(context, map);
        this.isPreRender = false;
        this.preRenderSuccess = false;
        this.expireTime = 0L;
        this.realUrl = null;
    }

    public PreRenderWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isPreRender = false;
        this.preRenderSuccess = false;
        this.expireTime = 0L;
        this.realUrl = null;
    }

    public PreRenderWebView(WVUCWebView.Builder builder) {
        super(builder);
        this.isPreRender = false;
        this.preRenderSuccess = false;
        this.expireTime = 0L;
        this.realUrl = null;
    }

    private String getAttachData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b012494", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.realUrl)) {
            return "{}";
        }
        return "{ \"url\": \"" + this.realUrl + "\" }";
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.isPreRender) {
            return;
        }
        fireEvent(BasePreInitManager.ATTACH_EVENT, getAttachData());
        if (getUCExtension() != null) {
            post(new Runnable() { // from class: android.taobao.windvane.extra.uc.preRender.PreRenderWebView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (PreRenderWebView.this.getUCExtension() == null) {
                    } else {
                        PreRenderWebView.this.getUCExtension().setIsPreRender(false);
                    }
                }
            });
        }
        try {
            getWebViewContext().getWebViewPageModel().onProperty("H5_PreRender", true);
            getWebViewContext().getWebViewPageModel().onProperty("H5_URL", getUrl());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.isPreRender = false;
    }

    public boolean isPreRenderSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5fc877f", new Object[]{this})).booleanValue() : this.preRenderSuccess;
    }

    public void setPreRenderSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac079e81", new Object[]{this, new Boolean(z)});
        } else {
            this.preRenderSuccess = z;
        }
    }

    public long getExpireTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17b347fd", new Object[]{this})).longValue() : this.expireTime;
    }

    public void setExpireTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158cc94f", new Object[]{this, new Long(j)});
        } else {
            this.expireTime = j;
        }
    }

    public void setRealUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ba0d80", new Object[]{this, str});
        } else {
            this.realUrl = str;
        }
    }

    @Override // android.taobao.windvane.webview.f
    public boolean isPreRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3d4411a", new Object[]{this})).booleanValue() : this.isPreRender;
    }
}
