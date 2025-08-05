package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.h;
import com.taobao.android.jarviswe.a;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.jarvis.JarvisKitModule;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.musie.j;
import com.taobao.search.sf.weex.module.SearchOpenModule;
import com.taobao.search.weex.component.InShopSearchComponent;
import com.taobao.search.weex.module.SearchEventModule;
import com.taobao.search.weex.module.SearchHistoryModule;
import com.taobao.tao.Globals;
import com.taobao.weex.WXSDKEngine;

/* loaded from: classes8.dex */
public class nya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2128634533);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule(JarvisKitModule.MODULE_NAME, JarvisKitModule.class);
            WXSDKEngine.registerModule(SearchEventModule.MODULE_NAME, SearchEventModule.class);
            WXSDKEngine.registerModule("TBSearchHistory", SearchHistoryModule.class);
            WXSDKEngine.registerModule("SearchOpen", SearchOpenModule.class);
            WXSDKEngine.registerComponent("shopAuctionList", InShopSearchComponent.class);
            SearchXslSdk.install();
            a.a().b();
            j.a(Globals.getApplication());
            try {
                h.a().a(Globals.getApplication());
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            k.a("SearchWeexBundle", "register err", th);
        }
    }
}
