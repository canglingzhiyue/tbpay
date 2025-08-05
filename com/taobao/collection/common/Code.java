package com.taobao.collection.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class Code implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -2694892259626406011L;
    private Map<String, String> ext;
    private int moduleToken;

    static {
        kge.a(1730587571);
        kge.a(1028243835);
    }

    public int getModuleToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("769b5eb1", new Object[]{this})).intValue() : this.moduleToken;
    }

    public void setModuleToken(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8111", new Object[]{this, new Integer(i)});
        } else {
            this.moduleToken = i;
        }
    }

    public Map<String, String> getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this}) : this.ext;
    }

    public void setExt(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ccc35f", new Object[]{this, map});
        } else {
            this.ext = map;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Code [moduleToken=" + this.moduleToken + ", ext=" + this.ext + riy.ARRAY_END_STR;
    }
}
