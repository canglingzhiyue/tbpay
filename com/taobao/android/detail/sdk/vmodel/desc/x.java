package com.taobao.android.detail.sdk.vmodel.desc;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.network.size.SizeChartItemModel;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class x extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<SizeChartItemModel> f10398a;
    public String b;

    static {
        kge.a(255393769);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_SIZE_CHART;
    }

    public x(ComponentModel componentModel) {
        super(componentModel);
        this.b = null;
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.SizeChartViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
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
        this.f10398a = com.taobao.android.detail.sdk.utils.c.a(jSONArray, new com.taobao.android.detail.sdk.utils.g<SizeChartItemModel>() { // from class: com.taobao.android.detail.sdk.vmodel.desc.x.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.network.size.SizeChartItemModel] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ SizeChartItemModel b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SizeChartItemModel a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (SizeChartItemModel) ipChange2.ipc$dispatch("f0c9f1d5", new Object[]{this, obj});
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                SizeChartItemModel sizeChartItemModel = new SizeChartItemModel();
                sizeChartItemModel.title = jSONObject2.getString("title");
                sizeChartItemModel.tip = jSONObject2.getString("tip");
                sizeChartItemModel.maxLength = jSONObject2.getInteger(Constants.Name.MAX_LENGTH).intValue();
                sizeChartItemModel.rowData = com.taobao.android.detail.sdk.utils.c.a(jSONObject2.getJSONArray("rowData"), new com.taobao.android.detail.sdk.utils.g<String>() { // from class: com.taobao.android.detail.sdk.vmodel.desc.x.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // com.taobao.android.detail.sdk.utils.g
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
