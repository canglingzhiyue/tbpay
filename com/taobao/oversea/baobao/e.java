package com.taobao.oversea.baobao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aej;
import tb.aek;
import tb.ael;

/* loaded from: classes7.dex */
public class e implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        if (i != 3005 || objArr == null) {
            return null;
        }
        try {
            if (objArr[0] == null || (parseObject = JSON.parseObject(objArr[0].toString())) == null || !"sceneCartRefresh".equals(parseObject.getString("event"))) {
                return null;
            }
            BaobaoManager a2 = BaobaoManager.a();
            if (parseObject.getJSONObject("param") != null && "checkClick.cartSelect".equals(parseObject.getJSONObject("param").getString("operatorEvent"))) {
                z = false;
            }
            a2.a(false, z);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
