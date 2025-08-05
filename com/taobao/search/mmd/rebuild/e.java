package com.taobao.search.mmd.rebuild;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import tb.kge;

/* loaded from: classes7.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_REBUILD_PAGE = "SRP_Rebuild_Page";
    public static final String EXTRA_REBUILD_TAB = "SRP_Rebuild_Tab";
    public static final String EXTRA_REBUILD_TOKEN = "SRP_Rebuild_Record_Token";
    public static final e INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static PageRebuildModelMap<String, d> f19180a;

    static {
        kge.a(-2127129281);
        INSTANCE = new e();
        f19180a = new PageRebuildModelMap<>(0, 1, null);
    }

    private e() {
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return "MainSRP_" + System.currentTimeMillis();
    }

    @JvmStatic
    public static final boolean a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49b27c2", new Object[]{str, dVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (dVar == null) {
            PageRebuildModelMap<String, d> pageRebuildModelMap = f19180a;
            if (pageRebuildModelMap == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            x.i(pageRebuildModelMap).remove(str);
        } else {
            PageRebuildModelMap<String, d> pageRebuildModelMap2 = f19180a;
            if (str == null) {
                q.a();
            }
            pageRebuildModelMap2.put(str, dVar);
        }
        return true;
    }

    @JvmStatic
    public static final d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("9e18ca12", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PageRebuildModelMap<String, d> pageRebuildModelMap = f19180a;
        if (pageRebuildModelMap == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        return (d) x.i(pageRebuildModelMap).remove(str);
    }

    @JvmStatic
    public static final d b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c76d1f53", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PageRebuildModelMap<String, d> pageRebuildModelMap = f19180a;
        if (pageRebuildModelMap == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        return (d) x.i(pageRebuildModelMap).remove(str);
    }
}
