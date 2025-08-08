package com.taobao.login4android.uninstall;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.heytap.mspsdk.keychain.impl.OnResultListener;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.lang.reflect.Field;
import java.util.HashMap;
import tb.cwh;
import tb.cwk;
import tb.cwl;

/* loaded from: classes7.dex */
public class OppoKeyChain {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SDK_REMOTE_ERROR = -3751;
    private static final String TAG = "login.OppoKeyChain";
    private final Context context;
    private boolean initialized;

    /* renamed from: com.taobao.login4android.uninstall.OppoKeyChain$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass2 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f17974a;
        public final /* synthetic */ CommonDataCallback b;

        public AnonymousClass2(HashMap hashMap, CommonDataCallback commonDataCallback) {
            this.f17974a = hashMap;
            this.b = commonDataCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                LoginTLogAdapter.trace(OppoKeyChain.TAG, "queryItem commit");
                cwk.b(OppoKeyChain.access$000(OppoKeyChain.this), this.f17974a, new OnResultListener() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.heytap.mspsdk.keychain.impl.OnResultListener
                    public void onResult(final cwl cwlVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("df7d775b", new Object[]{this, cwlVar});
                            return;
                        }
                        LoginTLogAdapter.trace(OppoKeyChain.TAG, "queryItem on result=" + cwlVar);
                        MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.2.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (cwlVar.a() == 0) {
                                    AnonymousClass2.this.b.onSuccess(cwlVar.c());
                                } else {
                                    AnonymousClass2.this.b.onFail(cwlVar.a(), cwlVar.b());
                                }
                            }
                        });
                    }
                });
            } catch (Exception e) {
                LoginTLogAdapter.trace(OppoKeyChain.TAG, "queryItem error:Exception=", e);
                CommonDataCallback commonDataCallback = this.b;
                commonDataCallback.onFail(-3754, "call_query_error_" + e.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("code", "-3754");
                hashMap.put("msg", e.getMessage());
                UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_failure_query_error", hashMap);
            }
        }
    }

    /* renamed from: com.taobao.login4android.uninstall.OppoKeyChain$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass3 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CommonDataCallback f17977a;
        public final /* synthetic */ HashMap c;

        public AnonymousClass3(HashMap hashMap, CommonDataCallback commonDataCallback) {
            this.c = hashMap;
            this.f17977a = commonDataCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                cwk.a(OppoKeyChain.access$000(OppoKeyChain.this), this.c, new OnResultListener() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.heytap.mspsdk.keychain.impl.OnResultListener
                    public void onResult(final cwl cwlVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("df7d775b", new Object[]{this, cwlVar});
                        } else {
                            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.3.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (cwlVar.a() == 0) {
                                        AnonymousClass3.this.f17977a.onSuccess(cwlVar.c());
                                    } else {
                                        AnonymousClass3.this.f17977a.onFail(cwlVar.a(), cwlVar.b());
                                    }
                                }
                            });
                        }
                    }
                });
            } catch (Exception e) {
                LoginTLogAdapter.trace(OppoKeyChain.TAG, "update error,", e);
                CommonDataCallback commonDataCallback = this.f17977a;
                commonDataCallback.onFail(-3753, "call_update_error_" + e.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("code", "-3753");
                hashMap.put("msg", e.getMessage());
                UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_failure_update_error", hashMap);
            }
        }
    }

    public static /* synthetic */ Context access$000(OppoKeyChain oppoKeyChain) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c6b46f75", new Object[]{oppoKeyChain}) : oppoKeyChain.context;
    }

    public OppoKeyChain(Context context) {
        this.context = context.getApplicationContext();
    }

    public void init() {
        if (!isSupport() || this.initialized) {
            return;
        }
        try {
            Field declaredField = cwh.class.getDeclaredField("KEEP_ALIVE_TIME");
            declaredField.setAccessible(true);
            declaredField.set(null, 15);
        } catch (Exception e) {
            LoginTLogAdapter.trace(TAG, "init error", e);
        }
        try {
            cwk.a(this.context);
            this.initialized = true;
        } catch (Exception e2) {
            LoginTLogAdapter.trace(TAG, "init error", e2);
            HashMap hashMap = new HashMap();
            hashMap.put("code", "-3757");
            hashMap.put("msg", e2.getMessage());
            UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_failure_init_error", hashMap);
        }
    }

    public void query(String str, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7d546c", new Object[]{this, str, commonDataCallback});
        } else if (!isSupport() || !this.initialized) {
            commonDataCallback.onFail(SDK_REMOTE_ERROR, "query is not enabled or initialized:isSupport()=" + isSupport() + ",initialized=" + this.initialized);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("key", str);
            if (!StringUtils.isEmpty(LoginStatus.savedOppo)) {
                MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("data", LoginStatus.savedOppo);
                        commonDataCallback.onSuccess(hashMap2);
                    }
                });
            } else {
                BackgroundExecutor.execute(new AnonymousClass2(hashMap, commonDataCallback));
            }
        }
    }

    public void update(String str, String str2, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4575741", new Object[]{this, str, str2, commonDataCallback});
        } else if (!isSupport() || !this.initialized) {
            commonDataCallback.onFail(SDK_REMOTE_ERROR, "update is not enabled or initialized:isSupport()=" + isSupport() + ",initialized=" + this.initialized);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("key", str);
            hashMap.put("data", str2);
            if (LoginStatus.forceMockStrategy == 100) {
                LoginStatus.savedOppo = str2;
            } else {
                BackgroundExecutor.execute(new AnonymousClass3(hashMap, commonDataCallback));
            }
        }
    }

    public void clear(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa9b6d1", new Object[]{this, commonDataCallback});
        } else if (!isSupport() || !this.initialized) {
            commonDataCallback.onFail(SDK_REMOTE_ERROR, "clear is not enabled or initialized:isSupport()=" + isSupport() + ",initialized=" + this.initialized);
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        cwk.a(OppoKeyChain.access$000(OppoKeyChain.this), new OnResultListener() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.heytap.mspsdk.keychain.impl.OnResultListener
                            public void onResult(cwl cwlVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("df7d775b", new Object[]{this, cwlVar});
                                } else if (cwlVar.a() == 0) {
                                    commonDataCallback.onSuccess(cwlVar.c());
                                } else {
                                    commonDataCallback.onFail(cwlVar.a(), cwlVar.b());
                                }
                            }
                        });
                    } catch (Exception e) {
                        LoginTLogAdapter.trace(OppoKeyChain.TAG, "clear error,", e);
                        CommonDataCallback commonDataCallback2 = commonDataCallback;
                        commonDataCallback2.onFail(-3752, "call_clear_error_" + e.getMessage());
                        HashMap hashMap = new HashMap();
                        hashMap.put("code", "-3752");
                        hashMap.put("msg", e.getMessage());
                        UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_failure_clear_error", hashMap);
                    }
                }
            });
        }
    }

    public boolean isSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[]{this})).booleanValue();
        }
        try {
            return cwk.b(this.context);
        } catch (Exception e) {
            LoginTLogAdapter.trace(TAG, "isSupport error,", e);
            HashMap hashMap = new HashMap();
            hashMap.put("code", "-3742");
            hashMap.put("msg", e.getMessage());
            UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_is_support_error", hashMap);
            return false;
        }
    }
}
