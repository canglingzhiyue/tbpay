package com.taobao.pexode.decoder;

import android.content.Context;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.PexodeException;
import java.io.IOException;
import tb.nec;

/* loaded from: classes.dex */
public interface d {
    boolean acceptInputType(int i, nec necVar, boolean z);

    boolean canDecodeIncrementally(nec necVar);

    com.taobao.pexode.e decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException;

    nec detectMimeType(byte[] bArr);

    boolean isSupported(nec necVar);

    void prepare(Context context);
}
