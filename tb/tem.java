package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfoV2;
import com.taobao.android.litecreator.sdk.editor.data.MusicInfo;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.u;
import com.taobao.taolive.room.utils.aw;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.bean.AudioBean;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes9.dex */
public class tem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1825411630);
    }

    public static MediaStatInfoV2 a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaStatInfoV2) ipChange.ipc$dispatch("5a3e4676", new Object[]{jSONObject});
        }
        MediaStatInfoV2 mediaStatInfoV2 = new MediaStatInfoV2();
        try {
            jSONObject2 = jSONObject.getJSONObject(AbilityConst.Server.f23328a);
        } catch (Throwable th) {
            u.d("UploadFileHandler", "generateMediaStatInfo.error:" + Log.getStackTraceString(th));
        }
        if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray(AbilityConst.Server.b)) != null && jSONArray.size() != 0) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.addAll(jSONArray);
            JSONObject jSONObject3 = (JSONObject) jSONArray2.mo1572remove(0);
            jSONArray2.add(jSONObject3);
            String a2 = m.a(jSONArray2.getJSONObject(0), "materialType", "");
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < jSONArray2.size()) {
                sb.append(i > 0 ? "," : "");
                sb.append(m.a(jSONArray2.getJSONObject(i), "tid", ""));
                i++;
            }
            if (!TextUtils.isEmpty(sb)) {
                if (TextUtils.equals(a2, AgooConstants.REPORT_ENCRYPT_FAIL)) {
                    mediaStatInfoV2.source = "ai_portrait";
                } else if (TextUtils.equals(a2, AgooConstants.REPORT_DUPLICATE_FAIL)) {
                    mediaStatInfoV2.source = "ai_create";
                } else if (TextUtils.equals(a2, "25")) {
                    mediaStatInfoV2.source = "ai_outfit";
                } else {
                    mediaStatInfoV2.source = "template";
                }
                mediaStatInfoV2.album_film_template = sb.toString();
            }
            mediaStatInfoV2.elements = m.a(jSONObject, AbilityConst.Server.c, AbilityConst.Server.d);
            a(mediaStatInfoV2, jSONObject2, jSONObject3);
            return mediaStatInfoV2;
        }
        return mediaStatInfoV2;
    }

    private static void a(MediaStatInfoV2 mediaStatInfoV2, JSONObject jSONObject, JSONObject jSONObject2) {
        String a2;
        String a3;
        String str;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff86dd16", new Object[]{mediaStatInfoV2, jSONObject, jSONObject2});
            return;
        }
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("musicInfo");
            long j2 = -1;
            if (jSONObject3 != null) {
                MusicInfo musicInfo = (MusicInfo) JSON.parseObject(jSONObject3.toJSONString(), MusicInfo.class);
                String str2 = "";
                if (musicInfo != null) {
                    str2 = musicInfo.musicId;
                    str = musicInfo.audioId;
                    a3 = musicInfo.vendorType;
                    j2 = musicInfo.startTime;
                    j = musicInfo.endTime;
                } else {
                    str = str2;
                    a3 = str;
                    j = -1;
                }
                a2 = str2;
            } else {
                a2 = m.a((String) null, jSONObject2, aw.PARAM_EXTEND, "videoConfig", "musicId");
                String a4 = m.a((String) null, jSONObject2, aw.PARAM_EXTEND, "videoConfig", "audioId");
                a3 = m.a((String) null, jSONObject2, aw.PARAM_EXTEND, "videoConfig", "musicVendor");
                str = a4;
                j = -1;
            }
            if (TextUtils.isEmpty(a2) && TextUtils.isEmpty(str)) {
                return;
            }
            AudioBean audioBean = new AudioBean();
            audioBean.id = a2;
            audioBean.pieceAudioId = str;
            audioBean.vender_type = a3;
            audioBean.position = "lite_edit";
            if (j2 >= 0 && j > j2) {
                audioBean.startTime = j2;
                audioBean.endTime = j;
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(JSON.toJSON(audioBean));
            mediaStatInfoV2.audio_id = str;
            mediaStatInfoV2.audio_vender_type = a3;
            mediaStatInfoV2.audio = jSONArray;
        } catch (Throwable th) {
            u.d("UploadFileHandler", "generateMediaStatInfo.audio.error:" + Log.getStackTraceString(th));
        }
    }
}
