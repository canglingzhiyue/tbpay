package com.taobao.phenix.cache.disk;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.gvt;
import tb.kge;
import tb.niw;
import tb.njb;
import tb.nmq;
import tb.nmv;
import tb.qol;

/* loaded from: classes.dex */
public class f extends a<njb, njb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f18869a;

    static {
        kge.a(-1244667745);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.nmy
    public boolean a(nmv<njb, com.taobao.phenix.request.b> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.nmx
    public /* bridge */ /* synthetic */ void a(nmv nmvVar, boolean z, nmq nmqVar) {
        a((nmv<njb, com.taobao.phenix.request.b>) nmvVar, z, (njb) nmqVar);
    }

    public f(e eVar, c cVar) {
        super(0, 2, eVar);
        this.f18869a = cVar;
    }

    public void a(nmv<njb, com.taobao.phenix.request.b> nmvVar, boolean z, njb njbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a063299d", new Object[]{this, nmvVar, new Boolean(z), njbVar});
            return;
        }
        niw.a("Phenix", "DiskCache Writer Started.", nmvVar.e());
        nmvVar.b(njbVar, z);
        Map<String, String> B = nmvVar.e().B();
        if (com.taobao.phenix.intf.b.h().E() && B != null && B.size() > 0 && HttpHeaderConstant.NO_CACHE.equals(B.get(HttpConstant.CACHE_CONTROL))) {
            niw.a("Phenix", "skip DiskCache Writer.", nmvVar.e());
        } else if (njbVar == null || njbVar.b() == null) {
            niw.a("Phenix", "skip DiskCache Writer. getEncodedImage invalid", nmvVar.e());
        } else {
            gvt.a("phenix_disk_write " + nmvVar.e().H());
            a(nmvVar.e(), njbVar.b(), true);
            if (a(nmvVar.e())) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str = B != null ? B.get("max-age") : "";
                    if (!StringUtils.isEmpty(str) && StringUtils.isDigitsOnly(str)) {
                        String str2 = nmvVar.e().w() + nmvVar.e().x();
                        long longValue = Long.valueOf(str).longValue();
                        nmvVar.e().b().n = !(this.f18869a.a(longValue) ? this.f18869a.a(str2, longValue) : false);
                        nmvVar.e().b().m = System.currentTimeMillis() - currentTimeMillis;
                    }
                    niw.a("Phenix", "DiskCache Writer Put TTL Time", nmvVar.e());
                } catch (Exception e) {
                    qol.h("TTL", "ttl put error=%s", e);
                }
            }
            gvt.a();
            niw.a("Phenix", "DiskCache Writer Ended.", nmvVar.e());
        }
    }

    private boolean a(com.taobao.phenix.request.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71690dc7", new Object[]{this, bVar})).booleanValue();
        }
        Map<String, String> B = bVar.B();
        return this.f18869a != null && B != null && !StringUtils.isEmpty(B.get("max-age")) && this.f18869a.b(bVar.p());
    }
}
