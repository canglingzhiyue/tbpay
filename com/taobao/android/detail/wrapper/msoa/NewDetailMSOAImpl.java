package com.taobao.android.detail.wrapper.msoa;

import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.supermarket.a;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.event.params.a;
import com.taobao.android.detail.wrapper.activity.DetailFloatActivity;
import com.taobao.android.detail.wrapper.ext.uikit.b;
import com.taobao.android.msoa.c;
import com.taobao.android.nav.Nav;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.edv;
import tb.efs;
import tb.eft;
import tb.emu;
import tb.eno;
import tb.kge;

/* loaded from: classes5.dex */
public class NewDetailMSOAImpl implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String TAG = NewDetailMSOAImpl.class.getSimpleName();

    static {
        kge.a(153062489);
        kge.a(1028243835);
    }

    public void showSku(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1349005", new Object[]{this, str, str2, str3});
            return;
        }
        String str4 = "https://a.m.taobao.com/sku" + str2 + ".htm";
        Bundle bundle = new Bundle();
        bundle.putString(e.REQUEST_ID, str);
        if (!StringUtils.isEmpty(str3)) {
            try {
                i = Integer.parseInt(str3);
            } catch (Exception unused) {
            }
        }
        if (i == 1) {
            bundle.putString("bottom_bar_style", "bottombar_style_confirm_addcart");
        } else if (i == 2) {
            bundle.putString("bottom_bar_style", "bottombar_style_confirm_buy");
        } else {
            bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
        }
        Nav.from(Globals.getApplication()).withExtras(bundle).toUri(str4);
    }

    public void addSMCart(final String str, final String str2, String str3, String str4) {
        String str5;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b985aa", new Object[]{this, str, str2, str3, str4});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.msoa.NewDetailMSOAImpl#addSMCart with token " + str3);
        if (emu.c()) {
            a.a(str, str2, str3, str4);
        } else if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            c.a().a(str, "msoa_error_invalid_param", "invalid parameter", null);
        } else {
            try {
                str3 = URLDecoder.decode(str3, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            DetailCoreActivity a2 = com.taobao.android.detail.core.detail.activity.a.a(str3);
            if (a2 == null || a2.y() == null) {
                c.a().a(str, "msoa_error_business_fail", "provider business fail", null);
                return;
            }
            JSONObject parseObject = JSON.parseObject(str4);
            HashMap hashMap = new HashMap();
            if (parseObject != null) {
                i = parseObject.getIntValue("quantity");
                JSONObject jSONObject = parseObject.getJSONObject("exParams");
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                }
                str5 = parseObject.getString("skuId");
            } else {
                str5 = null;
                i = 0;
            }
            if (i <= 0) {
                i = 1;
            }
            if (a2.y().t != null && !StringUtils.isEmpty(a2.y().t.y())) {
                hashMap.put("tpId", a2.y().t.y());
            }
            f.a(a2, new edv(new com.taobao.android.detail.datasdk.event.params.c(new a.C0382a().a(i).b(str2).a(str5).a(hashMap).a(), false)), new com.taobao.android.trade.event.c<i>() { // from class: com.taobao.android.detail.wrapper.msoa.NewDetailMSOAImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.c
                public void a(i iVar, j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e2d27b9", new Object[]{this, iVar, jVar});
                    } else if (!i.FAILURE.equals(iVar)) {
                    } else {
                        c.a().a(str, "msoa_error_business_fail", "provider business fail", null);
                    }
                }

                @Override // com.taobao.android.trade.event.c
                public void onEventException(j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                    } else {
                        c.a().a(str, "msoa_error_business_fail", "provider business fail", null);
                    }
                }
            });
            j<eft> jVar = new j<eft>() { // from class: com.taobao.android.detail.wrapper.msoa.NewDetailMSOAImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.j
                public /* synthetic */ i handleEvent(eft eftVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (i) ipChange2.ipc$dispatch("caa7474e", new Object[]{this, eftVar}) : a(eftVar);
                }

                public i a(eft eftVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (i) ipChange2.ipc$dispatch("128dd3ca", new Object[]{this, eftVar});
                    }
                    if (eftVar != null && eftVar.f27285a != null && str2.equals(eftVar.f27285a.itemId)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("resultCode", "1");
                        c.a().a(str, hashMap2);
                    }
                    return i.SUCCESS;
                }

                @Override // com.taobao.android.trade.event.j
                public ThreadMode getThreadMode() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ThreadMode) ipChange2.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
                }
            };
            j<efs> jVar2 = new j<efs>() { // from class: com.taobao.android.detail.wrapper.msoa.NewDetailMSOAImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.j
                public /* synthetic */ i handleEvent(efs efsVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (i) ipChange2.ipc$dispatch("caa7474e", new Object[]{this, efsVar}) : a(efsVar);
                }

                public i a(efs efsVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (i) ipChange2.ipc$dispatch("fee60049", new Object[]{this, efsVar});
                    }
                    if (efsVar != null && efsVar.f27284a != null && str2.equals(efsVar.f27284a.itemId)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("resultCode", "0");
                        c.a().a(str, hashMap2);
                    }
                    return i.SUCCESS;
                }

                @Override // com.taobao.android.trade.event.j
                public ThreadMode getThreadMode() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ThreadMode) ipChange2.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
                }
            };
            f.a(a2).a(eno.a(eft.class), jVar);
            f.a(a2).a(eno.a(efs.class), jVar2);
            emu.a("com.taobao.android.detail.wrapper.msoa.NewDetailMSOAImpl#addSMCart found token " + str3);
        }
    }

    public void showFloatPage(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95188a33", new Object[]{this, str, str2, str3});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.msoa.NewDetailMSOAImpl#showFloatPage");
        exeShowFloatPage(str, str2, str3);
    }

    private void exeShowFloatPage(String str, String str2, String str3) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53420fc1", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            com.taobao.android.detail.core.utils.i.a(this.TAG, "requestId or type is null");
            c.a().b(str, "0", DetailFloatActivity.ERROR_MSG, null);
        } else {
            Uri.Builder buildUpon = Uri.parse(DetailFloatActivity.URI).buildUpon();
            buildUpon.appendQueryParameter(b.b, str2);
            buildUpon.appendQueryParameter(b.f11376a, str);
            if (!StringUtils.isEmpty(str3)) {
                try {
                    JSONObject parseObject = JSON.parseObject(str3);
                    if (parseObject != null) {
                        for (String str4 : parseObject.keySet()) {
                            if (!StringUtils.isEmpty(str4) && (obj = parseObject.get(str4)) != null && (obj instanceof String)) {
                                buildUpon.appendQueryParameter(str4, (String) obj);
                            }
                        }
                    }
                } catch (Exception unused) {
                    com.taobao.android.detail.core.utils.i.a(this.TAG, "parse json bizData onFailure");
                    c.a().b(str, "0", DetailFloatActivity.ERROR_MSG, null);
                }
            }
            Nav.from(Globals.getApplication()).toUri(buildUpon.toString());
        }
    }
}
