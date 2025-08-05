package com.uc.webview.internal.setup.download;

import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.g;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;

/* loaded from: classes9.dex */
public interface IDownloadHandle extends U4Engine.IDownloadHandle {

    /* loaded from: classes9.dex */
    public static class Client {
        public void onFailed(UCKnownException uCKnownException) {
        }

        public boolean onGetSizeInfo(String str, long j, long j2) {
            return true;
        }

        public void onProgress(int i) {
        }

        public boolean onStart(String str) {
            return true;
        }

        public void onSuccess(File file, long j, long j2) {
        }
    }

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static final String IMPL_CLASS = "com.uc.webview.internal.setup.download.impl.DownloadHandle";
        private static final String IMPL_METHOD = "create";

        public static final IDownloadHandle create() {
            try {
                return (IDownloadHandle) g.b(IMPL_CLASS, "create");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    void delete();

    long getRemoteLastModified();

    long getRemoteSize();

    File getSavedFile();

    String getUrl();

    IDownloadHandle setClient(Client client);

    IDownloadHandle setDownloader(IUrlDownloader iUrlDownloader);

    IDownloadHandle setSpecifiedDir(File file);

    IDownloadHandle setUrl(String str);

    void start();
}
