package com.taobao.themis.kernel.utils;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/taobao/themis/kernel/utils/PatternUtils;", "", "()V", "sPatternCache", "Landroid/util/LruCache;", "", "Ljava/util/regex/Pattern;", com.taobao.android.weex_framework.util.a.ATOM_EXT_compile, "patternStr", "matchRegex", "", "regex", "input", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final LruCache<String, Pattern> f22571a;

    static {
        kge.a(1008625787);
        INSTANCE = new h();
        f22571a = new LruCache<>(20);
    }

    private h() {
    }

    public final Pattern a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pattern) ipChange.ipc$dispatch("18afdfb", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        Pattern pattern = f22571a.get(str);
        if (pattern != null) {
            return pattern;
        }
        try {
            Pattern compile = Pattern.compile(str);
            f22571a.put(str, compile);
            return compile;
        } catch (PatternSyntaxException e) {
            TMSLogger.b("PatternUtils", "pattern " + str + " compile error!", e);
            return null;
        }
    }
}
