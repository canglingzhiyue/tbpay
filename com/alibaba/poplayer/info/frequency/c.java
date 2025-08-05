package com.alibaba.poplayer.info.frequency;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.config.manager.d;
import com.alibaba.poplayer.info.frequency.SceneFreqConfigModel;
import com.alibaba.poplayer.norm.ISceneFreqAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bzl;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f3185a = new AtomicBoolean(false);
    private List<SceneFreqConfigModel> b;

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f3187a;

        static {
            kge.a(-705873182);
            f3187a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c795169c", new Object[0]) : f3187a;
        }
    }

    static {
        kge.a(-159281137);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c795169c", new Object[0]) : a.a();
    }

    private List<SceneFreqConfigModel> b() {
        ISceneFreqAdapter c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        if (this.f3185a.compareAndSet(false, true) && (c = bzl.a().c()) != null) {
            String sceneFreqConfig = c.getSceneFreqConfig();
            if (!TextUtils.isEmpty(sceneFreqConfig)) {
                try {
                    this.b = new CopyOnWriteArrayList((Collection) JSON.parseObject(sceneFreqConfig, new TypeReference<List<SceneFreqConfigModel>>() { // from class: com.alibaba.poplayer.info.frequency.c.1
                    }, new Feature[0]));
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("SceneFreqManager.parse.error", th);
                }
            }
        }
        com.alibaba.poplayer.utils.c.a("SceneFreqManager.getSceneFreqConfigs=" + this.b, new Object[0]);
        return this.b;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            List<SceneFreqConfigModel> b = b();
            com.alibaba.poplayer.utils.c.a("SceneFreqManager.countTireFreq.configs=" + b, new Object[0]);
            if (b == null || b.isEmpty()) {
                return;
            }
            SceneFreqConfigModel a2 = a(str, str2, b);
            StringBuilder sb = new StringBuilder();
            sb.append("SceneFreqManager.countTireFreq.hitConfig=");
            if (a2 == null) {
                z = false;
            }
            sb.append(z);
            com.alibaba.poplayer.utils.c.a(sb.toString(), new Object[0]);
            if (a2 == null) {
                return;
            }
            for (SceneFreqConfigModel.FreqConfig freqConfig : a2.freq) {
                if (freqConfig != null && freqConfig.layer != null && freqConfig.layer.equals(str3)) {
                    freqConfig.lastRecordTime = Long.valueOf(System.currentTimeMillis());
                    com.alibaba.poplayer.utils.c.a("SceneFreqManager.countTireFreq.lastRecordTime=" + freqConfig.lastRecordTime + ".layer=" + freqConfig.layer, new Object[0]);
                    return;
                }
            }
        }
    }

    public boolean b(String str, String str2, String str3) {
        List<SceneFreqConfigModel> b;
        SceneFreqConfigModel a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3509d0b", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (b = b()) == null || b.isEmpty() || (a2 = a(str, str2, b)) == null) {
            return true;
        }
        Iterator<SceneFreqConfigModel.FreqConfig> it = a2.freq.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SceneFreqConfigModel.FreqConfig next = it.next();
            if (next != null) {
                if ((TextUtils.isEmpty(next.layer) && TextUtils.isEmpty(str3)) || next.layer.equals(str3)) {
                    if (next.lastRecordTime != null && next.lastRecordTime.longValue() > 0) {
                        long currentTimeMillis = (System.currentTimeMillis() - next.lastRecordTime.longValue()) / 1000;
                        if (currentTimeMillis <= next.interval.intValue()) {
                            z = false;
                        }
                        com.alibaba.poplayer.utils.c.a("SceneFreqManager.checkFreq.layer=" + str3 + ".lastRecordTime=" + next.lastRecordTime + ".curInterval=" + currentTimeMillis + ".interval=" + next.interval + ".pass=" + z, new Object[0]);
                        return z;
                    }
                    com.alibaba.poplayer.utils.c.a("SceneFreqManager.checkFreq.layer=" + str3 + "noLastRecordTime.pass=true", new Object[0]);
                }
            }
        }
        return true;
    }

    private static SceneFreqConfigModel a(String str, String str2, List<SceneFreqConfigModel> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SceneFreqConfigModel) ipChange.ipc$dispatch("3f2ddbef", new Object[]{str, str2, list});
        }
        for (SceneFreqConfigModel sceneFreqConfigModel : list) {
            if (sceneFreqConfigModel != null) {
                Iterator<String> it = sceneFreqConfigModel.uris.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.equals(it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z = d.a(str2, sceneFreqConfigModel.filter);
                }
                if (z) {
                    return sceneFreqConfigModel;
                }
            }
        }
        return null;
    }
}
