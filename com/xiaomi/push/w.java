package com.xiaomi.push;

import java.io.File;
import java.util.HashMap;
import tb.kin;

/* loaded from: classes9.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, String> f24734a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f24734a = hashMap;
        hashMap.put("FFD8FF", com.taobao.android.litecreator.comprehension.f.FILE_TYPE_IMAGE_JPG);
        f24734a.put("89504E47", "png");
        f24734a.put("47494638", kin.GIF_MODE);
        f24734a.put("474946", kin.GIF_MODE);
        f24734a.put("424D", "bmp");
    }

    public static long a(File file) {
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                j += listFiles[i].isDirectory() ? a(listFiles[i]) : listFiles[i].length();
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
        return j;
    }
}
