package tb;

/* loaded from: classes4.dex */
public abstract class cuf {
    public static final String BIZCODE_CAPTURE = "imgsearch";
    public static final String BIZCODE_SCAN = "imgsearch_scan";
    public static final int MSG_FILE_UPLOAD_FAILED = 30001;
    public static final int MSG_FILE_UPLOAD_PROGRESS = 31000;
    public static final int MSG_FILE_UPLOAD_SUCCESS = 30000;

    /* renamed from: a  reason: collision with root package name */
    public String f26537a;

    static {
        kge.a(-121797995);
    }

    public cuf(String str) {
        this.f26537a = BIZCODE_CAPTURE;
        this.f26537a = str;
    }
}
