package com.taobao.android.meta.structure.page;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import tb.hte;
import tb.itk;
import tb.iuj;

/* loaded from: classes6.dex */
public interface b extends iuj<FrameLayout, a> {
    void a();

    void a(PagerAdapter pagerAdapter);

    void a(ViewPager.OnPageChangeListener onPageChangeListener);

    void a(View view);

    void a(com.taobao.android.searchbaseframe.meta.uikit.b bVar);

    void a(hte hteVar);

    void a(itk itkVar);

    ViewPager cX_();

    MetaLayout d();
}
