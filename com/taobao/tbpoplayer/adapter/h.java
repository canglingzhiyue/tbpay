package com.taobao.tbpoplayer.adapter;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.norm.ITrackLogAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes.dex */
public class h implements ITrackLogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    private static final String f22205a = "Common";

    static {
        kge.a(836108295);
        kge.a(-1954495566);
    }

    public static /* synthetic */ void lambda$CM9zq_Sjq0250APmetyP1GGKcvc(String str, String str2, String str3, String str4) {
        b(str, str2, str3, str4);
    }

    public static /* synthetic */ void lambda$WmQL8b7Zd5PkDBPG36DM4arJxOc(String str, String str2, String str3, String str4) {
        a(str, str2, str3, str4);
    }

    @Override // com.alibaba.poplayer.norm.ILogAdapter
    public void Loge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e833d92", new Object[]{this, str});
        }
    }

    @Override // com.alibaba.poplayer.norm.ILogAdapter
    public void Logi(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6780c4db", new Object[]{this, str, objArr});
        }
    }

    public static /* synthetic */ void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = f22205a;
        }
        TLog.loge("PopLayer", str, com.alibaba.poplayer.utils.c.d(str2, str3, str4));
    }

    @Override // com.alibaba.poplayer.norm.ITrackLogAdapter
    public void Logi(boolean z, final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c500b0", new Object[]{this, new Boolean(z), str, str2, str3, str4});
        } else if (!z) {
        } else {
            try {
                Runnable runnable = new Runnable() { // from class: com.taobao.tbpoplayer.adapter.-$$Lambda$h$CM9zq_Sjq0250APmetyP1GGKcvc
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.lambda$CM9zq_Sjq0250APmetyP1GGKcvc(str, str2, str3, str4);
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    com.alibaba.poplayer.utils.f.a(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.alibaba.poplayer.norm.ITrackLogAdapter
    public void LogiImmediate(boolean z, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ba4e69", new Object[]{this, new Boolean(z), str, str2, str3, str4});
        } else if (!z) {
        } else {
            try {
                if (StringUtils.isEmpty(str)) {
                    str = f22205a;
                }
                TLog.loge("PopLayer", str, com.alibaba.poplayer.utils.c.d(str2, str3, str4));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = f22205a;
        }
        TLog.loge("PopLayer", str, com.alibaba.poplayer.utils.c.d(str2, str3, str4));
    }

    @Override // com.alibaba.poplayer.norm.ITrackLogAdapter
    public void Loge(boolean z, final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bfba34", new Object[]{this, new Boolean(z), str, str2, str3, str4});
        } else if (!z) {
        } else {
            try {
                Runnable runnable = new Runnable() { // from class: com.taobao.tbpoplayer.adapter.-$$Lambda$h$WmQL8b7Zd5PkDBPG36DM4arJxOc
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.lambda$WmQL8b7Zd5PkDBPG36DM4arJxOc(str, str2, str3, str4);
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    com.alibaba.poplayer.utils.f.a(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
