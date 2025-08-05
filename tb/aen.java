package tb;

import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.o;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class aen implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(801262431);
        kge.a(1845411121);
    }

    public void a(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01caed6", new Object[]{this, iWVWebView, str});
        }
    }

    public o b(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("51badd93", new Object[]{this, iWVWebView, str});
        }
        return null;
    }

    public boolean c(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("879fa65c", new Object[]{this, iWVWebView, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        ael aelVar = new ael(false);
        if (i != 1008) {
            switch (i) {
                case 1001:
                    return aelVar;
                case 1002:
                    a(aejVar.f25289a, aejVar.b);
                    return aelVar;
                case 1003:
                    aelVar.f25290a = c(aejVar.f25289a, aejVar.b);
                    return aelVar;
                case 1004:
                    break;
                case 1005:
                    ((Integer) objArr[0]).intValue();
                    return aelVar;
                default:
                    return null;
            }
        }
        o b = b(aejVar.f25289a, aejVar.b);
        if (b == null) {
            return aelVar;
        }
        aelVar.f25290a = true;
        aelVar.b = b;
        return aelVar;
    }
}
