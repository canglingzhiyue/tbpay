package com.taobao.android.detail.core.open;

import android.app.Activity;
import com.taobao.android.trade.event.Event;
import tb.dzr;
import tb.egq;
import tb.ehw;
import tb.eig;
import tb.enn;
import tb.eon;
import tb.eop;
import tb.eov;
import tb.epf;
import tb.epi;
import tb.epk;

/* loaded from: classes4.dex */
public interface g {
    com.taobao.android.detail.core.detail.kit.view.holder.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b> a(Activity activity, com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar);

    com.taobao.android.detail.core.detail.kit.view.holder.c<egq> a(Activity activity, egq egqVar);

    com.taobao.android.detail.core.detail.kit.view.holder.c<epi> a(Activity activity, epi epiVar);

    com.taobao.android.detail.core.detail.kit.view.holder.desc.b<epf> a(Activity activity, epf epfVar);

    com.taobao.android.detail.core.detail.popup.f a(String str);

    ProtocolType a();

    void a(com.taobao.android.detail.core.detail.widget.container.b bVar);

    void a(DetailBusinessDetector detailBusinessDetector);

    void a(e eVar);

    void a(f fVar);

    void a(l lVar);

    void a(Event event);

    <T extends enn> void a(Class<T> cls, com.taobao.android.trade.event.j jVar);

    void a(dzr dzrVar);

    void a(ehw ehwVar);

    void a(eig eigVar);

    void a(eon eonVar);

    @Deprecated
    void a(eop eopVar);

    void a(eov eovVar);

    void a(epk epkVar);

    boolean a(String str, Object obj);

    void b(l lVar);
}
