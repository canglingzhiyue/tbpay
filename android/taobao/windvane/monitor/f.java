package android.taobao.windvane.monitor;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface f {

    /* loaded from: classes2.dex */
    public interface a {
        void onJsBridgeReturn(String str, String str2, String str3, String str4);

        void onMtopJsBridgeReturn(String str, String str2, String str3, String str4);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onOccurJsError(String str, String str2, String str3);
    }

    /* loaded from: classes2.dex */
    public interface c {
        void onFormatRequest(String str, String str2, String str3);

        void onResponse(String str, String str2, int i, boolean z, Map<String, List<String>> map);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void recordDeviceCreateTime(String str, long j);

        void recordFSP(String str, long j);

        void recordTTI(String str, long j);
    }

    /* loaded from: classes2.dex */
    public interface e {
        void onOccurWhitePage(String str, String str2);
    }

    /* renamed from: android.taobao.windvane.monitor.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0020f {
        void onZCacheResponse(String str, String str2, boolean z, String str3);
    }
}
