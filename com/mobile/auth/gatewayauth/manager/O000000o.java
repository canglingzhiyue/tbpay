package com.mobile.auth.gatewayauth.manager;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.mobile.auth.O0OOO0;
import com.mobile.auth.OO0oO;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import tb.czp;

/* loaded from: classes4.dex */
public abstract class O000000o {
    protected volatile String O000000o;
    protected volatile String O00000Oo;
    protected Context O00000o;
    protected volatile long O00000o0 = 5000;
    protected O00000o O00000oO;
    protected String O00000oo;
    protected String O0000O0o;
    protected OO0oO O0000OOo;

    /* renamed from: com.mobile.auth.gatewayauth.manager.O000000o$O000000o  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0294O000000o {
        private String O000000o;
        private String O00000Oo;
        private String O00000o;
        private long O00000o0;
        private String O00000oO;

        /* renamed from: com.mobile.auth.gatewayauth.manager.O000000o$O000000o$O000000o  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0295O000000o {
            private String O000000o;
            private String O00000Oo;
            private String O00000o;
            private long O00000o0;
            private String O00000oO;

            private C0295O000000o() {
            }

            static /* synthetic */ String O000000o(C0295O000000o c0295O000000o) {
                try {
                    return c0295O000000o.O000000o;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            static /* synthetic */ String O00000Oo(C0295O000000o c0295O000000o) {
                try {
                    return c0295O000000o.O00000Oo;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            static /* synthetic */ String O00000o(C0295O000000o c0295O000000o) {
                try {
                    return c0295O000000o.O00000o;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            static /* synthetic */ long O00000o0(C0295O000000o c0295O000000o) {
                try {
                    return c0295O000000o.O00000o0;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return -1L;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return -1L;
                    }
                }
            }

            static /* synthetic */ String O00000oO(C0295O000000o c0295O000000o) {
                try {
                    return c0295O000000o.O00000oO;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public C0295O000000o O000000o(long j) {
                try {
                    this.O00000o0 = j;
                    return this;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public C0295O000000o O000000o(String str) {
                try {
                    this.O000000o = str;
                    return this;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public C0294O000000o O000000o() {
                try {
                    return new C0294O000000o(this);
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public C0295O000000o O00000Oo(String str) {
                try {
                    this.O00000Oo = str;
                    return this;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public C0295O000000o O00000o(String str) {
                try {
                    this.O00000oO = str;
                    return this;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public C0295O000000o O00000o0(String str) {
                try {
                    this.O00000o = str;
                    return this;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }
        }

        private C0294O000000o(C0295O000000o c0295O000000o) {
            this.O000000o = C0295O000000o.O000000o(c0295O000000o);
            this.O00000Oo = C0295O000000o.O00000Oo(c0295O000000o);
            this.O00000o0 = C0295O000000o.O00000o0(c0295O000000o);
            this.O00000o = C0295O000000o.O00000o(c0295O000000o);
            this.O00000oO = C0295O000000o.O00000oO(c0295O000000o);
        }

        public static C0295O000000o O000000o() {
            try {
                return new C0295O000000o();
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public String O00000Oo() {
            try {
                return this.O000000o;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public long O00000o() {
            try {
                return this.O00000o0;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return -1L;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return -1L;
                }
            }
        }

        public String O00000o0() {
            try {
                return this.O00000Oo;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public String O00000oO() {
            try {
                return this.O00000o;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public String O00000oo() {
            try {
                return this.O00000oO;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class O00000Oo {
        String O000000o;
        String O00000Oo;

        /* renamed from: com.mobile.auth.gatewayauth.manager.O000000o$O00000Oo$O000000o  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0296O000000o {
            private String O000000o;
            private String O00000Oo;

            private C0296O000000o() {
            }

            static /* synthetic */ String O000000o(C0296O000000o c0296O000000o) {
                try {
                    return c0296O000000o.O000000o;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            static /* synthetic */ String O00000Oo(C0296O000000o c0296O000000o) {
                try {
                    return c0296O000000o.O00000Oo;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public C0296O000000o O000000o(String str) {
                try {
                    this.O000000o = str;
                    return this;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public O00000Oo O000000o() {
                try {
                    return new O00000Oo(this);
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }

            public C0296O000000o O00000Oo(String str) {
                try {
                    this.O00000Oo = str;
                    return this;
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                        return null;
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                        return null;
                    }
                }
            }
        }

        private O00000Oo(C0296O000000o c0296O000000o) {
            this.O000000o = C0296O000000o.O000000o(c0296O000000o);
            this.O00000Oo = C0296O000000o.O00000Oo(c0296O000000o);
        }

        public static C0296O000000o O000000o() {
            try {
                return new C0296O000000o();
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public String O00000Oo() {
            try {
                return this.O000000o;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public String O00000o0() {
            try {
                return this.O00000Oo;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }
    }

    public O000000o(Context context, O00000o o00000o, String str, String str2) {
        this.O00000o = context;
        this.O00000oO = o00000o;
        this.O00000oo = str;
        this.O0000O0o = str2;
        this.O0000OOo = o00000o.O000000o();
    }

    static /* synthetic */ void O000000o(O000000o o000000o, String str, String str2, String str3) {
        try {
            o000000o.O000000o(str, str2, str3);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O000000o(String str, String str2, String str3) {
        try {
            O0OOO0.O000000o(str, str2, str3, this.O00000o, this.O0000O0o, this.O00000oo);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public String O000000o() {
        try {
            return this.O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O000000o(long j) {
        try {
            if (j >= 5000) {
                this.O00000o0 = j;
            } else {
                this.O00000o0 = 5000L;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public final synchronized void O000000o(final RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, final O00000Oo o00000Oo) {
        try {
            if (!StringUtils.isEmpty(this.O000000o) && !StringUtils.isEmpty(this.O00000Oo)) {
                O00000o(new RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.manager.O000000o.1
                    public void O000000o(C0294O000000o c0294O000000o) {
                        try {
                            requestCallback.onSuccess(c0294O000000o);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            requestCallback.onError(o00000Oo2);
                            O000000o.O000000o(O000000o.this, o00000Oo2.O00000Oo(), o00000Oo.O000000o, o00000Oo.O00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O000000o(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(C0294O000000o c0294O000000o) {
                        try {
                            O000000o(c0294O000000o);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, o00000Oo);
                return;
            }
            requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O000000o(RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            O000000o(str, str2, str3, false, str4, monitorStruct);
            requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o().O00000o(com.mobile.auth.gatewayauth.utils.O000000o.O000000o(str, str2)).O000000o(O00000Oo(str, str5)).O00000Oo(str2).O00000o0(str3).O000000o());
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(String str, String str2) {
        try {
            this.O000000o = str;
            this.O00000Oo = str2;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O000000o(String str, String str2, String str3, boolean z, String str4, final MonitorStruct monitorStruct) {
        if (monitorStruct != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                monitorStruct.setCarrierSdkCode(str);
                monitorStruct.setSuccess(z);
                monitorStruct.setEndTime(currentTimeMillis);
                if (!z) {
                    monitorStruct.setCarrierSdkMsg(str2);
                    monitorStruct.setFailRet(com.mobile.auth.gatewayauth.utils.O000000o.O000000o(str, str2));
                    monitorStruct.setCarrierFailedResultData(str3);
                }
                monitorStruct.setUrgency(1);
                monitorStruct.setVendorKey(str4);
                if (monitorStruct.getAction().indexOf("logintoken") >= 0 || monitorStruct.getAction().indexOf("getoken") >= 0 || monitorStruct.getAction().indexOf("logincode") >= 0) {
                    com.mobile.auth.gatewayauth.utils.O00000Oo.O0000O0o(this.O00000o);
                }
                czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.O000000o.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            monitorStruct.setPrivateIp(com.mobile.auth.gatewayauth.utils.O00000Oo.O0000OOo(O000000o.this.O00000o));
                            O000000o.this.O0000OOo.O000000o(O000000o.this.O00000oO.O000000o(monitorStruct), monitorStruct.getUrgency());
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public abstract void O000000o(boolean z);

    public String O00000Oo() {
        try {
            return this.O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    protected abstract String O00000Oo(String str, String str2);

    public final synchronized void O00000Oo(final RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, final O00000Oo o00000Oo) {
        try {
            if (!StringUtils.isEmpty(this.O000000o) && !StringUtils.isEmpty(this.O00000Oo)) {
                O00000oO(new RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.manager.O000000o.2
                    public void O000000o(C0294O000000o c0294O000000o) {
                        try {
                            requestCallback.onSuccess(c0294O000000o);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            requestCallback.onError(o00000Oo2);
                            O000000o.O000000o(O000000o.this, o00000Oo2.O00000Oo(), o00000Oo.O000000o, o00000Oo.O00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O000000o(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(C0294O000000o c0294O000000o) {
                        try {
                            O000000o(c0294O000000o);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, o00000Oo);
                return;
            }
            requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    public abstract void O00000o(RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, O00000Oo o00000Oo);

    public abstract void O00000o0();

    public final synchronized void O00000o0(final RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, final O00000Oo o00000Oo) {
        try {
            if (!StringUtils.isEmpty(this.O000000o) && !StringUtils.isEmpty(this.O00000Oo)) {
                O00000oo(new RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.manager.O000000o.3
                    public void O000000o(C0294O000000o c0294O000000o) {
                        try {
                            requestCallback.onSuccess(c0294O000000o);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            requestCallback.onError(o00000Oo2);
                            O000000o.O000000o(O000000o.this, o00000Oo2.O00000Oo(), o00000Oo.O000000o, o00000Oo.O00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O000000o(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(C0294O000000o c0294O000000o) {
                        try {
                            O000000o(c0294O000000o);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, o00000Oo);
                return;
            }
            requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    public abstract void O00000oO(RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, O00000Oo o00000Oo);

    public abstract void O00000oo(RequestCallback<C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, O00000Oo o00000Oo);
}
