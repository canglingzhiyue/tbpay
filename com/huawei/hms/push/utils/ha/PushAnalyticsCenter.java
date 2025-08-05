package com.huawei.hms.push.utils.ha;

/* loaded from: classes4.dex */
public class PushAnalyticsCenter {

    /* renamed from: a  reason: collision with root package name */
    private PushBaseAnalytics f7539a;

    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static PushAnalyticsCenter f7540a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return a.f7540a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.f7539a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.f7539a = pushBaseAnalytics;
    }
}
