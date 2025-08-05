package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1806215639);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryTracker");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", "a2141.8604477.4068733");
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Page_SizeSuite_Show");
        uTCustomHitBuilder.setEventPage("Page_SizeSuite");
        uTCustomHitBuilder.setProperties(hashMap);
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "2201");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(Context context, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4477c749", new Object[]{context, str, hashMap});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
            uTCustomHitBuilder.setEventPage("Page_Detail");
            uTCustomHitBuilder.setProperties(hashMap);
            uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "2201");
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Page_DWVideo_Button-videoShow");
        uTCustomHitBuilder.setEventPage("Page_DWVideo");
        HashMap hashMap = new HashMap();
        hashMap.put("mediaType", String.valueOf(1));
        hashMap.put("page", "detailMain");
        hashMap.put("seller_id", str);
        hashMap.put("item_id", str2);
        if (str3 != null) {
            hashMap.put("shop_id", str3);
        }
        uTCustomHitBuilder.setProperties(hashMap);
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "2201");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
