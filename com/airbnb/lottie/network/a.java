package com.airbnb.lottie.network;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public interface a extends Closeable {
    boolean a();

    InputStream b() throws IOException;

    String c();

    String d();
}
