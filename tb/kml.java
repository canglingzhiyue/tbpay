package tb;

/* loaded from: classes7.dex */
public interface kml {

    /* loaded from: classes7.dex */
    public interface a {
        void a(boolean z);
    }

    void onDownloadError(String str, int i, String str2);

    void onDownloadFinish(String str, String str2);

    void onDownloadProgress(int i);

    void onDownloadStateChange(String str, boolean z);

    void onFinish(boolean z);

    void onNetworkLimit(int i, kmq kmqVar, a aVar);
}
