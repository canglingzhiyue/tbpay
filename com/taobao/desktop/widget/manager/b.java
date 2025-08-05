package com.taobao.desktop.widget.manager;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import com.taobao.desktop.widget.template.standard.WidgetStandardReceiver;
import com.taobao.wireless.link.widget.combine.WidgetCombineReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;
import tb.khg;
import tb.khw;
import tb.kid;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public abstract class b implements com.taobao.desktop.widget.action.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f16975a;
    private final ConcurrentHashMap<String, com.taobao.desktop.widget.action.c> b = new ConcurrentHashMap<>();
    private AtomicLong c = new AtomicLong();

    static {
        kge.a(650639921);
        kge.a(83585510);
        kge.a(-1550454188);
    }

    public abstract void a(String str, Integer num, String str2);

    public abstract void a(String str, List<Integer> list, String str2);

    public abstract void a(List<String> list, String str, khg khgVar);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r0.equals("android.appwidget.action.APPWIDGET_UPDATE") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Intent r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.desktop.widget.manager.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r7 = "d8033c25"
            r0.ipc$dispatch(r7, r1)
            return
        L15:
            java.lang.Class r0 = r6.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onReceive："
            r1.append(r5)
            android.content.Context r5 = r6.f16975a
            r1.append(r5)
            java.lang.String r5 = ",intent:"
            r1.append(r5)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            tb.kif.a(r0, r1)
            java.lang.String r0 = r7.getAction()
            if (r0 != 0) goto L3e
            return
        L3e:
            r1 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case -789015650: goto L82;
                case -689938766: goto L78;
                case -491896793: goto L6e;
                case 452171151: goto L64;
                case 1027655412: goto L5a;
                case 1587081399: goto L50;
                case 1619576947: goto L47;
                default: goto L46;
            }
        L46:
            goto L8c
        L47:
            java.lang.String r3 = "android.appwidget.action.APPWIDGET_UPDATE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L8c
            goto L8d
        L50:
            java.lang.String r2 = "android.appwidget.action.APPWIDGET_ENABLED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 0
            goto L8d
        L5a:
            java.lang.String r2 = "miui.appwidget.action.APPWIDGET_UPDATE"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 5
            goto L8d
        L64:
            java.lang.String r2 = "android.appwidget.action.APPWIDGET_DELETED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 2
            goto L8d
        L6e:
            java.lang.String r2 = "com.taobao.widget_action_click"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 6
            goto L8d
        L78:
            java.lang.String r2 = "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 3
            goto L8d
        L82:
            java.lang.String r2 = "com.taobao.widget_receiver_action"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 4
            goto L8d
        L8c:
            r2 = -1
        L8d:
            switch(r2) {
                case 0: goto La5;
                case 1: goto La8;
                case 2: goto La1;
                case 3: goto L9d;
                case 4: goto L99;
                case 5: goto L95;
                case 6: goto L91;
                default: goto L90;
            }
        L90:
            goto Lab
        L91:
            r6.h(r7)
            goto Lab
        L95:
            r6.g(r7)
            return
        L99:
            r6.e(r7)
            return
        L9d:
            r6.f(r7)
            return
        La1:
            r6.d(r7)
            return
        La5:
            r6.b(r7)
        La8:
            r6.c(r7)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.widget.manager.b.a(android.content.Intent):void");
    }

    private void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            return;
        }
        Class<?> cls = getClass();
        kif.a(cls, "actionWidgetEnable：intent: " + intent);
    }

    private void c(Intent intent) {
        int[] intArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa30527", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (intArray = extras.getIntArray("appWidgetIds")) == null || intArray.length <= 0 || intent.getComponent() == null) {
            return;
        }
        a(intArray, intent.getComponent(), true);
    }

    private void d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f2e9a8", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("appWidgetId")) {
            return;
        }
        a(new int[]{extras.getInt("appWidgetId")});
    }

    private void e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d42ce29", new Object[]{this, intent});
            return;
        }
        try {
            int intExtra = intent.getIntExtra("appWidgetId", 0);
            String stringExtra = intent.getStringExtra("widget_type_id");
            String stringExtra2 = intent.getStringExtra("widget_channel");
            kif.a("actionWidgetReceiver appWidgetId: " + intExtra + ",typeId" + stringExtra);
            if (intent.getComponent() == null) {
                return;
            }
            a(intExtra, stringExtra, stringExtra2, intent.getComponent().getClassName());
            kih.a("widget_dynamic_add_in", stringExtra, stringExtra2, null);
            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_ADD_TYPE, new a.C0652a().a(stringExtra).b(stringExtra2).c("widget_dynamic_add_in"));
        } catch (Throwable th) {
            kif.a("actionWidgetReceiver error: " + th.getMessage());
        }
    }

    private void f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a692b2aa", new Object[]{this, intent});
            return;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("appWidgetId") || !extras.containsKey("appWidgetOptions")) {
                return;
            }
            int i = extras.getInt("appWidgetId");
            Bundle bundle = extras.getBundle("appWidgetOptions");
            kif.a("actionWidgetOptionsChanged appWidgetId: " + i + ",widgetExtras" + bundle);
            kih.a("widget_dynamic_update_option", String.valueOf(i), "", null);
            if (bundle == null) {
                return;
            }
            Bundle bundle2 = bundle.getBundle("widgetExtraData");
            if (bundle2 != null) {
                String string = bundle2.getString("widget_type_id");
                String string2 = bundle2.getString("widget_channel");
                kif.a("actionWidgetOptionsChanged widgetExtraData: " + bundle2);
                if (intent.getComponent() == null) {
                    return;
                }
                a(i, string, string2, intent.getComponent().getClassName());
                kih.a("widget_dynamic_add_in_miui", string, string2, null);
                com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_ADD_TYPE, new a.C0652a().a(string).b(string2).c("widget_dynamic_add_in_miui"));
                return;
            }
            kih.a("widget_dynamic_add_in_miui", "default", "", null);
            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_ADD_TYPE, new a.C0652a().a("normal").c("widget_dynamic_add_in_miui"));
        } catch (Throwable th) {
            kif.a("actionWidgetOptionsChanged error: " + th.getMessage());
        }
    }

    private void g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2972b", new Object[]{this, intent});
            return;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("appWidgetIds");
        Class<?> cls = getClass();
        kif.a(cls, "actionWidgetMIUIReceiver：intent: " + intent + "appWidgets" + Arrays.toString(intArrayExtra));
        if (intArrayExtra == null || intArrayExtra.length <= 0 || intent.getComponent() == null) {
            return;
        }
        a(intArrayExtra, intent.getComponent(), false);
        kih.a("widget_miui_exposure", Arrays.toString(intArrayExtra), "", null);
    }

    public void a(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1059b339", new Object[]{this, new Integer(i), str, str2, str3});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a("empty").b(str2).d("widget_state_add"));
                return;
            }
            Class<?> cls = getClass();
            kif.a(cls, "widgetAdd：widgetId: " + i + ",typeId: " + str + ",channel: " + str2 + ",receiverName: " + str3);
            g.a(this.f16975a).a(String.valueOf(i), str, str2, str3);
            if (b()) {
                khg khgVar = new khg();
                khgVar.a("install");
                a(Collections.singletonList(str), b(str, str2), khgVar);
            }
            kih.a("widget_dynamic_add_req", str, str2, new kih.a().a(Integer.valueOf(i)).c(str3));
            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(str).b(str2).d("widget_state_add"));
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetAdd error: " + e.getMessage());
        }
    }

    public void a(int[] iArr, ComponentName componentName, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d3bb", new Object[]{this, iArr, componentName, new Boolean(z)});
            return;
        }
        try {
            Class<?> cls = getClass();
            kif.a(cls, "widgetUpdate: " + Arrays.toString(iArr) + ",receiverName: " + componentName.getClassName());
            a(iArr, z);
            a(iArr, componentName);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetUpdate error: " + e.getMessage());
            kih.a("widget_catch_error", "widgetUpdate", e.getMessage(), null);
        }
    }

    private void a(int[] iArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2717601e", new Object[]{this, iArr, new Boolean(z)});
            return;
        }
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<JSONObject> c = g.a(this.f16975a).c();
        if (z) {
            a(c, hashSet);
        } else {
            a(iArr, c, hashSet);
        }
        kif.a("widgetUpdateRequest typeIdList: " + hashSet);
        if (hashSet.size() > 0 && b() && d()) {
            ArrayList arrayList = new ArrayList(hashSet);
            khg khgVar = new khg();
            khgVar.a("system");
            a(arrayList, a(arrayList), khgVar);
        }
        kih.a("widget_dynamic_update_req", hashSet.toString(), Arrays.toString(iArr), null);
    }

    private void a(int[] iArr, ComponentName componentName) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a253a639", new Object[]{this, iArr, componentName});
            return;
        }
        for (int i : iArr) {
            kif.a("widgetAddPreCheck widgetId: " + i);
            if (!g.a(this.f16975a).a(i)) {
                try {
                    cls = Class.forName(componentName.getClassName());
                } catch (ClassNotFoundException e) {
                    kif.a("widgetAddPreCheck findClass: " + e);
                    cls = null;
                }
                String a2 = f.a(cls);
                if (e.p(this.f16975a) && !g.a(this.f16975a).a(componentName, i)) {
                    kif.a(getClass(), "widgetAdd widgetId not exist：" + i);
                    return;
                } else if (kid.a(this.f16975a)) {
                    kif.a(getClass(), "widgetAddPreCheck isProcessForeground");
                    return;
                } else {
                    if (e.l(this.f16975a).booleanValue()) {
                        if (TextUtils.isEmpty(a2) && WidgetStandardReceiver.class.getName().equals(componentName.getClassName())) {
                            a2 = "editableWidget";
                        }
                        if ("131".equals(a2) && WidgetCombineReceiver.class.getName().equals(componentName.getClassName())) {
                            a2 = "1000000003";
                        }
                    }
                    kif.a(getClass(), "widgetAddPreCheck new widgetData: " + a2 + ", widgetId: " + i);
                    a(i, a2, "", componentName.getClassName());
                    kih.a("widget_dynamic_add_out", a2, "system", null);
                    com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_ADD_TYPE, new a.C0652a().a(a2).b("system").c("widget_dynamic_add_out"));
                }
            }
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("widget_type_id");
        khw a2 = khw.a(this.f16975a);
        long longValue = ((Long) a2.b("widget_update_id_" + string, 0L)).longValue();
        if (System.currentTimeMillis() >= longValue) {
            Class<?> cls = getClass();
            kif.a(cls, "[widgetUpdateTime] reach refreshTime: " + string + ", " + longValue);
            return true;
        }
        Class<?> cls2 = getClass();
        kif.a(cls2, "[widgetUpdateTime] not reach refreshTime: " + string + ", " + longValue);
        a(jSONObject.getString("widget_id"), jSONObject.getString("widget_receiver"), string);
        return false;
    }

    private void a(List<JSONObject> list, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b962f846", new Object[]{this, list, set});
            return;
        }
        for (JSONObject jSONObject : list) {
            if (a(jSONObject)) {
                String string = jSONObject.getString("widget_type_id");
                set.add(string);
                com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_RENDER_STATE, new a.C0652a().a(string).d("widget_state_update"));
            }
        }
    }

    private void a(int[] iArr, List<JSONObject> list, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f6c178", new Object[]{this, iArr, list, set});
            return;
        }
        for (int i : iArr) {
            for (JSONObject jSONObject : list) {
                if (String.valueOf(i).equals(jSONObject.getString("widget_id")) && a(jSONObject)) {
                    String string = jSONObject.getString("widget_type_id");
                    set.add(string);
                    com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_RENDER_STATE, new a.C0652a().a(string).d("widget_state_export"));
                }
            }
        }
    }

    public void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
            return;
        }
        Class<?> cls = getClass();
        kif.a(cls, "onDeleted：" + Arrays.toString(iArr));
        g.a(this.f16975a).a(iArr);
    }

    @Override // com.taobao.desktop.widget.action.b
    public void a(List<Integer> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2065ed", new Object[]{this, list, str, str2});
        } else {
            a(str, list, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: Throwable -> 0x008c, TryCatch #0 {Throwable -> 0x008c, blocks: (B:6:0x0015, B:8:0x0030, B:33:0x007f, B:29:0x006c, B:30:0x0072, B:31:0x0078, B:15:0x0045, B:18:0x004f, B:21:0x005a, B:35:0x0086), top: B:40:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: Throwable -> 0x008c, TryCatch #0 {Throwable -> 0x008c, blocks: (B:6:0x0015, B:8:0x0030, B:33:0x007f, B:29:0x006c, B:30:0x0072, B:31:0x0078, B:15:0x0045, B:18:0x004f, B:21:0x005a, B:35:0x0086), top: B:40:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h(android.content.Intent r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.desktop.widget.manager.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r8
            r1[r3] = r9
            java.lang.String r9 = "f9327bac"
            r0.ipc$dispatch(r9, r1)
            return
        L15:
            java.lang.String r0 = "action"
            java.lang.String r0 = r9.getStringExtra(r0)     // Catch: java.lang.Throwable -> L8c
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSONObject.parseObject(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "type"
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L8c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.taobao.desktop.widget.action.c> r1 = r8.b     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L8c
            com.taobao.desktop.widget.action.c r1 = (com.taobao.desktop.widget.action.c) r1     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L84
            r5 = -1
            int r6 = r0.hashCode()     // Catch: java.lang.Throwable -> L8c
            r7 = -913292410(0xffffffffc9904386, float:-1181808.8)
            if (r6 == r7) goto L5a
            r7 = -347607961(0xffffffffeb47ec67, float:-2.4169262E26)
            if (r6 == r7) goto L4f
            r7 = -347275122(0xffffffffeb4d008e, float:-2.4783241E26)
            if (r6 == r7) goto L45
            goto L64
        L45:
            java.lang.String r6 = "switchType"
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L64
            goto L65
        L4f:
            java.lang.String r2 = "switchItem"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L64
            r2 = 2
            goto L65
        L5a:
            java.lang.String r2 = "floatWindowLink"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L64
            r2 = 1
            goto L65
        L64:
            r2 = -1
        L65:
            if (r2 == 0) goto L78
            if (r2 == r3) goto L72
            if (r2 == r4) goto L6c
            goto L7d
        L6c:
            com.taobao.desktop.widget.action.d r1 = new com.taobao.desktop.widget.action.d     // Catch: java.lang.Throwable -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L8c
            goto L7d
        L72:
            com.taobao.desktop.widget.action.a r1 = new com.taobao.desktop.widget.action.a     // Catch: java.lang.Throwable -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L8c
            goto L7d
        L78:
            com.taobao.desktop.widget.action.e r1 = new com.taobao.desktop.widget.action.e     // Catch: java.lang.Throwable -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L8c
        L7d:
            if (r1 == 0) goto L84
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.taobao.desktop.widget.action.c> r2 = r8.b     // Catch: java.lang.Throwable -> L8c
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L8c
        L84:
            if (r1 == 0) goto L8b
            android.content.Context r0 = r8.f16975a     // Catch: java.lang.Throwable -> L8c
            r1.a(r0, r9, r8)     // Catch: java.lang.Throwable -> L8c
        L8b:
            return
        L8c:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[widgetClickAction] actionWidgetClick error: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            tb.kif.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.widget.manager.b.h(android.content.Intent):void");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : g.a(this.f16975a).c()) {
            if (!arrayList.contains(jSONObject.getString("widget_type_id"))) {
                arrayList.add(jSONObject.getString("widget_type_id"));
            }
        }
        Class<?> cls = getClass();
        kif.a(cls, "getRequestDataBackground typeIdList: " + arrayList);
        if (arrayList.size() <= 0 || !c()) {
            return;
        }
        khg khgVar = new khg();
        khgVar.a("background");
        a(arrayList, a(arrayList), khgVar);
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, (Object) str2);
        return jSONObject.toString();
    }

    public String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        JSONObject jSONObject = new JSONObject();
        CopyOnWriteArrayList<JSONObject> c = g.a(this.f16975a).c();
        for (String str : list) {
            for (JSONObject jSONObject2 : c) {
                if (str.equals(jSONObject2.getString("widget_type_id")) && !TextUtils.isEmpty(jSONObject2.getString("widget_channel"))) {
                    jSONObject.put(str, (Object) jSONObject2.getString("widget_channel"));
                }
            }
        }
        return jSONObject.toString();
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        try {
            CopyOnWriteArrayList<JSONObject> c = g.a(this.f16975a).c();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                ArrayList arrayList = new ArrayList();
                String str = "";
                for (JSONObject jSONObject : c) {
                    if (jSONObject.getString("widget_type_id").equals(entry.getKey())) {
                        arrayList.add(Integer.valueOf(jSONObject.getString("widget_id")));
                        str = jSONObject.getString("widget_receiver");
                    }
                }
                Class<?> cls = getClass();
                kif.a(cls, "widgetDataDispatch receiverName：" + str);
                if (!TextUtils.isEmpty(str)) {
                    a(str, arrayList, entry.getValue());
                }
            }
        } catch (Throwable th) {
            Class<?> cls2 = getClass();
            kif.a(cls2, "widgetDataDispatch error：" + th.getMessage());
            kih.a("widget_catch_error", "widgetDataUpdate", th.getMessage(), null);
        }
    }

    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
            return;
        }
        try {
            for (JSONObject jSONObject : g.a(this.f16975a).c()) {
                String string = jSONObject.getString("widget_id");
                String string2 = jSONObject.getString("widget_receiver");
                String string3 = jSONObject.getString("widget_type_id");
                String g = g.a(this.f16975a).g(string3);
                if (!TextUtils.isEmpty(g)) {
                    if (hashMap.containsKey(g)) {
                        a(string2, Integer.valueOf(string), new com.taobao.desktop.widget.action.e().a(hashMap.get(g)));
                    }
                } else if (hashMap.containsKey(string3)) {
                    String str = hashMap.get(string3);
                    if (string3.equals("tmallPet") || string3.equals("tmallPetMini")) {
                        str = new com.taobao.desktop.widget.action.a().b(str);
                    }
                    a(string2, Integer.valueOf(string), str);
                }
            }
            if (this.b.isEmpty()) {
                return;
            }
            this.b.clear();
        } catch (Exception e) {
            kif.a("[widgetSwitch] widgetDataDispatchWithSwitch error：" + e.getMessage());
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        String d = g.a(this.f16975a).d(str3);
        String g = g.a(this.f16975a).g(str3);
        if (!TextUtils.isEmpty(g)) {
            d = new com.taobao.desktop.widget.action.e().a(g.a(this.f16975a).d(g));
        }
        if (TextUtils.isEmpty(d)) {
            return;
        }
        a(str2, Integer.valueOf(str), d);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        long w = e.w(this.f16975a);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c.get() < w) {
            kif.a("widgetUpdateRequest systemReqLimit limit interval: " + w);
            return false;
        }
        this.c.set(currentTimeMillis);
        return true;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        int b = e.b(this.f16975a);
        if (b != 0) {
            return h.a(this.f16975a).a("widget_req_data", b, 0);
        }
        return true;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        int b = e.b(this.f16975a);
        int a2 = e.a(this.f16975a) * 1000;
        if (b != 0 || a2 != 0) {
            return h.a(this.f16975a).a("widget_bg_req_data", b, a2);
        }
        return true;
    }
}
