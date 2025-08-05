package com.taobao.android.behavix.service;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.dsb;
import tb.kge;

/* loaded from: classes4.dex */
public class BUFS {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1177500429);
    }

    private static native String getBUFSFeature(String str, String str2, String str3, String str4, boolean z);

    private static native String nativeGetIntentions(String str, String str2, String str3);

    public static String getFeature(List<QueryArgs> list, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae7ac14a", new Object[]{list, str, str2, str3}) : getFeature(list, str, str2, str3, true);
    }

    public static String getFeature(List<QueryArgs> list, String str, String str2, String str3, boolean z) {
        int i;
        String valueOf;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c41b8ce2", new Object[]{list, str, str2, str3, new Boolean(z)});
        }
        if (!a.b.g() || !BHXCXXBaseBridge.checkCXXLib()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (QueryArgs queryArgs : list) {
                        if (queryArgs != null && QueryArgs.access$000(queryArgs).size() != 0) {
                            getFeatureFromLocal(jSONObject2, QueryArgs.access$000(queryArgs));
                            Object remove = QueryArgs.access$000(queryArgs).remove("queryArgsName");
                            QueryArgs.access$100(queryArgs);
                            if (remove != null) {
                                i = i2;
                                valueOf = remove;
                            } else {
                                i = i2 + 1;
                                valueOf = String.valueOf(i2);
                            }
                            jSONObject.put(valueOf, (Object) QueryArgs.access$000(queryArgs));
                            i2 = i;
                        }
                    }
                    if (jSONObject2.size() > 0) {
                        BHXCXXInnerBridge.directlySaveFeaturesToBUFS(jSONObject2.toJSONString());
                    }
                }
            } catch (Throwable th) {
                dsb.a("BUFSGetFeature", null, null, th);
                return "";
            }
        }
        return getBUFSFeature(jSONObject.size() > 0 ? jSONObject.toJSONString() : "", str, str2, str3, z);
    }

    public static String getFeature(QueryArgs queryArgs, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e66a329c", new Object[]{queryArgs, str, str2, str3});
        }
        if (queryArgs == null) {
            queryArgs = new QueryArgs();
        }
        return getFeature(Collections.singletonList(queryArgs), str, str2, str3);
    }

    public static String getIntentions(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("10a71c88", new Object[]{str, str2}) : nativeGetIntentions(str2, str, "Java");
    }

    private static void getFeatureFromLocal(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37826b08", new Object[]{jSONObject, jSONObject2});
        } else if (a.b.f() && jSONObject2.containsKey("featureNames")) {
            ArrayList<String> arrayList = new ArrayList();
            for (String str : (List) jSONObject2.get("featureNames")) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1813247052:
                        if (str.equals(a.TIME_SPARSE_FEATURE)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1711436031:
                        if (str.equals(a.HARDWARE_INFO_FEATURE)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1428708182:
                        if (str.equals(a.LIGHT_SENSOR_FEATURE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1469441085:
                        if (str.equals(a.HARDWARE_STATUS_FEATURE)) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    arrayList.add(str);
                    a.a(str);
                } else if (c == 1) {
                    jSONObject.put(str, (Object) a.a());
                } else if (c == 2) {
                    jSONObject.put(str, (Object) a.c());
                } else if (c == 3) {
                    jSONObject.put(str, (Object) a.d());
                }
            }
            for (String str2 : arrayList) {
                jSONObject.put(str2, (Object) a.b(str2));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class QueryArgs {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String CURRENT_SCENE = "currentScene";
        private static final String ENABLE_FILTER_EMPTY_FIELDS = "enableFiterEmptyFields";
        private static final String END_TIME = "endTime";
        private static final String FEATURE_NAMES = "featureNames";
        private static final String LIMIT_COUNT = "limitCount";
        private static final String NEED_REAL_TIME = "needRealTime";
        private static final String ORDER_BY = "orderBy";
        private static final String QUERY_ARGS_NAME = "queryArgsName";
        private static final String QUERY_ID = "queryId";
        private static final String SETTED_QUERY_ID_ATTRIBUTE = "settedQueryIdAttribute";
        private static final String START_TIME = "startTime";
        private final JSONObject queryArgs = new JSONObject();
        private final List<String> featureNames = new ArrayList();

        static {
            kge.a(-1983106252);
        }

        public static /* synthetic */ JSONObject access$000(QueryArgs queryArgs) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c4c58a16", new Object[]{queryArgs}) : queryArgs.queryArgs;
        }

        public static /* synthetic */ void access$100(QueryArgs queryArgs) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a7d4e15", new Object[]{queryArgs});
            } else {
                queryArgs.assemblyDefaultQueryArgs();
            }
        }

        public QueryArgs() {
        }

        public QueryArgs(String str) {
            this.queryArgs.put(QUERY_ARGS_NAME, (Object) str);
        }

        public void addFeatureName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42af79d1", new Object[]{this, str});
                return;
            }
            this.featureNames.add(str);
            this.queryArgs.put(FEATURE_NAMES, (Object) this.featureNames);
        }

        public void addFeatureNames(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("decd452b", new Object[]{this, list});
                return;
            }
            this.featureNames.addAll(list);
            this.queryArgs.put(FEATURE_NAMES, (Object) this.featureNames);
        }

        public void setEnableFilterEmptyFields(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65a73304", new Object[]{this, new Boolean(z)});
            } else {
                this.queryArgs.put(ENABLE_FILTER_EMPTY_FIELDS, (Object) Boolean.valueOf(z));
            }
        }

        public void setCurrentScene(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf4048e6", new Object[]{this, str});
            } else {
                this.queryArgs.put(CURRENT_SCENE, (Object) str);
            }
        }

        public void setQueryIdAttribute(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce89f5b2", new Object[]{this, new Boolean(z)});
            } else {
                this.queryArgs.put(SETTED_QUERY_ID_ATTRIBUTE, (Object) Boolean.valueOf(z));
            }
        }

        public void setQueryId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76d4fd12", new Object[]{this, str});
            } else {
                this.queryArgs.put(QUERY_ID, (Object) str);
            }
        }

        public void setOrderBy(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("951c63d4", new Object[]{this, str});
            } else {
                this.queryArgs.put(ORDER_BY, (Object) str);
            }
        }

        public void setLimitCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b51e506", new Object[]{this, new Integer(i)});
            } else {
                this.queryArgs.put(LIMIT_COUNT, (Object) Integer.valueOf(i));
            }
        }

        public void setNeedRealTime(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4063b4a", new Object[]{this, new Boolean(z)});
            } else {
                this.queryArgs.put(NEED_REAL_TIME, (Object) Boolean.valueOf(z));
            }
        }

        public void setStartTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
            } else {
                this.queryArgs.put("startTime", (Object) Long.valueOf(j));
            }
        }

        public void setEndTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e12d357", new Object[]{this, new Long(j)});
            } else {
                this.queryArgs.put(END_TIME, (Object) Long.valueOf(j));
            }
        }

        private void assemblyDefaultQueryArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84e4a211", new Object[]{this});
                return;
            }
            if (this.queryArgs.getJSONArray(FEATURE_NAMES) == null) {
                addFeatureName("");
            }
            if (this.queryArgs.getBoolean(ENABLE_FILTER_EMPTY_FIELDS) == null) {
                setEnableFilterEmptyFields(false);
            }
            if (this.queryArgs.getString(CURRENT_SCENE) == null) {
                setCurrentScene("");
            }
            if (this.queryArgs.getBoolean(SETTED_QUERY_ID_ATTRIBUTE) == null) {
                setQueryIdAttribute(false);
            }
            if (this.queryArgs.getString(QUERY_ID) == null) {
                setQueryId("");
            }
            if (this.queryArgs.getString(ORDER_BY) == null) {
                setOrderBy("");
            }
            if (this.queryArgs.getInteger(LIMIT_COUNT) == null) {
                setLimitCount(0);
            }
            if (this.queryArgs.getBoolean(NEED_REAL_TIME) == null) {
                setNeedRealTime(false);
            }
            if (this.queryArgs.getLong("startTime") == null) {
                setStartTime(0L);
            }
            if (this.queryArgs.getLong(END_TIME) != null) {
                return;
            }
            setEndTime(0L);
        }

        public void setQueryArgsKV(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2666e25b", new Object[]{this, str, obj});
            } else {
                this.queryArgs.put(str, obj);
            }
        }
    }
}
