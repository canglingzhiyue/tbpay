package com.o2o.ad;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public final class O2OAdvertising implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile O2OAdvertising f8095a;

        static {
            kge.a(894108082);
            f8095a = new O2OAdvertising();
        }
    }

    static {
        kge.a(1655817683);
        kge.a(1028243835);
    }

    private O2OAdvertising() {
    }

    public static O2OAdvertising instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (O2OAdvertising) ipChange.ipc$dispatch("726cc8da", new Object[0]) : a.f8095a;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application == null) {
            throw new NullPointerException("application is can not be null");
        } else {
            Global.setApplication(application);
        }
    }

    public String handleAdUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0744cab", new Object[]{this, str}) : com.o2o.ad.a.a().a(str);
    }

    public String handleAdUrlForClickid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5438d0b1", new Object[]{this, str}) : com.o2o.ad.a.a().b(str);
    }

    public String handleAdClickForClickid(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ddca706e", new Object[]{this, str, str2}) : com.o2o.ad.a.a().a(str, str2);
    }

    public com.o2o.ad.expo.a buildIfsExposure(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.o2o.ad.expo.a) ipChange.ipc$dispatch("d3841ef2", new Object[]{this, str}) : new com.o2o.ad.expo.a(str);
    }
}
