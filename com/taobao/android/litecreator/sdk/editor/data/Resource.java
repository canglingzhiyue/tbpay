package com.taobao.android.litecreator.sdk.editor.data;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class Resource implements Serializable {
    public static final String KEY_MEDIA_AI_EDIT_INFO = "media_ai_edit_info";
    public static final String KEY_MEDIA_CLIP_VERSION = "media_clip_version";
    public static final String KEY_MEDIA_MAX_COUNT = "media_max_count";
    public static final String KEY_MEDIA_MIN_COUNT = "media_min_count";
    public static final int MEDIA_CLIP_VERSION = 1;
    public static final String TYPE_DEFAULT = "default";
    public static final String TYPE_DEFAULT_MULTI = "default_multi";
    public static final String TYPE_RECORD_AIGC = "template_aigc";
    public static final String TYPE_RECORD_MULTI = "record_in_multi";
    public static final String TYPE_TEMPLATE = "template";
    public static final String TYPE_TEMPLATE_ALBUM_AI_EDIT = "template_album_ai_edit";
    public static final String TYPE_TEMPLATE_IMG = "template_img";
    public static final String TYPE_TEMPLATE_IN_MULTI = "template_in_multi";
    public static final String TYPE_TEMPLATE_LITE = "template_lite";
    public static final String TYPE_TEMPLATE_TEXT_IMAGE = "template_text_image";
    public static final String TYPE_TEMPLATE_TIMELINE = "template_timeline";
    public MultiVideoClips compressData;
    public String draftPath;
    public String metaPath;
    public MultiVideoClips originData;
    public MultiVideoClips rawData;
    public String textContent;
    public String type = "default";
    public JSONObject metaJson = new JSONObject();

    static {
        kge.a(-1278895862);
        kge.a(1028243835);
    }
}
