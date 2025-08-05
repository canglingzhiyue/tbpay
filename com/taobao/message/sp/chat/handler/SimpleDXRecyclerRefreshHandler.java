package com.taobao.message.sp.chat.handler;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.support.dinamic.BaseDXRecyclerRefreshHanlder;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleDXRecyclerRefreshHandler extends BaseDXRecyclerRefreshHanlder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1408432601);
    }

    @Override // com.taobao.message.lab.comfrm.support.dinamic.BaseDXRecyclerRefreshHanlder
    public DeltaItem getDeltaItem(Map<String, Object> map, Diff diff, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeltaItem) ipChange.ipc$dispatch("3dddeae8", new Object[]{this, map, diff, map2});
        }
        if (map2 != null) {
            String string = ValueUtil.getString(map2, "instance", null);
            if (!TextUtils.isEmpty(string)) {
                return diff.getRuntimeDiff(string + "_messageViewObjects");
            }
        }
        return diff.getRuntimeDiff("messageViewObjects");
    }

    @Override // com.taobao.message.lab.comfrm.support.dinamic.BaseDXRecyclerRefreshHanlder
    public Object getItem(ResultData<Object> resultData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e37508fb", new Object[]{this, resultData}) : resultData.getMainData();
    }
}
