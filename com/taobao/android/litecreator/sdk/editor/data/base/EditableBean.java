package com.taobao.android.litecreator.sdk.editor.data.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.l;
import java.io.Serializable;
import java.util.Objects;
import java.util.Observable;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class EditableBean<T> extends Observable implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object extra;
    public String id = l.b();
    public boolean isInDraft;

    static {
        kge.a(946816374);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public static /* synthetic */ Object ipc$super(EditableBean editableBean, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: clone */
    public T mo940clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.id, ((EditableBean) obj).id);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.id);
    }
}
