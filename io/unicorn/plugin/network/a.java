package io.unicorn.plugin.network;

import android.text.TextUtils;
import io.unicorn.plugin.network.ExternalAdapterNetworkProvider;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.rtd;

/* loaded from: classes9.dex */
public class a implements ExternalAdapterNetworkProvider {

    /* renamed from: a  reason: collision with root package name */
    private volatile ExecutorService f24858a;

    /* renamed from: io.unicorn.plugin.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class ThreadFactoryC1063a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadFactory f24860a = Executors.defaultThreadFactory();
        private int b = 0;
        private final String c;

        static {
            kge.a(-12774288);
            kge.a(-1938806936);
        }

        public ThreadFactoryC1063a(String str) {
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f24860a.newThread(runnable);
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append("-");
            int i = this.b + 1;
            this.b = i;
            sb.append(i);
            newThread.setName(sb.toString());
            return newThread;
        }
    }

    static {
        kge.a(1879524315);
        kge.a(-918953544);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HttpURLConnection a(ExternalAdapterNetworkProvider.Request request) throws IOException {
        HttpURLConnection a2 = a(new URL(request.url));
        a2.setConnectTimeout(request.timeout);
        a2.setReadTimeout(request.timeout);
        a2.setUseCaches(false);
        a2.setDoInput(true);
        if (request.params != null) {
            for (String str : request.params.keySet()) {
                a2.addRequestProperty(str, request.params.get(str));
            }
        }
        if ("POST".equals(request.method) || "PUT".equals(request.method) || "PATCH".equals(request.method)) {
            a2.setRequestMethod(request.method);
            if (request.body != null) {
                a2.setDoOutput(true);
                DataOutputStream dataOutputStream = new DataOutputStream(a2.getOutputStream());
                dataOutputStream.write(request.body.getBytes());
                dataOutputStream.close();
            }
        } else {
            a2.setRequestMethod(!TextUtils.isEmpty(request.method) ? request.method : "GET");
        }
        return a2;
    }

    private void a(Runnable runnable) {
        if (this.f24858a == null) {
            synchronized (a.class) {
                if (this.f24858a == null) {
                    this.f24858a = new ThreadPoolExecutor(3, 3, 3000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1063a("unicorn_network"));
                    ((ThreadPoolExecutor) this.f24858a).allowCoreThreadTimeOut(true);
                }
            }
        }
        this.f24858a.execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read == -1) {
                byteArrayOutputStream.flush();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[2048];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    protected HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // io.unicorn.plugin.network.ExternalAdapterNetworkProvider
    public void sendRequest(final ExternalAdapterNetworkProvider.Request request, final ExternalAdapterNetworkProvider.RequestListener requestListener) {
        a(new Runnable() { // from class: io.unicorn.plugin.network.a.1
            @Override // java.lang.Runnable
            public void run() {
                byte[] bArr = null;
                try {
                    HttpURLConnection a2 = a.this.a(request);
                    int responseCode = a2.getResponseCode();
                    if (responseCode < 200 || responseCode > 299) {
                        rtd.e("DefaultNetworkProvider", a.this.b(a2.getErrorStream()));
                    } else {
                        bArr = a.this.a(a2.getInputStream());
                    }
                    if (requestListener == null) {
                        return;
                    }
                    requestListener.onRequestFinish(responseCode, bArr);
                } catch (IOException | IllegalArgumentException e) {
                    e.printStackTrace();
                    ExternalAdapterNetworkProvider.RequestListener requestListener2 = requestListener;
                    if (requestListener2 == null) {
                        return;
                    }
                    requestListener2.onRequestFinish(-1, bArr);
                }
            }
        });
    }
}
