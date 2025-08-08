package com.taobao.tbliveinteractive.business.tradetrack;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.tbliveinteractive.business.tradetrack.sign.MtopContentlivekitComponentTradeSignResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f22105a;
    private String b = null;

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(-1504668411);
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc50b0f8", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d59ae6e", new Object[]{bVar, str});
        }
        bVar.b = str;
        return str;
    }

    public b(String str) {
        this.f22105a = null;
        this.f22105a = str;
    }

    public boolean a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed1816cf", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null || StringUtils.isEmpty(this.f22105a)) {
            return false;
        }
        if (!StringUtils.isEmpty(this.b)) {
            aVar.a(this.b);
        } else {
            new com.taobao.tbliveinteractive.business.tradetrack.sign.a(new d() { // from class: com.taobao.tbliveinteractive.business.tradetrack.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (!(netBaseOutDo instanceof MtopContentlivekitComponentTradeSignResponse) || !(netBaseOutDo.mo1437getData() instanceof JSONObject)) {
                    } else {
                        b.a(b.this, ((JSONObject) netBaseOutDo.mo1437getData()).getString("result"));
                        aVar.a(b.a(b.this));
                    }
                }
            }).a(this.f22105a);
        }
        return true;
    }
}
