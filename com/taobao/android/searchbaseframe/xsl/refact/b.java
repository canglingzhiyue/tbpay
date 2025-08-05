package com.taobao.android.searchbaseframe.xsl.refact;

import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout;
import tb.iru;
import tb.itu;
import tb.ius;

/* loaded from: classes6.dex */
public interface b {
    void a(int i, int i2);

    void a(int i, boolean z);

    void a(JSONObject jSONObject);

    void a(com.taobao.android.searchbaseframe.meta.uikit.c cVar);

    void a(XslPageLayout.a aVar);

    void a(String str);

    void a(String str, int i, boolean z, int i2);

    void a(String str, String str2);

    void a(itu ituVar);

    void a(boolean z);

    void a(boolean z, int i);

    void b(int i, int i2);

    void b(boolean z);

    void c(int i);

    void c(int i, int i2);

    void c(boolean z);

    void c_(int i);

    void d(int i, int i2);

    void d(boolean z);

    boolean d(int i);

    void d_(int i);

    void destroyAndRemoveFromParent();

    void e(int i, int i2);

    void f(int i);

    void g(int i);

    void h(int i);

    ius<?, ?, ?> i(int i);

    boolean i();

    boolean j();

    boolean k();

    void k_(int i);

    ViewGroup l();

    iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> m();

    void onCtxDestroyInternal();

    void onCtxPauseInternal();

    void onCtxResumeInternal();

    void postEvent(Object obj);

    void subscribeEvent(Object obj);
}
