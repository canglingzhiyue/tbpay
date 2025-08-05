package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ovl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1297883464);
    }

    public JSONObject a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dbebad99", new Object[]{this, iHomeSubTabController});
        }
        String d = d(iHomeSubTabController);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        return c.a(d);
    }

    public JSONObject b(IHomeSubTabController iHomeSubTabController) {
        JSONObject d;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bc6d7578", new Object[]{this, iHomeSubTabController});
        }
        String d2 = d(iHomeSubTabController);
        if (!TextUtils.isEmpty(d2) && (d = HomePageUtility.d()) != null && (jSONObject = d.getJSONObject("subSection")) != null) {
            return jSONObject.getJSONObject(d2);
        }
        return null;
    }

    public void c(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38f2e37", new Object[]{this, iHomeSubTabController});
            return;
        }
        String d = d(iHomeSubTabController);
        lap.a("topMultiTab", "SearchBarCallback", "setSubTabSearchBarData, subType : " + d);
        ohv c = c();
        if (c == null) {
            lap.a("topMultiTab", "SearchBarCallback", "getTabBarHeight, searchBarManager is null");
        } else if (b(iHomeSubTabController) == null) {
            lap.a("topMultiTab", "SearchBarCallback", "oldSubTab is null，不允许设置");
        } else {
            c.p();
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        ohv c = c();
        if (c == null) {
            lap.a("topMultiTab", "SearchBarCallback", "getTabBarHeight, searchBarManager is null");
            return -1;
        }
        return c.i() - sfm.STATUS_HEIGHT_PX;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue();
        }
        ohv c = c();
        if (c == null) {
            lap.a("topMultiTab", "SearchBarCallback", "getSearchBarHeight, searchBarManager is null");
            return -1.0f;
        }
        return c.i();
    }

    public Map<String, Integer> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2});
        }
        ohv c = c();
        if (c == null) {
            lap.a("topMultiTab", "SearchBarCallback", "getSearchBarLocation, searchBarManager is null");
            return null;
        }
        return a(c, str2);
    }

    public JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{this, new Integer(i)});
        }
        ldf.d("SearchBarCallback", "getSelfTabInformation,position:" + i);
        JSONObject jSONObject = new JSONObject();
        if (i < 0) {
            ldf.d("SearchBarCallback", "position<0,position:" + i);
            return jSONObject;
        }
        JSONObject d = sqg.d();
        if (d == null) {
            return jSONObject;
        }
        try {
            return d.getJSONObject(String.valueOf(i));
        } catch (Exception e) {
            ldf.d("SearchBarCallback", "getCurrentTabInformation exception: " + e);
            return jSONObject;
        }
    }

    private ohv c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ohv) ipChange.ipc$dispatch("1e6bf9bf", new Object[]{this});
        }
        lbq b = oiy.a().b();
        if (b == null) {
            lap.a("topMultiTab", "SearchBarCallback", "pageProvider == null");
            return null;
        }
        lbo homePageManager = b.getHomePageManager();
        if (homePageManager == null) {
            lap.a("topMultiTab", "SearchBarCallback", "homePageManager == null");
            return null;
        }
        return homePageManager.e();
    }

    private String d(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77fd714a", new Object[]{this, iHomeSubTabController}) : com.taobao.tao.topmultitab.c.a().a(iHomeSubTabController);
    }

    private Map<String, Integer> a(ohv ohvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a65b27a", new Object[]{this, ohvVar, str});
        }
        DXRootView a2 = ohvVar.a();
        if (a2 == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> dxRootView为空，没有找到" + str);
            return null;
        }
        DXWidgetNode flattenWidgetNode = a2.getFlattenWidgetNode();
        if (flattenWidgetNode == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> flattenWidgetNode为空，没有找到" + str);
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(str);
        if (queryWidgetNodeByUserId == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> widgetNode为空，没有找到" + str);
            return null;
        }
        WeakReference<View> wRView = queryWidgetNodeByUserId.getWRView();
        if (wRView == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> weakReference为空，没有找到" + str);
            return null;
        }
        View view = wRView.get();
        if (view == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> 没有找到" + str + "对应的nativeView");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(view.getWidth()));
        hashMap.put("height", Integer.valueOf(view.getHeight()));
        hashMap.put("positionX", Integer.valueOf(iArr[0]));
        hashMap.put("positionY", Integer.valueOf(iArr[1]));
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> 找到了" + str + " 的坐标信息：" + hashMap);
        return hashMap;
    }
}
