package com.taobao.android.weex_framework.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import tb.kge;

/* loaded from: classes6.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MUSDKInstance f15983a;

    static {
        kge.a(1932594727);
    }

    public e(MUSDKInstance mUSDKInstance) {
        this.f15983a = mUSDKInstance;
    }

    public void a(final INode iNode, MUSValue mUSValue, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a5fdea", new Object[]{this, iNode, mUSValue, mUSValueArr});
            return;
        }
        final c invoker = iNode.getInvoker(mUSValue);
        if (invoker == null) {
            g.d("Can't found UINode method: " + mUSValue);
            return;
        }
        this.f15983a.getExecuteContext();
        this.f15983a.postTaskToMain(new o() { // from class: com.taobao.android.weex_framework.bridge.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    invoker.a(iNode.getInstance(), (Object) null, (Object) iNode, mUSValueArr);
                }
            }
        });
    }
}
