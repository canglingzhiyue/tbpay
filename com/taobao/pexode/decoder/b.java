package com.taobao.pexode.decoder;

import com.android.alibaba.ip.runtime.IpChange;
import tb.nec;
import tb.ned;

/* loaded from: classes7.dex */
public class b {
    public static final nec APNG = new nec("PNG", "apng", true, new String[]{"png"}, new nec.a() { // from class: com.taobao.pexode.decoder.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.nec.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : bArr != null && bArr.length >= 41 && ned.a(bArr, 0, ned.PNG_HEADER) && ned.j(bArr);
        }
    });
}
