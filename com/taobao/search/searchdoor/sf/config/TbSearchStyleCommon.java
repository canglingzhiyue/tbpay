package com.taobao.search.searchdoor.sf.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.weex_framework.util.i;
import tb.kge;

/* loaded from: classes7.dex */
public class TbSearchStyleCommon {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "lineColor")
    public int lineColor;
    @JSONField(name = "mainBgColor")
    public int mainBgColor;
    @JSONField(name = "mainTextColor")
    public int mainTextColor;
    @JSONField(name = "maskColor")
    public int maskColor;
    @JSONField(name = "moduleRounded")
    public int moduleRounded;
    @JSONField(name = "subBgColor")
    public int subBgColor;
    @JSONField(name = "subTextColor")
    public int subTextColor;
    @JSONField(name = "subTextColorAuxiliary")
    public int subTextColorAuxiliary;
    @JSONField(name = "taobaoColor")
    public int taobaoColor;
    @JSONField(name = "taobaoPaleRedColor")
    public int taobaoPaleRedColor;
    @JSONField(name = "taobaoYellowColor")
    public int taobaoYellowColor;
    @JSONField(name = "tmallColor")
    public int tmallColor;
    @JSONField(name = "tmallPaleRedColor")
    public int tmallPaleRedColor;
    @JSONField(name = "weakTipColor")
    public int weakTipColor;

    static {
        kge.a(1108996400);
    }

    public void setMainBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124aaeb4", new Object[]{this, str});
        } else {
            this.mainBgColor = g.a(str, 0);
        }
    }

    public void setSubBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90edd851", new Object[]{this, str});
        } else {
            this.subBgColor = g.a(str, 0);
        }
    }

    public void setMainTextColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b488178c", new Object[]{this, str});
        } else {
            this.mainTextColor = g.a(str, 0);
        }
    }

    public void setSubTextColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17074de9", new Object[]{this, str});
        } else {
            this.subTextColor = g.a(str, 0);
        }
    }

    public void setSubTextColorAuxiliary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ce3a5f", new Object[]{this, str});
        } else {
            this.subTextColorAuxiliary = g.a(str, 0);
        }
    }

    public void setMaskColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a638a66", new Object[]{this, str});
        } else {
            this.maskColor = g.a(str, 0);
        }
    }

    public void setLineColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76a7c5e", new Object[]{this, str});
        } else {
            this.lineColor = g.a(str, 0);
        }
    }

    public void setWeakTipColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5a75b3", new Object[]{this, str});
        } else {
            this.weakTipColor = g.a(str, 0);
        }
    }

    public void setTaobaoColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc25f64", new Object[]{this, str});
        } else {
            this.taobaoColor = g.a(str, 0);
        }
    }

    public void setTaobaoYellowColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30cb650", new Object[]{this, str});
        } else {
            this.taobaoYellowColor = g.a(str, 0);
        }
    }

    public void setTaobaoPaleRedColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e11c7d", new Object[]{this, str});
        } else {
            this.taobaoPaleRedColor = g.a(str, 0);
        }
    }

    public void setTmallColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5bcc8e", new Object[]{this, str});
        } else {
            this.tmallColor = g.a(str, 0);
        }
    }

    public void setTmallPaleRedColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56346c13", new Object[]{this, str});
        } else {
            this.tmallPaleRedColor = g.a(str, 0);
        }
    }

    public void setModuleRounded(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f52eb0", new Object[]{this, str});
        } else {
            this.moduleRounded = (int) i.a(str);
        }
    }
}
