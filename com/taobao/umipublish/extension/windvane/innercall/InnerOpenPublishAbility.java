package com.taobao.umipublish.extension.windvane.innercall;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.VideoBean;
import com.taobao.android.litecreator.base.data.g;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import com.taobao.android.litecreator.base.data.meta.a;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.sdk.editor.data.Material;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.aw;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.util.ArrayList;
import java.util.List;
import tb.gww;
import tb.ios;
import tb.kge;

/* loaded from: classes9.dex */
public class InnerOpenPublishAbility extends InnerCallBaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MEDIA_TYPE_VIDEO = 3;
    public static final String PARAMS_IMAGE = "images";
    private static final String PARAMS_REF_ID = "ref_id";
    private static final String PARAMS_REF_NAME = "ref_name";
    private static final String PARAMS_STAT_INFO = "statInfo";
    public static final String PARAMS_URL_PARAMS = "activityParams";
    public static final String PARAMS_VIDEO = "video";
    private static final String PUBLISH_PATH = "https://h5.m.taobao.com/lc/publish.html";
    public static final String RELATED_TOPIC_ID = "relatedTopicId";
    private static final String SUB_PARAMS_AUDIO = "audio";
    private static final String SUB_PARAMS_SOURCE = "source";
    private static final String SUB_PARAMS_TEMPLATE_ID = "album_film_template";
    private static final String TAG = "InnerOpenPublishAbility";

    static {
        kge.a(693857769);
    }

    public static /* synthetic */ Object ipc$super(InnerOpenPublishAbility innerOpenPublishAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.umipublish.extension.windvane.innercall.InnerCallBaseAbility
    public void a(JSONObject jSONObject, ios.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e01202e", new Object[]{this, jSONObject, aVar});
            return;
        }
        IUGCMedia d = e.d(this.mContext);
        if (d == null) {
            errorCallback("2", "ugcMedia is null");
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("images");
        JSONObject jSONObject2 = jSONObject.getJSONObject("video");
        if (jSONArray != null && jSONArray.size() > 0) {
            jSONObject2 = a(jSONArray);
            a(d, jSONArray);
        } else if (jSONObject2 != null && jSONObject2.size() > 0) {
            a(d, jSONObject2);
        } else {
            u.a(TAG, "aYou innerOpenPublish, error type");
            errorCallback("9001", " Error type");
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(PARAMS_URL_PARAMS);
        a(jSONObject3, jSONObject2, d);
        if (jSONObject3 != null && jSONObject3.size() > 0) {
            a(jSONObject3);
        }
        successCallback(new JSONObject());
        Nav.from(this.mContext).toUri(gww.a(e.b(d)).b("PUBLISH_PATH"));
    }

    private JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836310b0", new Object[]{this, jSONArray});
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null && jSONObject.containsKey("ref_id") && !TextUtils.isEmpty(jSONObject.getString("ref_id"))) {
                return jSONObject;
            }
        }
        return jSONArray.getJSONObject(0);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8661466", new Object[]{this, jSONObject, jSONObject2, iUGCMedia});
        } else if (jSONObject2 == null) {
        } else {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (jSONObject2.containsKey("ref_id") && !TextUtils.isEmpty(jSONObject2.getString("ref_id"))) {
                jSONObject.put("ref_id", (Object) jSONObject2.getString("ref_id"));
                iUGCMedia.setMeta(RELATED_TOPIC_ID, jSONObject2.getString("ref_id"));
            } else {
                u.a(TAG, "aYou innerOpenPublish, refId is null");
                UmiPublishMonitor.a().b("wind_vane", "9002", "wind_vane_publish_ability_empty_ref_id", null);
            }
            if (jSONObject2.containsKey("ref_name") && !TextUtils.isEmpty(jSONObject2.getString("ref_name"))) {
                jSONObject.put("ref_name", (Object) jSONObject2.getString("ref_name"));
                return;
            }
            u.a(TAG, "aYou innerOpenPublish, refName is null");
            UmiPublishMonitor.a().b("wind_vane", "9002", "wind_vane_publish_ability_empty_ref_name", null);
        }
    }

    public UGCImage a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCImage) ipChange.ipc$dispatch("eed3758e", new Object[]{this, str});
        }
        ImageBean a2 = g.a(str);
        if (a2 == null) {
            return null;
        }
        UGCImage uGCImage = new UGCImage();
        uGCImage.origin = a2;
        uGCImage.compress = uGCImage.origin;
        uGCImage.setMeta(g.f13306a, "image");
        return uGCImage;
    }

    private void a(IUGCMedia iUGCMedia, JSONArray jSONArray) {
        UGCImage a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc718e", new Object[]{this, iUGCMedia, jSONArray});
        } else if (jSONArray != null && jSONArray.size() > 0) {
            iUGCMedia.getImages().clear();
            iUGCMedia.getVideos().clear();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                String string = jSONObject.getString("path");
                if (!TextUtils.isEmpty(string) && (a2 = a(string)) != null) {
                    MediaStatInfo mediaStatInfo = new MediaStatInfo(iUGCMedia.getPublishSessionId());
                    mediaStatInfo.album_film_template = m.a("", jSONObject, PARAMS_STAT_INFO, SUB_PARAMS_TEMPLATE_ID);
                    mediaStatInfo.source = m.a("", jSONObject, PARAMS_STAT_INFO, "source");
                    mediaStatInfo.relate_topics = m.a("", jSONObject, "ref_id");
                    a2.setMeta("mediaStatInfo", mediaStatInfo);
                    iUGCMedia.appendImage(a2);
                }
            }
            iUGCMedia.setMeta("go_publish_page_confirm", true);
        }
    }

    private void a(IUGCMedia iUGCMedia, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c502af4a", new Object[]{this, iUGCMedia, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("path");
            String str = "";
            String a2 = m.a(str, jSONObject, "cover", "path");
            VideoBean b = g.b(string);
            if (b == null) {
                return;
            }
            b.cover = g.a(a2);
            UGCVideo uGCVideo = new UGCVideo();
            uGCVideo.raw = b;
            uGCVideo.origin = b;
            uGCVideo.setMeta(g.f13306a, "video");
            uGCVideo.setMeta("mediaId", Integer.valueOf(b.id));
            uGCVideo.setMeta(g.KEY_MEDIA_MIME_TYPE, 3);
            Uri a3 = a(b);
            if (a3 != null) {
                str = a3.toString();
            }
            uGCVideo.setMeta(g.KEY_MEDIA_URI, str);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(uGCVideo);
            a(arrayList, jSONObject, false, iUGCMedia, true);
        }
    }

    private static Uri a(VideoBean videoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6a38384e", new Object[]{videoBean});
        }
        if (videoBean.uri == null && videoBean.path != null) {
            return Uri.parse(videoBean.path);
        }
        return Uri.parse(videoBean.uri).buildUpon().build();
    }

    private void a(a aVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a14bd9", new Object[]{this, aVar, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(aw.PARAM_EXTEND)) == null) {
        } else {
            String string = jSONObject2.getString(Material.RECOMMENDED_TITLE);
            String string2 = jSONObject2.getString(Material.RECOMMENDED_TEXT);
            if (!TextUtils.isEmpty(string)) {
                aVar.addExtraInfoMeta(Material.RECOMMENDED_TITLE, string);
            } else {
                aVar.removeExtraInfoMeta(Material.RECOMMENDED_TITLE);
            }
            if (!TextUtils.isEmpty(string2)) {
                aVar.addExtraInfoMeta(Material.RECOMMENDED_TEXT, string2);
            } else {
                aVar.removeExtraInfoMeta(Material.RECOMMENDED_TEXT);
            }
            try {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(Material.RECOMMENDED_TOPIC_INFO);
                if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                    aVar.addExtraInfoMeta(Material.RECOMMENDED_TOPIC_INFO, jSONObject3);
                } else {
                    aVar.removeExtraInfoMeta(Material.RECOMMENDED_TOPIC_INFO);
                }
            } catch (Exception e) {
                u.d(TAG, e.getMessage());
            }
        }
    }

    private void a(List<UGCVideo> list, JSONObject jSONObject, boolean z, IUGCMedia iUGCMedia, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915045b9", new Object[]{this, list, jSONObject, new Boolean(z), iUGCMedia, new Boolean(z2)});
            return;
        }
        UGCVideo uGCVideo = new UGCVideo();
        g.a(uGCVideo, list, z);
        if (uGCVideo.editorInfo != null && uGCVideo.editorInfo.resource != null) {
            uGCVideo.editorInfo.resource.type = Resource.TYPE_DEFAULT_MULTI;
        }
        MediaStatInfo mediaStatInfo = new MediaStatInfo(iUGCMedia.getPublishSessionId());
        mediaStatInfo.source = m.a("", jSONObject, PARAMS_STAT_INFO, "source");
        mediaStatInfo.album_film_template = m.a("", jSONObject, PARAMS_STAT_INFO, SUB_PARAMS_TEMPLATE_ID);
        mediaStatInfo.relate_topics = m.a("", jSONObject, "ref_id");
        a(jSONObject, mediaStatInfo);
        uGCVideo.setMeta("mediaStatInfo", mediaStatInfo);
        a(uGCVideo, jSONObject);
        iUGCMedia.setMeta("xgc_direct_publish", Integer.valueOf(z2 ? 1 : 0));
        iUGCMedia.getImages().clear();
        iUGCMedia.getVideos().clear();
        iUGCMedia.getVideos().add(uGCVideo);
    }

    private void a(JSONObject jSONObject, MediaStatInfo mediaStatInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea4d412", new Object[]{this, jSONObject, mediaStatInfo});
            return;
        }
        JSONArray a2 = m.a(jSONObject, PARAMS_STAT_INFO, "audio");
        if (a2 == null) {
            return;
        }
        if (mediaStatInfo.audio == null) {
            mediaStatInfo.audio = new JSONArray();
        }
        mediaStatInfo.audio.addAll(a2);
    }
}
