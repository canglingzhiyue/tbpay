package com.alipay.mobile.security.bio.config.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class Coll {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f5779a = 3;
    private float b = -0.6f;
    private float c = 0.6f;
    private float d = 0.5f;
    private float e = 0.28f;
    private int f = 50;
    private int g = 20;
    private int h = 178;
    private int i = 1;
    private int j = 1;
    private int k = 5;
    private String l = "";
    private String m = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";
    private String t = "";
    private String u = "";
    private String v = "";
    private String w = "";
    private int x = 0;
    private boolean y = false;
    private boolean z = false;
    private boolean A = false;
    private boolean B = true;
    private boolean C = false;
    private boolean D = true;
    private boolean E = false;
    private boolean F = false;
    private String[] G = {"7"};
    private boolean H = true;
    private boolean I = false;
    private boolean J = true;
    private boolean K = true;
    private String L = "#FFFFFF";
    private float M = 0.3f;
    private float N = 5.0f;
    private boolean O = true;
    private float P = 3.0f;
    private int Q = 0;
    private boolean R = false;
    private boolean S = false;
    private float T = 3.0f;
    private float U = 0.9f;
    private float V = 0.6f;
    private String W = "gle";
    private boolean X = false;
    private float Y = 1.33f;
    private boolean Z = false;
    private boolean aa = true;

    public void setRetry(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5bdcbb6", new Object[]{this, new Integer(i)});
        } else {
            this.f5779a = i;
        }
    }

    public int getRetry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c357846c", new Object[]{this})).intValue() : this.f5779a;
    }

    public void setMinangle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("110c11b6", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public float getMinangle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8833442e", new Object[]{this})).floatValue() : this.b;
    }

    public void setMaxangle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46de248", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }

    public float getMaxangle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bec195c", new Object[]{this})).floatValue() : this.c;
    }

    public void setNear(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5ff6af", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public float getNear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a952f615", new Object[]{this})).floatValue() : this.d;
    }

    public void setFar(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaaadde4", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }

    public float getFar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd6ae7d8", new Object[]{this})).floatValue() : this.e;
    }

    public void setMinlight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0dd9296", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public int getMinlight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9be26f4", new Object[]{this})).intValue() : this.f;
    }

    public void setTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1b166d", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int getTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63d", new Object[]{this})).intValue();
        }
        int i = this.g;
        if (i > 5 && i <= 60) {
            return i;
        }
        return 20;
    }

    public void setLight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d210e08", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public int getLight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2839afda", new Object[]{this})).intValue() : this.h;
    }

    public void setImageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88444c3", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public int getImageIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ae48e27", new Object[]{this})).intValue() : this.i;
    }

    public void setMineDscore(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f516c59", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public int getMineDscore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ca91bd1", new Object[]{this})).intValue() : this.j;
    }

    public void setMineVideo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d82976", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public int getMineVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9517c8ac", new Object[]{this})).intValue() : this.k;
    }

    public void setTopText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207f43f1", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public String getTopText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5367168d", new Object[]{this}) : this.l;
    }

    public void setBottomText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b50bef0b", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public String getBottomText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5cd7d1cb", new Object[]{this}) : this.m;
    }

    public void setUploadMonitorPic(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798ba809", new Object[]{this, new Integer(i)});
        } else {
            this.x = i;
        }
    }

    public int getUploadMonitorPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3703e321", new Object[]{this})).intValue() : this.x;
    }

    public void setRawCameraFrameUpload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48737b6a", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public boolean getRawCameraFrameUpload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("949a03a2", new Object[]{this})).booleanValue() : this.y;
    }

    public void setUploadLivePic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3262992", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public boolean isUploadLivePic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("537611be", new Object[]{this})).booleanValue() : this.z;
    }

    public void setProgressbar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce318a9", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public boolean isProgressbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("768c11c7", new Object[]{this})).booleanValue() : this.A;
    }

    public void setUploadBestPic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c9168a", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public boolean isUploadBestPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac5a5c6", new Object[]{this})).booleanValue() : this.B;
    }

    public void setUploadPoseOkPic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db90ad33", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public boolean isUploadPoseOkPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e16e7fd", new Object[]{this})).booleanValue() : this.C;
    }

    public void setUploadBigPic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f96800", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public boolean isUploadBigPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0d9b620", new Object[]{this})).booleanValue() : this.D;
    }

    public boolean isUploadDepthData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81f5bd0d", new Object[]{this})).booleanValue() : this.E;
    }

    public void setUploadDepthData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c7a23", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public void setActionMode(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b47bdd", new Object[]{this, strArr});
        } else {
            this.G = strArr;
        }
    }

    public String[] getActionMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("ba60d045", new Object[]{this}) : this.G;
    }

    public String getTopText_noface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4be40848", new Object[]{this}) : this.n;
    }

    public void setTopText_noface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4169222e", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public String getTopText_light() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a9ab43d6", new Object[]{this}) : this.o;
    }

    public void setTopText_light(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05d18c8", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public String getTopText_rectwidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ddc54c8a", new Object[]{this}) : this.p;
    }

    public void setTopText_rectwidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8634c94", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public String getTopText_integrity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50aa807f", new Object[]{this}) : this.q;
    }

    public void setTopText_integrity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c224973f", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public String getTopText_angle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7136a839", new Object[]{this}) : this.r;
    }

    public void setTopText_angle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3e40c5", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public String getTopText_blur() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b18a25f", new Object[]{this}) : this.s;
    }

    public void setTopText_blur(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89a1df7", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public String getTopText_quality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b2232cd", new Object[]{this}) : this.t;
    }

    public void setTopText_quality(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34bfbb1", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public String getTopText_blink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e381150", new Object[]{this}) : this.u;
    }

    public void setTopText_blink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd69fa8e", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public String getTopText_stay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("942257ad", new Object[]{this}) : this.v;
    }

    public void setTopText_stay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c71269", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public String getTopText_max_rectwidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ccdb945", new Object[]{this}) : this.w;
    }

    public void setTopText_max_rectwidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83449d39", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public String getBackgroundColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66ad4fba", new Object[]{this}) : this.L;
    }

    public void setBackgroundColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29247c64", new Object[]{this, str});
        } else {
            this.L = str;
        }
    }

    public float getBackgroundAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e56f211", new Object[]{this})).floatValue();
        }
        float f = this.M;
        if (f > 0.0f && f < 1.0f) {
            return f;
        }
        return 0.3f;
    }

    public void setBackgroundAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dae8cb", new Object[]{this, new Float(f)});
        } else {
            this.M = f;
        }
    }

    public float getQuitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbfa02a9", new Object[]{this})).floatValue();
        }
        float f = this.N;
        if (f >= 0.0f && f < this.g) {
            return f;
        }
        return 5.0f;
    }

    public void setQuitTime(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561d229b", new Object[]{this, new Float(f)});
        } else {
            this.N = f;
        }
    }

    public boolean getFocusAni() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16bfe2e5", new Object[]{this})).booleanValue() : this.aa;
    }

    public void setFocusAni(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54139287", new Object[]{this, new Boolean(z)});
        } else {
            this.aa = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Coll{retry=" + this.f5779a + ", minangle=" + this.b + ", maxangle=" + this.c + ", near=" + this.d + ", far=" + this.e + ", minlight=" + this.f + ", time=" + this.g + ", light=" + this.h + ", imageIndex=" + this.i + ", mineDscore=" + this.j + ", mineVideo=" + this.k + ", topText='" + this.l + "', bottomText='" + this.m + "', topText_noface='" + this.n + "', topText_light='" + this.o + "', topText_rectwidth='" + this.p + "', topText_integrity='" + this.q + "', topText_angle='" + this.r + "', topText_blur='" + this.s + "', topText_quality='" + this.t + "', topText_blink='" + this.u + "', topText_stay='" + this.v + "', topText_max_rectwidth='" + this.w + "', uploadMonitorPic=" + this.x + ", uploadLivePic=" + this.z + ", progressbar=" + this.A + ", uploadBestPic=" + this.B + ", uploadPoseOkPic=" + this.C + ", uploadBigPic=" + this.D + ", uploadDepthData=" + this.E + ", actionMode=" + Arrays.toString(this.G) + ", asyncUp=" + this.H + ", uploadAsynData=" + this.I + ", uploadAsynFailData=" + this.J + ", encUp=" + this.K + ", previewStyle=" + this.W + ", hookCheck=" + this.Z + ", focusAni=" + this.aa + ", backgroundColor=" + this.L + ", backgroundAlpha=" + this.M + ", quitTime=" + this.N + ", guideAnimation='" + this.O + "', guideAnimationTime='" + this.P + "', cameraResolution='" + this.Q + "', beauty='" + this.R + "', showFace='" + this.S + "', showFaceTime='" + this.T + "', initShowFaceAlpha='" + this.U + "', endShowFaceAlpha='" + this.V + "'}";
    }

    public boolean isAuthorization() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf676c7a", new Object[]{this})).booleanValue() : this.F;
    }

    public void setAuthorization(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5602656", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public boolean isAsyncUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97088bb8", new Object[]{this})).booleanValue() : this.H;
    }

    public void setAsyncUp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea638d8", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public boolean getUploadAsynData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("859eddb3", new Object[]{this})).booleanValue() : this.I;
    }

    public void setUploadAsynData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c824a79", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public boolean getUploadAsynFailData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("deffabf1", new Object[]{this})).booleanValue() : this.J;
    }

    public void setUploadAsynFailData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172669fb", new Object[]{this, new Boolean(z)});
        } else {
            this.J = z;
        }
    }

    public boolean isEncUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7452f916", new Object[]{this})).booleanValue() : this.K;
    }

    public void setEncUp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b106e53a", new Object[]{this, new Boolean(z)});
        } else {
            this.K = z;
        }
    }

    public void setGuideAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e15f083", new Object[]{this, new Boolean(z)});
        } else {
            this.O = z;
        }
    }

    public boolean getGuideAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b594e69", new Object[]{this})).booleanValue() : this.O;
    }

    public void setGuideAnimationTime(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c818fa2", new Object[]{this, new Float(f)});
        } else {
            this.P = f;
        }
    }

    public float getGuideAnimationTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b665b7c2", new Object[]{this})).floatValue() : this.P;
    }

    public void setCameraResolution(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5074bd09", new Object[]{this, new Integer(i)});
        } else {
            this.Q = i;
        }
    }

    public int getCameraResolution() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4242e21", new Object[]{this})).intValue() : this.Q;
    }

    public boolean isBeauty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dac3f3d1", new Object[]{this})).booleanValue() : this.R;
    }

    public void setBeauty(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4202566f", new Object[]{this, new Boolean(z)});
        } else {
            this.R = z;
        }
    }

    public boolean isShowFace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd5fc8cf", new Object[]{this})).booleanValue() : this.S;
    }

    public void setShowFace(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd90cf31", new Object[]{this, new Boolean(z)});
        } else {
            this.S = z;
        }
    }

    public float getShowFaceTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("502c3954", new Object[]{this})).floatValue();
        }
        float f = this.T;
        if (f >= 0.0f && f < this.g) {
            return f;
        }
        return 3.0f;
    }

    public void setShowFaceTime(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f16750", new Object[]{this, new Float(f)});
        } else {
            this.T = f;
        }
    }

    public float getInitShowFaceAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("550bc015", new Object[]{this})).floatValue();
        }
        float f = this.U;
        if (f > 0.0f && f < 1.0f) {
            return f;
        }
        return 0.9f;
    }

    public void setInitShowFaceAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb04847", new Object[]{this, new Float(f)});
        } else {
            this.U = f;
        }
    }

    public float getEndShowFaceAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62f435d6", new Object[]{this})).floatValue();
        }
        float f = this.V;
        if (f > 0.0f && f < 1.0f) {
            return f;
        }
        return 0.6f;
    }

    public void setEndShowFaceAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba5a10e", new Object[]{this, new Float(f)});
        } else {
            this.V = f;
        }
    }

    public String getPreviewStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfa8c31a", new Object[]{this}) : this.W;
    }

    public void setPreviewStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60e149c", new Object[]{this, str});
        } else {
            this.W = str;
        }
    }

    public boolean isUseAutoFaceFocus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8c7779a", new Object[]{this})).booleanValue() : this.X;
    }

    public void setUseAutoFaceFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29ab1c6", new Object[]{this, new Boolean(z)});
        } else {
            this.X = z;
        }
    }

    public float getCameraRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("39bfbf27", new Object[]{this})).floatValue() : this.Y;
    }

    public void setCameraRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2352475", new Object[]{this, new Float(f)});
        } else {
            this.Y = f;
        }
    }

    public boolean checkHook() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("769df156", new Object[]{this})).booleanValue() : this.Z;
    }

    public void setHookCheck(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2cf5aa", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }
}
