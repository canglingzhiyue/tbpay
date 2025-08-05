package com.alibaba.ut.abtest.internal.util.hash;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface c {
    HashCode hashString(CharSequence charSequence, Charset charset);

    d newHasher();
}
