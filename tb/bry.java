package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.pipline.c;
import com.etao.feimagesearch.util.am;
import com.etao.feimagesearch.util.o;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class bry extends ctb<eeb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile boolean c;
    private Handler d = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("component", "plt_browsed_tab_api");
            linkedHashMap.put("sversion", com.h());
            bry.a(bry.this, false);
            final am a2 = o.a("37747", b.I(), b.J(), (String) null, linkedHashMap);
            if (!a2.a()) {
                bry.a(bry.this).post(new Runnable() { // from class: tb.bry.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            bry.b(bry.this).a((JSONObject) null);
                        }
                    }
                });
            } else if (a2.d() == null) {
                bry.a(bry.this).post(new Runnable() { // from class: tb.bry.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            bry.b(bry.this).a((JSONObject) null);
                        }
                    }
                });
            } else {
                JSONObject b = com.taobao.android.searchbaseframe.util.a.b(a2.d(), "data");
                if (b == null) {
                    bry.a(bry.this).post(new Runnable() { // from class: tb.bry.a.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bry.b(bry.this).a((JSONObject) null);
                            }
                        }
                    });
                    return;
                }
                JSONArray a3 = com.taobao.android.searchbaseframe.util.a.a(b, "browsedRecordResult");
                if (a3 == null || a3.isEmpty()) {
                    bry.a(bry.this).post(new Runnable() { // from class: tb.bry.a.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bry.b(bry.this).a((JSONObject) null);
                            }
                        }
                    });
                    return;
                }
                long a4 = com.taobao.android.searchbaseframe.util.a.a(a3.getJSONObject(0), "timestamp", -1L);
                if (a4 > 0) {
                    com.etao.feimagesearch.util.b.INSTANCE.a(a4 * 1000);
                }
                bry.a(bry.this).post(new Runnable() { // from class: tb.bry.a.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            bry.b(bry.this).a(a2.d());
                        }
                    }
                });
            }
        }
    }

    static {
        kge.a(-2017292733);
    }

    public static /* synthetic */ Object ipc$super(bry bryVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    public bry() {
        d();
    }

    public static final /* synthetic */ Handler a(bry bryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e0986a57", new Object[]{bryVar}) : bryVar.d;
    }

    public static final /* synthetic */ void a(bry bryVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677ce0a5", new Object[]{bryVar, new Boolean(z)});
        } else {
            bryVar.c = z;
        }
    }

    public static final /* synthetic */ eeb b(bry bryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eeb) ipChange.ipc$dispatch("fe066a74", new Object[]{bryVar}) : (eeb) bryVar.f26504a;
    }

    @Override // tb.ctb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        d();
    }

    @Override // tb.ctb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        this.d.removeCallbacksAndMessages(null);
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c) {
        } else {
            this.c = true;
            c.a(new a());
        }
    }
}
