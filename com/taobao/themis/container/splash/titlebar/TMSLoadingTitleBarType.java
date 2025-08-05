package com.taobao.themis.container.splash.titlebar;

import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;

/* loaded from: classes9.dex */
public enum TMSLoadingTitleBarType {
    PUB,
    GAME,
    NON;

    public static TMSLoadingTitleBarType getType(f fVar) {
        TMSSolutionType j = fVar.j();
        return j == TMSSolutionType.MIX ? PUB : j == TMSSolutionType.MINIGAME ? GAME : NON;
    }
}
