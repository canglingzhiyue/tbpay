package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.sf.weex.module.XSearchEventModule;
import com.taobao.search.weex.module.SearchEventModule;
import com.taobao.search.weex.module.SearchFestivalModule;
import com.taobao.search.weex.module.SearchTimeModule;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import tb.nyd;

/* loaded from: classes8.dex */
public class nyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static nyb f31836a;
    private boolean b = false;

    static {
        kge.a(-2131877398);
        f31836a = new nyb();
    }

    private nyb() {
    }

    public static nyb a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nyb) ipChange.ipc$dispatch("f087807", new Object[0]) : f31836a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b) {
        } else {
            this.b = true;
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = null;
        try {
            WXSDKEngine.registerModule(SearchEventModule.MODULE_NAME, SearchEventModule.class);
            WXSDKEngine.registerModule(SearchFestivalModule.MODULE_NAME, SearchFestivalModule.class);
            WXSDKEngine.registerModule(SearchTimeModule.MODULE_NAME, SearchTimeModule.class);
            WXSDKEngine.registerModule("xsearchEvent", XSearchEventModule.class);
            z = true;
        } catch (WXException e) {
            q.b("SearchWeexManager", "注册搜索weex模块异常");
            str = e.getMessage();
        }
        if (z) {
            nyd.a.a(nyd.a.REGISTER_MODULES);
            return;
        }
        if (str == null) {
            str = "";
        }
        nyd.a.a(nyd.a.REGISTER_MODULES, "fail", str);
    }
}
