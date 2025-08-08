package com.taobao.desktop.widget.manager;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.khv;
import tb.khw;
import tb.kid;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f16982a;
    private final Context b;
    private String c;

    static {
        kge.a(1425022072);
    }

    public static g a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ea094a51", new Object[]{context});
        }
        if (f16982a == null) {
            synchronized (g.class) {
                if (f16982a == null) {
                    f16982a = new g(context);
                }
            }
        }
        return f16982a;
    }

    private g(Context context) {
        if (context.getApplicationContext() != null) {
            this.b = context.getApplicationContext();
        } else {
            this.b = context;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public void a(String str, String str2, String str3, String str4) {
        JSONObject next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            CopyOnWriteArrayList<JSONObject> c = c();
            Iterator<JSONObject> it = c.iterator();
            do {
                if (!it.hasNext()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("widget_id", (Object) str);
                    jSONObject.put("widget_type_id", (Object) str2);
                    jSONObject.put("widget_channel", (Object) str3);
                    jSONObject.put("widget_receiver", (Object) str4);
                    jSONObject.put("widget_process", (Object) Boolean.valueOf(khv.a()));
                    c.add(jSONObject);
                    String jSONString = JSON.toJSONString(c);
                    this.c = jSONString;
                    khw.a(this.b).a("widget_data", jSONString);
                    j();
                    Class<?> cls = getClass();
                    kif.a(cls, "saveWidgetData" + jSONString);
                    return;
                }
                next = it.next();
            } while (!str.equals(next.getString("widget_id")));
            next.put("widget_channel", (Object) str3);
            khw.a(this.b).a("widget_data", c);
            Class<?> cls2 = getClass();
            kif.a(cls2, "updateWidgetChannel: " + c);
        } catch (Exception e) {
            Class<?> cls3 = getClass();
            kif.a(cls3, "saveWidgetData error" + e.getMessage());
        }
    }

    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            CopyOnWriteArrayList<JSONObject> c = c();
            Iterator<JSONObject> it = c.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                if (str.equals(next.getString("widget_id"))) {
                    next.put("widget_type_id", (Object) str2);
                    khw.a(this.b).a("widget_data", c);
                    kif.a("[widgetDefault] changeWidgetTypeId widgetId:" + str + ",typeId: " + str2);
                    this.c = JSON.toJSONString(c);
                    j();
                    return true;
                }
            }
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "changeWidgetTypeId error" + e);
        }
        return false;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            khw.a(this.b).a("widget_share_data", str);
            Class<?> cls = getClass();
            kif.a(cls, "widgetDataSync widgetShareData: " + str);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetDataSync error" + e.getMessage());
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            int intValue = ((Integer) khw.a(this.b).b(Constants.EXTRA_KEY_APP_VERSION_CODE, 0)).intValue();
            if (kid.g(this.b) <= intValue) {
                Class<?> cls = getClass();
                kif.a(cls, " mainDataSync hasMerged versioncode: " + intValue);
                return;
            }
            if (StringUtils.isEmpty(str)) {
                str = khw.a(this.b, "widget_data");
            }
            if (!StringUtils.isEmpty(str)) {
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) JSONObject.parseObject(str, new TypeReference<CopyOnWriteArrayList<JSONObject>>() { // from class: com.taobao.desktop.widget.manager.g.1
                }, new Feature[0]);
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    if (l.b.contains(jSONObject.getString("widget_receiver"))) {
                        copyOnWriteArrayList.remove(jSONObject);
                    } else {
                        Context context = this.b;
                        a(this.b).a(jSONObject.getString("widget_type_id"), khw.a(context, "widget_type_id_" + jSONObject.getString("widget_type_id")));
                    }
                }
                CopyOnWriteArrayList<JSONObject> c = c();
                c.addAll(copyOnWriteArrayList);
                khw.a(this.b).a("widget_data", c);
                Class<?> cls2 = getClass();
                kif.a(cls2, "mainDataSync widgetDataMerge: " + c);
            }
            khw.a(this.b).a(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.valueOf(kid.g(this.b)));
        } catch (Exception e) {
            Class<?> cls3 = getClass();
            kif.a(cls3, "widgetDataSync error" + e.getMessage());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            int intValue = ((Integer) khw.a(this.b).b(Constants.EXTRA_KEY_APP_VERSION_CODE, 0)).intValue();
            if (kid.g(this.b) <= intValue) {
                Class<?> cls = getClass();
                kif.a(cls, " mainWidgetDataClear hasMerged versioncode: " + intValue);
                return;
            }
            CopyOnWriteArrayList<JSONObject> c = c();
            CopyOnWriteArrayList<JSONObject> d = d();
            Iterator<JSONObject> it = c.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                if (l.f16993a.contains(next.getString("widget_receiver"))) {
                    c.remove(next);
                    d.add(next);
                }
            }
            String jSONString = JSON.toJSONString(c);
            this.c = jSONString;
            khw.a(this.b).a("widget_data", jSONString);
            khw.a(this.b).a("widget_share_data", JSON.toJSONString(d));
            Class<?> cls2 = getClass();
            kif.a(cls2, "mainWidgetDataClear widgetDataList: " + c);
            khw.a(this.b).a(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.valueOf(kid.g(this.b)));
        } catch (Throwable th) {
            Class<?> cls3 = getClass();
            kif.a(cls3, "mainWidgetDataClear error" + th.getMessage());
        }
    }

    public CopyOnWriteArrayList<JSONObject> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("683c5a17", new Object[]{this});
        }
        CopyOnWriteArrayList<JSONObject> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            String str = (String) khw.a(this.b).b("widget_data", "");
            if (!StringUtils.isEmpty(str)) {
                copyOnWriteArrayList = (CopyOnWriteArrayList) JSONObject.parseObject(str, new TypeReference<CopyOnWriteArrayList<JSONObject>>() { // from class: com.taobao.desktop.widget.manager.g.2
                }, new Feature[0]);
            }
            Class<?> cls = getClass();
            kif.a(cls, "loadWidgetData widgetProcess: " + khv.a() + str);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetDataLoad error" + e.getMessage());
        }
        return copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<JSONObject> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("ddb68058", new Object[]{this});
        }
        CopyOnWriteArrayList<JSONObject> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            String str = (String) khw.a(this.b).b("widget_share_data", "");
            if (!StringUtils.isEmpty(str)) {
                copyOnWriteArrayList = (CopyOnWriteArrayList) JSONObject.parseObject(str, new TypeReference<CopyOnWriteArrayList<JSONObject>>() { // from class: com.taobao.desktop.widget.manager.g.3
                }, new Feature[0]);
            }
            Class<?> cls = getClass();
            kif.a(cls, "widgetShareDataLoad: " + khv.a() + str);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetShareDataLoad error" + e.getMessage());
        }
        return copyOnWriteArrayList;
    }

    public void a(List<Integer> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0788b", new Object[]{this, list, new Long(j)});
            return;
        }
        try {
            CopyOnWriteArrayList<JSONObject> c = c();
            for (Integer num : list) {
                int intValue = num.intValue();
                Iterator<JSONObject> it = c.iterator();
                while (it.hasNext()) {
                    JSONObject next = it.next();
                    if (String.valueOf(intValue).equals(next.getString("widget_id"))) {
                        a(next.getString("widget_type_id"), j);
                    }
                }
            }
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "widgetDataUpdate error" + e.getMessage());
        }
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            khw a2 = khw.a(this.b);
            a2.a("widget_update_id_" + str, Long.valueOf(j));
            Class<?> cls = getClass();
            kif.a(cls, "[widgetUpdateTime] widgetTypeId: " + str + " ,refreshTime: " + j);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "[widgetUpdateTime] error: " + e.getMessage());
        }
    }

    public void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
            return;
        }
        try {
            CopyOnWriteArrayList<JSONObject> c = c();
            for (int i : iArr) {
                Iterator<JSONObject> it = c.iterator();
                while (it.hasNext()) {
                    JSONObject next = it.next();
                    if (String.valueOf(i).equals(next.getString("widget_id"))) {
                        c.remove(next);
                        kif.a(getClass(), "widgetDelete item:" + next);
                        String string = next.getString("widget_type_id");
                        kih.a("widget_dynamic_delete_req", string, String.valueOf(i), null);
                        com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(string).d("widget_state_delete"));
                    }
                }
            }
            String jSONString = JSON.toJSONString(c);
            this.c = jSONString;
            khw.a(this.b).a("widget_data", jSONString);
            b(iArr);
            j();
        } catch (Exception e) {
            kif.a(getClass(), "widgetDataDelete error" + e.getMessage());
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        try {
            for (JSONObject jSONObject : a(this.b).c()) {
                if (str.equals(jSONObject.getString("widget_type_id")) && a(jSONObject)) {
                    return true;
                }
            }
            for (JSONObject jSONObject2 : a(this.b).d()) {
                if (str.equals(jSONObject2.getString("widget_type_id")) && a(jSONObject2)) {
                    return true;
                }
            }
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "widgetHasLocalData error" + e.getMessage());
        }
        return false;
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (e.t(this.b)) {
            return a(new ComponentName(this.b.getPackageName(), jSONObject.getString("widget_receiver")), Integer.parseInt(jSONObject.getString("widget_id")));
        }
        return true;
    }

    public boolean a(int i) {
        CopyOnWriteArrayList<JSONObject> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(this.c)) {
                copyOnWriteArrayList = a(this.b).c();
            } else {
                copyOnWriteArrayList = (CopyOnWriteArrayList) JSONObject.parseObject(this.c, new TypeReference<CopyOnWriteArrayList<JSONObject>>() { // from class: com.taobao.desktop.widget.manager.g.4
                }, new Feature[0]);
            }
            Iterator<JSONObject> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (String.valueOf(i).equals(it.next().getString("widget_id"))) {
                    kif.a("widgetIdHasLocalData widgetId: " + i);
                    return true;
                }
            }
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "widgetIdHasLocalData error" + e.getMessage());
        }
        return false;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            khw a2 = khw.a(this.b);
            a2.a("widget_type_id_" + str, str2);
            Class<?> cls = getClass();
            kif.a(cls, "widgetResponseDataSave typeId: " + str);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetResponseDataSave error" + e.getMessage());
        }
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        try {
            khw a2 = khw.a(this.b);
            String str2 = (String) a2.b("widget_type_id_" + str, "");
            Class<?> cls = getClass();
            kif.a(cls, "widgetResponseDataLoad typeId: " + str);
            return str2;
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetResponseDataLoad error" + e.getMessage());
            return "";
        }
    }

    public void a(String str, String str2, String str3, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5736af46", new Object[]{this, str, str2, str3, new Long(j), new Long(j2)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("switch_ids", (Object) str2);
            jSONObject.put("switch_id_index", (Object) str3);
            jSONObject.put("switch_refresh_time", (Object) Long.valueOf(j));
            jSONObject.put("switch_click_time", (Object) Long.valueOf(j2));
            khw a2 = khw.a(this.b);
            a2.a("widget_type_switch_id_" + str, (Object) jSONObject);
            kif.a("[widgetSwitch] widgetSwitchIdsSave typeId: " + str + ",currentTypeId: " + str3);
        } catch (Exception e) {
            kif.a("[widgetSwitch] widgetSwitchIdsSave error" + e.getMessage());
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        try {
            khw a2 = khw.a(this.b);
            a2.a("widget_type_switch_id_" + str, "");
            kif.a("[widgetSwitch] widgetSwitchIdsClear typeId: " + str);
        } catch (Exception e) {
            kif.a("[widgetSwitch] widgetSwitchIdsClear error" + e.getMessage());
        }
    }

    public JSONObject f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("427d5997", new Object[]{this, str});
        }
        try {
            khw a2 = khw.a(this.b);
            String str2 = (String) a2.b("widget_type_switch_id_" + str, "");
            kif.a("[widgetSwitch] widgetSwitchIdDataLoad typeId: " + str + ",switchIdListData: " + str2);
            if (StringUtils.isEmpty(str2)) {
                return null;
            }
            return JSONObject.parseObject(str2);
        } catch (Exception e) {
            kif.a("[widgetSwitch] widgetSwitchIdDataLoad error" + e.getMessage());
            return null;
        }
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{this, str});
        }
        JSONObject f = f(str);
        if (f == null) {
            return "";
        }
        String string = f.getString("switch_id_index");
        kif.a("[widgetSwitch] getSwitchTypeId switchTypeId: " + string);
        return string;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("widget_type", (Object) str);
            jSONObject.put("widget_type_id", (Object) str2);
            jSONObject.put("widget_channel", (Object) str3);
            jSONObject.put("widget_pre_add_time", (Object) Long.valueOf(System.currentTimeMillis()));
            khw.a(this.b).a("widget_pre_add_data", (Object) jSONObject);
            Class<?> cls = getClass();
            kif.a(cls, "widgetStandardPreAdd" + jSONObject);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetStandardPreAdd error" + e.getMessage());
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            khw.a(this.b).a("widget_refresh_time", Long.valueOf(Long.parseLong(str)));
        }
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (e.o(this.b)) {
                return c(str2);
            }
            return i(l.a(str)) && c(str2);
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "widgetInstall: " + e.getMessage());
            return false;
        }
    }

    public boolean a(ComponentName componentName, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b13c36e0", new Object[]{this, componentName, new Integer(i)})).booleanValue();
        }
        if (componentName == null) {
            return false;
        }
        int[] appWidgetIds = AppWidgetManager.getInstance(this.b.getApplicationContext()).getAppWidgetIds(componentName);
        kif.a(getClass(), "checkWidgetIdSystem component: " + componentName.getClassName() + ",widgetId: " + i + ",appWidgetIds: " + Arrays.toString(appWidgetIds));
        for (int i2 : appWidgetIds) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4533163e", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && AppWidgetManager.getInstance(this.b.getApplicationContext()).getAppWidgetIds(new ComponentName(this.b.getPackageName(), str)).length > 0;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        for (String str : l.f16993a) {
            if (i(str)) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!i()) {
        } else {
            com.taobao.desktop.widget.service.a.a(this.b).a(1, null, null);
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : e.e(this.b) && a(this.b).e();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!e.i(this.b) || !khv.a()) {
        } else {
            kif.b(getClass(), "widgetProcessSync ");
            com.taobao.desktop.widget.service.a.a(this.b).a(1);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!i()) {
        } else {
            kif.b(getClass(), "mainProcessDataSync ");
            com.taobao.desktop.widget.service.a.a(this.b).a(2, null, null);
        }
    }

    private void b(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffbcb7", new Object[]{this, iArr});
            return;
        }
        List<String> h = h();
        for (int i : iArr) {
            h.add(String.valueOf(i));
        }
        khw.a(this.b).a("widget_del_data", h.toString());
    }

    public List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        List<String> arrayList = new ArrayList<>();
        String str = (String) khw.a(this.b).b("widget_del_data", "");
        if (!StringUtils.isEmpty(str)) {
            arrayList = JSONObject.parseArray(str, String.class);
        }
        Class<?> cls = getClass();
        kif.a(cls, "widgetDelLocalDataLoad widgetDelList: " + arrayList);
        return arrayList;
    }
}
