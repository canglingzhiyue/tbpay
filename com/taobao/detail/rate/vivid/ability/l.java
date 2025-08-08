package com.taobao.detail.rate.vivid.ability;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.m;
import com.taobao.detail.rate.v2.RateViewPagerFragmentV2;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

/* loaded from: classes7.dex */
public class l extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long XRATEOPENPREVIEWV2 = 2989033931282006034L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        String a2 = m.a("", dlhVar.c(), "params", "tagId");
        if (StringUtils.isEmpty(a2)) {
            return new dla();
        }
        Bundle bundle = new Bundle();
        bundle.putString("tagId", a2);
        RateViewPagerFragmentV2 rateViewPagerFragmentV2 = new RateViewPagerFragmentV2();
        rateViewPagerFragmentV2.setArguments(bundle);
        FragmentTransaction beginTransaction = ((FragmentActivity) dleVar.a()).getSupportFragmentManager().beginTransaction();
        beginTransaction.add(rateViewPagerFragmentV2, "RateViewPagerFragmentV2");
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
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

        public l a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("22fd20cf", new Object[]{this, obj}) : new l();
        }
    }
}
