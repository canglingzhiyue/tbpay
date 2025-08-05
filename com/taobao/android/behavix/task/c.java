package com.taobao.android.behavix.task;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.drp;
import tb.dsb;
import tb.dsp;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f9209a;

    static {
        kge.a(-1367014800);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("910ce0c7", new Object[0]);
        }
        if (f9209a == null) {
            synchronized (c.class) {
                if (f9209a == null) {
                    f9209a = new c();
                }
            }
        }
        return f9209a;
    }

    public void a(String str, String str2, String str3, Map<String, Object> map) {
        drp drpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
            return;
        }
        dsp dspVar = new dsp();
        dspVar.f26946a = str;
        dspVar.c = str3;
        dspVar.b = str2;
        if (map != null && (drpVar = (drp) map.get("baseNode")) != null) {
            dspVar.g = drpVar.v;
        }
        a(dspVar, map);
    }

    private void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a(f.a(str, map));
        }
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e850c789", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            com.taobao.android.behavix.utils.f.a().a(new Runnable() { // from class: com.taobao.android.behavix.task.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        aVar.a();
                    } catch (Exception e) {
                        dsb.a(aVar.b.taskName, null, null, e);
                    }
                }
            });
        }
    }

    private void a(dsp dspVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a73592e", new Object[]{this, dspVar, map});
        } else {
            a(com.taobao.android.behavix.behavixswitch.b.a().a(dspVar), map);
        }
    }

    private void a(JSONArray jSONArray, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10163f5", new Object[]{this, jSONArray, map});
        } else if (jSONArray != null && jSONArray.size() != 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("taskType");
                map.put("taskConfig", jSONObject);
                a(string, map);
            }
        }
    }
}
