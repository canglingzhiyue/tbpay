package com.taobao.search.searchdoor.sf.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.i;
import tb.kge;

/* loaded from: classes7.dex */
public class TbSearchStyleCard {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "listImgRounded")
    public float listImgRounded;
    @JSONField(name = "titleBold")
    public boolean titleBold;
    @JSONField(name = "titleTextSize")
    public float titleTextSize;
    @JSONField(name = "wfImgRounded")
    public float wfImgRounded;

    static {
        kge.a(1529630613);
    }

    public void setWfImgRounded(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd03876c", new Object[]{this, str});
        } else {
            this.wfImgRounded = i.a(str);
        }
    }

    public void setListImgRounded(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7b34bb", new Object[]{this, str});
        } else {
            this.listImgRounded = i.a(str);
        }
    }

    public void setTitleTextSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1766ab95", new Object[]{this, str});
        } else {
            this.titleTextSize = i.a(str);
        }
    }

    public void setTitleBold(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d367a552", new Object[]{this, new Boolean(z)});
        } else {
            this.titleBold = z;
        }
    }
}
