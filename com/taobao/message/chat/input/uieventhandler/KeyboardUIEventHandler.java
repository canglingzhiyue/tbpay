package com.taobao.message.chat.input.uieventhandler;

import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.message.chat.component.chatinput.node.IGrowingTextInput;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/message/chat/input/uieventhandler/KeyboardUIEventHandler;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class KeyboardUIEventHandler extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-743821899);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXRootView s;
        DXWidgetNode expandWidgetNode;
        DXRootView s2;
        DXWidgetNode expandWidgetNode2;
        DXRootView s3;
        DXWidgetNode expandWidgetNode3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        IGrowingTextInput iGrowingTextInput = null;
        Object a2 = objArr != null ? g.a(objArr, 0) : null;
        if (!(a2 instanceof String)) {
            a2 = null;
        }
        String str = (String) a2;
        if (str == null) {
            return;
        }
        Object a3 = objArr != null ? g.a(objArr, 1) : null;
        if (!(a3 instanceof String)) {
            a3 = null;
        }
        String str2 = (String) a3;
        if (str2 == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1302916015:
                if (!str.equals("openKeyboard")) {
                    return;
                }
                DXWidgetNode queryWidgetNodeByUserId = (dXRuntimeContext == null || (s = dXRuntimeContext.s()) == null || (expandWidgetNode = s.getExpandWidgetNode()) == null) ? null : expandWidgetNode.queryWidgetNodeByUserId(str2);
                if (queryWidgetNodeByUserId instanceof IGrowingTextInput) {
                    iGrowingTextInput = queryWidgetNodeByUserId;
                }
                IGrowingTextInput iGrowingTextInput2 = iGrowingTextInput;
                if (iGrowingTextInput2 == null) {
                    return;
                }
                iGrowingTextInput2.showSoftInput();
                return;
            case -708785223:
                if (!str.equals("returnKeyClick")) {
                    return;
                }
                Object a4 = objArr != null ? g.a(objArr, 2) : null;
                if (!(a4 instanceof String)) {
                    a4 = null;
                }
                if (q.a((Object) ((String) a4), (Object) "1")) {
                    return;
                }
                DXWidgetNode queryWidgetNodeByUserId2 = (dXRuntimeContext == null || (s2 = dXRuntimeContext.s()) == null || (expandWidgetNode2 = s2.getExpandWidgetNode()) == null) ? null : expandWidgetNode2.queryWidgetNodeByUserId(str2);
                if (!(queryWidgetNodeByUserId2 instanceof IGrowingTextInput)) {
                    queryWidgetNodeByUserId2 = null;
                }
                IGrowingTextInput iGrowingTextInput3 = (IGrowingTextInput) queryWidgetNodeByUserId2;
                if (iGrowingTextInput3 == null || !q.a((Object) str, (Object) "returnKeyClick")) {
                    return;
                }
                iGrowingTextInput3.setText(null);
                return;
            case -108511653:
                if (!str.equals("openCustom")) {
                    return;
                }
                break;
            case 1065964361:
                if (!str.equals(MspEventTypes.ACTION_STRING_HIDE_KEYBOARD)) {
                    return;
                }
                break;
            default:
                return;
        }
        DXWidgetNode queryWidgetNodeByUserId3 = (dXRuntimeContext == null || (s3 = dXRuntimeContext.s()) == null || (expandWidgetNode3 = s3.getExpandWidgetNode()) == null) ? null : expandWidgetNode3.queryWidgetNodeByUserId(str2);
        if (queryWidgetNodeByUserId3 instanceof IGrowingTextInput) {
            iGrowingTextInput = queryWidgetNodeByUserId3;
        }
        IGrowingTextInput iGrowingTextInput4 = (IGrowingTextInput) iGrowingTextInput;
        if (iGrowingTextInput4 == null) {
            return;
        }
        iGrowingTextInput4.hideSoftInput();
    }
}
