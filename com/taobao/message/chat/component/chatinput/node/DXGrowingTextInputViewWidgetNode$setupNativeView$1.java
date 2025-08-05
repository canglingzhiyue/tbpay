package com.taobao.message.chat.component.chatinput.node;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class DXGrowingTextInputViewWidgetNode$setupNativeView$1 implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DXGrowingTextInputViewWidgetNode$setupNativeView$1 INSTANCE = new DXGrowingTextInputViewWidgetNode$setupNativeView$1();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, event})).booleanValue();
        }
        q.a((Object) event, "event");
        if (event.getActionMasked() == 1) {
            if (!(view instanceof EditText)) {
                view = null;
            }
            EditText editText = (EditText) view;
            if (editText != null) {
                editText.setCursorVisible(true);
            }
        }
        return false;
    }
}
