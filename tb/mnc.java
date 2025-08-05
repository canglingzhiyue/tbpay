package tb;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mnc extends mnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mnc INSTANCE = new mnc();

    /* renamed from: a  reason: collision with root package name */
    private String f31129a;

    private mnc() {
    }

    @Override // tb.mnf
    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue() : view instanceof WebView;
    }

    @Override // tb.mnb
    public int b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9103723c", new Object[]{this, view})).intValue();
        }
        WebView webView = (WebView) view;
        String url = webView.getUrl();
        if (!TextUtils.equals(this.f31129a, url)) {
            this.f31129a = url;
            return 0;
        }
        return webView.getProgress();
    }
}
