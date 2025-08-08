package com.taobao.downloader.sync;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import java.util.ArrayList;
import java.util.List;
import tb.kmv;

/* loaded from: classes7.dex */
public class b implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP = "android_download_task";
    public static final String TAG = "orangeSync";

    /* renamed from: a  reason: collision with root package name */
    private static b f17092a;
    private List<SyncItem> b;
    private Runnable c;

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d516c708", new Object[0]);
        }
        if (f17092a == null) {
            f17092a = new b();
            OrangeConfig.getInstance().registerListener(new String[]{GROUP}, f17092a);
        }
        return f17092a;
    }

    @Override // com.taobao.orange.f
    public void onConfigUpdate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
        } else if (!GROUP.equals(str)) {
        } else {
            kmv.b(TAG, " on orange update listener", new Object[0]);
            d();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig(GROUP, "predownload_tasks_version", "");
        if (StringUtils.isEmpty(config)) {
            config = OrangeConfig.getInstance().getConfig(GROUP, "predownload_tasks", "");
        }
        if (StringUtils.isEmpty(config)) {
            kmv.b(TAG, "read config is null", new Object[0]);
            return;
        }
        try {
            this.b = JSON.parseArray(config, SyncItem.class);
            if (this.c != null) {
                this.c.run();
            }
        } catch (Throwable unused) {
        }
        String config2 = OrangeConfig.getInstance().getConfig(GROUP, "boost_biz", "");
        if (StringUtils.isEmpty(config2)) {
            return;
        }
        com.taobao.downloader.a.r = config2;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(GROUP, "ShutDownFileSync", ""));
    }

    public List<SyncItem> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        if (this.b == null) {
            d();
        }
        List<SyncItem> list = this.b;
        return list == null ? new ArrayList() : new ArrayList(list);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.c = runnable;
        }
    }
}
