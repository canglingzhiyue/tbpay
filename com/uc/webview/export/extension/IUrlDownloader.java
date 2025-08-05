package com.uc.webview.export.extension;

/* loaded from: classes9.dex */
public interface IUrlDownloader {

    /* loaded from: classes9.dex */
    public static class Client {
        public void onFailed(String str, Throwable th) {
        }

        public void onProgressChanged(int i) {
        }

        public boolean onStart() {
            return true;
        }

        public void onSuccess(String str, long j, long j2) {
        }
    }

    void delete();

    boolean start(String str, String str2, Client client);

    void stop();
}
