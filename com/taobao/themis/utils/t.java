package com.taobao.themis.utils;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.Result;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"isPositiveInt", "", "value", "", "themis_utils_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1898524523);
    }

    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            Result.a aVar = Result.Companion;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (Integer.parseInt(str) > 0) {
            return true;
        }
        Result.m2371constructorimpl(kotlin.t.INSTANCE);
        return false;
    }
}
