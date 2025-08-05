package com.taobao.android.litecreator.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.ut.a;
import com.taobao.tao.Globals;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class aj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LC_IMAGE_EDIT_PAGE = "lc_image_edit_enter_";
    public static final String LC_PUBLISH_PAGE = "lc_publish_enter_";
    public static final String LC_RECORD_PAGE = "lc_record_enter_";
    public static final String LC_VIDEO_EDIT_PAGE = "lc_video_edit_enter_";
    public static final String SCENE_EXPORT = "export.dat";
    public static final String SCENE_PREVIEW = "preview.dat";

    static {
        kge.a(-1497263612);
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adebca06", new Object[]{str, aVar});
            return;
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return;
        }
        String str2 = filesDir.getAbsolutePath() + "/" + str + SCENE_PREVIEW;
        String str3 = filesDir.getAbsolutePath() + "/" + str + SCENE_EXPORT;
        boolean a2 = k.a(str2);
        boolean a3 = k.a(str3);
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        String str4 = "0";
        sb.append(a2 ? "preview" : str4);
        sb.append("_");
        if (a3) {
            str4 = com.taobao.android.weex_framework.util.a.ATOM_export;
        }
        sb.append(str4);
        hashMap.put("exit_info", sb.toString());
        aVar.c("invalid_exit", hashMap, true);
        u.b("LCCreator", "statPageInvalidExitInfo: " + a2 + a3);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return;
        }
        try {
            new File(filesDir.getAbsolutePath() + "/" + str + str2).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return;
        }
        String str2 = filesDir.getAbsolutePath() + "/" + str + SCENE_PREVIEW;
        k.c(str2);
        k.c(filesDir.getAbsolutePath() + "/" + str + SCENE_EXPORT);
    }
}
