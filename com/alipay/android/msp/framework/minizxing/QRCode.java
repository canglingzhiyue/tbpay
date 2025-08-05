package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class QRCode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NUM_MASK_PATTERNS = 8;

    /* renamed from: a  reason: collision with root package name */
    private Mode f4807a;
    private ErrorCorrectionLevel b;
    private Version c;
    private int d = -1;
    private ByteMatrix e;

    public static boolean isValidMaskPattern(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9bc03ee", new Object[]{new Integer(i)})).booleanValue() : i >= 0 && i < 8;
    }

    public final Mode getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mode) ipChange.ipc$dispatch("1778701f", new Object[]{this}) : this.f4807a;
    }

    public final ErrorCorrectionLevel getECLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorCorrectionLevel) ipChange.ipc$dispatch("1fee4b5b", new Object[]{this}) : this.b;
    }

    public final Version getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Version) ipChange.ipc$dispatch("6a098733", new Object[]{this}) : this.c;
    }

    public final int getMaskPattern() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17cb4f48", new Object[]{this})).intValue() : this.d;
    }

    public final ByteMatrix getMatrix() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteMatrix) ipChange.ipc$dispatch("2ee1177", new Object[]{this}) : this.e;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f4807a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    public final void setMode(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3dc663", new Object[]{this, mode});
        } else {
            this.f4807a = mode;
        }
    }

    public final void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7fcc29", new Object[]{this, errorCorrectionLevel});
        } else {
            this.b = errorCorrectionLevel;
        }
    }

    public final void setVersion(Version version) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d365ac03", new Object[]{this, version});
        } else {
            this.c = version;
        }
    }

    public final void setMaskPattern(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859ba35a", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void setMatrix(ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137c847f", new Object[]{this, byteMatrix});
        } else {
            this.e = byteMatrix;
        }
    }
}
