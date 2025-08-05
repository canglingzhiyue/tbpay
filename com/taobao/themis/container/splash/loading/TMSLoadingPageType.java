package com.taobao.themis.container.splash.loading;

import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;

/* loaded from: classes9.dex */
public enum TMSLoadingPageType {
    GAME,
    PUB,
    NON;

    public static TMSLoadingPageType getType(f fVar) {
        TMSSolutionType j = fVar.j();
        return j == TMSSolutionType.MIX ? PUB : j == TMSSolutionType.MINIGAME ? GAME : NON;
    }
}
