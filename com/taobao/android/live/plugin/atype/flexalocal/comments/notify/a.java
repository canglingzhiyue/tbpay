package com.taobao.android.live.plugin.atype.flexalocal.comments.notify;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.plx;
import tb.ply;
import tb.pmd;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable c = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = ad.a("important_fatigue_key");
            try {
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                JSONArray jSONArray = (JSONArray) JSONObject.parse(a2);
                for (int i = 0; i < jSONArray.size(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            ImportantEventItem.FatigueInfo fatigueInfo = (ImportantEventItem.FatigueInfo) JSONObject.parseObject(ad.a(str), ImportantEventItem.FatigueInfo.class);
                            if (SystemClock.elapsedRealtime() - fatigueInfo.startTime > fatigueInfo.timeoutTime) {
                                a.a(a.this, fatigueInfo);
                                plx.a("FatigueController", "delete key:" + fatigueInfo.fatigueKey);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                plx.b("FatigueController", "clearRunnable value:" + a2);
            }
        }
    };
    private Set<String> b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ImportantEventItem.FatigueInfo> f13686a = new HashMap();

    static {
        kge.a(-683934484);
    }

    public static /* synthetic */ void a(a aVar, ImportantEventItem.FatigueInfo fatigueInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5f8cad", new Object[]{aVar, fatigueInfo});
        } else {
            aVar.b(fatigueInfo);
        }
    }

    public a() {
        if (ply.w()) {
            Coordinator.execute(this.c);
        }
    }

    public ImportantEventItem.FatigueInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImportantEventItem.FatigueInfo) ipChange.ipc$dispatch("d41579a2", new Object[]{this, str});
        }
        Map<String, ImportantEventItem.FatigueInfo> map = this.f13686a;
        if (map != null && map.containsKey(str)) {
            return this.f13686a.get(str);
        }
        try {
            String a2 = ad.a(str);
            if (!TextUtils.isEmpty(a2)) {
                return (ImportantEventItem.FatigueInfo) JSONObject.parseObject(a2, ImportantEventItem.FatigueInfo.class);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private void b(ImportantEventItem.FatigueInfo fatigueInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30f167", new Object[]{this, fatigueInfo});
            return;
        }
        SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("taolive", 0).edit();
        edit.remove(fatigueInfo.fatigueKey);
        edit.commit();
    }

    public void a(ImportantEventItem.FatigueInfo fatigueInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47250a66", new Object[]{this, fatigueInfo});
            return;
        }
        if (fatigueInfo.startTime == 0) {
            fatigueInfo.startTime = SystemClock.elapsedRealtime();
        }
        this.f13686a.put(fatigueInfo.fatigueKey, fatigueInfo);
        ad.a(fatigueInfo.fatigueKey, JSONObject.toJSONString(fatigueInfo));
        this.b.add(fatigueInfo.fatigueKey);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Set<String> set = this.b;
        if (set == null || set.size() == 0) {
            return;
        }
        String a2 = ad.a("important_fatigue_key");
        if (!TextUtils.isEmpty(a2)) {
            Iterator<Object> it = ((JSONArray) JSONObject.parse(a2)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    this.b.add((String) next);
                }
            }
        }
        ad.a("important_fatigue_key", JSON.toJSONString(this.b));
    }
}
