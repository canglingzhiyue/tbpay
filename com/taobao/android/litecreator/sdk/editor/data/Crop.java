package com.taobao.android.litecreator.sdk.editor.data;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import tb.kge;

/* loaded from: classes5.dex */
public class Crop extends EditableBean<Crop> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int aspectRadioIndex;
    public String aspectRadioType;
    public Rect rect;
    public Transform transform = new Transform();
    public boolean isAutoCrop = false;

    static {
        kge.a(1469214092);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Crop{rect=" + this.rect + ", transform=" + this.transform + ", isAutoCrop=" + this.isAutoCrop + ", aspectRadioType='" + this.aspectRadioType + "', aspectRadioIndex=" + this.aspectRadioIndex + '}';
    }
}
