package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.util.a;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import com.taobao.themis.kernel.utils.v;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.INetworkDelegate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class WVNetworkDelegate extends INetworkDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindVane/Image";
    private boolean isHeicAcceptHeaderDisabledOnLowEnd;
    private boolean isLowDeviceLevel;
    private final Context mContext;

    static {
        kge.a(1277751062);
    }

    public WVNetworkDelegate(Context context) {
        d a2;
        boolean z = false;
        this.isLowDeviceLevel = false;
        this.isHeicAcceptHeaderDisabledOnLowEnd = false;
        this.mContext = context;
        v expDetail = ImageExperiment.getExpDetail();
        if (expDetail != null && expDetail.b()) {
            this.isHeicAcceptHeaderDisabledOnLowEnd = true;
        }
        if (this.isHeicAcceptHeaderDisabledOnLowEnd && (a2 = c.a()) != null) {
            int a3 = a2.a("deviceLevel", -1);
            this.isLowDeviceLevel = a3 >= 2;
            RVLLevel rVLLevel = RVLLevel.Info;
            e.a(rVLLevel, TAG, "deviceLevel: " + a3);
        }
        RVLLevel rVLLevel2 = RVLLevel.Info;
        StringBuilder sb = new StringBuilder();
        sb.append("heicDisabled: ");
        if (this.isHeicAcceptHeaderDisabledOnLowEnd && this.isLowDeviceLevel) {
            z = true;
        }
        sb.append(z);
        e.a(rVLLevel2, TAG, sb.toString());
    }

    @Override // com.uc.webview.export.extension.INetworkDelegate
    public void onBeforeSendRequest(WebView webView, INetworkDelegate.IRequestData iRequestData) {
        String str;
        String str2;
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288e18cf", new Object[]{this, webView, iRequestData});
        } else if (iRequestData == null) {
        } else {
            String url = iRequestData.getUrl();
            if (!a.b(url) || !shouldModifyAcceptHeader(url)) {
                return;
            }
            if (!ExtImgDecoder.getInstance().canExtImgDecoder()) {
                e.a(RVLLevel.Error, TAG, "image decoder is not ready.");
                return;
            }
            Map<String, String> headers = iRequestData.getHeaders();
            if (isMainDocumentRequest(headers)) {
                e.a(RVLLevel.Error, TAG, "main document request, skip adding accept: " + url);
            } else if (this.isHeicAcceptHeaderDisabledOnLowEnd && this.isLowDeviceLevel) {
            } else {
                boolean isFeatureOpened = ABGlobal.isFeatureOpened(this.mContext, "wvEnableHeicAccept");
                boolean useAlphaChannelDecoder = ExtImgDecoder.getInstance().useAlphaChannelDecoder();
                if (!isFeatureOpened && !useAlphaChannelDecoder) {
                    return;
                }
                m.e(TAG, "add heic accept " + isFeatureOpened + " " + useAlphaChannelDecoder + " " + url);
                if (headers == null) {
                    headers = new HashMap<>();
                }
                Iterator<Map.Entry<String, String>> it = headers.entrySet().iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (next != null && (key = next.getKey()) != null && key.equalsIgnoreCase("accept")) {
                        str = next.getValue();
                        str2 = next.getKey();
                        break;
                    }
                }
                if (StringUtils.isEmpty(str2)) {
                    str2 = HttpRequest.HEADER_ACCEPT;
                }
                if (isFeatureOpened) {
                    if (StringUtils.isEmpty(str)) {
                        str = "image/heic";
                    } else {
                        str = "image/heic," + str;
                    }
                }
                if (useAlphaChannelDecoder) {
                    if (StringUtils.isEmpty(str)) {
                        str = "image/heia";
                    } else {
                        str = "image/heia," + str;
                    }
                }
                iRequestData.setHeader(str2, str);
            }
        }
    }

    private static boolean isMainDocumentRequest(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7997411", new Object[]{map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        try {
            for (String str2 : map.keySet()) {
                if (str2.equalsIgnoreCase(HttpRequest.HEADER_ACCEPT)) {
                    str = map.get(str2);
                    break;
                }
            }
        } catch (Exception unused) {
        }
        str = null;
        return str != null && str.toLowerCase().contains("text/html");
    }

    private static boolean shouldModifyAcceptHeader(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f122c3b7", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.contains("/O1CN")) {
            return true;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (!StringUtils.equals("gw.alicdn.com", host)) {
                    if (StringUtils.equals("img.alicdn.com", host)) {
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
