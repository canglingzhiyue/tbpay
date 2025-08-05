package com.taobao.themis.widget.kernal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/taobao/themis/widget/kernal/IWidgetPageExtension;", "Lcom/taobao/themis/kernel/extension/page/IPageExtension;", "Lcom/taobao/themis/widget/IWidgetControllerExtension;", "onRenderError", "", "errorCode", "", "errorMsg", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface a extends com.taobao.themis.kernel.extension.page.g, com.taobao.themis.widget.e {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.widget.kernal.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0984a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-822920454);
        }

        public static void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33a55ff1", new Object[]{aVar});
            } else {
                g.a.a(aVar);
            }
        }

        public static void a(a aVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc15889c", new Object[]{aVar, page});
                return;
            }
            q.d(page, "page");
            g.a.a(aVar, page);
        }

        public static void c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1e141af", new Object[]{aVar});
            } else {
                g.a.c(aVar);
            }
        }
    }

    void b(String str, String str2);
}
