package android.taobao.windvane.cache;

import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char DIVISION = '~';

    /* renamed from: a  reason: collision with root package name */
    public long f1551a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;
    public boolean i = true;

    static {
        kge.a(14167226);
    }

    public c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6352de07", new Object[]{this});
        }
        if (getClass().equals(c.class)) {
            return this;
        }
        c cVar = new c();
        cVar.f1551a = this.f1551a;
        cVar.b = this.b;
        cVar.c = this.c;
        cVar.d = this.d;
        cVar.e = this.e;
        cVar.f = this.f;
        cVar.g = this.g;
        cVar.h = this.h;
        cVar.i = this.i;
        return cVar;
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        long j = this.f1551a;
        if (j > 0) {
            sb.append(j);
        } else {
            sb.append("0000000000000");
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        long j2 = this.b;
        if (j2 > 0) {
            sb.append(j2);
        } else {
            sb.append("0000000000000");
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        String str = this.c;
        if (str == null) {
            sb.append("");
        } else {
            sb.append(str);
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        String str2 = this.e;
        if (str2 == null) {
            sb.append("");
        } else {
            sb.append(str2);
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        String str3 = this.d;
        if (str3 == null) {
            sb.append("");
        } else {
            sb.append(str3);
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        String str4 = this.f;
        if (str4 == null) {
            sb.append("");
        } else {
            sb.append(str4);
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        if (StringUtils.isEmpty(this.g)) {
            sb.append("utf-8");
        } else {
            sb.append(this.g);
        }
        if (m.a()) {
            m.b("FileInfo", "composeFileInfoStr:" + ((Object) sb));
        }
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
