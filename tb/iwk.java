package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/page/IMTOPPrefetchPageExtension;", "Lcom/taobao/themis/kernel/extension/page/IPageExtension;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface iwk extends g {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1686708084);
        }

        public static void a(iwk iwkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee8058bb", new Object[]{iwkVar});
            } else {
                g.a.a(iwkVar);
            }
        }

        public static void a(iwk iwkVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54fa6f66", new Object[]{iwkVar, page});
                return;
            }
            q.d(page, "page");
            g.a.a(iwkVar, page);
        }

        public static void c(iwk iwkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb8665bd", new Object[]{iwkVar});
            } else {
                g.a.c(iwkVar);
            }
        }
    }
}
