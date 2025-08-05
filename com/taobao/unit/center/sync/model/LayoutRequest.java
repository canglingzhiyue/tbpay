package com.taobao.unit.center.sync.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.eau;
import tb.kge;
import tb.riy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0019\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J/\u0010\u000e\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/taobao/unit/center/sync/model/LayoutRequest;", "", "groups", "Ljava/util/HashMap;", "", "", "templateId", "(Ljava/util/HashMap;Ljava/lang/String;)V", "getGroups", "()Ljava/util/HashMap;", "getTemplateId", "()Ljava/lang/String;", "component1", "component2", "copy", eau.PARSER_TAG, "", "other", "hashCode", "", "toString", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class LayoutRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final HashMap<String, Long> groups;
    private final String templateId;

    static {
        kge.a(1908638381);
    }

    public LayoutRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ LayoutRequest copy$default(LayoutRequest layoutRequest, HashMap hashMap, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutRequest) ipChange.ipc$dispatch("d14c81e1", new Object[]{layoutRequest, hashMap, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            hashMap = layoutRequest.groups;
        }
        if ((i & 2) != 0) {
            str = layoutRequest.templateId;
        }
        return layoutRequest.copy(hashMap, str);
    }

    public final HashMap<String, Long> component1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("b0eb31fe", new Object[]{this}) : this.groups;
    }

    public final String component2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4803344", new Object[]{this}) : this.templateId;
    }

    public final LayoutRequest copy(HashMap<String, Long> hashMap, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutRequest) ipChange.ipc$dispatch("37b8c9e5", new Object[]{this, hashMap, str}) : new LayoutRequest(hashMap, str);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof LayoutRequest) {
                LayoutRequest layoutRequest = (LayoutRequest) obj;
                if (!q.a(this.groups, layoutRequest.groups) || !q.a((Object) this.templateId, (Object) layoutRequest.templateId)) {
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
        HashMap<String, Long> hashMap = this.groups;
        int hashCode = (hashMap != null ? hashMap.hashCode() : 0) * 31;
        String str = this.templateId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LayoutRequest(groups=" + this.groups + ", templateId=" + this.templateId + riy.BRACKET_END_STR;
    }

    public LayoutRequest(HashMap<String, Long> hashMap, String str) {
        this.groups = hashMap;
        this.templateId = str;
    }

    public /* synthetic */ LayoutRequest(HashMap hashMap, String str, int i, o oVar) {
        this((i & 1) != 0 ? null : hashMap, (i & 2) != 0 ? null : str);
    }

    public final HashMap<String, Long> getGroups() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("24042f74", new Object[]{this}) : this.groups;
    }

    public final String getTemplateId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a67390ae", new Object[]{this}) : this.templateId;
    }
}
