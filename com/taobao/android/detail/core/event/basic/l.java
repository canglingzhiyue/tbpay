package com.taobao.android.detail.core.event.basic;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import java.util.List;
import java.util.Map;
import tb.emu;
import tb.eoc;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class l extends eoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.detail.datasdk.model.datamodel.node.b f9707a;

    static {
        kge.a(-2052926589);
    }

    public l() {
        emu.a("com.taobao.android.detail.core.event.basic.OpenTaxDescEvent");
    }

    public l(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        this.f9707a = bVar;
        emu.a("com.taobao.android.detail.core.event.basic.OpenTaxDescEvent");
    }

    public List<Map<String, List<Pair<String, String>>>> a() {
        VerticalNode g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.f9707a;
        if (bVar != null && (g = eqb.g(bVar)) != null && g.hkNode != null && g.hkNode.taxDesc != null && g.hkNode.taxDesc.size() > 0) {
            return g.hkNode.taxDesc;
        }
        return null;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.f9707a;
        if (bVar == null) {
            return "税费说明";
        }
        String str = eqb.g(bVar).hkNode.taxDescTittle;
        return StringUtils.isEmpty(str) ? "税费说明" : str;
    }
}
