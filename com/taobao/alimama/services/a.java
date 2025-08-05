package com.taobao.alimama.services;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.utils.EnvironmentUtils;
import java.util.HashMap;
import java.util.Map;
import tb.dhr;
import tb.dhs;
import tb.dht;
import tb.dhu;
import tb.dhv;
import tb.dhw;
import tb.dhx;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, IBaseService> f8441a;

    /* renamed from: com.taobao.alimama.services.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0331a {

        /* renamed from: a  reason: collision with root package name */
        public static a f8442a;

        static {
            kge.a(1795811521);
            f8442a = new a();
        }
    }

    static {
        kge.a(-115768668);
    }

    private a() {
        this.f8441a = new HashMap();
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a(new dhr());
        a(new dhs());
        a(new dht());
        a(new dhw());
        a(new dhu());
        a(new dhv());
        if (!EnvironmentUtils.isInTaobao()) {
            return;
        }
        a(new dhx());
    }

    public IBaseService a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBaseService) ipChange.ipc$dispatch("20f83c43", new Object[]{this, str}) : this.f8441a.get(str);
    }

    public void a(IBaseService iBaseService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d192f87", new Object[]{this, iBaseService});
        } else {
            this.f8441a.put(iBaseService.a(), iBaseService);
        }
    }

    public h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("f5a5e326", new Object[]{this}) : (h) a(IBaseService.Names.SERVICE_USER_TRACK.name());
    }

    public f b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5c7ea2a9", new Object[]{this}) : (f) a(IBaseService.Names.SERVICE_TIME.name());
    }

    public e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c357624b", new Object[]{this}) : (e) a(IBaseService.Names.SERVICE_TAOBAO_LOCATION.name());
    }

    public static a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2a302190", new Object[0]) : C0331a.f8442a;
    }
}
