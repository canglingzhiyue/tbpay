package com.taobao.message.chat.component.chatinput.node;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper;
import com.taobao.message.lab.comfrm.support.dinamic.DxCustemDataEvent;
import com.taobao.message.lab.comfrm.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "show", "", "invoke", "com/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$2$1"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1 extends Lambda implements rul<Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ChatKeyboardHelper $this_apply;
    public final /* synthetic */ DXGrowingTextInputViewWidgetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1(ChatKeyboardHelper chatKeyboardHelper, DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode) {
        super(1);
        this.$this_apply = chatKeyboardHelper;
        this.this$0 = dXGrowingTextInputViewWidgetNode;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ t mo2421invoke(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9923577", new Object[]{this, bool});
        }
        invoke(bool.booleanValue());
        return t.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
            return;
        }
        DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode = this.this$0;
        if (!DXGrowingTextInputViewWidgetNode.$ipChange && !z) {
            DXGrowingTextInputViewWidgetNode.access$setHasFilterFirstHideEvent$p(this.this$0, true);
            return;
        }
        DXGrowingTextInputViewWidgetNode.access$setHasFilterFirstHideEvent$p(this.this$0, true);
        if (z) {
            Logger.e("DXGrowingTextInputViewWidgetNode", "show");
            DXGrowingTextInputViewWidgetNode.access$postMyEvent(this.this$0, new DxCustemDataEvent(3900591102591836612L));
            return;
        }
        Logger.e("DXGrowingTextInputViewWidgetNode", "hide");
        DXGrowingTextInputViewWidgetNode.access$postMyEvent(this.this$0, new DxCustemDataEvent(-403229045508524899L));
    }
}
