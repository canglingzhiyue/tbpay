package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.AnyThread;
import java.util.HashMap;
import java.util.WeakHashMap;
import tb.kge;
import tb.ogg;

@AnyThread
/* loaded from: classes5.dex */
public class LBSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<ab, TBLocationClient> f13234a;

    public static void requestAddressByCoordinate(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8210ada4", new Object[]{cVar});
        }
    }

    static {
        kge.a(1487320421);
        kge.a(-818961104);
        f13234a = new WeakHashMap<>();
    }

    public static void requestLocation(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fb5074", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            GGLocationOptions a2 = a.a((JSONObject) cVar.b);
            if (a.LOCATION_MODE_ONLY_CACHE.equals(a2.locationMode)) {
                cVar.c.a(cVar, a(cVar, a2));
            } else if (a.LOCATION_MODE_NO_CACHE.equals(a2.locationMode)) {
                a(cVar, (TBLocationOption) a2);
            } else {
                TBLocationDTO a3 = a(cVar, a2);
                if (a3 != null) {
                    cVar.c.a(cVar, a3);
                } else {
                    a(cVar, (TBLocationOption) a2);
                }
            }
        }
    }

    public static void clean(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f1097", new Object[]{abVar});
        } else {
            f13234a.remove(abVar);
        }
    }

    private static void a(final g.c cVar, TBLocationOption tBLocationOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d66655", new Object[]{cVar, tBLocationOption});
            return;
        }
        if (f13234a.get(cVar.f19938a) == null) {
            f13234a.put(cVar.f19938a, TBLocationClient.a(cVar.a()));
        }
        f13234a.get(cVar.f19938a).a(tBLocationOption, new com.taobao.location.client.a() { // from class: com.taobao.android.layoutmanager.module.LBSModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.location.client.a
            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                } else if (tBLocationDTO == null) {
                } else {
                    g.c.this.c.a(g.c.this, tBLocationDTO);
                }
            }
        }, cVar.f19938a.E().getLooper());
    }

    private static TBLocationDTO a(g.c cVar, GGLocationOptions gGLocationOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("96b29d06", new Object[]{cVar, gGLocationOptions});
        }
        if (gGLocationOptions.useDefaultFunc) {
            return TBLocationClient.b();
        }
        return TBLocationClient.a(gGLocationOptions);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String LOCATION_MODE_DEFAULT = "default";
        public static final String LOCATION_MODE_NO_CACHE = "nocache";
        public static final String LOCATION_MODE_ONLY_CACHE = "onlycache";

        /* renamed from: a  reason: collision with root package name */
        private static HashMap<String, TBLocationOption.TimeLimit> f13236a;
        private static HashMap<Integer, TBLocationOption.Timeout> b;
        private static HashMap<String, TBLocationOption.Accuracy> c;
        private static HashMap<String, TBLocationOption.DataModel> d;

        static {
            kge.a(1802278728);
            f13236a = new HashMap<>();
            b = new HashMap<>();
            c = new HashMap<>();
            d = new HashMap<>();
            f13236a.put("1m", TBLocationOption.TimeLimit.ONE_MIN);
            f13236a.put("2m", TBLocationOption.TimeLimit.SEC_MIN);
            f13236a.put("3m", TBLocationOption.TimeLimit.THR_MIN);
            f13236a.put("4m", TBLocationOption.TimeLimit.FOR_MIN);
            f13236a.put("5m", TBLocationOption.TimeLimit.FIR_MIN);
            f13236a.put("30m", TBLocationOption.TimeLimit.HALF_HOUR);
            f13236a.put("1h", TBLocationOption.TimeLimit.ONE_HOUR);
            f13236a.put("2h", TBLocationOption.TimeLimit.TWO_HOUR);
            f13236a.put("12h", TBLocationOption.TimeLimit.HALF_DAY);
            f13236a.put("1d", TBLocationOption.TimeLimit.ONE_DAY);
            b.put(0, TBLocationOption.Timeout.DEFAULT);
            b.put(500, TBLocationOption.Timeout.HALF_SECOND);
            b.put(1000, TBLocationOption.Timeout.ONE_SECOND);
            b.put(2000, TBLocationOption.Timeout.TWO_SECONDS);
            b.put(3000, TBLocationOption.Timeout.THREE_SECONDS);
            b.put(5000, TBLocationOption.Timeout.FIVE_SECONDS);
            b.put(10000, TBLocationOption.Timeout.TEN_SECONDS);
            c.put("tenMeters", TBLocationOption.Accuracy.TENMETER);
            c.put("hundredMeters", TBLocationOption.Accuracy.HEKTOMETER);
            c.put("kilometer", TBLocationOption.Accuracy.KILOMETER);
            d.put("Coordinate", TBLocationOption.DataModel.DEFAULT);
            d.put("address", TBLocationOption.DataModel.NEED_ADDRESS);
            d.put("poi", TBLocationOption.DataModel.NEED_ADDRESS_POI);
        }

        public static GGLocationOptions a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (GGLocationOptions) ipChange.ipc$dispatch("a56f34f", new Object[]{jSONObject});
            }
            GGLocationOptions gGLocationOptions = new GGLocationOptions();
            try {
                String string = jSONObject.getString("timeLimit");
                if (string == null) {
                    string = "none";
                }
                if ("none".equals(string)) {
                    gGLocationOptions.useDefaultFunc = true;
                }
                gGLocationOptions.setTimeLimit(a(string));
                if (jSONObject.getString(UserLocation.KEY_DOUBLE_ACCURACY) == null) {
                    string = "tenMeters";
                }
                gGLocationOptions.setAccuracy(b(string));
                Integer integer = jSONObject.getInteger(Constrant.KEY_TIME_OUT);
                if (integer != null) {
                    i = integer.intValue();
                }
                gGLocationOptions.setTimeout(a(Integer.valueOf(i)));
                String string2 = jSONObject.getString("resultMode");
                if (string2 == null) {
                    string2 = "Coordinate";
                }
                gGLocationOptions.setDataModel(c(string2));
                String string3 = jSONObject.getString("cachemode");
                if (string3 == null) {
                    string3 = "default";
                }
                gGLocationOptions.setLocationMode(string3);
            } catch (Exception e) {
                ogg.a("LBSModule", e.getMessage());
            }
            return gGLocationOptions;
        }

        private static TBLocationOption.TimeLimit a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption.TimeLimit) ipChange.ipc$dispatch("379e7744", new Object[]{str});
            }
            TBLocationOption.TimeLimit timeLimit = f13236a.get(str);
            return timeLimit == null ? TBLocationOption.TimeLimit.DEFAULT : timeLimit;
        }

        private static TBLocationOption.Timeout a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption.Timeout) ipChange.ipc$dispatch("5564f4e", new Object[]{num});
            }
            TBLocationOption.Timeout timeout = b.get(num);
            return timeout == null ? TBLocationOption.Timeout.DEFAULT : timeout;
        }

        private static TBLocationOption.Accuracy b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption.Accuracy) ipChange.ipc$dispatch("3ac0d6aa", new Object[]{str});
            }
            TBLocationOption.Accuracy accuracy = c.get(str);
            return accuracy == null ? TBLocationOption.Accuracy.DEFAULT : accuracy;
        }

        private static TBLocationOption.DataModel c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption.DataModel) ipChange.ipc$dispatch("581575b5", new Object[]{str});
            }
            TBLocationOption.DataModel dataModel = d.get(str);
            return dataModel == null ? TBLocationOption.DataModel.DEFAULT : dataModel;
        }
    }

    /* loaded from: classes5.dex */
    public static class GGLocationOptions extends TBLocationOption {
        private String locationMode = null;
        public boolean useDefaultFunc = false;

        static {
            kge.a(1539767978);
        }

        public void setLocationMode(String str) {
            this.locationMode = str;
            if (a.LOCATION_MODE_NO_CACHE.equals(str)) {
                setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
            }
        }

        public String getLocationMode() {
            return this.locationMode;
        }
    }
}
