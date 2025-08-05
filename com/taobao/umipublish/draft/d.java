package com.taobao.umipublish.draft;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.File;
import tb.kge;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_DRAFT_PATH = "/AsyncPublishDraft";

    static {
        kge.a(-83883081);
    }

    public static File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{str});
        }
        File externalFilesDir = Globals.getApplication().getExternalFilesDir(null);
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static File b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("36a9927a", new Object[]{str});
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return null;
        }
        File file = new File(filesDir.getAbsolutePath() + str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }
}
