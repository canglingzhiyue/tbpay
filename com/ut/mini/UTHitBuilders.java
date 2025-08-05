package com.ut.mini;

import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.analytics.core.model.LogField;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.anz;
import tb.apr;
import tb.apt;
import tb.aqc;
import tb.kge;

/* loaded from: classes9.dex */
public class UTHitBuilders {
    static {
        kge.a(-712206218);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String FIELD_ARG1 = "_field_arg1";
        public static final String FIELD_ARG2 = "_field_arg2";
        public static final String FIELD_ARG3 = "_field_arg3";
        public static final String FIELD_ARGS = "_field_args";
        public static final String FIELD_EVENT_ID = "_field_event_id";
        public static final String FIELD_PAGE = "_field_page";
        private Map<String, String> mHitMap = new HashMap(64);
        private Map<String, String> mTempHitMap = new HashMap(64);

        static {
            kge.a(1427572213);
        }

        public a() {
            if (!this.mHitMap.containsKey(FIELD_PAGE)) {
                this.mHitMap.put(FIELD_PAGE, "UT");
            }
        }

        public a setProperty(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b1b4e50", new Object[]{this, str, str2});
            }
            if (aqc.e(str) || str2 == null) {
                apr.e("UTHitBuilders", "setProperties key", str, "value", str2);
            } else {
                this.mHitMap.put(str, str2);
            }
            return this;
        }

        public a setProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b30e127", new Object[]{this, map});
            }
            if (map != null) {
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!(key instanceof String)) {
                            apr.e("UTHitBuilders", "setProperties key", key, "value", value);
                        } else if (value instanceof String) {
                            setProperty(key, value);
                        } else {
                            apr.e("UTHitBuilders", "setProperties key", key, "value", value);
                        }
                    }
                } catch (Exception e) {
                    apr.b("UTHitBuilders", e, new Object[0]);
                }
            }
            return this;
        }

        public a setTmpProperty(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6dd43ec3", new Object[]{this, str, str2});
            }
            if (aqc.e(str) || str2 == null) {
                apr.e("UTHitBuilders", "setTmpProperty key", str, "value", str2);
            } else {
                this.mTempHitMap.put(str, str2);
            }
            return this;
        }

        public a setTmpProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("661c7794", new Object[]{this, map});
            }
            if (map != null) {
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!(key instanceof String)) {
                            apr.e("UTHitBuilders", "setProperties key", key, "value", value);
                        } else if (value instanceof String) {
                            setTmpProperty(key, value);
                        } else {
                            apr.e("UTHitBuilders", "setProperties key", key, "value", value);
                        }
                    }
                } catch (Exception e) {
                    apr.b("UTHitBuilders", e, new Object[0]);
                }
            }
            return this;
        }

        public String getProperty(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88202484", new Object[]{this, str});
            }
            if (str == null) {
                return null;
            }
            if (this.mHitMap.containsKey(str)) {
                return this.mHitMap.get(str);
            }
            if (!this.mTempHitMap.containsKey(str)) {
                return null;
            }
            return this.mTempHitMap.get(str);
        }

        public Map<String, String> build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
            }
            Map<String, String> map = this.mHitMap;
            map.put("_bmbu", Constants.VAL_YES);
            if (!_checkIlleagleProperty(map)) {
                return null;
            }
            _dropAllIllegalFields(map);
            _translateFieldsName(map);
            if (!map.containsKey(LogField.EVENTID.toString())) {
                return null;
            }
            Map<String, String> map2 = this.mTempHitMap;
            if (map2 != null && map2.size() > 0) {
                _dropAllIllegalFields(this.mTempHitMap);
                for (Map.Entry<String, String> entry : this.mTempHitMap.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!map.containsKey(key)) {
                        map.put(anz.UT_TMP_ARGS_KEY + key, value);
                    }
                }
            }
            return map;
        }

        private static boolean _checkIlleagleProperty(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f106fe69", new Object[]{map})).booleanValue();
            }
            if (map != null) {
                map.remove(null);
                map.remove("");
                if (map.containsKey(LogField.PAGE.toString())) {
                    apr.e("checkIlleagleProperty", "IlleaglePropertyKey(PAGE) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                    return false;
                } else if (map.containsKey(LogField.EVENTID.toString())) {
                    apr.e("checkIlleagleProperty", "IlleaglePropertyKey(EVENTID) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                    return false;
                } else if (map.containsKey(LogField.ARG1.toString())) {
                    apr.e("checkIlleagleProperty", "IlleaglePropertyKey(ARG1) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                    return false;
                } else if (map.containsKey(LogField.ARG2.toString())) {
                    apr.e("checkIlleagleProperty", "IlleaglePropertyKey(ARG2) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                    return false;
                } else if (map.containsKey(LogField.ARG3.toString())) {
                    apr.e("checkIlleagleProperty", "IlleaglePropertyKey(ARG3) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                    return false;
                }
            }
            return true;
        }

        private static void _translateFieldsName(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca4b872b", new Object[]{map});
            } else if (map == null) {
            } else {
                String remove = map.remove(FIELD_PAGE);
                if (remove != null) {
                    map.put(LogField.PAGE.toString(), remove);
                }
                String remove2 = map.remove(FIELD_ARG1);
                if (remove2 != null) {
                    map.put(LogField.ARG1.toString(), remove2);
                }
                String remove3 = map.remove(FIELD_ARG2);
                if (remove3 != null) {
                    map.put(LogField.ARG2.toString(), remove3);
                }
                String remove4 = map.remove(FIELD_ARG3);
                if (remove4 != null) {
                    map.put(LogField.ARG3.toString(), remove4);
                }
                String remove5 = map.remove(FIELD_ARGS);
                if (remove5 != null) {
                    map.put(LogField.ARGS.toString(), remove5);
                }
                String remove6 = map.remove(FIELD_EVENT_ID);
                if (remove6 == null) {
                    return;
                }
                map.put(LogField.EVENTID.toString(), remove6);
            }
        }

        private static void _dropAllIllegalFields(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46335902", new Object[]{map});
            } else if (map == null) {
            } else {
                map.remove(LogField.PAGE.toString());
                map.remove(LogField.EVENTID.toString());
                map.remove(LogField.ARG1.toString());
                map.remove(LogField.ARG2.toString());
                map.remove(LogField.ARG3.toString());
                map.remove(LogField.ARGS.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class UTCustomHitBuilder extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(848432774);
        }

        public static /* synthetic */ Object ipc$super(UTCustomHitBuilder uTCustomHitBuilder, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -835590806) {
                if (hashCode != 1796951632) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return super.setProperty((String) objArr[0], (String) objArr[1]);
            }
            return super.build();
        }

        public UTCustomHitBuilder(String str) {
            if (!aqc.e(str)) {
                super.setProperty(a.FIELD_ARG1, str);
            }
            super.setProperty(a.FIELD_EVENT_ID, "19999");
            super.setProperty(a.FIELD_ARG3, "0");
            super.setProperty("_priority", "4");
        }

        public UTCustomHitBuilder setDurationOnEvent(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UTCustomHitBuilder) ipChange.ipc$dispatch("4198c607", new Object[]{this, new Long(j)});
            }
            if (j < 0) {
                j = 0;
            }
            super.setProperty(a.FIELD_ARG3, "" + j);
            return this;
        }

        public UTCustomHitBuilder setEventPage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UTCustomHitBuilder) ipChange.ipc$dispatch("833cffe7", new Object[]{this, str});
            }
            if (!aqc.e(str)) {
                super.setProperty(a.FIELD_PAGE, str);
            }
            return this;
        }

        @Override // com.ut.mini.UTHitBuilders.a
        public Map<String, String> build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
            }
            Map<String, String> build = super.build();
            if (build == null) {
                return build;
            }
            String str = build.get(LogField.PAGE.toString());
            String str2 = build.get(LogField.ARG1.toString());
            if (str2 == null) {
                return build;
            }
            build.remove(LogField.ARG1.toString());
            build.remove(LogField.PAGE.toString());
            Map<String, String> b = apt.b(build);
            b.put(LogField.ARG1.toString(), str2);
            b.put(LogField.PAGE.toString(), str);
            return b;
        }
    }

    /* loaded from: classes9.dex */
    public static class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(975970148);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1796951632) {
                return super.setProperty((String) objArr[0], (String) objArr[1]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(String str) {
            if (!aqc.e(str)) {
                super.setProperty(a.FIELD_PAGE, str);
            }
            super.setProperty(a.FIELD_EVENT_ID, "2001");
            super.setProperty(a.FIELD_ARG3, "0");
        }

        public b setReferPage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9c4c98bb", new Object[]{this, str});
            }
            if (!aqc.e(str)) {
                super.setProperty(a.FIELD_ARG1, str);
            }
            return this;
        }

        public b setDurationOnPage(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5d337356", new Object[]{this, new Long(j)});
            }
            if (j < 0) {
                j = 0;
            }
            super.setProperty(a.FIELD_ARG3, "" + j);
            return this;
        }
    }

    /* loaded from: classes9.dex */
    public static class UTControlHitBuilder extends a {
        static {
            kge.a(-669444168);
        }

        public UTControlHitBuilder(String str) {
            if (aqc.e(str)) {
                if (AnalyticsMgr.e) {
                    throw new IllegalArgumentException("Control name can not be empty.");
                }
                apr.e("Control name can not be empty.", new Object[0]);
                return;
            }
            String currentPageName = l.getInstance().getCurrentPageName();
            if (aqc.e(currentPageName)) {
                if (AnalyticsMgr.e) {
                    throw new IllegalArgumentException("Please call in at PageAppear and PageDisAppear.");
                }
                apr.e("Please call in at PageAppear and PageDisAppear.", new Object[0]);
                return;
            }
            super.setProperty(a.FIELD_PAGE, currentPageName);
            super.setProperty(a.FIELD_EVENT_ID, "2101");
            super.setProperty(a.FIELD_ARG1, currentPageName + "_" + str);
        }

        public UTControlHitBuilder(String str, String str2) {
            if (aqc.e(str2)) {
                if (AnalyticsMgr.e) {
                    throw new IllegalArgumentException("Control name can not be empty.");
                }
                apr.e("Control name can not be empty.", new Object[0]);
            } else if (aqc.e(str)) {
                if (AnalyticsMgr.e) {
                    throw new IllegalArgumentException("Page name can not be empty.");
                }
                apr.e("Page name can not be empty.", new Object[0]);
            } else {
                super.setProperty(a.FIELD_PAGE, str);
                super.setProperty(a.FIELD_EVENT_ID, "2101");
                super.setProperty(a.FIELD_ARG1, str + "_" + str2);
            }
        }
    }
}
