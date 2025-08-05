package com.taobao.unit.center.sync.model;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.eau;
import tb.kge;
import tb.riy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/taobao/unit/center/sync/model/TemplateRequest;", "", "pageSize", "", "templateId", "", "(JLjava/lang/Integer;)V", "getPageSize", "()J", "getTemplateId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(JLjava/lang/Integer;)Lcom/taobao/unit/center/sync/model/TemplateRequest;", eau.PARSER_TAG, "", "other", "hashCode", "toString", "", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class TemplateRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long pageSize;
    private final Integer templateId;

    static {
        kge.a(266440029);
    }

    public static /* synthetic */ TemplateRequest copy$default(TemplateRequest templateRequest, long j, Integer num, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateRequest) ipChange.ipc$dispatch("b58ce795", new Object[]{templateRequest, new Long(j), num, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            j = templateRequest.pageSize;
        }
        if ((i & 2) != 0) {
            num = templateRequest.templateId;
        }
        return templateRequest.copy(j, num);
    }

    public final long component1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f047d4f", new Object[]{this})).longValue() : this.pageSize;
    }

    public final Integer component2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("42833503", new Object[]{this}) : this.templateId;
    }

    public final TemplateRequest copy(long j, Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateRequest) ipChange.ipc$dispatch("40efabe3", new Object[]{this, new Long(j), num}) : new TemplateRequest(j, num);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof TemplateRequest) {
                TemplateRequest templateRequest = (TemplateRequest) obj;
                if (!(this.pageSize == templateRequest.pageSize) || !q.a(this.templateId, templateRequest.templateId)) {
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
        long j = this.pageSize;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        Integer num = this.templateId;
        if (num != null) {
            i = num.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TemplateRequest(pageSize=" + this.pageSize + ", templateId=" + this.templateId + riy.BRACKET_END_STR;
    }

    public TemplateRequest(long j, Integer num) {
        this.pageSize = j;
        this.templateId = num;
    }

    public /* synthetic */ TemplateRequest(long j, Integer num, int i, o oVar) {
        this(j, (i & 2) != 0 ? 0 : num);
    }

    public final long getPageSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2822d621", new Object[]{this})).longValue() : this.pageSize;
    }

    public final Integer getTemplateId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("defb84d9", new Object[]{this}) : this.templateId;
    }
}
