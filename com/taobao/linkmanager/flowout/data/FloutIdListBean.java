package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class FloutIdListBean implements Serializable {
    @JSONField(name = "floutId")
    public String floutId;
    @JSONField(name = Constants.KEY_PACKAGE_NAMES)
    public String[] packageNames;
    @JSONField(name = "scene")
    public String scene;
    @JSONField(name = "validDate")
    public int validDate = -1;

    static {
        kge.a(1696410282);
        kge.a(1028243835);
    }
}
