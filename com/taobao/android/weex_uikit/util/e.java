package com.taobao.android.weex_uikit.util;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.ui.aa;
import com.taobao.taobao.R;
import tb.jvo;
import tb.jvp;
import tb.jwy;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1424529651);
    }

    public static boolean a(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b13e567a", new Object[]{aaVar})).booleanValue() : aaVar != null && aaVar.getNodeType() == UINodeType.VIEW;
    }

    public static boolean b(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8a38b99", new Object[]{aaVar})).booleanValue() : aaVar != null && (aaVar.getNodeType() == UINodeType.DRAWABLE || aaVar.getNodeType() == UINodeType.VIEW);
    }

    public static void a(Object obj, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e37d3d5", new Object[]{obj, rect});
        } else if (obj instanceof View) {
            ((View) obj).setPadding(rect.left, rect.top, rect.right, rect.bottom);
        } else if (!(obj instanceof Drawable)) {
        } else {
            ((jwy) obj).a(rect);
        }
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
            return;
        }
        view.setTag(R.string.mus_view_tag, null);
        view.setOnClickListener(null);
        view.setOnLongClickListener(null);
        view.setClickable(false);
        view.setLongClickable(false);
        b(view);
        if (Build.VERSION.SDK_INT >= 16) {
            view.setImportantForAccessibility(0);
        }
        view.setContentDescription(null);
    }

    private static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
        } else {
            view.setPadding(0, 0, 0, 0);
        }
    }

    public static void a(UINode uINode, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3be6bb2", new Object[]{uINode, view});
            return;
        }
        view.setTag(R.string.mus_view_tag, uINode);
        b(uINode, view);
        c(uINode, view);
        a(view, uINode.getPadding());
        view.setContentDescription(uINode.getAriaLabel());
        if (!uINode.getNodeInfo().C() || Build.VERSION.SDK_INT < 16) {
            return;
        }
        view.setImportantForAccessibility(2);
    }

    public static void b(UINode uINode, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317de3b3", new Object[]{uINode, view});
        } else if (!uINode.hasEvent("click")) {
        } else {
            view.setOnClickListener(new jvo(uINode.getInstance(), uINode.getNodeId()));
            view.setClickable(true);
        }
    }

    public static void c(UINode uINode, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3d5bb4", new Object[]{uINode, view});
        } else if (!uINode.hasEvent("longtap")) {
        } else {
            view.setOnLongClickListener(new jvp(uINode.getInstance(), uINode.getNodeId()));
            view.setLongClickable(true);
        }
    }

    public static void a(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b9198e", new Object[]{view, drawable});
            return;
        }
        if (view.getVisibility() != 0) {
            z = false;
        }
        drawable.setVisible(z, false);
        drawable.setCallback(view);
    }
}
