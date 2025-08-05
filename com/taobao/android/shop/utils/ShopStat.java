package com.taobao.android.shop.utils;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ixi;

/* loaded from: classes6.dex */
public enum ShopStat {
    INSTANCE;
    
    private static final String DONE = "track_done_";
    private static final String MODULE_PAGE_SHOP = "Page_Shop";
    private static final String MONITOR_POINT_LOAD_PERFORMANCE = "LoadPerformance";
    public static final String SHOP_STAT_INIT = "init";
    public static final String SHOP_STAT_RENDER = "render";
    public static final String SHOP_STAT_REQUEST = "request";
    private static final String SHOP_STAT_TOTAL = "total";
    public static final String SHOP_STAT_INIT_INNER = "initInner";
    private static final String[] SHOP_STAT_TYPES = {"init", "request", SHOP_STAT_INIT_INNER, "render"};
    private final ConcurrentHashMap<String, Long> statMap = new ConcurrentHashMap<>();
    private boolean hasRegister = false;

    /* loaded from: classes6.dex */
    public @interface ShopStatType {
    }

    ShopStat() {
    }

    private boolean checkAllTrackDone() {
        for (String str : SHOP_STAT_TYPES) {
            if (!checkTrackDone(str)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkTrackDone(String str) {
        return this.statMap.containsKey(typeDoneKey(str));
    }

    private void markTrackDone(String str, long j) {
        ixi.a("type:" + typeDoneKey(str) + " duration: " + j);
        this.statMap.put(typeDoneKey(str), Long.valueOf(j));
    }

    private long pickDoneValue(String str) {
        Long l = this.statMap.get(typeDoneKey(str));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    private String typeDoneKey(String str) {
        return DONE + str;
    }

    public void end(String str) {
        if (checkTrackDone(str)) {
            return;
        }
        Long l = this.statMap.get(str);
        if (l == null) {
            ixi.b(" call end() while start() does not called on type :" + str + ", please check");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ixi.a("type:" + str + "  end  @ " + currentTimeMillis);
        markTrackDone(str, currentTimeMillis - l.longValue());
    }

    public void finishMission() {
        String[] strArr;
        if (!checkAllTrackDone()) {
            return;
        }
        MeasureValueSet create = MeasureValueSet.create();
        long j = 0;
        for (String str : SHOP_STAT_TYPES) {
            long pickDoneValue = pickDoneValue(str);
            create.setValue(str, pickDoneValue);
            j += pickDoneValue;
        }
        create.setValue(SHOP_STAT_TOTAL, j);
        AppMonitor.Stat.commit("Page_Shop", MONITOR_POINT_LOAD_PERFORMANCE, (DimensionValueSet) null, create);
        for (Map.Entry<String, MeasureValue> entry : create.getMap().entrySet()) {
            ixi.a(entry.getKey() + "   " + entry.getValue().getValue());
        }
        this.statMap.clear();
    }

    public void init() {
        if (!this.hasRegister) {
            this.hasRegister = true;
            MeasureSet create = MeasureSet.create();
            for (String str : SHOP_STAT_TYPES) {
                create.addMeasure(str);
            }
            create.addMeasure(SHOP_STAT_TOTAL);
            AppMonitor.register("Page_Shop", MONITOR_POINT_LOAD_PERFORMANCE, create, (DimensionSet) null);
        }
    }

    public void resetMission() {
        this.statMap.clear();
    }

    public void start(String str) {
        if (checkTrackDone(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ixi.a("type:" + str + "  start -- @ " + currentTimeMillis);
        this.statMap.put(str, Long.valueOf(currentTimeMillis));
    }
}
