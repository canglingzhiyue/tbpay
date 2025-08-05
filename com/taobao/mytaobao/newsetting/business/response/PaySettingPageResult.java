package com.taobao.mytaobao.newsetting.business.response;

import com.taobao.mytaobao.newsetting.business.model.PaySettingItem;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class PaySettingPageResult implements IMTOPDataObject {
    public List<PaySettingItem> result;

    static {
        kge.a(1285926672);
        kge.a(-350052935);
    }

    public List<PaySettingItem> getResult() {
        return this.result;
    }

    public void setResult(List<PaySettingItem> list) {
        this.result = list;
    }
}
