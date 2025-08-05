package com.taobao.phenix.loader.file;

import android.content.res.Resources;
import com.taobao.phenix.request.d;
import java.io.IOException;
import java.util.Map;
import tb.njf;

/* loaded from: classes.dex */
public interface b {
    public static final int LOCAL_ASSET = 34;
    public static final int LOCAL_BASE64 = 40;
    public static final int LOCAL_EXTENDED = 48;
    public static final int LOCAL_FILE = 33;
    public static final int LOCAL_RES = 36;

    njf a(d dVar, String str, Map<String, String> map) throws IOException, Resources.NotFoundException, UnSupportedSchemeException;
}
