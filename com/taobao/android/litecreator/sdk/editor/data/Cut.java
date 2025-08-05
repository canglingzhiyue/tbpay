package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class Cut extends EditableBean<Cut> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Canvas canvas;
    public long endTime;
    public long startTime;

    static {
        kge.a(740130758);
    }

    public static /* synthetic */ Object ipc$super(Cut cut, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 1403628309) {
            if (hashCode != 2025021518) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.mo940clone();
        }
        return new Integer(super.hashCode());
    }

    public long getDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue() : this.endTime - this.startTime;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Cut{startTime=" + this.startTime + ", endTime=" + this.endTime + ", canvas=" + this.canvas + '}';
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cut)) {
            return false;
        }
        Cut cut = (Cut) obj;
        return this.startTime == cut.startTime && this.endTime == cut.endTime && Objects.equals(this.canvas, cut.canvas);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(super.hashCode()), Long.valueOf(this.startTime), Long.valueOf(this.endTime), this.canvas);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    /* renamed from: clone */
    public Cut mo940clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cut) ipChange.ipc$dispatch("2ebb739b", new Object[]{this});
        }
        Cut cut = (Cut) super.mo940clone();
        cut.startTime = this.startTime;
        cut.endTime = this.endTime;
        Canvas canvas = this.canvas;
        if (canvas != null) {
            cut.canvas = canvas.mo940clone();
        }
        return cut;
    }
}
