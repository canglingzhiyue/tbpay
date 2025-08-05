package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.monitor.b;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.aa;

/* loaded from: classes6.dex */
public class jwu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static aa f29839a;

    static {
        kge.a(197611771);
        f29839a = new a(null);
    }

    public static MUSView a(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSView) ipChange.ipc$dispatch("2dbd736a", new Object[]{mUSDKInstance});
        }
        MUSView mUSView = (MUSView) jws.a(mUSDKInstance.getUIContext(), f29839a);
        mUSView.setInstance(mUSDKInstance);
        return mUSView;
    }

    public static void a(MUSView mUSView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16782cca", new Object[]{mUSView});
            return;
        }
        mUSView.release(true);
        mUSView.setInstance(null);
        try {
            jws.a(mUSView.getContext(), f29839a, mUSView);
        } catch (Exception e) {
            b.a();
            g.a(e);
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends aa {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1476582173);
        }

        @Override // com.taobao.android.weex_uikit.ui.aa
        public int poolSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
            }
            return 10;
        }

        public a(Object obj) {
            super(obj);
        }

        @Override // com.taobao.android.weex_uikit.ui.aa
        /* renamed from: onCreateMountContent */
        public Object mo1225onCreateMountContent(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new MUSView(context);
        }
    }
}
