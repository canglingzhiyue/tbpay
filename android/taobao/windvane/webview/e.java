package android.taobao.windvane.webview;

import java.util.Map;
import tb.adj;

/* loaded from: classes2.dex */
public interface e {
    com.taobao.analysis.v3.n getFalcoSpan();

    Map<String, String> getOpenTracingContext();

    adj getSpanWrapper();

    void setFalcoSpan(com.taobao.analysis.v3.n nVar);
}
