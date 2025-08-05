package com.taobao.weex.ui.action;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class GraphicActionBatchAction extends BasicGraphicAction {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<BasicGraphicAction> mActions;

    static {
        kge.a(620410251);
    }

    public GraphicActionBatchAction(WXSDKInstance wXSDKInstance, String str, List<BasicGraphicAction> list) {
        super(wXSDKInstance, str);
        this.mActions = new ArrayList(list);
    }

    @Override // com.taobao.weex.ui.action.IExecutable
    public void executeAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d76bd12", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mActions.size(); i++) {
            this.mActions.get(i).executeAction();
        }
    }
}
