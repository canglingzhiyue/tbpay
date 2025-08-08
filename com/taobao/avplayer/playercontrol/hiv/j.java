package com.taobao.avplayer.playercontrol.hiv;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1694266748);
    }

    public static void a(DWContext dWContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c87198", new Object[]{dWContext, str, map});
        } else if (dWContext == null) {
        } else {
            dWContext.mUTAdapter.a("DWVideo", "Button", str, dWContext.getUTParams(), map);
        }
    }

    public static Map<String, String> a(DWContext dWContext, ContentDetailData contentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f43eb82e", new Object[]{dWContext, contentDetailData});
        }
        HashMap hashMap = new HashMap();
        if (dWContext == null) {
            return hashMap;
        }
        if (!StringUtils.isEmpty(dWContext.mCid)) {
            hashMap.put("feed_id", dWContext.mCid);
        }
        if (!StringUtils.isEmpty(dWContext.mFrom)) {
            hashMap.put("from", dWContext.mFrom);
        }
        if (!StringUtils.isEmpty(dWContext.getVideoId())) {
            hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, dWContext.getVideoId());
        }
        return hashMap;
    }

    public static Map<String, String> b(DWContext dWContext, ContentDetailData contentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3723574d", new Object[]{dWContext, contentDetailData});
        }
        HashMap hashMap = new HashMap();
        if (dWContext == null) {
            return hashMap;
        }
        if (!StringUtils.isEmpty(dWContext.mContentId)) {
            hashMap.put("feed_id", dWContext.mContentId);
        } else {
            hashMap.put("feed_id", "");
        }
        hashMap.put("interactive_id", String.valueOf(dWContext.mInteractiveId));
        if (!StringUtils.isEmpty(dWContext.mFrom)) {
            hashMap.put("from", dWContext.mFrom);
            hashMap.put("page", dWContext.mFrom);
        }
        Map<String, String> uTParams = dWContext.getUTParams();
        hashMap.put("feed_type", (uTParams == null || uTParams.get("feed_type") == null) ? "" : uTParams.get("feed_type"));
        if (contentDetailData != null) {
            if (!StringUtils.isEmpty(contentDetailData.videoId)) {
                hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, contentDetailData.videoId);
            }
            if (!StringUtils.isEmpty(contentDetailData.mediaId)) {
                hashMap.put("video_uid", contentDetailData.mediaId);
            }
        } else {
            hashMap.put("video_uid", "");
        }
        if (!hashMap.containsKey(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID) && !StringUtils.isEmpty(dWContext.getVideoId())) {
            hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, dWContext.getVideoId());
        }
        return hashMap;
    }
}
