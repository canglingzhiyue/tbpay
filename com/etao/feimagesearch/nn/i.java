package com.etao.feimagesearch.nn;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes3.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ADVANCED_DETECT = "plt_autodetect";
    public static final String TYPE_CODE_DETECT = "plt_code_detect";
    public static final String TYPE_OBJECT = "Object";
    public static final String TYPE_REALTIME_DETECT = "plt_search";
    public static final String TYPE_SMART_DETECT = "plt_smart_camera";
    public static final String TYPE_VIDEO = "Video";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, b> f6918a;

    /* loaded from: classes3.dex */
    private interface a<INPUT, OUTPUT> {
        OUTPUT a(INPUT input);
    }

    /* loaded from: classes3.dex */
    public interface b extends a<NetConfig, k> {
    }

    static {
        kge.a(-1656638675);
        f6918a = new ConcurrentHashMap();
    }

    public static void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429905a8", new Object[]{str, bVar});
        } else {
            f6918a.put(str, bVar);
        }
    }

    public static k a(NetConfig netConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("ee8ac240", new Object[]{netConfig});
        }
        b bVar = f6918a.get(netConfig.type);
        if (bVar != null) {
            return bVar.a(netConfig);
        }
        return null;
    }
}
