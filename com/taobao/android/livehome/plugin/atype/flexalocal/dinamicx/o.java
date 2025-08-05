package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import tb.dlg;
import tb.dln;
import tb.kge;

/* loaded from: classes6.dex */
public class o extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLCACHE = -2712665586039606850L;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Object f14176a;
    public static volatile String b;

    static {
        kge.a(1474108717);
        f14176a = null;
        b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    @Override // tb.dlg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.dkx a(tb.dlh r11, tb.dle r12, final tb.dll r13) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.o.a(tb.dlh, tb.dle, tb.dll):tb.dkx");
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(136214276);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public o a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("afe00dab", new Object[]{this, obj}) : new o();
        }
    }
}
