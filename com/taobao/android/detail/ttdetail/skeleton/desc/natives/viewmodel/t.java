package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class t extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<SizeChartItemModel> f10893a;
    public String b;

    static {
        kge.a(1208709332);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public t(ComponentModel componentModel) {
        super(componentModel);
        this.b = null;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("columnData");
        if (jSONArray == null) {
            return;
        }
        this.b = jSONObject.getString("tableTitle");
        this.f10893a = com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.i.a(jSONArray, new com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k<SizeChartItemModel>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.t.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel] */
            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
            public /* synthetic */ SizeChartItemModel b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SizeChartItemModel a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (SizeChartItemModel) ipChange2.ipc$dispatch("bc526ade", new Object[]{this, obj});
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                SizeChartItemModel sizeChartItemModel = new SizeChartItemModel();
                sizeChartItemModel.title = jSONObject2.getString("title");
                sizeChartItemModel.tip = jSONObject2.getString("tip");
                sizeChartItemModel.maxLength = jSONObject2.getInteger(Constants.Name.MAX_LENGTH).intValue();
                sizeChartItemModel.rowData = com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.i.a(jSONObject2.getJSONArray("rowData"), new com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k<String>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.t.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
                    public /* synthetic */ String b(Object obj2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("eeb6464d", new Object[]{this, obj2}) : a(obj2);
                    }

                    public String a(Object obj2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("8a5b32dc", new Object[]{this, obj2}) : (String) obj2;
                    }
                });
                return sizeChartItemModel;
            }
        });
    }
}
