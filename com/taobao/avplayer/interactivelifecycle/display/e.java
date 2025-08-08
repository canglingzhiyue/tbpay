package com.taobao.avplayer.interactivelifecycle.display;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.common.q;
import com.taobao.avplayer.common.w;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kbs;
import tb.kbt;
import tb.kge;

/* loaded from: classes6.dex */
public class e implements q, w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DWContext f16517a;
    private d b;
    private kbt c;
    private kbs d;
    private boolean e;
    private boolean f;
    private DWLifecycleType g = DWLifecycleType.BEFORE;

    static {
        kge.a(-1023798256);
        kge.a(1342737764);
        kge.a(556437024);
    }

    @Override // com.taobao.avplayer.common.w
    public void onError(DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
        }
    }

    public static /* synthetic */ boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c34e1e24", new Object[]{eVar})).booleanValue() : eVar.f;
    }

    public static /* synthetic */ kbt b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kbt) ipChange.ipc$dispatch("fa4539e8", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ DWContext c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("10fdd77d", new Object[]{eVar}) : eVar.f16517a;
    }

    public static /* synthetic */ kbs d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kbs) ipChange.ipc$dispatch("f7074187", new Object[]{eVar}) : eVar.d;
    }

    public e(DWContext dWContext, d dVar) {
        this.f16517a = dWContext;
        this.b = dVar;
        this.c = new kbt(this.f16517a, this.b);
        this.d = new kbs(this.f16517a, this.b);
        this.f16517a.getVideo().b(this.c);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f16517a.mInteractiveId == -1 || this.e) {
        } else {
            this.e = true;
            d();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.g != DWLifecycleType.MID) {
        } else {
            if (z && !this.e) {
                c();
            }
            kbt kbtVar = this.c;
            if (kbtVar != null) {
                kbtVar.a(z);
            }
            kbs kbsVar = this.d;
            if (kbsVar == null) {
                return;
            }
            kbsVar.a(z);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f16517a.queryInteractiveData(this, false);
        }
    }

    private void a(final DWInteractiveVideoObject dWInteractiveVideoObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79529c5f", new Object[]{this, dWInteractiveVideoObject});
        } else if (dWInteractiveVideoObject == null) {
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.avplayer.interactivelifecycle.display.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this)) {
                    } else {
                        if (e.b(e.this) != null) {
                            e.b(e.this).a(dWInteractiveVideoObject);
                            e.b(e.this).b();
                        }
                        if (e.c(e.this) == null || e.c(e.this).getVideo() == null || e.d(e.this) == null) {
                            return;
                        }
                        e.c(e.this).getVideo().b(e.d(e.this));
                        e.d(e.this).a(dWInteractiveVideoObject);
                        e.d(e.this).b();
                    }
                }
            });
        }
    }

    @Override // com.taobao.avplayer.common.w
    public void onSuccess(DWResponse dWResponse) {
        DWInteractiveVideoObject dWInteractiveVideoObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            return;
        }
        JSONObject jSONObject = null;
        try {
            dWInteractiveVideoObject = com.taobao.avplayer.core.protocol.c.a(dWResponse);
        } catch (JSONException e) {
            e.printStackTrace();
            dWInteractiveVideoObject = null;
        }
        try {
            if (dWResponse.data.has("taokeRelation")) {
                jSONObject = dWResponse.data.getJSONObject("taokeRelation");
            }
            if (jSONObject != null) {
                HashMap hashMap = new HashMap();
                String optString = jSONObject.optString("sourceId");
                if (!StringUtils.isEmpty(optString)) {
                    hashMap.put("taoke_sourceId", optString);
                }
                String string = jSONObject.getString("bizType");
                if (!StringUtils.isEmpty(string)) {
                    hashMap.put("taoke_bizType", string);
                }
                hashMap.put("taoke_accountId", Long.toString(this.f16517a.mUserId));
                if (!StringUtils.isEmpty(this.f16517a.mContentId)) {
                    hashMap.put("taoke_contentId", this.f16517a.mContentId);
                }
                this.f16517a.addUtParams(hashMap);
            }
        } catch (JSONException unused) {
        }
        a(dWInteractiveVideoObject);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = true;
        kbt kbtVar = this.c;
        if (kbtVar != null) {
            kbtVar.c();
            this.c = null;
        }
        kbs kbsVar = this.d;
        if (kbsVar == null) {
            return;
        }
        kbsVar.c();
        this.d = null;
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.g = dWLifecycleType;
        a(this.f16517a.isShowInteractive());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kbt kbtVar = this.c;
        if (kbtVar == null) {
            return;
        }
        kbtVar.d();
    }
}
