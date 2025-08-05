package com.uc.webview.internal.interfaces;

import android.graphics.Bitmap;
import com.uc.webview.base.IExtender;
import com.uc.webview.export.extension.PrerenderHandler;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IPrerenderHandler extends IExtender {
    void addPrerender(String str, String str2, int i, int i2);

    void addPrerender(String str, String str2, Map<String, String> map, int i, int i2);

    void cancelPrerender(String str);

    boolean commitPrerender(String str);

    boolean requestSnapshot(String str, Bitmap bitmap);

    void setPrerenderClient(PrerenderHandler.PrerenderClient prerenderClient);

    void setPrerenderType(int i);
}
