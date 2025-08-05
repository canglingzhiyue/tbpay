package com.taobao.detail.domain.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class TipDO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> css;
    public String html;
    public String logo;
    public String txt;
    public String url;

    static {
        kge.a(-140405080);
        kge.a(1028243835);
    }

    public static TipDO createImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipDO) ipChange.ipc$dispatch("479a0001", new Object[]{str});
        }
        TipDO tipDO = new TipDO();
        tipDO.logo = str;
        return tipDO;
    }

    public static TipDO createTxt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipDO) ipChange.ipc$dispatch("660d086e", new Object[]{str});
        }
        TipDO tipDO = new TipDO();
        tipDO.txt = str;
        return tipDO;
    }

    public void addCss(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08339bd", new Object[]{this, str, str2});
            return;
        }
        if (this.css == null) {
            this.css = new HashMap();
        }
        this.css.put(str, str2);
    }
}
