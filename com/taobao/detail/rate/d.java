package com.taobao.detail.rate;

import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.model.RateInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.bgp;
import tb.rih;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/taobao/detail/rate/RateFeedsManger;", "", "()V", bgp.FRAGMENT, "Lcom/taobao/detail/rate/IRateFragment;", "getFragment", "Landroid/support/v4/app/Fragment;", "getNormalAnimDurationMs", "", "getPopAnimDurationMs", "onTabSelect", "", "curIndex", a.ATOM_lastIndex, "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "onTabUnSelect", "setPreRender", "preRenderContext", "Lcom/taobao/detail/rate/vivid/utils/PreRenderContext;", "setRateCallBack", "callBack", "Lcom/taobao/detail/rate/RateFeedsFragment$RateCallBack;", "setRateInfo", "info", "Lcom/taobao/detail/rate/model/RateInfo;", "setTabIndex", "index", "(Ljava/lang/Integer;)V", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f17005a = new RateFeedsFragment();

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 150;
    }

    public void a(RateFeedsFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d69a18", new Object[]{this, bVar});
        } else {
            this.f17005a.setRateCallBack(bVar);
        }
    }

    public void a(RateInfo rateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75afcbe1", new Object[]{this, rateInfo});
        } else {
            this.f17005a.setRateInfo(rateInfo);
        }
    }

    public void a(rih preRenderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd155027", new Object[]{this, preRenderContext});
            return;
        }
        q.d(preRenderContext, "preRenderContext");
        this.f17005a.setPreRender(preRenderContext);
    }

    public Fragment a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("13a755ca", new Object[]{this}) : this.f17005a.getFragment();
    }

    public void a(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8704508", new Object[]{this, num, num2});
        } else {
            this.f17005a.onTabSelect(num, num2);
        }
    }

    public void b(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb1b3c9", new Object[]{this, num, num2});
        } else {
            this.f17005a.onTabUnSelect(num, num2);
        }
    }

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.f17005a.setTabIndex(num);
        }
    }
}
