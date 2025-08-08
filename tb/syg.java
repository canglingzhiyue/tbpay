package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes7.dex */
public abstract class syg extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(765015305);
    }

    public static /* synthetic */ Object ipc$super(syg sygVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(ljs ljsVar, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r9, java.lang.Object[] r10, com.taobao.android.dinamicx.DXRuntimeContext r11) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.syg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            r1[r3] = r10
            r9 = 3
            r1[r9] = r11
            java.lang.String r9 = "f9db7b67"
            r0.ipc$dispatch(r9, r1)
            return
        L1b:
            if (r10 != 0) goto L1e
            return
        L1e:
            com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel r9 = tb.lfq.b(r11)
            com.taobao.android.dinamicx.DXRootView r4 = r11.s()
            com.taobao.android.dinamicx.ba r0 = r11.b()
            boolean r0 = r8.a(r9, r4, r0)
            if (r0 != 0) goto L31
            return
        L31:
            int r0 = r10.length
            r1 = 0
            if (r0 <= 0) goto L46
            r0 = r10[r2]
            boolean r0 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto L46
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel r0 = new com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel
            r2 = r10[r2]
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            r0.<init>(r2)
            r6 = r0
            goto L47
        L46:
            r6 = r1
        L47:
            int r0 = r10.length
            if (r0 <= r3) goto L6e
            r0 = r10[r3]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L6e
            r10 = r10[r3]
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.StringUtils.isEmpty(r10)
            if (r0 != 0) goto L6e
            com.taobao.android.dinamicx.widget.DXWidgetNode r0 = r4.getExpandWidgetNode()
            com.taobao.android.dinamicx.widget.DXWidgetNode r10 = r0.queryWidgetNodeByUserId(r10)
            if (r10 == 0) goto L6e
            com.taobao.android.dinamicx.DXRuntimeContext r10 = r10.getDXRuntimeContext()
            android.view.View r10 = r10.v()
            r7 = r10
            goto L6f
        L6e:
            r7 = r1
        L6f:
            tb.ljs r3 = tb.lfq.a(r11)
            if (r3 != 0) goto L76
            return
        L76:
            r2 = r8
            r5 = r9
            r2.a(r3, r4, r5, r6, r7)
            tb.liw.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.syg.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    private boolean a(BaseSectionModel baseSectionModel, View view, ba baVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa7f4f43", new Object[]{this, baseSectionModel, view, baVar})).booleanValue() : (baseSectionModel == null || view == null || !(baVar instanceof InfoFlowDxUserContext) || ((InfoFlowDxUserContext) baVar).getInfoFlowContext() == null) ? false : true;
    }
}
