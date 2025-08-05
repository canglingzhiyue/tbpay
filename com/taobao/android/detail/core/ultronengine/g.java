package com.taobao.android.detail.core.ultronengine;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.bnv;
import tb.dya;
import tb.emu;
import tb.fpz;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1057650425);
        emu.a("com.taobao.android.detail.core.ultronengine.UltronEngineUtils");
    }

    public static e a(DetailRecyclerView detailRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c6d614b5", new Object[]{detailRecyclerView, new Integer(i)});
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = detailRecyclerView.findViewHolderForAdapterPosition(i);
        if (!(findViewHolderForAdapterPosition instanceof com.alibaba.android.ultron.vfw.viewholder.h)) {
            return null;
        }
        com.alibaba.android.ultron.vfw.viewholder.b b = ((com.alibaba.android.ultron.vfw.viewholder.h) findViewHolderForAdapterPosition).b();
        if (!(b instanceof e)) {
            return null;
        }
        return (e) b;
    }

    public static IDMComponent a(f fVar, int i) {
        bnv k;
        List<IDMComponent> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("93f3e720", new Object[]{fVar, new Integer(i)});
        }
        com.alibaba.android.ultron.vfw.instance.d c = fVar.c();
        if (c != null && (k = c.k()) != null && (f = k.f()) != null && i >= 0 && i < f.size()) {
            return f.get(i);
        }
        return null;
    }

    private static com.alibaba.android.ultron.vfw.instance.d a(Context context) {
        dya y;
        f f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("9824ff85", new Object[]{context});
        }
        Activity c = fpz.c(context);
        if ((c instanceof DetailCoreActivity) && (y = ((DetailCoreActivity) c).y()) != null && (f = y.f()) != null) {
            return f.c();
        }
        return null;
    }

    public static void a(Context context, ActionModel actionModel, com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        List arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629afaf9", new Object[]{context, actionModel, bVar});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d a2 = a(context);
        if (a2 == null) {
            return;
        }
        com.alibaba.android.ultron.event.base.f d = a2.d();
        com.alibaba.android.ultron.event.base.e a3 = d.a();
        a3.a(actionModel.type);
        if (bVar != null) {
            arrayList = Collections.singletonList(bVar.dmComponent);
        } else {
            arrayList = new ArrayList();
        }
        a3.a(new DMEvent(actionModel.type, actionModel.params, arrayList));
        h.a(actionModel.type);
        d.a(a3);
    }
}
