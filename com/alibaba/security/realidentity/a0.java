package com.alibaba.security.realidentity;

import android.graphics.Rect;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniDetectState;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniDetectType;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniFailReason;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniPromptMessage;
import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class a0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(serialize = false)
    public int P;
    @JSONField(serialize = false)
    public int Q;
    @JSONField(serialize = false)
    public int R;
    @JSONField(serialize = false)
    public int S;
    @JSONField(name = "brightnessHistory")
    public String i0;
    @JSONField(name = "brightnessScores")
    public String j0;
    @JSONField(name = "leftEyeDataWidth")
    public int m0;
    @JSONField(name = "leftEyeDataHeight")
    public int n0;
    @JSONField(name = "rightEyeDataWidth")
    public int o0;
    @JSONField(name = "rightEyeDataHeight")
    public int p0;
    @JSONField(name = "faceExist")

    /* renamed from: a  reason: collision with root package name */
    public boolean f3351a = false;
    @JSONField(serialize = false)
    public float[] b = new float[36];
    @JSONField(serialize = false)
    public float[] c = new float[36];
    @JSONField(serialize = false)
    public Rect d = new Rect();
    @JSONField(serialize = false)
    public long e = 0;
    @JSONField(name = "iDetectType")
    public int f = 0;
    @JSONField(name = "iDetectTypeOld")
    public int g = 0;
    @JSONField(name = "iDetectState")
    public int h = 0;
    @JSONField(serialize = false)
    public int i = 0;
    @JSONField(serialize = false)
    public int j = 0;
    @JSONField(name = "outOfRegion")
    public boolean k = false;
    @JSONField(name = "tooSmall")
    public boolean l = false;
    @JSONField(name = "tooBig")
    public boolean m = false;
    @JSONField(name = "still")
    public boolean n = false;
    @JSONField(name = "brightness")
    public float o = 0.0f;
    @JSONField(name = "quality")
    public float p = 0.0f;
    @JSONField(name = "staticQuality")
    public float q = 0.0f;
    @JSONField(name = "pitchScore")
    public float r = 0.0f;
    @JSONField(name = "yawScore")
    public float s = 0.0f;
    @JSONField(name = "mouthScore")
    public float t = 0.0f;
    @JSONField(name = "blinkScore")
    public float u = 0.0f;
    @JSONField(name = "landmarkScore")
    public float v = -1.0f;
    @JSONField(name = "brightDiff")
    public float w = 0.0f;
    @JSONField(name = "backHightlight")
    public float x = 0.0f;
    @JSONField(name = "faceSpeed")
    public float y = 0.0f;
    @JSONField(name = "gestureProgress")
    public float z = 0.0f;
    @JSONField(name = "countPitch")
    public int A = 0;
    @JSONField(name = "countYaw")
    public int B = 0;
    @JSONField(name = "countMouth")
    public int C = 0;
    @JSONField(name = "countBlink")
    public int D = 0;
    @JSONField(name = "countFaceDisappear")
    public int E = 0;
    @JSONField(name = "faceChange")
    public boolean F = false;
    @JSONField(name = "mouthOcclusion")
    public boolean G = false;
    @JSONField(name = "eyeOcclusionOnce")
    public boolean H = false;
    @JSONField(name = "confirm3D")
    public boolean I = false;
    @JSONField(serialize = false)
    public int J = 10000;
    @JSONField(name = "iPromptMessage")
    public int K = 0;
    @JSONField(name = "iFailReason")
    public int L = 0;
    @JSONField(serialize = false)
    public int M = 0;
    @JSONField(serialize = false)
    public int N = 0;
    @JSONField(serialize = false)
    public byte[] O = null;
    @JSONField(serialize = false)
    public int T = 0;
    @JSONField(serialize = false)
    public int U = 0;
    @JSONField(serialize = false)
    public byte[] V = null;
    @JSONField(serialize = false)
    public int W = 0;
    @JSONField(serialize = false)
    public int X = 0;
    @JSONField(serialize = false)
    public byte[] Y = null;
    @JSONField(serialize = false)
    public int Z = 0;
    @JSONField(serialize = false)
    public int a0 = 0;
    @JSONField(serialize = false)
    public byte[][] b0 = null;
    @JSONField(serialize = false)
    public int c0 = 0;
    @JSONField(serialize = false)
    public int d0 = 0;
    @JSONField(serialize = false)
    public byte[] e0 = null;
    @JSONField(serialize = false)
    public String f0 = null;
    @JSONField(name = "iso")
    public float g0 = -1.0f;
    @JSONField(name = "illuminance")
    public float h0 = -1.0f;
    public byte[] k0 = null;
    public byte[] l0 = null;
    @JSONField(name = RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY)
    public int q0 = -1;
    @JSONField(name = "ecpc")
    public int r0 = -1;
    @JSONField(name = "etcc")
    public int s0 = -1;
    @JSONField(name = "ecResult")
    public String t0 = "";

    public ABJniDetectState a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABJniDetectState) ipChange.ipc$dispatch("b1b1a", new Object[]{this}) : ABJniDetectState.values()[this.h];
    }

    public ABJniDetectType b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABJniDetectType) ipChange.ipc$dispatch("4c854bb2", new Object[]{this}) : ABJniDetectType.valueOf(this.f);
    }

    public ABJniDetectType c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABJniDetectType) ipChange.ipc$dispatch("80337673", new Object[]{this}) : ABJniDetectType.valueOf(this.g);
    }

    public ABJniFailReason d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABJniFailReason) ipChange.ipc$dispatch("e88e8b4f", new Object[]{this}) : ABJniFailReason.valueOf(this.L);
    }

    public ABJniPromptMessage e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABJniPromptMessage) ipChange.ipc$dispatch("bf0e62a1", new Object[]{this}) : ABJniPromptMessage.values()[this.K];
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "face exist = " + this.f3351a + "，init time = " + this.e + "，current time = " + this.j + "，detect type = " + b() + "，detect state = " + a() + "，change detect time = " + this.i + "，out of region = " + this.k + "，too small = " + this.l + "，too big = " + this.m + "，still = " + this.n + "，brightness = " + ((int) this.o) + " / " + this.w + " / " + ((int) this.x) + "，quality = " + ((int) this.p) + " / " + ((int) this.q) + "，speed = " + this.y + "，gesture = " + this.z + "，yaw = " + this.B + " / " + this.s + "，pitch = " + this.A + " / " + this.r + "，mouth = " + this.C + " / " + this.t + "，blink = " + this.D + " / " + this.u + "，disappear = " + this.E + " / " + this.v + "，face change = " + this.F + "，occlusion = " + this.G + " / " + this.H + "，confirm 3D = " + this.I + "，rect = " + this.d + "，time left = " + this.J + "，detect type old = " + c() + "，fail reason = " + d() + "，fail reason message = " + d().getMessage() + "，failLog = " + this.f0;
    }
}
