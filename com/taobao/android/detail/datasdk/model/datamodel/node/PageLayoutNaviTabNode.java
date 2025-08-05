package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class PageLayoutNaviTabNode extends DetailNode {
    public List<PageLayoutNaviTabItemsNode> items;

    static {
        kge.a(-1662468213);
    }

    public PageLayoutNaviTabNode(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.items = epw.a(jSONObject.getJSONArray("items"), new epy<PageLayoutNaviTabItemsNode>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.PageLayoutNaviTabNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.PageLayoutNaviTabItemsNode, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ PageLayoutNaviTabItemsNode b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public PageLayoutNaviTabItemsNode a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (PageLayoutNaviTabItemsNode) ipChange.ipc$dispatch("c1a011c", new Object[]{this, obj}) : new PageLayoutNaviTabItemsNode((JSONObject) obj);
                }
            });
        } catch (Throwable unused) {
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.PageLayoutNaviTabNode");
    }
}
