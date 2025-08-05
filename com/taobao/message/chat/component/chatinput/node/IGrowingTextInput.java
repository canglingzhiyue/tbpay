package com.taobao.message.chat.component.chatinput.node;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J\b\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H'J\b\u0010\u000b\u001a\u00020\bH'J\b\u0010\f\u001a\u00020\bH'J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H'J\b\u0010\u0010\u001a\u00020\bH'J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0003H'J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H'J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H'J\b\u0010\u0016\u001a\u00020\bH'¨\u0006\u0017"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/IGrowingTextInput;", "", "getLineHeight", "", "getSelection", "getText", "", "hideSoftInput", "", "insert", "charSequence", "performDeleteClick", "postRequestFocus", "replace", "start", "end", "requestFocus", "setSelection", "index", "setText", "isInitTxt", "", "showSoftInput", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface IGrowingTextInput {
    int getLineHeight();

    int getSelection();

    CharSequence getText();

    void hideSoftInput();

    void insert(CharSequence charSequence);

    void performDeleteClick();

    void postRequestFocus();

    void replace(int i, int i2, CharSequence charSequence);

    void requestFocus();

    void setSelection(int i);

    void setText(CharSequence charSequence);

    void setText(CharSequence charSequence, boolean z);

    void showSoftInput();
}
