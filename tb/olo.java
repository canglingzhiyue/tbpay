package tb;

import android.content.Context;

/* loaded from: classes.dex */
public interface olo {
    void executeUploadTask(Context context, olr olrVar, olp olpVar);

    String getBizCode();

    void onUploadDone(boolean z, String str);
}
