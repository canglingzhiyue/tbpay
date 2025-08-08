package com.taobao.android.detail.sdk.vmodel.main;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.RightsNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ac extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RightsNode.RightItem> f10408a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-395909741);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30008;
    }

    public ac(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.RightsViewModel");
        if (nodeBundle.consumerRightsNode != null && nodeBundle.consumerRightsNode.rights != null && !StringUtils.isEmpty(nodeBundle.consumerRightsNode.url)) {
            this.f10408a = nodeBundle.consumerRightsNode.rights;
            this.e = nodeBundle.consumerRightsNode.passValue;
            this.f = nodeBundle.consumerRightsNode.url;
            this.g = nodeBundle.consumerRightsNode.type;
            this.d = nodeBundle.consumerRightsNode.root.toJSONString();
            return;
        }
        this.f10408a = nodeBundle.rightsNode.rights;
        this.d = nodeBundle.rightsNode.params;
        this.b = a();
        this.c = nodeBundle.rightsNode.strength;
        this.e = nodeBundle.rightsNode.passValue;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Iterator<RightsNode.RightItem> it = this.f10408a.iterator();
        while (it.hasNext()) {
            RightsNode.RightItem next = it.next();
            int i2 = i + 1;
            if (i != 0) {
                sb.append(",");
            }
            sb.append(next.id);
            i = i2;
        }
        return sb.toString();
    }
}
