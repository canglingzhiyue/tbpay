package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tmgcashier.constant.TMGCashierRenderType;

/* loaded from: classes9.dex */
public class nai {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TMGCashierRenderType f31353a;
    private boolean b;

    static {
        kge.a(1230353437);
    }

    public static /* synthetic */ TMGCashierRenderType a(nai naiVar, TMGCashierRenderType tMGCashierRenderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMGCashierRenderType) ipChange.ipc$dispatch("7399b5e", new Object[]{naiVar, tMGCashierRenderType});
        }
        naiVar.f31353a = tMGCashierRenderType;
        return tMGCashierRenderType;
    }

    private nai() {
        this.f31353a = TMGCashierRenderType.RENDER_TYPE_WEEX;
        this.b = false;
    }

    public TMGCashierRenderType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMGCashierRenderType) ipChange.ipc$dispatch("8a8b82d0", new Object[]{this}) : this.f31353a;
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private nai f31354a = new nai();

        static {
            kge.a(449388020);
        }

        public nai a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (nai) ipChange.ipc$dispatch("f081ec8", new Object[]{this}) : this.f31354a;
        }

        public void a(TMGCashierRenderType tMGCashierRenderType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b450fd50", new Object[]{this, tMGCashierRenderType});
            } else {
                nai.a(this.f31354a, tMGCashierRenderType);
            }
        }
    }
}
