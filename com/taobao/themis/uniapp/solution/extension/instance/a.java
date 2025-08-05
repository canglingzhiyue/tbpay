package com.taobao.themis.uniapp.solution.extension.instance;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.sud;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/instance/IMTOPPrefetchExtension;", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "prefetch", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "pageId", "", "pageUrl", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface a extends sud {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.uniapp.solution.extension.instance.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0979a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-499465693);
        }

        public static void a(a aVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b670f7", new Object[]{aVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(aVar, instance);
        }

        public static void b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d17226b3", new Object[]{aVar});
            } else {
                sud.a.b(aVar);
            }
        }
    }

    void a(ITMSPage iTMSPage);

    void a(String str, String str2);
}
