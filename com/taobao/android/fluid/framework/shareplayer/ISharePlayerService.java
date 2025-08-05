package com.taobao.android.fluid.framework.shareplayer;

import com.taobao.android.fluid.core.FluidService;
import tb.snd;
import tb.snv;
import tb.spu;
import tb.spw;

/* loaded from: classes5.dex */
public interface ISharePlayerService extends FluidService, snd {
    void clearSharePlayer(String str);

    spu getConfig();

    snv getDWInstance();

    spw getInnerSharePlayerObject();

    void initSharePlayer();

    boolean isEnableInnerSharePlayer();

    boolean isEnableSharePlayer();

    boolean isHasCreateDWInstance();

    boolean isHasShowInnerSharePlayerPV();

    boolean isSharePlayerViewStateNoPlaying();

    boolean isStillShareVideo();

    void setDWInstance(snv snvVar);

    void setEnableInnerSharePlayer(boolean z);

    void setEnableSharePlayer(boolean z);

    void setHasCreateDWInstance(boolean z);

    void setHasShowInnerSharePlayerPV(boolean z);

    void setInnerSharePlayerObject(spw spwVar);
}
