package com.taobao.android.detail.mainpic.holder;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.f;
import com.taobao.android.detail.mainpic.model.LocatorsModel;
import com.taobao.android.detail.mainpic.widget.LocatorsView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import tb.bny;
import tb.eus;

/* loaded from: classes4.dex */
public class k extends com.alibaba.android.ultron.vfw.viewholder.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String e = "mainpicLocators";
    public LocatorsView f;
    public com.taobao.android.detail.mainpic.g g;

    public static /* synthetic */ IDMComponent a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("c1b4464a", new Object[]{kVar}) : kVar.c;
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e a(final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("c4a647c3", new Object[]{gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new k(bnyVar, com.taobao.android.detail.mainpic.g.this);
            }
        };
    }

    public k(bny bnyVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar);
        this.g = gVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.f = new LocatorsView(viewGroup.getContext());
        return this.f;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(final IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        this.c = iDMComponent;
        JSONArray jSONArray = iDMComponent.getFields().getJSONArray("locators");
        final LocatorsModel locatorsModel = new LocatorsModel();
        locatorsModel.a(jSONArray);
        this.f.setOnLocatorClickListener(new LocatorsView.a() { // from class: com.taobao.android.detail.mainpic.holder.k.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.mainpic.widget.LocatorsView.a
            public void a(LocatorsModel.LocatorItemModel locatorItemModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ee2efe70", new Object[]{this, locatorItemModel});
                } else if (locatorItemModel != null && locatorItemModel.event != null && locatorItemModel.event.size() != 0) {
                    for (int i = 0; i < locatorItemModel.event.size(); i++) {
                        JSONObject jSONObject = locatorItemModel.event.getJSONObject(i);
                        if (jSONObject != null) {
                            com.alibaba.android.ultron.event.base.e a2 = k.this.g.n().d().a().a(jSONObject.getString("type"));
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(iDMComponent);
                            a2.a(new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), arrayList));
                            a2.a(iDMComponent);
                            k.this.g.n().d().a(a2);
                        }
                    }
                }
            }
        });
        this.g.a(new f.a() { // from class: com.taobao.android.detail.mainpic.holder.k.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.mainpic.f.a
            public void a(int i, int i2, IDMComponent iDMComponent2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec53bd8c", new Object[]{this, new Integer(i), new Integer(i2), iDMComponent2});
                } else if (iDMComponent2.getFields() == null) {
                } else {
                    locatorsModel.a(iDMComponent2.getFields().getString("locator"));
                    k.this.f.refreshLocators();
                }
            }
        });
        this.g.a(new f.b() { // from class: com.taobao.android.detail.mainpic.holder.k.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.mainpic.f.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    eus.b(k.a(k.this), k.this.g.n());
                }
            }
        });
        this.f.bindLocators(locatorsModel);
        IDMComponent s = this.g.s();
        if (s == null || s.getFields() == null) {
            return;
        }
        locatorsModel.a(s.getFields().getString("locator"));
        this.f.refreshLocators();
    }
}
