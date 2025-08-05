package com.taobao.message.kit.config;

import java.util.Map;

/* loaded from: classes7.dex */
public interface IDefaultConfig {
    public static final String AGOO_PUSH_BACK_TO_URL = "agoo_push_back_to_url";
    public static final String AUDIO_AUTO_AUDIO2TEXT = "audio_auto_audio2text";
    public static final String AUDIO_ENABLE_AUDIO2TEXT = "audio_enable_audio2text";
    public static final String AUDIO_MESSAGE_MENU_AUDIO2TEXT = "audio_message_menu_audio2text";
    public static final String DXCLICK_ID_2_TEXT = "dxclick_id_2_text";
    public static final String DXCLICK_URL_2_TEXT = "dxclick_url_2_text";
    public static final String EXPRESSION_ENABLE_ROAM = "expression_enable_roam";
    public static final String EXPRESSION_UI_STYLE = "expression_ui_style";
    public static final String ID2JS = "id2js";
    public static final String JSI_APPNAME = "JSI_APPNAME";
    public static final String MESSAGE_CENTER_CATEGORY_URL = "message_center_category_url";
    public static final String MONITOR_TERMINATOR_ENABLE = "monitor_terminator_enable";
    public static final String MSGTYPE_2_TEXT = "msgtype_2_text";
    public static final String NATIVE_2_DINAMICX = "native_2_dinamicx";
    public static final String RUNTIME_SELFLONGNICK_VALUE = "runtime_selflongnick_value";
    public static final String WANGX_2_TEXT = "wangx_2_text";

    Map<String, String> getDefaultConfigMap();

    String getRuntimeValue(String str, String str2);
}
