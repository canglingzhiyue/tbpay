package com.taobao.themis.open.ability.audio;

import com.taobao.themis.open.ability.audio.MegaPlayerInstance;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.themis.open.utils.LocalPathType;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;
    public static final /* synthetic */ int[] $EnumSwitchMapping$4;
    public static final /* synthetic */ int[] $EnumSwitchMapping$5;

    static {
        kge.a(-1576553106);
        int[] iArr = new int[ApPathType.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[ApPathType.AP_PATH_TYPE_USR.ordinal()] = 1;
        $EnumSwitchMapping$0[ApPathType.AP_PATH_TYPE_TEMP.ordinal()] = 2;
        $EnumSwitchMapping$0[ApPathType.AP_PATH_TYPE_NETWORK.ordinal()] = 3;
        $EnumSwitchMapping$0[ApPathType.AP_PATH_TYPE_UNKNOWN.ordinal()] = 4;
        $EnumSwitchMapping$0[ApPathType.AP_PATH_TYPE_PKG.ordinal()] = 5;
        int[] iArr2 = new int[LocalPathType.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[LocalPathType.LOCAL_PATH_TYPE_USR.ordinal()] = 1;
        $EnumSwitchMapping$1[LocalPathType.LOCAL_PATH_TYPE_TEMP.ordinal()] = 2;
        $EnumSwitchMapping$1[LocalPathType.LOCAL_PATH_TYPE_UNKNOWN.ordinal()] = 3;
        int[] iArr3 = new int[MegaPlayerInstance.PlayerState.values().length];
        $EnumSwitchMapping$2 = iArr3;
        iArr3[MegaPlayerInstance.PlayerState.INIT.ordinal()] = 1;
        $EnumSwitchMapping$2[MegaPlayerInstance.PlayerState.START_PREPARE.ordinal()] = 2;
        $EnumSwitchMapping$2[MegaPlayerInstance.PlayerState.PREPARED.ordinal()] = 3;
        $EnumSwitchMapping$2[MegaPlayerInstance.PlayerState.STOP.ordinal()] = 4;
        $EnumSwitchMapping$2[MegaPlayerInstance.PlayerState.ENDED.ordinal()] = 5;
        $EnumSwitchMapping$2[MegaPlayerInstance.PlayerState.PLAYING.ordinal()] = 6;
        $EnumSwitchMapping$2[MegaPlayerInstance.PlayerState.PAUSED.ordinal()] = 7;
        $EnumSwitchMapping$2[MegaPlayerInstance.PlayerState.ERROR.ordinal()] = 8;
        int[] iArr4 = new int[MegaPlayerInstance.PlayerState.values().length];
        $EnumSwitchMapping$3 = iArr4;
        iArr4[MegaPlayerInstance.PlayerState.INIT.ordinal()] = 1;
        $EnumSwitchMapping$3[MegaPlayerInstance.PlayerState.PLAYING.ordinal()] = 2;
        int[] iArr5 = new int[MegaPlayerInstance.PlayerState.values().length];
        $EnumSwitchMapping$4 = iArr5;
        iArr5[MegaPlayerInstance.PlayerState.STOP.ordinal()] = 1;
        $EnumSwitchMapping$4[MegaPlayerInstance.PlayerState.INIT.ordinal()] = 2;
        $EnumSwitchMapping$4[MegaPlayerInstance.PlayerState.START_PREPARE.ordinal()] = 3;
        $EnumSwitchMapping$4[MegaPlayerInstance.PlayerState.ERROR.ordinal()] = 4;
        $EnumSwitchMapping$4[MegaPlayerInstance.PlayerState.ENDED.ordinal()] = 5;
        int[] iArr6 = new int[MegaPlayerInstance.PlayerState.values().length];
        $EnumSwitchMapping$5 = iArr6;
        iArr6[MegaPlayerInstance.PlayerState.INIT.ordinal()] = 1;
        $EnumSwitchMapping$5[MegaPlayerInstance.PlayerState.STOP.ordinal()] = 2;
    }
}
