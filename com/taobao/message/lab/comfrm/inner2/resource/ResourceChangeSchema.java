package com.taobao.message.lab.comfrm.inner2.resource;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.eau;
import tb.kge;
import tb.riy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/ResourceChangeSchema;", "", "mode", "", "changedFileNameList", "", "", "providerPriority", "(ILjava/util/List;I)V", "getChangedFileNameList", "()Ljava/util/List;", "setChangedFileNameList", "(Ljava/util/List;)V", "getMode", "()I", "setMode", "(I)V", "getProviderPriority", "setProviderPriority", "component1", "component2", "component3", "copy", eau.PARSER_TAG, "", "other", "hashCode", "toString", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ResourceChangeSchema {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> changedFileNameList;
    private int mode;
    private int providerPriority;

    static {
        kge.a(-1964105857);
    }

    public static /* synthetic */ ResourceChangeSchema copy$default(ResourceChangeSchema resourceChangeSchema, int i, List list, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceChangeSchema) ipChange.ipc$dispatch("dbde301f", new Object[]{resourceChangeSchema, new Integer(i), list, new Integer(i2), new Integer(i3), obj});
        }
        if ((i3 & 1) != 0) {
            i = resourceChangeSchema.mode;
        }
        if ((i3 & 2) != 0) {
            list = resourceChangeSchema.changedFileNameList;
        }
        if ((i3 & 4) != 0) {
            i2 = resourceChangeSchema.providerPriority;
        }
        return resourceChangeSchema.copy(i, list, i2);
    }

    public final int component1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f047d4e", new Object[]{this})).intValue() : this.mode;
    }

    public final List<String> component2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d8d369eb", new Object[]{this}) : this.changedFileNameList;
    }

    public final int component3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f20ac50", new Object[]{this})).intValue() : this.providerPriority;
    }

    public final ResourceChangeSchema copy(int i, List<String> list, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResourceChangeSchema) ipChange.ipc$dispatch("1938eafb", new Object[]{this, new Integer(i), list, new Integer(i2)}) : new ResourceChangeSchema(i, list, i2);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ResourceChangeSchema) {
                ResourceChangeSchema resourceChangeSchema = (ResourceChangeSchema) obj;
                if (this.mode != resourceChangeSchema.mode || !q.a(this.changedFileNameList, resourceChangeSchema.changedFileNameList) || this.providerPriority != resourceChangeSchema.providerPriority) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.mode * 31;
        List<String> list = this.changedFileNameList;
        if (list != null) {
            i = list.hashCode();
        }
        return ((i2 + i) * 31) + this.providerPriority;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ResourceChangeSchema(mode=" + this.mode + ", changedFileNameList=" + this.changedFileNameList + ", providerPriority=" + this.providerPriority + riy.BRACKET_END_STR;
    }

    public ResourceChangeSchema(int i, List<String> list, int i2) {
        this.mode = i;
        this.changedFileNameList = list;
        this.providerPriority = i2;
    }

    public /* synthetic */ ResourceChangeSchema(int i, List list, int i2, int i3, o oVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : list, i2);
    }

    public final List<String> getChangedFileNameList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e7f48cfd", new Object[]{this}) : this.changedFileNameList;
    }

    public final int getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue() : this.mode;
    }

    public final int getProviderPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e7f54125", new Object[]{this})).intValue() : this.providerPriority;
    }

    public final void setChangedFileNameList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a15a66f", new Object[]{this, list});
        } else {
            this.changedFileNameList = list;
        }
    }

    public final void setMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b0557", new Object[]{this, new Integer(i)});
        } else {
            this.mode = i;
        }
    }

    public final void setProviderPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c60a85", new Object[]{this, new Integer(i)});
        } else {
            this.providerPriority = i;
        }
    }
}
