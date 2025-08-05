package com.taobao.accs.utl;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import tb.kge;

/* loaded from: classes.dex */
public class j extends ByteArrayOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1477196928);
    }

    public j(int i) {
        super(i);
    }

    public j() {
    }

    public j a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("d3b9d307", new Object[]{this, new Byte(b)});
        }
        write(b);
        return this;
    }

    public j a(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("9aeef018", new Object[]{this, new Short(s)});
        }
        write(s >> 8);
        write(s);
        return this;
    }
}
