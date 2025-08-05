package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import java.lang.reflect.Array;
import tb.ikr;
import tb.ikw;
import tb.iky;

/* loaded from: classes.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[][] f;

    /* renamed from: a  reason: collision with root package name */
    private final String f14837a;
    private final SoIndexData.SoFileInfo b;
    private final SoInfo2 c;
    private final ikr e;
    private volatile String d = "default";
    private boolean g = false;

    static {
        String[][] strArr = (String[][]) Array.newInstance(String.class, 8, 2);
        f = strArr;
        strArr[0][0] = "O1CN-v7alibucheif.so";
        String[][] strArr2 = f;
        strArr2[0][1] = "libucheif.so";
        strArr2[1][0] = "O1CN-v8libucheif.so";
        strArr2[1][1] = "libucheif.so";
        strArr2[2][0] = "O1CN-v7alibucheif_alpha.so";
        strArr2[2][1] = "libucheif_alpha.so";
        strArr2[3][0] = "O1CN-v8alibucheif_alpha.so";
        strArr2[3][1] = "libucheif_alpha.so";
        strArr2[4][0] = "O1CN-v7alibpexavif.so";
        strArr2[4][1] = "libpexavif.so";
        strArr2[5][0] = "O1CN-v8alibpexavif.so";
        strArr2[5][1] = "libpexavif.so";
        strArr2[6][0] = "O1CN-v1-v7alibucheif_alpha.so";
        strArr2[6][1] = "libucheif_alpha.so";
        strArr2[7][0] = "O1CN-v1-v8alibucheif_alpha.so";
        strArr2[7][1] = "libucheif_alpha.so";
    }

    private j(String str, SoIndexData.SoFileInfo soFileInfo, SoInfo2 soInfo2) {
        this.f14837a = str;
        this.b = soFileInfo;
        this.c = soInfo2;
        this.e = new ikr(str);
    }

    public static j a(String str, SoIndexData.SoFileInfo soFileInfo, SoInfo2 soInfo2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("d83d20b4", new Object[]{str, soFileInfo, soInfo2}) : new j(str, soFileInfo, soInfo2);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f14837a;
    }

    public String i() {
        String[][] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        String a2 = iky.a(this.b.getUri());
        for (String[] strArr2 : f) {
            if (ikw.a((CharSequence) strArr2[0], (CharSequence) a2)) {
                RSoLog.c("req2 -> hit fileNameMapping , use " + strArr2[1]);
                return strArr2[1];
            }
        }
        return a2;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b.getFrom();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b.getMd5();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b.getUri();
    }

    public SoIndexData.SoFileInfo e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("43a705f8", new Object[]{this}) : this.b;
    }

    public SoInfo2 f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoInfo2) ipChange.ipc$dispatch("7b4fc42d", new Object[]{this}) : this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public ikr h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ikr) ipChange.ipc$dispatch("44e18527", new Object[]{this}) : this.e;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ResolveReq2{libName='" + this.f14837a + "', soFileInfo=" + this.b + ", soInfo2=" + this.c + '}';
    }
}
