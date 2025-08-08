package com.taobao.android.detail.wrapper.ultronengine.event;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.List;
import tb.dya;
import tb.emu;
import tb.eqb;
import tb.fgl;
import tb.kge;
import tb.mrm;

/* loaded from: classes5.dex */
public class g extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openAddress";

    static {
        kge.a(-103234113);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public g() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenAddressUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("OpenAddressUltronSubscriber", "onHandleEvent");
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) com.taobao.prefork.a.a(eVar.a());
        if (detailCoreActivity == null || detailCoreActivity.y() == null || detailCoreActivity.y().t == null) {
            return;
        }
        try {
            if (d(eVar)) {
                b(detailCoreActivity, eVar);
            } else {
                a(detailCoreActivity, eVar);
            }
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("OpenAddressUltronSubscriber", "onHandleEvent#openByUrl", th);
        }
    }

    private boolean d(com.alibaba.android.ultron.event.base.e eVar) {
        DMEvent dMEvent;
        JSONObject fields;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c03fdde4", new Object[]{this, eVar})).booleanValue() : (eVar == null || (dMEvent = (DMEvent) eVar.i()) == null || (fields = dMEvent.getFields()) == null || StringUtils.isEmpty(fields.getString("url"))) ? false : true;
    }

    private String a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387dc60d", new Object[]{this, detailCoreActivity});
        }
        if (detailCoreActivity != null && detailCoreActivity.y() != null && detailCoreActivity.y().t != null && detailCoreActivity.y().t.f10055a != null && eqb.h(detailCoreActivity.y().t.f10055a) != null) {
            return eqb.h(detailCoreActivity.y().t.f10055a).addressWeexUrl;
        }
        return null;
    }

    private String a(DetailCoreActivity detailCoreActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("265168f9", new Object[]{this, detailCoreActivity, str, str2});
        }
        if (!StringUtils.isEmpty(str)) {
            String a2 = !StringUtils.isEmpty(a(detailCoreActivity)) ? a(detailCoreActivity) : str;
            if (!StringUtils.isEmpty(str2)) {
                return (a2 + "&currentAddress=" + str2) + "&item_id=" + detailCoreActivity.y().t.i() + "&seller_id=" + detailCoreActivity.y().t.h();
            }
        }
        return str;
    }

    private void a(DetailCoreActivity detailCoreActivity, com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f026d8", new Object[]{this, detailCoreActivity, eVar});
        } else if (!(detailCoreActivity instanceof DetailActivity)) {
        } else {
            dya y = detailCoreActivity.y();
            List<IDMComponent> list = null;
            String encode = (y == null || y.h() == null || y.h().getCurrentAreaFullName() == null) ? null : Uri.encode(detailCoreActivity.y().h().getCurrentAreaFullName());
            com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = detailCoreActivity.b.t;
            String i = cVar.i();
            String h = cVar.h();
            String currentAreaId = detailCoreActivity.b.h().getCurrentAreaId();
            String str = cVar.c() ? com.taobao.linkmanager.flowout.c.TMALL : "taobao";
            JSONObject c = c();
            if (c == null) {
                c = new JSONObject();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) i);
            jSONObject.put("sellerId", (Object) h);
            jSONObject.put(mrm.KEY_AREA_ID, (Object) currentAreaId);
            jSONObject.put("itemType", (Object) str);
            jSONObject.put("loadUrl", (Object) Uri.encode(a(detailCoreActivity, "//market.m.taobao.com/apps/market/detailrax/address-picker.html?spm=a2116h.app.0.0.16d957e9nDYOzv&wh_weex=true", encode)));
            jSONObject.put("sku_token", (Object) ((DetailActivity) detailCoreActivity).h);
            c.put("pageType", "Native");
            c.put("url", "https://arealocation.taobao.com/home.htm");
            c.put("queryParams", (Object) jSONObject);
            if (b() != null) {
                list = b().getComponents();
            }
            DMEvent dMEvent = new DMEvent("openUrl", c, list);
            eVar.a("openUrl");
            eVar.a(dMEvent);
            eVar.h().d().a(eVar);
        }
    }

    private void b(DetailCoreActivity detailCoreActivity, com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6938d9", new Object[]{this, detailCoreActivity, eVar});
        } else if (!(detailCoreActivity instanceof DetailActivity)) {
        } else {
            String i = detailCoreActivity.b.t.i();
            String currentAreaId = detailCoreActivity.b.h().getCurrentAreaId();
            String string = ((DMEvent) eVar.i()).getFields().getString("url");
            JSONObject c = c();
            if (c == null) {
                c = new JSONObject();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(fgl.TARGETITEMID, (Object) i);
            jSONObject.put(fgl.ORIGINALITEMID, (Object) i);
            jSONObject.put(mrm.KEY_AREA_ID, (Object) currentAreaId);
            jSONObject.put("token", (Object) ((DetailActivity) detailCoreActivity).h);
            c.put("url", (Object) string);
            c.put("queryParams", (Object) jSONObject);
            List<IDMComponent> list = null;
            if (b() != null) {
                list = b().getComponents();
            }
            DMEvent dMEvent = new DMEvent("openUrl", c, list);
            eVar.a("openUrl");
            eVar.a(dMEvent);
            eVar.h().d().a(eVar);
        }
    }
}
