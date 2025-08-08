package com.taobao.android.themis.graphics.inspector;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes6.dex */
public abstract class InspectorRepository {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static d b;

    /* renamed from: a  reason: collision with root package name */
    public HOST f15560a;

    /* loaded from: classes6.dex */
    public enum HOST {
        DAILY,
        ONLINE
    }

    /* loaded from: classes6.dex */
    public enum JSType {
        JS,
        BINARY
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a(d dVar);
    }

    /* loaded from: classes6.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f15564a;
        public String b;
        public JSType c;

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            byte[] bArr = this.f15564a;
            return bArr != null && bArr.length > 0 && !StringUtils.isEmpty(this.b) && this.c != null;
        }
    }

    public abstract void b(c cVar);

    public static /* synthetic */ d a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4e0c58ae", new Object[]{dVar});
        }
        b = dVar;
        return dVar;
    }

    public static InspectorRepository a(HOST host, JSType jSType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InspectorRepository) ipChange.ipc$dispatch("dc53da1d", new Object[]{host, jSType}) : new b(host, jSType);
    }

    public InspectorRepository(HOST host) {
        this.f15560a = host;
    }

    public void a(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff079b7d", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            try {
                if (b != null && b.a()) {
                    cVar.a(b);
                } else {
                    b(new c() { // from class: com.taobao.android.themis.graphics.inspector.InspectorRepository.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.themis.graphics.inspector.InspectorRepository.c
                        public void a(d dVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ff080fdc", new Object[]{this, dVar});
                                return;
                            }
                            if (dVar != null && dVar.a()) {
                                InspectorRepository.a(dVar);
                            }
                            cVar.a(dVar);
                        }
                    });
                }
            } catch (Throwable th) {
                Log.e("themis:inspector", "failed to load resource: " + th.getMessage());
                cVar.a(null);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends InspectorRepository {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final a c;
        private final JSType d;

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b9e2d42", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ JSType b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSType) ipChange.ipc$dispatch("6f9b09c4", new Object[]{bVar}) : bVar.d;
        }

        public b(HOST host, JSType jSType) {
            super(host);
            StringBuilder sb = new StringBuilder();
            sb.append(host == HOST.DAILY ? "https://dev.g.alicdn.com/ThemisBrings/themis-gpu-inspector/" : "https://g.alicdn.com/ThemisBrings/themis-gpu-inspector/");
            sb.append("0.0.1");
            sb.append("/dist/");
            sb.append(jSType == JSType.JS ? "index.bundle.js" : "index.bundle.v20.wlm");
            this.b = sb.toString();
            this.d = jSType;
            Log.e("themis:inspector", "will fetch inspector from: " + this.b);
            this.c = new a();
        }

        @Override // com.taobao.android.themis.graphics.inspector.InspectorRepository
        public void b(final c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c613827e", new Object[]{this, cVar});
            } else {
                this.c.a(this.b, new a.InterfaceC0600a() { // from class: com.taobao.android.themis.graphics.inspector.InspectorRepository.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.themis.graphics.inspector.InspectorRepository.a.InterfaceC0600a
                    public void a(byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                            return;
                        }
                        d dVar = new d();
                        dVar.b = b.a(b.this);
                        dVar.f15564a = bArr;
                        dVar.c = b.b(b.this);
                        cVar.a(dVar);
                    }

                    @Override // com.taobao.android.themis.graphics.inspector.InspectorRepository.a.InterfaceC0600a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            cVar.a(null);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends AsyncTask<String, Void, byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private InterfaceC0600a f15562a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.taobao.android.themis.graphics.inspector.InspectorRepository$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public interface InterfaceC0600a {
            void a();

            void a(byte[] bArr);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ byte[] doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, bArr});
            } else {
                a(bArr);
            }
        }

        public synchronized void a(String str, InterfaceC0600a interfaceC0600a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14076c", new Object[]{this, str, interfaceC0600a});
                return;
            }
            this.f15562a = interfaceC0600a;
            execute(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v13, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        public byte[] a(String... strArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            IpChange ipChange = $ipChange;
            ?? r3 = ipChange instanceof IpChange;
            ?? r4 = 1;
            if (r3 != 0) {
                return (byte[]) ipChange.ipc$dispatch("729b8806", new Object[]{this, strArr});
            }
            try {
                try {
                    URL url = new URL(strArr[0]);
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        r3 = (HttpURLConnection) url.openConnection();
                    } catch (Exception e) {
                        e = e;
                        r3 = 0;
                        inputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        r3 = 0;
                        r4 = 0;
                    }
                } catch (Exception e2) {
                    e = e2;
                    r3 = 0;
                    inputStream = null;
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    r3 = 0;
                    r4 = 0;
                    byteArrayOutputStream = null;
                }
                try {
                    r3.setConnectTimeout(3000);
                    r3.setDoInput(true);
                    if (r3.getResponseCode() != 200) {
                        if (r3 != 0) {
                            r3.disconnect();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            Log.e("themis:inspector", "download exception: " + th3.getMessage());
                        }
                        return null;
                    }
                    inputStream = r3.getInputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        if (strArr[0].contains("wlm")) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (r3 != 0) {
                                r3.disconnect();
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    Log.e("themis:inspector", "download exception: " + th4.getMessage());
                                }
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th5) {
                                Log.e("themis:inspector", "download exception: " + th5.getMessage());
                            }
                            return byteArray;
                        }
                        byte[] bytes = byteArrayOutputStream.toString("UTF-8").getBytes();
                        if (r3 != 0) {
                            r3.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th6) {
                                Log.e("themis:inspector", "download exception: " + th6.getMessage());
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th7) {
                            Log.e("themis:inspector", "download exception: " + th7.getMessage());
                        }
                        return bytes;
                    } catch (Exception e3) {
                        e = e3;
                        Log.e("themis:inspector", "download exception: " + e.getMessage());
                        if (r3 != 0) {
                            r3.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th8) {
                                Log.e("themis:inspector", "download exception: " + th8.getMessage());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th9) {
                                Log.e("themis:inspector", "download exception: " + th9.getMessage());
                            }
                        }
                        return null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    inputStream = null;
                } catch (Throwable th10) {
                    th = th10;
                    r4 = 0;
                    if (r3 != 0) {
                        r3.disconnect();
                    }
                    if (r4 != 0) {
                        try {
                            r4.close();
                        } catch (Throwable th11) {
                            Log.e("themis:inspector", "download exception: " + th11.getMessage());
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th12) {
                            Log.e("themis:inspector", "download exception: " + th12.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th13) {
                th = th13;
            }
        }

        public void a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            } else if (bArr != null && bArr.length > 0) {
                this.f15562a.a(bArr);
            } else {
                this.f15562a.a();
            }
        }
    }
}
