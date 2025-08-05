package com.taobao.android.icart.event;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.TBMainHost;
import com.taobao.taobao.R;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.abj;
import tb.bca;
import tb.bdm;
import tb.bdx;
import tb.bed;
import tb.bmz;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_UMBRELLA_TYPE_VERSION = "1.0";
    public static byte[] c;

    static {
        kge.a(2050373295);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        MtopResponse mtopResponse = (MtopResponse) bmzVar.b("mtopResponse");
        if (mtopResponse != null) {
            c = mtopResponse.getBytedata();
        }
        f();
        a("ultron-cart", mtopResponse);
    }

    private void a(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1453b77", new Object[]{this, str, mtopResponse});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            String str2 = (String) this.d.b("downgradeType");
            hashMap.put("traceId", com.alibaba.android.ultron.trade.utils.g.a(mtopResponse));
            HashMap hashMap2 = new HashMap();
            if (this.e instanceof Activity) {
                hashMap2.put("intentParam", ((Activity) this.e).getIntent().getExtras());
            }
            hashMap.put("bizInfo", JSON.toJSONString(hashMap2));
            hashMap.put("downgradeType", str2);
            UmbrellaTracker.commitFailureStability("downgrade", "ultronCartDownGraded", "1.0", "iCart", str, hashMap, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        } catch (Throwable th) {
            UnifyLog.d("CartDowngradeSubscriber", th.getMessage());
            hashMap.put("downgradeException", th.getMessage());
            UmbrellaTracker.commitFailureStability("eventProcess", "commitDownGraded", "1.0", "iCart", str, hashMap, "", "");
        }
    }

    private void f() {
        String str = (String) this.d.b("downgradeType");
        String str2 = bdm.TYPE_RENDER_ERROR_DOWNGRADE.equals(str) ? "组件渲染异常，降级老购物车" : "新购物车协议降级";
        if (Versions.isDebug()) {
            com.alibaba.android.icart.core.widget.d.a(this.e.getApplicationContext(), str2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("downgradeMsg", str2);
        hashMap.put("downgradeType", str2);
        hashMap.put("isMainCart", String.valueOf(this.e == TBMainHost.a().getContext()));
        hashMap.put("activityName", this.e.getClass().getName());
        bdx.a(bdx.F_PAGE_RENDER_TAG, "", "", "cart", "render", hashMap, "CartDegradeH5", "购物车被动降级H5，服务端处理失败降级老奥创协议，客户端降级H5. 具体原因是" + str2);
        bed.a("CartDegradeH5", "downgradeMsg=" + str2 + ",downgradeType=" + str);
        Fragment parentFragment = this.f25791a.u().getParentFragment();
        if (parentFragment != null && "TabCartFragment".equals(parentFragment.getClass().getSimpleName())) {
            Intent intent = new Intent();
            intent.setAction("com.taobao.android.trade.cart.changeToOldCart");
            LocalBroadcastManager.getInstance(this.e).sendBroadcast(intent);
            return;
        }
        this.f25791a.x().c().removeAllViews();
        try {
            this.f25791a.u().getChildFragmentManager().beginTransaction().replace(R.id.cart_container, (Fragment) Class.forName("com.taobao.android.trade.cart.CartWebFragment").newInstance()).commitAllowingStateLoss();
        } catch (Exception e) {
            abj.a("gotoOldCartClassException", e);
        }
    }
}
