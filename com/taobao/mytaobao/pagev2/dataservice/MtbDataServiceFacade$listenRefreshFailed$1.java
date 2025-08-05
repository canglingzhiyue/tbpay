package com.taobao.mytaobao.pagev2.dataservice;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.mtz;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorMsg", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbDataServiceFacade$listenRefreshFailed$1 extends Lambda implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul $refreshFailedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbDataServiceFacade$listenRefreshFailed$1(rul rulVar) {
        super(1);
        this.$refreshFailedListener = rulVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(String str) {
        invoke2(str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
        } else {
            mtz.a(new Runnable() { // from class: com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade$listenRefreshFailed$1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtbDataServiceFacade$listenRefreshFailed$1.this.$refreshFailedListener.mo2421invoke(str);
                    }
                }
            });
        }
    }
}
