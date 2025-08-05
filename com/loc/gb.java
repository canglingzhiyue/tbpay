package com.loc;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* loaded from: classes4.dex */
public class gb {
    private static final ThreadLocal<CharsetDecoder> b = new ThreadLocal<CharsetDecoder>() { // from class: com.loc.gb.1
        private static CharsetDecoder a() {
            return Charset.forName("UTF-8").newDecoder();
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ CharsetDecoder initialValue() {
            return a();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Charset> f7812a = new ThreadLocal<Charset>() { // from class: com.loc.gb.2
        private static Charset a() {
            return Charset.forName("UTF-8");
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Charset initialValue() {
            return a();
        }
    };
    private static final ThreadLocal<CharBuffer> c = new ThreadLocal<>();
}
