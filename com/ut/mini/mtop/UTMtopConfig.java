package com.ut.mini.mtop;

import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.loc.at;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class UTMtopConfig implements Serializable {
    @JSONField(name = at.k)
    public String key;
    @JSONField(name = MediaConstant.DEFINITION_MD)
    public String method;
    @JSONField(name = "n")
    public String name;
    @JSONField(name = com.taobao.android.msoa.c.TAG)
    public List<UTMtopPageValue> pageValueList;
    @JSONField(name = BaseFBPlugin.VERIFY_TYPE.sp)
    public String separator;
    @JSONField(name = "t")
    public List<Integer> targetList;

    static {
        kge.a(-1585634630);
        kge.a(1028243835);
    }
}
