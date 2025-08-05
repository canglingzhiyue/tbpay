package com.taobao.live.home.dinamic.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.dkx;
import tb.dky;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

/* loaded from: classes7.dex */
public class k extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLVSYNCTASK = -5714497328744620300L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dllVar != null) {
            dllVar.callback("onComplete", new dla());
        }
        return new dky();
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
            return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("a22bff3b", new Object[]{this, obj}) : new k();
        }
    }
}
