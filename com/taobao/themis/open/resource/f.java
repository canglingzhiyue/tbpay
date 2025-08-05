package com.taobao.themis.open.resource;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006R.\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/open/resource/ResourcePool;", "", "()V", "resourceMap", "Ljava/util/HashMap;", "Lcom/taobao/themis/open/resource/PackageInfo;", "Lcom/taobao/themis/open/resource/ResourcePackage;", "Lkotlin/collections/HashMap;", "clearGlobalResource", "", "packageInfo", "getGlobalResource", "getGlobalResourceById", "", "id", "", "putGlobalResource", "resourcePackage", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<PackageInfo, e> f22722a = new HashMap<>();

    static {
        kge.a(-1412600996);
    }

    public final synchronized void a(e resourcePackage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a429d186", new Object[]{this, resourcePackage});
            return;
        }
        q.d(resourcePackage, "resourcePackage");
        this.f22722a.put(resourcePackage.b(), resourcePackage);
    }

    public final synchronized List<e> a(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, id});
        }
        q.d(id, "id");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<PackageInfo, e> entry : this.f22722a.entrySet()) {
            if (q.a((Object) entry.getKey().a(), (Object) id)) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }
}
