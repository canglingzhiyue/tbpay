package com.taobao.android.layoutmanager.module;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.aa;
import com.taobao.mediaplay.d;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.util.HashMap;
import tb.kge;
import tb.ogg;

/* loaded from: classes5.dex */
public class GuangGuangModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GuangGuangModule";

    static {
        kge.a(-2015174768);
        kge.a(-818961104);
    }

    public static void prefetchVideo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cefef14", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            final String string = jSONObject.getString("videoId");
            String string2 = jSONObject.getString("scenes");
            String string3 = jSONObject.getString("bizCode");
            int intValue = jSONObject.getIntValue("downloadSize");
            String string4 = jSONObject.getString("userId");
            String string5 = jSONObject.getString("videoChannel");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(MusLiveVideo.ATTR_PLAY_SCENES, string2);
            hashMap.put("from", string3);
            if (!StringUtils.isEmpty(string4)) {
                hashMap.put("userId", string4);
            }
            if (!StringUtils.isEmpty(string5)) {
                hashMap.put("videoChannel", string5);
            }
            aa.a(cVar.a(), string, hashMap, intValue, new d() { // from class: com.taobao.android.layoutmanager.module.GuangGuangModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mediaplay.d
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    ogg.a(GuangGuangModule.TAG, "prefetch video start:" + string);
                }

                @Override // com.taobao.mediaplay.d
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    ogg.a(GuangGuangModule.TAG, "prefetch video finish:" + string + ":" + i);
                }

                @Override // com.taobao.mediaplay.d
                public void b(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                        return;
                    }
                    ogg.a(GuangGuangModule.TAG, "prefetch video progress:" + string + ":" + i);
                }
            });
        }
    }
}
