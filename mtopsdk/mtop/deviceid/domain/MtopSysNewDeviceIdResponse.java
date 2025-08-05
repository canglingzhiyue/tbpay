package mtopsdk.mtop.deviceid.domain;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopSysNewDeviceIdResponse extends BaseOutDo {
    private MtopSysNewDeviceIdResponseData data;

    static {
        kge.a(653740740);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public MtopSysNewDeviceIdResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopSysNewDeviceIdResponseData mtopSysNewDeviceIdResponseData) {
        this.data = mtopSysNewDeviceIdResponseData;
    }
}
