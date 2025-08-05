package com.taobao.themis.open.permission.check;

import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getPermissionInfo", "Lcom/taobao/themis/open/permission/check/ApiPermissionInfo;", "Lcom/taobao/themis/kernel/TMSInstance;", "themis_open_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1116844435);
    }

    public static final a a(f getPermissionInfo) {
        PermissionModel k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("689876d5", new Object[]{getPermissionInfo});
        }
        q.d(getPermissionInfo, "$this$getPermissionInfo");
        a aVar = (a) getPermissionInfo.a(a.class);
        if (aVar != null) {
            return aVar;
        }
        TMSMetaInfoWrapper v = getPermissionInfo.v();
        if (v == null || (k = v.k()) == null) {
            return null;
        }
        a a2 = b.INSTANCE.a(k);
        getPermissionInfo.a((Class<Class>) a.class, (Class) a2);
        return a2;
    }
}
