package com.taobao.themis.open.permission.auth.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/taobao/themis/open/permission/auth/model/ScopeEntity;", "Ljava/io/Serializable;", "()V", "authRange", "", "getAuthRange", "()Ljava/lang/String;", "setAuthRange", "(Ljava/lang/String;)V", SimpleProfile.KEY_DISPLAYNAME, "getDisplayName", "setDisplayName", "isChanged", "", "()Z", "setChanged", "(Z)V", Constants.Name.SCOPE, "getScope", "setScope", "status", "getStatus", "setStatus", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class ScopeEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String authRange;
    private String displayName;
    private boolean isChanged;
    private String scope;
    private boolean status;

    static {
        kge.a(-1160688389);
        kge.a(1028243835);
    }

    public final String getScope() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6e9f91b", new Object[]{this}) : this.scope;
    }

    public final void setScope(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32dc023", new Object[]{this, str});
        } else {
            this.scope = str;
        }
    }

    public final boolean getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcf6c373", new Object[]{this})).booleanValue() : this.status;
    }

    public final void setStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847d0b9", new Object[]{this, new Boolean(z)});
        } else {
            this.status = z;
        }
    }

    public final String getAuthRange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5e9669a", new Object[]{this}) : this.authRange;
    }

    public final void setAuthRange(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59812884", new Object[]{this, str});
        } else {
            this.authRange = str;
        }
    }

    public final String getDisplayName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9684a22", new Object[]{this}) : this.displayName;
    }

    public final void setDisplayName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5828fc", new Object[]{this, str});
        } else {
            this.displayName = str;
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
}
