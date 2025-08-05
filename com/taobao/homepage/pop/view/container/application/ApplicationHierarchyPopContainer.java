package com.taobao.homepage.pop.view.container.application;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.container.a;
import com.taobao.homepage.pop.view.popview.BasePopView;
import com.taobao.homepage.pop.viewmodel.b;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kyu;
import tb.laj;
import tb.lak;

/* loaded from: classes7.dex */
public class ApplicationHierarchyPopContainer extends BasePopContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Dialog> dialogMap;

    public static /* synthetic */ Object ipc$super(ApplicationHierarchyPopContainer applicationHierarchyPopContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 1086967493) {
            if (hashCode != 1906953347) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.removePopView((String) objArr[0]);
            return null;
        }
        return super.createPopView((IPopData) objArr[0], (laj) objArr[1], (View) objArr[2], (IPopAnchorViewInfo) objArr[3], (a) objArr[4], (b) objArr[5]);
    }

    public ApplicationHierarchyPopContainer(Context context, lak lakVar, int i, kyu kyuVar) {
        super(context, lakVar, i, kyuVar);
        this.dialogMap = new HashMap();
        this.mPopTrigger = new com.taobao.homepage.pop.view.container.window.b(this, lakVar, kyuVar);
        if (c.a()) {
            setBackgroundColor(Color.parseColor("#3300eedd"));
        }
    }

    @Override // com.taobao.homepage.pop.view.container.BasePopContainer
    public BasePopView createPopView(IPopData iPopData, laj lajVar, View view, IPopAnchorViewInfo iPopAnchorViewInfo, a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopView) ipChange.ipc$dispatch("40c9cec5", new Object[]{this, iPopData, lajVar, view, iPopAnchorViewInfo, aVar, bVar});
        }
        BasePopView createPopView = super.createPopView(iPopData, lajVar, view, iPopAnchorViewInfo, aVar, bVar);
        if (createPopView != null) {
            removeView(createPopView);
            Dialog createDialog = createDialog(createPopView);
            this.dialogMap.put(iPopData.getBusinessID(), createDialog);
            createDialog.show();
        }
        return createPopView;
    }

    @Override // com.taobao.homepage.pop.view.container.BasePopContainer
    public void removePopView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a9cc83", new Object[]{this, str});
            return;
        }
        super.removePopView(str);
        Dialog remove = this.dialogMap.remove(str);
        if (remove == null) {
            return;
        }
        remove.dismiss();
    }

    private Dialog createDialog(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f4b83828", new Object[]{this, view});
        }
        Dialog dialog = new Dialog(getContext(), R.style.Dialog_Status_Container);
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.flags &= -3;
            layoutParams.flags |= 32;
            layoutParams.flags |= 262144;
            window.setAttributes(layoutParams);
        }
        return dialog;
    }
}
