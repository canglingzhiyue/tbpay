package mtopsdk.instanceconfigs;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopExternalInstanceConfigsGetResponse extends BaseOutDo {
    private MtopExternalInstanceConfigsData data;

    static {
        kge.a(-2043366242);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public MtopExternalInstanceConfigsData mo2429getData() {
        return this.data;
    }

    public void setData(MtopExternalInstanceConfigsData mtopExternalInstanceConfigsData) {
        this.data = mtopExternalInstanceConfigsData;
    }
}
