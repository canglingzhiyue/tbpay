package com.taobao.mmad.fatigue;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.stv;
import tb.tiq;
import tb.tjm;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tiq f18112a;
    private Map<String, FatigueData> b = new ConcurrentHashMap();

    static {
        kge.a(553359111);
    }

    public a(tiq tiqVar) {
        this.f18112a = tiqVar;
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String str = this.f18112a.d().b().itemId;
        int i = this.f18112a.d().b().periodSeconds;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, FatigueData> map = this.b;
        if (map == null) {
            this.b = new ConcurrentHashMap();
            return;
        }
        FatigueData fatigueData = map.get(str);
        if (fatigueData == null) {
            fatigueData = new FatigueData();
        }
        fatigueData.times++;
        fatigueData.nextShowTime = (i * 1000) + System.currentTimeMillis();
        this.b.put(str, fatigueData);
        try {
            tjm.b("FatigueManager", JSON.toJSONString(this.b));
            stv.a("FatigueManager", "saveInfoShowRecord itemId=" + str + ", fatigueRecord=" + fatigueData);
        } catch (Exception e) {
            stv.a("FatigueManager", "saveInfoShowRecord error ", e);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String a2 = tjm.a("FatigueManager", null);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            this.b = (Map) JSON.parseObject(a2, new TypeReference<Map<String, FatigueData>>() { // from class: com.taobao.mmad.fatigue.a.1
            }, new Feature[0]);
        } catch (Exception e) {
            stv.a("FatigueManager", "loadFatigueRecord error ", e);
        }
    }

    public boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FatigueData fatigueData = this.b.get(str);
        if (fatigueData == null) {
            fatigueData = new FatigueData();
        }
        boolean z = fatigueData.times < i;
        stv.a("FatigueManager", "checkInfoFatigueAvailable timesAvailable=" + z + ", fatigueRecord.times=" + fatigueData.times + ", times=" + i);
        boolean z2 = fatigueData.nextShowTime <= System.currentTimeMillis();
        stv.a("FatigueManager", "checkInfoFatigueAvailable nextShowTimeAvailable=" + z2 + ", fatigueRecord.nextShowTime=" + fatigueData.nextShowTime + ", currentTime=" + System.currentTimeMillis());
        return z && z2;
    }
}
