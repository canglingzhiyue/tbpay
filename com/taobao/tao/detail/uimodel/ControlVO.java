package com.taobao.tao.detail.uimodel;

import com.taobao.wireless.detail.model.vo.BaseControl;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class ControlVO extends BaseControl implements Serializable {
    public boolean isSkill = false;
    public long seckllTime;
    public String time;

    static {
        kge.a(-289504386);
        kge.a(1028243835);
    }

    public ControlVO() {
        tpc.a("com.taobao.tao.detail.uimodel.ControlVO");
    }
}
