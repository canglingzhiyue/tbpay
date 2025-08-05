package com.taobao.downloader;

import android.content.Context;
import anet.channel.AwcnConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.downloader.manager.PriorityTaskManager;
import com.taobao.tao.Globals;
import java.io.File;
import java.io.Serializable;
import tb.kkv;
import tb.kkw;
import tb.kkx;
import tb.kky;
import tb.kkz;
import tb.kla;
import tb.klp;
import tb.klr;

/* loaded from: classes7.dex */
public class TbDownloader implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DOWNLOAD_STRATEGY_OPT = "downloader_strategy_opt";
    private static final String TAG = "TbDownloader";

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            getInstance();
        }
    }

    public static b getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7d67ae8", new Object[0]) : b.a();
    }

    private static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue() : (context.getApplicationInfo().flags & 2) != 0;
    }

    private static void initDownLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2820ce5f", new Object[0]);
            return;
        }
        if (a.c == null) {
            a.c = Globals.getApplication();
        }
        initABGlobal(a.c);
        initOrange();
        a.m = isDebug(a.c);
        a.g = new kkz();
        a.f = new kkw();
        a.d = new kla();
        a.e = new kky();
        a.k = new kkx();
        a.l = new kkv();
        a.n = klp.class;
        a.o = klr.class;
        a.i = new PriorityTaskManager();
        com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.downloader.TbDownloader.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public com.taobao.downloader.sync.a f17076a = new com.taobao.downloader.sync.a();

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i == 2) {
                    this.f17076a.b();
                } else if (i != 50) {
                } else {
                    this.f17076a.a();
                }
            }
        });
    }

    private static void initOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58d10e5", new Object[0]);
            return;
        }
        try {
            a.u = AwcnConfig.getRangeBoostOpen();
            a.t = AwcnConfig.getFragmentFileLengthThreshold();
        } catch (Throwable unused) {
        }
    }

    private static void initABGlobal(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3190496d", new Object[]{context});
            return;
        }
        try {
            boolean isDownloaderAsync = AwcnConfig.isDownloaderAsync();
            a.v = isDownloaderAsync;
            if (isDownloaderAsync) {
                return;
            }
            boolean abSwitchLocal = abSwitchLocal(DOWNLOAD_STRATEGY_OPT);
            a.v = abSwitchLocal;
            if (!abSwitchLocal) {
                return;
            }
            AwcnConfig.setDownloadAsync(true);
        } catch (Throwable unused) {
        }
    }

    private static boolean abSwitchLocal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba8a73cb", new Object[]{str})).booleanValue();
        }
        try {
            return new File("/data/local/tmp/", str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }
}
