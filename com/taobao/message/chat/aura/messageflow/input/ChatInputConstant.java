package com.taobao.message.chat.aura.messageflow.input;

import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/message/chat/aura/messageflow/input/ChatInputConstant;", "", "()V", "ACTION_CHANGE_INPUT_MODE", "", "ACTION_COLLAPSE_PANEL", "ACTION_EXPRESSION_ENTRY_CLICK", "ACTION_GOODS_ENTRY_CLICK", "ACTION_KEYBOARD_ENTRY_CLICK", "ACTION_ON_KEYBOARD_HIDE", "ACTION_ON_KEYBOARD_SHOW", "ACTION_PANEL_ENTRY_CLICK", "ACTION_TEXT_CHANGE", "PANEL_ID_ALBUM", "PANEL_ID_EMOJI", "PANEL_ID_GOODS", "PANEL_ID_KEYBOARD", "PANEL_ID_RECORD", "PANEL_ID_TAKE_PHOTO", "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ChatInputConstant {
    public static final String ACTION_CHANGE_INPUT_MODE = "changeInputMode";
    public static final String ACTION_COLLAPSE_PANEL = "actionCollapsePanel";
    public static final String ACTION_EXPRESSION_ENTRY_CLICK = "actionBarEmojiClick";
    public static final String ACTION_GOODS_ENTRY_CLICK = "actionBarGoodsBagClick";
    public static final String ACTION_KEYBOARD_ENTRY_CLICK = "actionBarKeyboardClick";
    public static final String ACTION_ON_KEYBOARD_HIDE = "onKeyboardHideEvent";
    public static final String ACTION_ON_KEYBOARD_SHOW = "onKeyboardShowEvent";
    public static final String ACTION_PANEL_ENTRY_CLICK = "panelEntryTap";
    public static final String ACTION_TEXT_CHANGE = "textChange";
    public static final ChatInputConstant INSTANCE;
    public static final String PANEL_ID_ALBUM = "album";
    public static final String PANEL_ID_EMOJI = "emoji";
    public static final String PANEL_ID_GOODS = "goods";
    public static final String PANEL_ID_KEYBOARD = "keyboard";
    public static final String PANEL_ID_RECORD = "record";
    public static final String PANEL_ID_TAKE_PHOTO = "takephoto";

    static {
        kge.a(563935591);
        INSTANCE = new ChatInputConstant();
    }

    private ChatInputConstant() {
    }
}
