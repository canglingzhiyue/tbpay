package com.huawei.hms.activity.internal;

import mtopsdk.common.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ForegroundBusResponseMgr {
    private static final ForegroundBusResponseMgr b = new ForegroundBusResponseMgr();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, BusResponseCallback> f7323a = new HashMap();

    public static ForegroundBusResponseMgr getInstance() {
        return b;
    }

    public BusResponseCallback get(String str) {
        BusResponseCallback busResponseCallback;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f7323a) {
            busResponseCallback = this.f7323a.get(str);
        }
        return busResponseCallback;
    }

    public void registerObserver(String str, BusResponseCallback busResponseCallback) {
        if (StringUtils.isEmpty(str) || busResponseCallback == null) {
            return;
        }
        synchronized (this.f7323a) {
            if (!this.f7323a.containsKey(str)) {
                this.f7323a.put(str, busResponseCallback);
            }
        }
    }

    public void unRegisterObserver(String str) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f7323a) {
            this.f7323a.remove(str);
        }
    }
}
