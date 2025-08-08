package com.xiaomi.push;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class hz {
    private static HashMap<String, ArrayList<ig>> a(Context context, List<ig> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<ig>> hashMap = new HashMap<>();
        for (ig igVar : list) {
            a(context, igVar);
            ArrayList<ig> arrayList = hashMap.get(igVar.c());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(igVar.c(), arrayList);
            }
            arrayList.add(igVar);
        }
        return hashMap;
    }

    private static void a(Context context, ib ibVar, HashMap<String, ArrayList<ig>> hashMap) {
        for (Map.Entry<String, ArrayList<ig>> entry : hashMap.entrySet()) {
            try {
                ArrayList<ig> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    ibVar.a(value, value.get(0).e(), entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context, ib ibVar, List<ig> list) {
        HashMap<String, ArrayList<ig>> a2 = a(context, list);
        if (a2 != null && a2.size() != 0) {
            a(context, ibVar, a2);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
    }

    private static void a(Context context, ig igVar) {
        if (igVar.f513a) {
            igVar.a("push_sdk_channel");
        }
        if (StringUtils.isEmpty(igVar.d())) {
            igVar.f(com.xiaomi.push.service.ca.a());
        }
        igVar.b(System.currentTimeMillis());
        if (StringUtils.isEmpty(igVar.e())) {
            igVar.e(context.getPackageName());
        }
        if (StringUtils.isEmpty(igVar.c())) {
            igVar.e(igVar.e());
        }
    }
}
