package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import java.util.HashMap;
import tb.eyz;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENABLE_SMALL_WINDOW = "detail3EnableSmallWindow";

    static {
        kge.a(1948553031);
    }

    public static boolean a(Context context, Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1304ebb5", new Object[]{context, feature})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean c = c(feature);
        boolean c2 = c(context);
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "canAutoPlay(): " + (currentTimeMillis2 - currentTimeMillis));
        return c2 && c;
    }

    public static boolean a(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76609dbd", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isDetail3EnableSmallWindow();
        }
        return false;
    }

    public static boolean b(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87166a7e", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isDetail3VideoCompress();
        }
        return false;
    }

    private static boolean c(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97cc373f", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isDetail3VideoAutoPlay();
        }
        return false;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : !a(context) && b(context) && a();
    }

    public static boolean a(Context context) {
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null && (data = intent.getData()) != null) {
            return "taolive".equalsIgnoreCase(data.getQueryParameter("bizType"));
        }
        return false;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : odg.c().a(context);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!j.a()) {
            return false;
        }
        boolean z = e.a().f30840a == 1;
        i.a("VideoUtils", "是否低端机=" + z);
        if (!z || !j.b()) {
            return true;
        }
        i.a("VideoUtils", "低端机头图视频默认不播放");
        return false;
    }

    public static HashMap<String, String> a(eyz eyzVar) {
        Item item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ef5ddbb5", new Object[]{eyzVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (eyzVar != null && (item = (Item) eyzVar.a(Item.class)) != null) {
            hashMap.put("item_id", item.getItemId());
        }
        return hashMap;
    }
}
