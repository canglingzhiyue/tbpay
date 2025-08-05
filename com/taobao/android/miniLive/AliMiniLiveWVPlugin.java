package com.taobao.android.miniLive;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import java.util.Map;
import tb.huc;
import tb.hue;
import tb.kge;

/* loaded from: classes6.dex */
public class AliMiniLiveWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LIVEID = "liveId";
    private static final String TAG;

    static {
        kge.a(-953258598);
        TAG = AliMiniLiveWVPlugin.class.getSimpleName();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        b bVar = new b(str, str2, wVCallBackContext);
        if ("getLiveRoomMiniWindowStatus".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING, (Object) Boolean.valueOf(a.a().k()));
            jSONObject.put("existing", (Object) Boolean.valueOf(a.a().l()));
            jSONObject.put("source", (Object) a.a().m());
            bVar.a(jSONObject.toJSONString());
            return true;
        } else if ("startMiniLive".equals(str)) {
            Map<String, String> a2 = huc.a(str2);
            a.a().a(this.mContext, a2.get("liveId"), a2);
            String str3 = TAG;
            hue.a(str3, str + " startMiniLive ");
            return true;
        } else if (!"hideMiniLive".equals(str)) {
            return false;
        } else {
            a.a().i();
            String str4 = TAG;
            hue.a(str4, str + " hideMiniLive ");
            return true;
        }
    }
}
