package com.huawei.hms.aaid.plugin;

/* loaded from: classes4.dex */
public class ProxyCenter {
    private PushProxy proxy;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static ProxyCenter f7315a = new ProxyCenter();
    }

    private static ProxyCenter getInstance() {
        return a.f7315a;
    }

    public static PushProxy getProxy() {
        return getInstance().proxy;
    }

    public static void register(PushProxy pushProxy) {
        getInstance().proxy = pushProxy;
    }
}
