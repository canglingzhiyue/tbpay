package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1099021336);
    }

    public static void a(Context context, final String str, final HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4477c749", new Object[]{context, str, hashMap});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(context, new com.taobao.android.detail.ttdetail.bizmessage.h("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker$1
                {
                    put("page", "Page_Detail");
                    put("eventId", "2201");
                    put("arg1", (Object) str);
                    put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker$1.1
                        {
                            putAll(hashMap);
                        }
                    });
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    public static void a(Context context, final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(context, new com.taobao.android.detail.ttdetail.bizmessage.h("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker$2
                {
                    put("page", "Page_DWVideo");
                    put("eventId", "2201");
                    put("arg1", "Page_DWVideo_Button-videoShow");
                    put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker$2.1
                        {
                            put("mediaType", (Object) String.valueOf(1));
                            put("page", "detailMain");
                            put("seller_id", (Object) str);
                            put("item_id", (Object) str2);
                            if (str3 != null) {
                                put("shop_id", (Object) str3);
                            }
                        }
                    });
                }
            }, new RuntimeAbilityParam[0]));
        }
    }
}
