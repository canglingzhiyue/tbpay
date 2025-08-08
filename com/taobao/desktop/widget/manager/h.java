package com.taobao.desktop.widget.manager;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import tb.kge;
import tb.khp;
import tb.kht;
import tb.khw;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile h f16987a;
    private final Context b;

    static {
        kge.a(1316153231);
    }

    public static h a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ea094a70", new Object[]{context});
        }
        if (f16987a == null) {
            synchronized (h.class) {
                if (f16987a == null) {
                    f16987a = new h(context);
                }
            }
        }
        return f16987a;
    }

    private h(Context context) {
        if (context.getApplicationContext() != null) {
            this.b = context.getApplicationContext();
        } else {
            this.b = context;
        }
    }

    public HashMap<String, String> a(String str) {
        HashMap<String, String> hashMap;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{this, str});
        }
        Class<?> cls = getClass();
        kif.a(cls, "parseRequestData" + str);
        try {
            hashMap = new HashMap<>(10);
            JSONObject parseObject = JSONObject.parseObject(str);
            g.a(this.b).h(String.valueOf(parseObject.getJSONObject("refreshPolicy").getString("nextRefreshTime")));
            JSONObject jSONObject = parseObject.getJSONObject("contentMap");
            JSONObject jSONObject2 = jSONObject.getJSONObject("widget");
            a(jSONObject);
            jSONArray = jSONObject2.getJSONArray("content");
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "parseRequestData error" + e.getMessage());
            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().g(e.getMessage()).d("widget_request_error"));
        }
        if (jSONArray != null && jSONArray.size() != 0) {
            boolean c = khp.c();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    if (c) {
                        String string = ((JSONObject) next).getString("id");
                        if (StringUtils.isEmpty(string)) {
                            return null;
                        }
                        a(string, (JSONObject) next);
                        hashMap.put(string, next.toString());
                        g.a(this.b).a(string, next.toString());
                    } else {
                        JSONObject jSONObject3 = ((JSONObject) next).getJSONObject("jsonContent");
                        String string2 = ((JSONObject) next).getString("id");
                        if (!StringUtils.isEmpty(string2) && jSONObject3 != null && (jSONArray2 = jSONObject3.getJSONArray("data")) != null && jSONArray2.size() != 0) {
                            JSONObject jSONObject4 = (JSONObject) jSONArray2.get(0);
                            hashMap.put(string2, jSONObject4.toString());
                            g.a(this.b).a(string2, jSONObject4.toString());
                        }
                        return null;
                    }
                }
            }
            Class<?> cls3 = getClass();
            kif.b(cls3, "parseMap：" + hashMap);
            if (hashMap.size() <= 0) {
                return null;
            }
            return hashMap;
        }
        kif.a(getClass(), "parseRequestData response error");
        return null;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("androidFloatWindow");
            if (jSONObject2 == null) {
                return;
            }
            com.taobao.desktop.channel.desktoplinktask.widgetservice.c.a().a((List) JSONObject.parseObject(jSONObject2.getString("content"), new TypeReference<List<JSONObject>>() { // from class: com.taobao.desktop.widget.manager.h.1
            }, new Feature[0]));
        } catch (Exception e) {
            kif.b("parseFloatWindowData error: " + e.getMessage());
        }
    }

    private void a(String str, JSONObject jSONObject) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        try {
            if (!e.r(this.b)) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("switchableWidgetList");
            if (jSONArray != null && jSONArray.size() != 0) {
                kif.a("[widgetSwitch] widgetSwitchDataSet widgetSwitchIdList: " + jSONArray);
                JSONObject f = g.a(this.b).f(str);
                long j2 = 0;
                if (f != null) {
                    j = f.getLong("switch_click_time").longValue();
                    j2 = f.getLong("switch_refresh_time").longValue();
                } else {
                    j = 0;
                }
                if (jSONObject.getBoolean("updateRefreshTimeEnable").booleanValue()) {
                    j2 = kht.a();
                }
                g.a(this.b).a(str, jSONArray.toString(), jSONArray.get(0).toString(), j2, j);
                return;
            }
            g.a(this.b).e(str);
        } catch (Exception e) {
            kif.a("[widgetSwitch] widgetSwitchDataSet error" + e.getMessage());
        }
    }

    public boolean a(String str, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3526816", new Object[]{this, str, new Integer(i), new Integer(i2)})).booleanValue();
        }
        try {
            String str2 = (String) khw.a(this.b).b(str, "");
            JSONObject jSONObject = new JSONObject();
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Calendar.getInstance().getTime());
            long currentTimeMillis = System.currentTimeMillis();
            if (!str2.isEmpty()) {
                Class<?> cls = getClass();
                kif.a(cls, str + " reqWidgetDataCheck localRequestData：" + str2);
                jSONObject = JSONObject.parseObject(str2);
                String string = jSONObject.getString("widget_req_date");
                i3 = jSONObject.getInteger("widget_req_times").intValue();
                long longValue = jSONObject.getLong("widget_last_req").longValue();
                if (!format.equals(string)) {
                    i3 = 0;
                }
                if (i2 > 0 && currentTimeMillis > longValue && currentTimeMillis - longValue < i2) {
                    Class<?> cls2 = getClass();
                    kif.a(cls2, str + " not reach interval time, reqInterval：" + i2);
                    return false;
                } else if (format.equals(string) && i > 0 && i3 >= i) {
                    kih.a("widget_catch_error", "requestLimitCheck", str2, null);
                    kif.a(str + " reach max request limit,maxRequestTimes：" + i);
                    return false;
                }
            } else {
                i3 = 0;
            }
            Class<?> cls3 = getClass();
            kif.a(cls3, str + " normal request,today: " + format + ",reqTimes: " + i3);
            jSONObject.put("widget_req_date", (Object) format);
            jSONObject.put("widget_req_times", (Object) Integer.valueOf(i3 + 1));
            jSONObject.put("widget_last_req", (Object) Long.valueOf(currentTimeMillis));
            khw.a(this.b).a(str, jSONObject.toString());
            return true;
        } catch (Exception e) {
            Class<?> cls4 = getClass();
            kif.a(cls4, "reqWidgetDataCheck error: " + e.getMessage());
            return true;
        }
    }
}
