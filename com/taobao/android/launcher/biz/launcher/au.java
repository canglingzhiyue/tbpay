package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.HostController;
import java.io.File;
import java.util.HashMap;
import tb.tcs;

/* loaded from: classes.dex */
public class au extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(au auVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public au(String str) {
        super(str);
        shouldRunImmediately(true);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        application.getSharedPreferences("taobao_speed", 0).edit().clear().commit();
        application.getSharedPreferences("ab_watcher_indices_evo_switches", 0).edit().clear().commit();
        application.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().remove(HostController.KEY_APP_VIEW_MODE).commit();
        a(application);
    }

    private boolean a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c56f7b", new Object[]{this, application})).booleanValue();
        }
        File filesDir = application.getFilesDir();
        new File(filesDir, File.separator + ".bootimageready").delete();
        return application.getSharedPreferences(tcs.BOOTIMAGE_GROUP_NAME, 0).edit().putLong("tm", System.currentTimeMillis()).commit();
    }
}
