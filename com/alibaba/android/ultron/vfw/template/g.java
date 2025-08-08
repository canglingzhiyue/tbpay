package com.alibaba.android.ultron.vfw.template;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.bnu;
import tb.bnv;
import tb.bny;
import tb.bon;
import tb.bpd;
import tb.fvb;
import tb.fvd;
import tb.fve;
import tb.jnq;
import tb.jns;
import tb.jpr;
import tb.jpu;
import tb.jqg;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public final class g implements fve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bny f2736a;
    private d b;
    private final jnq<List<DXTemplateItem>> c;
    private final jnq<List<DXTemplateItem>> d;
    private final jns<Boolean, List<fvd>> e;

    static {
        kge.a(697043255);
        kge.a(-1579893205);
    }

    public g(bny bnyVar, jnq<List<DXTemplateItem>> jnqVar, jnq<List<DXTemplateItem>> jnqVar2, jns<Boolean, List<fvd>> jnsVar) {
        this.f2736a = bnyVar;
        this.c = jnqVar;
        this.d = jnqVar2;
        this.e = jnsVar;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea187fc8", new Object[]{this, dVar});
        } else {
            this.b = dVar;
        }
    }

    @Override // tb.fve
    public void onNotificationListener(fvb fvbVar) {
        Boolean a2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            return;
        }
        String r = this.f2736a.r();
        if (fvbVar == null) {
            jqg.a(r, "DX下载失败，返回了空");
            return;
        }
        try {
            List<fvd> list = fvbVar.c;
            if (list != null) {
                for (fvd fvdVar : list) {
                    if (fvdVar != null && (i = fvdVar.c) == 1000) {
                        a(fvdVar.f28145a != null ? fvdVar.f28145a.f11925a : "", "componentRenderError", String.valueOf(i));
                    }
                }
            }
        } catch (Throwable unused) {
            jqg.b(r, "onNotificationListener异常，之前的注册");
        }
        List<DXTemplateItem> list2 = fvbVar.f28139a;
        List<DXTemplateItem> list3 = fvbVar.b;
        List<fvd> list4 = fvbVar.c;
        this.c.a(list2);
        if (this.b != null) {
            e eVar = new e();
            eVar.f2734a = bnu.a(list2);
            eVar.b = bnu.a(list3);
            this.b.a(eVar);
        }
        if (list2 != null && list2.size() > 0 && this.f2736a.h() == 2) {
            this.d.a(list2);
            if (a(r, list2)) {
                jqg.b(r, "下载DX后差量刷新，模板个数：" + list2.size());
                return;
            }
            this.f2736a.a(127);
        }
        if (!bpd.b(this.f2736a.k()) || list4 == null || list4.size() <= 0 || (a2 = this.e.a(list4)) == null || !a2.booleanValue()) {
            return;
        }
        this.f2736a.a(127);
    }

    private boolean a(String str, List<DXTemplateItem> list) {
        bnv d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{this, str, list})).booleanValue();
        }
        if (!jqi.a(str, "diffRefreshWhenDownloadDXFinished", false) || (d = this.f2736a.d()) == null) {
            return false;
        }
        List<IDMComponent> c = d.c();
        List<IDMComponent> e = d.e();
        List<IDMComponent> g = d.g();
        ArrayList arrayList = new ArrayList();
        for (DXTemplateItem dXTemplateItem : list) {
            IDMComponent a2 = a(c, dXTemplateItem.f11925a);
            if (a2 != null) {
                if (e.contains(a2) || g.contains(a2)) {
                    return false;
                }
                arrayList.add(a2);
                jqg.b(str, "差量刷新：" + a2.getKey());
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        this.f2736a.a(arrayList);
        return true;
    }

    private IDMComponent a(List<IDMComponent> list, String str) {
        JSONObject containerInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("14b9cf67", new Object[]{this, list, str});
        }
        if (list != null && !StringUtils.isEmpty(str)) {
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null && (containerInfo = iDMComponent.getContainerInfo()) != null) {
                    String string = containerInfo.getString("name");
                    if (str != null && str.equals(string)) {
                        return iDMComponent;
                    }
                }
            }
        }
        return null;
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        String r = this.f2736a.r();
        jpu a2 = jpu.a(r);
        jpu c = a2.c(r + "#DXRenderDowngradeError");
        jpr.a(c.b("name:" + str + ",reason" + str3));
        bon bonVar = (bon) this.f2736a.a(bon.class);
        if (bonVar == null) {
            return;
        }
        bonVar.a(str, str2, str3);
    }
}
