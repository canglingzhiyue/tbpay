package com.taobao.calendar.sdk.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import java.io.InputStream;
import java.util.concurrent.RejectedExecutionException;
import tb.kge;

/* loaded from: classes6.dex */
public class NetImage {
    public static int FAIL;
    public static int SUCCESS;
    protected String img;
    protected Bitmap imgBmp;
    protected LoadHandler loadHandler;
    private final Context mContext;
    private a task;
    protected int MAX_TRY = 3;
    protected int trytimes = 0;

    /* loaded from: classes6.dex */
    public interface LoadHandler {
        void loaded(int i, Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a extends AsyncTask<String, Void, String> {
        private String b;

        static {
            kge.a(-57174078);
        }

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
            return r3.b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
            if (r0 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
            r0.close();
         */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String doInBackground(java.lang.String... r4) {
            /*
                r3 = this;
                r0 = 0
                r4 = r4[r0]
                r3.b = r4
                java.net.URL r4 = new java.net.URL     // Catch: java.net.MalformedURLException -> L5a
                java.lang.String r0 = r3.b     // Catch: java.net.MalformedURLException -> L5a
                r4.<init>(r0)     // Catch: java.net.MalformedURLException -> L5a
                r0 = 0
                java.io.InputStream r0 = r4.openStream()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                com.taobao.calendar.sdk.common.FileCache r4 = new com.taobao.calendar.sdk.common.FileCache     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                com.taobao.calendar.sdk.common.NetImage r1 = com.taobao.calendar.sdk.common.NetImage.this     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                android.content.Context r1 = com.taobao.calendar.sdk.common.NetImage.access$000(r1)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                java.lang.String r1 = r3.b     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                r4.put(r1, r0)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                java.lang.String r1 = r3.b     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                java.io.InputStream r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                if (r4 == 0) goto L31
                com.taobao.calendar.sdk.common.NetImage r1 = com.taobao.calendar.sdk.common.NetImage.this     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                r1.imgBmp = r4     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            L31:
                if (r0 == 0) goto L5e
            L33:
                r0.close()     // Catch: java.io.IOException -> L5e
                goto L5e
            L37:
                r4 = move-exception
                goto L54
            L39:
                java.lang.String r4 = "NetImage"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
                r1.<init>()     // Catch: java.lang.Throwable -> L37
                java.lang.String r2 = "Couldn't load bitmap from url: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L37
                java.lang.String r2 = r3.b     // Catch: java.lang.Throwable -> L37
                r1.append(r2)     // Catch: java.lang.Throwable -> L37
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L37
                android.util.Log.e(r4, r1)     // Catch: java.lang.Throwable -> L37
                if (r0 == 0) goto L5e
                goto L33
            L54:
                if (r0 == 0) goto L59
                r0.close()     // Catch: java.io.IOException -> L59
            L59:
                throw r4     // Catch: java.net.MalformedURLException -> L5a
            L5a:
                r4 = move-exception
                r4.printStackTrace()
            L5e:
                java.lang.String r4 = r3.b
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.calendar.sdk.common.NetImage.a.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            NetImage.this.trytimes++;
            if (NetImage.this.imgBmp == null) {
                NetImage netImage = NetImage.this;
                netImage.load(str, netImage.loadHandler);
                return;
            }
            NetImage netImage2 = NetImage.this;
            netImage2.trytimes = 0;
            netImage2.loadHandler.loaded(NetImage.SUCCESS, NetImage.this.imgBmp);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    static {
        kge.a(-306543345);
        SUCCESS = 1;
        FAIL = 2;
    }

    public NetImage(Context context) {
        this.mContext = context;
    }

    public void load(String str, LoadHandler loadHandler) {
        a aVar = this.task;
        if (aVar != null) {
            aVar.cancel(true);
        }
        this.img = str;
        this.loadHandler = loadHandler;
        if (this.trytimes >= this.MAX_TRY) {
            Log.e("NetImage", "try loading image " + this.MAX_TRY + " times, never success" + str);
            loadHandler.loaded(FAIL, null);
        } else if (str.equals("") || str == null) {
            loadHandler.loaded(FAIL, null);
        } else {
            InputStream inputStream = new FileCache(this.mContext).get(str);
            if (inputStream != null) {
                this.imgBmp = BitmapFactory.decodeStream(inputStream);
                Bitmap bitmap = this.imgBmp;
                if (bitmap != null) {
                    loadHandler.loaded(SUCCESS, bitmap);
                    return;
                }
            }
            this.imgBmp = null;
            try {
                this.task = new a();
                this.task.execute(str);
            } catch (RejectedExecutionException e) {
                Log.e("IMGVIEW", e.getStackTrace().toString());
            }
        }
    }

    public void maxRetry(int i) {
        this.MAX_TRY = i;
    }
}
