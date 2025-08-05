package com.taobao.android.litecreator.base.data.meta;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.business.util.y;
import java.io.Serializable;
import java.util.Map;
import tb.ios;
import tb.kge;

/* loaded from: classes5.dex */
public class MediaStatInfoV2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "ab_test_info")
    public String ab_test_info;
    @JSONField(name = "ai_quality")
    public JSONObject ai_quality;
    @JSONField(name = "album_film_template")
    public String album_film_template;
    @JSONField(name = "attachments")
    public JSONArray attachments;
    @JSONField(name = "audio")
    public JSONArray audio;
    @JSONField(name = "audio_id")
    @Deprecated
    public String audio_id;
    @JSONField(name = "audio_vender_type")
    @Deprecated
    public String audio_vender_type;
    @JSONField(name = "beauty_template")
    public JSONObject beauty_template;
    @JSONField(name = "camera_rotation")
    public int camera_rotation;
    @JSONField(name = "canvas")
    public JSONObject canvas;
    @JSONField(name = "canvas_color")
    public String canvas_color;
    @JSONField(name = "collection")
    public JSONObject collection;
    @JSONField(name = "cover_text")
    public String cover_text;
    @JSONField(name = "elements")
    public JSONArray elements;
    @JSONField(name = "filter")
    public JSONArray filter;
    @JSONField(name = "fun_id")
    public JSONObject fun_id;
    @JSONField(name = ios.KEY_GOODS_ID)
    public String goods_id;
    @JSONField(name = "is_hq_record")
    public boolean is_hq_record = false;
    @JSONField(name = "itemsticker_items")
    public JSONArray itemsticker_items;
    @JSONField(name = "location")
    public JSONArray location;
    @JSONField(name = "main_clip_source")
    public String main_clip_source;
    @JSONField(name = "mediaId")
    public String mediaId;
    @JSONField(name = "metadata")
    public JSONObject metadata;
    @JSONField(name = "pub_session")
    public String pub_session;
    @JSONField(name = "relate_topics")
    public String relate_topics;
    @JSONField(name = "source")
    public String source;
    @JSONField(name = y.STICKER_IDS)
    public String sticker_ids;
    @JSONField(name = "template_scene_labels")
    public JSONArray template_scene_labels;

    static {
        kge.a(-1030967005);
        kge.a(1028243835);
    }

    public static MediaStatInfoV2 fromV1(MediaStatInfo mediaStatInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaStatInfoV2) ipChange.ipc$dispatch("74bad0bc", new Object[]{mediaStatInfo});
        }
        try {
            JSONArray filterArray = filterArray(mediaStatInfo.filter);
            JSONObject jSONObject = (JSONObject) JSON.toJSON(mediaStatInfo);
            jSONObject.remove("filter");
            MediaStatInfoV2 mediaStatInfoV2 = (MediaStatInfoV2) JSONObject.parseObject(jSONObject.toJSONString(), MediaStatInfoV2.class);
            mediaStatInfoV2.filter = filterArray;
            return mediaStatInfoV2;
        } catch (Throwable unused) {
            return new MediaStatInfoV2();
        }
    }

    private static JSONArray filterArray(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2e7d1f16", new Object[]{jSONObject});
        }
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null && jSONObject.size() > 0) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                jSONArray.add((JSONObject) entry.getValue());
            }
        }
        return jSONArray;
    }
}
