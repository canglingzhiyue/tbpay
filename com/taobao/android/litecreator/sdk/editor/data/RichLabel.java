package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import tb.kge;

/* loaded from: classes5.dex */
public class RichLabel extends EditableBean<RichLabel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Goods goods;
    public Label label = new Label();

    static {
        kge.a(131275260);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RichLabel{label=");
        sb.append(this.label.displayName);
        sb.append(", goods=");
        if (this.goods != null) {
            z = true;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
