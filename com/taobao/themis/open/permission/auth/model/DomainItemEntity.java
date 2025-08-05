package com.taobao.themis.open.permission.auth.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b¨\u0006 "}, d2 = {"Lcom/taobao/themis/open/permission/auth/model/DomainItemEntity;", "Ljava/io/Serializable;", "()V", "domainKey", "", "getDomainKey", "()Ljava/lang/String;", "setDomainKey", "(Ljava/lang/String;)V", "domainName", "getDomainName", "setDomainName", "isAuthed", "", "()Z", "isChanged", "setChanged", "(Z)V", "resourceItems", "", "Lcom/taobao/themis/open/permission/auth/model/ResourceItemEntity;", "getResourceItems", "()Ljava/util/List;", "setResourceItems", "(Ljava/util/List;)V", "status", "getStatus", "setStatus", "tipLabel", "getTipLabel", "setTipLabel", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class DomainItemEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TYPE_ACCEPT = "accept";
    public static final String TYPE_REGECT = "reject";
    private String domainKey;
    private String domainName;
    private boolean isChanged;
    private List<ResourceItemEntity> resourceItems;
    private String status;
    private String tipLabel;

    static {
        kge.a(1111790998);
        kge.a(1028243835);
        Companion = new a(null);
    }

    public final String getDomainKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("23f49fd4", new Object[]{this}) : this.domainKey;
    }

    public final void setDomainKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdd168a", new Object[]{this, str});
        } else {
            this.domainKey = str;
        }
    }

    public final String getDomainName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14c9f6b4", new Object[]{this}) : this.domainName;
    }

    public final void setDomainName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5e6742", new Object[]{this, str});
        } else {
            this.domainName = str;
        }
    }

    public final String getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71829d11", new Object[]{this}) : this.status;
    }

    public final void setStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7af285", new Object[]{this, str});
        } else {
            this.status = str;
        }
    }

    public final String getTipLabel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("999ab9ca", new Object[]{this}) : this.tipLabel;
    }

    public final void setTipLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499d9ec", new Object[]{this, str});
        } else {
            this.tipLabel = str;
        }
    }

    public final boolean isChanged() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("497d09b5", new Object[]{this})).booleanValue() : this.isChanged;
    }

    public final void setChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac17a7b", new Object[]{this, new Boolean(z)});
        } else {
            this.isChanged = z;
        }
    }

    public final List<ResourceItemEntity> getResourceItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a56028c4", new Object[]{this}) : this.resourceItems;
    }

    public final void setResourceItems(List<ResourceItemEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5455aa88", new Object[]{this, list});
        } else {
            this.resourceItems = list;
        }
    }

    public final boolean isAuthed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1606261c", new Object[]{this})).booleanValue() : q.a((Object) "accept", (Object) this.status);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/open/permission/auth/model/DomainItemEntity$Companion;", "", "()V", "TYPE_ACCEPT", "", "TYPE_REGECT", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(350158174);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
