package com.taobao.android.litecreator.model;

import kotlin.Metadata;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/taobao/android/litecreator/model/LCMTopResponse;", "Lmtopsdk/mtop/domain/MtopResponse;", "()V", "getMTopStatInfo", "", "is41XResult", "", "isMtopServerError", "isNoNetwork", "litecreator_utils_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class LCMTopResponse extends MtopResponse {
    static {
        kge.a(925489482);
    }

    @Override // mtopsdk.mtop.domain.MtopResponse
    public boolean isNoNetwork() {
        return super.isNoNetwork();
    }

    @Override // mtopsdk.mtop.domain.MtopResponse
    public boolean is41XResult() {
        return super.is41XResult();
    }

    @Override // mtopsdk.mtop.domain.MtopResponse
    public boolean isMtopServerError() {
        return super.isMtopServerError();
    }

    public final String getMTopStatInfo() {
        MtopStatistics mtopStat = getMtopStat();
        if (mtopStat != null) {
            return mtopStat.getStatSum();
        }
        return null;
    }
}
