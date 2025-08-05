package com.taobao.search.common.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TBSearch";

    static {
        kge.a(444490014);
    }

    /* loaded from: classes7.dex */
    public static class b {
        public static final String DIMENSION_MTOP = "mtopSource";
        public static final String MEASURE_LOAD = "load";
        public static final String MEASURE_NETWORK = "network";
        public static final String MEASURE_ONCREATE = "onCreate";
        public static final String MEASURE_ONRESUME = "onResume";
        public static final String MEASURE_ONSTART = "onStart";
        public static final String MEASURE_PARSEDATA = "parseData";
        public static final String MEASURE_SHOWUI = "showUI";
        public static final String MEASURE_UI_SHOWN = "uiShown";
        public static final String MEASURE_WHOLE = "whole";

        static {
            kge.a(108502410);
        }

        /* loaded from: classes7.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            public static final String POINT_NAME = "SearchDoor";

            static {
                kge.a(1113271976);
            }

            public static void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[0]);
                    return;
                }
                MeasureSet create = MeasureSet.create();
                create.addMeasure("load");
                create.addMeasure(b.MEASURE_ONCREATE);
                create.addMeasure("onStart");
                create.addMeasure(b.MEASURE_SHOWUI);
                create.addMeasure("onResume");
                AppMonitor.register(i.MODULE_NAME, POINT_NAME, create);
            }

            public static void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                } else {
                    AppMonitor.Stat.begin(i.MODULE_NAME, POINT_NAME, str);
                }
            }

            public static void b(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
                } else {
                    AppMonitor.Stat.end(i.MODULE_NAME, POINT_NAME, str);
                }
            }
        }

        /* renamed from: com.taobao.search.common.util.i$b$b  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static class C0759b {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            public static final String POINT_NAME = "SearchEnter";

            /* renamed from: a  reason: collision with root package name */
            public static DimensionValueSet f19035a;
            public static MeasureValueSet b;
            private static boolean c;

            static {
                kge.a(-1626642505);
            }

            public static void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[0]);
                    return;
                }
                MeasureSet create = MeasureSet.create();
                create.addMeasure(b.MEASURE_WHOLE);
                create.addMeasure("network");
                create.addMeasure(b.MEASURE_PARSEDATA);
                create.addMeasure(b.MEASURE_UI_SHOWN);
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension(b.DIMENSION_MTOP);
                AppMonitor.register(i.MODULE_NAME, POINT_NAME, create, create2);
                f19035a = DimensionValueSet.create();
                b = MeasureValueSet.create();
            }

            public static void a(String str) {
                MeasureValueSet measureValueSet;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                } else if (!c || (measureValueSet = b) == null) {
                } else {
                    measureValueSet.setValue(str, MeasureValue.create(System.currentTimeMillis()));
                }
            }

            public static void a(String str, long j) {
                MeasureValueSet measureValueSet;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
                } else if (!c || (measureValueSet = b) == null) {
                } else {
                    measureValueSet.setValue(str, j);
                }
            }

            public static void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[0]);
                    return;
                }
                c = true;
                a();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_CODE = "code";
        public static final String KEY_MSG = "msg";
        public static final String KEY_TYPE = "type";
        public static final String POINT_NAME = "SearchDoorSuggest";
        public static final String TYPE_FAILURE = "failure";
        public static final String TYPE_SUCCESS = "success_with_data";
        public static final String TYPE_SUCCESS_WITH_EMPTY_DATA = "success_with_empty_data";

        /* renamed from: a  reason: collision with root package name */
        private static volatile d f19037a;
        public static final String[] extraParamsKeys;
        private final HashMap<String, String> b = new HashMap<>();
        private boolean c = false;

        static {
            kge.a(546459400);
            extraParamsKeys = new String[]{"q", "searchdoorFrom", "src", "area", "tab", "channelSrp"};
            f19037a = null;
        }

        private d() {
        }

        public static d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("5d87c00d", new Object[0]);
            }
            if (f19037a == null) {
                synchronized (d.class) {
                    if (f19037a == null) {
                        f19037a = new d();
                    }
                }
            }
            return f19037a;
        }

        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (!this.c) {
            } else {
                this.b.clear();
                if (map == null || map.isEmpty()) {
                    return;
                }
                this.b.putAll(map);
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public Map<String, String> a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("49ed9a08", new Object[]{this, str, map});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            if (map != null) {
                hashMap.putAll(map);
            }
            return hashMap;
        }

        public void b(Map<String, String> map) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            } else if (this.c) {
                if (map == null) {
                    map = new HashMap<>();
                }
                if (!this.b.isEmpty()) {
                    for (String str : extraParamsKeys) {
                        String str2 = this.b.get(str);
                        if (!TextUtils.isEmpty(str2)) {
                            map.put(str, str2);
                        }
                    }
                }
                AppMonitor.Counter.commit(i.MODULE_NAME, POINT_NAME, JSON.toJSONString(map), 1.0d);
                this.b.clear();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_TYPE = "type";
        public static final String POINT_NAME = "SRPSystemRebuild";
        public static final String TYPE_SYSTEM_REBUILD = "system_rebuild";

        /* renamed from: a  reason: collision with root package name */
        private static volatile c f19036a;
        private boolean b = false;

        static {
            kge.a(-2116590751);
            f19036a = null;
        }

        private c() {
        }

        public static c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5d87bfee", new Object[0]);
            }
            if (f19036a == null) {
                synchronized (c.class) {
                    if (f19036a == null) {
                        f19036a = new c();
                    }
                }
            }
            return f19036a;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (!this.b) {
            } else {
                AppMonitor.Counter.commit(i.MODULE_NAME, POINT_NAME, jSONObject.toJSONString(), 1.0d);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String POINT_NAME = "SearchTemplateDegraded";

        /* loaded from: classes7.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private static final f f19038a;

            static {
                kge.a(-918098006);
                f19038a = new f();
            }

            public static /* synthetic */ f a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5d87c04b", new Object[0]) : f19038a;
            }
        }

        static {
            kge.a(-177336876);
        }

        private f() {
        }

        public static f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5d87c04b", new Object[0]) : a.a();
        }

        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", (Object) str);
            jSONObject.put("tItemType", (Object) str2);
            jSONObject.put("originTItemType", (Object) str3);
            AppMonitor.Counter.commit(i.MODULE_NAME, POINT_NAME, jSONObject.toJSONString(), 1.0d);
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String POINT_NAME = "SearchMUSCustomReport";

        /* renamed from: com.taobao.search.common.util.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static class C0758a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private static final a f19034a;

            static {
                kge.a(-999254078);
                f19034a = new a();
            }

            public static /* synthetic */ a a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5d87bfb0", new Object[0]) : f19034a;
            }
        }

        static {
            kge.a(1619305418);
        }

        private a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5d87bfb0", new Object[0]) : C0758a.a();
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                AppMonitor.Counter.commit(i.MODULE_NAME, POINT_NAME, jSONObject.toJSONString(), 1.0d);
            }
        }
    }

    public void onEvent(com.taobao.android.searchbaseframe.track.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dec3cff", new Object[]{this, dVar});
        } else if (dVar.f15010a || dVar.b) {
        } else {
            b.C0759b.a("network", dVar.h);
            b.C0759b.a(b.MEASURE_PARSEDATA, dVar.i);
            b.C0759b.a(b.MEASURE_UI_SHOWN);
        }
    }
}
