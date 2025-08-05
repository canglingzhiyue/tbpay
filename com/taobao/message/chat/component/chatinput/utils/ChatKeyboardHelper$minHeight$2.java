package com.taobao.message.chat.component.chatinput.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.DisplayUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ChatKeyboardHelper$minHeight$2 extends Lambda implements ruk<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ChatKeyboardHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatKeyboardHelper$minHeight$2(ChatKeyboardHelper chatKeyboardHelper) {
        super(0);
        this.this$0 = chatKeyboardHelper;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Integer] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public /* synthetic */ Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Integer.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, java.lang.Integer] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7560ccf2", new Object[]{this})).intValue();
        }
        ChatKeyboardHelper chatKeyboardHelper = this.this$0;
        return DisplayUtil.dip2px(ChatKeyboardHelper.$ipChange, DisplayUtil.DEF_KEYBOARD_HEIGHT);
    }
}
