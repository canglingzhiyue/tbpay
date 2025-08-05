package com.taobao.android.abilitykit.ability.pop.render;

import android.view.View;
import android.view.ViewGroup;
import com.taobao.android.abilitykit.ability.pop.model.c;
import tb.dle;

/* loaded from: classes4.dex */
public interface c<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c, ABILITY_CONTEXT extends dle> {

    /* loaded from: classes4.dex */
    public interface a {
        void d();
    }

    void changeGravity(String str);

    void changeSize(float f, float f2, boolean z);

    void doDismissAnimation();

    void enableCorner(boolean z);

    boolean isBgTransparent();

    ViewGroup onCreateView(ABILITY_CONTEXT ability_context, PARAMS params, View view, a aVar, IAKPopRender<PARAMS, ABILITY_CONTEXT> iAKPopRender);

    void onLevelChanged(boolean z, boolean z2, int i);

    boolean shouldIgnoreNotifyLevelChange();
}
