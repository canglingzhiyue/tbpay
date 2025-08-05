package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.h;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.litecreator.comprehension.f;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class pfk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-141985995);
    }

    public static HashMap<String, String> a(LiveItem.TimeMovingPlayInfo timeMovingPlayInfo, String str, a aVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d690b3b2", new Object[]{timeMovingPlayInfo, str, aVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (timeMovingPlayInfo.spfPlayVideo != null) {
            if (f.FILE_TYPE_VIDEO_MP4.equalsIgnoreCase(timeMovingPlayInfo.spfPlayVideo.videoType) && timeMovingPlayInfo.spfPlayVideo.extraPlayInfo != null) {
                str2 = timeMovingPlayInfo.spfPlayVideo.extraPlayInfo.mp4Url;
                com.taobao.taolive.movehighlight.utils.f.a().a(f.FILE_TYPE_VIDEO_MP4);
            } else if ("m3u8".equalsIgnoreCase(timeMovingPlayInfo.spfPlayVideo.videoType)) {
                str2 = timeMovingPlayInfo.spfPlayVideo.playInfo;
                com.taobao.taolive.movehighlight.utils.f.a().a("m3u8");
            } else {
                str2 = timeMovingPlayInfo.spfPlayVideo.playInfo;
            }
            if (f.FILE_TYPE_VIDEO_MP4.equalsIgnoreCase(timeMovingPlayInfo.spfPlayVideo.videoType)) {
                com.taobao.taolive.movehighlight.utils.f.a().a(f.FILE_TYPE_VIDEO_MP4);
                hashMap.put(h.KEY_VIDEO_ID, timeMovingPlayInfo.spfPlayVideo.playInfo);
            }
            if (!timeMovingPlayInfo.isSpeaking) {
                hashMap.put("loop", "true");
                hashMap.put("type", "video");
                hashMap.put("startSeekTime", "0");
            } else {
                hashMap.put("type", "live");
            }
            com.taobao.taolive.movehighlight.utils.f.a().b(timeMovingPlayInfo.isSpeaking);
            hashMap.put(aw.PARAM_PLAY_URL, str2);
            poy.a(timeMovingPlayInfo.spfPlayVideo.timeMovingUtParams, aVar);
        } else {
            com.taobao.taolive.movehighlight.utils.f.a().a("m3u8");
            if (timeMovingPlayInfo.isSpeaking) {
                hashMap.put(aw.PARAM_PLAY_URL, str);
                hashMap.put("type", "live");
            } else {
                hashMap.put(aw.PARAM_PLAY_URL, timeMovingPlayInfo.timeMovingM3u8Url);
                hashMap.put("loop", "true");
                hashMap.put(h.KEY_VIDEO_ID, timeMovingPlayInfo.videoId);
                hashMap.put("type", "video");
                hashMap.put("startSeekTime", "0");
            }
            com.taobao.taolive.movehighlight.utils.f.a().b(timeMovingPlayInfo.isSpeaking);
            poy.a((String) null, aVar);
        }
        return hashMap;
    }

    public static HashMap<String, String> a(LiveItem liveItem, LiveItem.TimeMovingPlayInfo timeMovingPlayInfo, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("96a4c11e", new Object[]{liveItem, timeMovingPlayInfo, str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = liveItem.personalityData.getJSONObject("spfPlayVideo");
        if (liveItem.personalityData != null && jSONObject != null && !jSONObject.isEmpty()) {
            LiveItem.SpfPlayVideo spfPlayVideo = (LiveItem.SpfPlayVideo) jSONObject.toJavaObject(LiveItem.SpfPlayVideo.class);
            if (f.FILE_TYPE_VIDEO_MP4.equalsIgnoreCase(spfPlayVideo.videoType) && spfPlayVideo.extraPlayInfo != null) {
                str2 = spfPlayVideo.extraPlayInfo.mp4Url;
                com.taobao.taolive.movehighlight.utils.f.a().a(f.FILE_TYPE_VIDEO_MP4);
            } else if ("m3u8".equalsIgnoreCase(spfPlayVideo.videoType)) {
                str2 = spfPlayVideo.playInfo;
                com.taobao.taolive.movehighlight.utils.f.a().a("m3u8");
            } else {
                str2 = spfPlayVideo.playInfo;
            }
            if (f.FILE_TYPE_VIDEO_MP4.equalsIgnoreCase(spfPlayVideo.videoType)) {
                com.taobao.taolive.movehighlight.utils.f.a().a(f.FILE_TYPE_VIDEO_MP4);
                hashMap.put(h.KEY_VIDEO_ID, spfPlayVideo.playInfo);
            }
            if (!timeMovingPlayInfo.isSpeaking) {
                hashMap.put("loop", "true");
                hashMap.put("type", "video");
                hashMap.put("startSeekTime", "0");
            } else {
                hashMap.put("type", "live");
            }
            hashMap.put(aw.PARAM_PLAY_URL, str2);
            com.taobao.taolive.movehighlight.utils.f.a().b(timeMovingPlayInfo.isSpeaking);
            poy.a(spfPlayVideo.timeMovingUtParams, n.a());
        } else {
            com.taobao.taolive.movehighlight.utils.f.a().a("m3u8");
            if (timeMovingPlayInfo.isSpeaking) {
                hashMap.put(aw.PARAM_PLAY_URL, str);
                hashMap.put("type", "live");
            } else {
                hashMap.put(aw.PARAM_PLAY_URL, timeMovingPlayInfo.timeMovingM3u8Url);
                hashMap.put("loop", "true");
                hashMap.put(h.KEY_VIDEO_ID, timeMovingPlayInfo.videoId);
                hashMap.put("type", "video");
                hashMap.put("startSeekTime", "0");
            }
            com.taobao.taolive.movehighlight.utils.f.a().b(timeMovingPlayInfo.isSpeaking);
            poy.a((String) null, n.a());
        }
        return hashMap;
    }
}
