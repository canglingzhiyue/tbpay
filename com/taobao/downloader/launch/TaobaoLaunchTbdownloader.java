package com.taobao.downloader.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.TbDownloader;
import com.taobao.downloader.a;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class TaobaoLaunchTbdownloader implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        a.c = application;
        TbDownloader.init();
    }
}
