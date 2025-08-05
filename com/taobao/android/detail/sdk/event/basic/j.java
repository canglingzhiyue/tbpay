package com.taobao.android.detail.sdk.event.basic;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.RightsNode;
import java.util.ArrayList;
import java.util.Iterator;
import tb.evl;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class j extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RightsNode.RightItem> f10226a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-1500084014);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20043;
    }

    public j(NodeBundle nodeBundle) {
        if (nodeBundle.consumerRightsNode != null && nodeBundle.consumerRightsNode.rights != null && !TextUtils.isEmpty(nodeBundle.consumerRightsNode.url)) {
            this.f10226a = nodeBundle.consumerRightsNode.rights;
            this.e = nodeBundle.consumerRightsNode.passValue;
            this.f = nodeBundle.consumerRightsNode.url;
            this.g = nodeBundle.consumerRightsNode.type;
            this.d = nodeBundle.consumerRightsNode.root.toJSONString();
        } else {
            this.f10226a = nodeBundle.rightsNode.rights;
            this.d = nodeBundle.rightsNode.params;
            this.b = a();
            this.c = nodeBundle.rightsNode.strength;
            this.e = nodeBundle.rightsNode.passValue;
        }
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenGuaranteeEvent");
    }

    private String a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Iterator<RightsNode.RightItem> it = this.f10226a.iterator();
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
