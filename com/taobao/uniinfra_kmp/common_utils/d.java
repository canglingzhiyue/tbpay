package com.taobao.uniinfra_kmp.common_utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuContext;", "", "<init>", "()V", "objectsHold", "", "", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "addObject", "obj", "queryObject", "uuid", "releaseObject", "common_utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, c> f23369a;

    private d() {
    }

    static {
        kge.a(1846501094);
        INSTANCE = new d();
        f23369a = new LinkedHashMap();
    }

    public final String a(c obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5aeae127", new Object[]{this, obj});
        }
        q.d(obj, "obj");
        String a2 = e.a();
        if (f23369a.values().contains(obj)) {
            return null;
        }
        f23369a.put(a2, obj);
        return a2;
    }

    public final c a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1e7b015", new Object[]{this, str}) : f23369a.remove(str);
    }
}
