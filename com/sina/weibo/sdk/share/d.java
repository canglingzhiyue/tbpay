package com.sina.weibo.sdk.share;

import android.content.Context;
import android.os.AsyncTask;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes4.dex */
public final class d extends AsyncTask<WeiboMultiMessage, Void, c> {
    private WeakReference<Context> B;
    private b C;

    static {
        kge.a(-1860740864);
    }

    public d(Context context, b bVar) {
        this.B = new WeakReference<>(context);
        this.C = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130 A[Catch: Throwable -> 0x018f, TryCatch #0 {Throwable -> 0x018f, blocks: (B:16:0x002c, B:18:0x0030, B:20:0x0034, B:21:0x0036, B:23:0x003a, B:25:0x003e, B:27:0x0042, B:28:0x0046, B:30:0x004d, B:31:0x005c, B:33:0x0062, B:35:0x006a, B:37:0x0074, B:39:0x007f, B:41:0x0089, B:46:0x0096, B:48:0x009a, B:49:0x00a1, B:51:0x00ab, B:52:0x00b8, B:53:0x00bf, B:54:0x00c0, B:55:0x00c7, B:56:0x00c8, B:57:0x00cc, B:59:0x00d0, B:61:0x00d6, B:63:0x00e0, B:65:0x00eb, B:74:0x011c, B:76:0x0122, B:81:0x0130, B:83:0x0134, B:84:0x014c, B:86:0x0163, B:87:0x0179, B:88:0x0181, B:68:0x00fa, B:70:0x0104, B:73:0x010c, B:89:0x0182, B:90:0x0189, B:91:0x018a), top: B:99:0x002c }] */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.sina.weibo.sdk.share.c doInBackground(com.sina.weibo.sdk.api.WeiboMultiMessage... r13) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.share.d.doInBackground(com.sina.weibo.sdk.api.WeiboMultiMessage[]):com.sina.weibo.sdk.share.c");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(c cVar) {
        c cVar2 = cVar;
        super.onPostExecute(cVar2);
        b bVar = this.C;
        if (bVar != null) {
            bVar.a(cVar2);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        super.onPreExecute();
    }
}
