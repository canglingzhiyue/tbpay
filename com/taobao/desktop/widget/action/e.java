package com.taobao.desktop.widget.action;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.g;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.kht;
import tb.kif;

/* loaded from: classes7.dex */
public class e extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1718620344);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.desktop.widget.action.f
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            String b = b(this.e);
            if (StringUtils.isEmpty(b)) {
                return;
            }
            CopyOnWriteArrayList<JSONObject> c = g.a(this.c).c();
            ArrayList arrayList = new ArrayList();
            String str = "";
            for (JSONObject jSONObject2 : c) {
                if (this.e.equals(jSONObject2.getString("widget_type_id"))) {
                    arrayList.add(Integer.valueOf(jSONObject2.getString("widget_id")));
                    str = jSONObject2.getString("widget_receiver");
                }
            }
            String d = g.a(this.c).d(b);
            if (StringUtils.isEmpty(d)) {
                return;
            }
            String a2 = a(d);
            if (this.d != null) {
                this.d.a(arrayList, str, a2);
            }
            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(this.e).d("widget_click_switch_type"));
        } catch (Throwable th) {
            kif.a("[SwitchTypeAction] actionEvent: " + th);
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        JSONObject f = g.a(this.c).f(str);
        if (f == null) {
            return null;
        }
        String string = f.getString("switch_ids");
        long longValue = f.getLong("switch_refresh_time").longValue();
        String string2 = f.getString("switch_id_index");
        List list = (List) JSONObject.parseObject(string, new TypeReference<List<String>>() { // from class: com.taobao.desktop.widget.action.e.1
        }, new Feature[0]);
        while (true) {
            if (i >= list.size()) {
                break;
            } else if (string2.equals(list.get(i))) {
                string2 = (String) list.get((i + 1) % list.size());
                break;
            } else {
                i++;
            }
        }
        g.a(this.c).a(str, string, string2, longValue, kht.a());
        kif.a("[widgetSwitch] actionWidgetClick switchIdList: " + list + ",currWidgetTypeId: " + string2);
        return string2;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            JSONObject jSONObject = parseObject.getJSONObject("dataContent");
            if (jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("switchEnable", (Object) true);
                jSONObject.put("native", (Object) jSONObject2);
            }
            return parseObject.toString();
        } catch (Exception e) {
            kif.a("[SwitchTypeAction] disposeSwitchData: " + e);
            return "";
        }
    }
}
