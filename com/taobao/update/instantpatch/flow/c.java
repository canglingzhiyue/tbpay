package com.taobao.update.instantpatch.flow;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.instantpatch.d;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f23438a;

    static {
        kge.a(-1671286324);
    }

    public c(d dVar) {
        this.f23438a = dVar;
    }

    public void decode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a785ff", new Object[]{this, str});
            return;
        }
        try {
            base64ToFile(this.f23438a.path, str);
        } catch (Exception e) {
            e.printStackTrace();
            this.f23438a.success = false;
        }
    }

    public void base64ToFile(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88358e1", new Object[]{this, str, str2});
            return;
        }
        byte[] decode = Base64.decode(str2, 0);
        if (decode == null) {
            this.f23438a.success = false;
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
        try {
            bufferedOutputStream.write(decode, 0, decode.length);
        } finally {
            bufferedOutputStream.close();
        }
    }
}
