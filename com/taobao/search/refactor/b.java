package com.taobao.search.refactor;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.c;
import tb.hti;
import tb.itk;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends hti {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1679252389);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -447801757) {
            return super.a((String) objArr[0], (View) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Number) objArr[3]).intValue());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.hti, tb.htc
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a a(String type, View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("e54f1663", new Object[]{this, type, view, new Boolean(z), new Integer(i)});
        }
        kotlin.jvm.internal.q.c(type, "type");
        kotlin.jvm.internal.q.c(view, "view");
        com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a a2 = super.a(type, view, z, i);
        if (a2 != null) {
            return a2;
        }
        int hashCode = type.hashCode();
        if (hashCode == -868071810) {
            if (!type.equals("topBar")) {
                return null;
            }
            return new com.taobao.android.searchbaseframe.meta.uikit.header.behavior.b(view, new com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d(3000, 1000, 2000));
        } else if (hashCode == -554140606) {
            if (!type.equals("topHeader")) {
                return null;
            }
            return new c(view, z, i, new com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d(1000, 1001, 1000));
        } else if (hashCode != 2063271543 || !type.equals(itk.TYPE_HALF_STICKY_SEARCHBAR)) {
            return null;
        } else {
            return new HalfStickySearchBarBehavior(view, z, i);
        }
    }
}
