package com.taobao.mytaobao.newsetting.business.response;

import com.taobao.mytaobao.newsetting.business.model.DynamicSettingItem;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class DynamicSettingPageResult implements IMTOPDataObject {
    public List<List<DynamicSettingItem>> result;

    static {
        kge.a(840725081);
        kge.a(-350052935);
    }

    public List<List<DynamicSettingItem>> getResult() {
        return this.result;
    }

    public void setResult(List<List<DynamicSettingItem>> list) {
        this.result = list;
    }
}
