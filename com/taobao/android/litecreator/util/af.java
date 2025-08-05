package com.taobao.android.litecreator.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import com.taobao.android.litecreator.comprehension.h;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class af {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1341707041);
    }

    public static void a(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c849b066", new Object[]{iUGCMedia});
        } else {
            a(iUGCMedia, null);
        }
    }

    public static void a(IUGCMedia iUGCMedia, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe5ccb0", new Object[]{iUGCMedia, str});
        } else if (iUGCMedia != null) {
            String publishSessionId = iUGCMedia.getPublishSessionId();
            if (TextUtils.isEmpty(publishSessionId)) {
                return;
            }
            List<UGCImage> images = iUGCMedia.getImages();
            List<UGCVideo> videos = iUGCMedia.getVideos();
            JSONArray jSONArray = new JSONArray();
            if (images != null && images.size() > 0) {
                for (UGCImage uGCImage : images) {
                    MediaStatInfo mediaStatInfo = (MediaStatInfo) uGCImage.getMeta("mediaStatInfo");
                    if (mediaStatInfo != null) {
                        if (!TextUtils.isEmpty(str)) {
                            mediaStatInfo.goods_id = str;
                        }
                        jSONArray.add(JSONObject.toJSON(mediaStatInfo));
                    }
                }
            } else if (videos != null && videos.size() > 0) {
                for (UGCVideo uGCVideo : videos) {
                    MediaStatInfo mediaStatInfo2 = (MediaStatInfo) uGCVideo.getMeta("mediaStatInfo");
                    if (mediaStatInfo2 != null) {
                        if (!TextUtils.isEmpty(str)) {
                            mediaStatInfo2.goods_id = str;
                        }
                        jSONArray.add(JSONObject.toJSON(mediaStatInfo2));
                    }
                }
            }
            if (h.INSTANCE.b().size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str2 : h.INSTANCE.b().values()) {
                    jSONArray2.add(str2);
                }
                MediaStatInfo mediaStatInfo3 = new MediaStatInfo(iUGCMedia.getPublishSessionId());
                mediaStatInfo3.template_scene_labels = jSONArray2;
                if (!TextUtils.isEmpty(str)) {
                    mediaStatInfo3.goods_id = str;
                }
                jSONArray.add(JSONObject.toJSON(mediaStatInfo3));
            }
            MediaStatInfo.getGlobalStatInfo().put(publishSessionId, jSONArray.toJSONString());
        }
    }
}
