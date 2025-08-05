package com.taobao.android.weex_uikit.widget.musview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.search.musie.weex.MusWeex;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.weex_uikit.widget.musview.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0623a {

        /* renamed from: a  reason: collision with root package name */
        public int f16193a;
        public int b;

        static {
            kge.a(-427521186);
        }
    }

    static {
        kge.a(-1626821049);
    }

    public static MUSUrlHost a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSUrlHost) ipChange.ipc$dispatch("92280793", new Object[]{context}) : new MUSUrlHost(context);
    }

    public static void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(MusWeex.ATTR_SCRIPT_URL, str);
        }
    }

    public static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49ec9", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("bundleUrl", str);
        }
    }

    public static void a(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae4b65d0", new Object[]{uINode, jSONObject});
        } else {
            uINode.setAttribute("data", jSONObject);
        }
    }

    public static void b(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5744811", new Object[]{uINode, jSONObject});
        } else {
            uINode.setAttribute("env", jSONObject);
        }
    }

    public static void a(UINode uINode, m<C0623a> mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d9b733", new Object[]{uINode, mVar});
        } else {
            mVar.a(new C0623a());
        }
    }

    public static void a(UINode uINode, int i, int i2, int i3, int i4, int[] iArr, C0623a c0623a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391208f1", new Object[]{uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, c0623a});
            return;
        }
        if (i3 == 1073741824) {
            iArr[0] = i;
        } else {
            iArr[0] = c0623a.f16193a;
        }
        if (i4 == 1073741824) {
            iArr[1] = i2;
        } else {
            iArr[1] = c0623a.b;
        }
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, MUSUrlHost mUSUrlHost, C0623a c0623a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc24cf70", new Object[]{uINode, mUSDKInstance, mUSUrlHost, c0623a});
            return;
        }
        c0623a.f16193a = 0;
        c0623a.b = 0;
        View renderRoot = mUSDKInstance.getRenderRoot();
        if (renderRoot instanceof MUSView) {
            ((MUSView) renderRoot).setRecycleWhenDetach(false);
        }
        String str = (String) uINode.getAttribute("bundleUrl");
        if (TextUtils.isEmpty(str)) {
            str = mUSDKInstance.getInstanceEnv("bundleUrl");
        }
        mUSUrlHost.mount(uINode, (String) uINode.getAttribute(MusWeex.ATTR_SCRIPT_URL), str, (JSONObject) uINode.getAttribute("data"), (JSONObject) uINode.getAttribute("env"), c0623a);
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, MUSUrlHost mUSUrlHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a681d2d", new Object[]{uINode, mUSDKInstance, mUSUrlHost});
        } else {
            mUSUrlHost.unmount();
        }
    }
}
