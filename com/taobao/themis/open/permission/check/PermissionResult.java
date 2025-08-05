package com.taobao.themis.open.permission.check;

import com.taobao.message.sp.framework.model.SimpleProfile;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0012¢\u0006\u0002\u0010\u0002B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/taobao/themis/open/permission/check/PermissionResult;", "", "(Ljava/lang/String;I)V", SimpleProfile.KEY_SIGNATURE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "hasSignature", "", "isSuccess", "()Z", "<set-?>", "getSignature", "()Ljava/lang/String;", "IGNORE", "ALLOW", "DENY", "DENY_N22101", "DENY_N22102", "DENY_N22103", "DENY_N22104", "DENY_N22105", "DENY_N22106", "DENY_N22107", "DENY_N22108", "DENY_N22109", "DENY_N22110", "DENY_N22111", "DENY_N22201", "DENY_N22202", "DENY_N22203", "DENY_N22204", "DENY_N22205", "DENY_N22206", "DENY_N22207", "DENY_N22208", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public enum PermissionResult {
    IGNORE,
    ALLOW,
    DENY,
    DENY_N22101("N22101"),
    DENY_N22102("N22102"),
    DENY_N22103("N22103"),
    DENY_N22104("N22104"),
    DENY_N22105("N22105"),
    DENY_N22106("N22106"),
    DENY_N22107("N22107"),
    DENY_N22108("N22108"),
    DENY_N22109("N22109"),
    DENY_N22110("N22110"),
    DENY_N22111("N22111"),
    DENY_N22201("N22201"),
    DENY_N22202("N22202"),
    DENY_N22203("N22203"),
    DENY_N22204("N22204"),
    DENY_N22205("N22205"),
    DENY_N22206("N22206"),
    DENY_N22207("N22207"),
    DENY_N22208("N22208");
    
    private boolean hasSignature;
    private String signature;

    PermissionResult(String str) {
        this.signature = str;
        this.hasSignature = true;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final boolean hasSignature() {
        return this.hasSignature;
    }

    public final boolean isSuccess() {
        PermissionResult permissionResult = this;
        return IGNORE == permissionResult || ALLOW == permissionResult;
    }
}
