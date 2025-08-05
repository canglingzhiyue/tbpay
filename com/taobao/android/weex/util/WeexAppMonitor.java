package com.taobao.android.weex.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_framework.util.o;
import com.taobao.weex.common.WXPerformance;
import java.util.Map;
import tb.jyx;
import tb.kge;
import tb.mto;

/* loaded from: classes6.dex */
public class WeexAppMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "WeexAppMonitor";

    /* loaded from: classes6.dex */
    public static class Avail {

        /* loaded from: classes6.dex */
        public enum Point {
            SCRIPT_RESOURCE_DOWNLOAD("weexBridgeDownloadAvail", new String[]{"url", WXPerformance.CACHE_TYPE, "deviceLevel"}),
            HTTP_DOWNLOAD("weexHttpDownloadAvail", new String[]{"url", WXPerformance.CACHE_TYPE, "code", "deviceLevel"});
            
            public final String[] dims;
            public final String point;

            Point(String str, String[] strArr) {
                this.point = str;
                this.dims = strArr;
            }

            public static Point fromInt(int i) {
                Point[] values = values();
                if (i < 0 || i >= values.length) {
                    return null;
                }
                return values[i];
            }

            public void commitFail(WeexValue weexValue, String str, String str2) {
                if (this.dims.length == 0 || (weexValue.isArray() && weexValue.getArray().size() == this.dims.length)) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray array = weexValue.getArray();
                    int i = 0;
                    while (true) {
                        String[] strArr = this.dims;
                        if (i >= strArr.length) {
                            AppMonitor.Alarm.commitFail(WeexAppMonitor.MODULE_NAME, this.point, jSONObject.toJSONString(), str, str2);
                            return;
                        } else {
                            jSONObject.put(strArr[i], array.get(i));
                            i++;
                        }
                    }
                }
            }

            public void commitFailAsync(final JSONObject jSONObject, final String str, final String str2) {
                j.c(new o() { // from class: com.taobao.android.weex.util.WeexAppMonitor.Avail.Point.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            AppMonitor.Alarm.commitFail(WeexAppMonitor.MODULE_NAME, Point.this.point, jSONObject.toJSONString(), str, str2);
                        }
                    }
                });
            }

            public void commitSuccess(WeexValue weexValue) {
                if (this.dims.length == 0 || (weexValue.isArray() && weexValue.getArray().size() == this.dims.length)) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray array = weexValue.getArray();
                    int i = 0;
                    while (true) {
                        String[] strArr = this.dims;
                        if (i >= strArr.length) {
                            AppMonitor.Alarm.commitSuccess(WeexAppMonitor.MODULE_NAME, this.point, jSONObject.toJSONString());
                            return;
                        } else {
                            jSONObject.put(strArr[i], array.get(i));
                            i++;
                        }
                    }
                }
            }

            public void commitSuccessAsync(final JSONObject jSONObject) {
                j.c(new o() { // from class: com.taobao.android.weex.util.WeexAppMonitor.Avail.Point.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            AppMonitor.Alarm.commitSuccess(WeexAppMonitor.MODULE_NAME, Point.this.point, jSONObject.toJSONString());
                        }
                    }
                });
            }
        }

        static {
            kge.a(-1738938985);
        }
    }

    /* loaded from: classes6.dex */
    public static class Performance {

        /* loaded from: classes6.dex */
        public enum Point {
            SCRIPT_RESOURCE_DOWNLOAD("weexBridgeDownloadPerf", new String[]{"url", WXPerformance.CACHE_TYPE, "zcacheInfo", "deviceLevel"}, new String[]{"zcacheCheckTime", jyx.c.POINT_NAME, "resourceSize"}),
            HTTP_DOWNLOAD("weexHttpDownloadPerf", new String[]{"url", WXPerformance.CACHE_TYPE, "code", "deviceLevel"}, new String[]{"zcacheCheckTime", jyx.c.POINT_NAME, "resourceSize"});
            
            public final String[] dims;
            public final String point;
            public final String[] values;

            Point(String str, String[] strArr, String[] strArr2) {
                this.point = str;
                this.dims = strArr;
                this.values = strArr2;
            }

            public static Point fromInt(int i) {
                Point[] values = values();
                if (i < 0 || i >= values.length) {
                    return null;
                }
                return values[i];
            }

            public static void register() {
                Point[] values;
                for (Point point : values()) {
                    AppMonitor.register(WeexAppMonitor.MODULE_NAME, point.point, point.values, point.dims, false);
                }
            }

            public void commit(WeexValue weexValue, WeexValue weexValue2) {
                if (this.dims.length == 0 || (weexValue.isArray() && weexValue.getArray().size() == this.dims.length)) {
                    if (this.dims.length != 0 && (!weexValue2.isArray() || weexValue2.getArray().size() != this.values.length)) {
                        return;
                    }
                    DimensionValueSet create = DimensionValueSet.create();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        String[] strArr = this.dims;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        create.setValue(strArr[i2], weexValue.getArray().getString(i2));
                        i2++;
                    }
                    MeasureValueSet create2 = MeasureValueSet.create();
                    while (true) {
                        String[] strArr2 = this.values;
                        if (i >= strArr2.length) {
                            AppMonitor.Stat.commit(WeexAppMonitor.MODULE_NAME, this.point, create, create2);
                            return;
                        } else {
                            create2.setValue(strArr2[i], weexValue2.getArray().getDoubleValue(i));
                            i++;
                        }
                    }
                }
            }

            public void commitAsync(final JSONObject jSONObject, final Map<String, Double> map) {
                j.c(new o() { // from class: com.taobao.android.weex.util.WeexAppMonitor.Performance.Point.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        DimensionValueSet create = DimensionValueSet.create();
                        for (String str : jSONObject.keySet()) {
                            create.setValue(str, jSONObject.getString(str));
                        }
                        MeasureValueSet create2 = MeasureValueSet.create();
                        for (String str2 : map.keySet()) {
                            Double d = (Double) map.get(str2);
                            create2.setValue(str2, d == null ? mto.a.GEO_NOT_SUPPORT : d.doubleValue());
                        }
                        AppMonitor.Stat.commit(WeexAppMonitor.MODULE_NAME, Point.this.point, create, create2);
                    }
                });
            }
        }

        static {
            kge.a(-516042024);
        }
    }

    static {
        kge.a(-480273556);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            Performance.Point.register();
        }
    }
}
