package com.taobao.avplayer;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;
import tb.mka;
import tb.oyx;

/* loaded from: classes6.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(94371483);
    }

    public static boolean a(final Context context, final String str, HashMap<String, String> hashMap, final int i, final com.taobao.mediaplay.d dVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("547a5133", new Object[]{context, str, hashMap, new Integer(i), dVar})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || hashMap == null || hashMap.size() == 0) {
            return false;
        }
        final HashMap hashMap2 = new HashMap(hashMap);
        final boolean a3 = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_CONTROL_RESULT_CACHE, "true"));
        final boolean b = com.taobao.taobaoavsdk.util.b.b(hashMap.get("from"), OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_CONTROL_RESULT_CACHE_SBT, "[\"newdetail_main\", \"newdetail_native\", \"myorder\"]"));
        String str2 = null;
        if (a3 && b && (a2 = com.taobao.mediaplay.h.a(str)) != null) {
            str2 = oyx.a(context, a2, i, dVar, hashMap2);
        }
        if (str2 == null) {
            new y(str, hashMap).a(new mka() { // from class: com.taobao.avplayer.aa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.mka
                public void b(MediaVideoResponse mediaVideoResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafb1850", new Object[]{this, mediaVideoResponse});
                    }
                }

                @Override // tb.mka
                public void a(MediaVideoResponse mediaVideoResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad227df1", new Object[]{this, mediaVideoResponse});
                    } else if (mediaVideoResponse == null || mediaVideoResponse.data == null || !"SUCCESS".equals(mediaVideoResponse.errorCode)) {
                    } else {
                        if (a3 && b) {
                            com.taobao.mediaplay.h.a(str, mediaVideoResponse.data);
                        }
                        oyx.a(context, mediaVideoResponse.data, i, dVar, hashMap2);
                    }
                }
            });
        }
        return true;
    }

    public static boolean a(Context context, JSONObject jSONObject, HashMap<String, String> hashMap, int i, com.taobao.mediaplay.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("604d6667", new Object[]{context, jSONObject, hashMap, new Integer(i), dVar})).booleanValue() : (hashMap == null || hashMap.size() == 0 || oyx.a(context, jSONObject, i, dVar, new HashMap(hashMap)) == null) ? false : true;
    }
}
