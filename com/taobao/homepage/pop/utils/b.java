package com.taobao.homepage.pop.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import tb.kyu;
import tb.kzq;
import tb.kzt;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_EVENT = -1;
    public static final int DEFAULT_STATUS_BAR_HEIGHT = 0;

    public static BasePopSectionModel<?> a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopSectionModel) ipChange.ipc$dispatch("28b696c3", new Object[]{dXRuntimeContext});
        }
        JSONObject e = dXRuntimeContext.e();
        if (e == null) {
            return null;
        }
        if (e instanceof BasePopSectionModel) {
            return (BasePopSectionModel) e;
        }
        return new PopSectionModel(e);
    }

    public static BasePopSectionModel<?> a(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopSectionModel) ipChange.ipc$dispatch("be3a13a5", new Object[]{dXRuntimeContext, jSONObject});
        }
        BasePopSectionModel<?> a2 = a(dXRuntimeContext);
        if (a2 == null) {
            c.b("PopDxUtils ", "sectionModel == null");
            return null;
        }
        return a2.createBaseSectionModel(jSONObject);
    }

    public static kyu b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kyu) ipChange.ipc$dispatch("fcb079c5", new Object[]{dXRuntimeContext});
        }
        kzq e = e(dXRuntimeContext);
        if (e != null) {
            return e.a();
        }
        return null;
    }

    public static IPopData c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("bc6ea7cb", new Object[]{dXRuntimeContext});
        }
        kzq e = e(dXRuntimeContext);
        if (e != null) {
            return e.b();
        }
        return null;
    }

    public static String d(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e546104", new Object[]{dXRuntimeContext});
        }
        kyu b = b(dXRuntimeContext);
        if (b != null) {
            return b.d().b();
        }
        return null;
    }

    private static kzq e(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kzq) ipChange.ipc$dispatch("a377c267", new Object[]{dXRuntimeContext});
        }
        DXRootView s = dXRuntimeContext.s();
        if (s == null) {
            c.a("PopDxUtils ", "getPopEngine error, rootView is null");
            return null;
        }
        Object tag = s.getTag(PopConst.DX_POP_USER_CONTEXT_TAG);
        if (!(tag instanceof kzq)) {
            c.a("PopDxUtils ", "getPopEngine error, PopDxUserContext not found");
            return null;
        }
        return (kzq) tag;
    }

    public static View a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("52a699f6", new Object[]{view, str});
        }
        if (view == null) {
            c.a("PopDxUtils ", "card view is empty");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            c.a("PopDxUtils ", "itemBizCode is empty");
            return view;
        } else {
            DXWidgetNode b = b(view);
            if (b == null) {
                c.a("PopDxUtils ", "expend widgetNode is null, itemCode=" + str);
                return null;
            }
            DXWidgetNode queryWidgetNodeByUserId = b.queryWidgetNodeByUserId(str);
            if (queryWidgetNodeByUserId == null) {
                c.a("PopDxUtils ", "dxWidgetNode by userId is null, itemCode=" + str);
                return null;
            }
            return queryWidgetNodeByUserId.getDXRuntimeContext().v();
        }
    }

    public static DXRootView a(View view) {
        ViewGroup viewGroup;
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("fd04df2d", new Object[]{view});
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) == 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return (DXRootView) childAt;
            }
        }
        return null;
    }

    public static DXWidgetNode b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("81801968", new Object[]{view});
        }
        DXRootView a2 = a(view);
        if (a2 == null) {
            c.a("PopDxUtils ", "dxRootView is null");
            return null;
        }
        return a2.getExpandWidgetNode();
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1607243192:
                if (str.equals("endTime")) {
                    c = 2;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals("cancel")) {
                    c = 0;
                    break;
                }
                break;
            case -907680051:
                if (str.equals("scroll")) {
                    c = 3;
                    break;
                }
                break;
            case 951117504:
                if (str.equals("confirm")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            return kzt.DXTBPOPEVENTLAYOUT_ONPOPCANCEL;
        }
        if (c == 1) {
            return kzt.DXTBPOPEVENTLAYOUT_ONPOPCONFIRM;
        }
        if (c == 2) {
            return kzt.DXTBPOPEVENTLAYOUT_ONPOPTIMEOUT;
        }
        if (c == 3) {
            return kzt.DXTBPOPEVENTLAYOUT_ONPOPSCROLL;
        }
        return -1L;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        try {
            return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Throwable th) {
            c.a("getStatusBarHeight error", th);
            return 0;
        }
    }
}
