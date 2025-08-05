package com.taobao.pha.core.phacontainer;

import com.taobao.pha.core.model.PageModel;
import tb.nfz;

/* loaded from: classes7.dex */
public interface c {

    @Deprecated
    /* loaded from: classes7.dex */
    public interface a {
        void a(int i);
    }

    @Deprecated
    /* loaded from: classes7.dex */
    public interface b {
        void a(int i);
    }

    void destroy();

    /* renamed from: getPageModel */
    PageModel mo1202getPageModel();

    nfz getPageView();

    @Deprecated
    void registerPageAppearListener(a aVar);

    @Deprecated
    void registerPageDisappearListener(b bVar);

    void setPageIndex(int i);

    void updatePageModel(PageModel pageModel);
}
