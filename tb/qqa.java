package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.tao.homepage.launcher.f;
import com.taobao.tao.recommend2.view.widget.weex.NestedScrollViewWXContainer;
import com.taobao.tao.recommend4.manager.weex.RecommendWeexContainerView;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.weex.WXSDKEngine;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public class qqa implements com.taobao.tao.homepage.windvane.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes9.dex */
    public interface b {

        /* loaded from: classes9.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(-339189064);
            }

            public static void a(b bVar, ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("722cd064", new Object[]{bVar, page});
                } else {
                    q.d(page, "page");
                }
            }

            public static void b(b bVar, ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9b8125a5", new Object[]{bVar, page});
                } else {
                    q.d(page, "page");
                }
            }

            public static void c(b bVar, ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c4d57ae6", new Object[]{bVar, page});
                } else {
                    q.d(page, "page");
                }
            }

            public static void d(b bVar, ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee29d027", new Object[]{bVar, page});
                } else {
                    q.d(page, "page");
                }
            }

            public static void e(b bVar, ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("177e2568", new Object[]{bVar, page});
                } else {
                    q.d(page, "page");
                }
            }

            public static void f(b bVar, ITMSPage page) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("40d27aa9", new Object[]{bVar, page});
                } else {
                    q.d(page, "page");
                }
            }
        }

        void a(ITMSPage iTMSPage);

        void b(ITMSPage iTMSPage);

        void c(ITMSPage iTMSPage);

        void d(ITMSPage iTMSPage);

        void e(ITMSPage iTMSPage);

        void f(ITMSPage iTMSPage);
    }

    static {
        kge.a(-663527132);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("initRecContainer");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a(wVCallBackContext);
    }

    private boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca15efa9", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        try {
            if (!f.a()) {
                WXSDKEngine.registerComponent("MC-ContainerView", NestedScrollViewWXContainer.class);
                WXSDKEngine.registerComponent("RC-RecommendContainer", RecommendWeexContainerView.class);
                MUSEngine.registerPlatformView("rc-recomment-container", RecommendWeex2ContainerView.class);
                f.a(true);
            }
            wVCallBackContext.success("success");
        } catch (Throwable th) {
            ksp.c("homepage.HomePageWVPlugin", "initFavoriteWeex exception e = " + th.toString());
            wVCallBackContext.success();
        }
        return true;
    }
}
