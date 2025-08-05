package com.taobao.weex.adapter;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.common.WXRequest;
import com.taobao.weex.common.WXResponse;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public class DefaultWXHttpAdapter implements IWXHttpAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final IEventReporterDelegate DEFAULT_DELEGATE;
    private ExecutorService mExecutorService;

    /* loaded from: classes9.dex */
    public interface IEventReporterDelegate {
        void httpExchangeFailed(IOException iOException);

        InputStream interpretResponseStream(InputStream inputStream);

        void postConnect();

        void preConnect(HttpURLConnection httpURLConnection, String str);
    }

    public static /* synthetic */ HttpURLConnection access$100(DefaultWXHttpAdapter defaultWXHttpAdapter, WXRequest wXRequest, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpURLConnection) ipChange.ipc$dispatch("79ed10d6", new Object[]{defaultWXHttpAdapter, wXRequest, onHttpListener}) : defaultWXHttpAdapter.openConnection(wXRequest, onHttpListener);
    }

    public static /* synthetic */ byte[] access$200(DefaultWXHttpAdapter defaultWXHttpAdapter, InputStream inputStream, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("11bd786e", new Object[]{defaultWXHttpAdapter, inputStream, onHttpListener}) : defaultWXHttpAdapter.readInputStreamAsBytes(inputStream, onHttpListener);
    }

    public static /* synthetic */ String access$300(DefaultWXHttpAdapter defaultWXHttpAdapter, InputStream inputStream, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bff11c50", new Object[]{defaultWXHttpAdapter, inputStream, onHttpListener}) : defaultWXHttpAdapter.readInputStream(inputStream, onHttpListener);
    }

    static {
        kge.a(517895616);
        kge.a(-2003063592);
        DEFAULT_DELEGATE = new NOPEventReportDelegate();
    }

    private void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        if (this.mExecutorService == null) {
            this.mExecutorService = new ThreadPoolExecutor(3, 3, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.weex.adapter.DefaultWXHttpAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable2}) : new Thread(runnable2, "WX-DefaultWXHttpAdapter-Executor");
                }
            });
        }
        ((ThreadPoolExecutor) this.mExecutorService).allowCoreThreadTimeOut(true);
        this.mExecutorService.execute(runnable);
    }

    @Override // com.taobao.weex.adapter.IWXHttpAdapter
    public void sendRequest(final WXRequest wXRequest, final IWXHttpAdapter.OnHttpListener onHttpListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67369762", new Object[]{this, wXRequest, onHttpListener});
            return;
        }
        if (onHttpListener != null) {
            onHttpListener.onHttpStart();
        }
        execute(new Runnable() { // from class: com.taobao.weex.adapter.DefaultWXHttpAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(wXRequest.instanceId);
                if (wXSDKInstance != null && !wXSDKInstance.P_()) {
                    wXSDKInstance.ar().j();
                }
                WXResponse wXResponse = new WXResponse();
                IEventReporterDelegate eventReporterDelegate = DefaultWXHttpAdapter.this.getEventReporterDelegate();
                try {
                    HttpURLConnection access$100 = DefaultWXHttpAdapter.access$100(DefaultWXHttpAdapter.this, wXRequest, onHttpListener);
                    eventReporterDelegate.preConnect(access$100, wXRequest.body);
                    Map<String, List<String>> headerFields = access$100.getHeaderFields();
                    int responseCode = access$100.getResponseCode();
                    if (onHttpListener != null) {
                        onHttpListener.onHeadersReceived(responseCode, headerFields);
                    }
                    eventReporterDelegate.postConnect();
                    wXResponse.statusCode = String.valueOf(responseCode);
                    if (responseCode < 200 || responseCode > 299) {
                        wXResponse.errorMsg = DefaultWXHttpAdapter.access$300(DefaultWXHttpAdapter.this, access$100.getErrorStream(), onHttpListener);
                        z = false;
                    } else {
                        wXResponse.originalData = DefaultWXHttpAdapter.access$200(DefaultWXHttpAdapter.this, eventReporterDelegate.interpretResponseStream(access$100.getInputStream()), onHttpListener);
                    }
                    if (onHttpListener != null) {
                        onHttpListener.onHttpFinish(wXResponse);
                    }
                } catch (IOException | IllegalArgumentException e) {
                    e.printStackTrace();
                    wXResponse.statusCode = "-1";
                    wXResponse.errorCode = "-1";
                    wXResponse.errorMsg = e.getMessage();
                    IWXHttpAdapter.OnHttpListener onHttpListener2 = onHttpListener;
                    if (onHttpListener2 != null) {
                        onHttpListener2.onHttpFinish(wXResponse);
                    }
                    if (e instanceof IOException) {
                        try {
                            eventReporterDelegate.httpExchangeFailed((IOException) e);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    z = false;
                }
                if (wXSDKInstance == null || wXSDKInstance.P_()) {
                    return;
                }
                wXSDKInstance.ar().a(z, (String) null);
            }
        });
    }

    private HttpURLConnection openConnection(WXRequest wXRequest, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("de989cbe", new Object[]{this, wXRequest, onHttpListener});
        }
        HttpURLConnection createConnection = createConnection(new URL(wXRequest.url));
        createConnection.setConnectTimeout(wXRequest.timeoutMs);
        createConnection.setReadTimeout(wXRequest.timeoutMs);
        createConnection.setUseCaches(false);
        createConnection.setDoInput(true);
        if (wXRequest.paramMap != null) {
            for (String str : wXRequest.paramMap.keySet()) {
                createConnection.addRequestProperty(str, wXRequest.paramMap.get(str));
            }
        }
        if ("POST".equals(wXRequest.method) || "PUT".equals(wXRequest.method) || "PATCH".equals(wXRequest.method)) {
            createConnection.setRequestMethod(wXRequest.method);
            if (wXRequest.body != null) {
                if (onHttpListener != null) {
                    onHttpListener.onHttpUploadProgress(0);
                }
                createConnection.setDoOutput(true);
                DataOutputStream dataOutputStream = new DataOutputStream(createConnection.getOutputStream());
                dataOutputStream.write(wXRequest.body.getBytes());
                dataOutputStream.close();
                if (onHttpListener != null) {
                    onHttpListener.onHttpUploadProgress(100);
                }
            }
        } else if (!TextUtils.isEmpty(wXRequest.method)) {
            createConnection.setRequestMethod(wXRequest.method);
        } else {
            createConnection.setRequestMethod("GET");
        }
        return createConnection;
    }

    private byte[] readInputStreamAsBytes(InputStream inputStream, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9a4578a", new Object[]{this, inputStream, onHttpListener});
        }
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                i += read;
                if (onHttpListener != null) {
                    onHttpListener.onHttpResponseProgress(i);
                }
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private String readInputStream(InputStream inputStream, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf757afe", new Object[]{this, inputStream, onHttpListener});
        }
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[2048];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
                if (onHttpListener != null) {
                    onHttpListener.onHttpResponseProgress(sb.length());
                }
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public HttpURLConnection createConnection(URL url) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpURLConnection) ipChange.ipc$dispatch("a9e1c93f", new Object[]{this, url}) : (HttpURLConnection) url.openConnection();
    }

    public IEventReporterDelegate getEventReporterDelegate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IEventReporterDelegate) ipChange.ipc$dispatch("9c30a347", new Object[]{this}) : DEFAULT_DELEGATE;
    }

    /* loaded from: classes9.dex */
    public static class NOPEventReportDelegate implements IEventReporterDelegate {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2108018760);
            kge.a(1286217435);
        }

        @Override // com.taobao.weex.adapter.DefaultWXHttpAdapter.IEventReporterDelegate
        public void httpExchangeFailed(IOException iOException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cce0c25", new Object[]{this, iOException});
            }
        }

        @Override // com.taobao.weex.adapter.DefaultWXHttpAdapter.IEventReporterDelegate
        public InputStream interpretResponseStream(InputStream inputStream) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("85dca6a1", new Object[]{this, inputStream}) : inputStream;
        }

        @Override // com.taobao.weex.adapter.DefaultWXHttpAdapter.IEventReporterDelegate
        public void postConnect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa9ce3b1", new Object[]{this});
            }
        }

        @Override // com.taobao.weex.adapter.DefaultWXHttpAdapter.IEventReporterDelegate
        public void preConnect(HttpURLConnection httpURLConnection, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2f62181", new Object[]{this, httpURLConnection, str});
            }
        }

        private NOPEventReportDelegate() {
        }
    }
}
