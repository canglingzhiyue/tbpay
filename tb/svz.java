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
import com.taobao.android.weex_framework.util.a;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.homepage.windvane.b;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class svz implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1561381725);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("getHomePageViewPosition");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a(str2, wVCallBackContext);
    }

    public boolean a(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String str2 = null;
        try {
            jSONObject = JSONObject.parseObject(str);
        } catch (Exception e) {
            lap.a("Bridge", "getHomePageViewPosition", "parse params exception:" + e.getMessage());
            jSONObject = null;
        }
        r rVar = new r();
        if (jSONObject == null || jSONObject.size() == 0) {
            rVar.a("errorMessage", "params is empty");
            wVCallBackContext.error(rVar);
            return false;
        }
        String string = jSONObject.getString("homePageViewId");
        if (StringUtils.isEmpty(string)) {
            wVCallBackContext.error(rVar);
            return false;
        }
        if (string.contains("&")) {
            String[] split = string.split("&");
            String str3 = split[0];
            if (split.length >= 2) {
                str2 = split[1];
            }
            string = str3;
        }
        if (StringUtils.equals(string, "DXSearchBar")) {
            return a(a(str2, rVar), rVar, wVCallBackContext);
        }
        IHomeSubTabController z = c.a().z();
        if (z == null) {
            rVar.a("errorMessage", "homeSubTabController is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        View viewBySectionBizCodeAndItemBizCode = z.getViewBySectionBizCodeAndItemBizCode(string, str2);
        if (StringUtils.equals(string, com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.TAB_SECTION_CODE)) {
            return a(viewBySectionBizCodeAndItemBizCode, rVar, wVCallBackContext);
        }
        if (!a(viewBySectionBizCodeAndItemBizCode)) {
            rVar.a("errorMessage", "view is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        return a(viewBySectionBizCodeAndItemBizCode, rVar, wVCallBackContext);
    }

    private boolean a(View view, r rVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9e3bbc1", new Object[]{this, view, rVar, wVCallBackContext})).booleanValue();
        }
        if (view == null) {
            rVar.a("errorMessage", "view is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        rVar.a(a.ATOM_EXT_find, globalVisibleRect ? "true" : "false");
        if (globalVisibleRect) {
            rVar.a("centerXRpx", Float.valueOf(HomePageUtility.a((rect.right + rect.left) / 2)));
            rVar.a("centerYRpx", Float.valueOf(HomePageUtility.a((rect.bottom + rect.top) / 2)));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("leftTopXRpx", (Object) Float.valueOf(HomePageUtility.a(rect.left)));
            jSONObject.put("leftTopYRpx", (Object) Float.valueOf(HomePageUtility.a(rect.top)));
            jSONObject.put("widthRpx", (Object) Float.valueOf(HomePageUtility.a(rect.right - rect.left)));
            jSONObject.put("heightRpx", (Object) Float.valueOf(HomePageUtility.a(rect.bottom - rect.top)));
            rVar.a("componentArea", jSONObject);
        }
        wVCallBackContext.success(rVar);
        return true;
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z = ((double) (((float) (globalVisibleRect ? rect.width() : 0)) / ((float) view.getWidth()))) > 0.5d && ((double) (((float) (globalVisibleRect ? rect.height() : 0)) / ((float) view.getHeight()))) > 0.5d;
            lbq b = oiy.a().b();
            int i = b != null ? b.getHomePageManager().e().i() : 0;
            if (z && rect.centerY() > i) {
                return true;
            }
        }
        return false;
    }

    private View a(String str, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3990f8a", new Object[]{this, str, rVar});
        }
        lbq b = oiy.a().b();
        if (b == null) {
            rVar.a("errorMessage", "android pageProvider is null");
            return null;
        }
        lbo homePageManager = b.getHomePageManager();
        if (homePageManager == null) {
            rVar.a("errorMessage", "android pageManager is null");
            return null;
        }
        ohv e = homePageManager.e();
        if (e == null) {
            rVar.a("errorMessage", "android pageManager is null");
            return null;
        }
        DXRootView a2 = e.a();
        if (a2 == null) {
            rVar.a("errorMessage", "android DXRootView is null");
            return null;
        }
        DXWidgetNode expandWidgetNode = a2.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            rVar.a("errorMessage", "android DXRootView is null");
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str);
        if (queryWidgetNodeByUserId == null) {
            rVar.a("errorMessage", "android query userId DXWidgetNode  is null");
            return null;
        }
        DXRuntimeContext dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            rVar.a("errorMessage", "android DXRuntimeContext  is null");
            return null;
        }
        View v = dXRuntimeContext.v();
        if (v != null) {
            return v;
        }
        rVar.a("errorMessage", "android getNativeView  is null");
        return null;
    }
}
