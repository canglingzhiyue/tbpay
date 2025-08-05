package com.taobao.message.chat.component.chatinput.utils;

import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ChatKeyboardHelper$decorView$2 extends Lambda implements ruk<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ChatKeyboardHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatKeyboardHelper$decorView$2(ChatKeyboardHelper chatKeyboardHelper) {
        super(0);
        this.this$0 = chatKeyboardHelper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final View mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("287bc381", new Object[]{this});
        }
        ChatKeyboardHelper chatKeyboardHelper = this.this$0;
        Window window = ChatKeyboardHelper.$ipChange.getWindow();
        q.a((Object) window, "aty.window");
        return window.getDecorView();
    }
}
