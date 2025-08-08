package com.taobao.tao.detail.component;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.domain.component.BaseComponent;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class TextComponent extends BaseComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_FENGQIGOU = "fqg";
    public static final String TYPE_MJS = "mjs";
    public String subType;

    static {
        kge.a(-689008032);
    }

    public TextComponent() {
        tpc.a("com.taobao.tao.detail.component.TextComponent");
    }

    public TextComponent addText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextComponent) ipChange.ipc$dispatch("c33cc290", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(this.text)) {
            this.text = str;
        } else {
            this.text += "\n" + str;
        }
        return this;
    }
}
