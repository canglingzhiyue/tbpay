package com.taobao.message.chat.aura.messageflow.input;

import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/message/chat/aura/messageflow/input/AudioRecordConstant;", "", "()V", "ACTION_CANCEL", "", "ACTION_DISPATCH_RECORD_STATUS_EVENT", "", "ACTION_HIDE_TIPS", "ACTION_PRECANCEL", "ACTION_PROCESS_RECORD_STATE_CHANGE", "ACTION_RESUME", "ACTION_SEND", "ACTION_SEND_AUDIO", "ACTION_SEND_CANCEL", "ACTION_SEND_TEXT", "ACTION_SET_VISIBILITY_GONE", "ACTION_SHOW_PRECANCEL_STYLE", "ACTION_SHOW_PRERECORD_TO_TEXT_STYLE", "ACTION_SHOW_RECOGNIZED_TEXT", "ACTION_SHOW_RECORDING_STYLE", "ACTION_SHOW_RECORD_FINISH_STYLE", "ACTION_SHOW_RECORD_TO_TEXT_STYLE", "ACTION_SHOW_TIPS", "ACTION_START", "ACTION_STOP", "ACTION_TO_TEXT", "ACTION_UPDATE_RECORD_VOLUME_STYLE", "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class AudioRecordConstant {
    public static final int ACTION_CANCEL = 2;
    public static final String ACTION_DISPATCH_RECORD_STATUS_EVENT = "dispatchRecordStatusChangeEvent";
    public static final String ACTION_HIDE_TIPS = "hideTips";
    public static final int ACTION_PRECANCEL = 3;
    public static final String ACTION_PROCESS_RECORD_STATE_CHANGE = "processRecordStateChange";
    public static final int ACTION_RESUME = 4;
    public static final int ACTION_SEND = 9;
    public static final int ACTION_SEND_AUDIO = 5;
    public static final int ACTION_SEND_CANCEL = 7;
    public static final int ACTION_SEND_TEXT = 6;
    public static final String ACTION_SET_VISIBILITY_GONE = "setVisibilityGone";
    public static final String ACTION_SHOW_PRECANCEL_STYLE = "showPreCancelStyle";
    public static final String ACTION_SHOW_PRERECORD_TO_TEXT_STYLE = "showPreRecordToTextStyle";
    public static final String ACTION_SHOW_RECOGNIZED_TEXT = "showRecognizedText";
    public static final String ACTION_SHOW_RECORDING_STYLE = "showRecordingStyle";
    public static final String ACTION_SHOW_RECORD_FINISH_STYLE = "showRecordFinishStyle";
    public static final String ACTION_SHOW_RECORD_TO_TEXT_STYLE = "showRecordToTextStyle";
    public static final String ACTION_SHOW_TIPS = "showTips";
    public static final int ACTION_START = 0;
    public static final int ACTION_STOP = 1;
    public static final int ACTION_TO_TEXT = 8;
    public static final String ACTION_UPDATE_RECORD_VOLUME_STYLE = "updateRecordVolumeStyle";
    public static final AudioRecordConstant INSTANCE;

    static {
        kge.a(-374541156);
        INSTANCE = new AudioRecordConstant();
    }

    private AudioRecordConstant() {
    }
}
