package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class b implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1713536369);
        kge.a(842693687);
    }

    @Override // com.alibaba.android.split.g
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : com.android.tools.bundleInfo.b.a().i(str);
    }

    @Override // com.alibaba.android.split.g
    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : com.android.tools.bundleInfo.b.a().h(str);
    }

    @Override // com.alibaba.android.split.g
    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : com.android.tools.bundleInfo.b.a().e(str);
    }

    @Override // com.alibaba.android.split.g
    public String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str}) : com.android.tools.bundleInfo.b.a().f(str);
    }

    @Override // com.alibaba.android.split.g
    public String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str}) : com.android.tools.bundleInfo.b.a().g(str);
    }

    @Override // com.alibaba.android.split.g
    public String f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str}) : com.android.tools.bundleInfo.b.a().j(str);
    }

    @Override // com.alibaba.android.split.g
    public List<String> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("706b078f", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        if (com.android.tools.bundleInfo.b.a().c(str) == null) {
            return arrayList;
        }
        for (String str2 : com.android.tools.bundleInfo.b.a().c(str).dependencies) {
            if (com.android.tools.bundleInfo.b.a().c(str2) != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    @Override // com.alibaba.android.split.g
    public String h(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{this, str}) : com.android.tools.bundleInfo.b.a().k(str);
    }
}
