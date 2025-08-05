package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MeiLiHuiNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final short AVAILABLE = 1;
    public long endTime;
    public long startTime;
    public int status;
    public ArrayList<String> tags;

    static {
        kge.a(-307761609);
    }

    public MeiLiHuiNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.MeiLiHuiNode");
        Long l = jSONObject.getLong("startTime");
        if (l != null) {
            this.startTime = l.longValue();
        }
        Long l2 = jSONObject.getLong("endTime");
        if (l2 != null) {
            this.endTime = l2.longValue();
        }
        Integer integer = jSONObject.getInteger("status");
        if (integer != null) {
            this.status = integer.intValue();
        }
        this.tags = initTags();
    }

    private ArrayList<String> initTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("4806d92a", new Object[]{this}) : c.a(this.root.getJSONArray("tags"), new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.MeiLiHuiNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
    }
}
