package com.taobao.android.litecreator.sdk.editor.data;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class Template extends EditableBean<Template> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String tid;

    static {
        kge.a(2035589494);
    }

    public static /* synthetic */ Object ipc$super(Template template, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 1403628309) {
            if (hashCode != 2025021518) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.mo940clone();
        }
        return new Integer(super.hashCode());
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
        if (obj instanceof Template) {
            return StringUtils.equals(this.tid, ((Template) obj).tid);
        }
        return false;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(super.hashCode()), this.tid);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    /* renamed from: clone */
    public Template mo940clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("5cb122df", new Object[]{this}) : (Template) super.mo940clone();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Template{tid='" + this.tid + "'}";
    }
}
