package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import tb.kge;

/* loaded from: classes8.dex */
public interface n {

    /* loaded from: classes8.dex */
    public static class a implements n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-907100795);
            kge.a(873332569);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void appendJSLog(int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab6b5ccf", new Object[]{this, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void appendModuleExecuteCallback(g.c cVar, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29d859f4", new Object[]{this, cVar, obj, new Boolean(z)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void appendModuleExecuteInfo(g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1ee2d3b", new Object[]{this, cVar});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void appendTNodeLog(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d265368", new Object[]{this, new Integer(i), str, str2});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void flick(aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f963d7a", new Object[]{this, aaVar});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void onCancel(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c56f55a0", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void onMove(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25839977", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void setEnableDebugTool(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0170767", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n
        public void showTool(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be25e618", new Object[]{this, new Boolean(z)});
            }
        }
    }

    void appendJSLog(int i, String str, boolean z);

    void appendModuleExecuteCallback(g.c cVar, Object obj, boolean z);

    void appendModuleExecuteInfo(g.c cVar);

    void appendTNodeLog(int i, String str, String str2);

    void destroy();

    void flick(aa aaVar);

    void onCancel(int i, int i2);

    void onMove(int i, int i2);

    void onPause();

    void onResume();

    void setEnableDebugTool(boolean z);

    void showTool(boolean z);
}
