package tb;

import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class adr implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<IWVWebView> f25272a;

    static {
        kge.a(-433912640);
        kge.a(1845411121);
    }

    public adr(IWVWebView iWVWebView) {
        this.f25272a = new WeakReference<>(iWVWebView);
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        WeakReference<IWVWebView> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        try {
            if (i == 3006) {
                WeakReference<IWVWebView> weakReference2 = this.f25272a;
                if (weakReference2 == null) {
                    return null;
                }
                IWVWebView iWVWebView = weakReference2.get();
                if (iWVWebView != null) {
                    iWVWebView.fireEvent((String) objArr[0], (String) objArr[1]);
                } else if (!m.a()) {
                    return null;
                } else {
                    m.c("WVJsPatchListener", "WVJsPatchListener is free");
                    return null;
                }
            } else if (i != 3014 || (weakReference = this.f25272a) == null) {
                return null;
            } else {
                IWVWebView iWVWebView2 = weakReference.get();
                if (iWVWebView2 != null) {
                    iWVWebView2.fireEvent("WV.Event.APP.TakeScreenshot", "{}");
                } else if (!m.a()) {
                    return null;
                } else {
                    m.c("WVJsPatchListener", "WVJsPatchListener is free");
                    return null;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
