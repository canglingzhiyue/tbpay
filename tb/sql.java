package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.i;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* loaded from: classes5.dex */
public class sql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(47630830);
    }

    public static /* synthetic */ void a(sql sqlVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315acf1", new Object[]{sqlVar, cVar});
        } else {
            sqlVar.a(cVar);
        }
    }

    public static /* synthetic */ boolean a(sql sqlVar, ItemActionQueryResponse itemActionQueryResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("71989524", new Object[]{sqlVar, itemActionQueryResponse})).booleanValue() : sqlVar.b(itemActionQueryResponse);
    }

    public static /* synthetic */ String b(sql sqlVar, ItemActionQueryResponse itemActionQueryResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2286d01", new Object[]{sqlVar, itemActionQueryResponse}) : sqlVar.a(itemActionQueryResponse);
    }

    public void a(final c cVar, LiveItem liveItem, final pox<Boolean> poxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41396e1", new Object[]{this, cVar, liveItem, poxVar});
        } else if (cVar != null && liveItem != null && poxVar != null) {
            new i(new d() { // from class: tb.sql.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (!(netBaseOutDo instanceof ItemActionQueryResponse)) {
                    } else {
                        ItemActionQueryResponse itemActionQueryResponse = (ItemActionQueryResponse) netBaseOutDo;
                        if (sql.a(sql.this, itemActionQueryResponse)) {
                            if (netBaseOutDo != null && netBaseOutDo.mo1437getData() != null && !StringUtils.isEmpty(itemActionQueryResponse.mo1437getData().msgInfo)) {
                                hix.a(cVar.f(), itemActionQueryResponse.mo1437getData().msgInfo);
                            }
                            poxVar.onResult(true);
                            return;
                        }
                        his.b("CartDetailChecker", "check | onSuccess, code=" + netResponse.getDataJsonObject());
                        hix.a(cVar.f(), sql.b(sql.this, itemActionQueryResponse));
                        poxVar.onResult(false);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    sql.a(sql.this, cVar);
                    poxVar.onError(netResponse.getRetCode(), netResponse.getRetMsg());
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    sql.a(sql.this, cVar);
                    poxVar.onError(netResponse.getRetCode(), netResponse.getRetMsg());
                }
            }).a(cVar, liveItem);
        } else if (poxVar == null) {
        } else {
            poxVar.onResult(true);
        }
    }

    private String a(ItemActionQueryResponse itemActionQueryResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8071139e", new Object[]{this, itemActionQueryResponse}) : (itemActionQueryResponse == null || itemActionQueryResponse.mo1437getData() == null || StringUtils.isEmpty(itemActionQueryResponse.mo1437getData().msgInfo)) ? dae.MSG_TOAST_DEFAULT : itemActionQueryResponse.mo1437getData().msgInfo;
    }

    private boolean b(ItemActionQueryResponse itemActionQueryResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("269f5ca5", new Object[]{this, itemActionQueryResponse})).booleanValue();
        }
        if (itemActionQueryResponse != null && itemActionQueryResponse.mo1437getData() != null && StringUtils.equals(itemActionQueryResponse.mo1437getData().type, a.ATOM_boolean)) {
            return itemActionQueryResponse.mo1437getData().success;
        }
        return true;
    }

    private void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902c638f", new Object[]{this, cVar});
        } else {
            hix.a(cVar.f(), dae.MSG_TOAST_DEFAULT);
        }
    }
}
