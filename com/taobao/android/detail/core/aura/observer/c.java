package com.taobao.android.detail.core.aura.observer;

import android.content.Context;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.bbg;
import tb.dxu;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public dxu b;
    public Context c;
    public AURAGlobalData d;

    static {
        kge.a(-1610438013);
    }

    public c(Context context, dxu dxuVar) {
        this.c = context;
        this.b = dxuVar;
        emu.a("com.taobao.android.detail.core.aura.observer.BaseComponentUpdate");
    }

    public void a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed894fe", new Object[]{this, aURAGlobalData});
        } else {
            this.d = aURAGlobalData;
        }
    }

    public List a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData != null) {
            return (List) aURAGlobalData.get("render_view_item_models", List.class);
        }
        return null;
    }

    public AURARenderComponent a(List<String> list, List list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("96cfa35", new Object[]{this, list, list2});
        }
        if (list2 == null) {
            return null;
        }
        for (Object obj : list2) {
            if (obj instanceof AURARenderComponent) {
                AURARenderComponent aURARenderComponent = (AURARenderComponent) obj;
                if (g.a(aURARenderComponent.key, list)) {
                    return aURARenderComponent;
                }
            }
        }
        return null;
    }

    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else if (aURARenderComponent == null) {
        } else {
            UMFRuleIO uMFRuleIO = new UMFRuleIO(Arrays.asList(bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, new HashMap())));
            dxu dxuVar = this.b;
            if (dxuVar == null) {
                return;
            }
            dxuVar.a(uMFRuleIO);
        }
    }

    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (AURARenderComponent aURARenderComponent : list) {
                arrayList.add(bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, new HashMap()));
            }
            UMFRuleIO uMFRuleIO = new UMFRuleIO(arrayList);
            dxu dxuVar = this.b;
            if (dxuVar == null) {
                return;
            }
            dxuVar.a(uMFRuleIO);
        }
    }
}
