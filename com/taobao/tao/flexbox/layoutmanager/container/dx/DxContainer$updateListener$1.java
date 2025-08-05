package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rva;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "itemData", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/ItemData;", "isUpdate", "", "strategy", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DxContainer$updateListener$1 extends Lambda implements rva<f, Boolean, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$updateListener$1(a aVar) {
        super(3);
        this.this$0 = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rva
    public /* synthetic */ t invoke(f fVar, Boolean bool, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9f7f9d3f", new Object[]{this, fVar, bool, num});
        }
        invoke(fVar, bool.booleanValue(), num.intValue());
        return t.INSTANCE;
    }

    public final void invoke(f itemData, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99dc750f", new Object[]{this, itemData, new Boolean(z), new Integer(i)});
            return;
        }
        q.d(itemData, "itemData");
        String a2 = itemData.a();
        a aVar = this.this$0;
        if (!q.a((Object) a2, (Object) a.$ipChange)) {
            return;
        }
        if (i == 1) {
            a aVar2 = this.this$0;
            DinamicXEngine dinamicXEngine = a.$ipChange;
            if (dinamicXEngine == null) {
                return;
            }
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = itemData.a();
            dXTemplateItem.b = itemData.b();
            dXTemplateItem.c = itemData.c();
            t tVar = t.INSTANCE;
            dinamicXEngine.a(p.c(dXTemplateItem));
        } else if (i != 2) {
        } else {
            a.a(this.this$0, null);
            a aVar3 = this.this$0;
            int i2 = a.$ipChange;
            a aVar4 = this.this$0;
            int i3 = a.$ipChange;
            String a3 = itemData.a();
            a aVar5 = this.this$0;
            aVar3.a(i2, i3, a3, a.$ipChange, (rva<? super Boolean, ? super DXResult<DXRootView>, ? super DXResult<DXRootView>, t>) null);
        }
    }
}
