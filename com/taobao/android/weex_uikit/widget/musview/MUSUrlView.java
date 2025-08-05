package com.taobao.android.weex_uikit.widget.musview;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.widget.musview.BaseMUSUrlView;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSUrlView extends BaseMUSUrlView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1179516997);
    }

    public static /* synthetic */ Object ipc$super(MUSUrlView mUSUrlView, String str, Object... objArr) {
        if (str.hashCode() == -939675523) {
            super.refreshAttribute((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MUSUrlView(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void refreshAttribute(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fdb07d", new Object[]{this, map});
            return;
        }
        super.refreshAttribute(map);
        if (getMountContent() == null) {
            return;
        }
        com.taobao.android.weex_uikit.widget.musview.a.a(this, getInstance(), (MUSUrlHost) getMountContent(), this.measureResult);
    }

    /* loaded from: classes6.dex */
    public static class a extends BaseMUSUrlView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(744016631);
        }

        @Override // com.taobao.android.weex_uikit.widget.musview.BaseMUSUrlView.a, com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : c(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        @Override // com.taobao.android.weex_uikit.widget.musview.BaseMUSUrlView.a
        public /* synthetic */ BaseMUSUrlView b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseMUSUrlView) ipChange.ipc$dispatch("68db6257", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : c(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public MUSUrlView c(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MUSUrlView) ipChange.ipc$dispatch("85800c29", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            MUSUrlView mUSUrlView = new MUSUrlView(i);
            mUSUrlView.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                mUSUrlView.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                mUSUrlView.updateAttrs(mUSProps2);
            }
            return mUSUrlView;
        }
    }
}
