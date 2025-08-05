package com.taobao.detail.rate.vivid.ability;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.ivx;
import tb.kqa;

/* loaded from: classes7.dex */
public class k extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long RATELOADINGVIEWFIRSTFRAMEPICTURERENDER = 95290952468497626L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        RateFeedsFragment a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null || dlhVar.c() == null) {
            return new dla();
        }
        String c = dlhVar.c("pictureType");
        int d = dlhVar.d("index");
        String c2 = dlhVar.c("timeStamp");
        JSONObject a3 = dlhVar.a("exParams");
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(c2) && (dleVar.a() instanceof FragmentActivity) && (a2 = kqa.INSTANCE.a((FragmentActivity) dleVar.a(), dleVar.e())) != null) {
            ivx ivxVar = new ivx("endImageLoaded", Long.parseLong(c2), a3, c, d);
            if (a2.getLoadingViewTrack() != null) {
                a2.getLoadingViewTrack().a(ivxVar);
            }
        }
        return new dla();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public k a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("22fd20b0", new Object[]{this, obj}) : new k();
        }
    }
}
