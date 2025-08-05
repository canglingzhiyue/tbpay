package com.taobao.search.jarvis.bean;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class DynamicCardBean implements Serializable {
    public boolean firstRender = true;
    public BaseCellBean mDynamicCellBean;
    public JSONObject mOriginData;
    public Map<String, TemplateBean> mTemplates;
    public String style;

    static {
        kge.a(1739540726);
        kge.a(1028243835);
    }
}
