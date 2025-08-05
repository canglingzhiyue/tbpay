package com.taobao.android.litecreator.base.data.meta;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public final class MediaStatInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STAT_KEY_POSITION = "position";
    public static final String STAT_KEY_SOURCE = "source";
    private static final Map<String, String> sSessionStatInfoMap;
    public String ab_test_info;
    public JSONObject adjust_params;
    public JSONObject ai_quality;
    public String album_film_template;
    public String album_film_ut_log;
    public JSONArray attachments;
    public JSONArray audio;
    @Deprecated
    public String audio_id;
    @Deprecated
    public String audio_vender_type;
    public JSONObject beauty_params;
    public JSONObject beauty_template;
    public int camera_rotation;
    public JSONObject canvas;
    public String canvas_color;
    public JSONObject collection;
    public String cover_text;
    public JSONObject filter;
    public JSONObject fun_id;
    public String goods_id;
    public boolean is_hq_record = false;
    public JSONArray itemsticker_items;
    public JSONArray location;
    public String main_clip_source;
    public String mediaId;
    public JSONObject metadata;
    public String pub_session;
    public String relate_topics;
    public String source;
    public String sticker_ids;
    public String task_template_id;
    public String template_from_pos;
    public JSONArray template_scene_labels;

    public MediaStatInfo(String str) {
        this.pub_session = str;
    }

    private MediaStatInfo() {
    }

    static {
        kge.a(-389899193);
        kge.a(1028243835);
        sSessionStatInfoMap = new HashMap();
    }

    public static Map<String, String> getGlobalStatInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2f163497", new Object[0]) : sSessionStatInfoMap;
    }
}
