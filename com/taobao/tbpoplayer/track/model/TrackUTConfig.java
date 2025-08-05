package com.taobao.tbpoplayer.track.model;

import android.text.TextUtils;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.util.e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.cac;
import tb.kge;
import tb.qnz;

/* loaded from: classes8.dex */
public class TrackUTConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean enable = true;
    public Map<String, Boolean> hitResultMap = new HashMap();
    public Map<String, Integer> percentMap;

    static {
        kge.a(1934309812);
        kge.a(1028243835);
    }

    public boolean getCategoryHit(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79248f08", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (z) {
            return e.a(this.percentMap.get(str).intValue(), e.b(qnz.a().b() + System.currentTimeMillis()));
        }
        Map<String, Boolean> map = this.hitResultMap;
        if (map == null || !map.containsKey(str)) {
            return cac.a().a(str);
        }
        return this.hitResultMap.get(str).booleanValue();
    }

    public Map<String, Boolean> generateHitMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1311559a", new Object[]{this});
        }
        Map<String, Integer> map = this.percentMap;
        if (map == null || map.isEmpty()) {
            this.hitResultMap = new HashMap();
            return this.hitResultMap;
        }
        Map<String, Boolean> map2 = this.hitResultMap;
        if (map2 == null) {
            this.hitResultMap = new HashMap();
        } else {
            map2.clear();
        }
        try {
            long b = e.b(qnz.a().b() + System.currentTimeMillis());
            for (String str : this.percentMap.keySet()) {
                this.hitResultMap.put(str, Boolean.valueOf(e.a(this.percentMap.get(str).intValue(), b)));
            }
        } catch (Throwable th) {
            c.a("TrackUTConfig.generateHitMap.error", th);
        }
        return this.hitResultMap;
    }
}
