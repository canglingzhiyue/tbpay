package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.ToygerState;
import com.alipay.zoloz.toyger.algorithm.TGFaceState;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerFaceState extends TGFaceState implements ToygerState {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ToygerFaceState() {
    }

    public ToygerFaceState(TGFaceState tGFaceState) {
        this.hasFace = tGFaceState.hasFace;
        this.brightness = tGFaceState.brightness;
        this.distance = tGFaceState.distance;
        this.faceInCenter = tGFaceState.faceInCenter;
        this.goodPitch = tGFaceState.goodPitch;
        this.goodYaw = tGFaceState.goodYaw;
        this.isMoving = tGFaceState.isMoving;
        this.goodQuality = tGFaceState.goodQuality;
        this.progress = tGFaceState.progress;
        this.messageCode = tGFaceState.messageCode;
        this.staticMessage = tGFaceState.staticMessage;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public boolean hasTarget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46073bd6", new Object[]{this})).booleanValue() : this.hasFace;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public int brightness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7637204b", new Object[]{this})).intValue() : this.brightness;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public int distance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5060def", new Object[]{this})).intValue() : this.distance;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public boolean isInCenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0c28faf", new Object[]{this})).booleanValue() : this.faceInCenter;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public boolean isMoving() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("240b52a3", new Object[]{this})).booleanValue() : this.isMoving;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public boolean isGoodQuality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3655e83", new Object[]{this})).booleanValue() : this.goodQuality;
    }

    @Deprecated
    public int goodPitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e067cb7d", new Object[]{this})).intValue() : this.goodPitch;
    }

    @Deprecated
    public int goodYaw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1b0bfec", new Object[]{this})).intValue() : this.goodYaw;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public float getProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue() : this.progress;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public int getMessageCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e037b2d8", new Object[]{this})).intValue() : this.messageCode;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public int getStaticMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26fbd8fd", new Object[]{this})).intValue() : this.staticMessage;
    }
}
