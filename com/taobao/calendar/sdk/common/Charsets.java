package com.taobao.calendar.sdk.common;

import android.taobao.util.b;
import com.alibaba.ariver.remoterpc.EncodingUtils;
import java.nio.charset.Charset;
import tb.kge;

/* loaded from: classes6.dex */
public class Charsets {
    public static final Charset ISO_8859_1;
    public static final Charset US_ASCII;
    public static final Charset UTF_8;

    static {
        kge.a(-140983304);
        UTF_8 = Charset.forName("UTF-8");
        US_ASCII = Charset.forName(EncodingUtils.US_ASCII);
        ISO_8859_1 = Charset.forName(b.ISO88591);
    }
}
