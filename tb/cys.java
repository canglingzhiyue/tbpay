package tb;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class cys extends AsyncTask<Context, Integer, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26605a = "cys";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(Context... contextArr) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = cyp.a(contextArr[0]);
        } catch (Exception e) {
            cyu.c(f26605a, "doInBackground: exception : " + e.getMessage());
            inputStream = null;
        }
        String str = "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
        if (inputStream != null) {
            cyt.a(inputStream);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            cyu.a(f26605a, "onPostExecute: upate done");
        } else {
            cyu.c(f26605a, "onPostExecute: upate failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onProgressUpdate(Integer... numArr) {
        cyu.a(f26605a, "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
    }
}
