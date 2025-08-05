package com.taobao.themis.open.ability.audio;

import com.taobao.themis.open.ability.audio.MegaPlayerInstance;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(-1579678883);
        int[] iArr = new int[MegaPlayerInstance.PlayerState.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[MegaPlayerInstance.PlayerState.INIT.ordinal()] = 1;
        $EnumSwitchMapping$0[MegaPlayerInstance.PlayerState.START_PREPARE.ordinal()] = 2;
        $EnumSwitchMapping$0[MegaPlayerInstance.PlayerState.PREPARED.ordinal()] = 3;
        $EnumSwitchMapping$0[MegaPlayerInstance.PlayerState.PLAYING.ordinal()] = 4;
        $EnumSwitchMapping$0[MegaPlayerInstance.PlayerState.PAUSED.ordinal()] = 5;
        $EnumSwitchMapping$0[MegaPlayerInstance.PlayerState.ENDED.ordinal()] = 6;
        $EnumSwitchMapping$0[MegaPlayerInstance.PlayerState.STOP.ordinal()] = 7;
        $EnumSwitchMapping$0[MegaPlayerInstance.PlayerState.ERROR.ordinal()] = 8;
    }
}
