package com.taobao.themis.web.runtime;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.iuz;
import tb.kge;
import tb.tmg;
import tb.tmh;
import tb.tmj;

/* loaded from: classes9.dex */
public interface a extends g, iuz {

    /* renamed from: com.taobao.themis.web.runtime.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0982a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1934946521);
        }

        public static void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("103a5e20", new Object[]{aVar});
            } else {
                g.a.a(aVar);
            }
        }

        public static void a(a aVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50bc6bcb", new Object[]{aVar, page});
                return;
            }
            q.d(page, "page");
            g.a.a(aVar, page);
        }

        public static void c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2df975e", new Object[]{aVar});
            } else {
                g.a.c(aVar);
            }
        }
    }

    tmg a();

    void a(WVUCWebView wVUCWebView);

    tmj b();

    tmh d();

    Map<String, Long> e();

    Map<String, Object> f();
}
