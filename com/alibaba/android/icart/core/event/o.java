package com.alibaba.android.icart.core.event;

import android.graphics.drawable.ColorDrawable;
import mtopsdk.common.util.StringUtils;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.alibaba.android.icart.core.groupcharge.ui.a;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.bbz;
import tb.bca;
import tb.bdx;
import tb.bex;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class o extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(807702529);
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        com.alibaba.android.icart.core.groupcharge.b bVar = (com.alibaba.android.icart.core.groupcharge.b) bmzVar.b(com.alibaba.android.icart.core.groupcharge.b.TAG);
        if (bVar == null || bVar.b() == null || bVar.b().isEmpty()) {
            return;
        }
        a(new com.alibaba.android.icart.core.groupcharge.ui.a(this.f25791a, bVar, this.h));
        c(bmzVar);
    }

    private void c(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0e5feb", new Object[]{this, bmzVar});
        } else if (bmzVar != null) {
            List<IDMComponent> list = (List) bmzVar.e();
            com.alibaba.android.icart.core.groupcharge.b bVar = (com.alibaba.android.icart.core.groupcharge.b) bmzVar.b(com.alibaba.android.icart.core.groupcharge.b.TAG);
            if (list == null || bVar == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent.getFields() != null) {
                    String string = iDMComponent.getFields().getString("bizCode");
                    if (!StringUtils.isEmpty(string) && !arrayList.contains(string)) {
                        arrayList.add(string);
                        sb.append(string);
                        sb.append(",");
                    }
                }
            }
            String string2 = (bmzVar.c() == null || bmzVar.c().getFields() == null) ? "" : bmzVar.c().getFields().getString("isChecked");
            bbz bbzVar = this.f25791a;
            bex.a(bbzVar, "Page_ShoppingCart_Button-Pay", "shopCount=" + a(bVar), "selectedBizCode=" + sb.toString(), "isSelectAll=" + string2);
            bbz bbzVar2 = this.f25791a;
            bex.a(bbzVar2, "Page_ShoppingCart_GroupSubmit", "isSelectAll=" + string2, "groupsize=" + bVar.b().size(), "shopCount=" + a(bVar), "selectedBizCode=" + sb.toString(), "quantity=" + bmzVar.c().getFields().getString("quantity"));
        }
    }

    public int a(com.alibaba.android.icart.core.groupcharge.b bVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef22054d", new Object[]{this, bVar})).intValue();
        }
        if (bVar != null && bVar.b() != null) {
            for (com.alibaba.android.icart.core.groupcharge.a aVar : bVar.b()) {
                if (aVar.c() != null) {
                    i += aVar.c().size();
                }
            }
        }
        return i;
    }

    public void a(com.alibaba.android.icart.core.groupcharge.ui.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fc86ae", new Object[]{this, aVar});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.e);
        frameLayout.addView(aVar.a(), new FrameLayout.LayoutParams(-1, -1, 80));
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
        final PopupWindow popupWindow = new PopupWindow(this.e);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-1);
        popupWindow.setSoftInputMode(16);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setContentView(frameLayout);
        popupWindow.showAtLocation(frameLayout, 48, 0, 0);
        aVar.b();
        aVar.a(new a.InterfaceC0079a() { // from class: com.alibaba.android.icart.core.event.o.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.icart.core.groupcharge.ui.a.InterfaceC0079a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    popupWindow.dismiss();
                }
            }
        });
        UmbrellaTracker.traceProcessEnd("clickSubmitError", "submit", "1.0");
    }
}
