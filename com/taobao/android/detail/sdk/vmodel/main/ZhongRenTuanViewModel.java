package com.taobao.android.detail.sdk.vmodel.main;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.io.Serializable;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ZhongRenTuanViewModel extends MainViewModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    public int joinedPerson;
    public String leftButtonBottomText;
    public String leftButtonTopText;
    public int neededPerson;
    public int pageType;
    public String rightButtonBottomText;
    public String rightButtonTopText;

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_ZHONG_REN_TUAN_PROGRESSBAR;
    }

    static {
        kge.a(-2042875365);
        kge.a(1028243835);
        TAG = ZhongRenTuanViewModel.class.getSimpleName();
    }

    public ZhongRenTuanViewModel(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.ZhongRenTuanViewModel");
        if (nodeBundle == null || nodeBundle.root == null) {
            return;
        }
        try {
            JSONObject jSONObject = nodeBundle.root.getJSONObject("vertical").getJSONObject("pinTuan");
            if (jSONObject == null) {
                return;
            }
            this.joinedPerson = jSONObject.getIntValue("joinedPerson");
            this.neededPerson = jSONObject.getIntValue("neededPerson");
            this.pageType = jSONObject.getIntValue("pageType");
            this.leftButtonTopText = jSONObject.getString("leftButtonTopText");
            this.leftButtonBottomText = jSONObject.getString("leftButtonBottomText");
            this.rightButtonTopText = jSONObject.getString("rightButtonTopText");
            this.rightButtonBottomText = jSONObject.getString("rightButtonBottomText");
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.neededPerson > 0;
    }
}
