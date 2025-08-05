package com.taobao.android.searchbaseframe.xsl.section;

import android.view.ViewGroup;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.itd;
import tb.ivo;

/* loaded from: classes6.dex */
public interface c extends ivo.b {
    void a(itd<BaseCellBean, ?> itdVar, int i, BaseCellBean baseCellBean);

    itd b(ViewGroup viewGroup, int i);

    ListStyle c();

    boolean d(int i);

    boolean e(int i);

    boolean f(int i);

    boolean g(int i);

    int getItemViewType(int i);

    BaseCellBean h(int i);

    h i(int i);

    BaseCellBean j(int i);
}
