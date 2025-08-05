package android.taobao.windvane.extra.performance;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dqn;
import tb.kge;
import tb.oxv;
import tb.qgm;

/* loaded from: classes2.dex */
public class BuiltinWebViewPageModel implements dqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WVUCWebView webView;

    static {
        kge.a(145345858);
        kge.a(-966459203);
    }

    public BuiltinWebViewPageModel(WVUCWebView wVUCWebView) {
        this.webView = wVUCWebView;
    }

    @Override // tb.dqn
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
            return;
        }
        oxv oxvVar = (oxv) qgm.a().a(oxv.class);
        if (oxvVar == null) {
            return;
        }
        oxvVar.a(this.webView, str, j);
    }

    @Override // tb.dqn
    public void onProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
            return;
        }
        oxv oxvVar = (oxv) qgm.a().a(oxv.class);
        if (oxvVar == null) {
            return;
        }
        oxvVar.a(this.webView, str, obj);
    }

    @Override // tb.dqn
    public void onStageIfAbsent(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a227e", new Object[]{this, str, new Long(j)});
            return;
        }
        oxv oxvVar = (oxv) qgm.a().a(oxv.class);
        if (oxvVar == null) {
            return;
        }
        oxvVar.b(this.webView, str, j);
    }

    @Override // tb.dqn
    public void onPropertyIfAbsent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eb9d7", new Object[]{this, str, obj});
            return;
        }
        oxv oxvVar = (oxv) qgm.a().a(oxv.class);
        if (oxvVar == null) {
            return;
        }
        oxvVar.b(this.webView, str, obj);
    }
}
