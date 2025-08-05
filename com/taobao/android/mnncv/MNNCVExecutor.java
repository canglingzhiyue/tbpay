package com.taobao.android.mnncv;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.g;
import com.taobao.mrt.task.i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class MNNCVExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f14396a;
    private final e b;
    private final String c;
    private final String d;
    private String e;
    private boolean f;
    private MNNExecutorState g;
    private final CachePolicy h;
    private String i;

    /* loaded from: classes6.dex */
    public enum CachePolicy {
        NoCache,
        CacheManually,
        CacheConfigOnly
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum MNNExecutorState {
        MNNCVExecutorInited,
        MNNCVExecutorPreparing,
        MNNCVExecutorPrepared
    }

    /* loaded from: classes6.dex */
    public interface a {
        void onResult(MRTRuntimeException mRTRuntimeException);
    }

    /* loaded from: classes6.dex */
    public interface b {
        void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map);
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a(String str);
    }

    public static native byte[] nativeGetByteArray(int[] iArr);

    public static /* synthetic */ MNNExecutorState a(MNNCVExecutor mNNCVExecutor, MNNExecutorState mNNExecutorState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MNNExecutorState) ipChange.ipc$dispatch("a10a5704", new Object[]{mNNCVExecutor, mNNExecutorState});
        }
        mNNCVExecutor.g = mNNExecutorState;
        return mNNExecutorState;
    }

    public static /* synthetic */ String a(MNNCVExecutor mNNCVExecutor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8027ae7a", new Object[]{mNNCVExecutor}) : mNNCVExecutor.c;
    }

    public static /* synthetic */ void a(MNNCVExecutor mNNCVExecutor, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4ca87", new Object[]{mNNCVExecutor, aVar});
        } else {
            mNNCVExecutor.b(aVar);
        }
    }

    public static /* synthetic */ String b(MNNCVExecutor mNNCVExecutor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14661e19", new Object[]{mNNCVExecutor}) : mNNCVExecutor.e;
    }

    public MNNCVExecutor(String str) {
        this(str, false);
    }

    @Deprecated
    public MNNCVExecutor(String str, boolean z) {
        this(str, z ? CachePolicy.CacheConfigOnly : CachePolicy.NoCache, null);
    }

    public MNNCVExecutor(String str, String str2) {
        this(str, TextUtils.isEmpty(str2) ? CachePolicy.NoCache : CachePolicy.CacheManually, str2);
    }

    public MNNCVExecutor(String str, CachePolicy cachePolicy, String str2) {
        this.f = false;
        this.f14396a = null;
        this.g = null;
        this.i = MNNCV.mServiceId;
        this.c = str;
        this.e = str;
        this.b = new e();
        this.g = MNNExecutorState.MNNCVExecutorInited;
        this.h = cachePolicy;
        this.d = str2;
    }

    private synchronized void b(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1242bca", new Object[]{this, aVar});
        } else if (!MNNCV.isTaskRunnable(this.c)) {
            com.taobao.mrt.utils.a.c("MNNCVExecutor", "task not register");
            if (aVar != null) {
                aVar.onResult(new MRTRuntimeException(209, "task not register"));
            }
        } else if (this.g == MNNExecutorState.MNNCVExecutorPrepared) {
            if (aVar != null) {
                aVar.onResult(null);
            }
        } else if (this.g == MNNExecutorState.MNNCVExecutorPreparing) {
            if (aVar != null) {
                aVar.onResult(new MRTRuntimeException(60006, ""));
            }
        } else {
            this.g = MNNExecutorState.MNNCVExecutorPreparing;
            g.a().a(this.e, "__mrt_init__", null, false, this.i, this.b, new i() { // from class: com.taobao.android.mnncv.MNNCVExecutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mrt.task.i
                public void onCompletion(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
                        return;
                    }
                    com.taobao.mrt.utils.a.a("MNNCVExecutor", "[prepareWithCallback] code:" + i);
                    if (mRTRuntimeException != null || !(obj instanceof Map)) {
                        MNNCVExecutor.a(MNNCVExecutor.this, MNNExecutorState.MNNCVExecutorInited);
                    } else {
                        MNNCVExecutor.a(MNNCVExecutor.this, MNNExecutorState.MNNCVExecutorPrepared);
                        Map map = (Map) obj;
                        if (map.containsKey("MRT_INST")) {
                            MNNCVExecutor.this.f14396a = map.remove("MRT_INST");
                        }
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.onResult(mRTRuntimeException);
                }
            });
        }
    }

    public synchronized void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2baa0589", new Object[]{this, aVar});
            return;
        }
        com.taobao.mrt.utils.a.a("MNNCVExecutor", "[prepareWithCallback]");
        if (this.h == CachePolicy.CacheManually) {
            this.e = this.c + "_" + this.d;
            this.i = MNNCV.mServiceIdCache;
        } else {
            this.e = this.c;
            this.i = MNNCV.mServiceId;
        }
        if (MNNCV.isCVDisabled()) {
            if (aVar != null) {
                aVar.onResult(new MRTRuntimeException(83, "MNNCV is disabled by orange"));
            }
            return;
        }
        MRTTaskDescription b2 = g.a().b(this.c);
        if (this.h == CachePolicy.CacheConfigOnly && b2 == null) {
            com.taobao.android.mnncv.mtop.a.a().b(this.c);
        }
        if (this.h == CachePolicy.CacheManually) {
            com.taobao.mrt.thread.a.a().a(new Runnable() { // from class: com.taobao.android.mnncv.MNNCVExecutor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MRTTaskDescription b3 = d.a().b(MNNCVExecutor.a(MNNCVExecutor.this));
                    if (b3 == null) {
                        aVar.onResult(new MRTRuntimeException(60009, "local not ready"));
                        return;
                    }
                    g.a().a(b3);
                    MNNCVExecutor.a(MNNCVExecutor.this, aVar);
                }
            }, 0);
        } else {
            b(aVar);
        }
    }

    public void a(Map<String, Object> map, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e52d5d", new Object[]{this, map, bVar});
            return;
        }
        com.taobao.mrt.utils.a.a("MNNCVExecutor", "[process]");
        if (MNNCV.isCVDisabled()) {
            com.taobao.mrt.utils.a.c("MNNCVExecutor", "MNNCV is disabled by orange");
            if (bVar == null) {
                return;
            }
            bVar.onResult(new MRTRuntimeException(83, "MNNCV is disabled by orange"), null);
        } else if (!MNNCV.isTaskRunnable(this.c)) {
            com.taobao.mrt.utils.a.c("MNNCVExecutor", "task not register");
            if (bVar == null) {
                return;
            }
            bVar.onResult(new MRTRuntimeException(209, "task not register"), null);
        } else if (this.g != MNNExecutorState.MNNCVExecutorPrepared) {
            if (bVar == null) {
                return;
            }
            bVar.onResult(new MRTRuntimeException(s.DX_TEMPLATE_UNZIP_ERROR, "not prepared"), null);
        } else {
            ArrayList arrayList = new ArrayList();
            if (map == null) {
                map = new HashMap<>();
            }
            Object obj = this.f14396a;
            if (obj != null) {
                map.put("MRT_INST", obj);
                arrayList.add(map);
                g.a().a(this.e, "__mrt_process__", arrayList, false, this.i, this.b, new i() { // from class: com.taobao.android.mnncv.MNNCVExecutor.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.mrt.task.i
                    public void onCompletion(int i, MRTRuntimeException mRTRuntimeException, Object obj2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj2});
                            return;
                        }
                        com.taobao.mrt.utils.a.a("MNNCVExecutor", "[onCompletion] result:" + obj2);
                        b bVar2 = bVar;
                        if (bVar2 == null) {
                            return;
                        }
                        if (mRTRuntimeException != null) {
                            bVar2.onResult(mRTRuntimeException, null);
                        } else if (obj2 == null || !(obj2 instanceof Map)) {
                            bVar.onResult(new MRTRuntimeException(407, "result format error"), null);
                        } else {
                            bVar2.onResult(mRTRuntimeException, (Map) obj2);
                        }
                    }
                });
                return;
            }
            com.taobao.mrt.utils.a.c("MNNCVExecutor", "python instance value is invalid");
            if (bVar == null) {
                return;
            }
            bVar.onResult(new MRTRuntimeException(60006, "python instance value is invalid"), null);
        }
    }

    @Deprecated
    public Map<String, Object> a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        final Object[] objArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        a(map, new b() { // from class: com.taobao.android.mnncv.MNNCVExecutor.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.mnncv.MNNCVExecutor.b
            public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map2});
                    return;
                }
                if (mRTRuntimeException != null) {
                    com.taobao.mrt.utils.a.c("MNNCVExecutor", "[onCompletion] e:" + mRTRuntimeException.errorCode);
                }
                objArr[0] = map2;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(60L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            com.taobao.mrt.utils.a.a("MNNCVExecutor", "", e);
        }
        Object obj = objArr[0];
        if (obj != null && (obj instanceof Map)) {
            return (Map) obj;
        }
        com.taobao.mrt.utils.a.c("MNNCVExecutor", "result is not a map");
        return null;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            a();
        } catch (Throwable unused) {
            com.taobao.mrt.utils.a.c("MNNCVExecutor", "destroy failed");
        }
        super.finalize();
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f) {
        } else {
            com.taobao.mrt.utils.a.a("MNNCVExecutor", "[destroy]");
            d.a().a(this.e);
            if (MNNCV.isCVDisabled()) {
                com.taobao.mrt.utils.a.c("MNNCVExecutor", "MNNCV is disabled by orange");
            } else if (!MNNCV.isTaskRunnable(this.c)) {
                com.taobao.mrt.utils.a.c("MNNCVExecutor", "task not register");
            } else {
                this.f = true;
                if (this.g != MNNExecutorState.MNNCVExecutorPrepared) {
                    com.taobao.mrt.utils.a.c("MNNCVExecutor", "call destroy before prepared !!!");
                } else if (this.f14396a != null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(hashMap);
                    hashMap.put("MRT_INST", this.f14396a);
                    g.a().a(this.e, "__mrt_destroy__", arrayList, false, this.i, null, new i() { // from class: com.taobao.android.mnncv.MNNCVExecutor.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.mrt.task.i
                        public void onCompletion(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
                            } else if (mRTRuntimeException != null) {
                                com.taobao.mrt.utils.a.a("MNNCVExecutor", "[destroy] python instance failed", mRTRuntimeException);
                            } else {
                                com.taobao.mrt.utils.a.b("MNNCVExecutor", "[destroy] python instance success");
                            }
                        }
                    });
                    this.f14396a = null;
                } else {
                    com.taobao.mrt.utils.a.c("MNNCVExecutor", "python instance value is invalid");
                }
            }
        }
    }

    public void a(final com.taobao.android.mnncv.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2686af6", new Object[]{this, cVar});
        } else {
            g.a().a(this.e, "__mrt_init__", null, true, this.i, null, new i() { // from class: com.taobao.android.mnncv.MNNCVExecutor.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mrt.task.i
                public void onCompletion(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
                    } else if (cVar == null) {
                    } else {
                        String str = null;
                        if (mRTRuntimeException == null) {
                            str = com.taobao.mrt.task.e.c + File.separator + MNNCVExecutor.b(MNNCVExecutor.this);
                        }
                        cVar.onCompletion(str, mRTRuntimeException);
                    }
                }
            });
        }
    }
}
