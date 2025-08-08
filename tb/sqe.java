package tb;

import android.graphics.Rect;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.homepage.windvane.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class sqe implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-775246754);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Arrays.asList("findDxViewInSearchBarPositionById", "getNaviBarHeight");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals(str, "getNaviBarHeight")) {
            return a(wVCallBackContext);
        }
        if (!StringUtils.equals(str, "findDxViewInSearchBarPositionById")) {
            return false;
        }
        return a(str2, wVCallBackContext);
    }

    private boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca15efa9", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        int a2 = a();
        if (a2 <= 0) {
            wVCallBackContext.error();
            lap.a("Bridge", "getHomePageNaviBar", "error: height小于0");
            return false;
        }
        rVar.a("height", Integer.valueOf(a2));
        rVar.a("rpxHeight", Float.valueOf(HomePageUtility.a(a2)));
        wVCallBackContext.success(rVar);
        lap.a("Bridge", "getHomePageNaviBar", "success. height:" + a2);
        return true;
    }

    private int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        try {
            lbq b = oiy.a().b();
            if (b != null) {
                return b.getHomePageManager().e().i();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        r rVar = new r();
        if (parseObject == null || parseObject.size() == 0) {
            rVar.a("errorMessage", "params is empty");
            wVCallBackContext.error(rVar);
            return false;
        }
        String string = parseObject.getString("userId");
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        lbq b = oiy.a().b();
        if (b == null) {
            rVar.a("errorMessage", "android pageProvider is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        lbo homePageManager = b.getHomePageManager();
        if (homePageManager == null) {
            rVar.a("errorMessage", "android pageManager is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        ohv e = homePageManager.e();
        if (e == null) {
            rVar.a("errorMessage", "android pageManager is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        DXRootView a2 = e.a();
        if (a2 == null) {
            rVar.a("errorMessage", "android DXRootView is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        DXWidgetNode expandWidgetNode = a2.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            rVar.a("errorMessage", "android DXRootView is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(string);
        if (queryWidgetNodeByUserId == null) {
            rVar.a("errorMessage", "android query userId DXWidgetNode  is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        DXRuntimeContext dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            rVar.a("errorMessage", "android DXRuntimeContext  is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        View v = dXRuntimeContext.v();
        if (v == null) {
            rVar.a("errorMessage", "android getNativeView  is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        Rect rect = new Rect();
        v.getGlobalVisibleRect(rect);
        rVar.a("rpxLeft", Float.valueOf(HomePageUtility.a(rect.left)));
        rVar.a("rpxRight", Float.valueOf(HomePageUtility.a(rect.right)));
        rVar.a("rpxBottom", Float.valueOf(HomePageUtility.a(rect.bottom)));
        rVar.a("rpxTop", Float.valueOf(HomePageUtility.a(rect.top)));
        wVCallBackContext.success(rVar);
        return true;
    }
}
