package com.taobao.search.m3.widget;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.icons.g;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public interface c {

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1440659137);
        }

        public static void a(c cVar, M3CellBean bean, boolean z, g listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf5758be", new Object[]{cVar, bean, new Boolean(z), listener});
                return;
            }
            q.c(bean, "bean");
            q.c(listener, "listener");
        }
    }

    void addDynamicCard(View view, boolean z);

    void addMoreButton(boolean z, boolean z2, M3CellBean m3CellBean, com.taobao.search.m3.more.b bVar, boolean z3);

    boolean canPlay();

    List<com.taobao.search.m3.icons.c> getDisplayIcons();

    void hideFeedback();

    void play();

    void removeDynamicCard();

    void stop();

    boolean updateComment(M3CellBean m3CellBean, boolean z);

    boolean updateComposite(M3CellBean m3CellBean, boolean z);

    void updateFeedback(M3CellBean m3CellBean, com.taobao.search.m3.feedback.b bVar, TbSearchStyle tbSearchStyle, boolean z);

    boolean updateInteractiveTag(M3CellBean m3CellBean, com.taobao.search.m3.interactive.d dVar, boolean z);

    boolean updateProperty(M3CellBean m3CellBean, boolean z);

    boolean updateSingleRow(M3CellBean m3CellBean, com.taobao.search.m3.singlerow.a aVar, boolean z);

    boolean updateSummaryTips(M3CellBean m3CellBean, boolean z);

    void updateTitle(M3CellBean m3CellBean, TbSearchStyle tbSearchStyle);
}
