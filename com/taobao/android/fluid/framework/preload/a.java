package com.taobao.android.fluid.framework.preload;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import tb.kge;

/* loaded from: classes5.dex */
public interface a extends g {

    /* renamed from: com.taobao.android.fluid.framework.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0497a implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1705094736);
            kge.a(916896805);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            }
        }
    }
}
