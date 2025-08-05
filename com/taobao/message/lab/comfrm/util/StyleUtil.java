package com.taobao.message.lab.comfrm.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.gbg;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/taobao/message/lab/comfrm/util/StyleUtil;", "", "()V", "getLength", "", "context", "Landroid/content/Context;", a.ATOM_length, "", "processStyle", "", "view", "Landroid/view/View;", "style", "", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class StyleUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final StyleUtil INSTANCE;

    static {
        kge.a(2139009656);
        INSTANCE = new StyleUtil();
    }

    private StyleUtil() {
    }

    @JvmStatic
    public static final void processStyle(View view, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deee123c", new Object[]{view, map});
            return;
        }
        q.d(view, "view");
        if (map == null) {
            return;
        }
        if (q.a((Object) "gone", (Object) ExtentionFunctionKt.safeGetString(map, "visibility", "visible"))) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
        String safeGetString$default = ExtentionFunctionKt.safeGetString$default(map, "width", null, 2, null);
        String safeGetString$default2 = ExtentionFunctionKt.safeGetString$default(map, "height", null, 2, null);
        if (view.getLayoutParams() != null) {
            if (safeGetString$default != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                StyleUtil styleUtil = INSTANCE;
                Context context = view.getContext();
                q.b(context, "view.context");
                layoutParams.width = styleUtil.getLength(context, safeGetString$default);
            }
            if (safeGetString$default2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                StyleUtil styleUtil2 = INSTANCE;
                Context context2 = view.getContext();
                q.b(context2, "view.context");
                layoutParams2.height = styleUtil2.getLength(context2, safeGetString$default2);
            }
        }
        String safeGetString$default3 = ExtentionFunctionKt.safeGetString$default(map, "marginTop", null, 2, null);
        String safeGetString$default4 = ExtentionFunctionKt.safeGetString$default(map, "marginBottom", null, 2, null);
        String safeGetString$default5 = ExtentionFunctionKt.safeGetString$default(map, "marginLeft", null, 2, null);
        String safeGetString$default6 = ExtentionFunctionKt.safeGetString$default(map, "marginRight", null, 2, null);
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        if (safeGetString$default3 != null) {
            StyleUtil styleUtil3 = INSTANCE;
            Context context3 = view.getContext();
            q.b(context3, "view.context");
            marginLayoutParams.topMargin = styleUtil3.getLength(context3, safeGetString$default3);
        }
        if (safeGetString$default4 != null) {
            StyleUtil styleUtil4 = INSTANCE;
            Context context4 = view.getContext();
            q.b(context4, "view.context");
            marginLayoutParams.bottomMargin = styleUtil4.getLength(context4, safeGetString$default4);
        }
        if (safeGetString$default5 != null) {
            StyleUtil styleUtil5 = INSTANCE;
            Context context5 = view.getContext();
            q.b(context5, "view.context");
            marginLayoutParams.leftMargin = styleUtil5.getLength(context5, safeGetString$default5);
        }
        if (safeGetString$default6 == null) {
            return;
        }
        StyleUtil styleUtil6 = INSTANCE;
        Context context6 = view.getContext();
        q.b(context6, "view.context");
        marginLayoutParams.rightMargin = styleUtil6.getLength(context6, safeGetString$default6);
    }

    private final int getLength(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a51aff42", new Object[]{this, context, str})).intValue();
        }
        if (q.a((Object) str, (Object) "match_content")) {
            return -2;
        }
        if (q.a((Object) str, (Object) "match_parent")) {
            return -1;
        }
        int a2 = gbg.a(context, str, -10);
        if (a2 != -10) {
            return a2 / 2;
        }
        return -2;
    }
}
