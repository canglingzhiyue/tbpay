package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class Label extends EditableBean<Label> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIRECTION_LEFT = 0;
    public static final int DIRECTION_RIGHT = 1;
    public String displayName;
    public int direction = 0;
    public double posX = mto.a.GEO_NOT_SUPPORT;
    public double posY = mto.a.GEO_NOT_SUPPORT;

    static {
        kge.a(-1691210888);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Label{id='" + this.id + "', displayName='" + this.displayName + "', direction=" + this.direction + ", posX=" + this.posX + ", posY=" + this.posY + '}';
    }
}
