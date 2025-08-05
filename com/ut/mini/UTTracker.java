package com.ut.mini;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.analytics.core.config.s;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.analytics.core.model.UTMCLogFields;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.exposure.TrackerFrameLayout;
import com.ut.mini.module.util.ReadonlyMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.any;
import tb.anz;
import tb.apr;
import tb.aqc;
import tb.aqe;
import tb.bip;
import tb.kge;

/* loaded from: classes.dex */
public class UTTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PAGE_STATUS_CODE_302 = 1;
    private static final String TAG = "UTTracker";
    private static List<String> mGlobalPropertyForAllTrackerList;
    private static Map<String, String> mGlobalPropertyForAllTrackerMap;
    private static List<String> mLogFieldCacheList;
    private String mAppKey = null;
    private String mTrackerId = null;
    private Map<String, String> mGlobalArgsMap = new ConcurrentHashMap();
    private List<String> mGlobalArgsList = Collections.synchronizedList(new ArrayList());

    public static /* synthetic */ void access$000(com.ut.mini.module.plugin.a aVar, Map map, String str, int i, String str2, String str3, String str4, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fab9b", new Object[]{aVar, map, str, new Integer(i), str2, str3, str4, map2});
        } else {
            processPluginMap(aVar, map, str, i, str2, str3, str4, map2);
        }
    }

    public static /* synthetic */ void access$100(UTTracker uTTracker, Map map, int i, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1373db35", new Object[]{uTTracker, map, new Integer(i), list});
        } else {
            uTTracker.sendLog(map, i, list);
        }
    }

    static {
        kge.a(917124163);
        mLogFieldCacheList = null;
        mLogFieldCacheList = new ArrayList(34);
        for (LogField logField : LogField.values()) {
            mLogFieldCacheList.add(String.valueOf(logField).toLowerCase());
        }
        mGlobalPropertyForAllTrackerMap = new ConcurrentHashMap();
        mGlobalPropertyForAllTrackerList = Collections.synchronizedList(new ArrayList());
    }

    public static synchronized void setGlobalPropertyForAllTracker(String str, String str2) {
        synchronized (UTTracker.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc8646a1", new Object[]{str, str2});
                return;
            }
            if (aqc.e(str) || str2 == null) {
                apr.e("setGlobalProperty", "key is null or key is empty or value is null,please check it!");
            } else {
                mGlobalPropertyForAllTrackerMap.put(str, str2);
                if (!mGlobalPropertyForAllTrackerList.contains(str)) {
                    mGlobalPropertyForAllTrackerList.add(str);
                }
            }
        }
    }

    public static synchronized void removeGlobalPropertyForAllTracker(String str) {
        synchronized (UTTracker.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c4c8b5", new Object[]{str});
                return;
            }
            if (!aqc.e(str)) {
                mGlobalPropertyForAllTrackerMap.remove(str);
                mGlobalPropertyForAllTrackerList.remove(str);
            }
        }
    }

    public synchronized void setGlobalProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56d47b5", new Object[]{this, str, str2});
            return;
        }
        if (aqc.e(str) || str2 == null) {
            apr.e("setGlobalProperty", "key is null or key is empty or value is null,please check it!");
        } else {
            this.mGlobalArgsMap.put(str, str2);
            if (!this.mGlobalArgsList.contains(str)) {
                this.mGlobalArgsList.add(str);
            }
        }
    }

    public synchronized String getGlobalProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ee50ae1", new Object[]{this, str});
        } else if (aqc.e(str)) {
            return null;
        } else {
            return this.mGlobalArgsMap.get(str);
        }
    }

    public synchronized void removeGlobalProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286ea5cd", new Object[]{this, str});
            return;
        }
        if (!aqc.e(str)) {
            this.mGlobalArgsMap.remove(str);
            this.mGlobalArgsList.remove(str);
        }
    }

    public void send(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1eb8b96", new Object[]{this, map});
        } else if (!UTAnalytics.getInstance().isInit()) {
            apr.e(TAG, "send", "Please initialize UT-Analytics first");
        } else if (map == null) {
            apr.e(TAG, "send", "aLogMap is null");
        } else {
            try {
                final int intValue = Integer.valueOf(map.get(LogField.EVENTID.toString())).intValue();
                if (!map.containsKey(h.TAG_UTEVENT)) {
                    com.ut.mini.module.trackerlistener.b.getInstance().sendEvent(map, intValue);
                } else {
                    map.remove(h.TAG_UTEVENT);
                }
                com.ut.mini.module.trackerlistener.b.getInstance().send(this, map);
                final HashMap hashMap = new HashMap(map);
                hashMap.remove("_bmbu");
                ArrayList arrayList = new ArrayList(this.mGlobalArgsList);
                hashMap.putAll(this.mGlobalArgsMap);
                arrayList.addAll(mGlobalPropertyForAllTrackerList);
                hashMap.putAll(mGlobalPropertyForAllTrackerMap);
                m.a(intValue, hashMap);
                try {
                    if (!any.d().l() && !hashMap.containsKey(LogField.RECORD_TIMESTAMP.toString())) {
                        long currentTimeMillis = System.currentTimeMillis();
                        String logField = LogField.RECORD_TIMESTAMP.toString();
                        hashMap.put(logField, "" + currentTimeMillis);
                    }
                } catch (Exception unused) {
                }
                if (!aqc.e(this.mTrackerId)) {
                    hashMap.put("_track_id", this.mTrackerId);
                }
                if (any.d().b()) {
                    hashMap.put(UTMCLogFields.ALIYUN_PLATFORM_FLAG.toString(), Constants.VAL_YES);
                }
                String i = any.d().i();
                if (!aqc.e(i)) {
                    hashMap.put("UTPVID_T", i);
                }
                if (!map.containsKey("_fuamf")) {
                    dropAllIllegalKey(hashMap);
                } else {
                    hashMap.remove("_fuamf");
                }
                translateFieldsName(hashMap);
                fillReserve1Fields(hashMap);
                fillReservesFields(hashMap);
                if (intValue == 2101 || intValue == 2102) {
                    hashMap.put("_priority", "4");
                }
                o.b(intValue, hashMap);
                ReadonlyMap readonlyMap = null;
                if (com.ut.mini.module.plugin.d.getInstance().getUTPluginConfigMgr().isOpen()) {
                    ReadonlyMap readonlyMap2 = new ReadonlyMap(hashMap);
                    String str = hashMap.get(LogField.PAGE.toString());
                    String str2 = hashMap.get(LogField.ARG1.toString());
                    String str3 = hashMap.get(LogField.ARG2.toString());
                    String str4 = hashMap.get(LogField.ARG3.toString());
                    try {
                        Iterator openUTPluginMapIterator = com.ut.mini.module.plugin.d.getInstance().getUTPluginConfigMgr().getOpenUTPluginMapIterator();
                        while (openUTPluginMapIterator.hasNext()) {
                            com.ut.mini.module.plugin.a aVar = (com.ut.mini.module.plugin.a) ((Map.Entry) openUTPluginMapIterator.next()).getValue();
                            if (aVar != null) {
                                processPluginMap(aVar, hashMap, str, intValue, str2, str3, str4, readonlyMap2);
                            }
                        }
                    } catch (Throwable th) {
                        if (apr.a()) {
                            apr.b(TAG, th, new Object[0]);
                        }
                    }
                    readonlyMap = readonlyMap2;
                }
                if (com.ut.mini.module.plugin.d.getInstance().getUTPluginConfigMgr().isAsyncOpen()) {
                    if (readonlyMap == null) {
                        readonlyMap = new ReadonlyMap(hashMap);
                    }
                    final ReadonlyMap readonlyMap3 = readonlyMap;
                    final String str5 = hashMap.get(LogField.PAGE.toString());
                    final String str6 = hashMap.get(LogField.ARG1.toString());
                    final String str7 = hashMap.get(LogField.ARG2.toString());
                    final String str8 = hashMap.get(LogField.ARG3.toString());
                    final ArrayList arrayList2 = new ArrayList(arrayList);
                    aqe.a().a(new Runnable() { // from class: com.ut.mini.UTTracker.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                Iterator openAsyncUTPluginMapIterator = com.ut.mini.module.plugin.d.getInstance().getUTPluginConfigMgr().getOpenAsyncUTPluginMapIterator();
                                while (openAsyncUTPluginMapIterator.hasNext()) {
                                    com.ut.mini.module.plugin.a aVar2 = (com.ut.mini.module.plugin.a) ((Map.Entry) openAsyncUTPluginMapIterator.next()).getValue();
                                    if (aVar2 != null) {
                                        UTTracker.access$000(aVar2, hashMap, str5, intValue, str6, str7, str8, readonlyMap3);
                                    }
                                }
                            } catch (Throwable th2) {
                                if (apr.a()) {
                                    apr.b(UTTracker.TAG, th2, new Object[0]);
                                }
                            }
                            UTTracker.access$100(UTTracker.this, hashMap, intValue, arrayList2);
                        }
                    });
                    return;
                }
                sendLog(hashMap, intValue, arrayList);
            } catch (Exception unused2) {
            }
        }
    }

    public void pageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
        } else {
            pageAppear(obj, null, false);
        }
    }

    public void pageAppear(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cac8b1", new Object[]{this, obj, str});
        } else {
            pageAppear(obj, str, false);
        }
    }

    public void pageAppearDonotSkip(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff07c6", new Object[]{this, obj});
        } else {
            pageAppear(obj, null, true);
        }
    }

    public void pageAppearDonotSkip(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4780c10", new Object[]{this, obj, str});
        } else {
            pageAppear(obj, str, true);
        }
    }

    public void pageAppear(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08f0043", new Object[]{this, obj, str, new Boolean(z)});
        } else {
            l.getInstance().a(obj, str, z);
        }
    }

    public void pageAppearWithRouter(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8edcc4d", new Object[]{this, activity, str, new Integer(i)});
        } else {
            l.getInstance().a(activity, str, true, i);
        }
    }

    public void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            l.getInstance().pageDisAppear(obj, this);
        }
    }

    public void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().skipPage(obj);
        l.getInstance().e(obj);
    }

    public void updatePageStatus(Object obj, UTPageStatus uTPageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954041a6", new Object[]{this, obj, uTPageStatus});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().updatePageStatus(obj);
        l.getInstance().a(obj, uTPageStatus);
    }

    public void setPageStatusCode(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e662d0", new Object[]{this, obj, new Integer(i)});
        } else {
            l.getInstance().a(obj, i);
        }
    }

    public void skipPageBack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8447b0e", new Object[]{this, activity});
        } else {
            l.getInstance().f((Object) activity);
        }
    }

    public void skipNextPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c53dbcf", new Object[]{this});
        } else {
            l.getInstance().a();
        }
    }

    @Deprecated
    public void skipPageBackForever(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30710529", new Object[]{this, activity, new Boolean(z)});
        } else {
            l.getInstance().a(activity, z);
        }
    }

    public void updatePageUrl(Object obj, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db943cd", new Object[]{this, obj, uri});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().updatePageUrl(obj, uri);
        l.getInstance().a(obj, uri);
    }

    public void updatePageName(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().updatePageName(this, obj, str);
        l.getInstance().b(obj, str);
    }

    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
            return;
        }
        apr.b(TAG, com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_PAGE_PROPERTIES, map);
        com.ut.mini.module.trackerlistener.b.getInstance().updatePageProperties(this, obj, map);
        l.getInstance().a(obj, map);
        com.ut.mini.module.trackerlistener.b.getInstance().updatePagePropertiesEnd(this, obj);
    }

    public void updatePageTmpProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6101da30", new Object[]{this, obj, map});
            return;
        }
        apr.b(TAG, "updatePageTmpProperties", map);
        removeIllegalTmpProperties(map);
        l.getInstance().b(obj, map);
    }

    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().updatePageUtparam(obj, str);
        l.getInstance().a(obj, str);
    }

    public void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().updateNextPageProperties(this, map);
        l.getInstance().a(map);
    }

    public void updateNextPageTmpProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30b265f", new Object[]{this, map});
            return;
        }
        removeIllegalTmpProperties(map);
        l.getInstance().b(map);
    }

    public void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().updateNextPageUtparam(str);
        l.getInstance().b(str);
    }

    public void updateNextPageUtparamCnt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38161b7", new Object[]{this, str});
        } else {
            l.getInstance().c(str);
        }
    }

    public void addTPKItem(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a5ab2d", new Object[]{this, sVar});
        } else {
            com.alibaba.analytics.core.config.r.a().a(sVar);
        }
    }

    public void addTPKCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db35592f", new Object[]{this, str, str2});
        } else {
            com.alibaba.analytics.core.config.r.a().a(str, str2);
        }
    }

    public Map<String, String> getPageProperties(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj}) : l.getInstance().getPageProperties(obj);
    }

    public Map<String, String> getPageAllProperties(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity}) : l.getInstance().c(activity);
    }

    @Deprecated
    public String getPageSpmUrl(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d3bc1a3", new Object[]{this, activity}) : l.getInstance().d(activity);
    }

    @Deprecated
    public String getPageSpmPre(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("796f1bef", new Object[]{this, activity}) : l.getInstance().e(activity);
    }

    @Deprecated
    public String getPageScmPre(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a24e39c", new Object[]{this, activity}) : l.getInstance().f(activity);
    }

    @Deprecated
    public void setPageSessionPropertiesRule(Activity activity, ArrayList<Integer> arrayList, ArrayList<String> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11634b0d", new Object[]{this, activity, arrayList, arrayList2});
        } else {
            m.a(activity, arrayList, arrayList2);
        }
    }

    public void setExposureTag(View view, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81bdab37", new Object[]{this, view, str, str2, map});
        } else {
            com.ut.mini.exposure.c.setExposure(view, str, str2, map);
        }
    }

    public void setExposureSpmAB(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120e43b7", new Object[]{this, view, str, str2});
        } else {
            com.ut.mini.exposure.c.setExposureSpmAB(view, str, str2);
        }
    }

    public void setExposureSpmCD(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93011b77", new Object[]{this, view, str, str2});
        } else {
            com.ut.mini.exposure.c.setExposureSpmCD(view, str, str2);
        }
    }

    public void refreshExposureData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd143a53", new Object[]{this});
        } else {
            TrackerFrameLayout.refreshExposureData();
        }
    }

    public void refreshExposureData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c955d", new Object[]{this, str});
        } else {
            TrackerFrameLayout.refreshExposureData(str);
        }
    }

    public void refreshExposureDataByViewId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f455a0de", new Object[]{this, str, str2});
        } else {
            TrackerFrameLayout.refreshExposureDataByViewId(str, str2);
        }
    }

    public void commitExposureData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c098af", new Object[]{this});
        } else {
            TrackerFrameLayout.commitExposureData();
        }
    }

    public void setCommitImmediatelyExposureBlock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81092", new Object[]{this, str});
        } else {
            TrackerFrameLayout.setCommitImmediatelyExposureBlock(str);
        }
    }

    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.mAppKey = str;
        }
    }

    public void setTrackId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ad3c95", new Object[]{this, str});
        } else {
            this.mTrackerId = str;
        }
    }

    public void setH5Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1b94b1", new Object[]{this, str});
        } else if (str == null) {
        } else {
            q.a().a(str);
        }
    }

    private void sendLog(Map<String, String> map, int i, List<String> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f2f232", new Object[]{this, map, new Integer(i), list});
            return;
        }
        if (i == 2201) {
            try {
                str = map.get(LogField.PAGE.toString());
            } catch (Exception unused) {
                str = "";
            }
            if (c.b().a(str)) {
                updateLogMap(map, list);
                d.a().a(map);
                return;
            }
        }
        if (i == 2001) {
            l.encodeUtParam(map);
        }
        updateLogMap(map, list);
        UTAnalytics.getInstance().transferLog(map);
    }

    private void updateLogMap(Map<String, String> map, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27307fce", new Object[]{this, map, list});
            return;
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        String str = "";
        String str2 = str;
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (key != null && key.startsWith(anz.UT_TMP_ARGS_KEY)) {
                String substring = key.substring(19);
                String value = next.getValue();
                it.remove();
                if (!map.containsKey(substring)) {
                    str2 = aqc.e(str2) ? substring + "=" + value : str2 + "," + substring + "=" + value;
                }
            }
        }
        for (String str3 : list) {
            if (map.containsKey(str3)) {
                String remove = map.remove(str3);
                str = aqc.e(str) ? str3 + "=" + remove : str + "," + str3 + "=" + remove;
            }
        }
        if (!aqc.e(str)) {
            map.put(anz.UT_GLOBAL_ARGS, str);
        }
        if (aqc.e(str2)) {
            return;
        }
        map.put(anz.UT_TMP_ARGS, str2);
    }

    private static void processPluginMap(com.ut.mini.module.plugin.a aVar, Map<String, String> map, String str, int i, String str2, String str3, String str4, Map<String, String> map2) {
        Map<String, String> onEventDispatch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7ec225", new Object[]{aVar, map, str, new Integer(i), str2, str3, str4, map2});
        } else if (com.ut.mini.module.plugin.a.isEventIDInRange(aVar.getAttentionEventIds(), i) && (onEventDispatch = aVar.onEventDispatch(str, i, str2, str3, str4, map2)) != null && onEventDispatch.size() > 0) {
            apr.b(TAG, "UTPlugin", aVar.getPluginName(), "PluginArgs", onEventDispatch);
            String str5 = "";
            for (Map.Entry<String, String> entry : onEventDispatch.entrySet()) {
                String key = entry.getKey();
                if (!mLogFieldCacheList.contains(String.valueOf(key).toLowerCase())) {
                    if (com.ut.mini.module.plugin.d.getInstance().getUTPluginConfigMgr().isWritableKey(aVar, key)) {
                        map.put(key, entry.getValue());
                    }
                    if ("utparam-cnt".equals(key)) {
                        str5 = onEventDispatch.get(key);
                    }
                }
            }
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            try {
                Map<String, Object> parseJsonToMap = parseJsonToMap(str5);
                if (parseJsonToMap != null && parseJsonToMap.size() > 0) {
                    Iterator<Map.Entry<String, Object>> it = parseJsonToMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!com.ut.mini.module.plugin.d.getInstance().getUTPluginConfigMgr().isWritableUtparamCnt(aVar, it.next().getKey())) {
                            it.remove();
                        }
                    }
                    if (parseJsonToMap.size() <= 0) {
                        return;
                    }
                    String str6 = map.get("utparam-cnt");
                    if (TextUtils.isEmpty(str6)) {
                        map.put("utparam-cnt", JSON.toJSONString(parseJsonToMap));
                        return;
                    }
                    Map<String, Object> parseJsonToMap2 = parseJsonToMap(str6);
                    if (parseJsonToMap2 != null && parseJsonToMap2.size() > 0) {
                        parseJsonToMap2.putAll(parseJsonToMap);
                        map.put("utparam-cnt", JSON.toJSONString(parseJsonToMap2));
                        return;
                    }
                    map.put("utparam-cnt", JSON.toJSONString(parseJsonToMap));
                }
            } catch (Exception e) {
                if (!apr.a()) {
                    return;
                }
                apr.b(TAG, e, new Object[0]);
            }
        }
    }

    private static Map<String, Object> parseJsonToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("395e5b6c", new Object[]{str});
        }
        try {
            return (Map) JSON.parseObject(str, Map.class);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void dropAllIllegalKey(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287c6763", new Object[]{map});
        } else if (map == null) {
        } else {
            map.remove(LogField.IMEI.toString());
            map.remove(LogField.IMSI.toString());
            map.remove(LogField.CARRIER.toString());
            map.remove(LogField.ACCESS.toString());
            map.remove(LogField.ACCESS_SUBTYPE.toString());
            map.remove(LogField.CHANNEL.toString());
            map.remove(LogField.LL_USERNICK.toString());
            map.remove(LogField.USERNICK.toString());
            map.remove(LogField.LL_USERID.toString());
            map.remove(LogField.USERID.toString());
            map.remove(LogField.SDKVERSION.toString());
            map.remove(LogField.START_SESSION_TIMESTAMP.toString());
            map.remove(LogField.UTDID.toString());
            map.remove(LogField.SDKTYPE.toString());
            map.remove(LogField.RESERVE2.toString());
            map.remove(LogField.RESERVE3.toString());
            map.remove(LogField.RESERVE4.toString());
            map.remove(LogField.RESERVE5.toString());
            map.remove(LogField.RESERVES.toString());
        }
    }

    private static void translateFieldsName(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32efc60c", new Object[]{map});
        } else if (map == null) {
        } else {
            if (map.containsKey("_field_os")) {
                String str = map.get("_field_os");
                map.remove("_field_os");
                if (aqc.f(str)) {
                    map.put(LogField.OS.toString(), str);
                }
            }
            if (!map.containsKey("_field_os_version")) {
                return;
            }
            String str2 = map.get("_field_os_version");
            map.remove("_field_os_version");
            if (!aqc.f(str2)) {
                return;
            }
            map.put(LogField.OSVERSION.toString(), str2);
        }
    }

    private void fillReserve1Fields(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d732ae0d", new Object[]{this, map});
            return;
        }
        map.put(LogField.SDKTYPE.toString(), anz.SDK_TYPE);
        if (!TextUtils.isEmpty(this.mAppKey)) {
            map.put(LogField.APPKEY.toString(), this.mAppKey);
        } else {
            map.put(LogField.APPKEY.toString(), any.d().c());
        }
    }

    private static void fillReservesFields(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513a1c0b", new Object[]{map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map.containsKey("_track_id")) {
            String str = map.get("_track_id");
            map.remove("_track_id");
            if (!aqc.e(str)) {
                hashMap.put("_tkid", str);
            }
        }
        if (hashMap.size() > 0) {
            String a2 = aqc.a((Map<String, String>) hashMap);
            if (aqc.f(a2)) {
                map.put(LogField.RESERVES.toString(), a2);
            }
        }
        if (map.containsKey(LogField.PAGE.toString())) {
            return;
        }
        map.put(LogField.PAGE.toString(), "UT");
    }

    private void removeIllegalTmpProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6732aca6", new Object[]{this, map});
        } else if (map == null) {
        } else {
            map.remove("spm");
            map.remove("spm-cnt");
            map.remove("spm-url");
            map.remove(bip.KEY_UMBRELLA_SPM_PRE);
            map.remove("utparam-cnt");
            map.remove(ag.KEY_UTPARAM_URL);
            map.remove("utparam-pre");
        }
    }
}
