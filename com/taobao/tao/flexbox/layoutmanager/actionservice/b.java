package com.taobao.tao.flexbox.layoutmanager.actionservice;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.util.p;
import android.text.TextUtils;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f19952a;
    private Handler b = new Handler(Looper.getMainLooper());

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(String str);
    }

    static {
        kge.a(-686755361);
    }

    public static /* synthetic */ Handler a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("24814478", new Object[]{bVar}) : bVar.b;
    }

    private b() {
    }

    public static synchronized b a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("93636614", new Object[0]);
            }
            if (f19952a == null) {
                f19952a = new b();
            }
            return f19952a;
        }
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4ab9fb", new Object[]{this, str, aVar});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            new HttpNetwork(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a()).asyncSend(new RequestImpl(str), null, null, new AnonymousClass1(str, aVar));
        }
    }

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.actionservice.b$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19953a;
        public final /* synthetic */ a b;

        public AnonymousClass1(String str, a aVar) {
            this.f19953a = str;
            this.b = aVar;
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else if (finishEvent != null && finishEvent.getHttpCode() == 200) {
            } else {
                if (this.f19953a.startsWith("https") && finishEvent.getHttpCode() == -402) {
                    b.this.a(p.c(this.f19953a), this.b);
                } else {
                    b.a(b.this).post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.b.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (AnonymousClass1.this.b == null) {
                            } else {
                                AnonymousClass1.this.b.a();
                            }
                        }
                    });
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.InputStreamListener
        public void onInputStreamGet(final ParcelableInputStream parcelableInputStream, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, obj});
            } else {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.b.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        ByteArrayOutputStream byteArrayOutputStream;
                        Throwable th;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ByteArrayOutputStream byteArrayOutputStream2 = null;
                        try {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream(parcelableInputStream.length());
                                try {
                                    byte[] bArr = new byte[2048];
                                    while (true) {
                                        int read = parcelableInputStream.read(bArr);
                                        if (read == -1) {
                                            byteArrayOutputStream.flush();
                                            final String byteArrayOutputStream3 = byteArrayOutputStream.toString("utf-8");
                                            b.a(b.this).post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.b.1.2.1
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange3 = $ipChange;
                                                    if (ipChange3 instanceof IpChange) {
                                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                    } else if (AnonymousClass1.this.b == null) {
                                                    } else {
                                                        AnonymousClass1.this.b.a(byteArrayOutputStream3);
                                                    }
                                                }
                                            });
                                            try {
                                                byteArrayOutputStream.close();
                                                return;
                                            } catch (IOException unused) {
                                                return;
                                            }
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    }
                                } catch (Exception unused2) {
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    b.a(b.this).post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.b.1.2.2
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else if (AnonymousClass1.this.b == null) {
                                            } else {
                                                AnonymousClass1.this.b.a(null);
                                            }
                                        }
                                    });
                                    if (byteArrayOutputStream2 == null) {
                                        return;
                                    }
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (IOException unused3) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                            }
                        } catch (Throwable th3) {
                            byteArrayOutputStream = null;
                            th = th3;
                        }
                    }
                });
            }
        }
    }
}
