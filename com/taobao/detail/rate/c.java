package com.taobao.detail.rate;

import android.support.v4.app.Fragment;
import com.taobao.android.weex_framework.util.a;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.model.RateInfo;
import kotlin.Metadata;
import tb.rih;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J!\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0017\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/taobao/detail/rate/IRateFragment;", "", "getFragment", "Landroid/support/v4/app/Fragment;", "onTabSelect", "", "curIndex", "", a.ATOM_lastIndex, "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "onTabUnSelect", "setPreRender", "preRenderContext", "Lcom/taobao/detail/rate/vivid/utils/PreRenderContext;", "setRateCallBack", "callBack", "Lcom/taobao/detail/rate/RateFeedsFragment$RateCallBack;", "setRateInfo", "info", "Lcom/taobao/detail/rate/model/RateInfo;", "setTabIndex", "index", "(Ljava/lang/Integer;)V", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public interface c {
    Fragment getFragment();

    void onTabSelect(Integer num, Integer num2);

    void onTabUnSelect(Integer num, Integer num2);

    void setPreRender(rih rihVar);

    void setRateCallBack(RateFeedsFragment.b bVar);

    void setRateInfo(RateInfo rateInfo);

    void setTabIndex(Integer num);
}
