package com.taobao.android.litecreator.util;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class au {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f13490a;

    static {
        kge.a(181600885);
        f13490a = new Handler(Looper.getMainLooper());
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            if (a()) {
                runnable.run();
            } else {
                f13490a.post(runnable);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.android.litecreator.util.au$1] */
    public static void b(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.android.litecreator.util.au.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    runnable.run();
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.android.litecreator.util.au$2] */
    public static void a(final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f8e64", new Object[]{runnable, runnable2});
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.android.litecreator.util.au.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(Void r4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, r4});
                    } else {
                        a(r4);
                    }
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    runnable.run();
                    return null;
                }

                public void a(Void r4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6f8d528f", new Object[]{this, r4});
                    } else {
                        runnable2.run();
                    }
                }
            }.execute(new Void[0]);
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            f13490a.post(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            f13490a.postDelayed(runnable, j);
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9021f9e9", new Object[]{runnable});
        } else {
            f13490a.removeCallbacks(runnable);
        }
    }

    public static void a(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91fcae", new Object[]{runnable, new Boolean(z)});
        } else if (runnable == null) {
        } else {
            if (z) {
                b(runnable);
            } else {
                a(runnable);
            }
        }
    }
}
