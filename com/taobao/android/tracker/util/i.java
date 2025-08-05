package com.taobao.android.tracker.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.IRenderResult;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_KEY_ARG1 = "agr1";
    public static final String ATTR_KEY_ATTR = "attr";
    public static final String ATTR_KEY_CLASS = "class";
    public static final String ATTR_KEY_DATA_POINT_INDEX = "data-point-index";
    public static final String ATTR_KEY_DATA_SPM = "data-spm";
    public static final String ATTR_KEY_DATA_TRACKER = "data-tracker";
    public static final String ATTR_KEY_ID = "id";
    public static final String ATTR_KEY_INDEX = "index";

    static {
        kge.a(1771681702);
    }

    public static View a(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{view});
        }
        if (view != null && (parent = view.getParent()) != null && (parent instanceof View)) {
            return (View) parent;
        }
        return null;
    }

    public static String a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("753e6136", new Object[]{view, new Boolean(z)});
        }
        String a2 = a(view, ATTR_KEY_DATA_TRACKER);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        if (!z) {
            return null;
        }
        String a3 = a(view, "id");
        if (!TextUtils.isEmpty(a3)) {
            return a3;
        }
        String a4 = a(view, "class");
        if (TextUtils.isEmpty(a4)) {
            return null;
        }
        return a4;
    }

    public static String a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35f0ec6c", new Object[]{view, str});
        }
        WXAttr c = c(view);
        if (c == null) {
            return null;
        }
        return a(c, str);
    }

    public static WXComponent b(View view) {
        IRenderResult iRenderResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("4c30d552", new Object[]{view});
        }
        if (view != null && (view instanceof IRenderResult) && (iRenderResult = (IRenderResult) view) != null) {
            return iRenderResult.getComponent();
        }
        return null;
    }

    public static WXAttr a(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAttr) ipChange.ipc$dispatch("61a1dc3e", new Object[]{wXComponent});
        }
        if (wXComponent != null) {
            return wXComponent.getAttrs();
        }
        return null;
    }

    public static WXAttr c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAttr) ipChange.ipc$dispatch("35feb983", new Object[]{view});
        }
        WXComponent b = b(view);
        if (b == null) {
            return null;
        }
        return a(b);
    }

    public static String a(WXAttr wXAttr, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3385e4b9", new Object[]{wXAttr, str});
        }
        if (wXAttr == null || (obj = wXAttr.get(str)) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Integer) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        return ((JSONObject) obj).toJSONString();
    }

    public static String a(View view, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b6ac600", new Object[]{view, str, new Boolean(z)});
        }
        if (view == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            for (WXComponent b = b(view); b != null; b = b.getParent()) {
                WXAttr a2 = a(b);
                String a3 = a(a2, ATTR_KEY_DATA_SPM);
                String a4 = a(a2, str);
                if (!TextUtils.isEmpty(a3) || !TextUtils.isEmpty(a4)) {
                    return a4;
                }
            }
            return null;
        }
        return a(view, str);
    }

    public static String d(View view) {
        WXSDKInstance wXComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c229379", new Object[]{view});
        }
        WXComponent b = b(view);
        if (b != null && (wXComponent = b.getInstance()) != null) {
            return wXComponent.ak();
        }
        return null;
    }

    public static boolean a(String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1815378", new Object[]{str, view, new Boolean(z)})).booleanValue() : !TextUtils.isEmpty(a(view, z));
    }

    public static String b(View view, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46a6b92d", new Object[]{view, str});
        }
        WXComponent b = b(view);
        while (true) {
            str2 = null;
            if (b == null) {
                break;
            }
            WXAttr a2 = a(b);
            if (a2 != null) {
                str2 = a(a2, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                break;
            }
            b = b.getParent();
        }
        return str2;
    }
}
