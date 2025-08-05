package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J \u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\"\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u0016\u001a\u00020\u000bH&J\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/container/IContainerHelper;", "", "getContainerType", "Lcom/taobao/themis/kernel/TMSContainerType;", "init", "Lcom/taobao/themis/kernel/TMSInstance;", "url", "", "extraData", "Lcom/alibaba/fastjson/JSONObject;", "launch", "", "solutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "renderListener", "Lcom/taobao/themis/kernel/TMSInstance$IRenderListener;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", MessageID.onDestroy, "reload", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface trk {
    f a(String str, JSONObject jSONObject);

    void a(TMSSolutionType tMSSolutionType, f.c cVar);

    TMSContainerType j();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1188979796);
        }

        public static /* synthetic */ f a(trk trkVar, String str, JSONObject jSONObject, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("73c7757", new Object[]{trkVar, str, jSONObject, new Integer(i), obj});
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            return trkVar.a(str, jSONObject);
        }

        public static /* synthetic */ void a(trk trkVar, TMSSolutionType tMSSolutionType, f.c cVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feaee236", new Object[]{trkVar, tMSSolutionType, cVar, new Integer(i), obj});
            } else if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
            } else {
                if ((i & 1) != 0) {
                    tMSSolutionType = null;
                }
                if ((i & 2) != 0) {
                    cVar = null;
                }
                trkVar.a(tMSSolutionType, cVar);
            }
        }
    }
}
