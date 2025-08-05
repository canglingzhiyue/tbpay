package com.taobao.android.detail.core.event.subscriber.market;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.subscriber.trade.AddCartSubscriber;
import com.taobao.android.detail.core.request.cart.AddBagRequestParams;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import mtopsdk.mtop.domain.MtopResponse;
import tb.edw;
import tb.emu;
import tb.epq;
import tb.kge;

/* loaded from: classes4.dex */
public class MarketAddCartSubscriber extends AddCartSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ITEM_URL = "https://a.m.taobao.com/i%s.htm";

    static {
        kge.a(-1482923001);
    }

    public static /* synthetic */ Object ipc$super(MarketAddCartSubscriber marketAddCartSubscriber, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1486138896) {
            super.onAddCartSuccess((MtopResponse) objArr[0], (AddBagRequestParams) objArr[1]);
            return null;
        } else if (hashCode != -933985806) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAddCartFailed((MtopResponse) objArr[0], (AddBagRequestParams) objArr[1]);
            return null;
        }
    }

    public MarketAddCartSubscriber(DetailCoreActivity detailCoreActivity) {
        super(detailCoreActivity);
        emu.a("com.taobao.android.detail.core.event.subscriber.market.MarketAddCartSubscriber");
    }

    @Override // com.taobao.android.detail.core.event.subscriber.trade.AddCartSubscriber
    public void onAddCartSuccess(MtopResponse mtopResponse, AddBagRequestParams addBagRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76b51f0", new Object[]{this, mtopResponse, addBagRequestParams});
            return;
        }
        super.onAddCartSuccess(mtopResponse, addBagRequestParams);
        d a2 = f.a(this.mActivity);
        if (a2 == null) {
            return;
        }
        a2.a(new edw());
    }

    @Override // com.taobao.android.detail.core.event.subscriber.trade.AddCartSubscriber
    public void onAddCartFailed(MtopResponse mtopResponse, AddBagRequestParams addBagRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85481f2", new Object[]{this, mtopResponse, addBagRequestParams});
            return;
        }
        super.onAddCartFailed(mtopResponse, addBagRequestParams);
        if ((mtopResponse != null && (mtopResponse.isSessionInvalid() || "ANDROID_SYS_LOGIN_CANCEL".equals(mtopResponse.getRetCode()))) || addBagRequestParams == null || TextUtils.isEmpty(addBagRequestParams.itemId)) {
            return;
        }
        epq.a(this.mActivity, String.format(ITEM_URL, addBagRequestParams.itemId));
    }
}
