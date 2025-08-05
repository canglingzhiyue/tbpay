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
import tb.ivy;
import tb.kqa;

/* loaded from: classes7.dex */
public class i extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long RATEFIRSTFRAMETRACK = 4386811438347061671L;

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
        String c = dlhVar.c("keySection");
        String c2 = dlhVar.c("timeStamp");
        JSONObject a3 = dlhVar.a("exParams");
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(c2) && (dleVar.a() instanceof FragmentActivity) && (a2 = kqa.INSTANCE.a((FragmentActivity) dleVar.a(), dleVar.e())) != null) {
            ivy ivyVar = new ivy(c, Long.parseLong(c2), a3);
            if (a2.getTrackManager() != null) {
                a2.getTrackManager().a(c, ivyVar);
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

        public i a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("22fd2072", new Object[]{this, obj}) : new i();
        }
    }
}
