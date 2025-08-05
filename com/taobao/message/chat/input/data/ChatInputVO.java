package com.taobao.message.chat.input.data;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010,\u001a\u00020\u0000J\u000e\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/taobao/message/chat/input/data/ChatInputVO;", "", "()V", "forceRefreshSign", "", "getForceRefreshSign", "()J", "setForceRefreshSign", "(J)V", "initText", "", "getInitText", "()Ljava/lang/String;", "setInitText", "(Ljava/lang/String;)V", "inputMode", "", "inputMode$annotations", "getInputMode", "()I", "setInputMode", "(I)V", "panelStatus", "panelStatus$annotations", "getPanelStatus", "setPanelStatus", "selectedActionBarId", "getSelectedActionBarId", "setSelectedActionBarId", "showActionBarList", "", "getShowActionBarList", "()Z", "setShowActionBarList", "(Z)V", "showSendBtn", "getShowSendBtn", "setShowSendBtn", "text", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "copy", "isOnlyTextChanged", "other", "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ChatInputVO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long forceRefreshSign;
    private String initText;
    private int inputMode;
    private int panelStatus;
    private String selectedActionBarId;
    private boolean showActionBarList;
    private boolean showSendBtn;
    private CharSequence text;

    static {
        kge.a(2075735463);
    }

    public static /* synthetic */ void inputMode$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3365794", new Object[0]);
        }
    }

    public static /* synthetic */ void panelStatus$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d053481d", new Object[0]);
        }
    }

    public final int getPanelStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4d00e5a", new Object[]{this})).intValue() : this.panelStatus;
    }

    public final void setPanelStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992ec688", new Object[]{this, new Integer(i)});
        } else {
            this.panelStatus = i;
        }
    }

    public final int getInputMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b6eb42d1", new Object[]{this})).intValue() : this.inputMode;
    }

    public final void setInputMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee73f3f1", new Object[]{this, new Integer(i)});
        } else {
            this.inputMode = i;
        }
    }

    public final CharSequence getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this}) : this.text;
    }

    public final void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
        } else {
            this.text = charSequence;
        }
    }

    public final String getSelectedActionBarId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3be63a32", new Object[]{this}) : this.selectedActionBarId;
    }

    public final void setSelectedActionBarId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b686ec", new Object[]{this, str});
        } else {
            this.selectedActionBarId = str;
        }
    }

    public final boolean getShowSendBtn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("625e02cc", new Object[]{this})).booleanValue() : this.showSendBtn;
    }

    public final void setShowSendBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5f9e18", new Object[]{this, new Boolean(z)});
        } else {
            this.showSendBtn = z;
        }
    }

    public final boolean getShowActionBarList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73251013", new Object[]{this})).booleanValue() : this.showActionBarList;
    }

    public final void setShowActionBarList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c140b1", new Object[]{this, new Boolean(z)});
        } else {
            this.showActionBarList = z;
        }
    }

    public final long getForceRefreshSign() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5d07dbe", new Object[]{this})).longValue() : this.forceRefreshSign;
    }

    public final void setForceRefreshSign(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845264ae", new Object[]{this, new Long(j)});
        } else {
            this.forceRefreshSign = j;
        }
    }

    public final String getInitText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("336b8d06", new Object[]{this}) : this.initText;
    }

    public final void setInitText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e36e30", new Object[]{this, str});
        } else {
            this.initText = str;
        }
    }

    public final ChatInputVO copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("b8b803c2", new Object[]{this});
        }
        ChatInputVO chatInputVO = new ChatInputVO();
        chatInputVO.panelStatus = this.panelStatus;
        chatInputVO.inputMode = this.inputMode;
        chatInputVO.text = this.text;
        chatInputVO.selectedActionBarId = this.selectedActionBarId;
        chatInputVO.showSendBtn = this.showSendBtn;
        chatInputVO.showActionBarList = this.showActionBarList;
        chatInputVO.forceRefreshSign = this.forceRefreshSign;
        chatInputVO.initText = this.initText;
        return chatInputVO;
    }

    public final boolean isOnlyTextChanged(ChatInputVO other) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c4ef4a4", new Object[]{this, other})).booleanValue();
        }
        q.c(other, "other");
        return (q.a(other.text, this.text) ^ true) && other.panelStatus == this.panelStatus && other.inputMode == this.inputMode && q.a((Object) other.selectedActionBarId, (Object) this.selectedActionBarId) && other.showSendBtn == this.showSendBtn && other.showActionBarList == this.showActionBarList && other.forceRefreshSign == this.forceRefreshSign && q.a((Object) other.initText, (Object) this.initText);
    }
}
