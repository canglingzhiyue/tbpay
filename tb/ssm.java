package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.UiDisplayDetector;
import com.taobao.tao.topmultitab.c;

/* loaded from: classes7.dex */
public class ssm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "Page_Home";
    public static final String MONITOR_POINT = "searchbar_ui_monitor";
    public static final String UI_MODULE_SEARCH_BAR = "searchBar";

    /* renamed from: a  reason: collision with root package name */
    private final UiDisplayDetector f33887a = new UiDisplayDetector();

    static {
        kge.a(-1807559398);
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknownError" : "viewChildrenError" : "viewAlphaError" : "viewFrameError" : "viewSizeError" : "viewInvisible";
    }

    public void a(String str, String str2, DXTemplateItem dXTemplateItem, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b8a2b9", new Object[]{this, str, str2, dXTemplateItem, str3, str4});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", (Object) str);
        jSONObject.put("errorType", (Object) str2);
        Object obj = "";
        jSONObject.put("templateName", dXTemplateItem == null ? obj : dXTemplateItem.f11925a);
        if (dXTemplateItem != null) {
            obj = Long.valueOf(dXTemplateItem.b);
        }
        jSONObject.put("templateVersion", obj);
        AppMonitor.Alarm.commitFail("Page_Home", MONITOR_POINT, jSONObject.toJSONString(), str3, str4);
    }

    public void a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
        } else {
            a(UI_MODULE_SEARCH_BAR, "uiError", dXTemplateItem, "viewCreateError", "viewCreateError");
        }
    }

    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else if (!a() || !TextUtils.equals(oqc.a().l(), ksk.NEW_FACE_PARENT.f30287a)) {
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            e.e("HomeSearchUiMonitor", "start ui detect");
            DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
            int a2 = this.f33887a.a(dXRootView);
            if (a2 != 0) {
                String a3 = a(a2);
                a(UI_MODULE_SEARCH_BAR, "uiError", dxTemplateItem, a3, a3);
                e.e("HomeSearchUiMonitor", "doUiDetectInternal DxRootView errorType = " + a2);
            }
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            if (expandWidgetNode == null) {
                return;
            }
            if (c.a().w()) {
                View a4 = a(expandWidgetNode.queryWidgetNodeByUserId("searchContainer"));
                if (a4 != null) {
                    int a5 = this.f33887a.a(a4);
                    if (a5 != 0) {
                        String a6 = a(a5);
                        a("searchBox", "uiError", dxTemplateItem, a6, a6);
                        e.e("HomeSearchUiMonitor", "doUiDetectInternal searchBarContainer errorType = " + a5);
                    }
                } else {
                    e.e("HomeSearchUiMonitor", "doUiDetectInternal not found searchBarContainer");
                }
            }
            View a7 = a(expandWidgetNode.queryWidgetNodeByUserId("home_scroll"));
            if (a7 != null) {
                int a8 = this.f33887a.a(a7);
                if (a8 != 0) {
                    String a9 = a(a8);
                    a("tab", "uiError", dxTemplateItem, a9, a9);
                    e.e("HomeSearchUiMonitor", "doUiDetectInternal tab errorType = " + a8);
                }
            } else {
                e.e("HomeSearchUiMonitor", "doUiDetectInternal not found tabs");
            }
            View a10 = a(expandWidgetNode.queryWidgetNodeByUserId("tab1TextSelected"));
            if (a10 != null && c.a().w()) {
                int a11 = this.f33887a.a(a10);
                if (a11 != 0) {
                    a("tab", "selectedStateError", dxTemplateItem, "tabSelectedError", "tabSelectedError");
                    e.e("HomeSearchUiMonitor", "doUiDetectInternal selectedTab errorType = " + a11);
                }
            } else {
                e.e("HomeSearchUiMonitor", "doUiDetectInternal not found recommend selected tab");
            }
            e.e("HomeSearchUiMonitor", "end ui detect cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private View a(DXWidgetNode dXWidgetNode) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eb35c849", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode != null && (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) != null) {
            return dXRuntimeContext.v();
        }
        return null;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : j.a("enableSearchBarUiMonitor", true);
    }
}
