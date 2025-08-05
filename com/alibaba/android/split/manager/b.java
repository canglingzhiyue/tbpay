package com.alibaba.android.split.manager;

import android.content.Context;
import com.alibaba.android.split.manager.IPluginContext;
import com.alibaba.android.split.q;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import tb.bgy;

/* loaded from: classes.dex */
public interface b<C extends IPluginContext> {
    void a(Context context, Collection<File> collection) throws Exception;

    void a(String str, IPluginContext.Status status);

    void a(bgy bgyVar);

    boolean a(Context context, ClassLoader classLoader) throws Exception;

    boolean a(Context context, String str);

    boolean a(q qVar);

    boolean a(ClassLoader classLoader, q qVar, boolean z, boolean z2) throws IOException;

    boolean a(ClassLoader classLoader, boolean z, boolean z2, boolean z3, q qVar);

    boolean a(String str);

    boolean a(Set<q> set) throws Exception;

    C b(String str);

    boolean b(q qVar);

    void c(q qVar);

    void c(String str);

    boolean d(q qVar) throws Exception;
}
