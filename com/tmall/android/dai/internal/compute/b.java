package com.tmall.android.dai.internal.compute;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoSpanLayer;
import com.tmall.android.dai.DAIKVStoreage;
import com.tmall.android.dai.d;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.contrib.tmall.task.TaskManager;
import tb.gsf;
import tb.kge;
import tb.ktk;
import tb.rkq;
import tb.rkw;
import tb.rkx;
import tb.rky;
import tb.rkz;
import tb.rla;
import tb.rlb;
import tb.rlc;
import tb.rle;
import tb.rlf;
import tb.rlg;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final b f23679a;
    private final Map<String, Map<Integer, d>> b = Collections.synchronizedMap(new HashMap());

    static {
        kge.a(-545801122);
        f23679a = new b();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5bb502ad", new Object[0]) : f23679a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (rkq.d().b()) {
        } else {
            try {
                LogUtil.d("DAI", "initialNativeTaskHandle start");
                TaskManager.getInstance().addListener(new ServiceListener());
                a().a(8, new rlf());
                a().a(9, new rlg());
                a().a(11, new rkx(rkq.d().e()));
                a().a(12, new rkz());
                a().a(13, new rky());
                a().a(17, new rla());
                a().a(18, new rlb());
                a().a(19, new rkw());
                a().a(20, $$Lambda$b$9ByXc4pCz6T3ocDFzXv8B0GsQ0.INSTANCE);
                a().a(22, new rlc());
                a().a(24, new rle());
                if (!com.tmall.android.dai.internal.config.d.a().c()) {
                    LogUtil.d("DAI", "initialNativeTaskHandle onNativeInit");
                    TaskManager.getInstance().onNativeInit();
                }
                boolean equals = "true".equals(DAIKVStoreage.getValue("JARVIS", "featureUploadAllSwitch"));
                ktk.a(equals);
                TaskManager.getInstance().initializeMonitor(equals);
                LogUtil.d("DAI", "initialNativeTaskHandle addTaskInner success");
                rkq.d().b(true);
                LogUtil.d("DAI", "initialNativeTaskHandle success");
            } catch (Throwable th) {
                LogUtil.e("DAI", "initialNativeTaskHandle error!!!", th);
                com.tmall.android.dai.internal.util.a.a(FalcoSpanLayer.BUSINESS, "initialize", String.valueOf(181), th.getMessage());
                rkq.d().d(true);
                com.tmall.android.dai.internal.util.a.a("DAI", 19999, "init_error", "java-c bridge", null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_match, String.valueOf(gsf.a((String) map.get("crowd_ids"))));
        return hashMap;
    }

    public void a(int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18c29da", new Object[]{this, new Integer(i), dVar});
        } else {
            a("__walle_inner_model_all", i, dVar);
        }
    }

    public void a(String str, int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2148124", new Object[]{this, str, new Integer(i), dVar});
            return;
        }
        Map<Integer, d> map = this.b.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.b.put(str, map);
        }
        map.put(Integer.valueOf(i), dVar);
    }

    public Map<String, String> a(String str, int i, Map<String, String> map) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("55b989", new Object[]{this, str, new Integer(i), map});
        }
        Map<Integer, d> map2 = this.b.get(str);
        if (map2 == null) {
            map2 = this.b.get("__walle_inner_model_all");
        }
        if (map2 != null && map2.size() > 0 && (dVar = map2.get(Integer.valueOf(i))) != null) {
            return dVar.onTask(map);
        }
        return null;
    }
}
