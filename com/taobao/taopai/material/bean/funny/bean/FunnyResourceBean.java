package com.taobao.taopai.material.bean.funny.bean;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class FunnyResourceBean implements Serializable {
    public FunnyAudioBean audio;
    @JSONField(name = "decors")
    public List<FunnyDecorationBean> decorators;
    public FunnyFilterBean filter;

    static {
        kge.a(522061867);
        kge.a(1028243835);
    }
}
