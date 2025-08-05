package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J&\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Lcom/taobao/infoflow/webview/util/UmbrellaUtil;", "", "()V", "assembleUmbrellaArgs", "", "", "solutionType", "pageUrl", "commitFailureUmbrella", "", "phase", "errorCode", "errorMsg", "businessId", "commitSuccessUmbrella", "Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class tbw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tbw INSTANCE;

    static {
        kge.a(-875751459);
        INSTANCE = new tbw();
    }

    private tbw() {
    }

    public final void a(String phase, String businessId, TMSEmbedSolutionType solutionType, String pageUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c4cef9", new Object[]{this, phase, businessId, solutionType, pageUrl});
            return;
        }
        q.d(phase, "phase");
        q.d(businessId, "businessId");
        q.d(solutionType, "solutionType");
        q.d(pageUrl, "pageUrl");
        ldk.a(phase, "container", "1.0", ljk.MAIN_BIZ_NAME, businessId, a(solutionType.name(), pageUrl));
    }

    public final void a(String phase, String errorCode, String errorMsg, String businessId, String solutionType, String pageUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{this, phase, errorCode, errorMsg, businessId, solutionType, pageUrl});
            return;
        }
        q.d(phase, "phase");
        q.d(errorCode, "errorCode");
        q.d(errorMsg, "errorMsg");
        q.d(businessId, "businessId");
        q.d(solutionType, "solutionType");
        q.d(pageUrl, "pageUrl");
        ldk.a(phase, "container", "1.0", ljk.MAIN_BIZ_NAME, businessId, a(solutionType, pageUrl), errorCode, errorMsg);
    }

    private final Map<String, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("containerType", str);
        hashMap.put("pageUrl", str2);
        return hashMap;
    }
}
