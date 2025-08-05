package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class Sticker extends EditableBean<Sticker> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String groupId;
    public String name;
    public String path;
    public String resId;

    static {
        kge.a(711894209);
    }

    public static /* synthetic */ Object ipc$super(Sticker sticker, String str, Object... objArr) {
        if (str.hashCode() == 1403628309) {
            return new Integer(super.hashCode());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
        if (!(obj instanceof Sticker)) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        return Objects.equals(this.name, sticker.name) && Objects.equals(this.path, sticker.path) && Objects.equals(this.resId, sticker.resId) && Objects.equals(this.groupId, sticker.groupId);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(super.hashCode()), this.name, this.path, this.resId, this.groupId);
    }
}
