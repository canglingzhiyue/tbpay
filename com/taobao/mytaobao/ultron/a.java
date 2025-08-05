package com.taobao.mytaobao.ultron;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.f;
import java.util.ArrayList;
import java.util.List;
import tb.bnv;
import tb.kge;
import tb.mwo;
import tb.mwu;
import tb.mxf;

/* loaded from: classes7.dex */
public class a implements d.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private mwo b;

    static {
        kge.a(-864929274);
        kge.a(-312919124);
    }

    public a(mwo mwoVar) {
        this.b = mwoVar;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.d.c
    public void a(List<IDMComponent> list, bnv bnvVar, com.taobao.android.ultron.datamodel.imp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
            return;
        }
        mxf.a(mxf.processMainData);
        if (bVar != null && list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            mwo mwoVar = this.b;
            if (mwoVar != null) {
                mwoVar.a(list);
            }
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    String b = f.b(iDMComponent);
                    if ("footer".equals(b)) {
                        arrayList2.add(iDMComponent);
                    } else if ("header".equals(b)) {
                        arrayList.add(iDMComponent);
                    } else if (iDMComponent != null && TextUtils.equals("orderModule", iDMComponent.getTag())) {
                        mwu.a(iDMComponent, d.b());
                    }
                }
                arrayList3.add(iDMComponent);
            }
            bnvVar.a(arrayList);
            bnvVar.e(arrayList2);
            bnvVar.b(arrayList3);
        }
        mxf.b(mxf.processMainData);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = null;
        }
    }
}
