package com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class FansClubResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FansClubResponseData data;

    /* loaded from: classes4.dex */
    public static class FansClubResponseData implements INetDataObject {
        public int clubLevel;
        public String clubLevelIcon;
        public String clubLevelWithFavorIcon;
        public int status;

        static {
            kge.a(233641374);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(213666375);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public FansClubResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FansClubResponseData) ipChange.ipc$dispatch("1e4294e0", new Object[]{this}) : this.data;
    }
}
