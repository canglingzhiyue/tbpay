package android.taobao.windvane.export.network;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes2.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1219817609);
    }

    public static WebResourceResponse a(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("c6e0ed7c", new Object[]{webView, str});
        }
        if ((webView instanceof WVUCWebView) && webView.getCurrentViewCoreType() != 3 && !TextUtils.isEmpty(str)) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final a aVar = new a();
            if (f.a(str, new RequestCallback() { // from class: android.taobao.windvane.export.network.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
                    r0 = r5[1];
                 */
                @Override // android.taobao.windvane.export.network.RequestCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onResponse(int r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10) {
                    /*
                        r8 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.export.network.k.AnonymousClass1.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        if (r1 == 0) goto L1d
                        r1 = 3
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r1[r4] = r8
                        java.lang.Integer r4 = new java.lang.Integer
                        r4.<init>(r9)
                        r1[r3] = r4
                        r1[r2] = r10
                        java.lang.String r9 = "bb214fe9"
                        r0.ipc$dispatch(r9, r1)
                        return
                    L1d:
                        java.util.Set r9 = r10.entrySet()
                        java.util.Iterator r9 = r9.iterator()
                    L25:
                        boolean r10 = r9.hasNext()
                        r0 = 0
                        if (r10 == 0) goto L8e
                        java.lang.Object r10 = r9.next()
                        java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                        if (r10 == 0) goto L25
                        java.lang.Object r1 = r10.getKey()
                        java.lang.String r1 = (java.lang.String) r1
                        if (r1 == 0) goto L46
                        java.lang.String r5 = "Content-Type"
                        boolean r1 = r1.equalsIgnoreCase(r5)
                        if (r1 == 0) goto L46
                        r1 = 1
                        goto L47
                    L46:
                        r1 = 0
                    L47:
                        if (r1 == 0) goto L25
                        java.lang.Object r9 = r10.getValue()
                        java.util.List r9 = (java.util.List) r9
                        if (r9 == 0) goto L8e
                        int r10 = r9.size()
                        if (r10 <= 0) goto L8e
                        java.lang.Object r9 = r9.get(r4)
                        java.lang.String r9 = (java.lang.String) r9
                        boolean r10 = android.text.TextUtils.isEmpty(r9)
                        if (r10 != 0) goto L8e
                        java.lang.String r10 = ";"
                        java.lang.String[] r9 = r9.split(r10)     // Catch: java.lang.Exception -> L8e
                        r10 = r9[r4]     // Catch: java.lang.Exception -> L8e
                        r1 = 1
                    L6c:
                        int r5 = r9.length     // Catch: java.lang.Exception -> L8f
                        if (r1 >= r5) goto L8f
                        r5 = r9[r1]     // Catch: java.lang.Exception -> L8f
                        java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> L8f
                        java.lang.String r6 = "="
                        java.lang.String[] r5 = r5.split(r6)     // Catch: java.lang.Exception -> L8f
                        int r6 = r5.length     // Catch: java.lang.Exception -> L8f
                        if (r6 != r2) goto L8b
                        r6 = r5[r4]     // Catch: java.lang.Exception -> L8f
                        java.lang.String r7 = "charset"
                        boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> L8f
                        if (r6 == 0) goto L8b
                        r0 = r5[r3]     // Catch: java.lang.Exception -> L8f
                        goto L8f
                    L8b:
                        int r1 = r1 + 1
                        goto L6c
                    L8e:
                        r10 = r0
                    L8f:
                        android.taobao.windvane.export.network.k$a r9 = android.taobao.windvane.export.network.k.a.this
                        r9.b(r0)
                        android.taobao.windvane.export.network.k$a r9 = android.taobao.windvane.export.network.k.a.this
                        r9.a(r10)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.export.network.k.AnonymousClass1.onResponse(int, java.util.Map):void");
                }

                @Override // android.taobao.windvane.export.network.RequestCallback
                public void onReceiveData(byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
                    } else {
                        a.this.a(bArr);
                    }
                }

                @Override // android.taobao.windvane.export.network.RequestCallback
                public void onFinish() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    } else {
                        countDownLatch.countDown();
                    }
                }

                @Override // android.taobao.windvane.export.network.RequestCallback
                public void onError(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str2});
                    } else {
                        countDownLatch.countDown();
                    }
                }
            }, (l) null)) {
                try {
                    boolean await = countDownLatch.await(10L, TimeUnit.SECONDS);
                    WebResourceResponse a2 = aVar.a();
                    if (await) {
                        return a2;
                    }
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, Constants.TAG).a(Constants.EVENT_INTERCEPT_TIMEOUT).a("url", (Object) str).a();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f1604a;
        private String b;
        private final ByteArrayOutputStream c = new ByteArrayOutputStream();
        private boolean d = false;

        static {
            kge.a(-496204595);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3bc5e123", new Object[]{this, str});
            }
            this.f1604a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a5f56942", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public synchronized a a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cfcaaa06", new Object[]{this, bArr});
            } else if (this.d) {
                return this;
            } else {
                try {
                    this.c.write(bArr);
                    return this;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public synchronized WebResourceResponse a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WebResourceResponse) ipChange.ipc$dispatch("31621d68", new Object[]{this});
            } else if (this.d) {
                return null;
            } else {
                this.d = true;
                byte[] byteArray = this.c.toByteArray();
                try {
                    this.c.close();
                    return new WebResourceResponse(this.f1604a, this.b, new ByteArrayInputStream(byteArray, 0, byteArray.length));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
